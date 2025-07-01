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

import IconSyncConfig
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import utils.IconScanner
import java.io.File

abstract class AnalyzeIconCoverageTask : DefaultTask() {
    
    @get:Input
    abstract val config: Property<IconSyncConfig>
    
    @TaskAction
    fun analyzeIconCoverage() {
        val iconConfig = config.get()
        val sourceDir = File(iconConfig.sourceRepositoryPath)
        val targetDir = File(project.projectDir, iconConfig.targetIconsPath)
        
        if (!sourceDir.exists()) {
            throw IllegalArgumentException("Source repository path does not exist: ${iconConfig.sourceRepositoryPath}")
        }
        
        val scanner = IconScanner()
        val existingIcons = scanner.getExistingIconVariants(targetDir, iconConfig.supportedStyles)
        val sourceIcons = scanner.scanSourceIcons(sourceDir, iconConfig.supportedStyles)
        
        println("📊 Icon Coverage Analysis")
        println("================================================================================")
        
        val existingFamilies = existingIcons.map { it.substringBeforeLast("_") }.toSet()
        val sourceFamilies = sourceIcons.keys
        
        println("📁 Total families in source: ${sourceFamilies.size}")
        println("📁 Total families in target: ${existingFamilies.size}")
        println("📁 Missing families: ${sourceFamilies.size - existingFamilies.size}")
        
        // Style coverage analysis
        println("\n🎨 Style Coverage:")
        iconConfig.supportedStyles.forEach { style ->
            val existingWithStyle = existingIcons.count { it.endsWith("_$style") }
            val sourceWithStyle = sourceIcons.values.sumOf { variants ->
                variants.count { it.style == style }
            }
            println("  $style: $existingWithStyle/$sourceWithStyle available")
        }
        
        // Size distribution
        println("\n📏 Size Distribution in Source:")
        val sizeDistribution = sourceIcons.values.flatten()
            .groupBy { it.size }
            .mapValues { it.value.size }
            .toSortedMap()
        
        sizeDistribution.forEach { (size, count) ->
            println("  ${size}px: $count variants")
        }
        
        // Directory structure analysis
        println("\n📂 Directory Structure:")
        iconConfig.supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            val iconCount = if (styleDir.exists()) {
                styleDir.listFiles { file: File -> file.extension == "kt" && !file.name.endsWith("IconList.kt") }?.size ?: 0
            } else {
                0
            }
            println("  ${style.lowercase()}/: $iconCount icons")
        }
    }
}
