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

        println("📝 Updating Icon Lists")

        if (!targetDir.exists()) {
            throw IllegalArgumentException("Target directory does not exist: ${targetDir.relativeTo(project.projectDir)}")
        }

        var totalIconsProcessed = 0
        var listsUpdated = 0

        fluentConfig.supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            
            if (styleDir.exists()) {
                val iconFiles = styleDir.listFiles { file ->
                    file.extension == "kt" && !file.name.endsWith("IconList.kt")
                }?.sortedBy { it.nameWithoutExtension } ?: emptyList()
                
                if (iconFiles.isEmpty()) {
                    removeIconListFile(targetDir, style)
                    return@forEach
                }

                val iconEntries = iconFiles.mapNotNull { file ->
                    extractImageVectorName(file, style)
                }.sorted()

                if (iconEntries.isNotEmpty()) {
                    createOrUpdateIconListFile(targetDir, style, iconEntries)
                    totalIconsProcessed += iconEntries.size
                    listsUpdated++
                }
            }
        }

        println("📊 Updated $listsUpdated icon lists with $totalIconsProcessed total icons")
    }

    private fun extractImageVectorName(file: File, style: String): String? {
        return try {
            val content = file.readText()
            val styleCapitalized = style.replaceFirstChar { it.uppercase() }
            val pattern = Regex(
                """public\s+val\s+FluentIcons\.$styleCapitalized\.([A-Za-z][A-Za-z0-9]*)\s*:\s*ImageVector""",
                RegexOption.MULTILINE
            )
            pattern.find(content)?.groupValues?.get(1)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private fun createOrUpdateIconListFile(targetDir: File, style: String, iconNames: List<String>): File {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val styleLowercase = style.lowercase()
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")
        
        val variableName = when (styleLowercase) {
            "filled" -> "filledIcons"
            "regular" -> "regularIcons"
            "light" -> "lightIcons"
            "color" -> "colorIcons"
            else -> "${styleLowercase}Icons"
        }
        
        val imports = iconNames.joinToString("\n") { iconName ->
            "import fluent.ui.system.icons.$styleLowercase.$iconName"
        }
        
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
        return iconListFile
    }
    
    private fun removeIconListFile(targetDir: File, style: String) {
        val styleCapitalized = style.replaceFirstChar { it.uppercase() }
        val iconListFile = File(targetDir, "${styleCapitalized}IconList.kt")
        
        if (iconListFile.exists() && iconListFile.delete()) {
            println("🗑️ Removed empty ${styleCapitalized}IconList.kt")
        }
    }
}
