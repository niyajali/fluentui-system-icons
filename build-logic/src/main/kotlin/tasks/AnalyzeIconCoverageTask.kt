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
import utils.IconScanner
import java.io.File

abstract class AnalyzeIconCoverageTask : DefaultTask() {
    
    @get:Input
    abstract val config: Property<FluentIconsConfig>
    
    @TaskAction
    fun analyzeIconCoverage() {
        val fluentConfig = config.get()
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)
        
        println("📊 FluentUI Icons Coverage Analysis")
        println("📂 Target: ${targetDir.absolutePath}")
        
        // Use repository service with automatic cleanup
        GitRepositoryFactory.createRepository(
            fluentConfig.useLocalDirectory,
            fluentConfig.localDirectoryPath,
            fluentConfig.gitRepository,
            fluentConfig.gitRef
        ).use { gitRepo ->
            
            println("📍 Source: ${gitRepo.getRepositoryInfo()}")
            
            val sourceDir = gitRepo.getAssetsDirectory(fluentConfig.assetsPath)
            
            val scanner = IconScanner()
            
            // Get existing and source icons
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)
            
            // Calculate coverage statistics
            val totalSourceFamilies = sourceIcons.size
            val totalSourceVariants = sourceIcons.values.sumOf { it.size }
            val existingVariantsCount = existingIcons.size
            
            // Style breakdown
            val styleStats = mutableMapOf<String, Pair<Int, Int>>()
            
            fluentConfig.supportedStyles.forEach { style ->
                val sourceVariantsForStyle = sourceIcons.values.flatten().count { it.style == style }
                val existingVariantsForStyle = existingIcons.count { it.key.endsWith("_$style") }
                styleStats[style] = Pair(sourceVariantsForStyle, existingVariantsForStyle)
            }
            
            // Coverage analysis
            val coveragePercentage = if (totalSourceVariants > 0) {
                (existingVariantsCount.toDouble() / totalSourceVariants * 100)
            } else 0.0
            
            println("\n" + "=".repeat(60))
            println("📊 FLUENT ICONS COVERAGE ANALYSIS")
            println("=".repeat(60))
            println("🏠 Total families in source: $totalSourceFamilies")
            println("🎨 Total variants in source: $totalSourceVariants") 
            println("✅ Existing variants in target: $existingVariantsCount")
            println("📈 Coverage: ${"%.1f".format(coveragePercentage)}%")
            
            println("\n🎨 Style Breakdown:")
            styleStats.forEach { (style, counts) ->
                val (sourceCount, existingCount) = counts
                val stylePercentage = if (sourceCount > 0) {
                    (existingCount.toDouble() / sourceCount * 100)
                } else 0.0
                println("   📁 ${style.lowercase()}: $existingCount/$sourceCount (${"%.1f".format(stylePercentage)}%)")
            }
            
            println("\n📂 Directory Structure:")
            fluentConfig.supportedStyles.forEach { style ->
                val styleDir = File(targetDir, style.lowercase())
                if (styleDir.exists()) {
                    val iconCount = styleDir.listFiles { file -> 
                        file.extension == "kt" && !file.name.endsWith("IconList.kt") 
                    }?.size ?: 0
                    println("   📁 ${style.lowercase()}/: $iconCount icons")
                } else {
                    println("   📁 ${style.lowercase()}/: (not found)")
                }
            }
            println("=".repeat(60))
        }
    }
}
