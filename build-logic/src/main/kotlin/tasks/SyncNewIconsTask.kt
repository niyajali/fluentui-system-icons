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
import utils.IconListUpdater
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

        println("🎨 FluentUI Icons Sync")
        println("📂 Target: ${targetDir.absolutePath}")
        println("🎯 Strategy: SVG to ImageVector conversion with style organization")

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
            val listUpdater = IconListUpdater()

            // Get existing icons in target directory
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            println("📊 Found ${existingIcons.size} existing icon variants")

            // Scan source directory for all available icons
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)
            println("📊 Found ${sourceIcons.size} icon families in source")

            // Build icon families with all available styles
            val iconFamiliesToSync = scanner.buildIconFamiliesForSync(sourceIcons, existingIcons, fluentConfig)
            println("📊 Selected ${iconFamiliesToSync.size} families for sync")

            // Perform the actual sync with SVG conversion
            var newIconsAdded = 0
            var duplicatesSkipped = 0
            val syncedIcons = mutableListOf<SyncedIconInfo>()
            val styleBreakdown = mutableMapOf<String, Int>()

            iconFamiliesToSync.forEach { iconFamily ->
                println("\n📁 Processing: ${iconFamily.baseName}")

                iconFamily.variants.forEach { (style, variant) ->
                    try {
                        val iconName = FileUtils.toPascalCase(iconFamily.baseName)
                        val variantKey = "${iconFamily.baseName}_${variant.style}"

                        if (existingIcons.contains(variantKey)) {
                            println("  ⚠️  Skipping $style - already exists")
                            duplicatesSkipped++
                        } else {
                            val targetFile = File(targetDir, "${style.lowercase()}/${iconName}.kt")

                            // Convert SVG to ImageVector and generate Kotlin code
                            converter.convertSvgToImageVector(variant, targetFile, style, iconName)

                            // Update the corresponding IconList file
                            listUpdater.updateIconListFile(targetDir, style, iconName)

                            syncedIcons.add(
                                SyncedIconInfo(
                                    iconName = iconName,
                                    style = style,
                                    size = variant.size,
                                    filePath = targetFile.relativeTo(project.projectDir).path,
                                ),
                            )
                            styleBreakdown[style] = styleBreakdown.getOrDefault(style, 0) + 1
                            newIconsAdded++
                            println("  ✅ Synced $style (${variant.size}px) → ${targetFile.relativeTo(targetDir).path}")
                        }
                    } catch (e: Exception) {
                        println("  ❌ Failed to sync $style: ${e.message}")
                        e.printStackTrace()
                    }
                }
            }

            // Log results
            logSyncResult(
                fluentConfig,
                newIconsAdded,
                duplicatesSkipped,
                syncedIcons,
                iconFamiliesToSync.size,
                styleBreakdown,
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
    ) {
        val logFile = File(project.projectDir, config.syncLogFile)
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())

        val styleBreakdownText = styleBreakdown.entries
            .sortedByDescending { it.value }
            .joinToString("\n") { "    ${it.key}: ${it.value} icons" }

        val syncedIconsText = syncedIcons.joinToString("\n") { icon ->
            "    ${icon.iconName} (${icon.style}, ${icon.size}px) → ${icon.filePath}"
        }

        val logEntry = """
            
            === FluentUI Icons Sync Report - $timestamp ===
            📊 Summary:
              Icon families processed: $iconFamiliesProcessed
              New variants added: $newIconsAdded
              Duplicates skipped: $duplicatesSkipped
              Total processed: ${syncedIcons.size + duplicatesSkipped}
            
            🎨 Style Breakdown:
            $styleBreakdownText
            
            📝 Synced variants:
            $syncedIconsText
            
        """.trimIndent()

        logFile.appendText(logEntry)

        println("\n" + "=".repeat(60))
        println("📊 FLUENT ICONS SYNC SUMMARY")
        println("=".repeat(60))
        println("🏠 Icon families processed: $iconFamiliesProcessed")
        println("✅ New variants added: $newIconsAdded")
        println("⚠️  Duplicates skipped: $duplicatesSkipped")
        println("📈 Total processed: ${syncedIcons.size + duplicatesSkipped}")

        if (styleBreakdown.isNotEmpty()) {
            println("\n🎨 Style Distribution:")
            styleBreakdown.entries.sortedByDescending { it.value }.forEach { (style, count) ->
                println("   📁 ${style.lowercase()}/: $count icons")
            }
        }

        println("\n📝 Log saved to: ${logFile.absolutePath}")
        println("=".repeat(60))
    }
}
