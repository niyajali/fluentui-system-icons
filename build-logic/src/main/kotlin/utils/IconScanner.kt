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

import FluentIconsConfig
import kotlinx.serialization.json.Json
import models.IconFamily
import models.IconMetadata
import models.IconVariant
import java.io.File

class IconScanner {

    private val json = Json {
        ignoreUnknownKeys = true
        coerceInputValues = true
    }

    fun scanSourceIcons(sourceDir: File, supportedStyles: List<String>): Map<String, List<IconVariant>> {
        val iconFamilies = mutableMapOf<String, MutableList<IconVariant>>()

        if (!sourceDir.exists()) {
            println("ERROR: Source directory does not exist: ${sourceDir.absolutePath}")
            return emptyMap()
        }

        sourceDir.walkTopDown()
            .filter { it.isDirectory }
            .forEach { iconDir ->
                val metadataFile = File(iconDir, "metadata.json")
                if (metadataFile.exists()) {
                    try {
                        val metadataContent = metadataFile.readText()
                        if (metadataContent.isBlank()) {
                            println("Warning: Empty metadata file: ${iconDir.name}")
                            return@forEach
                        }

                        val metadata = json.decodeFromString<IconMetadata>(metadataContent)
                        val svgDir = File(iconDir, "SVG")

                        if (svgDir.exists()) {
                            val variants = extractIconVariants(svgDir, metadata, supportedStyles)
                            if (variants.isNotEmpty()) {
                                // Group variants by their normalized name (includes direction)
                                variants.groupBy { it.name }.forEach { (iconName, iconVariants) ->
                                    iconFamilies[iconName] = iconVariants.toMutableList()
                                }
                            } else {
                                println("Warning: No valid variants found for '${metadata.name}'")
                            }
                        } else {
                            println("Warning: SVG directory not found for '${metadata.name}'")
                        }
                    } catch (e: Exception) {
                        println("Error parsing metadata for ${iconDir.name}: ${e.message}")
                    }
                }
            }

        return iconFamilies
    }

    private fun extractIconVariants(
        svgDir: File,
        metadata: IconMetadata,
        supportedStyles: List<String>,
    ): List<IconVariant> {
        val variants = mutableListOf<IconVariant>()

        val svgFiles = svgDir.listFiles { file: File -> file.extension == "svg" }
        if (svgFiles.isNullOrEmpty()) {
            println("  No SVG files found in ${svgDir.absolutePath}")
            return variants
        }

        svgFiles.forEach { svgFile ->
            val fileName = svgFile.nameWithoutExtension

            // Parse filename patterns:
            // Regular: ic_fluent_access_time_24_filled.svg
            // Directional Pattern 1: ic_fluent_multiselect_ltr_24_filled.svg (direction before size)
            // Directional Pattern 2: ic_fluent_text_number_list_24_filled_ltr.svg (direction after style)
            val parts = fileName.split("_")
            if (parts.size >= 5 && parts[0] == "ic" && parts[1] == "fluent") {
                try {
                    // Check for directional patterns
                    val (size, style, direction) = when {
                        // Pattern 2: direction after style (ic_fluent_name_24_filled_ltr)
                        parts.size >= 6 && (parts.last() == "ltr" || parts.last() == "rtl") -> {
                            val sizeStr = parts[parts.size - 3]
                            val styleStr = parts[parts.size - 2]
                            val directionStr = parts.last()
                            Triple(sizeStr.toIntOrNull(), styleStr, directionStr)
                        }
                        // Pattern 1: direction before size (ic_fluent_name_ltr_24_filled)
                        parts.size >= 6 && (parts[parts.size - 3] == "ltr" || parts[parts.size - 3] == "rtl") -> {
                            val directionStr = parts[parts.size - 3]
                            val sizeStr = parts[parts.size - 2]
                            val styleStr = parts.last()
                            Triple(sizeStr.toIntOrNull(), styleStr, directionStr)
                        }
                        // Regular icon: no direction
                        else -> {
                            val sizeStr = parts[parts.size - 2]
                            val styleStr = parts.last()
                            Triple(sizeStr.toIntOrNull(), styleStr, null)
                        }
                    }

                    val capitalizedStyle = style.replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase() else it.toString()
                    }

                    // Check if style is supported by our configuration (more permissive than metadata)
                    // This allows syncing SVG files even if metadata.json is outdated
                    val isStyleSupported = supportedStyles.contains(style.lowercase())
                    val isInMetadata = metadata.style.contains(capitalizedStyle)

                    if (size != null && (isInMetadata || isStyleSupported)) {
                        // Create icon name with direction suffix if present
                        val baseName = metadata.name.normalizeIconName()
                        val iconName = if (direction != null) {
                            "${baseName}_${direction}" // e.g., "task_list_ltr"
                        } else {
                            baseName
                        }

                        variants.add(
                            IconVariant(
                                name = iconName,
                                size = size,
                                style = style,
                                svgFile = svgFile,
                                priority = calculatePriority(size),
                                direction = direction,
                                keyword = metadata.keyword,
                                description = metadata.description,
                            ),
                        )
                    } else {
                        // Skip with minimal logging for unsupported variants
                        if (size == null) {
                            println("    Skipped $fileName: invalid size")
                        }
                    }
                } catch (e: Exception) {
                    println("    Warning: Failed to parse filename: $fileName")
                }
            } else {
                println("    Warning: Invalid filename pattern: $fileName")
            }
        }

