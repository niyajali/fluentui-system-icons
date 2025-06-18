/**
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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Camera: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Camera",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-1.125f, 3.267f),
                radius = 29.862f
            )
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(7f)
            lineTo(8.332f, 3.002f)
            curveTo(8.749f, 2.376f, 9.452f, 2f, 10.204f, 2f)
            lineTo(13.796f, 2f)
            curveTo(14.548f, 2f, 15.251f, 2.376f, 15.668f, 3.002f)
            lineTo(17f, 5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(8.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                center = Offset(14.5f, 14.091f),
                radius = 6.927f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(7f)
            lineTo(8.332f, 3.002f)
            curveTo(8.749f, 2.376f, 9.452f, 2f, 10.204f, 2f)
            lineTo(13.796f, 2f)
            curveTo(14.548f, 2f, 15.251f, 2.376f, 15.668f, 3.002f)
            lineTo(17f, 5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(8.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFDECBFF)
                ),
                start = Offset(9.193f, 8f),
                end = Offset(13.693f, 18.688f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 17f)
            curveTo(14.485f, 17f, 16.5f, 14.985f, 16.5f, 12.5f)
            curveTo(16.5f, 10.015f, 14.485f, 8f, 12f, 8f)
            curveTo(9.515f, 8f, 7.5f, 10.015f, 7.5f, 12.5f)
            curveTo(7.5f, 14.985f, 9.515f, 17f, 12f, 17f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.243f to Color(0xFF3BD5FF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(8f, 8f),
                radius = 8.515f
            )
        ) {
            moveTo(15f, 12.5f)
            curveTo(15f, 14.157f, 13.657f, 15.5f, 12f, 15.5f)
            curveTo(10.343f, 15.5f, 9f, 14.157f, 9f, 12.5f)
            curveTo(9f, 10.843f, 10.343f, 9.5f, 12f, 9.5f)
            curveTo(13.657f, 9.5f, 15f, 10.843f, 15f, 12.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    1f to Color(0xFFF462AB)
                ),
                start = Offset(17f, 7.75f),
                end = Offset(20f, 10f)
            )
        ) {
            moveTo(18.5f, 10f)
            curveTo(19.328f, 10f, 20f, 9.328f, 20f, 8.5f)
            curveTo(20f, 7.672f, 19.328f, 7f, 18.5f, 7f)
            curveTo(17.672f, 7f, 17f, 7.672f, 17f, 8.5f)
            curveTo(17f, 9.328f, 17.672f, 10f, 18.5f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CameraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Camera, contentDescription = null)
    }
}
