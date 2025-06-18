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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Database: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Database",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF367AF2),
                ),
                start = Offset(7.777f, 2.396f),
                end = Offset(16.435f, 20.577f),
            ),
        ) {
            moveTo(18.328f, 7.117f)
            curveTo(18.916f, 6.823f, 19.498f, 6.451f, 20f, 6f)
            verticalLineTo(18f)
            curveTo(20f, 20.209f, 16.418f, 22f, 12f, 22f)
            curveTo(7.582f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(6f)
            curveTo(4.502f, 6.451f, 5.084f, 6.823f, 5.672f, 7.117f)
            curveTo(7.369f, 7.965f, 9.608f, 8.447f, 12f, 8.447f)
            curveTo(14.392f, 8.447f, 16.631f, 7.965f, 18.328f, 7.117f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.533f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8),
                ),
                start = Offset(14.476f, 7.965f),
                end = Offset(17.647f, 23.721f),
            ),
            fillAlpha = 0.7f,
        ) {
            moveTo(18.328f, 7.117f)
            curveTo(18.916f, 6.823f, 19.498f, 6.451f, 20f, 6f)
            verticalLineTo(18f)
            curveTo(20f, 20.209f, 16.418f, 22f, 12f, 22f)
            curveTo(7.582f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(6f)
            curveTo(4.502f, 6.451f, 5.084f, 6.823f, 5.672f, 7.117f)
            curveTo(7.369f, 7.965f, 9.608f, 8.447f, 12f, 8.447f)
            curveTo(14.392f, 8.447f, 16.631f, 7.965f, 18.328f, 7.117f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF58AAFE),
                    1f to Color(0xFF6CE0FF),
                ),
                start = Offset(26f, 14f),
                end = Offset(16.755f, -2.828f),
            ),
        ) {
            moveTo(12f, 10f)
            curveTo(16.418f, 10f, 20f, 8.209f, 20f, 6f)
            curveTo(20f, 3.791f, 16.418f, 2f, 12f, 2f)
            curveTo(7.582f, 2f, 4f, 3.791f, 4f, 6f)
            curveTo(4f, 8.209f, 7.582f, 10f, 12f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Database, contentDescription = null)
    }
}
