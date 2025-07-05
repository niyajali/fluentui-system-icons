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
 * TextHeader3Lines Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, loop
 * - Description: Used to represent blocks of text witha section header.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_header_3_lines_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextHeader3Lines icon.
 */
public val FluentIcons.Regular.TextHeader3Lines: ImageVector
    get() {
        if (_textHeader3Lines != null) {
            return _textHeader3Lines!!
        }
        _textHeader3Lines = Builder(name = "TextHeader3Lines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 2.75f)
                curveTo(3.5f, 2.336f, 3.164f, 2.0f, 2.75f, 2.0f)
                curveTo(2.336f, 2.0f, 2.0f, 2.336f, 2.0f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 10.664f, 2.336f, 11.0f, 2.75f, 11.0f)
                curveTo(3.164f, 11.0f, 3.5f, 10.664f, 3.5f, 10.25f)
                lineTo(3.5f, 7.0f)
                lineTo(7.5f, 7.0f)
                verticalLineTo(10.244f)
                curveTo(7.5f, 10.659f, 7.836f, 10.994f, 8.25f, 10.994f)
                curveTo(8.664f, 10.994f, 9.0f, 10.659f, 9.0f, 10.244f)
                lineTo(9.0f, 2.752f)
                curveTo(9.0f, 2.337f, 8.664f, 2.002f, 8.25f, 2.002f)
                curveTo(7.836f, 2.002f, 7.5f, 2.337f, 7.5f, 2.752f)
                lineTo(7.5f, 5.5f)
                horizontalLineTo(3.5f)
                lineTo(3.5f, 2.75f)
                close()
                moveTo(2.0f, 19.75f)
                curveTo(2.0f, 19.336f, 2.336f, 19.0f, 2.75f, 19.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.0f, 22.0f, 19.336f, 22.0f, 19.75f)
                curveTo(22.0f, 20.164f, 21.664f, 20.5f, 21.25f, 20.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 20.5f, 2.0f, 20.164f, 2.0f, 19.75f)
                close()
                moveTo(2.75f, 14.0f)
                curveTo(2.336f, 14.0f, 2.0f, 14.336f, 2.0f, 14.75f)
                curveTo(2.0f, 15.164f, 2.336f, 15.5f, 2.75f, 15.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 15.5f, 22.0f, 15.164f, 22.0f, 14.75f)
                curveTo(22.0f, 14.336f, 21.664f, 14.0f, 21.25f, 14.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(14.585f, 3.577f)
                curveTo(13.902f, 3.371f, 12.866f, 3.592f, 12.294f, 4.193f)
                curveTo(12.008f, 4.494f, 11.533f, 4.506f, 11.233f, 4.22f)
                curveTo(10.933f, 3.935f, 10.921f, 3.46f, 11.206f, 3.16f)
                curveTo(12.189f, 2.126f, 13.822f, 1.78f, 15.019f, 2.141f)
                curveTo(15.83f, 2.386f, 16.481f, 2.943f, 16.797f, 3.661f)
                curveTo(17.121f, 4.395f, 17.073f, 5.261f, 16.542f, 6.006f)
                curveTo(16.403f, 6.2f, 16.251f, 6.364f, 16.09f, 6.502f)
                curveTo(16.251f, 6.64f, 16.403f, 6.804f, 16.542f, 6.998f)
                curveTo(17.073f, 7.744f, 17.121f, 8.609f, 16.797f, 9.343f)
                curveTo(16.481f, 10.061f, 15.83f, 10.618f, 15.019f, 10.863f)
                curveTo(13.822f, 11.225f, 12.189f, 10.878f, 11.206f, 9.844f)
                curveTo(10.921f, 9.544f, 10.933f, 9.069f, 11.233f, 8.784f)
                curveTo(11.533f, 8.499f, 12.008f, 8.511f, 12.294f, 8.811f)
                curveTo(12.866f, 9.412f, 13.902f, 9.634f, 14.585f, 9.427f)
                curveTo(15.014f, 9.298f, 15.3f, 9.022f, 15.424f, 8.739f)
                curveTo(15.542f, 8.473f, 15.534f, 8.169f, 15.32f, 7.868f)
                curveTo(14.926f, 7.316f, 14.26f, 7.257f, 13.484f, 7.252f)
                lineTo(13.355f, 7.252f)
                curveTo(12.941f, 7.252f, 12.605f, 6.916f, 12.605f, 6.502f)
                curveTo(12.605f, 6.088f, 12.941f, 5.752f, 13.355f, 5.752f)
                lineTo(13.484f, 5.752f)
                curveTo(14.26f, 5.747f, 14.926f, 5.689f, 15.32f, 5.136f)
                curveTo(15.534f, 4.835f, 15.542f, 4.532f, 15.424f, 4.265f)
                curveTo(15.3f, 3.982f, 15.014f, 3.706f, 14.585f, 3.577f)
                close()
            }
        }
        .build()
        return _textHeader3Lines!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader3Lines: ImageVector? = null

@Preview
@Composable
private fun TextHeader3LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader3Lines, contentDescription = "TextHeader3Lines Icon")
    }
}

