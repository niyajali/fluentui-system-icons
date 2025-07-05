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

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import fluent.ui.system.icons.ColorIconList
import fluent.ui.system.icons.FilledIconList
import fluent.ui.system.icons.FluentIcons
import fluent.ui.system.icons.LightIconList
import fluent.ui.system.icons.RegularIconList
import fluent.ui.system.icons.filled.Checkmark
import fluent.ui.system.icons.filled.Code
import fluent.ui.system.icons.filled.Copy
import fluent.ui.system.icons.filled.DarkTheme
import fluent.ui.system.icons.filled.Highlight
import fluent.ui.system.icons.filled.Search
import fluent.ui.system.icons.filled.WeatherSunny
import fluent.ui.system.icons.regular.ArrowDownload
import fluent.ui.system.icons.regular.Fluent
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun ComposeApp(modifier: Modifier = Modifier) {
    var isDarkTheme by rememberSaveable { mutableStateOf(false) }
    var selectedCategory by rememberSaveable { mutableStateOf(IconCategory.ALL) }
    var searchQuery by rememberSaveable { mutableStateOf("") }
    var sortOrder by rememberSaveable { mutableStateOf(SortOrder.ALPHABETICAL) }
    var isLoading by remember { mutableStateOf(true) }

    val windowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
    val isCompact = windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT

    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val clipboardManager = rememberClipboardHelper()

    // Simulate loading and gather all icons
    val allIcons by remember {
        derivedStateOf {
            val coloredIcons = FluentIcons.ColorIconList.map {
                IconItem(
                    icon = it,
                    name = it.name.substringAfter("."),
                    category = IconCategory.COLORED,
                    composeReference = "FluentIcons.${it.name}",
                )
            }
            val regularIcons = FluentIcons.RegularIconList.map {
                IconItem(
                    icon = it,
                    name = it.name.substringAfter("."),
                    category = IconCategory.REGULAR,
                    composeReference = "FluentIcons.${it.name}",
                )
            }
            val filledIcons = FluentIcons.FilledIconList.map {
                IconItem(
                    icon = it,
                    name = it.name.substringAfter("."),
                    category = IconCategory.FILLED,
                    composeReference = "FluentIcons.${it.name}",
                )
            }
            val lightIcons = FluentIcons.LightIconList.map {
                IconItem(
                    icon = it,
                    name = it.name.substringAfter("."),
                    category = IconCategory.LIGHT,
                    composeReference = "FluentIcons.${it.name}",
                )
            }

            (coloredIcons + regularIcons + filledIcons + lightIcons)
        }
    }

    // Filter and sort icons
    val filteredIcons by remember {
        derivedStateOf {
            allIcons
                .filter { icon ->
                    val matchesCategory = selectedCategory == IconCategory.ALL || icon.category == selectedCategory
                    val matchesSearch = searchQuery.isBlank() ||
                            icon.name.contains(searchQuery, ignoreCase = true) ||
                            icon.category.displayName.contains(searchQuery, ignoreCase = true)
                    matchesCategory && matchesSearch
                }
                .let { icons ->
                    when (sortOrder) {
                        SortOrder.ALPHABETICAL -> icons.sortedBy { it.name }
                        SortOrder.CATEGORY -> icons.sortedBy { it.category.ordinal }
                        SortOrder.RECENT -> icons.take(50) // Mock recent behavior
                    }
                }
        }
    }

    LaunchedEffect(Unit) {
        delay(800)
        isLoading = false
    }

    // Handle copying functionality
    fun copyToClipboard(icon: IconItem, format: CopyFormat) {
        clipboardManager.copyIcon(icon, format)
        scope.launch {
            snackbarHostState.showSnackbar("${format.description} copied to clipboard!")
        }
    }

    // Theme wrapper
    MaterialTheme(
        colorScheme = if (isDarkTheme) {
            androidx.compose.material3.darkColorScheme(
                primary = Color(0xFF6366F1),
                secondary = Color(0xFF22C55E),
                tertiary = Color(0xFFF97316),
            )
        } else {
            androidx.compose.material3.lightColorScheme(
                primary = Color(0xFF6366F1),
                secondary = Color(0xFF22C55E),
                tertiary = Color(0xFFF97316),
            )
        },
    ) {
        NavigationSuiteScaffold(
            navigationSuiteItems = {
                IconCategory.entries.forEach { category ->
                    item(
                        icon = {
                            when (category) {
                                IconCategory.ALL -> Icon(FluentIcons.Filled.Copy, null)
                                IconCategory.COLORED -> Icon(
                                    FluentIcons.Filled.Copy,
                                    null,
                                    tint = MaterialTheme.colorScheme.tertiary,
                                )

                                IconCategory.REGULAR -> Icon(FluentIcons.Regular.Fluent, null)
                                IconCategory.FILLED -> Icon(
                                    FluentIcons.Filled.Copy,
                                    null,
                                    tint = MaterialTheme.colorScheme.primary,
                                )

                                IconCategory.LIGHT -> Icon(FluentIcons.Filled.Highlight, null)
                            }
                        },
                        label = { Text(category.displayName) },
                        selected = selectedCategory == category,
                        onClick = { selectedCategory = category },
                    )
                }
            },
            modifier = modifier.fillMaxSize(),
        ) {
            Scaffold(
                topBar = {
                    CenterAlignedTopAppBar(
                        title = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                            ) {
                                Icon(
                                    imageVector = FluentIcons.Regular.Fluent,
                                    contentDescription = null,
                                    modifier = Modifier.size(32.dp),
                                    tint = MaterialTheme.colorScheme.primary,
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(
                                    text = "Fluent UI Icons",
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary,
                                )
                            }
                        },
                        actions = {
                            IconButton(
                                onClick = { isDarkTheme = !isDarkTheme },
                            ) {
                                Icon(
                                    imageVector = if (isDarkTheme) FluentIcons.Filled.WeatherSunny else FluentIcons.Filled.DarkTheme,
                                    contentDescription = "Toggle theme",
                                )
                            }
                        },
                        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                            containerColor = MaterialTheme.colorScheme.surface,
                        ),
                        modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars),
                    )
                },
                snackbarHost = { SnackbarHost(snackbarHostState) },
                modifier = Modifier.fillMaxSize(),
            ) { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .windowInsetsPadding(WindowInsets.navigationBars),
                ) {
                    // Search and filters section
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                    ) {
                        // Search bar
                        SearchBar(
                            query = searchQuery,
                            onQueryChange = { searchQuery = it },
                            modifier = Modifier.fillMaxWidth(),
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Filter chips and stats
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            if (!isCompact) {
                                FlowRow(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    modifier = Modifier.weight(1f),
                                ) {
                                    IconCategory.entries.forEach { category ->
                                        FilterChip(
                                            selected = selectedCategory == category,
                                            onClick = { selectedCategory = category },
                                            label = category.displayName,
                                            count = when (category) {
                                                IconCategory.ALL -> allIcons.size
                                                else -> allIcons.count { it.category == category }
                                            },
                                        )
                                    }
                                }
                            }

                            // Stats
                            AnimatedContent(
                                targetState = if (isLoading) "Loading..." else "Showing ${filteredIcons.size} of ${allIcons.size} icons",
                                transitionSpec = {
                                    fadeIn().togetherWith(fadeOut())
                                },
                            ) { text ->
                                Text(
                                    text = text,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                )
                            }
                        }
                    }

                    // Icons grid
                    if (isLoading) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center,
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                CircularProgressIndicator(
                                    color = MaterialTheme.colorScheme.primary,
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "Loading Fluent Icons...",
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                )
                            }
                        }
                    } else if (filteredIcons.isEmpty()) {
                        NoIconsFound(
                            searchQuery = searchQuery,
                            onClearSearch = { searchQuery = "" },
                            modifier = Modifier.fillMaxSize(),
                        )
                    } else {
                        IconsGrid(
                            icons = filteredIcons,
                            windowSizeClass = windowSizeClass,
                            onCopyCompose = { iconItem ->
                                copyToClipboard(iconItem, CopyFormat.COMPOSE_REFERENCE)
                            },
                            onCopyName = { iconItem ->
                                copyToClipboard(iconItem, CopyFormat.ICON_NAME)
                            },
                            modifier = Modifier.weight(1f),
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Surface(
        shape = RoundedCornerShape(28.dp),
        color = MaterialTheme.colorScheme.surfaceContainerHigh,
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
        ) {
            Icon(
                imageVector = FluentIcons.Filled.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(24.dp),
            )

            Spacer(modifier = Modifier.width(12.dp))

            BasicTextField(
                value = query,
                onValueChange = onQueryChange,
                singleLine = true,
                textStyle = MaterialTheme.typography.bodyLarge.copy(
                    color = MaterialTheme.colorScheme.onSurface,
                ),
                decorationBox = { innerTextField ->
                    if (query.isEmpty()) {
                        Text(
                            text = "Search icons...",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                    innerTextField()
                },
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun FilterChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: String,
    count: Int,
    modifier: Modifier = Modifier,
) {

    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        color = if (selected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceContainerHigh,
        border = if (selected) BorderStroke(2.dp, MaterialTheme.colorScheme.primary) else null,
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                color = if (selected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface,
                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
            )

            Spacer(modifier = Modifier.width(8.dp))

            Surface(
                shape = CircleShape,
                color = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.wrapContentSize(),
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = count.toString(),
                        style = MaterialTheme.typography.labelSmall,
                        color = if (selected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.surface,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(4.dp),
                    )
                }
            }
        }
    }
}

@Composable
private fun IconsGrid(
    icons: List<IconItem>,
    windowSizeClass: WindowSizeClass,
    onCopyCompose: (IconItem) -> Unit,
    onCopyName: (IconItem) -> Unit,
    modifier: Modifier = Modifier,
) {
    val gridState = rememberLazyGridState()
    val columns = when (windowSizeClass.windowWidthSizeClass) {
        WindowWidthSizeClass.COMPACT -> GridCells.Adaptive(minSize = 140.dp)
        WindowWidthSizeClass.MEDIUM -> GridCells.Adaptive(minSize = 160.dp)
        else -> GridCells.Adaptive(minSize = 180.dp)
    }

    LazyVerticalGrid(
        columns = columns,
        state = gridState,
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier,
    ) {
        items(
            items = icons,
            key = { "${it.name}_${it.category}" },
        ) { iconItem ->
            IconCard(
                iconItem = iconItem,
                onCopyCompose = { onCopyCompose(iconItem) },
                onCopyName = { onCopyName(iconItem) },
            )
        }
    }
}

@Composable
private fun IconCard(
    iconItem: IconItem,
    onCopyCompose: () -> Unit,
    onCopyName: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var showCopyFeedback by remember { mutableStateOf(false) }

    LaunchedEffect(showCopyFeedback) {
        if (showCopyFeedback) {
            delay(1500)
            showCopyFeedback = false
        }
    }

    OutlinedCard(
        elevation = CardDefaults.outlinedCardElevation(
            defaultElevation = 2.dp,
            hoveredElevation = 4.dp,
        ),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        modifier = modifier
            .fillMaxWidth()
            .clip(CardDefaults.outlinedShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(),
            ) {
                onCopyCompose()
                showCopyFeedback = true
            },
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                // Icon display area
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = when (iconItem.category) {
                        IconCategory.COLORED -> MaterialTheme.colorScheme.tertiaryContainer
                        IconCategory.REGULAR -> MaterialTheme.colorScheme.primaryContainer
                        IconCategory.FILLED -> MaterialTheme.colorScheme.secondaryContainer
                        IconCategory.LIGHT -> MaterialTheme.colorScheme.surfaceContainerHighest
                        IconCategory.ALL -> MaterialTheme.colorScheme.surfaceContainerHigh
                    },
                    modifier = Modifier.size(72.dp),
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        Icon(
                            imageVector = iconItem.icon,
                            contentDescription = iconItem.name,
                            tint = when (iconItem.category) {
                                IconCategory.COLORED -> Color.Unspecified // Colored icons keep their colors
                                IconCategory.REGULAR -> MaterialTheme.colorScheme.onPrimaryContainer
                                IconCategory.FILLED -> MaterialTheme.colorScheme.onSecondaryContainer
                                IconCategory.LIGHT -> MaterialTheme.colorScheme.onSurface
                                IconCategory.ALL -> MaterialTheme.colorScheme.onSurfaceVariant
                            },
                            modifier = Modifier.size(36.dp),
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Icon name
                Text(
                    text = iconItem.name,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Category badge
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.surfaceContainerHigh,
                ) {
                    Text(
                        text = iconItem.category.displayName,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Copy buttons
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    FilledTonalIconButton(
                        onClick = onCopyCompose,
                        modifier = Modifier.weight(1f),
                    ) {
                        Icon(
                            imageVector = FluentIcons.Filled.Code,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                        )
                    }

                    FilledTonalIconButton(
                        onClick = onCopyName,
                        modifier = Modifier.weight(1f),
                    ) {
                        Icon(
                            imageVector = FluentIcons.Regular.ArrowDownload,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                        )
                    }
                }
            }

            Column(
                modifier = Modifier.align(Alignment.TopEnd),
                horizontalAlignment = Alignment.End,
            ) {
                AnimatedVisibility(
                    visible = showCopyFeedback,
                    enter = scaleIn() + fadeIn(),
                    exit = scaleOut() + fadeOut(),
                ) {
                    Surface(
                        shape = RoundedCornerShape(bottomStart = 8.dp),
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.padding(4.dp),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        ) {
                            Icon(
                                imageVector = FluentIcons.Filled.Checkmark,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onPrimary,
                                modifier = Modifier.size(14.dp),
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Copied!",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onPrimary,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun NoIconsFound(
    searchQuery: String,
    onClearSearch: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(32.dp),
        ) {
            Icon(
                imageVector = FluentIcons.Filled.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                modifier = Modifier.size(64.dp),
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "No icons found",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )

            if (searchQuery.isNotBlank()) {
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Try adjusting your search \"$searchQuery\" or filter criteria",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(16.dp))

                FilledTonalButton(onClick = onClearSearch) {
                    Text("Clear Search")
                }
            }
        }
    }
}