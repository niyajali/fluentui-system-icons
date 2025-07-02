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
 * TextWrapOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, wrap, off
 * - Source: ic_fluent_text_wrap_off_24_regular.svg
 * 
 * @return The [ImageVector] for the TextWrapOff icon.
 */
public val FluentIcons.Regular.TextWrapOff: ImageVector
    get() {
        if (_textWrapOff != null) {
            return _textWrapOff!!
        }
        _textWrapOff = Builder(name = "TextWrapOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.939f, 5.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(5.439f)
                lineTo(10.439f, 11.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11.5f, 2.0f, 11.836f, 2.0f, 12.25f)
                curveTo(2.0f, 12.664f, 2.336f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(11.939f)
                lineTo(14.973f, 16.034f)
                curveTo(14.715f, 15.954f, 14.424f, 16.016f, 14.22f, 16.22f)
                lineTo(12.22f, 18.22f)
                curveTo(11.927f, 18.513f, 11.927f, 18.987f, 12.22f, 19.28f)
                lineTo(14.22f, 21.28f)
                curveTo(14.513f, 21.573f, 14.987f, 21.573f, 15.28f, 21.28f)
                curveTo(15.573f, 20.987f, 15.573f, 20.513f, 15.28f, 20.22f)
                lineTo(14.561f, 19.5f)
                horizontalLineTo(18.439f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.939f, 18.0f)
                horizontalLineTo(14.561f)
                lineTo(15.28f, 17.28f)
                curveTo(15.484f, 17.076f, 15.546f, 16.785f, 15.466f, 16.527f)
                lineTo(16.939f, 18.0f)
                close()
                moveTo(19.0f, 11.5f)
                horizontalLineTo(14.681f)
                lineTo(16.181f, 13.0f)
                horizontalLineTo(19.0f)
                curveTo(20.381f, 13.0f, 21.5f, 14.119f, 21.5f, 15.5f)
                curveTo(21.5f, 16.271f, 21.15f, 16.961f, 20.601f, 17.42f)
                lineTo(21.665f, 18.483f)
                curveTo(22.484f, 17.751f, 23.0f, 16.686f, 23.0f, 15.5f)
                curveTo(23.0f, 13.291f, 21.209f, 11.5f, 19.0f, 11.5f)
                close()
                moveTo(8.182f, 5.0f)
                lineTo(9.682f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22.0f, 6.164f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(8.182f)
                close()
                moveTo(2.0f, 18.75f)
                curveTo(2.0f, 18.336f, 2.336f, 18.0f, 2.75f, 18.0f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 18.0f, 10.0f, 18.336f, 10.0f, 18.75f)
                curveTo(10.0f, 19.164f, 9.664f, 19.5f, 9.25f, 19.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 19.5f, 2.0f, 19.164f, 2.0f, 18.75f)
                close()
            }
        }
        .build()
        return _textWrapOff!!
    }

@Suppress("ObjectPropertyName")
private var _textWrapOff: ImageVector? = null

@Preview
@Composable
private fun TextWrapOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextWrapOff, contentDescription = null)
    }
}

