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
 * PhoneCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: phone, checkmark
 * - Source: ic_fluent_phone_checkmark_20_regular.svg
 * 
 * @return The [ImageVector] for the PhoneCheckmark icon.
 */
public val FluentIcons.Regular.PhoneCheckmark: ImageVector
    get() {
        if (_phoneCheckmark != null) {
            return _phoneCheckmark!!
        }
        _phoneCheckmark = Builder(name = "PhoneCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 5.5f)
                curveTo(18.0f, 7.985f, 15.985f, 10.0f, 13.5f, 10.0f)
                curveTo(11.015f, 10.0f, 9.0f, 7.985f, 9.0f, 5.5f)
                curveTo(9.0f, 3.015f, 11.015f, 1.0f, 13.5f, 1.0f)
                curveTo(15.985f, 1.0f, 18.0f, 3.015f, 18.0f, 5.5f)
                close()
                moveTo(15.854f, 3.646f)
                curveTo(15.658f, 3.451f, 15.342f, 3.451f, 15.146f, 3.646f)
                lineTo(12.5f, 6.293f)
                lineTo(11.854f, 5.646f)
                curveTo(11.658f, 5.451f, 11.342f, 5.451f, 11.146f, 5.646f)
                curveTo(10.951f, 5.842f, 10.951f, 6.158f, 11.146f, 6.354f)
                lineTo(12.146f, 7.354f)
                curveTo(12.342f, 7.549f, 12.658f, 7.549f, 12.854f, 7.354f)
                lineTo(15.854f, 4.354f)
                curveTo(16.049f, 4.158f, 16.049f, 3.842f, 15.854f, 3.646f)
                close()
                moveTo(9.257f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 2.0f, 5.0f, 2.672f, 5.0f, 3.5f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 17.328f, 5.672f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 18.0f, 15.0f, 17.328f, 15.0f, 16.5f)
                verticalLineTo(10.793f)
                curveTo(14.678f, 10.884f, 14.343f, 10.947f, 14.0f, 10.978f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.776f, 13.776f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 17.0f, 6.0f, 16.776f, 6.0f, 16.5f)
                verticalLineTo(3.5f)
                curveTo(6.0f, 3.224f, 6.224f, 3.0f, 6.5f, 3.0f)
                horizontalLineTo(8.6f)
                curveTo(8.783f, 2.642f, 9.004f, 2.307f, 9.257f, 2.0f)
                close()
                moveTo(8.0f, 14.5f)
                curveTo(8.0f, 14.224f, 8.224f, 14.0f, 8.5f, 14.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                curveTo(12.0f, 14.776f, 11.776f, 15.0f, 11.5f, 15.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 15.0f, 8.0f, 14.776f, 8.0f, 14.5f)
                close()
            }
        }
        .build()
        return _phoneCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _phoneCheckmark: ImageVector? = null

@Preview
@Composable
private fun PhoneCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneCheckmark, contentDescription = null)
    }
}

