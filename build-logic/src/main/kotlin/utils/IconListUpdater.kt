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

package utils

import models.IconListUpdateResult
import java.io.File

class IconListUpdater {

    /**
     * Updates all icon lists for supported styles and returns result
     */
    fun updateIconLists(targetDir: File, supportedStyles: List<String>): IconListUpdateResult {
        var updatedFiles = 0
        val totalIcons = mutableMapOf<String, Int>()

        supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            if (styleDir.exists()) {
                val iconFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.size ?: 0
                
                totalIcons[style] = iconFiles
                
                if (iconFiles > 0) {
                    rebuildIconListFile(targetDir, style)
                    updatedFiles++
                }
            }
        }

        return IconListUpdateResult(
            updatedFiles = updatedFiles,
            totalIcons = totalIcons
        )
    }

    /**
     * Rebuilds the entire icon list file from scratch by scanning the style directory
     * This ensures consistency and removes any orphaned references
     */
    fun rebuildIconListFile(targetDir: File, style: String) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val styleDir = File(targetDir, style.lowercase())
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")

        if (!styleDir.exists()) {
            println("  ⚠️  Style directory does not exist: ${styleDir.absolutePath}")
            return
        }

        // Get all icon files in the style directory
        val iconFiles = styleDir.listFiles { file ->
            file.extension == "kt" && !file.name.endsWith("IconList.kt")
        }?.sortedBy { it.nameWithoutExtension } ?: emptyList()

        if (iconFiles.isEmpty()) {
            // Delete the IconList file if no icons exist
            if (iconListFile.exists()) {
                iconListFile.delete()
                println("  🗑️  Removed empty ${styleCapitalized}IconList.kt")
            }
            return
        }

        val styleLowercase = style.lowercase()
        val variableName = when (styleLowercase) {
            "filled" -> "filledIcons"
            "regular" -> "regularIcons"
            "light" -> "lightIcons"
            "color" -> "colorIcons"
            else -> "${styleLowercase}Icons"
        }

        // Build imports and icon references
        val imports = iconFiles.joinToString("\n") { file ->
            val actualPropertyName = extractImageVectorPropertyName(file, style)
            "import fluent.ui.system.icons.${styleLowercase}.$actualPropertyName"
        }

        val iconReferences = iconFiles.joinToString(",\n") { file ->
            val actualPropertyName = extractImageVectorPropertyName(file, style)

            "            FluentIcons.${styleCapitalized}.$actualPropertyName"
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
        println("  🔄 Rebuilt ${styleCapitalized}IconList.kt with ${iconFiles.size} icons")
    }

    /**
     * Extracts the actual ImageVector property name from a Kotlin file
     * This ensures we know exactly what property names are in use
     */
    private fun extractImageVectorPropertyName(file: File, style: String): String? {
        try {
            val content = file.readText()
            val styleCapitalized = style.replaceFirstChar { it.uppercase() }

            // Look for pattern: public val FluentIcons.StyleName.PropertyName: ImageVector
            val pattern = Regex(
                """public\s+val\s+FluentIcons\.$styleCapitalized\.([A-Za-z][A-Za-z0-9]*)\s*:\s*ImageVector""",
                RegexOption.MULTILINE
            )

            return pattern.find(content)?.groupValues?.get(1)
        } catch (e: Exception) {
            return null
        }
    }

}
