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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.DocumentOnePageAdd: ImageVector
    get() {
        if (_DocumentOnePageAdd != null) {
            return _DocumentOnePageAdd!!
        }
        _DocumentOnePageAdd = ImageVector.Builder(
            name = "Regular.DocumentOnePageAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
                verticalLineTo(11.498f)
                curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
                verticalLineTo(4.25f)
                curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(12.019f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(16.25f, 11f)
                curveTo(16.361f, 11f, 16.466f, 11.024f, 16.561f, 11.067f)
                curveTo(15.349f, 11.243f, 14.245f, 11.752f, 13.346f, 12.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 12.5f, 7f, 12.164f, 7f, 11.75f)
                curveTo(7f, 11.336f, 7.336f, 11f, 7.75f, 11f)
                horizontalLineTo(16.25f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(7.336f, 6.5f, 7f, 6.836f, 7f, 7.25f)
                curveTo(7f, 7.664f, 7.336f, 8f, 7.75f, 8f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 8f, 17f, 7.664f, 17f, 7.25f)
                curveTo(17f, 6.836f, 16.664f, 6.5f, 16.25f, 6.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _DocumentOnePageAdd!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentOnePageAdd: ImageVector? = null

@Preview
@Composable
private fun DocumentOnePageAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentOnePageAdd, contentDescription = null)
    }
}
