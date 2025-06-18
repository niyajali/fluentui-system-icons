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

public val FluentUi.Colored.ClockAlarm: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ClockAlarm",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(22.21f, 9.37f),
                end = Offset(15.208f, 3.641f),
            ),
        ) {
            moveTo(20.097f, 9.407f)
            curveTo(21.239f, 8.702f, 22f, 7.44f, 22f, 6f)
            curveTo(22f, 3.791f, 20.209f, 2f, 18f, 2f)
            curveTo(16.56f, 2f, 15.298f, 2.761f, 14.593f, 3.903f)
            curveTo(17.202f, 4.738f, 19.262f, 6.798f, 20.097f, 9.407f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.644f to Color(0xFFFF6F47),
                    0.942f to Color(0x00FF6F47),
                ),
                center = Offset(12.6f, 11.6f),
                radius = 11.031f,
            ),
        ) {
            moveTo(20.097f, 9.407f)
            curveTo(21.239f, 8.702f, 22f, 7.44f, 22f, 6f)
            curveTo(22f, 3.791f, 20.209f, 2f, 18f, 2f)
            curveTo(16.56f, 2f, 15.298f, 2.761f, 14.593f, 3.903f)
            curveTo(17.202f, 4.738f, 19.262f, 6.798f, 20.097f, 9.407f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(10.383f, 9.37f),
                end = Offset(3.381f, 3.641f),
            ),
        ) {
            moveTo(9.407f, 3.903f)
            curveTo(6.798f, 4.738f, 4.738f, 6.798f, 3.903f, 9.407f)
            curveTo(2.761f, 8.702f, 2f, 7.44f, 2f, 6f)
            curveTo(2f, 3.791f, 3.791f, 2f, 6f, 2f)
            curveTo(7.44f, 2f, 8.702f, 2.761f, 9.407f, 3.903f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.659f to Color(0xFFFF6F47),
                    0.949f to Color(0x00FF6F47),
                ),
                center = Offset(12.6f, 11.6f),
                radius = 11.031f,
            ),
        ) {
            moveTo(9.407f, 3.903f)
            curveTo(6.798f, 4.738f, 4.738f, 6.798f, 3.903f, 9.407f)
            curveTo(2.761f, 8.702f, 2f, 7.44f, 2f, 6f)
            curveTo(2f, 3.791f, 3.791f, 2f, 6f, 2f)
            curveTo(7.44f, 2f, 8.702f, 2.761f, 9.407f, 3.903f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(3f, 15.239f),
                end = Offset(3.847f, 22.319f),
            ),
        ) {
            moveTo(4.28f, 20.78f)
            lineTo(7.03f, 18.03f)
            lineTo(5.97f, 16.97f)
            lineTo(3.22f, 19.72f)
            curveTo(2.927f, 20.013f, 2.927f, 20.487f, 3.22f, 20.78f)
            curveTo(3.513f, 21.073f, 3.987f, 21.073f, 4.28f, 20.78f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(3f, 15.239f),
                end = Offset(3.847f, 22.319f),
            ),
        ) {
            moveTo(20.78f, 19.72f)
            lineTo(18.03f, 16.97f)
            lineTo(16.97f, 18.03f)
            lineTo(19.72f, 20.78f)
            curveTo(20.013f, 21.073f, 20.487f, 21.073f, 20.78f, 20.78f)
            curveTo(21.073f, 20.487f, 21.073f, 20.013f, 20.78f, 19.72f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(6f, 2f),
                end = Offset(15f, 22f),
            ),
        ) {
            moveTo(21f, 12f)
            curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
            curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
            curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFDEDEFF),
                ),
                start = Offset(6.783f, 2.87f),
                end = Offset(16.565f, 23.739f),
            ),
        ) {
            moveTo(19.5f, 12f)
            curveTo(19.5f, 16.142f, 16.142f, 19.5f, 12f, 19.5f)
            curveTo(7.858f, 19.5f, 4.5f, 16.142f, 4.5f, 12f)
            curveTo(4.5f, 7.858f, 7.858f, 4.5f, 12f, 4.5f)
            curveTo(16.142f, 4.5f, 19.5f, 7.858f, 19.5f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(12.6f, 7.133f),
                end = Offset(15.429f, 11.849f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11.25f, 7f)
            curveTo(11.664f, 7f, 12f, 7.336f, 12f, 7.75f)
            verticalLineTo(12f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 12f, 15.5f, 12.336f, 15.5f, 12.75f)
            curveTo(15.5f, 13.164f, 15.164f, 13.5f, 14.75f, 13.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 13.5f, 10.5f, 13.164f, 10.5f, 12.75f)
            verticalLineTo(7.75f)
            curveTo(10.5f, 7.336f, 10.836f, 7f, 11.25f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockAlarmPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ClockAlarm, contentDescription = null)
    }
}
