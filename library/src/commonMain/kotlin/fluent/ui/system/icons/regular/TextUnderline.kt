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
 * TextUnderline Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_underline_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextUnderline icon.
 */
public val FluentIcons.Regular.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = Builder(name = "TextUnderline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 19.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 19.0f, 18.0f, 19.336f, 18.0f, 19.75f)
                curveTo(18.0f, 20.13f, 17.718f, 20.444f, 17.352f, 20.493f)
                lineTo(17.25f, 20.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 20.5f, 6.0f, 20.164f, 6.0f, 19.75f)
                curveTo(6.0f, 19.37f, 6.282f, 19.056f, 6.648f, 19.007f)
                lineTo(6.75f, 19.0f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(17.25f, 4.0f)
                curveTo(17.63f, 4.0f, 17.944f, 4.282f, 17.993f, 4.648f)
                lineTo(18.0f, 4.75f)
                verticalLineTo(10.75f)
                curveTo(18.0f, 15.144f, 15.937f, 17.5f, 11.997f, 17.5f)
                curveTo(8.142f, 17.5f, 6.086f, 15.245f, 6.003f, 11.034f)
                lineTo(6.0f, 10.75f)
                verticalLineTo(4.75f)
                curveTo(6.0f, 4.336f, 6.336f, 4.0f, 6.75f, 4.0f)
                curveTo(7.13f, 4.0f, 7.443f, 4.282f, 7.493f, 4.648f)
                lineTo(7.5f, 4.75f)
                verticalLineTo(10.751f)
                curveTo(7.496f, 14.357f, 8.933f, 16.0f, 11.997f, 16.0f)
                curveTo(14.982f, 16.0f, 16.425f, 14.439f, 16.497f, 11.024f)
                lineTo(16.5f, 10.75f)
                verticalLineTo(4.75f)
                curveTo(16.5f, 4.336f, 16.836f, 4.0f, 17.25f, 4.0f)
                close()
            }
        }
        .build()
        return _textUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _textUnderline: ImageVector? = null

@Preview
@Composable
private fun TextUnderlinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextUnderline, contentDescription = "TextUnderline Icon")
    }
}

