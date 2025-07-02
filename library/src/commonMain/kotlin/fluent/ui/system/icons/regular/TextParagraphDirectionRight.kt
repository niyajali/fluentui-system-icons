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
 * TextParagraphDirectionRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, paragraph, direction, right
 * - Source: ic_fluent_text_paragraph_direction_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TextParagraphDirectionRight icon.
 */
public val FluentIcons.Regular.TextParagraphDirectionRight: ImageVector
    get() {
        if (_textParagraphDirectionRight != null) {
            return _textParagraphDirectionRight!!
        }
        _textParagraphDirectionRight = Builder(name = "TextParagraphDirectionRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                curveTo(8.0f, 5.462f, 10.462f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(20.045f)
                curveTo(20.573f, 3.0f, 21.0f, 3.336f, 21.0f, 3.75f)
                curveTo(21.0f, 4.13f, 20.641f, 4.443f, 20.175f, 4.493f)
                lineTo(20.045f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.208f)
                curveTo(19.5f, 21.645f, 19.164f, 22.0f, 18.75f, 22.0f)
                curveTo(18.336f, 22.0f, 18.0f, 21.645f, 18.0f, 21.208f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.208f)
                curveTo(16.5f, 21.645f, 16.164f, 22.0f, 15.75f, 22.0f)
                curveTo(15.336f, 22.0f, 15.0f, 21.645f, 15.0f, 21.208f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.5f)
                curveTo(10.462f, 14.0f, 8.0f, 11.538f, 8.0f, 8.5f)
                close()
                moveTo(15.0f, 4.5f)
                horizontalLineTo(13.5f)
                curveTo(11.291f, 4.5f, 9.5f, 6.291f, 9.5f, 8.5f)
                curveTo(9.5f, 10.709f, 11.291f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.08f, 14.858f)
                curveTo(3.824f, 15.059f, 3.453f, 15.048f, 3.209f, 14.818f)
                curveTo(2.941f, 14.565f, 2.929f, 14.142f, 3.182f, 13.874f)
                lineTo(4.896f, 12.0f)
                lineTo(3.182f, 10.126f)
                lineTo(3.12f, 10.049f)
                curveTo(2.933f, 9.782f, 2.966f, 9.412f, 3.209f, 9.182f)
                curveTo(3.477f, 8.929f, 3.9f, 8.941f, 4.153f, 9.209f)
                lineTo(6.299f, 11.542f)
                lineTo(6.364f, 11.623f)
                curveTo(6.539f, 11.878f, 6.517f, 12.227f, 6.299f, 12.458f)
                lineTo(4.153f, 14.791f)
                lineTo(4.08f, 14.858f)
                close()
            }
        }
        .build()
        return _textParagraphDirectionRight!!
    }

@Suppress("ObjectPropertyName")
private var _textParagraphDirectionRight: ImageVector? = null

@Preview
@Composable
private fun TextParagraphDirectionRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextParagraphDirectionRight, contentDescription = null)
    }
}

