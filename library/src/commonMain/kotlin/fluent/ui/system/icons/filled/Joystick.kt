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
 * Joystick Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent arcade, fighting and classic gaming.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_joystick_20_filled.svg)
 * 
 * @return The [ImageVector] for the Joystick icon.
 */
public val FluentIcons.Filled.Joystick: ImageVector
    get() {
        if (_joystick != null) {
            return _joystick!!
        }
        _joystick = Builder(name = "Joystick", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 7.959f)
                curveTo(11.919f, 7.72f, 13.0f, 6.486f, 13.0f, 5.0f)
                curveTo(13.0f, 3.343f, 11.657f, 2.0f, 10.0f, 2.0f)
                curveTo(8.343f, 2.0f, 7.0f, 3.343f, 7.0f, 5.0f)
                curveTo(7.0f, 6.486f, 8.081f, 7.72f, 9.5f, 7.959f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 11.0f, 6.0f, 11.672f, 6.0f, 12.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 11.672f, 13.328f, 11.0f, 12.5f, 11.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.959f)
                close()
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 14.895f, 3.895f, 14.0f, 5.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 14.0f, 17.0f, 14.895f, 17.0f, 16.0f)
                verticalLineTo(17.5f)
                curveTo(17.0f, 17.776f, 16.776f, 18.0f, 16.5f, 18.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 18.0f, 3.0f, 17.776f, 3.0f, 17.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _joystick!!
    }

@Suppress("ObjectPropertyName")
private var _joystick: ImageVector? = null

@Preview
@Composable
private fun JoystickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Joystick, contentDescription = "Joystick Icon")
    }
}

