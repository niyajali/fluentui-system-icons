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

public val FluentIcons.Colored.DataScatter: ImageVector
    get() {
        if (_DataScatter != null) {
            return _DataScatter!!
        }
        _DataScatter = ImageVector.Builder(
            name = "Colored.DataScatter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0078D4)
                    ),
                    start = Offset(6.75f, 6.25f),
                    end = Offset(13.204f, 13.884f)
                )
            ) {
                moveTo(9f, 6f)
                curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
                curveTo(6f, 10.657f, 7.343f, 12f, 9f, 12f)
                curveTo(10.657f, 12f, 12f, 10.657f, 12f, 9f)
                curveTo(12f, 7.343f, 10.657f, 6f, 9f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF6D37CD),
                        0.641f to Color(0xFFEA71EF)
                    ),
                    start = Offset(18f, 18f),
                    end = Offset(8.4f, 8.4f)
                )
            ) {
                moveTo(15f, 12f)
                curveTo(13.343f, 12f, 12f, 13.343f, 12f, 15f)
                curveTo(12f, 16.657f, 13.343f, 18f, 15f, 18f)
                curveTo(16.657f, 18f, 18f, 16.657f, 18f, 15f)
                curveTo(18f, 13.343f, 16.657f, 12f, 15f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE23CB4),
                        1f to Color(0xFFEA71EF)
                    ),
                    start = Offset(19.5f, 8.9f),
                    end = Offset(15.2f, 4f)
                )
            ) {
                moveTo(14f, 7f)
                curveTo(14f, 5.343f, 15.343f, 4f, 17f, 4f)
                curveTo(18.657f, 4f, 20f, 5.343f, 20f, 7f)
                curveTo(20f, 8.657f, 18.657f, 10f, 17f, 10f)
                curveTo(15.343f, 10f, 14f, 8.657f, 14f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF70777D),
                        1f to Color(0xFFB9C0C7)
                    ),
                    start = Offset(19.313f, 4.125f),
                    end = Offset(3.56f, 27.58f)
                )
            ) {
                moveTo(5f, 4f)
                curveTo(5f, 3.448f, 4.552f, 3f, 4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(17.5f)
                curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                curveTo(21f, 19.448f, 20.552f, 19f, 20f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _DataScatter!!
    }

@Suppress("ObjectPropertyName")
private var _DataScatter: ImageVector? = null

@Preview
@Composable
private fun DataScatterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DataScatter, contentDescription = null)
    }
}
