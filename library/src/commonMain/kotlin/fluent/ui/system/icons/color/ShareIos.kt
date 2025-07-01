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

public val FluentIcons.Color.ShareIos: ImageVector
    get() {
        if (_ShareIos != null) {
            return _ShareIos!!
        }
        _ShareIos = ImageVector.Builder(
            name = "Colored.ShareIos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.283f to Color(0xFF0FAFFF),
                        1f to Color(0xFF0078D4)
                    ),
                    center = Offset(0.906f, -3.246f),
                    radius = 32.414f
                )
            ) {
                moveTo(12.707f, 2.293f)
                curveTo(12.317f, 1.902f, 11.683f, 1.902f, 11.293f, 2.293f)
                lineTo(6.043f, 7.543f)
                curveTo(5.652f, 7.933f, 5.652f, 8.567f, 6.043f, 8.957f)
                curveTo(6.433f, 9.348f, 7.067f, 9.348f, 7.457f, 8.957f)
                lineTo(11f, 5.414f)
                verticalLineTo(15f)
                curveTo(11f, 15.552f, 11.448f, 16f, 12f, 16f)
                curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
                verticalLineTo(5.414f)
                lineTo(16.543f, 8.957f)
                curveTo(16.933f, 9.348f, 17.567f, 9.348f, 17.957f, 8.957f)
                curveTo(18.348f, 8.567f, 18.348f, 7.933f, 17.957f, 7.543f)
                lineTo(12.707f, 2.293f)
                close()
                moveTo(4f, 11f)
                curveTo(4.552f, 11f, 5f, 11.448f, 5f, 12f)
                verticalLineTo(17.5f)
                curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 19f, 19f, 18.328f, 19f, 17.5f)
                verticalLineTo(12f)
                curveTo(19f, 11.448f, 19.448f, 11f, 20f, 11f)
                curveTo(20.552f, 11f, 21f, 11.448f, 21f, 12f)
                verticalLineTo(17.5f)
                curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
                verticalLineTo(12f)
                curveTo(3f, 11.448f, 3.448f, 11f, 4f, 11f)
                close()
            }
        }.build()

        return _ShareIos!!
    }

@Suppress("ObjectPropertyName")
private var _ShareIos: ImageVector? = null

@Preview
@Composable
private fun ShareIosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.ShareIos, contentDescription = null)
    }
}
