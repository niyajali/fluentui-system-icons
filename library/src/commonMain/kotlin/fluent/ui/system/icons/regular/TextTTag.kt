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
 * TextTTag icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: text, ttag
 * - Source: ic_fluent_text_t_tag_16_regular.svg
 * 
 * @return The [ImageVector] for the TextTTag icon.
 */
public val FluentIcons.Regular.TextTTag: ImageVector
    get() {
        if (_textTTag != null) {
            return _textTTag!!
        }
        _textTTag = Builder(name = "TextTTag", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.5f)
                curveTo(4.0f, 3.224f, 4.224f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 3.0f, 12.0f, 3.224f, 12.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(12.0f, 4.776f, 11.776f, 5.0f, 11.5f, 5.0f)
                curveTo(11.224f, 5.0f, 11.0f, 4.776f, 11.0f, 4.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.276f, 12.0f, 9.5f, 12.224f, 9.5f, 12.5f)
                curveTo(9.5f, 12.776f, 9.276f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(7.0f)
                curveTo(6.724f, 13.0f, 6.5f, 12.776f, 6.5f, 12.5f)
                curveTo(6.5f, 12.224f, 6.724f, 12.0f, 7.0f, 12.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.5f)
                curveTo(5.0f, 4.776f, 4.776f, 5.0f, 4.5f, 5.0f)
                curveTo(4.224f, 5.0f, 4.0f, 4.776f, 4.0f, 4.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(4.354f, 6.646f)
                curveTo(4.549f, 6.842f, 4.549f, 7.158f, 4.354f, 7.354f)
                lineTo(2.207f, 9.5f)
                lineTo(4.354f, 11.646f)
                curveTo(4.549f, 11.842f, 4.549f, 12.158f, 4.354f, 12.354f)
                curveTo(4.158f, 12.549f, 3.842f, 12.549f, 3.646f, 12.354f)
                lineTo(1.146f, 9.854f)
                curveTo(0.951f, 9.658f, 0.951f, 9.342f, 1.146f, 9.146f)
                lineTo(3.646f, 6.646f)
                curveTo(3.842f, 6.451f, 4.158f, 6.451f, 4.354f, 6.646f)
                close()
                moveTo(14.854f, 9.146f)
                lineTo(12.354f, 6.646f)
                curveTo(12.158f, 6.451f, 11.842f, 6.451f, 11.646f, 6.646f)
                curveTo(11.451f, 6.842f, 11.451f, 7.158f, 11.646f, 7.354f)
                lineTo(13.793f, 9.5f)
                lineTo(11.646f, 11.646f)
                curveTo(11.451f, 11.842f, 11.451f, 12.158f, 11.646f, 12.354f)
                curveTo(11.842f, 12.549f, 12.158f, 12.549f, 12.354f, 12.354f)
                lineTo(14.854f, 9.854f)
                curveTo(15.049f, 9.658f, 15.049f, 9.342f, 14.854f, 9.146f)
                close()
            }
        }
        .build()
        return _textTTag!!
    }

@Suppress("ObjectPropertyName")
private var _textTTag: ImageVector? = null

@Preview
@Composable
private fun TextTTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextTTag, contentDescription = null)
    }
}

