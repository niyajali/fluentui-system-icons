# FluentUI System Icons Sync Plugin

A comprehensive Gradle plugin for automatically syncing new icons from the FluentUI System Icons repository, converting
SVGs to Compose ImageVectors, and organizing them by style categories.

## 🎯 Overview

This plugin provides automated icon synchronization with:

- **SVG to ImageVector conversion** using svg2compose
- **Style-based organization** (filled/, regular/, light/, colored/)
- **Smart size fallback** (24px → 20px → 16px → 28px → 32px)
- **Automatic IconList management** with imports
- **Duplicate prevention** and comprehensive logging
- **All style collection** for maximum coverage

## 🚀 Quick Start

### 1. Setup

Add to your main project's `settings.gradle.kts`:

```kotlin
pluginManagement {
    includeBuild("build-logic")
}
```

Apply plugin in your main `build.gradle.kts`:

```kotlin
plugins {
    id("fluent.icon-sync")
}

// Configure the icon sync
iconSync {
    // For local development: point to your cloned repository
    sourceRepositoryPath.set("F:/fluentui-system-icons/assets")
    
    // Or use environment variable for flexibility:
    // sourceRepositoryPath.set(System.getenv("FLUENT_ICONS_PATH") ?: "F:/fluentui-system-icons/assets")
    
    targetIconsPath.set("library/src/commonMain/kotlin/fluent/ui/system/icons")
}
```

**📝 Note:** You'll need to clone the Microsoft FluentUI repository first:
```bash
# Clone the source repository
git clone https://github.com/microsoft/fluentui-system-icons.git F:/fluentui-system-icons

# Then point your configuration to the assets folder
# sourceRepositoryPath.set("F:/fluentui-system-icons/assets")
```

**📁 For detailed setup instructions, see:** [`SETUP.md`](SETUP.md)

### 2. Basic Usage

```bash
# Check what new icons would be synced
./gradlew checkNewIcons

# Sync and convert new icons
./gradlew syncNewIcons

# Analyze current coverage
./gradlew analyzeIconCoverage
```

## 📋 Available Tasks

### `checkNewIcons`

Previews what icons would be synced without making changes.

**Output Example:**

```
Found 3 new icon families that would be synced:
  📁 access_time:
    - filled: 24px → filled/FluentAccessTime.kt
    - regular: 24px → regular/FluentAccessTime.kt
    - light: 20px → light/FluentAccessTime.kt
  📁 add_circle:
    - filled: 24px → filled/FluentAddCircle.kt
    - regular: 24px → regular/FluentAddCircle.kt

Total variants to sync: 5
```

### `syncNewIcons`

Converts SVGs to ImageVectors and syncs all available styles.

**Process:**

1. Scans source repository for new icon families
2. Converts SVGs to Compose ImageVectors using svg2compose
3. Organizes icons into style-based directories
4. Updates IconList files with proper imports
5. Generates comprehensive sync report

### `analyzeIconCoverage`

Provides detailed analysis of icon coverage and statistics.

**Analysis Includes:**

- Total families in source vs target
- Style coverage breakdown
- Size distribution
- Directory structure overview

## ⚙️ Configuration

### Basic Configuration

```kotlin
iconSync {
    // Point to your local clone of the FluentUI repository
    sourceRepositoryPath.set("F:/fluentui-system-icons/assets")
    targetIconsPath.set("library/src/commonMain/kotlin/fluent/ui/system/icons")
    preferredSize.set(24)
    fallbackSizes.set(listOf(20, 16, 28, 32))
    supportedStyles.set(listOf("filled", "regular", "light", "colored"))
}
```

**🔗 Source Setup Required:**
```bash
# Clone the Microsoft FluentUI repository first
git clone https://github.com/microsoft/fluentui-system-icons.git F:/fluentui-system-icons
```

### Advanced Configuration

```kotlin
iconSync {
    // Source and target paths
    sourceRepositoryPath.set("/custom/path/to/icons")
    targetIconsPath.set("custom/icons/path")

    // Size preferences
    preferredSize.set(20)                               // Prefer 20px over 24px
    fallbackSizes.set(listOf(24, 16, 32, 28))          // Custom fallback order
    sizePreferences.set(
        mapOf(                          // Custom size priorities
            20 to 1, 24 to 2, 16 to 3, 32 to 4, 28 to 5
        )
    )

    // Style filtering
    supportedStyles.set(listOf("filled", "regular"))    // Only specific styles

    // Exclusion patterns
    excludePatterns.set(listOf("test", "temp", "beta", "experimental"))

    // Logging
    syncLogFile.set("custom-sync-log.txt")
}
```

