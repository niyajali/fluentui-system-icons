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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextEditStyle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, edit, style
 * - Source: ic_fluent_text_edit_style_24_regular.svg
 * 
 * @return The [ImageVector] for the TextEditStyle icon.
 */
public val FluentIcons.Regular.TextEditStyle: ImageVector
    get() {
        if (_textEditStyle != null) {
            return _textEditStyle!!
        }
        _textEditStyle = Builder(name = "TextEditStyle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.063f, 8.445f)
                curveTo(21.319f, 9.702f, 21.318f, 11.74f, 20.061f, 12.996f)
                lineTo(12.938f, 20.108f)
                curveTo(12.675f, 20.37f, 12.351f, 20.563f, 11.995f, 20.67f)
                lineTo(7.702f, 21.959f)
                curveTo(7.173f, 22.118f, 6.616f, 21.818f, 6.457f, 21.289f)
                curveTo(6.399f, 21.095f, 6.401f, 20.887f, 6.463f, 20.695f)
                lineTo(7.824f, 16.467f)
                curveTo(7.934f, 16.126f, 8.123f, 15.817f, 8.376f, 15.564f)
                lineTo(15.509f, 8.443f)
                curveTo(16.767f, 7.186f, 18.806f, 7.188f, 20.063f, 8.445f)
                close()
                moveTo(16.569f, 9.504f)
                lineTo(9.436f, 16.625f)
                curveTo(9.352f, 16.71f, 9.289f, 16.813f, 9.252f, 16.926f)
                lineTo(8.182f, 20.249f)
                lineTo(11.564f, 19.234f)
                curveTo(11.683f, 19.198f, 11.791f, 19.134f, 11.878f, 19.046f)
                lineTo(19.0f, 11.936f)
                curveTo(19.672f, 11.265f, 19.672f, 10.177f, 19.002f, 9.506f)
                curveTo(18.33f, 8.834f, 17.241f, 8.833f, 16.569f, 9.504f)
                close()
                moveTo(8.151f, 2.37f)
                lineTo(8.202f, 2.475f)
                lineTo(11.454f, 10.724f)
                lineTo(10.297f, 11.879f)
                lineTo(9.556f, 10.0f)
                horizontalLineTo(5.443f)
                lineTo(4.448f, 12.521f)
                curveTo(4.308f, 12.874f, 3.93f, 13.062f, 3.572f, 12.974f)
                lineTo(3.474f, 12.943f)
                curveTo(3.121f, 12.803f, 2.933f, 12.425f, 3.022f, 12.067f)
                lineTo(3.053f, 11.969f)
                lineTo(6.806f, 2.474f)
                curveTo(7.042f, 1.879f, 7.849f, 1.844f, 8.151f, 2.37f)
                close()
                moveTo(7.503f, 4.792f)
                lineTo(6.036f, 8.5f)
                horizontalLineTo(8.964f)
                lineTo(7.503f, 4.792f)
                close()
            }
        }
        .build()
        return _textEditStyle!!
    }

@Suppress("ObjectPropertyName")
private var _textEditStyle: ImageVector? = null

@Preview
@Composable
private fun TextEditStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextEditStyle, contentDescription = null)
    }
}

