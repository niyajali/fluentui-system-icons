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
 * Joystick icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: joystick
 * - Source: ic_fluent_joystick_20_regular.svg
 * 
 * @return The [ImageVector] for the Joystick icon.
 */
public val FluentIcons.Regular.Joystick: ImageVector
    get() {
        if (_joystick != null) {
            return _joystick!!
        }
        _joystick = Builder(name = "Joystick", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(11.105f, 3.0f, 12.0f, 3.895f, 12.0f, 5.0f)
                curveTo(12.0f, 6.105f, 11.105f, 7.0f, 10.0f, 7.0f)
                curveTo(8.895f, 7.0f, 8.0f, 6.105f, 8.0f, 5.0f)
                curveTo(8.0f, 3.895f, 8.895f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(10.5f, 7.959f)
                curveTo(11.919f, 7.72f, 13.0f, 6.486f, 13.0f, 5.0f)
                curveTo(13.0f, 3.343f, 11.657f, 2.0f, 10.0f, 2.0f)
                curveTo(8.343f, 2.0f, 7.0f, 3.343f, 7.0f, 5.0f)
                curveTo(7.0f, 6.486f, 8.081f, 7.72f, 9.5f, 7.959f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 11.0f, 6.0f, 11.672f, 6.0f, 12.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 13.0f, 3.0f, 13.895f, 3.0f, 15.0f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 17.776f, 3.224f, 18.0f, 3.5f, 18.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 18.0f, 17.0f, 17.776f, 17.0f, 17.5f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 13.895f, 16.105f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 11.672f, 13.328f, 11.0f, 12.5f, 11.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.959f)
                close()
                moveTo(7.5f, 12.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 12.0f, 13.0f, 12.224f, 13.0f, 12.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.5f)
                curveTo(7.0f, 12.224f, 7.224f, 12.0f, 7.5f, 12.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 14.0f, 16.0f, 14.448f, 16.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 14.448f, 4.448f, 14.0f, 5.0f, 14.0f)
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
        Image(imageVector = FluentIcons.Regular.Joystick, contentDescription = null)
    }
}

