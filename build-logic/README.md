# FluentUI System Icons Plugin

A Gradle plugin for integrating Microsoft's FluentUI System Icons into Jetpack Compose projects. Automatically converts
SVG icons to ImageVectors with intelligent organization and library-safe practices.

## Overview

This plugin provides a seamless workflow for maintaining FluentUI System Icons in Kotlin Multiplatform projects. It
follows a **strictly additive approach** to ensure compatibility with production libraries and existing codebases.

### Key Features

- **Library-Safe Design**: Only adds new icons, never modifies or removes existing ones
- **Multi-Source Support**: Git repository integration or local directory development
- **Smart SVG Processing**: Automatic conversion to Compose ImageVectors
- **Style Organization**: Automatic categorization by filled, regular, light, and color styles
- **Size Optimization**: Intelligent size selection with fallback hierarchy
- **Directional Support**: Proper handling of LTR/RTL icon variants
- **Accurate List Management**: Icon collections rebuilt from actual file contents

## Quick Start

### 1. Plugin Setup

Add to your project's `settings.gradle.kts`:

```kotlin
pluginManagement {
    includeBuild("build-logic")
}
```

Apply in your module's `build.gradle.kts`:

```kotlin
plugins {
    id("fluent.icons")
}
```

### 2. Configuration

```kotlin
fluentIcons {
    // Production: Use Git repository
    gitRepository.set("https://github.com/microsoft/fluentui-system-icons.git")
    gitRef.set("main") // Auto-formatted to refs/heads/main

    // Development: Use local directory (faster)
    // useLocalDirectory.set(true)
    // localDirectoryPath.set("F:/fluentui-system-icons")

    // Target configuration
    targetIconsPath.set("src/commonMain/kotlin/fluent/ui/system/icons")

    // Customization
    preferredSize.set(24)
    supportedStyles.set(listOf("filled", "regular", "light", "color"))
}
```

### 3. Usage

```bash
# Complete workflow (recommended)
./gradlew syncAndUpdateIcons

# Individual operations
./gradlew syncNewIcons     # Sync new icons only
./gradlew updateIconLists  # Rebuild icon lists
./gradlew cleanupIcons     # Analyze consistency
```

## Usage in Code

```kotlin
import fluent.ui.system.icons.FluentIcons

@Composable
fun MyComponent() {
    Icon(
        imageVector = FluentIcons.Filled.AccessTime,
        contentDescription = "Access Time"
    )

    // Access all icons of a style
    val allFilledIcons = FluentIcons.FilledIconList
}
```

## Configuration Reference

### Source Configuration

| Property             | Description                        | Default                   |
|----------------------|------------------------------------|---------------------------|
| `useLocalDirectory`  | Use local directory instead of Git | `false`                   |
| `localDirectoryPath` | Path to local FluentUI repository  | `""`                      |
| `gitRepository`      | Git repository URL                 | Microsoft's FluentUI repo |
| `gitRef`             | Git reference (auto-formatted)     | `"main"`                  |
| `assetsPath`         | Assets directory within source     | `"assets"`                |

### Target Configuration

| Property          | Description                          | Default                                          |
|-------------------|--------------------------------------|--------------------------------------------------|
| `targetIconsPath` | Output directory for generated icons | `"src/commonMain/kotlin/fluent/ui/system/icons"` |
| `preferredSize`   | Primary icon size preference         | `24`                                             |
| `fallbackSizes`   | Size fallback order                  | `[20, 16, 28, 32]`                               |
| `supportedStyles` | Icon styles to process               | `["filled", "regular", "light", "color"]`        |

### Advanced Options

| Property          | Description                   | Default                          |
|-------------------|-------------------------------|----------------------------------|
| `sizePreferences` | Size priority mapping         | `{24:1, 20:2, 16:3, 28:4, 32:5}` |
| `excludePatterns` | Patterns to exclude from sync | `["test", "temp", "draft"]`      |
| `syncLogFile`     | Log file for sync operations  | `"fluent-icons-sync.log"`        |

## Git Reference Handling

The plugin automatically formats Git references:

| Input                  | Formatted Output       | Type              |
|------------------------|------------------------|-------------------|
| `"main"`               | `"refs/heads/main"`    | Branch            |
| `"1.1.305"`            | `"refs/tags/1.1.305"`  | Version tag       |
| `"refs/heads/develop"` | `"refs/heads/develop"` | Already formatted |

## Architecture

### Plugin Components

- **`IconScanner`**: Analyzes source repository and existing icons
- **`SvgConverter`**: Converts SVG files to Compose ImageVectors
- **`GitRepository`**: Manages repository access (Git or local)
- **`UpdateIconListsTask`**: Rebuilds icon collections from actual files

### Processing Workflow

1. **Source Analysis**: Scan FluentUI repository for available icons
2. **Conflict Detection**: Compare with existing icons using normalized names
3. **Additive Sync**: Add only new icons, preserve existing ones
4. **List Reconstruction**: Rebuild icon lists from actual file contents

### Safety Mechanisms

- **Normalization**: Consistent icon name handling (`WiFi1` vs `wifi1`)
- **Conflict Resolution**: Existing icons take precedence
- **File Integrity**: Never modify existing icon implementations
- **Accuracy Validation**: Lists built from actual ImageVector properties

## Examples

### Development Setup

```kotlin
fluentIcons {
    useLocalDirectory.set(true)
    localDirectoryPath.set("/path/to/local/fluentui-system-icons")
    targetIconsPath.set("src/commonMain/kotlin/icons")
}
```

### Production Configuration

```kotlin
fluentIcons {
    gitRepository.set("https://github.com/microsoft/fluentui-system-icons.git")
    gitRef.set("1.1.305") // Specific version
    preferredSize.set(20)
    supportedStyles.set(listOf("filled", "regular"))
}
```

### CI/CD Integration

```yaml
- name: Sync FluentUI Icons
  run: ./gradlew syncAndUpdateIcons

- name: Check for changes
  run: |
    if [[ -n $(git status --porcelain) ]]; then
      git add -A
      git commit -m "feat: sync new FluentUI icons"
    fi
```

## Output Structure

```
src/commonMain/kotlin/fluent/ui/system/icons/
├── filled/
│   ├── AccessTime.kt
│   └── Calendar.kt
├── regular/
│   ├── AccessTime.kt
│   └── Calendar.kt
├── light/
│   └── AccessTime.kt
├── color/
│   └── Calendar.kt
├── FilledIconList.kt
├── RegularIconList.kt
├── LightIconList.kt
└── ColorIconList.kt
```

## Troubleshooting

### Common Issues

**No new icons detected**

```bash
./gradlew checkNewIcons --rerun-tasks
```

**Icon list inconsistencies**

```bash
./gradlew cleanupIcons
```

**Git clone failures**

- Verify network connectivity and repository access
- Check Git installation and credentials

**Build configuration errors**

```bash
./gradlew tasks --group="fluent icons"
```

### Performance Optimization

- Use `useLocalDirectory.set(true)` for faster development iteration
- Configure `excludePatterns` to skip unnecessary icon families
- Use specific `gitRef` versions for reproducible builds

## Requirements

- **Gradle**: 7.0+
- **Kotlin**: 1.9+
- **Dependencies**: svg2compose, JGit, KotlinPoet
- **Platform**: Kotlin Multiplatform with Compose support

## License

Icons are licensed under MIT by Microsoft Corporation.
Plugin code is licensed under MIT.

---

**Plugin Version**: 2.1.0  
**Kotlin DSL**: Compatible  
**Source Repository**: [Microsoft FluentUI System Icons](https://github.com/microsoft/fluentui-system-icons)
