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

public val FluentUi.Colored.Home: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Home",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02),
                ),
                start = Offset(12f, 13f),
                end = Offset(6.707f, 21.825f),
            ),
        ) {
            moveTo(9f, 13f)
            horizontalLineTo(15f)
            verticalLineTo(21f)
            horizontalLineTo(9f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357),
                ),
                start = Offset(4.718f, 3.172f),
                end = Offset(21.568f, 17.673f),
            ),
        ) {
            moveTo(13.451f, 4.533f)
            curveTo(12.613f, 3.826f, 11.387f, 3.826f, 10.549f, 4.533f)
            lineTo(3.799f, 10.228f)
            curveTo(3.292f, 10.655f, 3f, 11.285f, 3f, 11.948f)
            verticalLineTo(19.253f)
            curveTo(3f, 20.219f, 3.783f, 21.003f, 4.75f, 21.003f)
            horizontalLineTo(7.75f)
            horizontalLineTo(9.5f)
            verticalLineTo(15.25f)
            curveTo(9.5f, 14.571f, 10.042f, 14.018f, 10.717f, 14f)
            horizontalLineTo(13.283f)
            curveTo(13.958f, 14.018f, 14.5f, 14.571f, 14.5f, 15.25f)
            verticalLineTo(21.003f)
            horizontalLineTo(16.25f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 21.003f, 21f, 20.219f, 21f, 19.253f)
            verticalLineTo(11.948f)
            curveTo(21f, 11.285f, 20.708f, 10.655f, 20.201f, 10.228f)
            lineTo(13.451f, 4.533f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824),
                ),
                start = Offset(8.768f, -0.375f),
                end = Offset(13.162f, 11.505f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(12.804f, 2.299f)
            curveTo(12.345f, 1.9f, 11.655f, 1.9f, 11.196f, 2.299f)
            lineTo(2.407f, 9.928f)
            curveTo(1.907f, 10.363f, 1.861f, 11.112f, 2.305f, 11.601f)
            curveTo(2.75f, 12.091f, 3.516f, 12.136f, 4.016f, 11.701f)
            lineTo(12f, 4.77f)
            lineTo(19.984f, 11.701f)
            curveTo(20.484f, 12.136f, 21.25f, 12.091f, 21.694f, 11.601f)
            curveTo(22.139f, 11.112f, 22.093f, 10.363f, 21.593f, 9.928f)
            lineTo(12.804f, 2.299f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824),
                ),
                start = Offset(8.768f, -0.375f),
                end = Offset(13.162f, 11.505f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11.196f, 2.299f)
            curveTo(11.655f, 1.9f, 12.345f, 1.9f, 12.804f, 2.299f)
            lineTo(21.593f, 9.928f)
            curveTo(22.093f, 10.363f, 22.139f, 11.112f, 21.694f, 11.601f)
            curveTo(21.25f, 12.091f, 20.484f, 12.136f, 19.984f, 11.701f)
            lineTo(12f, 4.77f)
            lineTo(4.016f, 11.701f)
            curveTo(3.516f, 12.136f, 2.75f, 12.091f, 2.305f, 11.601f)
            curveTo(1.861f, 11.112f, 1.907f, 10.363f, 2.407f, 9.928f)
            lineTo(11.196f, 2.299f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Home, contentDescription = null)
    }
}
