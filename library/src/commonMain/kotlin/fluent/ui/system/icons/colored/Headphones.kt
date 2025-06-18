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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Headphones: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Headphones",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(-3.429f, 3f),
                end = Offset(-0.856f, 13.052f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(12f, 4f)
            curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
            verticalLineTo(14f)
            lineTo(3f, 15f)
            lineTo(2f, 14f)
            verticalLineTo(12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            verticalLineTo(14f)
            lineTo(21f, 15f)
            lineTo(20f, 14f)
            verticalLineTo(12f)
            curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(17.75f, 14f),
                end = Offset(17.75f, 22f),
            ),
        ) {
            moveTo(3.5f, 14f)
            verticalLineTo(21.599f)
            curveTo(3.941f, 21.854f, 4.454f, 22f, 5f, 22f)
            horizontalLineTo(8f)
            curveTo(8.552f, 22f, 9f, 21.552f, 9f, 21f)
            verticalLineTo(15f)
            curveTo(9f, 14.448f, 8.552f, 14f, 8f, 14f)
            horizontalLineTo(3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(17.75f, 14f),
                end = Offset(17.75f, 22f),
            ),
        ) {
            moveTo(20.5f, 21.599f)
            verticalLineTo(14f)
            horizontalLineTo(16f)
            curveTo(15.448f, 14f, 15f, 14.448f, 15f, 15f)
            verticalLineTo(21f)
            curveTo(15f, 21.552f, 15.448f, 22f, 16f, 22f)
            horizontalLineTo(19f)
            curveTo(19.546f, 22f, 20.059f, 21.854f, 20.5f, 21.599f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB),
                ),
                start = Offset(3f, 14f),
                end = Offset(3f, 21.829f),
            ),
        ) {
            moveTo(2f, 19f)
            curveTo(2f, 20.306f, 2.835f, 21.417f, 4f, 21.829f)
            verticalLineTo(14f)
            horizontalLineTo(2f)
            verticalLineTo(19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB),
                ),
                start = Offset(3f, 14f),
                end = Offset(3f, 21.829f),
            ),
        ) {
            moveTo(22f, 19f)
            curveTo(22f, 20.306f, 21.165f, 21.417f, 20f, 21.829f)
            verticalLineTo(14f)
            horizontalLineTo(22f)
            verticalLineTo(19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadphonesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Headphones, contentDescription = null)
    }
}
