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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Headset: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Headset",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(8.917f, 18.333f),
                end = Offset(7.821f, 14.887f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(5f, 16f)
            lineTo(6f, 15f)
            lineTo(7f, 16f)
            curveTo(7f, 17.105f, 7.895f, 18f, 9f, 18f)
            horizontalLineTo(11f)
            verticalLineTo(20f)
            horizontalLineTo(9f)
            curveTo(6.791f, 20f, 5f, 18.209f, 5f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(13.688f, 20.938f),
                end = Offset(9.876f, 18.711f),
            ),
        ) {
            moveTo(14.25f, 19.25f)
            curveTo(14.25f, 20.493f, 13.243f, 21.5f, 12f, 21.5f)
            curveTo(10.757f, 21.5f, 9.75f, 20.493f, 9.75f, 19.25f)
            curveTo(9.75f, 18.007f, 10.757f, 17f, 12f, 17f)
            curveTo(13.243f, 17f, 14.25f, 18.007f, 14.25f, 19.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(-0f, 2f),
                end = Offset(4.18f, 12.89f),
            ),
        ) {
            moveTo(17f, 9f)
            verticalLineTo(10f)
            lineTo(18f, 11f)
            lineTo(19f, 10f)
            verticalLineTo(9f)
            curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
            curveTo(8.134f, 2f, 5f, 5.134f, 5f, 9f)
            verticalLineTo(10f)
            lineTo(6f, 11f)
            lineTo(7f, 10f)
            verticalLineTo(9f)
            curveTo(7f, 6.239f, 9.239f, 4f, 12f, 4f)
            curveTo(14.761f, 4f, 17f, 6.239f, 17f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(16.25f, 10f),
                end = Offset(16.25f, 16f),
            ),
        ) {
            moveTo(9f, 10f)
            horizontalLineTo(7f)
            lineTo(6f, 13f)
            lineTo(7f, 16f)
            horizontalLineTo(9f)
            curveTo(9.552f, 16f, 10f, 15.552f, 10f, 15f)
            verticalLineTo(11f)
            curveTo(10f, 10.448f, 9.552f, 10f, 9f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(16.25f, 10f),
                end = Offset(16.25f, 16f),
            ),
        ) {
            moveTo(15f, 16f)
            lineTo(17f, 16f)
            lineTo(18f, 13f)
            lineTo(17f, 10f)
            horizontalLineTo(15f)
            curveTo(14.448f, 10f, 14f, 10.448f, 14f, 11f)
            verticalLineTo(15f)
            curveTo(14f, 15.552f, 14.448f, 16f, 15f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB),
                ),
                start = Offset(17.833f, 10f),
                end = Offset(17.003f, 15.883f),
            ),
        ) {
            moveTo(7f, 10f)
            horizontalLineTo(5f)
            verticalLineTo(16f)
            horizontalLineTo(7f)
            verticalLineTo(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB),
                ),
                start = Offset(17.833f, 10f),
                end = Offset(17.003f, 15.883f),
            ),
        ) {
            moveTo(19f, 10f)
            horizontalLineTo(17f)
            verticalLineTo(16f)
            curveTo(18.105f, 16f, 19f, 15.105f, 19f, 14f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadsetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Headset, contentDescription = null)
    }
}
