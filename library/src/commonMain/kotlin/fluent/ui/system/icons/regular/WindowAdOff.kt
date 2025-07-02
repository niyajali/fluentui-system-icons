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
 * WindowAdOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: window, ad, off
 * - Source: ic_fluent_window_ad_off_20_regular.svg
 * 
 * @return The [ImageVector] for the WindowAdOff icon.
 */
public val FluentIcons.Regular.WindowAdOff: ImageVector
    get() {
        if (_windowAdOff != null) {
            return _windowAdOff!!
        }
        _windowAdOff = Builder(name = "WindowAdOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                lineTo(17.854f, 17.146f)
                curveTo(18.049f, 17.342f, 18.049f, 17.658f, 17.854f, 17.854f)
                curveTo(17.658f, 18.049f, 17.342f, 18.049f, 17.146f, 17.854f)
                lineTo(15.877f, 16.585f)
                curveTo(15.482f, 16.847f, 15.007f, 17.0f, 14.497f, 17.0f)
                horizontalLineTo(5.497f)
                curveTo(4.116f, 17.0f, 2.997f, 15.881f, 2.997f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(2.997f, 4.99f, 3.15f, 4.515f, 3.412f, 4.12f)
                lineTo(2.146f, 2.854f)
                curveTo(1.951f, 2.658f, 1.951f, 2.342f, 2.146f, 2.146f)
                curveTo(2.342f, 1.951f, 2.658f, 1.951f, 2.854f, 2.146f)
                close()
                moveTo(15.146f, 15.853f)
                lineTo(10.0f, 10.707f)
                verticalLineTo(12.5f)
                curveTo(10.0f, 12.776f, 9.776f, 13.0f, 9.5f, 13.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 13.0f, 5.0f, 12.776f, 5.0f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(5.0f, 8.224f, 5.224f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(7.293f)
                lineTo(6.293f, 7.0f)
                horizontalLineTo(3.997f)
                verticalLineTo(14.5f)
                curveTo(3.997f, 15.328f, 4.669f, 16.0f, 5.497f, 16.0f)
                horizontalLineTo(14.497f)
                curveTo(14.729f, 16.0f, 14.949f, 15.947f, 15.146f, 15.853f)
                close()
                moveTo(5.293f, 6.0f)
                lineTo(4.144f, 4.851f)
                curveTo(4.05f, 5.048f, 3.997f, 5.268f, 3.997f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.293f)
                close()
                moveTo(8.293f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.707f)
                lineTo(8.293f, 9.0f)
                close()
                moveTo(15.997f, 6.0f)
                horizontalLineTo(8.121f)
                lineTo(9.121f, 7.0f)
                horizontalLineTo(15.997f)
                verticalLineTo(13.876f)
                lineTo(16.973f, 14.851f)
                curveTo(16.989f, 14.736f, 16.997f, 14.619f, 16.997f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.997f)
                verticalLineTo(5.5f)
                curveTo(16.997f, 4.119f, 15.878f, 3.0f, 14.497f, 3.0f)
                horizontalLineTo(5.497f)
                curveTo(5.378f, 3.0f, 5.261f, 3.008f, 5.146f, 3.024f)
                lineTo(6.121f, 4.0f)
                horizontalLineTo(14.497f)
                curveTo(15.325f, 4.0f, 15.997f, 4.672f, 15.997f, 5.5f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _windowAdOff!!
    }

@Suppress("ObjectPropertyName")
private var _windowAdOff: ImageVector? = null

@Preview
@Composable
private fun WindowAdOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowAdOff, contentDescription = null)
    }
}

