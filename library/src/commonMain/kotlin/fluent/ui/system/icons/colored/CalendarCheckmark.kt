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

public val FluentIcons.Colored.CalendarCheckmark: ImageVector
    get() {
        if (_CalendarCheckmark != null) {
            return _CalendarCheckmark!!
        }
        _CalendarCheckmark = ImageVector.Builder(
            name = "Colored.CalendarCheckmark",
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
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF22918B)
                    ),
                    start = Offset(12.393f, 14.063f),
                    end = Offset(19.984f, 21.95f)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFE3FFD9)
                    ),
                    start = Offset(15.313f, 15.51f),
                    end = Offset(16.45f, 21.13f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.854f, 15.146f)
                curveTo(21.049f, 15.342f, 21.049f, 15.658f, 20.854f, 15.854f)
                lineTo(16.854f, 19.854f)
                curveTo(16.658f, 20.049f, 16.342f, 20.049f, 16.146f, 19.854f)
                lineTo(14.146f, 17.854f)
                curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
                curveTo(14.342f, 16.951f, 14.658f, 16.951f, 14.854f, 17.146f)
                lineTo(16.5f, 18.793f)
                lineTo(20.146f, 15.146f)
                curveTo(20.342f, 14.951f, 20.658f, 14.951f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _CalendarCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCheckmark: ImageVector? = null

@Preview
@Composable
private fun CalendarCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CalendarCheckmark, contentDescription = null)
    }
}
