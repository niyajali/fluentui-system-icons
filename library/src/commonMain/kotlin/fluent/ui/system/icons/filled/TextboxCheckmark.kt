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
 * TextBoxCheckmark Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent type layout within a container.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_textbox_checkmark_24_filled.svg)
 * 
 * @return The [ImageVector] for the TextBoxCheckmark icon.
 */
public val FluentIcons.Filled.TextBoxCheckmark: ImageVector
    get() {
        if (_textBoxCheckmark != null) {
            return _textBoxCheckmark!!
        }
        _textBoxCheckmark = Builder(name = "TextBoxCheckmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 11.0f)
                curveTo(18.789f, 11.0f, 19.99f, 11.375f, 21.0f, 12.022f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.231f, 19.769f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 3.0f, 3.0f, 4.231f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.769f, 4.231f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(12.022f)
                curveTo(11.375f, 19.99f, 11.0f, 18.789f, 11.0f, 17.5f)
                curveTo(11.0f, 17.16f, 11.026f, 16.826f, 11.076f, 16.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 16.493f)
                curveTo(6.282f, 16.444f, 6.0f, 16.13f, 6.0f, 15.75f)
                curveTo(6.0f, 15.336f, 6.336f, 15.0f, 6.75f, 15.0f)
                horizontalLineTo(11.498f)
                curveTo(11.906f, 14.023f, 12.545f, 13.167f, 13.346f, 12.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 12.493f)
                curveTo(6.282f, 12.443f, 6.0f, 12.13f, 6.0f, 11.75f)
                curveTo(6.0f, 11.336f, 6.336f, 11.0f, 6.75f, 11.0f)
                horizontalLineTo(14.25f)
                lineTo(14.352f, 11.007f)
                curveTo(14.638f, 11.046f, 14.874f, 11.247f, 14.962f, 11.514f)
                curveTo(15.742f, 11.183f, 16.6f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(6.75f, 8.5f)
                lineTo(6.648f, 8.493f)
                curveTo(6.282f, 8.443f, 6.0f, 8.13f, 6.0f, 7.75f)
                curveTo(6.0f, 7.336f, 6.336f, 7.0f, 6.75f, 7.0f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 7.007f)
                curveTo(17.718f, 7.057f, 18.0f, 7.37f, 18.0f, 7.75f)
                curveTo(18.0f, 8.164f, 17.664f, 8.5f, 17.25f, 8.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }
        .build()
        return _textBoxCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _textBoxCheckmark: ImageVector? = null

@Preview
@Composable
private fun TextBoxCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBoxCheckmark, contentDescription = "TextBoxCheckmark Icon")
    }
}

