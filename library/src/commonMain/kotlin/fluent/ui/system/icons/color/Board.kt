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

public val FluentIcons.Color.Board: ImageVector
    get() {
        if (_Board != null) {
            return _Board!!
        }
        _Board = ImageVector.Builder(
            name = "Colored.Board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB0F098),
                        1f to Color(0xFF52D17C)
                    ),
                    start = Offset(7.666f, 11.454f),
                    end = Offset(12.721f, 23.563f)
                )
            ) {
                moveTo(11.999f, 15f)
                lineTo(16.5f, 14f)
                lineTo(21f, 15f)
                lineTo(21.001f, 17.752f)
                curveTo(21.001f, 19.547f, 19.546f, 21.002f, 17.751f, 21.002f)
                lineTo(12f, 21.001f)
                lineTo(11f, 18f)
                lineTo(11.999f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF309C61)
                    ),
                    start = Offset(13f, 4.333f),
                    end = Offset(20.103f, 13.322f)
                )
            ) {
                moveTo(17.751f, 3f)
                curveTo(19.484f, 3f, 20.901f, 4.356f, 20.996f, 6.065f)
                lineTo(21.001f, 6.25f)
                lineTo(21f, 15f)
                horizontalLineTo(12f)
                lineTo(11f, 9f)
                lineTo(12.001f, 3f)
                horizontalLineTo(17.751f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF42B870),
                        1f to Color(0xFF1A7F7C)
                    ),
                    start = Offset(4.286f, 10.053f),
                    end = Offset(11.748f, 17.199f)
                )
            ) {
                moveTo(11.999f, 9f)
                lineTo(12f, 21.001f)
                lineTo(6.25f, 21.002f)
                curveTo(4.517f, 21.002f, 3.101f, 19.646f, 3.005f, 17.936f)
                lineTo(3f, 17.752f)
                verticalLineTo(9f)
                lineTo(7.5f, 8f)
                lineTo(11.999f, 9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB0F098),
                        1f to Color(0xFF64DE89)
                    ),
                    start = Offset(4.286f, 4.2f),
                    end = Offset(6.65f, 10.322f)
                )
            ) {
                moveTo(12.001f, 3f)
                lineTo(12f, 9f)
                horizontalLineTo(3f)
                lineTo(3.001f, 6.25f)
                curveTo(3.001f, 4.455f, 4.456f, 3f, 6.251f, 3f)
                horizontalLineTo(12.001f)
                close()
            }
        }.build()

        return _Board!!
    }

@Suppress("ObjectPropertyName")
private var _Board: ImageVector? = null

@Preview
@Composable
private fun BoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Board, contentDescription = null)
    }
}
