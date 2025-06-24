# Fluent UI System Icons - Compose Multiplatform Gallery

A stunning, modern icon gallery built with **Jetpack Compose Multiplatform** that showcases the complete collection of
Microsoft's Fluent UI System Icons. This app replicates and enhances the functionality of the original HTML gallery with
native mobile and desktop experiences.

## ✨ Features

### 🎨 **Modern Material 3 Design**

- Dynamic color theming with custom Fluent brand colors
- Adaptive layouts that work beautifully on all screen sizes
- Smooth animations and micro-interactions
- Dark/Light theme support with system preference detection

### 🔍 **Powerful Search & Filtering**

- **Smart Search**: Find icons by name, display name, or category
- **Fuzzy Matching**: Handles typos and partial matches intelligently
- **Category Filtering**: Browse by Colored, Regular, Filled, or Light icons
- **Real-time Results**: Instant filtering as you type

### 📱 **Adaptive User Interface**

- **Navigation Suite**: Automatically adapts navigation for different screen sizes
    - Bottom navigation on mobile (compact)
    - Navigation rail on tablets (medium)
    - Navigation drawer on desktop (expanded)
- **Responsive Grid**: Icon grid adapts to screen size with optimal spacing
- **Window Size Classes**: Leverages Android's window size class system

### 💾 **Enhanced Copy Functionality**

- **Compose Reference**: Copy the exact Jetpack Compose icon reference
- **Icon Name**: Copy just the icon name for documentation
- **SVG Export**: Generate and copy SVG markup (planned)
- **Usage Examples**: Copy complete code examples for different frameworks
- **Smart Clipboard**: Cross-platform clipboard management

### 🎯 **Developer-Friendly Features**

- **Icon Statistics**: Shows count of icons per category
- **Category Badges**: Visual indicators for icon types
- **Copy Feedback**: Animated confirmations when copying content
- **No Results State**: Helpful guidance when no icons match filters

## 🏗️ Architecture

### Icon Categories

The app organizes icons into four main categories:

```kotlin
enum class IconCategory {
    ALL,        // Complete collection view
    COLORED,    // Vibrant filled icons with colors
    REGULAR,    // Outline style icons  
    FILLED,     // Solid filled monochrome icons
    LIGHT       // Thin line weight icons
}
```

### Data Structure

Each icon is represented as an `IconItem`:

```kotlin
data class IconItem(
    val icon: ImageVector,           // The actual Compose icon
    val name: String,                // Icon name (e.g., "Settings")
    val category: IconCategory,      // Which category it belongs to
    val composeReference: String     // Full reference (e.g., "FluentIcons.Regular.Settings")
)
```

### Search Algorithm

The search implementation includes:

- **Exact name matching** (highest priority)
- **Partial name matching** with case-insensitive search
- **Display name matching** (handles camelCase to "Display Name" conversion)
- **Category matching** for broad searches
- **Fuzzy matching** using simplified Jaro-Winkler algorithm for typo tolerance

## 🎨 Design System

### Color Palette

The app uses a custom Material 3 color scheme inspired by Fluent Design:

```kotlin
Primary: #6366F1    (Indigo-for primary actions)
Secondary: #22C55E  (Green-for filled icons)
Tertiary: #F97316   (Orange-for colored icons)
```

### Typography

- **Headlines**: For section titles and main content
- **Body Text**: For descriptions and secondary information
- **Labels**: For buttons, chips, and UI components

### Elevation & Shadows

- Cards use adaptive elevation that responds to hover states
- Modern shadow system following Material 3 guidelines
- Smooth elevation transitions with spring animations

## 🔧 Technical Implementation

### Key Dependencies

```kotlin
// Core Compose Multiplatform
implementation(compose.ui)
implementation(compose.runtime)
implementation(compose.foundation)
implementation(compose.material3)

// Adaptive Components
implementation(compose.material3Adaptive)
implementation(compose.material3AdaptiveNavigationSuite)

// Fluent Icons Library
implementation(projects.library)

// Coroutines for async operations
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
```

### Platform-Specific Features

- **Android**: Uses Activity Compose and Window API for adaptive layouts
- **Desktop**: Optimized for mouse interaction and keyboard shortcuts
- **iOS**: Native feel with platform-appropriate navigation patterns
- **Web**: Responsive design that works in browsers

### Performance Optimizations

- **Lazy Loading**: Icons are loaded on-demand in the grid
- **State Management**: Efficient state handling with `derivedStateOf`
- **Memory Management**: Icons lists are cached and reused
- **Smooth Scrolling**: Optimized grid performance with proper keys

## 🚀 Usage Examples

### Basic Icon Usage

```kotlin
// Use any Fluent icon in your Compose UI
Icon(
    imageVector = FluentIcons.Regular.Settings,
    contentDescription = "Settings",
    modifier = Modifier.size(24.dp)
)
```

### Dynamic Icon Selection

```kotlin
// Icons can be selected dynamically based on user choices
val selectedIcon = when (iconCategory) {
    IconCategory.REGULAR -> FluentIcons.Regular.Home
    IconCategory.FILLED -> FluentIcons.Filled.Home
    IconCategory.COLORED -> FluentIcons.Colored.Home
    IconCategory.LIGHT -> FluentIcons.Light.Home
}
```

### Searching Icons Programmatically

```kotlin
// Use the search utilities in your own apps
val searchResults = IconSearchUtils.searchIcons(
    query = "mail",
    category = IconCategory.REGULAR,
    sortOrder = SortOrder.ALPHABETICAL
)
```

## 📱 Supported Platforms

| Platform          | Status         | Notes                            |
|-------------------|----------------|----------------------------------|
| 🤖 Android        | ✅ Full Support | Optimized for mobile and tablets |
| 🖥️ Desktop (JVM) | ✅ Full Support | Windows, macOS, Linux            |
| 🍎 iOS            | ✅ Full Support | iPhone and iPad                  |
| 🌐 Web (JS/WASM)  | ✅ Full Support | Modern browsers                  |

## 🎯 Future Enhancements

### Planned Features

- [ ] **Icon Export**: Export icons as PNG, SVG, or PDF
- [ ] **Custom Collections**: Save favorite icons to custom lists
- [ ] **Icon Usage Analytics**: Track which icons are most copied
- [ ] **Accessibility Improvements**: Enhanced screen reader support
- [ ] **Keyboard Shortcuts**: Power user navigation
- [ ] **Icon Variations**: Show all size variants (16px, 20px, 24px, etc.)
- [ ] **Integration Examples**: Show icons in real UI contexts

### Technical Improvements

- [ ] **Offline Support**: Cache icons for offline browsing
- [ ] **Performance Metrics**: Add performance monitoring
- [ ] **Automated Testing**: Comprehensive test coverage
- [ ] **Documentation**: Interactive API documentation

## 🛠️ Development

### Building the Project

```bash
# Clone the repository
git clone [repository-url]

# Build for all platforms
./gradlew build

# Run Android app
./gradlew :sample:androidApp:installDebug

# Run Desktop app  
./gradlew :sample:desktopApp:run

# Run Web app
./gradlew :sample:webApp:jsBrowserDevelopmentRun
```

### Code Structure

```
sample/shared/src/commonMain/kotlin/com/niyajali/sample/
├── ComposeApp.kt           # Main app composable
├── IconSearchUtils.kt      # Search and filtering logic
├── ClipboardUtils.kt       # Cross-platform clipboard utilities
└── README.md              # This documentation
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Built with ❤️ using Jetpack Compose Multiplatform**

*Experience the complete Fluent UI System Icons collection in a beautiful, native app that works everywhere.*