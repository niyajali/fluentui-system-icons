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

public val FluentIcons.Color.Poll: ImageVector
    get() {
        if (_Poll != null) {
            return _Poll!!
        }
        _Poll = ImageVector.Builder(
            name = "Colored.Poll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF6D37CD),
                        1f to Color(0xFFEA71EF)
                    ),
                    start = Offset(14.045f, 18.335f),
                    end = Offset(10.882f, 1.834f)
                )
            ) {
                moveTo(11.752f, 2f)
                curveTo(13.272f, 2f, 14.504f, 3.232f, 14.504f, 4.752f)
                verticalLineTo(19.25f)
                curveTo(14.504f, 20.77f, 13.272f, 22.002f, 11.752f, 22.002f)
                curveTo(10.232f, 22.002f, 9f, 20.77f, 9f, 19.25f)
                verticalLineTo(4.752f)
                curveTo(9f, 3.232f, 10.232f, 2f, 11.752f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE23CB4),
                        1f to Color(0xFFEA71EF)
                    ),
                    start = Offset(21.045f, 19.252f),
                    end = Offset(19.238f, 6.681f)
                )
            ) {
                moveTo(21.504f, 9.752f)
                curveTo(21.504f, 8.232f, 20.272f, 7f, 18.752f, 7f)
                curveTo(17.232f, 7f, 16f, 8.232f, 16f, 9.752f)
                verticalLineTo(19.25f)
                curveTo(16f, 20.77f, 17.232f, 22.002f, 18.752f, 22.002f)
                curveTo(20.272f, 22.002f, 21.504f, 20.77f, 21.504f, 19.25f)
                verticalLineTo(9.752f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0078D4)
                    ),
                    start = Offset(2.688f, 12.417f),
                    end = Offset(12.665f, 18.911f)
                )
            ) {
                moveTo(7.504f, 14.752f)
                curveTo(7.504f, 13.232f, 6.272f, 12f, 4.752f, 12f)
                curveTo(3.232f, 12f, 2f, 13.232f, 2f, 14.752f)
                verticalLineTo(19.25f)
                curveTo(2f, 20.77f, 3.232f, 22.002f, 4.752f, 22.002f)
                curveTo(6.272f, 22.002f, 7.504f, 20.77f, 7.504f, 19.25f)
                verticalLineTo(14.752f)
                close()
            }
        }.build()

        return _Poll!!
    }

@Suppress("ObjectPropertyName")
private var _Poll: ImageVector? = null

@Preview
@Composable
private fun PollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Poll, contentDescription = null)
    }
}