        return variants
    }

    private fun calculatePriority(size: Int): Int = when (size) {
        24 -> 1
        20 -> 2
        16 -> 3
        28 -> 4
        32 -> 5
        else -> 10
    }

    fun getExistingIconVariants(targetDir: File, supportedStyles: List<String>): Map<String, ExistingIconInfo> {
        val existingVariants = mutableMapOf<String, ExistingIconInfo>()

        if (!targetDir.exists()) {
            println("❌ Target directory does not exist")
            return emptyMap()
        }

        supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())

            if (styleDir.exists()) {
                try {
                    val files = styleDir.listFiles { file: File ->
                        file.extension == "kt" && !file.name.endsWith("IconList.kt")
                    }

                    files?.forEach { file ->
                        try {
                            val fileName = file.nameWithoutExtension
                            
                            // Extract ImageVector property name from file content to ensure accuracy
                            val actualPropertyName = extractImageVectorPropertyName(file, style)
                            if (actualPropertyName != null) {
                                // Convert property name back to normalized form for comparison
                                val normalizedName = actualPropertyName.fromPascalCaseToNormalized()
                                val variantKey = "${normalizedName}_${style}"
                                
                                existingVariants[variantKey] = ExistingIconInfo(
                                    normalizedName = normalizedName,
                                    propertyName = actualPropertyName,
                                    fileName = fileName,
                                    file = file,
                                    style = style
                                )
                            } else {
                                println("  Warning: Could not extract ImageVector property from ${file.name}")
                            }
                        } catch (e: Exception) {
                            println("  Warning: Failed to process file ${file.name}: ${e.message}")
                        }
                    }
                } catch (e: Exception) {
                    println("  ❌ Error reading $style/: ${e.message}")
                }
            } else {
                println("  ❌ $style/: directory not found")
            }
        }

        return existingVariants
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

    fun buildIconFamiliesForSync(
        sourceIcons: Map<String, List<IconVariant>>,
        existingIcons: Map<String, ExistingIconInfo>,
        config: FluentIconsConfig,
    ): List<IconFamily> {
        val familiesToSync = mutableListOf<IconFamily>()

        if (sourceIcons.isEmpty()) {
            println("Warning: No source icons found")
            return emptyList()
        }

        if (config.supportedStyles.isEmpty()) {
            println("Warning: No supported styles configured")
            return emptyList()
        }

        sourceIcons.forEach { (iconName, variants) ->
            if (iconName.isBlank()) {
                println("Warning: Skipping icon with blank name")
                return@forEach
            }

            if (variants.isEmpty()) {
                println("Warning: No variants found for icon: $iconName")
                return@forEach
            }

            if (!isExcluded(iconName, config.excludePatterns)) {

                // Group variants by style
                val variantsByStyle = variants.groupBy { it.style }
                val selectedVariants = mutableMapOf<String, IconVariant>()

                // For each supported style, find the best size variant
                config.supportedStyles.forEach { style ->
                    val styleVariants = variantsByStyle[style]
                    if (!styleVariants.isNullOrEmpty()) {
                        val bestVariant = findBestSizeVariant(styleVariants, config)
                        if (bestVariant != null) {
                            val variantKey = "${bestVariant.name}_${bestVariant.style}"

                            // CRITICAL: Only add if icon doesn't already exist
                            // Existing icons are treated as the source of truth
                            val existingInfo = existingIcons[variantKey]
                            
                            if (existingInfo == null) {
                                // Completely new icon - safe to add
                                selectedVariants[style] = bestVariant
                            } else {
                                // Icon already exists - skip to avoid breaking changes
                                println("  ⏩ Skipped ${existingInfo.propertyName} (already exists)")
                            }
                        }
                    }
                }

                // Only create family if we have at least one new variant to sync
                if (selectedVariants.isNotEmpty()) {
                    familiesToSync.add(
                        IconFamily(
                            baseName = iconName,
                            variants = selectedVariants,
                        ),
                    )
                }
            }
        }

        return familiesToSync
    }

    private fun findBestSizeVariant(variants: List<IconVariant>, config: FluentIconsConfig): IconVariant? {
        // First, try preferred size
        val preferredSize = variants.find { it.size == config.preferredSize }
        if (preferredSize != null) return preferredSize

        // Then try fallback sizes in order
        config.fallbackSizes.forEach { fallbackSize ->
            val fallbackVariant = variants.find { it.size == fallbackSize }
            if (fallbackVariant != null) return fallbackVariant
        }

        // Last resort: any available size, sorted by preference
        return variants.minByOrNull { config.sizePreferences[it.size] ?: 999 }
    }

    private fun isExcluded(iconName: String, excludePatterns: List<String>): Boolean {
        return excludePatterns.any { pattern ->
            iconName.contains(pattern, ignoreCase = true)
        }
    }
}

