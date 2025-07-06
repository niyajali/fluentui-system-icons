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
 * ArrowWrapOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for text/shape wrapping scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_wrap_off_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowWrapOff icon.
 */
public val FluentIcons.Regular.ArrowWrapOff: ImageVector
    get() {
        if (_arrowWrapOff != null) {
            return _arrowWrapOff!!
        }
        _arrowWrapOff = Builder(name = "ArrowWrapOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.325f, 4.032f)
                curveTo(3.135f, 4.103f, 3.0f, 4.286f, 3.0f, 4.5f)
                curveTo(3.0f, 4.776f, 3.224f, 5.0f, 3.5f, 5.0f)
                horizontalLineTo(4.293f)
                lineTo(8.293f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 9.0f, 3.0f, 10.343f, 3.0f, 12.0f)
                curveTo(3.0f, 13.657f, 4.343f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(14.293f)
                lineTo(15.646f, 16.353f)
                curveTo(15.646f, 16.353f, 15.646f, 16.353f, 15.646f, 16.353f)
                curveTo(15.646f, 16.353f, 15.647f, 16.354f, 15.647f, 16.354f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(13.293f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 14.0f, 4.0f, 13.105f, 4.0f, 12.0f)
                curveTo(4.0f, 10.895f, 4.895f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(9.293f)
                lineTo(13.293f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                horizontalLineTo(11.121f)
                lineTo(12.121f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 10.0f, 17.0f, 8.657f, 17.0f, 7.0f)
                curveTo(17.0f, 5.343f, 15.657f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(6.121f)
                lineTo(7.121f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 5.0f, 16.0f, 5.895f, 16.0f, 7.0f)
                curveTo(16.0f, 8.105f, 15.105f, 9.0f, 14.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.414f, 15.293f)
                lineTo(16.121f, 14.0f)
                horizontalLineTo(16.293f)
                lineTo(15.646f, 13.354f)
                curveTo(15.451f, 13.158f, 15.451f, 12.842f, 15.646f, 12.646f)
                curveTo(15.842f, 12.451f, 16.158f, 12.451f, 16.354f, 12.646f)
                lineTo(17.854f, 14.146f)
                curveTo(18.049f, 14.342f, 18.049f, 14.658f, 17.854f, 14.854f)
                lineTo(17.414f, 15.293f)
                close()
            }
        }
        .build()
        return _arrowWrapOff!!
    }

@Suppress("ObjectPropertyName")
private var _arrowWrapOff: ImageVector? = null

@Preview
@Composable
private fun ArrowWrapOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowWrapOff, contentDescription = "ArrowWrapOff Icon")
    }
}

