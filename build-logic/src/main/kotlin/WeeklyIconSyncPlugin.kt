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
import utils.GitRefUtils

/**
 * FluentUI System Icons plugin for Jetpack Compose.
 * 
 * Automatically syncs icons from Microsoft's FluentUI System Icons repository,
 * converts SVGs to ImageVectors, and organizes them by style categories.
 * 
 * Features:
 * - Flexible source: Git shallow clones OR local directory
 * - Smart Git ref formatting: "main" → "refs/heads/main", "1.1.305" → "refs/tags/1.1.305"
 * - SVG to Compose ImageVector conversion
 * - Style-based organization (filled, regular, light, colored)
 * - Smart size fallback and duplicate prevention
 * - Automatic IconList management
 */
class WeeklyIconSyncPlugin : Plugin<Project> {
    
    override fun apply(project: Project) {
        // Create extension for configuration
        val extension = project.extensions.create("fluentIcons", FluentIconsExtension::class.java)
        
        // Set default values
        extension.apply {
            useLocalDirectory.convention(false)
            localDirectoryPath.convention("")
            gitRepository.convention("https://github.com/microsoft/fluentui-system-icons.git")
            gitRef.convention("main")
            assetsPath.convention("assets")
            targetIconsPath.convention("src/commonMain/kotlin/fluent/ui/system/icons")
            preferredSize.convention(24)
            fallbackSizes.convention(listOf(20, 16, 28, 32))
            supportedStyles.convention(listOf("filled", "regular", "light", "color"))
            sizePreferences.convention(mapOf(24 to 1, 20 to 2, 16 to 3, 28 to 4, 32 to 5))
            excludePatterns.convention(listOf("test", "temp", "draft"))
            syncLogFile.convention("fluent-icons-sync.log")
        }
        
        // Register tasks
        project.tasks.register("checkNewIcons", CheckNewIconsTask::class.java) {
            group = "fluent icons"
            description = "Checks for new FluentUI icons without syncing them"
            config.set(extension.toConfig())
        }
        
        project.tasks.register("syncNewIcons", SyncNewIconsTask::class.java) {
            group = "fluent icons"
            description = "Syncs new FluentUI icons, converting SVGs to ImageVectors"
            config.set(extension.toConfig())
        }
        
        project.tasks.register("analyzeIconCoverage", AnalyzeIconCoverageTask::class.java) {
            group = "fluent icons"
            description = "Analyzes FluentUI icon coverage and statistics"
            config.set(extension.toConfig())
        }
        
        // Configure task dependencies
        project.afterEvaluate {
            project.tasks.named("syncNewIcons") {
                dependsOn("checkNewIcons")
            }
        }
    }
}

/**
 * DSL extension for configuring FluentUI icon synchronization
 */
abstract class FluentIconsExtension {
    abstract val useLocalDirectory: Property<Boolean>
    abstract val localDirectoryPath: Property<String>
    abstract val gitRepository: Property<String>
    abstract val gitRef: Property<String>
    abstract val assetsPath: Property<String>
    abstract val targetIconsPath: Property<String>
    abstract val preferredSize: Property<Int>
    abstract val fallbackSizes: ListProperty<Int>
    abstract val supportedStyles: ListProperty<String>
    abstract val sizePreferences: MapProperty<Int, Int>
    abstract val excludePatterns: ListProperty<String>
    abstract val syncLogFile: Property<String>
    
    /**
     * Converts extension properties to immutable configuration
     */
    fun toConfig(): FluentIconsConfig {
        val rawGitRef = gitRef.get()
        val formattedGitRef = GitRefUtils.formatGitRef(rawGitRef)
        
        return FluentIconsConfig(
            useLocalDirectory = useLocalDirectory.get(),
            localDirectoryPath = localDirectoryPath.get(),
            gitRepository = gitRepository.get(),
            gitRef = formattedGitRef,
            assetsPath = assetsPath.get(),
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
 * Immutable configuration for FluentUI icon operations
 */
data class FluentIconsConfig(
    val useLocalDirectory: Boolean = false,
    val localDirectoryPath: String = "",
    val gitRepository: String = "https://github.com/microsoft/fluentui-system-icons.git",
    val gitRef: String = "main",
    val assetsPath: String = "assets",
    val targetIconsPath: String = "src/commonMain/kotlin/fluent/ui/system/icons",
    val preferredSize: Int = 24,
    val fallbackSizes: List<Int> = listOf(20, 16, 28, 32),
    val supportedStyles: List<String> = listOf("filled", "regular", "light", "color"),
    val sizePreferences: Map<Int, Int> = mapOf(
        24 to 1, 20 to 2, 16 to 3, 28 to 4, 32 to 5
    ),
    val excludePatterns: List<String> = listOf("test", "temp", "draft"),
    val syncLogFile: String = "fluent-icons-sync.log"
)
