# FluentUI Icons Plugin

A Gradle plugin for automatically syncing Microsoft FluentUI System Icons with Jetpack Compose projects. Converts SVG icons to ImageVectors with style-based organization.

## 🚀 Features

- **Flexible Source**: Git integration OR local directory for development
- **Smart Git References**: Auto-formats branch/tag names (main → refs/heads/main, 1.1.305 → refs/tags/1.1.305)
- **Git Integration**: Automatic shallow clones from Microsoft's repository
- **SVG to ImageVector**: Converts SVGs to Compose-ready ImageVectors
- **Style Organization**: Organizes by filled, regular, light, and colored styles
- **Smart Fallback**: Intelligent size selection (24px → 20px → 16px → 28px → 32px)
- **Duplicate Prevention**: Skips existing icons automatically
- **Directional Support**: Handles LTR/RTL variants correctly
- **IconList Management**: Auto-updates style-specific icon collections
- **Development Mode**: Use local directories for faster iteration

## 📋 Setup

### 1. Plugin Configuration

Add to your main project's `settings.gradle.kts`:

```kotlin
pluginManagement {
    includeBuild("build-logic")
}
```

Apply plugin in your `build.gradle.kts`:

```kotlin
plugins {
    id("fluent.icons")
}
```

### 2. Basic Configuration

```kotlin
fluentIcons {
    // Option 1: Git repository (default - automatic cloning)
    gitRepository.set("https://github.com/microsoft/fluentui-system-icons.git")
    gitRef.set("main") // Simple branch name - auto-formatted to refs/heads/main
    
    // Option 2: Use specific version
    // gitRef.set("1.1.305") // Simple tag name - auto-formatted to refs/tags/1.1.305
    
    // Option 3: Local directory (for development/testing)
    // useLocalDirectory.set(true)
    // localDirectoryPath.set("F:/fluentui-system-icons")
    
    // Target configuration
    targetIconsPath.set("library/src/commonMain/kotlin/fluent/ui/system/icons")
    
    // Size preferences
    preferredSize.set(24)
    fallbackSizes.set(listOf(20, 16, 28, 32))
    
    // Style filtering
    supportedStyles.set(listOf("filled", "regular", "light", "color"))
}
```

### 3. Local Development Setup

For faster development/testing, use a local directory instead of cloning:

```kotlin
fluentIcons {
    // Use local directory (much faster for development)
    useLocalDirectory.set(true)
    localDirectoryPath.set("F:/fluentui-system-icons")
    
    // Git settings are ignored when using local directory
    targetIconsPath.set("library/src/commonMain/kotlin/fluent/ui/system/icons")
}
```

**Local Directory Setup:**
```bash
# Clone the repository once
git clone https://github.com/microsoft/fluentui-system-icons.git F:/fluentui-system-icons

# Then use local path in plugin configuration
# This avoids cloning on every sync - much faster for development!
```

### 4. Git Reference Examples

The plugin automatically formats Git references for you:

```kotlin
fluentIcons {
    // Branch names (automatically formatted)
    gitRef.set("main")                    // → refs/heads/main
    gitRef.set("develop")                 // → refs/heads/develop
    gitRef.set("feature/new-icons")       // → refs/heads/feature/new-icons
    
    // Version tags (automatically formatted)
    gitRef.set("1.1.305")                 // → refs/tags/1.1.305
    gitRef.set("2.0.0")                   // → refs/tags/2.0.0
    
    // Already formatted (passed through)
    gitRef.set("refs/heads/main")         // → refs/heads/main
    gitRef.set("refs/tags/1.1.305")       // → refs/tags/1.1.305
}
```

### 5. Advanced Configuration

```kotlin
fluentIcons {
    // Development mode with local directory
    useLocalDirectory.set(true)
    localDirectoryPath.set("/path/to/local/fluentui-system-icons")
    
    // Production mode with Git (automatic ref formatting)
    // useLocalDirectory.set(false)
    // gitRepository.set("https://github.com/microsoft/fluentui-system-icons.git")
    // gitRef.set("1.1.305")  // Auto-formatted to refs/tags/1.1.305
    
    // Custom size preferences
    preferredSize.set(20)
    sizePreferences.set(mapOf(20 to 1, 24 to 2, 16 to 3, 32 to 4, 28 to 5))
    
    // Exclude patterns
    excludePatterns.set(listOf("test", "experimental", "beta"))
    
    // Custom log file
    syncLogFile.set("my-icons-sync.log")
}
```