## 📂 Generated Directory Structure

The plugin creates this organized structure:

```
library/src/commonMain/kotlin/fluent/ui/system/icons/
├── filled/
│   ├── FluentAccessTime.kt           # 24px filled variant
│   ├── FluentAddCircle.kt            # 24px filled variant
│   └── ...
├── regular/
│   ├── FluentAccessTime.kt           # 24px regular variant
│   ├── FluentAddCircle.kt            # 24px regular variant
│   └── ...
├── light/
│   ├── FluentAccessTime.kt           # 20px light variant (fallback)
│   └── ...
├── colored/
│   ├── FluentAddCircle.kt            # 16px colored variant (fallback)
│   └── ...
├── FilledIconList.kt                 # Auto-updated with imports
├── RegularIconList.kt                # Auto-updated with imports
├── LightIconList.kt                  # Auto-updated with imports
└── ColoredIconList.kt                # Auto-updated with imports
```

## 🎨 Generated Code Examples

### Individual Icon File

**Input:** `assets/Access Time/SVG/ic_fluent_access_time_24_filled.svg`

**Output:** `filled/FluentAccessTime.kt`

```kotlin
package fluent.ui.system.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

/**
 * Generated from ic_fluent_access_time_24_filled.svg
 * Size: 24dp
 */
public val FluentIcons.Filled.FluentAccessTime: ImageVector
get() {
    if (_FluentAccessTime != null) {
        return _FluentAccessTime!!
    }
    _FluentAccessTime = ImageVector.Builder(
        name = "FluentAccessTime",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF212121)),
            // ... generated path data from SVG
        ) {
            // ... path commands
        }
    }.build()
    return _FluentAccessTime!!
}

private var _FluentAccessTime: ImageVector? = null
```

### Auto-Updated IconList

**FilledIconList.kt** (automatically maintained):

```kotlin
package fluent.ui.system.icons

import androidx.compose.ui.graphics.vector.ImageVector
import fluent.ui.system.icons.FluentIcons
import fluent.ui.system.icons.filled.FluentAccessTime
import fluent.ui.system.icons.filled.FluentAddCircle
// ... more imports added automatically

/**
 * All Filled icons in the Fluent System Icons collection.
 */
public val FluentIcons.Filled.All: List<ImageVector> = listOf(
    FluentIcons.Filled.FluentAccessTime,
    FluentIcons.Filled.FluentAddCircle,
    // ... more icons added automatically
)
```

## ✨ Key Features

### 🔄 SVG to ImageVector Conversion

- Uses **svg2compose** library for accurate conversion
- Preserves original SVG dimensions and styling
- Generates optimized Compose vector graphics
- Maintains proper color handling and gradients

### 📁 Style-Based Organization

- **Filled**: Bold, solid icon variants
- **Regular**: Standard outlined variants
- **Light**: Thin, minimal variants
- **Colored**: Multi-color variants

### 🎯 Smart Size Fallback

**Per-Style Logic:**

1. Try preferred size (default: 24px) for each style
2. If not available, fallback to next size: 20px → 16px → 28px → 32px
3. Each style processed independently

**Example:**

```
📁 access_time:
  ✅ filled: 24px (preferred size available)
  ✅ regular: 24px (preferred size available)  
  ⚠️ light: 20px (24px not available, fallback to 20px)
  ❌ colored: not available in any size
```

### 🚫 Duplicate Prevention

- Compares existing icons by style and name
- Skips icons that already exist
- Provides clear reporting of what was skipped

### 📝 Automatic IconList Management

- Creates style-specific IconList files if they don't exist
- Adds proper imports for new icons
- Maintains alphabetical organization
- Updates the `All` list automatically

### 🔍 Comprehensive Logging

- Detailed sync reports with timestamps
- Style breakdown statistics
- File path tracking
- Error reporting with context

## 🔧 Sync Logic

### Icon Detection

1. **Scan Source**: Parses `metadata.json` files in asset directories
2. **Extract Variants**: Finds all SVG files for each icon family
3. **Parse Filenames**: Extracts size and style from filenames like `ic_fluent_access_time_24_filled.svg`

