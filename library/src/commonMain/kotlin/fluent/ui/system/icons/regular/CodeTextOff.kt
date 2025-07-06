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
 * CodeTextOff Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent code text off.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_text_off_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeTextOff icon.
 */
public val FluentIcons.Regular.CodeTextOff: ImageVector
    get() {
        if (_codeTextOff != null) {
            return _codeTextOff!!
        }
        _codeTextOff = Builder(name = "CodeTextOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.122f, 3.999f)
                lineTo(5.122f, 2.999f)
                horizontalLineTo(7.0f)
                curveTo(7.276f, 2.999f, 7.5f, 3.223f, 7.5f, 3.499f)
                curveTo(7.5f, 3.775f, 7.276f, 3.999f, 7.0f, 3.999f)
                horizontalLineTo(6.122f)
                close()
                moveTo(9.5f, 3.999f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 3.999f, 15.0f, 3.775f, 15.0f, 3.499f)
                curveTo(15.0f, 3.223f, 14.776f, 2.999f, 14.5f, 2.999f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 2.999f, 9.0f, 3.223f, 9.0f, 3.499f)
                curveTo(9.0f, 3.775f, 9.224f, 3.999f, 9.5f, 3.999f)
                close()
                moveTo(10.0f, 5.999f)
                curveTo(9.724f, 5.999f, 9.5f, 6.223f, 9.5f, 6.499f)
                curveTo(9.5f, 6.775f, 9.724f, 6.999f, 10.0f, 6.999f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 6.999f, 14.0f, 6.775f, 14.0f, 6.499f)
                curveTo(14.0f, 6.223f, 13.776f, 5.999f, 13.5f, 5.999f)
                horizontalLineTo(10.0f)
                close()
                moveTo(9.0f, 11.999f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 11.999f, 1.0f, 12.223f, 1.0f, 12.499f)
                curveTo(1.0f, 12.775f, 1.224f, 12.999f, 1.5f, 12.999f)
                horizontalLineTo(9.0f)
                curveTo(9.276f, 12.999f, 9.5f, 12.775f, 9.5f, 12.499f)
                curveTo(9.5f, 12.223f, 9.276f, 11.999f, 9.0f, 11.999f)
                close()
                moveTo(14.854f, 14.145f)
                lineTo(1.853f, 1.146f)
                curveTo(1.658f, 0.951f, 1.341f, 0.951f, 1.146f, 1.146f)
                curveTo(0.951f, 1.341f, 0.951f, 1.658f, 1.146f, 1.853f)
                lineTo(2.292f, 2.999f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 2.999f, 1.0f, 3.223f, 1.0f, 3.499f)
                curveTo(1.0f, 3.775f, 1.224f, 3.999f, 1.5f, 3.999f)
                horizontalLineTo(3.292f)
                lineTo(5.292f, 5.999f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 5.999f, 4.0f, 6.223f, 4.0f, 6.499f)
                curveTo(4.0f, 6.775f, 4.224f, 6.999f, 4.5f, 6.999f)
                horizontalLineTo(6.292f)
                lineTo(8.292f, 8.999f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 8.999f, 3.0f, 9.223f, 3.0f, 9.499f)
                curveTo(3.0f, 9.775f, 3.224f, 9.999f, 3.5f, 9.999f)
                horizontalLineTo(9.292f)
                lineTo(14.146f, 14.853f)
                curveTo(14.244f, 14.95f, 14.372f, 14.999f, 14.5f, 14.999f)
                curveTo(14.628f, 14.998f, 14.756f, 14.95f, 14.854f, 14.852f)
                curveTo(15.049f, 14.657f, 15.049f, 14.34f, 14.854f, 14.145f)
                close()
            }
        }
        .build()
        return _codeTextOff!!
    }

@Suppress("ObjectPropertyName")
private var _codeTextOff: ImageVector? = null

@Preview
@Composable
private fun CodeTextOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeTextOff, contentDescription = "CodeTextOff Icon")
    }
}

