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

import androidx.compose.ui.graphics.vector.ImageVector
import fluent.ui.system.icons.*

/**
 * Utility object for searching and managing Fluent UI System Icons
 * Provides comprehensive search functionality with smart filtering
 */
object IconSearchUtils {
    
    /**
     * Get all available icons organized by category
     */
    fun getAllIcons(): Map<IconCategory, List<IconItem>> {
        return mapOf(
            IconCategory.COLORED to FluentIcons.ColoredIconList.mapToIconItems(IconCategory.COLORED),
            IconCategory.REGULAR to FluentIcons.RegularIconList.mapToIconItems(IconCategory.REGULAR),
            IconCategory.FILLED to FluentIcons.FilledIconList.mapToIconItems(IconCategory.FILLED),
            IconCategory.LIGHT to FluentIcons.LightIconList.mapToIconItems(IconCategory.LIGHT)
        )
    }
    
    /**
     * Get all icons as a flat list with no duplicates (by name)
     */
    fun getAllIconsFlat(): List<IconItem> {
        return getAllIcons().values.flatten().distinctBy { it.name }
    }
    
    /**
     * Search icons with advanced filtering options
     */
    fun searchIcons(
        query: String,
        category: IconCategory = IconCategory.ALL,
        sortOrder: SortOrder = SortOrder.ALPHABETICAL
    ): List<IconItem> {
        val allIcons = getAllIconsFlat()
        
        return allIcons
            .filter { icon ->
                val matchesCategory = category == IconCategory.ALL || icon.category == category
                val matchesSearch = query.isBlank() || matchesSearchQuery(icon, query)
                matchesCategory && matchesSearch
            }
            .let { icons ->
                when (sortOrder) {
                    SortOrder.ALPHABETICAL -> icons.sortedBy { it.name }
                    SortOrder.CATEGORY -> icons.sortedWith(
                        compareBy<IconItem> { it.category.ordinal }.thenBy { it.name }
                    )
                    SortOrder.RECENT -> icons.shuffled().take(50) // Mock recent behavior
                }
            }
    }
    
    /**
     * Check if an icon matches a search query using multiple criteria
     */
    private fun matchesSearchQuery(icon: IconItem, query: String): Boolean {
        val normalizedQuery = query.lowercase().trim()
        
        return when {
            // Exact name match (highest priority)
            icon.name.lowercase() == normalizedQuery -> true
            
            // Name contains query
            icon.name.lowercase().contains(normalizedQuery) -> true
            
            // Formatted name contains query (handles camelCase conversion)
            icon.name.formatDisplayName().lowercase().contains(normalizedQuery) -> true
            
            // Category name match
            icon.category.displayName.lowercase().contains(normalizedQuery) -> true
            
            // Fuzzy matching for common misspellings/variations
            fuzzyMatch(icon.name.lowercase(), normalizedQuery) -> true
            
            else -> false
        }
    }
    
    /**
     * Simple fuzzy matching for better search experience
     */
    private fun fuzzyMatch(iconName: String, query: String): Boolean {
        if (query.length < 3) return false
        
        // Remove common word separators for matching
        val cleanIconName = iconName.replace(Regex("[_\\-\\s]"), "")
        val cleanQuery = query.replace(Regex("[_\\-\\s]"), "")
        
        return cleanIconName.contains(cleanQuery) || 
               calculateSimilarity(cleanIconName, cleanQuery) > 0.7
    }
    
    /**
     * Calculate string similarity using Jaro-Winkler algorithm (simplified)
     */
    private fun calculateSimilarity(s1: String, s2: String): Double {
        if (s1 == s2) return 1.0
        if (s1.isEmpty() || s2.isEmpty()) return 0.0
        
        val maxDistance = maxOf(s1.length, s2.length) / 2 - 1
        if (maxDistance < 1) return 0.0
        
        var matches = 0
        val s1Matches = BooleanArray(s1.length)
        val s2Matches = BooleanArray(s2.length)
        
        // Find matches
        for (i in s1.indices) {
            val start = maxOf(0, i - maxDistance)
            val end = minOf(i + maxDistance + 1, s2.length)
            
            for (j in start until end) {
                if (s2Matches[j] || s1[i] != s2[j]) continue
                s1Matches[i] = true
                s2Matches[j] = true
                matches++
                break
            }
        }
        
        if (matches == 0) return 0.0
        
        // Calculate transpositions
        var transpositions = 0
        var k = 0
        for (i in s1.indices) {
            if (!s1Matches[i]) continue
            while (!s2Matches[k]) k++
            if (s1[i] != s2[k]) transpositions++
            k++
        }
        
        val jaro = (matches.toDouble() / s1.length + 
                   matches.toDouble() / s2.length + 
                   (matches - transpositions / 2.0) / matches) / 3.0
        
        return jaro
    }
    
    /**
     * Get popular/featured icons for the home screen
     */
    fun getFeaturedIcons(): List<IconItem> {
        val allIcons = getAllIconsFlat()
        val featuredNames = setOf(
            "Settings", "Home", "Search", "Person", "Mail", "Calendar", "Camera", 
            "Phone", "Heart", "Star", "Add", "Edit", "Delete", "Share", "Copy",
            "Save", "Send", "Download", "Upload", "Refresh", "Play", "Pause",
            "Stop", "Next", "Previous", "Check", "Close", "More", "Menu"
        )
        
        return allIcons.filter { it.name in featuredNames }
    }
    
    /**
     * Get icon statistics for display
     */
    fun getIconStatistics(): IconStatistics {
        val iconsByCategory = getAllIcons()
        
        return IconStatistics(
            totalIcons = iconsByCategory.values.sumOf { it.size },
            coloredCount = iconsByCategory[IconCategory.COLORED]?.size ?: 0,
            regularCount = iconsByCategory[IconCategory.REGULAR]?.size ?: 0,
            filledCount = iconsByCategory[IconCategory.FILLED]?.size ?: 0,
            lightCount = iconsByCategory[IconCategory.LIGHT]?.size ?: 0,
            uniqueIcons = getAllIconsFlat().size
        )
    }
}

/**
 * Extension function to convert ImageVector list to IconItem list
 */
private fun List<ImageVector>.mapToIconItems(category: IconCategory): List<IconItem> {
    return this.map { icon ->
        IconItem(
            icon = icon,
            name = icon.name,
            category = category,
            composeReference = "FluentIcons.${category.name.lowercase().replaceFirstChar { it.uppercase() }}.${icon.name}"
        )
    }
}

/**
 * Extension function to format icon names for display
 */
fun String.formatDisplayName(): String {
    return this.replace("([a-z])([A-Z])".toRegex(), "$1 $2")
        .split("_", "-")
        .joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }
}

/**
 * Data class for icon statistics
 */
data class IconStatistics(
    val totalIcons: Int,
    val coloredCount: Int,
    val regularCount: Int,
    val filledCount: Int,
    val lightCount: Int,
    val uniqueIcons: Int
)

/**
 * Extension function to get category color
 */
fun IconCategory.getThemeColor(): androidx.compose.ui.graphics.Color {
    return when (this) {
        IconCategory.ALL -> androidx.compose.ui.graphics.Color(0xFF6B7280)
        IconCategory.COLORED -> androidx.compose.ui.graphics.Color(0xFFF97316)
        IconCategory.REGULAR -> androidx.compose.ui.graphics.Color(0xFF6366F1)
        IconCategory.FILLED -> androidx.compose.ui.graphics.Color(0xFF22C55E)
        IconCategory.LIGHT -> androidx.compose.ui.graphics.Color(0xFF8B5CF6)
    }
}