### Style Collection Strategy

```
For each new icon family:
├── Try to get 24px filled variant
├── Try to get 24px regular variant  
├── Try to get 24px light variant
├── Try to get 24px colored variant
└── For missing 24px variants:
    ├── Fallback to 20px for that specific style
    ├── Fallback to 16px for that specific style
    └── Continue until variant found or exhausted
```

### Naming Convention

- **Input**: `ic_fluent_access_time_24_filled.svg`
- **Processing**: Extract `access_time` → Convert to `AccessTime`
- **Output**: `FluentAccessTime.kt`
- **Reference**: `FluentIcons.Filled.FluentAccessTime`

## 📊 Example Sync Output

```bash
$ ./gradlew syncNewIcons

Starting comprehensive icon sync with SVG to ImageVector conversion...
Source: F:\fluentui-system-icons\assets
Target: F:\project\library\src\commonMain\kotlin\fluent\ui\system\icons
Strategy: Convert SVGs to ImageVectors organized by style categories

Found 125 existing icon variants in target directory
Found 847 icon families in source directory
Selected 12 icon families for sync

📁 Processing family: access_time
  ✅ Synced filled (24px) → filled/FluentAccessTime.kt
  ✅ Synced regular (24px) → regular/FluentAccessTime.kt  
  ✅ Synced light (20px) → light/FluentAccessTime.kt

📁 Processing family: add_circle
  ✅ Synced filled (24px) → filled/FluentAddCircle.kt
  ✅ Synced regular (24px) → regular/FluentAddCircle.kt
  ✅ Synced colored (16px) → colored/FluentAddCircle.kt

============================================================
📊 SVG TO IMAGEVECTOR SYNC SUMMARY  
============================================================
🏠 Icon families processed: 12
✅ New variants added: 34
⚠️  Duplicates skipped: 3
📈 Total processed: 37

🎨 Style Distribution:
   📁 filled/: 12 icons
   📁 regular/: 12 icons
   📁 light/: 6 icons
   📁 colored/: 4 icons

📝 Log saved to: F:\project\icon-sync-log.txt
============================================================
```

## 🎮 Usage in Compose

After sync, use icons seamlessly:

```kotlin
import fluent.ui.system.icons.FluentIcons

@Composable
fun MyScreen() {
    Icon(
        imageVector = FluentIcons.Filled.FluentAccessTime,
        contentDescription = "Access Time"
    )

    Icon(
        imageVector = FluentIcons.Regular.FluentAccessTime,
        contentDescription = "Access Time Regular"
    )
}

// Access all icons of a style
val allFilledIcons = FluentIcons.Filled.All
val allRegularIcons = FluentIcons.Regular.All
```

## 🔍 Troubleshooting

### Common Issues

**Issue**: `Source repository path does not exist`

```kotlin
// Solution: Verify the path exists
iconSync {
    sourceRepositoryPath.set("F:/fluentui-system-icons/assets") // Check this path
}
```

**Issue**: No icons found to sync

```kotlin
// Solution: Check exclusion patterns
iconSync {
    excludePatterns.set(listOf()) // Remove restrictive patterns
}
```

**Issue**: SVG conversion fails

- Ensure `svg2compose` dependency is available
- Check SVG file format and validity
- Review generated temp files for errors

### Debug Tips

1. **Use `checkNewIcons` first** to preview changes
2. **Check log files** for detailed error information
3. **Verify source directory structure** contains `metadata.json` and `SVG/` folders
4. **Review exclusion patterns** that might filter out desired icons

## 🚀 GitHub Actions Integration

### 📋 Complete Weekly Sync Workflow

The plugin includes a comprehensive GitHub Actions workflow for automated weekly icon synchronization. The workflow file is located at `.github/workflows/weekly-icon-sync.yml`.

#### 🎯 Workflow Features

- **📅 Scheduled Runs:** Every Monday at 9:00 AM UTC
- **🔧 Manual Triggers:** Run on-demand with custom options
- **🔍 Smart Detection:** Only creates PRs when new icons are found
- **📊 Comprehensive Reporting:** Detailed sync reports and coverage analysis
- **🎨 Professional PRs:** Rich PR descriptions with previews and technical details
- **🤖 Auto-merge Support:** Optional auto-merge for small updates
- **📢 Notifications:** Extensible notification system

