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
 * CircleMultipleSubtractCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: circle, multiple, subtract, checkmark
 * - Source: ic_fluent_circle_multiple_subtract_checkmark_20_regular.svg
 * 
 * @return The [ImageVector] for the CircleMultipleSubtractCheckmark icon.
 */
public val FluentIcons.Regular.CircleMultipleSubtractCheckmark: ImageVector
    get() {
        if (_circleMultipleSubtractCheckmark != null) {
            return _circleMultipleSubtractCheckmark!!
        }
        _circleMultipleSubtractCheckmark = Builder(name = "CircleMultipleSubtractCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                curveTo(9.448f, 2.0f, 11.486f, 3.76f, 11.916f, 6.083f)
                curveTo(12.243f, 6.033f, 12.577f, 6.004f, 12.917f, 6.0f)
                curveTo(12.441f, 3.163f, 9.973f, 1.0f, 7.0f, 1.0f)
                curveTo(3.686f, 1.0f, 1.0f, 3.686f, 1.0f, 7.0f)
                curveTo(1.0f, 9.973f, 3.163f, 12.441f, 6.0f, 12.917f)
                curveTo(6.004f, 12.577f, 6.033f, 12.243f, 6.083f, 11.916f)
                curveTo(3.76f, 11.486f, 2.0f, 9.448f, 2.0f, 7.0f)
                curveTo(2.0f, 4.239f, 4.239f, 2.0f, 7.0f, 2.0f)
                close()
                moveTo(4.5f, 6.0f)
                curveTo(4.224f, 6.0f, 4.0f, 6.224f, 4.0f, 6.5f)
                curveTo(4.0f, 6.776f, 4.224f, 7.0f, 4.5f, 7.0f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 7.0f, 10.0f, 6.776f, 10.0f, 6.5f)
                curveTo(10.0f, 6.224f, 9.776f, 6.0f, 9.5f, 6.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.854f, 11.854f)
                curveTo(16.049f, 11.658f, 16.049f, 11.342f, 15.854f, 11.146f)
                curveTo(15.658f, 10.951f, 15.342f, 10.951f, 15.146f, 11.146f)
                lineTo(12.5f, 13.793f)
                lineTo(11.354f, 12.646f)
                curveTo(11.158f, 12.451f, 10.842f, 12.451f, 10.646f, 12.646f)
                curveTo(10.451f, 12.842f, 10.451f, 13.158f, 10.646f, 13.354f)
                lineTo(12.146f, 14.854f)
                curveTo(12.342f, 15.049f, 12.658f, 15.049f, 12.854f, 14.854f)
                lineTo(15.854f, 11.854f)
                close()
                moveTo(13.0f, 19.0f)
                curveTo(16.314f, 19.0f, 19.0f, 16.314f, 19.0f, 13.0f)
                curveTo(19.0f, 9.686f, 16.314f, 7.0f, 13.0f, 7.0f)
                curveTo(9.686f, 7.0f, 7.0f, 9.686f, 7.0f, 13.0f)
                curveTo(7.0f, 16.314f, 9.686f, 19.0f, 13.0f, 19.0f)
                close()
                moveTo(13.0f, 18.0f)
                curveTo(10.239f, 18.0f, 8.0f, 15.761f, 8.0f, 13.0f)
                curveTo(8.0f, 10.239f, 10.239f, 8.0f, 13.0f, 8.0f)
                curveTo(15.761f, 8.0f, 18.0f, 10.239f, 18.0f, 13.0f)
                curveTo(18.0f, 15.761f, 15.761f, 18.0f, 13.0f, 18.0f)
                close()
            }
        }
        .build()
        return _circleMultipleSubtractCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _circleMultipleSubtractCheckmark: ImageVector? = null

@Preview
@Composable
private fun CircleMultipleSubtractCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CircleMultipleSubtractCheckmark, contentDescription = null)
    }
}

