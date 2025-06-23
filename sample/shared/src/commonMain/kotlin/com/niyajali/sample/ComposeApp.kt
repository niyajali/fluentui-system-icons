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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.ColoredIconList
import fluent.ui.system.icons.FilledIconList
import fluent.ui.system.icons.FluentIcons
import fluent.ui.system.icons.LightIconList
import fluent.ui.system.icons.RegularIconList
import fluent.ui.system.icons.regular.Fluent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeApp(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Fluent Icons",
                        fontWeight = FontWeight.SemiBold,
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                navigationIcon = {
                    Icon(
                        imageVector = FluentIcons.Regular.Fluent,
                        contentDescription = null,
                        modifier = Modifier.size(36.dp),
                    )
                },
            )
        },
        modifier = modifier.fillMaxSize(),
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 56.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            stickyHeader {
                IconStickyHead(name = "Colored")
            }

            items(
                items = FluentIcons.ColoredIconList,
                key = { it.name },
            ) {
                IconBox(
                    icon = it,
                )
            }

            stickyHeader {
                IconStickyHead(name = "Regular")
            }

            items(
                items = FluentIcons.RegularIconList
            ){
                IconBox(
                    icon = it,
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            stickyHeader {
                IconStickyHead(name = "Filled")
            }

            items(
                items = FluentIcons.FilledIconList
            ){
                IconBox(
                    icon = it,
                    tint = MaterialTheme.colorScheme.secondary
                )
            }

            stickyHeader {
                IconStickyHead(name = "Light")
            }

            items(
                items = FluentIcons.LightIconList
            ){
                IconBox(
                    icon = it,
                    tint = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}

@Composable
private fun IconStickyHead(
    modifier: Modifier = Modifier,
    name: String,
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surfaceContainer,
        shape = RoundedCornerShape(4.dp)
    ) {
        Box(
            modifier = modifier.fillMaxWidth().padding(16.dp),
        ) {
            Text(
                text = name,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier,
            )
        }
    }
}

@Composable
private fun IconBox(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    tint: Color = Color.Unspecified,
) {
    ElevatedCard(
        modifier = modifier.size(56.dp),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Settings",
                tint = tint,
                modifier = Modifier
                    .size(36.dp)
                    .align(Alignment.Center),
            )
        }
    }
}