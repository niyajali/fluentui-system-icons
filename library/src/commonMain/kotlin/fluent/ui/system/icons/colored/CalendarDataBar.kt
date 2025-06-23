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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.CalendarDataBar: ImageVector
    get() {
        if (_CalendarDataBar != null) {
            return _CalendarDataBar!!
        }
        _CalendarDataBar = ImageVector.Builder(
            name = "Colored.CalendarDataBar",
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
                    center = Offset(13.5f, 21f),
                    radius = 5.5f
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
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.5f, 19.5f),
                    radius = 8f
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
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(21.5f, 20f),
                    radius = 5.5f
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
                        0f to Color(0xFFD7257D),
                        1f to Color(0xFFE656EB)
                    ),
                    start = Offset(22.75f, 21.35f),
                    end = Offset(21.562f, 13.841f)
                )
            ) {
                moveTo(20f, 15.5f)
                curveTo(20f, 14.672f, 20.672f, 14f, 21.5f, 14f)
                curveTo(22.328f, 14f, 23f, 14.672f, 23f, 15.5f)
                verticalLineTo(21.5f)
                curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
                curveTo(20.672f, 23f, 20f, 22.328f, 20f, 21.5f)
                verticalLineTo(15.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF5B2AB5),
                        1f to Color(0xFFDD3CE2)
                    ),
                    start = Offset(19.75f, 24.222f),
                    end = Offset(18.104f, 12f)
                )
            ) {
                moveTo(17.5f, 12f)
                curveTo(16.672f, 12f, 16f, 12.672f, 16f, 13.5f)
                verticalLineTo(21.5f)
                curveTo(16f, 22.328f, 16.672f, 23f, 17.5f, 23f)
                curveTo(18.328f, 23f, 19f, 22.328f, 19f, 21.5f)
                verticalLineTo(13.5f)
                curveTo(19f, 12.672f, 18.328f, 12f, 17.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF2052CB)
                    ),
                    start = Offset(12.375f, 16.292f),
                    end = Offset(18.534f, 19.414f)
                )
            ) {
                moveTo(13.5f, 16f)
                curveTo(12.672f, 16f, 12f, 16.672f, 12f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
                curveTo(14.328f, 23f, 15f, 22.328f, 15f, 21.5f)
                verticalLineTo(17.5f)
                curveTo(15f, 16.672f, 14.328f, 16f, 13.5f, 16f)
                close()
            }
        }.build()

        return _CalendarDataBar!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDataBar: ImageVector? = null

@Preview
@Composable
private fun CalendarDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CalendarDataBar, contentDescription = null)
    }
}
