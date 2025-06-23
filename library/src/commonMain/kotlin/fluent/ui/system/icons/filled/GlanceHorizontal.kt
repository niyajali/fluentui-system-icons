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

public val FluentIcons.Filled.GlanceHorizontal: ImageVector
    get() {
        if (_GlanceHorizontal != null) {
            return _GlanceHorizontal!!
        }
        _GlanceHorizontal = ImageVector.Builder(
            name = "Filled.GlanceHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.001f, 4.752f)
                curveTo(13.001f, 3.785f, 12.218f, 3.002f, 11.251f, 3.002f)
                horizontalLineTo(4.751f)
                curveTo(3.785f, 3.002f, 3.001f, 3.785f, 3.001f, 4.752f)
                verticalLineTo(9.252f)
                curveTo(3.001f, 10.219f, 3.785f, 11.002f, 4.751f, 11.002f)
                horizontalLineTo(11.251f)
                curveTo(12.218f, 11.002f, 13.001f, 10.219f, 13.001f, 9.252f)
                verticalLineTo(4.752f)
                close()
                moveTo(8.989f, 14.734f)
                curveTo(8.989f, 13.767f, 8.205f, 12.984f, 7.239f, 12.984f)
                horizontalLineTo(4.751f)
                curveTo(3.785f, 12.984f, 3.001f, 13.767f, 3.001f, 14.734f)
                verticalLineTo(19.248f)
                curveTo(3.001f, 20.215f, 3.785f, 20.998f, 4.751f, 20.998f)
                horizontalLineTo(7.239f)
                curveTo(8.205f, 20.998f, 8.989f, 20.215f, 8.989f, 19.248f)
                verticalLineTo(14.734f)
                close()
                moveTo(21.003f, 14.748f)
                curveTo(21.003f, 13.782f, 20.219f, 12.998f, 19.253f, 12.998f)
                horizontalLineTo(12.753f)
                curveTo(11.835f, 12.998f, 11.082f, 13.705f, 11.009f, 14.605f)
                lineTo(11.003f, 14.748f)
                verticalLineTo(19.248f)
                curveTo(11.003f, 20.215f, 11.786f, 20.998f, 12.753f, 20.998f)
                horizontalLineTo(19.253f)
                curveTo(20.219f, 20.998f, 21.003f, 20.215f, 21.003f, 19.248f)
                verticalLineTo(14.748f)
                close()
                moveTo(21.003f, 4.752f)
                curveTo(21.003f, 3.785f, 20.219f, 3.002f, 19.253f, 3.002f)
                horizontalLineTo(16.753f)
                curveTo(15.786f, 3.002f, 15.003f, 3.785f, 15.003f, 4.752f)
                verticalLineTo(9.252f)
                curveTo(15.003f, 10.219f, 15.786f, 11.002f, 16.753f, 11.002f)
                horizontalLineTo(19.253f)
                curveTo(20.219f, 11.002f, 21.003f, 10.219f, 21.003f, 9.252f)
                verticalLineTo(4.752f)
                close()
            }
        }.build()

        return _GlanceHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _GlanceHorizontal: ImageVector? = null

@Preview
@Composable
private fun GlanceHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlanceHorizontal, contentDescription = null)
    }
}
