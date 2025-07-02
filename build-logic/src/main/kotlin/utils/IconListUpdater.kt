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
        val iconListFile = File(targetDir, "${style.replaceFirstChar { it.uppercase() }}IconList.kt")
        
        if (!iconListFile.exists()) {
            // Create new IconList file
            createIconListFile(iconListFile, style)
        }
        
        val content = iconListFile.readText()
        val importStatement = "import fluent.ui.system.icons.${style.lowercase()}.$iconName"
        val iconReference = "FluentIcons.${style.replaceFirstChar { it.uppercase() }}.$iconName"
        
        // Check if already exists
        if (content.contains(iconReference)) {
            return // Already added
        }
        
        // Add import
        val importPattern = "import fluent.ui.system.icons.FluentIcons"
        val newContent = if (content.contains(importStatement)) {
            content
        } else {
            content.replace(importPattern, "$importPattern\n$importStatement")
        }
        
        // Add to icon list
        val listPattern = Regex("""(val\s+FluentIcons\.${style.replaceFirstChar { it.uppercase() }}\.All:\s*List<ImageVector>\s*=\s*listOf\s*\(\s*)(.*?)(\s*\))""", RegexOption.DOT_MATCHES_ALL)
        val finalContent = listPattern.replace(newContent) { matchResult ->
            val prefix = matchResult.groupValues[1]
            val existingIcons = matchResult.groupValues[2]
            val suffix = matchResult.groupValues[3]
            
            val icons = if (existingIcons.trim().isEmpty()) {
                iconReference
            } else {
                "$existingIcons,\n        $iconReference"
            }
            
            "$prefix$icons$suffix"
        }
        
        iconListFile.writeText(finalContent)
    }
    
    private fun createIconListFile(iconListFile: File, style: String) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val content = """
package fluent.ui.system.icons

import androidx.compose.ui.graphics.vector.ImageVector
import fluent.ui.system.icons.FluentIcons

/**
 * All $styleCapitalized icons in the Fluent System Icons collection.
 */
public val FluentIcons.$styleCapitalized.All: List<ImageVector> = listOf(
)
        """.trimIndent()
        
        iconListFile.writeText(content)
    }
}