#### 🎮 Manual Workflow Triggers

**Via GitHub UI:**
1. Go to Actions → Weekly Icon Sync
2. Click "Run workflow"
3. Optional inputs:
   - **Force Sync:** Run even if no new icons found
   - **Custom Branch:** Use custom branch name for PR

**Via GitHub CLI:**
```bash
# Basic manual trigger
gh workflow run weekly-icon-sync.yml

# Force sync with custom branch
gh workflow run weekly-icon-sync.yml \
  -f force_sync=true \
  -f custom_branch=feature/custom-icons
```

#### 📊 Workflow Outputs

**Successful Run Example:**
```
🎨 Weekly Icon Sync Summary

📋 Results
- 🔍 Checked for new icons: ✅
- 🏠 New families found: 5
- 🎨 New variants found: 18
- 🔄 Sync performed: true
- ✅ PR Created: #123
- 🔗 PR URL: https://github.com/owner/repo/pull/123

📅 Details
- 🕐 Triggered: schedule
- 🏃 Run ID: 1234567890
- 👤 Actor: github-actions[bot]
- 🌿 Branch: main
```

#### 🎨 Generated Pull Request

The workflow creates comprehensive PRs with:

**📋 PR Title:**
```
🎨 Weekly Icon Sync - 18 New ImageVectors
```

**📝 PR Description Includes:**
- 📊 **Summary Stats:** New families and variants count
- ✨ **What's New:** Detailed list of changes and improvements
- 📂 **Generated Structure:** Directory layout preview
- 🔍 **New Icons Preview:** List of added icons with paths
- 📈 **Coverage Analysis:** Statistics and coverage breakdown
- 🎯 **Collection Strategy:** How icons were selected and processed
- 🚀 **Usage Examples:** Code samples for immediate use
- 🔧 **Technical Details:** Plugin versions and dependencies

**🏷️ Auto-Applied Labels:**
- 🎨 icons
- 🤖 automation  
- 📦 enhancement

#### 🔧 Workflow Configuration

**Environment Variables:**
```yaml
env:
  GRADLE_OPTS: -Dorg.gradle.daemon=false -Dorg.gradle.parallel=true -Dorg.gradle.caching=true
  JAVA_VERSION: '17'
```

**Caching:**
- ✅ Gradle build cache
- ✅ JDK installation cache
- ✅ Gradle home cache cleanup

#### 🎛️ Workflow Jobs

**1. sync-icons (Main Job)**
- 🔍 Check for new icons
- 🎨 Convert SVGs to ImageVectors
- 📈 Analyze coverage
- 🔀 Create pull request
- 📊 Generate summary

**2. notify (Optional)**
- 📢 Send notifications to Slack/Discord/etc.
- 🔔 Only runs when new variants are found
- 🎯 Extensible for custom notification systems

**3. auto-merge (Optional)**
- 🤖 Auto-merge small updates (< 10 variants)
- 🕐 Only for scheduled runs (not manual)
- 🛡️ Safety checks for trusted updates

#### 📢 Adding Notifications

**Slack Integration:**
```yaml
# Add to notify job
- name: Send Slack notification
  run: |
    curl -X POST -H 'Content-type: application/json' \
      --data '{"text":"🎨 Icon sync completed! Added ${{ needs.sync-icons.outputs.new_variants_count }} new variants."}' \
      ${{ secrets.SLACK_WEBHOOK_URL }}
```

**Discord Integration:**
```yaml
- name: Send Discord notification
  uses: Ilshidur/action-discord@master
  with:
    args: '🎨 Weekly icon sync completed! Added ${{ needs.sync-icons.outputs.new_variants_count }} new variants.'
  env:
    DISCORD_WEBHOOK: ${{ secrets.DISCORD_WEBHOOK }}
```

#### 🛡️ Security & Permissions

**Required Permissions:**
- `contents: write` - For creating commits
- `pull-requests: write` - For creating PRs
- `actions: read` - For workflow metadata

**Repository Secrets (Optional):**
- `SLACK_WEBHOOK_URL` - For Slack notifications
- `DISCORD_WEBHOOK` - For Discord notifications
- Custom tokens for other integrations

#### 🎯 Workflow Customization

