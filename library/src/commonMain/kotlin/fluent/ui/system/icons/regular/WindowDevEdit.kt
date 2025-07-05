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
 * WindowDevEdit Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_dev_edit_20_regular.svg)
 * 
 * @return The [ImageVector] for the WindowDevEdit icon.
 */
public val FluentIcons.Regular.WindowDevEdit: ImageVector
    get() {
        if (_windowDevEdit != null) {
            return _windowDevEdit!!
        }
        _windowDevEdit = Builder(name = "WindowDevEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(10.221f)
                lineTo(10.433f, 16.155f)
                curveTo(10.446f, 16.103f, 10.46f, 16.051f, 10.476f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.944f)
                lineTo(16.103f, 9.841f)
                curveTo(16.369f, 9.575f, 16.674f, 9.372f, 17.0f, 9.232f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(9.104f, 8.146f)
                curveTo(9.299f, 8.342f, 9.299f, 8.658f, 9.104f, 8.854f)
                lineTo(6.957f, 11.0f)
                lineTo(9.104f, 13.146f)
                curveTo(9.299f, 13.342f, 9.299f, 13.658f, 9.104f, 13.854f)
                curveTo(8.908f, 14.049f, 8.592f, 14.049f, 8.396f, 13.854f)
                lineTo(5.896f, 11.354f)
                curveTo(5.701f, 11.158f, 5.701f, 10.842f, 5.896f, 10.646f)
                lineTo(8.396f, 8.146f)
                curveTo(8.592f, 7.951f, 8.908f, 7.951f, 9.104f, 8.146f)
                close()
                moveTo(11.604f, 8.146f)
                curveTo(11.408f, 7.951f, 11.092f, 7.951f, 10.896f, 8.146f)
                curveTo(10.701f, 8.342f, 10.701f, 8.658f, 10.896f, 8.854f)
                lineTo(13.043f, 11.0f)
                lineTo(10.896f, 13.146f)
                curveTo(10.701f, 13.342f, 10.701f, 13.658f, 10.896f, 13.854f)
                curveTo(11.092f, 14.049f, 11.408f, 14.049f, 11.604f, 13.854f)
                lineTo(14.104f, 11.354f)
                curveTo(14.299f, 11.158f, 14.299f, 10.842f, 14.104f, 10.646f)
                lineTo(11.604f, 8.146f)
                close()
                moveTo(11.98f, 15.377f)
                lineTo(16.809f, 10.548f)
                curveTo(17.539f, 9.817f, 18.724f, 9.817f, 19.454f, 10.548f)
                curveTo(20.184f, 11.278f, 20.184f, 12.462f, 19.454f, 13.193f)
                lineTo(14.625f, 18.022f)
                curveTo(14.343f, 18.304f, 13.99f, 18.503f, 13.604f, 18.6f)
                lineTo(12.106f, 18.974f)
                curveTo(11.455f, 19.137f, 10.865f, 18.547f, 11.027f, 17.896f)
                lineTo(11.402f, 16.398f)
                curveTo(11.498f, 16.012f, 11.698f, 15.659f, 11.98f, 15.377f)
                close()
            }
        }
        .build()
        return _windowDevEdit!!
    }

@Suppress("ObjectPropertyName")
private var _windowDevEdit: ImageVector? = null

@Preview
@Composable
private fun WindowDevEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowDevEdit, contentDescription = "WindowDevEdit Icon")
    }
}

