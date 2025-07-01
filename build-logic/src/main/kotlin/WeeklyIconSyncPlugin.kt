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


import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import tasks.AnalyzeIconCoverageTask
import tasks.CheckNewIconsTask
import tasks.SyncNewIconsTask

/**
 * Plugin for weekly icon synchronization from FluentUI System Icons repository.
 * 
 * Provides tasks for:
 * - Checking for new icons
 * - Syncing new icons with SVG to ImageVector conversion
 * - Analyzing icon coverage
 */
class WeeklyIconSyncPlugin : Plugin<Project> {
    
    override fun apply(project: Project) {
        // Create extension for configuration
        val extension = project.extensions.create("iconSync", IconSyncExtension::class.java)
        
        // Set default values with project property override support
        extension.apply {
            sourceRepositoryPath.convention(
                project.providers.gradleProperty("sourceRepositoryPath")
                    .orElse("assets")
            )
            targetIconsPath.convention("src/commonMain/kotlin/fluent/ui/system/icons")
            preferredSize.convention(24)
            fallbackSizes.convention(listOf(20, 16, 28, 32))
            supportedStyles.convention(listOf("filled", "regular", "light", "color"))
            sizePreferences.convention(mapOf(24 to 1, 20 to 2, 16 to 3, 28 to 4, 32 to 5))
            excludePatterns.convention(listOf("test", "temp", "draft"))
            syncLogFile.convention("icon-sync-log.txt")
        }
        
        // Register tasks
        project.tasks.register("checkNewIcons", CheckNewIconsTask::class.java) {
            this.group = "icon management"
            this.description = "Checks for new icons without copying them"
            this.config.set(extension.toConfig())
        }
        
        project.tasks.register("syncNewIcons", SyncNewIconsTask::class.java) {
            group = "icon management"
            description = "Syncs newly added icons from source repository, converting SVGs to ImageVectors"
            config.set(extension.toConfig())
        }
        
        project.tasks.register("analyzeIconCoverage", AnalyzeIconCoverageTask::class.java) {
            group = "icon management"
            description = "Analyzes style coverage for existing and new icons"
            config.set(extension.toConfig())
        }
        
        // Configure task dependencies
        project.afterEvaluate {
            project.tasks.named("syncNewIcons") {
                // Run check before sync
                dependsOn("checkNewIcons")
            }
        }
    }
}

/**
 * Extension for configuring the icon sync plugin
 */
abstract class IconSyncExtension {
    abstract val sourceRepositoryPath: Property<String>
    abstract val targetIconsPath: Property<String>
    abstract val preferredSize: Property<Int>
    abstract val fallbackSizes: ListProperty<Int>
    abstract val supportedStyles: ListProperty<String>
    abstract val sizePreferences: MapProperty<Int, Int>
    abstract val excludePatterns: ListProperty<String>
    abstract val syncLogFile: Property<String>
    
    /**
     * Converts extension properties to configuration object
     */
    fun toConfig(): IconSyncConfig {
        return IconSyncConfig(
            sourceRepositoryPath = sourceRepositoryPath.get(),
            targetIconsPath = targetIconsPath.get(),
            preferredSize = preferredSize.get(),
            fallbackSizes = fallbackSizes.get(),
            supportedStyles = supportedStyles.get(),
            sizePreferences = sizePreferences.get(),
            excludePatterns = excludePatterns.get(),
            syncLogFile = syncLogFile.get()
        )
    }
}

/**
 * Configuration data class for icon sync operations
 */
data class IconSyncConfig(
    val sourceRepositoryPath: String,
    val targetIconsPath: String = "src/commonMain/kotlin/fluent/ui/system/icons",
    val preferredSize: Int = 24,
    val fallbackSizes: List<Int> = listOf(20, 16, 28, 32),
    val supportedStyles: List<String> = listOf("filled", "regular", "light", "color"),
    val sizePreferences: Map<Int, Int> = mapOf(
        24 to 1, 20 to 2, 16 to 3, 28 to 4, 32 to 5
    ),
    val excludePatterns: List<String> = listOf("test", "temp", "draft"),
    val syncLogFile: String = "icon-sync-log.txt"
)
