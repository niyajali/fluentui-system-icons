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

public val FluentIcons.Colored.History: ImageVector
    get() {
        if (_History != null) {
            return _History!!
        }
        _History = ImageVector.Builder(
            name = "Colored.History",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD373FC),
                        1f to Color(0xFF6D37CD)
                    ),
                    start = Offset(10.156f, 18.45f),
                    end = Offset(22.094f, 13.414f)
                )
            ) {
                moveTo(12f, 7f)
                curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
                curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
                horizontalLineTo(12f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                verticalLineTo(8f)
                curveTo(11f, 7.448f, 11.448f, 7f, 12f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(3f, 4.059f),
                    end = Offset(7.831f, 24.288f)
                )
            ) {
                moveTo(12f, 5f)
                curveTo(15.866f, 5f, 19f, 8.134f, 19f, 12f)
                curveTo(19f, 15.866f, 15.866f, 19f, 12f, 19f)
                curveTo(8.134f, 19f, 5f, 15.866f, 5f, 12f)
                curveTo(5f, 11.703f, 5.018f, 11.41f, 5.054f, 11.124f)
                curveTo(5.123f, 10.576f, 4.734f, 10.076f, 4.186f, 10.008f)
                curveTo(3.638f, 9.939f, 3.138f, 10.328f, 3.07f, 10.876f)
                curveTo(3.024f, 11.245f, 3f, 11.62f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(10.15f, 3f, 8.43f, 3.559f, 7f, 4.516f)
                verticalLineTo(4f)
                curveTo(7f, 3.448f, 6.552f, 3f, 6f, 3f)
                curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
                verticalLineTo(7f)
                curveTo(5f, 7.552f, 5.448f, 8f, 6f, 8f)
                horizontalLineTo(9f)
                curveTo(9.552f, 8f, 10f, 7.552f, 10f, 7f)
                curveTo(10f, 6.448f, 9.552f, 6f, 9f, 6f)
                horizontalLineTo(8.392f)
                curveTo(9.446f, 5.365f, 10.68f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _History!!
    }

@Suppress("ObjectPropertyName")
private var _History: ImageVector? = null

@Preview
@Composable
private fun HistoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.History, contentDescription = null)
    }
}
