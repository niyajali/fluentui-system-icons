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

        println("🧹 FluentUI Icons Analysis & Safe Cleanup")
        println("📂 Target: ${targetDir.absolutePath}")
        println("🛡️  Mode: Analysis only - manual review required for deletions")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.absolutePath}")
        }

        val listUpdater = IconListUpdater()
        var duplicatesFound = 0
        var inconsistenciesFound = 0

        fluentConfig.supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            
            if (styleDir.exists()) {
                println("\n🔍 Analyzing ${style.lowercase()}/ directory...")
                
                val iconFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.toList() ?: emptyList()
                
                if (iconFiles.isEmpty()) {
                    println("  ℹ️  No icon files found")
                    return@forEach
                }
                
                // Group files by their normalized names to detect duplicates
                val normalizedGroups = iconFiles.groupBy { file ->
                    file.nameWithoutExtension.fromPascalCaseToNormalized()
                }
                
                // Find and report duplicates (but don't delete them)
                val duplicateGroups = normalizedGroups.filter { it.value.size > 1 }
                if (duplicateGroups.isNotEmpty()) {
                    duplicatesFound += duplicateGroups.size
                    println("  ⚠️  Found ${duplicateGroups.size} potential duplicate icon families:")
                    duplicateGroups.forEach { (normalizedName, files) ->
                        println("    📁 $normalizedName (${files.size} files):")
                        files.forEach { file ->
                            println("      - ${file.name}")
                        }
                        println("    💡 Suggestion: Keep the most appropriate version and manually remove others")
                        println("    💡 Check if any projects depend on these specific names before deleting")
                    }
                    inconsistenciesFound++
                }
                
                // Check icon list consistency (and optionally rebuild)
                val iconListFile = File(targetDir, "${style.replaceFirstChar { it.uppercase() }}IconList.kt")
                if (iconListFile.exists()) {
                    val listContent = iconListFile.readText()
                    val actualFiles = iconFiles.map { it.nameWithoutExtension }.sorted()
                    
                    // Check if list matches actual files
                    val missingFromList = actualFiles.filter { fileName ->
                        !listContent.contains("FluentIcons.${style.replaceFirstChar { it.uppercase() }}.$fileName")
                    }
                    
                    if (missingFromList.isNotEmpty()) {
                        println("  📝 Icon list inconsistencies detected:")
                        missingFromList.forEach { fileName ->
                            println("    ❌ Missing from list: $fileName")
                        }
                        
                        // Offer to rebuild the list
                        println("  🔄 Rebuilding ${style}IconList.kt to match actual files...")
                        listUpdater.rebuildIconListFile(targetDir, style)
                        inconsistenciesFound++
                    } else {
                        println("  ✅ Icon list is consistent with actual files")
                    }
                } else {
                    println("  🆕 Creating missing ${style}IconList.kt...")
                    listUpdater.rebuildIconListFile(targetDir, style)
                }
                
                // Final count
                val remainingFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.size ?: 0
                
                println("  📊 Result: $remainingFiles icons in ${style.lowercase()}/")
                
            } else {
                println("  ⚠️  Style directory not found: ${styleDir.absolutePath}")
            }
        }

        println("\n" + "=".repeat(60))
        println("🧹 CLEANUP ANALYSIS SUMMARY")
        println("=".repeat(60))
        
        if (duplicatesFound > 0) {
            println("⚠️  Potential duplicates found: $duplicatesFound groups")
            println("💡 Manual review recommended before deletion")
            println("💡 Check project dependencies before removing any files")
        } else {
            println("✅ No duplicate icon groups detected")
        }
        
        if (inconsistenciesFound > 0) {
            println("🔄 Icon lists updated: $inconsistenciesFound")
            println("✅ Lists now match actual files")
        } else {
            println("✅ All icon lists were already consistent")
        }
        
        println("\n🛡️  Note: This task only analyzes and fixes lists.")
        println("🛡️  File deletions require manual review to avoid breaking changes.")
        println("=".repeat(60))
    }
}
