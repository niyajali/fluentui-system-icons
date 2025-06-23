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

public val FluentIcons.Colored.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) {
            return _Lightbulb!!
        }
        _Lightbulb = ImageVector.Builder(
            name = "Colored.Lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE06B),
                        0.376f to Color(0xFFFFA43D),
                        1f to Color(0xFFE67505)
                    ),
                    center = Offset(7.419f, 7.571f),
                    radius = 14.468f
                )
            ) {
                moveTo(15.247f, 20.258f)
                curveTo(15.024f, 21.221f, 14.201f, 21.919f, 13.228f, 21.993f)
                lineTo(13.055f, 22f)
                horizontalLineTo(10.943f)
                curveTo(9.954f, 22f, 9.088f, 21.355f, 8.797f, 20.424f)
                lineTo(8.751f, 20.256f)
                lineTo(8.346f, 18.5f)
                horizontalLineTo(15.654f)
                lineTo(15.247f, 20.258f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD34719),
                        1f to Color(0x00D34719)
                    ),
                    start = Offset(11.999f, 18.5f),
                    end = Offset(11.999f, 22f)
                )
            ) {
                moveTo(15.247f, 20.258f)
                curveTo(15.024f, 21.221f, 14.201f, 21.919f, 13.228f, 21.993f)
                lineTo(13.055f, 22f)
                horizontalLineTo(10.943f)
                curveTo(9.954f, 22f, 9.088f, 21.355f, 8.797f, 20.424f)
                lineTo(8.751f, 20.256f)
                lineTo(8.346f, 18.5f)
                horizontalLineTo(15.654f)
                lineTo(15.247f, 20.258f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE06B),
                        0.376f to Color(0xFFFFA43D),
                        1f to Color(0xFFE67505)
                    ),
                    center = Offset(7.166f, 4.012f),
                    radius = 18.226f
                )
            ) {
                moveTo(8.23f, 18f)
                horizontalLineTo(15.77f)
                lineTo(16.414f, 15.217f)
                curveTo(16.425f, 15.169f, 16.449f, 15.126f, 16.485f, 15.092f)
                curveTo(18.314f, 13.345f, 19.25f, 11.388f, 19.25f, 9.251f)
                curveTo(19.25f, 5.247f, 16.004f, 2.001f, 12f, 2.001f)
                curveTo(7.996f, 2.001f, 4.75f, 5.247f, 4.75f, 9.251f)
                curveTo(4.75f, 11.388f, 5.686f, 13.345f, 7.517f, 15.092f)
                curveTo(7.552f, 15.126f, 7.577f, 15.169f, 7.588f, 15.217f)
                lineTo(8.23f, 18f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC7A3),
                        1f to Color(0xFFFF9C70)
                    ),
                    start = Offset(11.385f, 18.095f),
                    end = Offset(12.725f, 20.874f)
                )
            ) {
                moveTo(8.461f, 18.999f)
                lineTo(8.114f, 17.5f)
                horizontalLineTo(15.886f)
                lineTo(15.538f, 18.999f)
                horizontalLineTo(8.461f)
                close()
            }
        }.build()

        return _Lightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb: ImageVector? = null

@Preview
@Composable
private fun LightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Lightbulb, contentDescription = null)
    }
}