/**
 * Information about existing icon files
 */
data class ExistingIconInfo(
    val normalizedName: String,   // Normalized name (snake_case) for comparison
    val propertyName: String,     // Actual ImageVector property name (e.g., "WiFi")
    val fileName: String,         // Pascal case filename (e.g., "WiFi") 
    val file: File,              // Actual file
    val style: String            // Icon style
)

/**
 * Normalizes icon names to a consistent format for comparison
 * Examples:
 * - "Battery 0" -> "battery0"
 * - "Battery0" -> "battery0"
 * - "XMLHttpRequest" -> "xml_http_request"
 * - "Access Time" -> "access_time"
 * - "WiFi1" -> "wifi1"
 */
fun String.normalizeIconName(): String {
    if (isBlank()) return this

    return this
        // First handle spaces followed by numbers - remove space
        .replace(Regex("\\s+([0-9])"), "$1")
        // Handle letter followed by uppercase letter
        .replace(Regex("([a-z])([A-Z])"), "$1_$2")
        // Handle uppercase letter followed by uppercase+lowercase  
        .replace(Regex("([A-Z])([A-Z][a-z])"), "$1_$2")
        // Replace remaining spaces with underscores
        .replace(Regex("\\s+"), "_")
        // Replace multiple underscores with single
        .replace(Regex("_+"), "_")
        // Remove leading/trailing underscores
        .trim('_')
        .lowercase()
}

/**
 * Converts Pascal case back to normalized form for comparison
 * Examples:
 * - "WiFi1" -> "wifi1"
 * - "AccessTime" -> "access_time"
 * - "TaskListLtr" -> "task_list_ltr"
 */
fun String.fromPascalCaseToNormalized(): String {
    if (isBlank()) return this
    
    return this
        // Insert underscore before uppercase letters (except at start)
        .replace(Regex("(?<!^)([A-Z])"), "_$1")
        .lowercase()
}

/**
 * More robust version that handles multiple consecutive uppercase letters
 * Example: "XMLHttpRequest" -> "xml_http_request"
 * Enhanced to handle edge cases better
 */
fun String.toSnakeCase(): String {
    return this.normalizeIconName()
}
