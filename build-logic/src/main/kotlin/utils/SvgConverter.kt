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

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import models.IconVariant
import java.io.File

class SvgConverter {

    fun convertSvgToImageVector(variant: IconVariant, targetFile: File, style: String, iconName: String) {
        // Create a temporary directory for svg2compose processing
        val tempDir = createTempDir("svg2compose")
        val tempSvgFile = File(tempDir, "${variant.name}_${variant.size}_${variant.style}.svg")

        try {
            // Validate input
            if (!variant.svgFile.exists()) {
                throw IllegalArgumentException("SVG file does not exist: ${variant.svgFile.absolutePath}")
            }

            if (variant.svgFile.length() == 0L) {
                throw IllegalArgumentException("SVG file is empty: ${variant.svgFile.absolutePath}")
            }

            // Copy SVG to temp directory
            variant.svgFile.copyTo(tempSvgFile)

            // FIX: Use consistent case handling - titlecase for accessor name
            val accessorCategory = style.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

            // Use svg2compose to convert SVG to ImageVector
            Svg2Compose.parse(
                applicationIconPackage = "fluent.ui.system.icons.${style.lowercase()}",
                accessorName = "FluentIcons.${accessorCategory}",
                outputSourceDirectory = tempDir,
                vectorsDirectory = tempDir,
                type = VectorType.SVG,
                iconNameTransformer = { _, _ -> iconName },
                generatePreview = false,
                generateStringAccessor = false,
            )

            // Find the generated Kotlin file
            val generatedFile = tempDir.walkTopDown()
                .filter { it.extension == "kt" && it.name.contains(iconName) }
                .firstOrNull()

            if (generatedFile != null && generatedFile.exists()) {
                // Read the generated content and modify it to match our format
                val generatedContent = generatedFile.readText()
                if (generatedContent.isBlank()) {
                    throw IllegalStateException("Generated file is empty for ${variant.name}")
                }

                val modifiedContent = modifyGeneratedContent(generatedContent, style, iconName, variant)

                // Write to target file
                targetFile.parentFile.mkdirs()
                targetFile.writeText(modifiedContent)
            } else {
                throw IllegalStateException("svg2compose failed to generate Kotlin file for ${variant.name}")
            }

        } catch (e: Exception) {
            println("Error converting SVG ${variant.svgFile.name}: ${e.message}")
            throw e
        } finally {
            // Clean up temp directory
            try {
                tempDir.deleteRecursively()
            } catch (e: Exception) {
                println("Warning: Failed to clean up temp directory: ${e.message}")
            }
        }
    }

    private fun modifyGeneratedContent(content: String, style: String, iconName: String, variant: IconVariant): String {
        // Extract the ImageVector definition from generated content
        val imageVectorRegex = Regex(
            """ImageVector\.Builder\s*\([^)]*\).*?\.build\(\)""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        val imageVectorDefinition = imageVectorRegex.find(content)?.value
            ?: run {
                // Fallback: try to find any ImageVector.Builder pattern
                val fallbackRegex = Regex(
                    """ImageVector\.Builder[^.]*\.build\(\)""",
                    RegexOption.DOT_MATCHES_ALL,
                )
                fallbackRegex.find(content)?.value
                    ?: throw IllegalStateException("Could not extract ImageVector definition from generated content for $iconName")
            }

        // FIX: Use consistent case handling
        val styleCapitalized = style.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        return """
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
package fluent.ui.system.icons.${style.lowercase()}

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

/**
 * Generated from ${variant.svgFile.name}
 * Size: ${variant.size}dp${if (variant.direction != null) ", Direction: ${variant.direction.uppercase()}" else ""}
 */
public val FluentIcons.$styleCapitalized.$iconName: ImageVector
    get() {
        if (_$iconName != null) {
            return _$iconName!!
        }
        _$iconName = $imageVectorDefinition
        return _$iconName!!
    }

@Suppress("ObjectPropertyName")
private var _$iconName: ImageVector? = null

@Preview
@Composable
private fun ${iconName}Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.$styleCapitalized.$iconName, contentDescription = null)
    }
}

        """.trimIndent()
    }
}
