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
import kotlin.io.path.createTempDirectory

class SvgConverter {

    fun convertSvgToImageVector(variant: IconVariant, targetFile: File, style: String, iconName: String) {
        // Create a temporary directory for svg2compose processing
        val tempDir = createTempDirectory(prefix = "svg2compose").toFile()
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

            // Use svg2compose to convert SVG to ImageVector
            Svg2Compose.parse(
                applicationIconPackage = "fluent.ui.system.icons.${style.lowercase()}",
                accessorName = "FluentIcons",
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

    private fun modifyGeneratedContent(
        content: String,
        style: String,
        iconName: String,
        variant: IconVariant,
    ): String {
        // Extract the complete ImageVector Builder definition from generated content
        val imageVectorDefinition = extractImageVectorDefinition(content, iconName)

        // Extract ALL imports from the generated content
        val generatedImports = extractImportsFromContent(content)

        // Process and filter imports
        val processedImports = processImports(generatedImports, style)

        val styleCapitalized = style.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
        val privateVarName = "_${iconName.replaceFirstChar { it.lowercase() }}"

        // Generate keywords from icon name for KDoc
        val keywords = iconName.replace(Regex("(?<=[a-z])(?=[A-Z])"), " ")
            .lowercase()
            .split(" ")
            .filter { it.isNotBlank() }
            .joinToString(", ")

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

${processedImports.sorted().joinToString("\n")}

/**
 * $iconName icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: $styleCapitalized
 * - Size: ${variant.size}dp${if (variant.direction != null) "\n * - Direction: ${variant.direction.uppercase()}" else ""}
 * - Keywords: $keywords
 * - Source: ${variant.svgFile.name}
 * 
 * @return The [ImageVector] for the $iconName icon.
 */
public val FluentIcons.$styleCapitalized.$iconName: ImageVector
    get() {
        if ($privateVarName != null) {
            return $privateVarName!!
        }
        $privateVarName = $imageVectorDefinition
        return $privateVarName!!
    }

@Suppress("ObjectPropertyName")
private var $privateVarName: ImageVector? = null

@Preview
@Composable
private fun ${iconName}Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.$styleCapitalized.$iconName, contentDescription = "$iconName Icon")
    }
}

        """.trimIndent() + "\n"
    }

    private fun extractImageVectorDefinition(content: String, iconName: String): String {
        // First, clean the content by removing any imports that appear in the middle of code
        val cleanedContent = cleanContentFromInvalidImports(content)

        // Pattern 1: Look for complete Builder definition with .apply and .build()
        val pattern1 = Regex(
            """Builder\s*\([^)]+\)\s*\.apply\s*\{.*?\}\s*\.build\(\)""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        pattern1.find(cleanedContent)?.let {
            return it.value
        }

        // Pattern 2: Look for Builder with parentheses and curly braces (more flexible)
        val pattern2 = Regex(
            """Builder\s*\([^)]+\)\.apply\s*\{[^}]*\}\.build\(\)""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        pattern2.find(cleanedContent)?.let {
            return it.value
        }

        // Pattern 3: Extract everything from Builder to .build() across multiple lines
        val pattern3 = Regex(
            """Builder.*?\.build\(\)""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        pattern3.find(cleanedContent)?.let { match ->
            // Clean up the extracted content to remove any stray imports
            val cleaned = match.value.lines()
                .filter { line -> !line.trim().startsWith("import ") }
                .joinToString("\n")
            return cleaned
        }

        // Pattern 4: Look for assignment and extract just the Builder part
        val pattern4 = Regex(
            """_\w+\s*=\s*(Builder.*?\.build\(\))""",
            setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.MULTILINE),
        )

        pattern4.find(cleanedContent)?.let { match ->
            return match.groupValues[1]
        }

        // If all patterns fail, provide debug info for failure case only
        println("=== EXTRACTION FAILURE DEBUG FOR $iconName ===")
        println("Cleaned content length: ${cleanedContent.length}")
        println("Contains 'Builder': ${cleanedContent.contains("Builder")}")
        println("Contains '.build()': ${cleanedContent.contains(".build()")}")
        println("Content preview (first 1000 chars):")
        println(cleanedContent.take(1000))
        println("=== END DEBUG ===")

        throw IllegalStateException("Could not extract ImageVector definition from generated content for $iconName. See debug output above.")
    }

    /**
     * Removes any import statements that appear in the middle of code (invalid placement)
     */
    private fun cleanContentFromInvalidImports(content: String): String {
        val lines = content.lines()
        val result = mutableListOf<String>()
        var foundFirstNonImport = false

        for (line in lines) {
            val trimmedLine = line.trim()

            when {
                trimmedLine.startsWith("import ") && !foundFirstNonImport -> {
                    // Valid import at the top of file
                    result.add(line)
                }

                trimmedLine.startsWith("import ") && foundFirstNonImport -> {
                    // Invalid import in the middle of code - skip it
                    continue
                }

                trimmedLine.isNotEmpty() && !trimmedLine.startsWith("package")
                        && !trimmedLine.startsWith("/*") && !trimmedLine.startsWith("*")
                        && !trimmedLine.startsWith("*/") -> {
                    // First non-import, non-comment line
                    foundFirstNonImport = true
                    result.add(line)
                }

                else -> {
                    result.add(line)
                }
            }
        }

        return result.joinToString("\n")
    }

    /**
     * Extracts all import statements from generated content
     */
    private fun extractImportsFromContent(content: String): Set<String> {
        val imports = mutableSetOf<String>()

        // Simple and robust import extraction
        content.lines().forEach { line ->
            val trimmed = line.trim()
            if (trimmed.startsWith("import ") && trimmed.length > 7) {
                imports.add(trimmed)
            }
        }

        return imports
    }

    /**
     * Uses generated imports as-is and only fixes specific known issues
     */
    private fun processImports(generatedImports: Set<String>, style: String): Set<String> {
        val processedImports = mutableSetOf<String>()

        // Process each import and only fix specific known issues
        generatedImports.forEach { import ->
            when {
                // Skip malformed .fluenticons imports
                import.contains(".fluenticons.") -> {
                    // Skip these completely
                }

                import.contains("fluent.ui.system.icons.${style.lowercase()}.FluentIcons") -> {
                    processedImports.add("import fluent.ui.system.icons.FluentIcons")
                }

                // Fix incorrect preview import
                import.contains("androidx.compose.ui.tooling.preview.Preview") -> {
                    processedImports.add("import org.jetbrains.compose.ui.tooling.preview.Preview")
                }

                // Use all other imports as-is (trust svg2compose)
                else -> {
                    processedImports.add(import)
                }
            }
        }

        // Add only essential imports that might be missing
        val essentialImports = setOf(
            "import fluent.ui.system.icons.FluentIcons",
            "import org.jetbrains.compose.ui.tooling.preview.Preview",
            "import androidx.compose.foundation.Image",
            "import androidx.compose.runtime.Composable",
            "import androidx.compose.foundation.layout.Box",
            "import androidx.compose.ui.Modifier",
            "import androidx.compose.foundation.layout.padding",
        )

        essentialImports.forEach { essential ->
            val className = essential.substringAfterLast(".")
            if (!processedImports.any { it.substringAfterLast(".") == className }) {
                processedImports.add(essential)
            }
        }

        return processedImports
    }
}
