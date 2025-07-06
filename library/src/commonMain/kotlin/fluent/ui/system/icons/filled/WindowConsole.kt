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
 * WindowConsole Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_console_20_filled.svg)
 * 
 * @return The [ImageVector] for the WindowConsole icon.
 */
public val FluentIcons.Filled.WindowConsole: ImageVector
    get() {
        if (_windowConsole != null) {
            return _windowConsole!!
        }
        _windowConsole = Builder(name = "WindowConsole", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.646f, 9.146f)
                curveTo(5.842f, 8.951f, 6.158f, 8.951f, 6.354f, 9.146f)
                lineTo(8.354f, 11.146f)
                curveTo(8.447f, 11.24f, 8.5f, 11.367f, 8.5f, 11.5f)
                curveTo(8.5f, 11.633f, 8.447f, 11.76f, 8.354f, 11.854f)
                lineTo(6.354f, 13.854f)
                curveTo(6.158f, 14.049f, 5.842f, 14.049f, 5.646f, 13.854f)
                curveTo(5.451f, 13.658f, 5.451f, 13.342f, 5.646f, 13.146f)
                lineTo(7.293f, 11.5f)
                lineTo(5.646f, 9.854f)
                curveTo(5.451f, 9.658f, 5.451f, 9.342f, 5.646f, 9.146f)
                close()
                moveTo(14.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 13.0f, 9.0f, 13.224f, 9.0f, 13.5f)
                curveTo(9.0f, 13.776f, 9.224f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 14.0f, 15.0f, 13.776f, 15.0f, 13.5f)
                curveTo(15.0f, 13.224f, 14.776f, 13.0f, 14.5f, 13.0f)
                close()
                moveTo(2.996f, 5.5f)
                curveTo(2.996f, 4.119f, 4.115f, 3.0f, 5.496f, 3.0f)
                horizontalLineTo(14.496f)
                curveTo(15.877f, 3.0f, 16.996f, 4.119f, 16.996f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.999f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.996f)
                verticalLineTo(14.5f)
                curveTo(16.996f, 15.881f, 15.877f, 17.0f, 14.496f, 17.0f)
                horizontalLineTo(5.496f)
                curveTo(4.115f, 17.0f, 2.996f, 15.881f, 2.996f, 14.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(3.996f, 7.0f)
                verticalLineTo(14.5f)
                curveTo(3.996f, 15.328f, 4.668f, 16.0f, 5.496f, 16.0f)
                horizontalLineTo(14.496f)
                curveTo(15.325f, 16.0f, 15.996f, 15.328f, 15.996f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.996f)
                close()
            }
        }
        .build()
        return _windowConsole!!
    }

@Suppress("ObjectPropertyName")
private var _windowConsole: ImageVector? = null

@Preview
@Composable
private fun WindowConsolePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowConsole, contentDescription = "WindowConsole Icon")
    }
}

