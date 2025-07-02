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
 * WindowAdOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: window, ad, off
 * - Source: ic_fluent_window_ad_off_20_filled.svg
 * 
 * @return The [ImageVector] for the WindowAdOff icon.
 */
public val FluentIcons.Filled.WindowAdOff: ImageVector
    get() {
        if (_windowAdOff != null) {
            return _windowAdOff!!
        }
        _windowAdOff = Builder(name = "WindowAdOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.412f, 4.119f)
                curveTo(3.149f, 4.515f, 2.996f, 4.989f, 2.996f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(2.996f, 15.881f, 4.115f, 17.0f, 5.496f, 17.0f)
                horizontalLineTo(14.496f)
                curveTo(15.007f, 17.0f, 15.481f, 16.847f, 15.877f, 16.584f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(15.145f, 15.852f)
                curveTo(14.949f, 15.947f, 14.729f, 16.0f, 14.496f, 16.0f)
                horizontalLineTo(5.496f)
                curveTo(4.668f, 16.0f, 3.996f, 15.328f, 3.996f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.293f)
                lineTo(7.293f, 8.0f)
                horizontalLineTo(5.499f)
                curveTo(5.223f, 8.0f, 4.999f, 8.224f, 4.999f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(4.999f, 12.776f, 5.223f, 13.0f, 5.499f, 13.0f)
                horizontalLineTo(9.499f)
                curveTo(9.775f, 13.0f, 9.999f, 12.776f, 9.999f, 12.5f)
                verticalLineTo(10.706f)
                lineTo(15.145f, 15.852f)
                close()
                moveTo(8.293f, 9.0f)
                lineTo(8.999f, 9.706f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.999f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.293f)
                close()
                moveTo(15.996f, 7.0f)
                verticalLineTo(13.875f)
                lineTo(16.972f, 14.85f)
                curveTo(16.988f, 14.736f, 16.996f, 14.619f, 16.996f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.999f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.996f)
                verticalLineTo(5.5f)
                curveTo(16.996f, 4.119f, 15.877f, 3.0f, 14.496f, 3.0f)
                horizontalLineTo(5.496f)
                curveTo(5.377f, 3.0f, 5.26f, 3.008f, 5.146f, 3.024f)
                lineTo(9.121f, 7.0f)
                horizontalLineTo(15.996f)
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
        Image(imageVector = FluentIcons.Filled.WindowAdOff, contentDescription = null)
    }
}

