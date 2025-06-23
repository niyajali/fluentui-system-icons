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

public val FluentIcons.Colored.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) {
            return _Clipboard!!
        }
        _Clipboard = ImageVector.Builder(
            name = "Colored.Clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(4f, 5.8f),
                    end = Offset(18.146f, 23.483f)
                )
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0A1852),
                        0.9f to Color(0x000A1852)
                    ),
                    center = Offset(12f, 3f),
                    radius = 6.169f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0A1852),
                        1f to Color(0x000A1852)
                    ),
                    center = Offset(12f, 4.618f),
                    radius = 2.793f
                ),
                fillAlpha = 0.4f,
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE06B),
                        1f to Color(0xFFFAB500)
                    ),
                    start = Offset(12f, 2f),
                    end = Offset(12f, 6.5f)
                )
            ) {
                moveTo(8f, 4.25f)
                curveTo(8f, 5.493f, 9.007f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.993f, 6.5f, 16f, 5.493f, 16f, 4.25f)
                curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
                close()
            }
        }.build()

        return _Clipboard!!
    }

@Suppress("ObjectPropertyName")
private var _Clipboard: ImageVector? = null

@Preview
@Composable
private fun ClipboardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Clipboard, contentDescription = null)
    }
}
