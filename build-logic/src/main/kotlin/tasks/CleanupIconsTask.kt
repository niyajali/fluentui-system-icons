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

        println("🧹 FluentUI Icons Cleanup")
        println("📂 Target: ${targetDir.absolutePath}")
        println("🎯 Purpose: Fix naming inconsistencies and rebuild icon lists")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.absolutePath}")
        }

        val listUpdater = IconListUpdater()
        var totalCleaned = 0

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
                
                // Find and report duplicates
                val duplicateGroups = normalizedGroups.filter { it.value.size > 1 }
                if (duplicateGroups.isNotEmpty()) {
                    println("  ⚠️  Found ${duplicateGroups.size} duplicate icon families:")
                    duplicateGroups.forEach { (normalizedName, files) ->
                        println("    📁 $normalizedName:")
                        files.forEach { file ->
                            println("      - ${file.name}")
                        }
                        
                        // Keep the lexicographically last file (usually the most recent)
                        val filesToDelete = files.sortedBy { it.name }.dropLast(1)
                        val fileToKeep = files.maxByOrNull { it.name }
                        
                        filesToDelete.forEach { file ->
                            if (file.delete()) {
                                println("      🗑️  Deleted duplicate: ${file.name}")
                                totalCleaned++
                            }
                        }
                        
                        if (fileToKeep != null) {
                            println("      ✅ Kept: ${fileToKeep.name}")
                        }
                    }
                }
                
                // Rebuild the icon list file for consistency
                println("  🔄 Rebuilding ${style}IconList.kt...")
                listUpdater.rebuildIconListFile(targetDir, style)
                
                // Final count
                val remainingFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.size ?: 0
                
                println("  📊 Result: $remainingFiles icons in ${style.lowercase()}/")
                
            } else {
                println("  ⚠️  Style directory not found: ${styleDir.absolutePath}")
            }
        }

        println("\n" + "=".repeat(50))
        println("🧹 CLEANUP SUMMARY")
        println("=".repeat(50))
        println("🗑️  Duplicate files removed: $totalCleaned")
        println("🔄 Icon lists rebuilt: ${fluentConfig.supportedStyles.size}")
        println("✅ Cleanup completed successfully")
        println("=".repeat(50))
    }
}
