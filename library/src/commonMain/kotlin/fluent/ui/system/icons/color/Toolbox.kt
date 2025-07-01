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
package fluent.ui.system.icons.color

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

public val FluentIcons.Color.Toolbox: ImageVector
    get() {
        if (_Toolbox != null) {
            return _Toolbox!!
        }
        _Toolbox = ImageVector.Builder(
            name = "Colored.Toolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB9C0C7),
                        1f to Color(0xFF70777D)
                    ),
                    start = Offset(3.429f, 4.002f),
                    end = Offset(3.84f, 7.069f)
                )
            ) {
                moveTo(7f, 7.5f)
                verticalLineTo(6.252f)
                curveTo(7f, 5.01f, 8.007f, 4.002f, 9.25f, 4.002f)
                horizontalLineTo(14.75f)
                curveTo(15.993f, 4.002f, 17f, 5.01f, 17f, 6.252f)
                verticalLineTo(7.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.252f)
                curveTo(15.5f, 5.838f, 15.164f, 5.502f, 14.75f, 5.502f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 5.502f, 8.5f, 5.838f, 8.5f, 6.252f)
                verticalLineTo(7.5f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFF97DBD),
                        1f to Color(0xFFD7257D)
                    ),
                    start = Offset(0.75f, 8.314f),
                    end = Offset(2.577f, 28.314f)
                )
            ) {
                moveTo(4.25f, 19.997f)
                curveTo(3.007f, 19.997f, 2f, 18.989f, 2f, 17.747f)
                verticalLineTo(11.5f)
                horizontalLineTo(22f)
                verticalLineTo(17.747f)
                curveTo(22f, 18.989f, 20.993f, 19.997f, 19.75f, 19.997f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF97DBD),
                        1f to Color(0xFFD7257D)
                    ),
                    start = Offset(0.75f, 5.125f),
                    end = Offset(1.128f, 17.094f)
                )
            ) {
                moveTo(2f, 9.25f)
                curveTo(2f, 8.007f, 3.007f, 7f, 4.25f, 7f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 7f, 22f, 8.007f, 22f, 9.25f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(9.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEFEFEF),
                        1f to Color(0xFFDADADA)
                    ),
                    start = Offset(2.571f, 10f),
                    end = Offset(3.327f, 14.331f)
                )
            ) {
                moveTo(16.75f, 10f)
                curveTo(17.164f, 10f, 17.5f, 10.336f, 17.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(17.5f, 13.664f, 17.164f, 14f, 16.75f, 14f)
                curveTo(16.336f, 14f, 16f, 13.664f, 16f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(16f, 10.336f, 16.336f, 10f, 16.75f, 10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEFEFEF),
                        1f to Color(0xFFDADADA)
                    ),
                    start = Offset(2.571f, 10f),
                    end = Offset(3.327f, 14.331f)
                )
            ) {
                moveTo(7.25f, 10f)
                curveTo(7.664f, 10f, 8f, 10.336f, 8f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(8f, 13.664f, 7.664f, 14f, 7.25f, 14f)
                curveTo(6.836f, 14f, 6.5f, 13.664f, 6.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(6.5f, 10.336f, 6.836f, 10f, 7.25f, 10f)
                close()
            }
        }.build()

        return _Toolbox!!
    }

@Suppress("ObjectPropertyName")
private var _Toolbox: ImageVector? = null

@Preview
@Composable
private fun ToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Toolbox, contentDescription = null)
    }
}