## 🎮 Usage

### Check for New Icons
```bash
./gradlew checkNewIcons --no-configuration-cache
```

Preview what icons would be synced without making changes:
```
🔍 FluentUI Icons Check
🔗 Repository: https://github.com/microsoft/fluentui-system-icons.git
🌿 Reference: main

📊 Results:
Found 3 new icon families that would be synced:
  📁 access_time:
    - filled: 24px → filled/AccessTime.kt
    - regular: 24px → regular/AccessTime.kt
  📁 task_list_ltr:
    - filled: 24px → filled/TaskListLtr.kt
    - regular: 24px → regular/TaskListLtr.kt

Total variants to sync: 4
```

### Sync New Icons
```bash
./gradlew syncNewIcons --no-configuration-cache
```

Downloads and converts new icons:
```
🎨 FluentUI Icons Sync
🔄 Cloning FluentUI repository (shallow clone)...
✅ Repository cloned successfully

📁 Processing: access_time
  ✅ Synced filled (24px) → filled/AccessTime.kt
  ✅ Synced regular (24px) → regular/AccessTime.kt

📊 FLUENT ICONS SYNC SUMMARY
🏠 Icon families processed: 1
✅ New variants added: 2
📈 Total processed: 2
```

### Analyze Coverage
```bash
./gradlew analyzeIconCoverage --no-configuration-cache
```

Get comprehensive statistics:
```
📊 FLUENT ICONS COVERAGE ANALYSIS
🏠 Total families in source: 2,847
🎨 Total variants in source: 11,388
✅ Existing variants in target: 245
📈 Coverage: 2.2%

🎨 Style Breakdown:
   📁 filled: 89/3,567 (2.5%)
   📁 regular: 86/3,421 (2.5%)
   📁 light: 35/2,234 (1.6%)
   📁 color: 35/2,166 (1.6%)
```

## 📂 Generated Structure

```
library/src/commonMain/kotlin/fluent/ui/system/icons/
├── filled/
│   ├── AccessTime.kt
│   ├── TaskListLtr.kt
│   └── TaskListRtl.kt
├── regular/
│   ├── AccessTime.kt
│   ├── TaskListLtr.kt
│   └── TaskListRtl.kt
├── light/
│   └── AccessTime.kt
├── color/
│   └── TaskListLtr.kt
├── FilledIconList.kt
├── RegularIconList.kt
├── LightIconList.kt
└── ColorIconList.kt
```

## 🎨 Generated Code Examples

### Individual Icon
```kotlin
package fluent.ui.system.icons.filled

public val FluentIcons.Filled.AccessTime: ImageVector
    get() {
        if (_AccessTime != null) {
            return _AccessTime!!
        }
        _AccessTime = ImageVector.Builder(
            name = "Filled.AccessTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            // Generated path data...
        }.build()
        return _AccessTime!!
    }
```

### Icon Collection
```kotlin
package fluent.ui.system.icons

public val FluentIcons.Filled.All: List<ImageVector> = listOf(
    FluentIcons.Filled.AccessTime,
    FluentIcons.Filled.TaskListLtr,
    FluentIcons.Filled.TaskListRtl,
    // ... more icons
)
```

## 💻 Usage in Compose

```kotlin
import fluent.ui.system.icons.FluentIcons

@Composable
fun MyScreen() {
    // Individual icons
    Icon(FluentIcons.Filled.AccessTime, contentDescription = "Access Time")
    Icon(FluentIcons.Regular.TaskListLtr, contentDescription = "Task List LTR")
    
    // All icons of a style
    val allFilledIcons = FluentIcons.Filled.All
}
```

## 🔧 JGit Configuration

The plugin uses **proper JGit RefSpec configurations** for different reference types:

### **Branch References**
```
Input:   refs/heads/main
RefSpec: refs/heads/main:refs/remotes/origin/main
Process: 
1. Fetch branch to local tracking branch
2. Create local branch with upstream tracking
3. Checkout local branch
```

