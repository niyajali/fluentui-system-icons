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
 * PhoneDesktopAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: phone, desktop, add
 * - Source: ic_fluent_phone_desktop_add_20_regular.svg
 * 
 * @return The [ImageVector] for the PhoneDesktopAdd icon.
 */
public val FluentIcons.Regular.PhoneDesktopAdd: ImageVector
    get() {
        if (_phoneDesktopAdd != null) {
            return _phoneDesktopAdd!!
        }
        _phoneDesktopAdd = Builder(name = "PhoneDesktopAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.5f)
                curveTo(19.0f, 7.985f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 7.985f, 10.0f, 5.5f)
                curveTo(10.0f, 3.015f, 12.015f, 1.0f, 14.5f, 1.0f)
                curveTo(16.985f, 1.0f, 19.0f, 3.015f, 19.0f, 5.5f)
                close()
                moveTo(15.0f, 3.5f)
                curveTo(15.0f, 3.224f, 14.776f, 3.0f, 14.5f, 3.0f)
                curveTo(14.224f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 5.0f, 12.0f, 5.224f, 12.0f, 5.5f)
                curveTo(12.0f, 5.776f, 12.224f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 7.776f, 14.224f, 8.0f, 14.5f, 8.0f)
                curveTo(14.776f, 8.0f, 15.0f, 7.776f, 15.0f, 7.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 6.0f, 17.0f, 5.776f, 17.0f, 5.5f)
                curveTo(17.0f, 5.224f, 16.776f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(17.0f, 11.0f)
                verticalLineTo(10.4f)
                curveTo(17.358f, 10.217f, 17.693f, 9.996f, 18.0f, 9.743f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 12.105f, 17.105f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 15.0f, 15.0f, 15.224f, 15.0f, 15.5f)
                curveTo(15.0f, 15.776f, 14.776f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 12.0f, 17.0f, 11.552f, 17.0f, 11.0f)
                close()
                moveTo(10.257f, 2.0f)
                curveTo(10.003f, 2.307f, 9.783f, 2.642f, 9.6f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 3.0f, 5.0f, 3.448f, 5.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(10.257f)
                close()
                moveTo(4.0f, 15.5f)
                curveTo(4.0f, 15.224f, 4.224f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(5.776f, 15.0f, 6.0f, 15.224f, 6.0f, 15.5f)
                curveTo(6.0f, 15.776f, 5.776f, 16.0f, 5.5f, 16.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 16.0f, 4.0f, 15.776f, 4.0f, 15.5f)
                close()
                moveTo(2.0f, 9.5f)
                curveTo(2.0f, 8.672f, 2.672f, 8.0f, 3.5f, 8.0f)
                horizontalLineTo(6.5f)
                curveTo(7.328f, 8.0f, 8.0f, 8.672f, 8.0f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(8.0f, 17.328f, 7.328f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 18.0f, 2.0f, 17.328f, 2.0f, 16.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(3.5f, 9.0f)
                curveTo(3.224f, 9.0f, 3.0f, 9.224f, 3.0f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.776f, 3.224f, 17.0f, 3.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 17.0f, 7.0f, 16.776f, 7.0f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(7.0f, 9.224f, 6.776f, 9.0f, 6.5f, 9.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _phoneDesktopAdd!!
    }

@Suppress("ObjectPropertyName")
private var _phoneDesktopAdd: ImageVector? = null

@Preview
@Composable
private fun PhoneDesktopAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneDesktopAdd, contentDescription = null)
    }
}

