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
 * WindowHeaderHorizontalOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_header_horizontal_off_20_filled.svg)
 * 
 * @return The [ImageVector] for the WindowHeaderHorizontalOff icon.
 */
public val FluentIcons.Filled.WindowHeaderHorizontalOff: ImageVector
    get() {
        if (_windowHeaderHorizontalOff != null) {
            return _windowHeaderHorizontalOff!!
        }
        _windowHeaderHorizontalOff = Builder(name = "WindowHeaderHorizontalOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.414f, 4.121f)
                curveTo(3.152f, 4.517f, 3.0f, 4.99f, 3.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.881f, 4.119f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(15.009f, 17.0f, 15.483f, 16.848f, 15.879f, 16.586f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(14.759f, 15.466f)
                curveTo(14.676f, 15.488f, 14.59f, 15.5f, 14.5f, 15.5f)
                horizontalLineTo(5.5f)
                curveTo(4.948f, 15.5f, 4.5f, 15.052f, 4.5f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.293f)
                lineTo(14.759f, 15.466f)
                close()
                moveTo(15.5f, 7.0f)
                verticalLineTo(13.379f)
                lineTo(16.975f, 14.854f)
                curveTo(16.992f, 14.738f, 17.0f, 14.62f, 17.0f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(5.38f, 3.0f, 5.262f, 3.008f, 5.146f, 3.025f)
                lineTo(9.121f, 7.0f)
                horizontalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _windowHeaderHorizontalOff!!
    }

@Suppress("ObjectPropertyName")
private var _windowHeaderHorizontalOff: ImageVector? = null

@Preview
@Composable
private fun WindowHeaderHorizontalOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowHeaderHorizontalOff, contentDescription = "WindowHeaderHorizontalOff Icon")
    }
}

