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
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.LinkSquare: ImageVector
    get() {
        if (_LinkSquare != null) {
            return _LinkSquare!!
        }
        _LinkSquare = ImageVector.Builder(
            name = "Filled.LinkSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.502f, 3.003f)
                curveTo(4.569f, 3.003f, 3.002f, 4.57f, 3.002f, 6.503f)
                verticalLineTo(12.503f)
                curveTo(3.002f, 14.436f, 4.569f, 16.003f, 6.502f, 16.003f)
                horizontalLineTo(6.999f)
                verticalLineTo(14.003f)
                horizontalLineTo(6.502f)
                curveTo(5.674f, 14.003f, 5.002f, 13.331f, 5.002f, 12.503f)
                verticalLineTo(6.503f)
                curveTo(5.002f, 5.674f, 5.674f, 5.003f, 6.502f, 5.003f)
                horizontalLineTo(12.502f)
                curveTo(13.331f, 5.003f, 14.002f, 5.674f, 14.002f, 6.503f)
                verticalLineTo(12.503f)
                curveTo(14.002f, 13.331f, 13.331f, 14.003f, 12.502f, 14.003f)
                horizontalLineTo(10.996f)
                verticalLineTo(16.003f)
                horizontalLineTo(12.502f)
                curveTo(14.435f, 16.003f, 16.002f, 14.436f, 16.002f, 12.503f)
                verticalLineTo(6.503f)
                curveTo(16.002f, 4.57f, 14.435f, 3.003f, 12.502f, 3.003f)
                horizontalLineTo(6.502f)
                close()
                moveTo(10f, 11.5f)
                curveTo(10f, 10.672f, 10.672f, 10f, 11.5f, 10f)
                horizontalLineTo(12.999f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                curveTo(9.567f, 8f, 8f, 9.567f, 8f, 11.5f)
                verticalLineTo(17.5f)
                curveTo(8f, 19.433f, 9.567f, 21f, 11.5f, 21f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
                verticalLineTo(11.5f)
                curveTo(21f, 9.567f, 19.433f, 8f, 17.5f, 8f)
                horizontalLineTo(17.005f)
                verticalLineTo(10f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 10f, 19f, 10.672f, 19f, 11.5f)
                verticalLineTo(17.5f)
                curveTo(19f, 18.329f, 18.328f, 19f, 17.5f, 19f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19f, 10f, 18.329f, 10f, 17.5f)
                verticalLineTo(11.5f)
                close()
            }
        }.build()

        return _LinkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSquare: ImageVector? = null

@Preview
@Composable
private fun LinkSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LinkSquare, contentDescription = null)
    }
}
