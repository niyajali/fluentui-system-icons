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
import utils.IconListUpdater
import utils.fromPascalCaseToNormalized
import java.io.File

abstract class CleanupIconsTask : DefaultTask() {

    @get:Input
    abstract val config: Property<FluentIconsConfig>

    @TaskAction
    fun cleanupIcons() {
        val fluentConfig = config.get()
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)

        println("🧹 Analyzing Icon Consistency")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.relativeTo(project.projectDir)}")
        }

        val listUpdater = IconListUpdater()
        var duplicatesFound = 0
        var listsRebuilt = 0

        fluentConfig.supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())

            if (styleDir.exists()) {
                val iconFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.toList() ?: emptyList()

                if (iconFiles.isEmpty()) return@forEach

                // Check for potential duplicates
                val normalizedGroups = iconFiles.groupBy { file ->
                    file.nameWithoutExtension.fromPascalCaseToNormalized()
                }

                val duplicateGroups = normalizedGroups.filter { it.value.size > 1 }
                if (duplicateGroups.isNotEmpty()) {
                    duplicatesFound += duplicateGroups.size
                    println("⚠️  ${style}: Found ${duplicateGroups.size} potential duplicate groups")
                    duplicateGroups.forEach { (normalizedName, files) ->
                        println("   📁 $normalizedName: ${files.map { it.name }}")
                    }
                }

                // Rebuild icon list for consistency
                listUpdater.rebuildIconListFile(targetDir, style)
                listsRebuilt++
            }
        }

        // Summary
        println("\n📊 Analysis Results:")
        if (duplicatesFound > 0) {
            println("   Potential duplicates: $duplicatesFound groups (manual review recommended)")
        } else {
            println("   No duplicates detected")
        }
        println("   Icon lists rebuilt: $listsRebuilt")
    }
}
