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
 * TextFont icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, font
 * - Source: ic_fluent_text_font_24_regular.svg
 * 
 * @return The [ImageVector] for the TextFont icon.
 */
public val FluentIcons.Regular.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = Builder(name = "TextFont", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.001f, 2.0f)
                curveTo(7.315f, 2.0f, 7.595f, 2.196f, 7.704f, 2.49f)
                lineTo(10.656f, 10.474f)
                curveTo(10.66f, 10.485f, 10.664f, 10.496f, 10.668f, 10.507f)
                lineTo(10.891f, 11.109f)
                lineTo(10.062f, 13.195f)
                lineTo(9.436f, 11.501f)
                horizontalLineTo(4.564f)
                lineTo(3.452f, 14.51f)
                curveTo(3.308f, 14.899f, 2.877f, 15.097f, 2.488f, 14.953f)
                curveTo(2.1f, 14.81f, 1.901f, 14.378f, 2.045f, 13.99f)
                lineTo(3.333f, 10.507f)
                curveTo(3.336f, 10.496f, 3.34f, 10.485f, 3.345f, 10.474f)
                lineTo(6.297f, 2.49f)
                curveTo(6.406f, 2.195f, 6.687f, 2.0f, 7.001f, 2.0f)
                close()
                moveTo(5.119f, 10.001f)
                horizontalLineTo(8.882f)
                lineTo(7.001f, 4.913f)
                lineTo(5.119f, 10.001f)
                close()
                moveTo(13.807f, 6.473f)
                curveTo(13.92f, 6.187f, 14.196f, 6.0f, 14.504f, 6.0f)
                curveTo(14.811f, 6.0f, 15.088f, 6.188f, 15.201f, 6.474f)
                lineTo(20.756f, 20.504f)
                lineTo(21.25f, 20.504f)
                curveTo(21.664f, 20.504f, 22.0f, 20.84f, 22.0f, 21.254f)
                curveTo(22.0f, 21.668f, 21.664f, 22.004f, 21.25f, 22.004f)
                lineTo(20.26f, 22.004f)
                curveTo(20.256f, 22.004f, 20.252f, 22.004f, 20.249f, 22.004f)
                curveTo(20.243f, 22.004f, 20.238f, 22.004f, 20.233f, 22.004f)
                lineTo(18.751f, 22.004f)
                curveTo(18.336f, 22.004f, 18.001f, 21.668f, 18.001f, 21.254f)
                curveTo(18.001f, 20.84f, 18.337f, 20.504f, 18.751f, 20.504f)
                lineTo(19.143f, 20.504f)
                lineTo(17.953f, 17.5f)
                horizontalLineTo(11.043f)
                lineTo(9.851f, 20.504f)
                lineTo(10.25f, 20.504f)
                curveTo(10.664f, 20.504f, 11.0f, 20.84f, 11.0f, 21.254f)
                curveTo(11.0f, 21.668f, 10.664f, 22.004f, 10.25f, 22.004f)
                lineTo(8.76f, 22.004f)
                curveTo(8.757f, 22.004f, 8.753f, 22.004f, 8.75f, 22.004f)
                curveTo(8.744f, 22.004f, 8.738f, 22.004f, 8.732f, 22.004f)
                lineTo(7.751f, 22.004f)
                curveTo(7.336f, 22.004f, 7.001f, 21.668f, 7.001f, 21.254f)
                curveTo(7.001f, 20.84f, 7.336f, 20.504f, 7.751f, 20.504f)
                lineTo(8.237f, 20.504f)
                lineTo(13.807f, 6.473f)
                close()
                moveTo(17.359f, 16.0f)
                lineTo(14.503f, 8.785f)
                lineTo(11.639f, 16.0f)
                horizontalLineTo(17.359f)
                close()
            }
        }
        .build()
        return _textFont!!
    }

@Suppress("ObjectPropertyName")
private var _textFont: ImageVector? = null

@Preview
@Composable
private fun TextFontPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextFont, contentDescription = null)
    }
}

