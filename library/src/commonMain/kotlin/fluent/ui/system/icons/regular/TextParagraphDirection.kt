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
 * TextParagraphDirection Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_paragraph_direction_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextParagraphDirection icon.
 */
public val FluentIcons.Regular.TextParagraphDirection: ImageVector
    get() {
        if (_textParagraphDirection != null) {
            return _textParagraphDirection!!
        }
        _textParagraphDirection = Builder(name = "TextParagraphDirection", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                curveTo(10.462f, 3.0f, 8.0f, 5.462f, 8.0f, 8.5f)
                curveTo(8.0f, 11.538f, 10.462f, 14.0f, 13.5f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.208f)
                curveTo(15.0f, 21.645f, 15.336f, 22.0f, 15.75f, 22.0f)
                curveTo(16.164f, 22.0f, 16.5f, 21.645f, 16.5f, 21.208f)
                verticalLineTo(4.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.208f)
                curveTo(18.0f, 21.645f, 18.336f, 22.0f, 18.75f, 22.0f)
                curveTo(19.164f, 22.0f, 19.5f, 21.645f, 19.5f, 21.208f)
                verticalLineTo(4.5f)
                horizontalLineTo(20.045f)
                lineTo(20.175f, 4.493f)
                curveTo(20.641f, 4.443f, 21.0f, 4.13f, 21.0f, 3.75f)
                curveTo(21.0f, 3.336f, 20.573f, 3.0f, 20.045f, 3.0f)
                horizontalLineTo(13.5f)
                close()
                moveTo(13.5f, 4.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.5f)
                curveTo(11.291f, 12.5f, 9.5f, 10.709f, 9.5f, 8.5f)
                curveTo(9.5f, 6.291f, 11.291f, 4.5f, 13.5f, 4.5f)
                close()
                moveTo(4.08f, 11.858f)
                curveTo(3.824f, 12.059f, 3.453f, 12.048f, 3.209f, 11.818f)
                curveTo(2.941f, 11.565f, 2.929f, 11.142f, 3.182f, 10.874f)
                lineTo(4.896f, 9.0f)
                lineTo(3.182f, 7.126f)
                lineTo(3.12f, 7.049f)
                curveTo(2.933f, 6.782f, 2.966f, 6.412f, 3.209f, 6.182f)
                curveTo(3.477f, 5.929f, 3.9f, 5.941f, 4.153f, 6.209f)
                lineTo(6.299f, 8.542f)
                lineTo(6.364f, 8.623f)
                curveTo(6.539f, 8.878f, 6.517f, 9.227f, 6.299f, 9.458f)
                lineTo(4.153f, 11.791f)
                lineTo(4.08f, 11.858f)
                close()
                moveTo(5.401f, 19.858f)
                curveTo(5.657f, 20.059f, 6.028f, 20.048f, 6.272f, 19.818f)
                curveTo(6.54f, 19.565f, 6.552f, 19.142f, 6.299f, 18.874f)
                lineTo(4.585f, 17.0f)
                lineTo(6.299f, 15.126f)
                lineTo(6.361f, 15.049f)
                curveTo(6.547f, 14.782f, 6.515f, 14.412f, 6.272f, 14.182f)
                curveTo(6.004f, 13.929f, 5.581f, 13.941f, 5.328f, 14.209f)
                lineTo(3.182f, 16.542f)
                lineTo(3.117f, 16.623f)
                curveTo(2.942f, 16.878f, 2.964f, 17.227f, 3.182f, 17.458f)
                lineTo(5.328f, 19.791f)
                lineTo(5.401f, 19.858f)
                close()
            }
        }
        .build()
        return _textParagraphDirection!!
    }

@Suppress("ObjectPropertyName")
private var _textParagraphDirection: ImageVector? = null

@Preview
@Composable
private fun TextParagraphDirectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextParagraphDirection, contentDescription = "TextParagraphDirection Icon")
    }
}

