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
 * TextBox Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent type layout within a container.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_textbox_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextBox icon.
 */
public val FluentIcons.Regular.TextBox: ImageVector
    get() {
        if (_textBox != null) {
            return _textBox!!
        }
        _textBox = Builder(name = "TextBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.25f, 3.0f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.769f, 19.769f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                close()
                moveTo(14.25f, 11.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 11.507f)
                curveTo(6.282f, 11.557f, 6.0f, 11.87f, 6.0f, 12.25f)
                curveTo(6.0f, 12.664f, 6.336f, 13.0f, 6.75f, 13.0f)
                horizontalLineTo(14.25f)
                lineTo(14.352f, 12.993f)
                curveTo(14.718f, 12.943f, 15.0f, 12.63f, 15.0f, 12.25f)
                curveTo(15.0f, 11.836f, 14.664f, 11.5f, 14.25f, 11.5f)
                close()
                moveTo(6.75f, 15.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 15.5f, 18.0f, 15.836f, 18.0f, 16.25f)
                curveTo(18.0f, 16.63f, 17.718f, 16.944f, 17.352f, 16.993f)
                lineTo(17.25f, 17.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 17.0f, 6.0f, 16.664f, 6.0f, 16.25f)
                curveTo(6.0f, 15.87f, 6.282f, 15.557f, 6.648f, 15.507f)
                lineTo(6.75f, 15.5f)
                close()
                moveTo(17.25f, 7.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 7.507f)
                curveTo(6.282f, 7.557f, 6.0f, 7.87f, 6.0f, 8.25f)
                curveTo(6.0f, 8.664f, 6.336f, 9.0f, 6.75f, 9.0f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 8.993f)
                curveTo(17.718f, 8.943f, 18.0f, 8.63f, 18.0f, 8.25f)
                curveTo(18.0f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
                close()
            }
        }
        .build()
        return _textBox!!
    }

@Suppress("ObjectPropertyName")
private var _textBox: ImageVector? = null

@Preview
@Composable
private fun TextBoxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBox, contentDescription = "TextBox Icon")
    }
}

