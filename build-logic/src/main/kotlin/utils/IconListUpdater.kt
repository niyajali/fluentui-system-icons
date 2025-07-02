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
    
    fun updateIconListFile(targetDir: File, style: String, iconName: String) {
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
        
        // Check if already exists
        if (content.contains(iconReference)) {
            println("  ℹ️  Icon $iconName already in ${styleCapitalized}IconList")
            return
        }
        
        // Add import if not present
        var newContent = if (content.contains(importStatement)) {
            content
        } else {
            addImportToFile(content, importStatement)
        }
        
        // Add icon to the listOf() inside the lazy getter
        newContent = addIconToListOf(newContent, iconReference, styleCapitalized)
        
        iconListFile.writeText(newContent)
        println("  ✅ Added $iconName to ${styleCapitalized}IconList")
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
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE)
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
