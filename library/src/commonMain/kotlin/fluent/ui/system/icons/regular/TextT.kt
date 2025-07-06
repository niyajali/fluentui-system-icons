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
 * TextT Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general type & text creation scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_t_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextT icon.
 */
public val FluentIcons.Regular.TextT: ImageVector
    get() {
        if (_textT != null) {
            return _textT!!
        }
        _textT = Builder(name = "TextT", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.75f)
                curveTo(5.0f, 4.336f, 5.336f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 4.0f, 19.0f, 4.336f, 19.0f, 4.75f)
                verticalLineTo(6.75f)
                curveTo(19.0f, 7.164f, 18.664f, 7.5f, 18.25f, 7.5f)
                curveTo(17.836f, 7.5f, 17.5f, 7.164f, 17.5f, 6.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 18.5f, 15.0f, 18.836f, 15.0f, 19.25f)
                curveTo(15.0f, 19.664f, 14.664f, 20.0f, 14.25f, 20.0f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 20.0f, 9.0f, 19.664f, 9.0f, 19.25f)
                curveTo(9.0f, 18.836f, 9.336f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 5.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(6.75f)
                curveTo(6.5f, 7.164f, 6.164f, 7.5f, 5.75f, 7.5f)
                curveTo(5.336f, 7.5f, 5.0f, 7.164f, 5.0f, 6.75f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _textT!!
    }

@Suppress("ObjectPropertyName")
private var _textT: ImageVector? = null

@Preview
@Composable
private fun TextTPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextT, contentDescription = "TextT Icon")
    }
}

