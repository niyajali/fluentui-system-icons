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
 * TextBoxAlignMiddleRotate90 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent type layout within a container.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_textbox_align_middle_rotate_90_24_filled.svg)
 * 
 * @return The [ImageVector] for the TextBoxAlignMiddleRotate90 icon.
 */
public val FluentIcons.Filled.TextBoxAlignMiddleRotate90: ImageVector
    get() {
        if (_textBoxAlignMiddleRotate90 != null) {
            return _textBoxAlignMiddleRotate90!!
        }
        _textBoxAlignMiddleRotate90 = Builder(name = "TextBoxAlignMiddleRotate90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 5.75f)
                curveTo(21.0f, 4.231f, 19.769f, 3.0f, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                curveTo(4.231f, 3.0f, 3.0f, 4.231f, 3.0f, 5.75f)
                lineTo(3.0f, 18.25f)
                curveTo(3.0f, 19.769f, 4.231f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21.0f, 21.0f, 19.769f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(15.0f, 7.25f)
                lineTo(15.0f, 16.75f)
                curveTo(15.0f, 17.164f, 14.664f, 17.5f, 14.25f, 17.5f)
                curveTo(13.836f, 17.5f, 13.5f, 17.164f, 13.5f, 16.75f)
                lineTo(13.5f, 7.25f)
                curveTo(13.5f, 6.836f, 13.836f, 6.5f, 14.25f, 6.5f)
                curveTo(14.664f, 6.5f, 15.0f, 6.836f, 15.0f, 7.25f)
                close()
                moveTo(11.0f, 7.25f)
                lineTo(11.0f, 16.75f)
                curveTo(11.0f, 17.164f, 10.664f, 17.5f, 10.25f, 17.5f)
                curveTo(9.836f, 17.5f, 9.5f, 17.164f, 9.5f, 16.75f)
                lineTo(9.5f, 7.25f)
                curveTo(9.5f, 6.836f, 9.836f, 6.5f, 10.25f, 6.5f)
                curveTo(10.664f, 6.5f, 11.0f, 6.836f, 11.0f, 7.25f)
                close()
            }
        }
        .build()
        return _textBoxAlignMiddleRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _textBoxAlignMiddleRotate90: ImageVector? = null

@Preview
@Composable
private fun TextBoxAlignMiddleRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBoxAlignMiddleRotate90, contentDescription = "TextBoxAlignMiddleRotate90 Icon")
    }
}

