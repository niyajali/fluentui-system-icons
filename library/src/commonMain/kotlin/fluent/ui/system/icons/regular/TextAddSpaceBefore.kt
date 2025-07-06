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
 * TextAddSpaceBefore Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in adding spacing before or after blocks of text.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_add_space_before_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextAddSpaceBefore icon.
 */
public val FluentIcons.Regular.TextAddSpaceBefore: ImageVector
    get() {
        if (_textAddSpaceBefore != null) {
            return _textAddSpaceBefore!!
        }
        _textAddSpaceBefore = Builder(name = "TextAddSpaceBefore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.47f, 6.28f)
                curveTo(9.177f, 5.987f, 9.177f, 5.513f, 9.47f, 5.22f)
                curveTo(9.763f, 4.927f, 10.237f, 4.927f, 10.53f, 5.22f)
                lineTo(12.0f, 6.689f)
                lineTo(13.47f, 5.22f)
                curveTo(13.763f, 4.927f, 14.237f, 4.927f, 14.53f, 5.22f)
                curveTo(14.823f, 5.513f, 14.823f, 5.987f, 14.53f, 6.28f)
                lineTo(12.53f, 8.28f)
                curveTo(12.237f, 8.573f, 11.763f, 8.573f, 11.47f, 8.28f)
                lineTo(9.47f, 6.28f)
                close()
                moveTo(3.0f, 11.75f)
                curveTo(3.0f, 11.336f, 3.336f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 11.0f, 21.0f, 11.336f, 21.0f, 11.75f)
                curveTo(21.0f, 12.164f, 20.664f, 12.5f, 20.25f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 12.5f, 3.0f, 12.164f, 3.0f, 11.75f)
                close()
                moveTo(3.0f, 17.75f)
                curveTo(3.0f, 17.336f, 3.336f, 17.0f, 3.75f, 17.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 17.0f, 21.0f, 17.336f, 21.0f, 17.75f)
                curveTo(21.0f, 18.164f, 20.664f, 18.5f, 20.25f, 18.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 18.5f, 3.0f, 18.164f, 3.0f, 17.75f)
                close()
            }
        }
        .build()
        return _textAddSpaceBefore!!
    }

@Suppress("ObjectPropertyName")
private var _textAddSpaceBefore: ImageVector? = null

@Preview
@Composable
private fun TextAddSpaceBeforePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAddSpaceBefore, contentDescription = "TextAddSpaceBefore Icon")
    }
}

