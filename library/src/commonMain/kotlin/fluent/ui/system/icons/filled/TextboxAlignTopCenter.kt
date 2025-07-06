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
 * TextBoxAlignTopCenter Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent type layout within a container.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_textbox_align_top_center_24_filled.svg)
 * 
 * @return The [ImageVector] for the TextBoxAlignTopCenter icon.
 */
public val FluentIcons.Filled.TextBoxAlignTopCenter: ImageVector
    get() {
        if (_textBoxAlignTopCenter != null) {
            return _textBoxAlignTopCenter!!
        }
        _textBoxAlignTopCenter = Builder(name = "TextBoxAlignTopCenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(4.231f, 3.0f, 3.0f, 4.231f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.769f, 4.231f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21.0f, 21.0f, 19.769f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.231f, 19.769f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(7.25f, 7.0f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 7.0f, 17.5f, 7.336f, 17.5f, 7.75f)
                curveTo(17.5f, 8.164f, 17.164f, 8.5f, 16.75f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 8.5f, 6.5f, 8.164f, 6.5f, 7.75f)
                curveTo(6.5f, 7.336f, 6.836f, 7.0f, 7.25f, 7.0f)
                close()
                moveTo(9.25f, 11.0f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 11.0f, 15.5f, 11.336f, 15.5f, 11.75f)
                curveTo(15.5f, 12.164f, 15.164f, 12.5f, 14.75f, 12.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 12.5f, 8.5f, 12.164f, 8.5f, 11.75f)
                curveTo(8.5f, 11.336f, 8.836f, 11.0f, 9.25f, 11.0f)
                close()
            }
        }
        .build()
        return _textBoxAlignTopCenter!!
    }

@Suppress("ObjectPropertyName")
private var _textBoxAlignTopCenter: ImageVector? = null

@Preview
@Composable
private fun TextBoxAlignTopCenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBoxAlignTopCenter, contentDescription = "TextBoxAlignTopCenter Icon")
    }
}

