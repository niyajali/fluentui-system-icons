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
import java.io.File

abstract class UpdateIconListsTask : DefaultTask() {

    @get:Input
    abstract val config: Property<FluentIconsConfig>

    @TaskAction
    fun updateIconLists() {
        val fluentConfig = config.get()
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)

        println("📝 Updating FluentUI Icon Lists")
        println("📂 Target: ${targetDir.absolutePath}")
        println("🎯 Strategy: Read actual files and extract ImageVector names")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.absolutePath}")
        }

        var totalIconsProcessed = 0
        var listsCreated = 0
        var listsUpdated = 0

        fluentConfig.supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            
            if (styleDir.exists()) {
                println("\n🔍 Processing ${style.lowercase()}/ directory...")
                
                // Get all icon files (excluding IconList files)
                val iconFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.sortedBy { it.nameWithoutExtension } ?: emptyList()
                
                if (iconFiles.isEmpty()) {
                    println("  ℹ️  No icon files found - removing IconList if exists")
                    removeIconListFile(targetDir, style)
                    return
                }

                // Extract ImageVector names from actual files
                val iconEntries = iconFiles.mapNotNull { file ->
                    extractImageVectorName(file, style)
                }.sorted()

                if (iconEntries.isNotEmpty()) {
                    val iconListFile = createOrUpdateIconListFile(targetDir, style, iconEntries)
                    
                    if (iconListFile.first) {
                        listsCreated++
                        println("  🆕 Created ${style}IconList.kt with ${iconEntries.size} icons")
                    } else {
                        listsUpdated++
                        println("  🔄 Updated ${style}IconList.kt with ${iconEntries.size} icons")
                    }
                    
                    totalIconsProcessed += iconEntries.size
                } else {
                    println("  ⚠️  No valid ImageVector names found in ${iconFiles.size} files")
                }
                
            } else {
                println("  ⚠️  Style directory not found: ${style.lowercase()}/")
            }
        }

        println("\n" + "=".repeat(60))
        println("📝 ICON LISTS UPDATE SUMMARY")
        println("=".repeat(60))
        println("📊 Total icons processed: $totalIconsProcessed")
        println("🆕 Icon lists created: $listsCreated")
        println("🔄 Icon lists updated: $listsUpdated")
        println("✅ Update completed successfully")
        println("=".repeat(60))
    }

    /**
     * Extracts the ImageVector property name from a Kotlin icon file
     * Returns the property name if found, null if not a valid icon file
     */
    private fun extractImageVectorName(file: File, style: String): String? {
        try {
            val content = file.readText()
            val styleCapitalized = style.replaceFirstChar { it.uppercase() }
            
            // Look for pattern: public val FluentIcons.StyleName.IconName: ImageVector
            val pattern = Regex(
                """public\s+val\s+FluentIcons\.$styleCapitalized\.([A-Za-z][A-Za-z0-9]*)\s*:\s*ImageVector""",
                RegexOption.MULTILINE
            )
            
            val match = pattern.find(content)
            return match?.groupValues?.get(1)?.also { iconName ->
                println("    ✅ Found: FluentIcons.$styleCapitalized.$iconName in ${file.name}")
            }
        } catch (e: Exception) {
            println("    ❌ Failed to read ${file.name}: ${e.message}")
            return null
        }
    }

    /**
     * Creates or updates an IconList file with the provided icon entries
     * Returns Pair(wasCreated: Boolean, file: File)
     */
    private fun createOrUpdateIconListFile(
        targetDir: File, 
        style: String, 
        iconNames: List<String>
    ): Pair<Boolean, File> {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val styleLowercase = style.lowercase()
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")
        
        val wasCreated = !iconListFile.exists()
        
        val variableName = when (styleLowercase) {
            "filled" -> "filledIcons"
            "regular" -> "regularIcons"
            "light" -> "lightIcons"
            "color" -> "colorIcons"
            else -> "${styleLowercase}Icons"
        }
        
        // Build imports
        val imports = iconNames.joinToString("\n") { iconName ->
            "import fluent.ui.system.icons.$styleLowercase.$iconName"
        }
        
        // Build icon references
        val iconReferences = iconNames.joinToString(",\n") { iconName ->
            "            FluentIcons.$styleCapitalized.$iconName"
        }
        
        val content = """
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

package fluent.ui.system.icons

import androidx.compose.ui.graphics.vector.ImageVector
$imports

public val FluentIcons.${styleCapitalized}IconList: List<ImageVector>
    get() {
        if ($variableName != null) {
            return $variableName!!
        }

        $variableName = listOf(
$iconReferences
        )

        return $variableName!!
    }

private var $variableName: List<ImageVector>? = null
        """.trimIndent()
        
        iconListFile.writeText(content)
        return Pair(wasCreated, iconListFile)
    }
    
    /**
     * Removes an IconList file if it exists (when no icons are present)
     */
    private fun removeIconListFile(targetDir: File, style: String) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")
        
        if (iconListFile.exists()) {
            if (iconListFile.delete()) {
                println("  🗑️  Removed empty ${styleCapitalized}IconList.kt")
            } else {
                println("  ❌ Failed to remove ${styleCapitalized}IconList.kt")
            }
        }
    }
}
