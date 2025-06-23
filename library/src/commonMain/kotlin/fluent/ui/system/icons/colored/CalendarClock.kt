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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.CalendarClock: ImageVector
    get() {
        if (_CalendarClock != null) {
            return _CalendarClock!!
        }
        _CalendarClock = ImageVector.Builder(
            name = "Colored.CalendarClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3E0FF),
                        1f to Color(0xFF8CD0FF)
                    ),
                    start = Offset(9.429f, 6.5f),
                    end = Offset(14.137f, 20.932f)
                )
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00DCF8FF),
                        1f to Color(0xB2FF6CE8)
                    ),
                    start = Offset(13.929f, 12.432f),
                    end = Offset(16.625f, 24.267f)
                )
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.786f, 19.023f),
                    radius = 8.568f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(3.723f, 3f),
                    end = Offset(5.356f, 11.537f)
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1EC8B0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(13.833f, 11.389f),
                    end = Offset(19.333f, 23.611f)
                )
            ) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFD1D1FF)
                    ),
                    start = Offset(17.306f, 14.612f),
                    end = Offset(16.398f, 17.88f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.5f, 14f)
                curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
                curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
                close()
            }
        }.build()

        return _CalendarClock!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarClock: ImageVector? = null

@Preview
@Composable
private fun CalendarClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CalendarClock, contentDescription = null)
    }
}
