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

import java.io.File

class IconListUpdater {

    fun updateIconListFile(targetDir: File, style: String, iconName: String, oldFileName: String? = null) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")

        if (!iconListFile.exists()) {
            // Create new IconList file with the correct structure
            createIconListFile(iconListFile, style, iconName)
            return
        }

        val content = iconListFile.readText()
        val importStatement = "import fluent.ui.system.icons.${style.lowercase()}.$iconName"
        val iconReference = "FluentIcons.${styleCapitalized}.$iconName"

        // Handle old icon cleanup if name changed
        var cleanedContent = content
        if (oldFileName != null && oldFileName != iconName) {
            cleanedContent = removeOldIconReferences(cleanedContent, style, oldFileName, styleCapitalized)
        }

        // Check if new icon already exists
        if (cleanedContent.contains(iconReference)) {
            println("  ℹ️  Icon $iconName already in ${styleCapitalized}IconList")
            return
        }

        // Add import if not present
        var newContent = if (cleanedContent.contains(importStatement)) {
            cleanedContent
        } else {
            addImportToFile(cleanedContent, importStatement)
        }

        // Add icon to the listOf() inside the lazy getter
        newContent = addIconToListOf(newContent, iconReference, styleCapitalized)

        iconListFile.writeText(newContent)

        if (oldFileName != null && oldFileName != iconName) {
            println("  🔄 Updated ${styleCapitalized}IconList: $oldFileName → $iconName")
        }
    }

    /**
     * Removes old icon references (import and list entry) when icon name changes
     */
    private fun removeOldIconReferences(
        content: String,
        style: String,
        oldIconName: String,
        styleCapitalized: String,
    ): String {
        val oldImportStatement = "import fluent.ui.system.icons.${style.lowercase()}.$oldIconName"
        val oldIconReference = "FluentIcons.${styleCapitalized}.$oldIconName"

        var newContent = content

        // Remove old import
        newContent = newContent.replace("$oldImportStatement\n", "")

        // Remove old icon from list - handle various formatting
        val iconReferencePatterns = listOf(
            Regex("""$oldIconReference,\s*\n"""),           // Icon with comma and newline
            Regex(""",\s*\n\s*$oldIconReference"""),       // Icon with preceding comma and newline
            Regex("""$oldIconReference,"""),                // Icon with comma (inline)
            Regex(""",\s*$oldIconReference"""),             // Icon with preceding comma (inline)
            Regex("""$oldIconReference"""),                  // Icon standalone
        )

        iconReferencePatterns.forEach { pattern ->
            newContent = pattern.replace(newContent, "")
        }

        // Clean up any double commas or trailing commas that might result
        newContent = newContent.replace(Regex(",\\s*,"), ",")
        newContent = newContent.replace(Regex(",\\s*\\n\\s*\\)"), "\n        )")

        return newContent
    }

    private fun addImportToFile(content: String, importStatement: String): String {
        val lines = content.lines().toMutableList()

        // Find the last import line
        var lastImportIndex = -1
        for (i in lines.indices) {
            if (lines[i].trim().startsWith("import ")) {
                lastImportIndex = i
            }
        }

        if (lastImportIndex >= 0) {
            // Insert after the last import
            lines.add(lastImportIndex + 1, importStatement)
        } else {
            // Insert after package declaration
            for (i in lines.indices) {
                if (lines[i].trim().startsWith("package ")) {
                    lines.add(i + 2, importStatement) // Add blank line + import
                    lines.add(i + 2, "")
                    break
                }
            }
        }

        return lines.joinToString("\n")
    }

    private fun addIconToListOf(content: String, iconReference: String, styleCapitalized: String): String {
        // Pattern to match the listOf(...) inside the lazy getter
        val listOfPattern = Regex(
            """(lightIcons|filledIcons|regularIcons|colorIcons)\s*=\s*listOf\s*\(\s*(.*?)\s*\)""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        return listOfPattern.replace(content) { matchResult ->
            val variableName = matchResult.groupValues[1]
            val existingIcons = matchResult.groupValues[2].trim()

            val icons = if (existingIcons.isEmpty()) {
                "            $iconReference"
            } else {
                "$existingIcons,\n            $iconReference"
            }

            "$variableName = listOf(\n$icons\n        )"
        }
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
            "import fluent.ui.system.icons.${styleLowercase}.${file.nameWithoutExtension}"
        }

        val iconReferences = iconFiles.joinToString(",\n") { file ->
            "            FluentIcons.${styleCapitalized}.${file.nameWithoutExtension}"
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

    private fun createIconListFile(iconListFile: File, style: String, firstIconName: String) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val styleLowercase = style.lowercase()
        val variableName = when (styleLowercase) {
            "filled" -> "filledIcons"
            "regular" -> "regularIcons"
            "light" -> "lightIcons"
            "color" -> "colorIcons"
            else -> "${styleLowercase}Icons"
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
import fluent.ui.system.icons.$styleLowercase.$firstIconName

public val FluentIcons.${styleCapitalized}IconList: List<ImageVector>
    get() {
        if ($variableName != null) {
            return $variableName!!
        }

        $variableName = listOf(
            FluentIcons.$styleCapitalized.$firstIconName
        )

        return $variableName!!
    }

private var $variableName: List<ImageVector>? = null
        """.trimIndent()

        iconListFile.writeText(content)
        println("  🆕 Created ${styleCapitalized}IconList.kt with first icon: $firstIconName")
    }
}
