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
 * TextHeader2LinesCaret Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, loop
 * - Description: Used to represent blocks of text with an expandable section header.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_header_2_lines_caret_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextHeader2LinesCaret icon.
 */
public val FluentIcons.Regular.TextHeader2LinesCaret: ImageVector
    get() {
        if (_textHeader2LinesCaret != null) {
            return _textHeader2LinesCaret!!
        }
        _textHeader2LinesCaret = Builder(name = "TextHeader2LinesCaret", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.931f, 4.351f)
                curveTo(12.235f, 3.694f, 13.049f, 3.329f, 13.698f, 3.582f)
                curveTo(14.48f, 3.887f, 14.787f, 4.843f, 14.371f, 5.491f)
                curveTo(14.175f, 5.797f, 13.878f, 6.101f, 13.497f, 6.429f)
                curveTo(13.264f, 6.63f, 13.039f, 6.808f, 12.804f, 6.995f)
                curveTo(12.633f, 7.13f, 12.457f, 7.27f, 12.267f, 7.427f)
                curveTo(11.852f, 7.769f, 11.42f, 8.157f, 11.091f, 8.6f)
                curveTo(10.755f, 9.053f, 10.5f, 9.6f, 10.5f, 10.25f)
                curveTo(10.5f, 10.664f, 10.836f, 11.0f, 11.25f, 11.0f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 11.0f, 16.5f, 10.664f, 16.5f, 10.25f)
                curveTo(16.5f, 9.836f, 16.164f, 9.5f, 15.75f, 9.5f)
                horizontalLineTo(12.291f)
                lineTo(12.296f, 9.494f)
                curveTo(12.511f, 9.203f, 12.826f, 8.91f, 13.222f, 8.584f)
                curveTo(13.361f, 8.469f, 13.522f, 8.341f, 13.689f, 8.208f)
                curveTo(13.953f, 7.998f, 14.234f, 7.774f, 14.477f, 7.565f)
                curveTo(14.895f, 7.204f, 15.321f, 6.788f, 15.634f, 6.301f)
                curveTo(16.595f, 4.802f, 15.848f, 2.811f, 14.243f, 2.185f)
                curveTo(12.764f, 1.609f, 11.165f, 2.436f, 10.569f, 3.721f)
                curveTo(10.395f, 4.096f, 10.559f, 4.542f, 10.935f, 4.716f)
                curveTo(11.31f, 4.891f, 11.756f, 4.727f, 11.931f, 4.351f)
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
                horizontalLineTo(3.5f)
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
        return _textHeader2LinesCaret!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader2LinesCaret: ImageVector? = null

@Preview
@Composable
private fun TextHeader2LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader2LinesCaret, contentDescription = "TextHeader2LinesCaret Icon")
    }
}

