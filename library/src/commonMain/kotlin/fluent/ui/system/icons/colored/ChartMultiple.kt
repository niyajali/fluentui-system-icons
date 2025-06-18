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

public val FluentIcons.Colored.ChartMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ChartMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    1f to Color(0xFFEA71EF),
                ),
                start = Offset(18.091f, 21.418f),
                end = Offset(-0.127f, 3.366f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(10f, 4.016f)
            curveTo(10.275f, 3.998f, 10.5f, 4.224f, 10.5f, 4.5f)
            verticalLineTo(10.5f)
            curveTo(10.5f, 11.052f, 10.948f, 11.5f, 11.5f, 11.5f)
            lineTo(17.5f, 11.5f)
            curveTo(17.776f, 11.5f, 18.002f, 11.724f, 17.984f, 12f)
            curveTo(17.726f, 15.909f, 14.474f, 19f, 10.5f, 19f)
            curveTo(6.358f, 19f, 3f, 15.642f, 3f, 11.5f)
            curveTo(3f, 7.526f, 6.091f, 4.274f, 10f, 4.016f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF30116E),
                    0.75f to Color(0x0030116E),
                ),
                center = Offset(13.306f, 19f),
                radius = 3.861f,
            ),
            fillAlpha = 0.4f,
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(10f, 4.016f)
            curveTo(10.275f, 3.998f, 10.5f, 4.224f, 10.5f, 4.5f)
            verticalLineTo(10.5f)
            curveTo(10.5f, 11.052f, 10.948f, 11.5f, 11.5f, 11.5f)
            lineTo(17.5f, 11.5f)
            curveTo(17.776f, 11.5f, 18.002f, 11.724f, 17.984f, 12f)
            curveTo(17.726f, 15.909f, 14.474f, 19f, 10.5f, 19f)
            curveTo(6.358f, 19f, 3f, 15.642f, 3f, 11.5f)
            curveTo(3f, 7.526f, 6.091f, 4.274f, 10f, 4.016f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF30116E),
                    1f to Color(0x0030116E),
                ),
                center = Offset(17.17f, 17.07f),
                radius = 3.861f,
            ),
            fillAlpha = 0.4f,
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(10f, 4.016f)
            curveTo(10.275f, 3.998f, 10.5f, 4.224f, 10.5f, 4.5f)
            verticalLineTo(10.5f)
            curveTo(10.5f, 11.052f, 10.948f, 11.5f, 11.5f, 11.5f)
            lineTo(17.5f, 11.5f)
            curveTo(17.776f, 11.5f, 18.002f, 11.724f, 17.984f, 12f)
            curveTo(17.726f, 15.909f, 14.474f, 19f, 10.5f, 19f)
            curveTo(6.358f, 19f, 3f, 15.642f, 3f, 11.5f)
            curveTo(3f, 7.526f, 6.091f, 4.274f, 10f, 4.016f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE23CB4),
                    1f to Color(0xFFEA71EF),
                ),
                start = Offset(20.333f, 7.533f),
                end = Offset(19.974f, 0.71f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(20f, 9.402f)
            verticalLineTo(9.455f)
            curveTo(20f, 9.483f, 20f, 9.51f, 19.999f, 9.537f)
            curveTo(19.996f, 9.799f, 19.776f, 10f, 19.515f, 10f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 10f, 12f, 9.776f, 12f, 9.5f)
            verticalLineTo(2.485f)
            curveTo(12f, 2.224f, 12.201f, 2.005f, 12.463f, 2.001f)
            curveTo(12.499f, 2f, 12.535f, 2f, 12.571f, 2f)
            curveTo(16.665f, 2f, 19.986f, 5.312f, 20f, 9.402f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF16BBDA),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(22.605f, 8.621f),
                end = Offset(30.398f, 12.589f),
            ),
        ) {
            moveTo(21.5f, 12f)
            curveTo(20.672f, 12f, 20f, 12.672f, 20f, 13.5f)
            verticalLineTo(21.5f)
            curveTo(20f, 22.328f, 20.672f, 23f, 21.5f, 23f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(13.5f)
            curveTo(23f, 12.672f, 22.328f, 12f, 21.5f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF16BBDA),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(16.75f, 15.571f),
                end = Offset(21.913f, 19.079f),
            ),
        ) {
            moveTo(16f, 16.5f)
            curveTo(16f, 15.672f, 16.672f, 15f, 17.5f, 15f)
            curveTo(18.328f, 15f, 19f, 15.672f, 19f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(19f, 22.328f, 18.328f, 23f, 17.5f, 23f)
            curveTo(16.672f, 23f, 16f, 22.328f, 16f, 21.5f)
            verticalLineTo(16.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF16BBDA),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(12.75f, 18f),
                end = Offset(15.361f, 20.888f),
            ),
        ) {
            moveTo(13.5f, 18f)
            curveTo(12.672f, 18f, 12f, 18.672f, 12f, 19.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            curveTo(14.328f, 23f, 15f, 22.328f, 15f, 21.5f)
            verticalLineTo(19.5f)
            curveTo(15f, 18.672f, 14.328f, 18f, 13.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChartMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ChartMultiple, contentDescription = null)
    }
}
