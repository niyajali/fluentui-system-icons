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

package com.niyajali.sample

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString

/**
 * Enhanced clipboard utilities for cross-platform icon copying
 * Supports multiple copy formats and provides user feedback
 */
object ClipboardUtils {
    
    /**
     * Generate SVG code for an icon (mock implementation for demo)
     * In a real implementation, this would extract the actual SVG path data
     */
    fun generateSvgCode(iconItem: IconItem): String {
        return """
            <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                <!-- ${iconItem.name} icon from Fluent UI System Icons -->
                <!-- Category: ${iconItem.category.displayName} -->
                <path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2z" fill="currentColor"/>
            </svg>
        """.trimIndent()
    }
    
    /**
     * Generate Compose usage example
     */
    fun generateComposeUsage(iconItem: IconItem): String {
        return """
            // ${iconItem.name} - ${iconItem.category.displayName} icon
            import ${iconItem.composeReference.replace(".", ".").lowercase()}
            
            Icon(
                imageVector = ${iconItem.composeReference},
                contentDescription = "${iconItem.name.formatDisplayName()}",
                modifier = Modifier.size(24.dp)
            )
        """.trimIndent()
    }
    
    /**
     * Generate React/HTML usage example
     */
    fun generateReactUsage(iconItem: IconItem): String {
        val componentName = iconItem.name + "Icon"
        return """
            // ${iconItem.name} - ${iconItem.category.displayName} icon
            import { ${componentName} } from '@fluentui/react-icons';
            
            <${componentName} 
                primaryFill="currentColor" 
                aria-hidden="true" 
                style={{ fontSize: '24px' }}
            />
        """.trimIndent()
    }
    
    /**
     * Generate CSS class name for web usage
     */
    fun generateCssClass(iconItem: IconItem): String {
        val cssName = iconItem.name.replace("([a-z])([A-Z])".toRegex(), "$1-$2").lowercase()
        return "fluent-icon-${iconItem.category.name.lowercase()}-$cssName"
    }
    
    /**
     * Generate comprehensive icon information
     */
    fun generateIconInfo(iconItem: IconItem): String {
        return """
            ## ${iconItem.name.formatDisplayName()}
            
            **Category:** ${iconItem.category.displayName}
            **Icon Name:** ${iconItem.name}
            **Compose Reference:** ${iconItem.composeReference}
            **CSS Class:** ${generateCssClass(iconItem)}
            
            ### Usage Examples:
            
            #### Jetpack Compose
            ```kotlin
            ${generateComposeUsage(iconItem)}
            ```
            
            #### React
            ```jsx
            ${generateReactUsage(iconItem)}
            ```
            
            #### SVG
            ```xml
            ${generateSvgCode(iconItem)}
            ```
        """.trimIndent()
    }
}

/**
 * Copy format types for different use cases
 */
enum class CopyFormat(
    val displayName: String,
    val description: String
) {
    COMPOSE_REFERENCE("Compose Reference", "Icon reference for Jetpack Compose"),
    ICON_NAME("Icon Name", "Just the icon name"),
    SVG_CODE("SVG Code", "Complete SVG markup"),
    COMPOSE_USAGE("Compose Usage", "Full Compose usage example"),
    REACT_USAGE("React Usage", "React component usage"),
    CSS_CLASS("CSS Class", "CSS class name"),
    FULL_INFO("Full Info", "Complete documentation")
}

/**
 * Composable function to get clipboard manager and provide copy functionality
 */
@Composable
fun rememberClipboardHelper(): ClipboardHelper {
    val clipboardManager = LocalClipboardManager.current
    return ClipboardHelper(clipboardManager)
}

/**
 * Helper class for clipboard operations with different formats
 */
class ClipboardHelper(
    private val clipboardManager: androidx.compose.ui.platform.ClipboardManager
) {
    
    fun copyIcon(iconItem: IconItem, format: CopyFormat) {
        val content = when (format) {
            CopyFormat.COMPOSE_REFERENCE -> iconItem.composeReference
            CopyFormat.ICON_NAME -> iconItem.name
            CopyFormat.SVG_CODE -> ClipboardUtils.generateSvgCode(iconItem)
            CopyFormat.COMPOSE_USAGE -> ClipboardUtils.generateComposeUsage(iconItem)
            CopyFormat.REACT_USAGE -> ClipboardUtils.generateReactUsage(iconItem)
            CopyFormat.CSS_CLASS -> ClipboardUtils.generateCssClass(iconItem)
            CopyFormat.FULL_INFO -> ClipboardUtils.generateIconInfo(iconItem)
        }
        
        clipboardManager.setText(AnnotatedString(content))
    }
}

/**
 * Extension function for quick copying
 */
fun androidx.compose.ui.platform.ClipboardManager.copyIconReference(iconItem: IconItem) {
    setText(AnnotatedString(iconItem.composeReference))
}

fun androidx.compose.ui.platform.ClipboardManager.copyIconName(iconItem: IconItem) {
    setText(AnnotatedString(iconItem.name))
}

fun androidx.compose.ui.platform.ClipboardManager.copyIconSvg(iconItem: IconItem) {
    setText(AnnotatedString(ClipboardUtils.generateSvgCode(iconItem)))
}