### **Tag References**
```
Input:   refs/tags/1.1.305  
RefSpec: +refs/tags/1.1.305:refs/tags/1.1.305
Process:
1. Fetch tag directly with force (+)
2. Checkout tag directly
```

### **Error Handling**
The plugin automatically handles RefSpec formatting based on reference type, preventing common JGit errors like:
- ❌ `Invalid RefSpec` for branches
- ❌ `Remote does not have refs/heads/...` 
- ❌ `Cannot checkout refs/tags/...`

## 🔧 Architecture

The plugin follows SOLID principles with clean separation of concerns:

- **GitRepository**: Handles Git operations and repository management
- **IconScanner**: Scans and compares icon metadata (unchanged logic)
- **SvgConverter**: Converts SVGs to ImageVectors
- **IconListUpdater**: Manages icon collection files
- **FluentIconsConfig**: Immutable configuration data class

## 🔄 Git Integration

- **Shallow Clones**: Downloads only the latest commit for efficiency
- **Automatic Cleanup**: Temporary repositories are cleaned up automatically
- **Version Pinning**: Lock to specific tags for reproducible builds
- **Branch Support**: Use main branch or specific commits

## 🚀 GitHub Actions Integration

The plugin works seamlessly with CI/CD:

```yaml
- name: Sync FluentUI Icons
  run: ./gradlew syncNewIcons

- name: Check for changes
  run: |
    if [[ -n $(git status --porcelain) ]]; then
      echo "New icons found!"
      git add -A
      git commit -m "🎨 Sync new FluentUI icons"
    fi
```

## 🎯 Icon Selection Strategy

1. **Style Collection**: Finds all available styles for each icon family
2. **Size Fallback**: Prefers 24px, falls back to 20px → 16px → 28px → 32px per style
3. **Directional Handling**: Creates separate icons for LTR/RTL variants
4. **Duplicate Prevention**: Compares existing icons to avoid re-processing

## 📈 Performance

- **Shallow Clone**: Only downloads latest commit (~10MB vs full repo ~500MB)
- **Incremental Sync**: Only processes new/changed icons
- **Efficient Scanning**: Smart comparison using normalized names
- **Automatic Cleanup**: No disk space accumulation

## 🔍 Troubleshooting

### Git Reference Issues

**Problem**: Branch fetching fails with RefSpec errors
```
🌿 Fetching branch: main
🔧 RefSpec: refs/heads/main:refs/remotes/origin/main
🌿 Creating local tracking branch: main
```
**Solution**: This is the correct flow for branches. If it fails, check network connectivity and repository access.

**Problem**: Tag fetching fails  
```
🏷️ Fetching tag: 1.1.305
🔧 RefSpec: +refs/tags/1.1.305:refs/tags/1.1.305
🏷️ Checking out tag: 1.1.305
```
**Solution**: This is the correct flow for tags. The `+` forces the fetch even if it's not a fast-forward.

**Problem**: Unknown reference format
```
⚠️ Unknown ref format: some-ref, attempting direct fetch
🔧 RefSpec: some-ref (direct)
```
**Solution**: The plugin falls back to direct fetch. Use proper Git reference format or let the plugin auto-format it.

### Common Issues

**Issue**: `Source repository path does not exist` (when using local directory)
```kotlin
// Solution: Use Git mode instead of local directory
fluentIcons {
    useLocalDirectory.set(false)  // Use Git cloning
    gitRef.set("main")            // Will be formatted to refs/heads/main
}
```

### No New Icons Found
```bash
# Force check latest from repository
./gradlew checkNewIcons --rerun-tasks
```

### Git Clone Issues
- Ensure network connectivity to GitHub
- Check if repository URL is accessible
- Verify Git is installed and available

### Build Failures
```bash
# Check plugin tasks are available
./gradlew tasks --group="fluent icons"
```

---

**Plugin Version**: 2.0.0  
**Kotlin DSL**: Compatible  
**Gradle**: 7.0+ Required  
**Dependencies**: svg2compose, JGit, Kotlinx.Serialization

**Repository**: Microsoft FluentUI System Icons  
**License**: Icons are licensed under MIT by Microsoft
