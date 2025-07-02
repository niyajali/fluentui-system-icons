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

public val FluentIcons.Color.ContentView: ImageVector
    get() {
        if (_ContentView != null) {
            return _ContentView!!
        }
        _ContentView = ImageVector.Builder(
            name = "Colored.ContentView",
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
                    start = Offset(9.429f, 3f),
                    end = Offset(16.325f, 20.03f)
                )
            ) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(6f, 6.5f),
                    end = Offset(20.135f, 11.741f)
                )
            ) {
                moveTo(6f, 8.25f)
                curveTo(6f, 7.284f, 6.784f, 6.5f, 7.75f, 6.5f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 6.5f, 18f, 7.284f, 18f, 8.25f)
                verticalLineTo(9.75f)
                curveTo(18f, 10.717f, 17.216f, 11.5f, 16.25f, 11.5f)
                horizontalLineTo(7.75f)
                curveTo(6.784f, 11.5f, 6f, 10.717f, 6f, 9.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(6.75f, 13f)
                curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
                curveTo(6f, 14.164f, 6.336f, 14.5f, 6.75f, 14.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 14.5f, 12f, 14.164f, 12f, 13.75f)
                curveTo(12f, 13.336f, 11.664f, 13f, 11.25f, 13f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 16.75f)
                curveTo(6f, 16.336f, 6.336f, 16f, 6.75f, 16f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 16f, 12f, 16.336f, 12f, 16.75f)
                curveTo(12f, 17.164f, 11.664f, 17.5f, 11.25f, 17.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 17.5f, 6f, 17.164f, 6f, 16.75f)
                close()
                moveTo(15.25f, 13f)
                curveTo(14.283f, 13f, 13.5f, 13.783f, 13.5f, 14.75f)
                verticalLineTo(15.75f)
                curveTo(13.5f, 16.716f, 14.283f, 17.5f, 15.25f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 17.5f, 18f, 16.716f, 18f, 15.75f)
                verticalLineTo(14.75f)
                curveTo(18f, 13.783f, 17.216f, 13f, 16.25f, 13f)
                horizontalLineTo(15.25f)
                close()
            }
        }.build()

        return _ContentView!!
    }

@Suppress("ObjectPropertyName")
private var _ContentView: ImageVector? = null

@Preview
@Composable
private fun ContentViewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.ContentView, contentDescription = null)
    }
}
