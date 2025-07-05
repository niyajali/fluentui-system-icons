/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tasks

import FluentIconsConfig
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import services.GitRepositoryFactory
import utils.FileUtils
import utils.IconScanner
import java.io.File

abstract class CheckNewIconsTask : DefaultTask() {

    @get:Input
    abstract val config: Property<FluentIconsConfig>

    @TaskAction
    fun checkNewIcons() {
        val fluentConfig = config.get()
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)

        println("🔍 FluentUI Icons Check")
        println("📂 Target: ${targetDir.absolutePath}")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.absolutePath}")
        }

        // Use repository service with automatic cleanup
        GitRepositoryFactory.createRepository(
            fluentConfig.useLocalDirectory,
            fluentConfig.localDirectoryPath,
            fluentConfig.gitRepository,
            fluentConfig.gitRef,
        ).use { gitRepo ->

            println("📍 Source: ${gitRepo.getRepositoryInfo()}")

            val sourceDir = gitRepo.getAssetsDirectory(fluentConfig.assetsPath)

            val scanner = IconScanner()
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)
            val families = scanner.buildIconFamiliesForSync(sourceIcons, existingIcons, fluentConfig)

            var totalVariants = 0

            println("\n📊 Results:")
            println("Found ${families.size} new icon families that would be synced:")
            families.forEach { family ->
                println("  📁 ${family.baseName}:")
                family.variants.forEach { (style, variant) ->
                    println("    - ${style}: ${variant.size}px → ${style}/${FileUtils.toPascalCase(family.baseName)}.kt")
                    totalVariants++
                }
            }
            println("\nTotal variants to sync: $totalVariants")

            if (totalVariants == 0) {
                println("✅ All FluentUI icons are up to date!")
            }
        }
    }
}
