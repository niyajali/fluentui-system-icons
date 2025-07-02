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
 * TextIndentDecreaseRotate270 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, indent, decrease, rotate270
 * - Source: ic_fluent_text_indent_decrease_rotate_270_24_regular.svg
 * 
 * @return The [ImageVector] for the TextIndentDecreaseRotate270 icon.
 */
public val FluentIcons.Regular.TextIndentDecreaseRotate270: ImageVector
    get() {
        if (_textIndentDecreaseRotate270 != null) {
            return _textIndentDecreaseRotate270!!
        }
        _textIndentDecreaseRotate270 = Builder(name = "TextIndentDecreaseRotate270", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 6.25f)
                curveTo(16.0f, 5.836f, 16.336f, 5.5f, 16.75f, 5.5f)
                curveTo(17.164f, 5.5f, 17.5f, 5.836f, 17.5f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 15.664f, 17.164f, 16.0f, 16.75f, 16.0f)
                curveTo(16.336f, 16.0f, 16.0f, 15.664f, 16.0f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.22f, 21.28f)
                lineTo(9.22f, 19.28f)
                curveTo(8.927f, 18.987f, 8.927f, 18.513f, 9.22f, 18.22f)
                curveTo(9.486f, 17.953f, 9.903f, 17.929f, 10.196f, 18.147f)
                lineTo(10.28f, 18.22f)
                lineTo(11.75f, 19.689f)
                lineTo(13.22f, 18.22f)
                curveTo(13.513f, 17.927f, 13.987f, 17.927f, 14.28f, 18.22f)
                curveTo(14.547f, 18.486f, 14.571f, 18.903f, 14.353f, 19.196f)
                lineTo(14.28f, 19.28f)
                lineTo(12.28f, 21.28f)
                curveTo(12.014f, 21.547f, 11.597f, 21.571f, 11.304f, 21.353f)
                lineTo(11.22f, 21.28f)
                close()
                moveTo(11.0f, 3.25f)
                curveTo(11.0f, 2.836f, 11.336f, 2.5f, 11.75f, 2.5f)
                curveTo(12.164f, 2.5f, 12.5f, 2.836f, 12.5f, 3.25f)
                verticalLineTo(15.25f)
                curveTo(12.5f, 15.664f, 12.164f, 16.0f, 11.75f, 16.0f)
                curveTo(11.336f, 16.0f, 11.0f, 15.664f, 11.0f, 15.25f)
                verticalLineTo(3.25f)
                close()
                moveTo(6.0f, 6.25f)
                curveTo(6.0f, 5.836f, 6.336f, 5.5f, 6.75f, 5.5f)
                curveTo(7.164f, 5.5f, 7.5f, 5.836f, 7.5f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(7.5f, 15.664f, 7.164f, 16.0f, 6.75f, 16.0f)
                curveTo(6.336f, 16.0f, 6.0f, 15.664f, 6.0f, 15.25f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _textIndentDecreaseRotate270!!
    }

@Suppress("ObjectPropertyName")
private var _textIndentDecreaseRotate270: ImageVector? = null

@Preview
@Composable
private fun TextIndentDecreaseRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextIndentDecreaseRotate270, contentDescription = null)
    }
}

