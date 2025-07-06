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
import models.IconSyncResult
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

abstract class SyncAndUpdateIconsTask : DefaultTask() {

    @get:Input
    abstract val config: Property<FluentIconsConfig>

    @TaskAction
    fun syncAndUpdateIcons() {
        val fluentConfig = config.get()
        val targetDir = File(project.projectDir, fluentConfig.targetIconsPath)
        FileUtils.createDirectoriesIfNeeded(targetDir, fluentConfig.supportedStyles)

        println("🎨 FluentUI Icons - Sync & Update")
        println("📂 Target: ${targetDir.relativeTo(project.projectDir)}")

        var syncResult: IconSyncResult? = null

        GitRepositoryFactory.createRepository(
            fluentConfig.useLocalDirectory,
            fluentConfig.localDirectoryPath,
            fluentConfig.gitRepository,
            fluentConfig.gitRef,
        ).use { gitRepo ->

            println("📍 Source: ${gitRepo.getRepositoryInfo()}")

            val sourceDir = gitRepo.getAssetsDirectory(fluentConfig.assetsPath)
            val scanner = IconScanner()
            val converter = SvgConverter()

            // Step 1: Sync new icons
            println("\n🔄 Step 1: Syncing new icons...")
            val existingIcons = scanner.getExistingIconVariants(targetDir, fluentConfig.supportedStyles)
            val sourceIcons = scanner.scanSourceIcons(sourceDir, fluentConfig.supportedStyles)
            val iconFamiliesToSync = scanner.buildIconFamiliesForSync(sourceIcons, existingIcons, fluentConfig)

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

            println("✅ Sync completed: $newIconsAdded new icons added")

            // Step 2: Update icon lists
            println("\n🔄 Step 2: Updating icon lists...")
            val updater = IconListUpdater()
            val updateResult = updater.updateIconLists(targetDir, fluentConfig.supportedStyles)

            println("✅ Lists updated: ${updateResult.updatedFiles} files")

            // Create comprehensive result
            syncResult = IconSyncResult(
                totalExisting = existingIcons.size,
                newIconsAdded = newIconsAdded,
                duplicatesSkipped = duplicatesSkipped,
                syncedIcons = syncedIcons,
                styleBreakdown = styleBreakdown,
                listsUpdated = updateResult.updatedFiles,
                totalIconsAfterSync = existingIcons.size + newIconsAdded
            )
        }

        // Log results and create GitHub Actions output
        logResults(fluentConfig, syncResult!!)
        createGitHubActionsOutput(syncResult!!)
    }

    private fun logResults(config: FluentIconsConfig, result: IconSyncResult) {
        println("\n📊 Complete Sync Results:")
        println("   Total icons before sync: ${result.totalExisting}")
        println("   New icons added: ${result.newIconsAdded}")
        println("   Total icons after sync: ${result.totalIconsAfterSync}")
        
        if (result.duplicatesSkipped > 0) {
            println("   Duplicates skipped: ${result.duplicatesSkipped}")
        }

        if (result.styleBreakdown.isNotEmpty()) {
            println("   New icons by style: ${result.styleBreakdown.entries.joinToString(", ") { "${it.key}(${it.value})" }}")
        }

        println("   Icon lists updated: ${result.listsUpdated}")

        if (result.newIconsAdded > 0) {
            println("\n✅ Sync completed successfully! ${result.newIconsAdded} new icons ready for commit")
        } else {
            println("\n✅ All icons are up to date")
        }

        // Log to file
        val logFile = File(project.projectDir, config.syncLogFile)
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
        val logEntry = """
            === FluentUI Icons Complete Sync - $timestamp ===
            Before: ${result.totalExisting}, Added: ${result.newIconsAdded}, After: ${result.totalIconsAfterSync}
            Style breakdown: ${result.styleBreakdown.entries.joinToString(", ") { "${it.key}: ${it.value}" }}
            Lists updated: ${result.listsUpdated}
            Success: ${result.newIconsAdded > 0}
            
        """.trimIndent()
        logFile.appendText(logEntry)
    }

    private fun createGitHubActionsOutput(result: IconSyncResult) {
        // Create GitHub Actions outputs for workflow
        val outputFile = System.getenv("GITHUB_OUTPUT")
        if (outputFile != null) {
            val output = File(outputFile)
            output.appendText("sync_success=${result.newIconsAdded > 0}\n")
            output.appendText("new_icons_count=${result.newIconsAdded}\n")
            output.appendText("total_icons_before=${result.totalExisting}\n")
            output.appendText("total_icons_after=${result.totalIconsAfterSync}\n")
            output.appendText("lists_updated=${result.listsUpdated}\n")
            output.appendText("style_breakdown=${result.styleBreakdown.entries.joinToString(", ") { "${it.key}: ${it.value}" }}\n")
            
            // Detailed sync info for PR description
            val syncDetails = result.syncedIcons.groupBy { it.style }.entries.joinToString("\n") { (style, icons) ->
                "- **${style.replaceFirstChar { it.uppercase() }}**: ${icons.size} icons (${icons.map { it.iconName }.sorted().take(5).joinToString(", ")}${if (icons.size > 5) ", ..." else ""})"
            }
            output.appendText("sync_details<<EOF\n$syncDetails\nEOF\n")
        }
    }
}