**Change Schedule:**
```yaml
on:
  schedule:
    - cron: '0 14 * * 3'  # Wednesday at 2 PM UTC
    - cron: '0 9 * * 1'   # Monday at 9 AM UTC (multiple schedules)
```

**Custom Plugin Configuration:**
```yaml
- name: Sync Icons with Custom Config
  run: |
    ./gradlew syncNewIcons -PpreferredSize=20 -PsupportedStyles=filled,regular
```

**Branch Protection:**
```yaml
# Add branch protection to prevent auto-merge on important branches
- name: Check branch protection
  if: github.ref_name == 'main' || github.ref_name == 'production'
  run: echo "Protected branch detected, skipping auto-merge"
```

#### 📈 Monitoring & Analytics

**Workflow Analytics:**
- 📊 Track sync frequency and success rates
- 📈 Monitor icon growth over time
- 🔍 Analyze which styles are most active
- ⏱️ Performance metrics for sync duration

**Custom Metrics:**
```yaml
- name: Record metrics
  run: |
    echo "::notice::Icons synced: ${{ steps.check_icons.outputs.new_variants_count }}"
    echo "::notice::Families added: ${{ steps.check_icons.outputs.new_families_count }}"
    
    # Send to analytics service
    curl -X POST "https://analytics.example.com/metrics" \
      -H "Content-Type: application/json" \
      -d '{"sync_date":"$(date -u +%Y-%m-%d)","new_variants":${{ steps.check_icons.outputs.new_variants_count }}}'
```

#### 🚨 Troubleshooting Workflows

**Common Issues:**

1. **No PR Created Despite New Icons**
   ```yaml
   # Add debug step
   - name: Debug git status
     run: |
       git status
       git diff --name-only
   ```

2. **Gradle Build Failures**
   ```yaml
   # Add validation step
   - name: Validate Gradle setup
     run: |
       ./gradlew --version
       ./gradlew tasks --group="icon management"
   ```

3. **Permission Errors**
   ```yaml
   # Check token permissions
   - name: Check permissions
     run: |
       gh auth status
       gh api user
   ```

#### 🔄 Workflow Updates

To update the workflow:

1. **Edit `.github/workflows/weekly-icon-sync.yml`**
2. **Test changes in a feature branch**
3. **Use workflow_dispatch for testing**
4. **Monitor workflow runs in GitHub Actions tab**

**Version Pinning:**
```yaml
# Pin action versions for stability
uses: actions/checkout@v4.1.1
uses: actions/setup-java@v4.0.0
uses: peter-evans/create-pull-request@v6.0.0
```

The workflow provides a robust, production-ready solution for automated icon management with comprehensive reporting, error handling, and extensibility options.

## 📈 Advanced Usage

### Custom Size Priorities

```kotlin
iconSync {
    preferredSize.set(20)
    sizePreferences.set(
        mapOf(
            20 to 1,    // Highest priority
            24 to 2,
            16 to 3,
            32 to 4,
            28 to 5     // Lowest priority
        )
    )
}
```

### Style-Specific Workflows

```kotlin
// Only sync filled and regular styles
iconSync {
    supportedStyles.set(listOf("filled", "regular"))
}

// Custom exclusions for beta icons
iconSync {
    excludePatterns.set(listOf("beta", "experimental", "deprecated"))
}
```

### Multiple Icon Sources

```kotlin
// Create separate tasks for different sources
tasks.register("syncMaterialIcons") {
    doLast {
        // Custom sync logic for Material Icons
    }
}
```

## 🤝 Contributing

To extend the plugin:

1. **Add new utilities** in `utils/` package
2. **Create custom tasks** in `tasks/` package
3. **Extend models** in `models/` package
4. **Update plugin class** to register new functionality

## 📄 License

This build-logic plugin is part of the FluentUI System Icons project.

---

**Plugin Version**: 1.0.0  
**Kotlin DSL**: Compatible  
**Gradle**: 7.0+ Required  
**Dependencies**: Kotlinx.Serialization, svg2compose, JGit

## 📚 Additional Resources

- **[SETUP.md](SETUP.md)** - Detailed setup instructions for different scenarios
- **[TROUBLESHOOTING.md](TROUBLESHOOTING.md)** - Comprehensive troubleshooting guide
- **[GitHub Issues](https://github.com/microsoft/fluentui-system-icons/issues)** - Report bugs or request features
