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
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)
        FileUtils.createDirectoriesIfNeeded(targetDir, fluentConfig.supportedStyles)

        println("🎨 Syncing FluentUI Icons")
        println("📂 Target: ${targetDir.relativeTo(project.projectDir)}")

        GitRepositoryFactory.createRepository(
            fluentConfig.useLocalDirectory,
            fluentConfig.localDirectoryPath,
            fluentConfig.gitRepository,
            fluentConfig.gitRef,
        ).use { gitRepo ->

            val sourceDir = gitRepo.getAssetsDirectory(fluentConfig.assetsPath)
            val scanner = IconScanner()
            val converter = SvgConverter()

            // Get existing icons and scan source
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)
            val iconFamiliesToSync = scanner.buildIconFamiliesForSync(sourceIcons, existingIcons, fluentConfig)

            // Perform sync
            var newIconsAdded = 0
            var duplicatesSkipped = 0
            val syncedIcons = mutableListOf<SyncedIconInfo>()
            val styleBreakdown = mutableMapOf<String, Int>()

            iconFamiliesToSync.forEach { iconFamily ->
                iconFamily.variants.forEach { (style, variant) ->
                    try {
                        val iconName = FileUtils.toPascalCase(iconFamily.baseName)
                        val targetFile = File(targetDir, "${style.lowercase()}/${iconName}.kt")

                        if (!targetFile.exists()) {
                            converter.convertSvgToImageVector(variant, targetFile, style, iconName)
                            newIconsAdded++

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
                            duplicatesSkipped++
                        }
                    } catch (e: Exception) {
                        println("❌ Failed to sync ${iconFamily.baseName}: ${e.message}")
                    }
                }
            }

            // Summary
            logSyncResult(
                config = fluentConfig,
                newIconsAdded = newIconsAdded,
                duplicatesSkipped = duplicatesSkipped,
                styleBreakdown = styleBreakdown,
                totalExisting = existingIcons.size
            )
        }
    }

    private fun logSyncResult(
        config: FluentIconsConfig,
        newIconsAdded: Int,
        duplicatesSkipped: Int,
        styleBreakdown: Map<String, Int>,
        totalExisting: Int
    ) {
        println("\n📊 Sync Results:")
        println("   Existing icons preserved: $totalExisting")
        println("   New icons added: $newIconsAdded")
        if (duplicatesSkipped > 0) {
            println("   Duplicates skipped: $duplicatesSkipped")
        }

        if (styleBreakdown.isNotEmpty()) {
            println("   New icons by style: ${styleBreakdown.entries.joinToString(", ") { "${it.key}(${it.value})" }}")
        }

        if (newIconsAdded > 0) {
            println("\n💡 Run './gradlew updateIconLists' to update icon collection files")
        } else {
            println("\n✅ All icons are up to date")
        }

        // Log to file
        val logFile = File(project.projectDir, config.syncLogFile)
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
        val logEntry = """
            === FluentUI Icons Sync - $timestamp ===
            Existing preserved: $totalExisting, New added: $newIconsAdded, Skipped: $duplicatesSkipped
            Style breakdown: ${styleBreakdown.entries.joinToString(", ") { "${it.key}: ${it.value}" }}
            
        """.trimIndent()
        logFile.appendText(logEntry)
    }
}
