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

public val FluentIcons.Color.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Colored.Book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9DEAFF),
                        0.716f to Color(0xFF58AAFE)
                    ),
                    start = Offset(12.174f, 20.4f),
                    end = Offset(12.174f, 18f)
                )
            ) {
                moveTo(5f, 19f)
                horizontalLineTo(20.281f)
                curveTo(20.281f, 19f, 20f, 19.5f, 20f, 20f)
                curveTo(20f, 20.5f, 20.281f, 21f, 20.281f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(19f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF20AC9D),
                        1f to Color(0xFF2052CB)
                    ),
                    start = Offset(9.693f, 5.742f),
                    end = Offset(12.681f, 27.308f)
                )
            ) {
                moveTo(4f, 4.5f)
                curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
                horizontalLineTo(18f)
                curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
                curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9FF0F9),
                        1f to Color(0xFF6CE0FF)
                    ),
                    start = Offset(10.449f, 4.314f),
                    end = Offset(15.053f, 11.478f)
                )
            ) {
                moveTo(7f, 6f)
                curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(16.552f, 5f, 17f, 5.448f, 17f, 6f)
                verticalLineTo(8f)
                curveTo(17f, 8.552f, 16.552f, 9f, 16f, 9f)
                horizontalLineTo(8f)
                curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null

@Preview
@Composable
private fun BookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Book, contentDescription = null)
    }
}
