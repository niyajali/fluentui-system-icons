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
 * TextHeader1LinesCaret icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, header1lines, caret
 * - Source: ic_fluent_text_header_1_lines_caret_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHeader1LinesCaret icon.
 */
public val FluentIcons.Regular.TextHeader1LinesCaret: ImageVector
    get() {
        if (_textHeader1LinesCaret != null) {
            return _textHeader1LinesCaret!!
        }
        _textHeader1LinesCaret = Builder(name = "TextHeader1LinesCaret", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 2.75f)
                curveTo(14.5f, 2.402f, 14.261f, 2.1f, 13.922f, 2.02f)
                curveTo(13.584f, 1.94f, 13.235f, 2.103f, 13.079f, 2.415f)
                curveTo(12.811f, 2.952f, 12.397f, 3.372f, 12.031f, 3.664f)
                curveTo(11.851f, 3.809f, 11.69f, 3.916f, 11.576f, 3.986f)
                curveTo(11.519f, 4.021f, 11.474f, 4.047f, 11.446f, 4.062f)
                curveTo(11.432f, 4.07f, 11.422f, 4.075f, 11.417f, 4.078f)
                lineTo(11.412f, 4.08f)
                curveTo(11.043f, 4.266f, 10.894f, 4.716f, 11.079f, 5.085f)
                curveTo(11.264f, 5.456f, 11.715f, 5.606f, 12.085f, 5.421f)
                lineTo(12.087f, 5.42f)
                lineTo(12.09f, 5.419f)
                lineTo(12.096f, 5.416f)
                lineTo(12.113f, 5.406f)
                curveTo(12.128f, 5.399f, 12.147f, 5.389f, 12.171f, 5.375f)
                curveTo(12.218f, 5.349f, 12.283f, 5.312f, 12.362f, 5.264f)
                curveTo(12.519f, 5.167f, 12.732f, 5.025f, 12.969f, 4.836f)
                lineTo(13.0f, 4.81f)
                verticalLineTo(10.25f)
                curveTo(13.0f, 10.664f, 13.336f, 11.0f, 13.75f, 11.0f)
                curveTo(14.164f, 11.0f, 14.5f, 10.664f, 14.5f, 10.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(2.75f, 2.0f)
                curveTo(3.164f, 2.0f, 3.5f, 2.336f, 3.5f, 2.75f)
                lineTo(3.5f, 5.5f)
                horizontalLineTo(7.5f)
                lineTo(7.5f, 2.752f)
                curveTo(7.5f, 2.337f, 7.836f, 2.002f, 8.25f, 2.002f)
                curveTo(8.664f, 2.002f, 9.0f, 2.337f, 9.0f, 2.752f)
                lineTo(9.0f, 10.244f)
                curveTo(9.0f, 10.659f, 8.664f, 10.994f, 8.25f, 10.994f)
                curveTo(7.836f, 10.994f, 7.5f, 10.659f, 7.5f, 10.244f)
                verticalLineTo(7.0f)
                lineTo(3.5f, 7.0f)
                lineTo(3.5f, 10.25f)
                curveTo(3.5f, 10.664f, 3.164f, 11.0f, 2.75f, 11.0f)
                curveTo(2.336f, 11.0f, 2.0f, 10.664f, 2.0f, 10.25f)
                verticalLineTo(2.75f)
                curveTo(2.0f, 2.336f, 2.336f, 2.0f, 2.75f, 2.0f)
                close()
                moveTo(17.557f, 5.462f)
                curveTo(17.673f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
                horizontalLineTo(21.252f)
                curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
                curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.28f)
                lineTo(20.282f, 7.78f)
                curveTo(19.989f, 8.073f, 19.514f, 8.073f, 19.22f, 7.78f)
                lineTo(17.72f, 6.28f)
                curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.557f, 5.462f)
                close()
                moveTo(2.75f, 19.0f)
                curveTo(2.336f, 19.0f, 2.0f, 19.336f, 2.0f, 19.75f)
                curveTo(2.0f, 20.164f, 2.336f, 20.5f, 2.75f, 20.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 20.5f, 22.0f, 20.164f, 22.0f, 19.75f)
                curveTo(22.0f, 19.336f, 21.664f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 14.75f)
                curveTo(2.0f, 14.336f, 2.336f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 14.0f, 22.0f, 14.336f, 22.0f, 14.75f)
                curveTo(22.0f, 15.164f, 21.664f, 15.5f, 21.25f, 15.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 15.5f, 2.0f, 15.164f, 2.0f, 14.75f)
                close()
            }
        }
        .build()
        return _textHeader1LinesCaret!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader1LinesCaret: ImageVector? = null

@Preview
@Composable
private fun TextHeader1LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader1LinesCaret, contentDescription = null)
    }
}

