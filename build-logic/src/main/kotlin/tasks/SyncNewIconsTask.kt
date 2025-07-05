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
import models.SyncedIconInfo
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import services.GitRepositoryFactory
import utils.FileUtils
import utils.IconScanner
import utils.SvgConverter
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

abstract class SyncNewIconsTask : DefaultTask() {

    @get:Input
    abstract val config: Property<FluentIconsConfig>

    @TaskAction
    fun syncNewIcons() {
        val fluentConfig = config.get()

        // Create target directory
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)
        FileUtils.createDirectoriesIfNeeded(targetDir, fluentConfig.supportedStyles)

        println("🎨 FluentUI Icons Sync (Additive Mode)")
        println("📂 Target: ${targetDir.absolutePath}")
        println("🛡️  Strategy: Only add NEW icons - never modify existing ones")

        // Use repository service with automatic cleanup
        GitRepositoryFactory.createRepository(
            fluentConfig.useLocalDirectory,
            fluentConfig.localDirectoryPath,
            fluentConfig.gitRepository,
            fluentConfig.gitRef,
        ).use { gitRepo ->

            println("📍 Source: ${gitRepo.getRepositoryInfo()}")

            val sourceDir = gitRepo.getAssetsDirectory(fluentConfig.assetsPath)

            // Initialize services
            val scanner = IconScanner()
            val converter = SvgConverter()

            // Get existing icons in target directory - these are the source of truth
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            println("🔍 Found ${existingIcons.size} existing icon variants (will be preserved)")

            // Scan source directory for all available icons
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)

            // Build icon families - only includes NEW icons that don't conflict
            val iconFamiliesToSync = scanner.buildIconFamiliesForSync(sourceIcons, existingIcons, fluentConfig)

            // Perform the actual sync - only adding new icons
            var newIconsAdded = 0
            var duplicatesSkipped = 0
            val syncedIcons = mutableListOf<SyncedIconInfo>()
            val styleBreakdown = mutableMapOf<String, Int>()

            iconFamiliesToSync.forEach { iconFamily ->
                iconFamily.variants.forEach { (style, variant) ->
                    try {
                        val iconName = FileUtils.toPascalCase(iconFamily.baseName)
                        val targetFile = File(targetDir, "${style.lowercase()}/${iconName}.kt")

                        // Double-check that file doesn't already exist (safety check)
                        if (!targetFile.exists()) {
                            // Convert SVG to ImageVector and generate Kotlin code
                            converter.convertSvgToImageVector(variant, targetFile, style, iconName)
                            newIconsAdded++
                            println("  ✅ Added ${style}/${iconName}.kt")

                            // Track for reporting
                            syncedIcons.add(
                                SyncedIconInfo(
                                    iconName = iconName,
                                    style = style,
                                    size = variant.size,
                                    filePath = targetFile.relativeTo(project.projectDir).path,
                                ),
                            )
                            styleBreakdown[style] = styleBreakdown.getOrDefault(style, 0) + 1
                        } else {
                            // This shouldn't happen if our logic is correct, but safety first
                            duplicatesSkipped++
                            println("  ⏩ Skipped ${style}/${iconName}.kt (file already exists)")
                        }
                    } catch (e: Exception) {
                        println("  ❌ Failed to sync $style/${iconFamily.baseName}: ${e.message}")
                        e.printStackTrace()
                    }
                }
            }

            // Log results
            logSyncResult(
                config = fluentConfig,
                newIconsAdded = newIconsAdded,
                duplicatesSkipped = duplicatesSkipped,
                syncedIcons = syncedIcons,
                iconFamiliesProcessed = iconFamiliesToSync.size,
                styleBreakdown = styleBreakdown,
                totalExisting = existingIcons.size
            )
        }
    }

    private fun logSyncResult(
        config: FluentIconsConfig,
        newIconsAdded: Int,
        duplicatesSkipped: Int,
        syncedIcons: List<SyncedIconInfo>,
        iconFamiliesProcessed: Int,
        styleBreakdown: Map<String, Int>,
        totalExisting: Int
    ) {
        val logFile = File(project.projectDir, config.syncLogFile)
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())

        val styleBreakdownText = styleBreakdown.entries
            .sortedByDescending { it.value }
            .joinToString("\n") { "    ${it.key}: ${it.value} new icons" }

        val syncedIconsText = syncedIcons.joinToString("\n") { icon ->
            "    ${icon.iconName} (${icon.style}, ${icon.size}px) → ${icon.filePath}"
        }

        val logEntry = """
            
            === FluentUI Icons Sync Report (Additive Mode) - $timestamp ===
            📊 Summary:
              Existing variants preserved: $totalExisting
              Icon families processed: $iconFamiliesProcessed
              New variants added: $newIconsAdded
              Duplicates skipped: $duplicatesSkipped
              Total processed: $newIconsAdded
            
            🎨 New Icons by Style:
            $styleBreakdownText
            
            📝 Newly synced variants:
            $syncedIconsText
            
        """.trimIndent()

        logFile.appendText(logEntry)

        println("\n" + "=".repeat(60))
        println("📊 FLUENT ICONS SYNC SUMMARY (ADDITIVE MODE)")
        println("=".repeat(60))
        println("🛡️  Existing variants preserved: $totalExisting")
        println("🏠 Icon families processed: $iconFamiliesProcessed")
        println("✅ New variants added: $newIconsAdded")
        println("⏩ Duplicates skipped: $duplicatesSkipped")

        if (styleBreakdown.isNotEmpty()) {
            println("\n🎨 New Icons by Style:")
            styleBreakdown.entries.sortedByDescending { it.value }.forEach { (style, count) ->
                println("   📁 ${style.lowercase()}/: $count new icons")
            }
        }

        if (newIconsAdded > 0) {
            println("\n💡 Next step: Run './gradlew updateIconLists' to update icon collection files")
            println("💡 Or use: './gradlew syncAndUpdateIcons' for complete workflow")
        } else {
            println("\n🎉 All icons are up to date! No new icons found.")
        }

        println("\n📝 Log saved to: ${logFile.absolutePath}")
        println("=".repeat(60))
    }
}
