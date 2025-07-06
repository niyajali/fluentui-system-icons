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
 * TextItalic Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_italic_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextItalic icon.
 */
public val FluentIcons.Regular.TextItalic: ImageVector
    get() {
        if (_textItalic != null) {
            return _textItalic!!
        }
        _textItalic = Builder(name = "TextItalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.751f, 4.0f)
                horizontalLineTo(18.254f)
                curveTo(18.668f, 4.0f, 19.004f, 4.336f, 19.004f, 4.75f)
                curveTo(19.004f, 5.129f, 18.722f, 5.443f, 18.356f, 5.493f)
                lineTo(18.254f, 5.499f)
                lineTo(15.057f, 5.499f)
                lineTo(10.037f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(14.629f, 18.5f, 14.943f, 18.782f, 14.992f, 19.148f)
                lineTo(14.999f, 19.25f)
                curveTo(14.999f, 19.629f, 14.717f, 19.944f, 14.351f, 19.993f)
                lineTo(14.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 20.0f, 4.004f, 19.664f, 4.004f, 19.25f)
                curveTo(4.004f, 18.871f, 4.283f, 18.556f, 4.649f, 18.507f)
                lineTo(4.75f, 18.5f)
                horizontalLineTo(8.435f)
                lineTo(8.456f, 18.435f)
                lineTo(13.45f, 5.499f)
                lineTo(9.751f, 5.499f)
                curveTo(9.371f, 5.499f, 9.057f, 5.217f, 9.008f, 4.851f)
                lineTo(9.001f, 4.75f)
                curveTo(9.001f, 4.37f, 9.283f, 4.056f, 9.649f, 4.007f)
                lineTo(9.751f, 4.0f)
                horizontalLineTo(18.254f)
                horizontalLineTo(9.751f)
                close()
            }
        }
        .build()
        return _textItalic!!
    }

@Suppress("ObjectPropertyName")
private var _textItalic: ImageVector? = null

@Preview
@Composable
private fun TextItalicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextItalic, contentDescription = "TextItalic Icon")
    }
}

