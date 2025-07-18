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

public val FluentIcons.Color.ImageOff: ImageVector
    get() {
        if (_ImageOff != null) {
            return _ImageOff!!
        }
        _ImageOff = ImageVector.Builder(
            name = "Colored.ImageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.338f to Color(0xFFA9A9A9),
                        0.695f to Color(0xFF898989)
                    ),
                    center = Offset(-4.071f, -7.125f),
                    radius = 49.773f
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE7DEDE),
                        1f to Color(0xFFD3D3D3)
                    ),
                    start = Offset(9.567f, 12.003f),
                    end = Offset(11.594f, 21.477f)
                )
            ) {
                moveTo(20.515f, 19.459f)
                curveTo(19.942f, 20.384f, 18.918f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(5.082f, 21f, 4.058f, 20.384f, 3.485f, 19.459f)
                lineTo(10.424f, 12.648f)
                lineTo(10.559f, 12.525f)
                curveTo(11.394f, 11.827f, 12.615f, 11.829f, 13.448f, 12.531f)
                lineTo(13.576f, 12.648f)
                lineTo(20.515f, 19.459f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFE4E4E4)
                    ),
                    start = Offset(15.2f, 5.556f),
                    end = Offset(16.661f, 10.816f)
                )
            ) {
                moveTo(16f, 6f)
                curveTo(17.105f, 6f, 18f, 6.895f, 18f, 8f)
                curveTo(18f, 9.105f, 17.105f, 10f, 16f, 10f)
                curveTo(14.895f, 10f, 14f, 9.105f, 14f, 8f)
                curveTo(14f, 6.895f, 14.895f, 6f, 16f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.464f to Color(0x00000000),
                        0.49f to Color(0xFF000000),
                        0.582f to Color(0x00000000)
                    ),
                    start = Offset(21f, 3f),
                    end = Offset(3f, 21f)
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE82C41),
                        1f to Color(0xFFAA1D2D)
                    ),
                    start = Offset(2f, -1.75f),
                    end = Offset(18.25f, 22.625f)
                )
            ) {
                moveTo(2.293f, 2.293f)
                curveTo(2.683f, 1.902f, 3.317f, 1.902f, 3.707f, 2.293f)
                lineTo(21.707f, 20.293f)
                curveTo(22.098f, 20.683f, 22.098f, 21.317f, 21.707f, 21.707f)
                curveTo(21.317f, 22.098f, 20.683f, 22.098f, 20.293f, 21.707f)
                lineTo(2.293f, 3.707f)
                curveTo(1.902f, 3.317f, 1.902f, 2.683f, 2.293f, 2.293f)
                close()
            }
        }.build()

        return _ImageOff!!
    }

@Suppress("ObjectPropertyName")
private var _ImageOff: ImageVector? = null

@Preview
@Composable
private fun ImageOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.ImageOff, contentDescription = null)
    }
}
