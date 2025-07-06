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
 * PasswordClock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general password scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_password_clock_24_regular.svg)
 * 
 * @return The [ImageVector] for the PasswordClock icon.
 */
public val FluentIcons.Regular.PasswordClock: ImageVector
    get() {
        if (_passwordClock != null) {
            return _passwordClock!!
        }
        _passwordClock = Builder(name = "PasswordClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 13.0f)
                curveTo(20.985f, 13.0f, 23.0f, 15.015f, 23.0f, 17.5f)
                curveTo(23.0f, 19.985f, 20.985f, 22.0f, 18.5f, 22.0f)
                curveTo(16.015f, 22.0f, 14.0f, 19.985f, 14.0f, 17.5f)
                curveTo(14.0f, 15.015f, 16.015f, 13.0f, 18.5f, 13.0f)
                close()
                moveTo(18.5f, 15.0f)
                curveTo(18.224f, 15.0f, 18.0f, 15.224f, 18.0f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 17.776f, 18.224f, 18.0f, 18.5f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.276f, 18.0f, 20.5f, 17.776f, 20.5f, 17.5f)
                curveTo(20.5f, 17.224f, 20.276f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.5f)
                curveTo(19.0f, 15.224f, 18.776f, 15.0f, 18.5f, 15.0f)
                close()
                moveTo(18.751f, 5.0f)
                curveTo(20.546f, 5.0f, 22.0f, 6.455f, 22.0f, 8.25f)
                verticalLineTo(13.257f)
                curveTo(21.554f, 12.889f, 21.048f, 12.591f, 20.5f, 12.377f)
                verticalLineTo(8.25f)
                curveTo(20.5f, 7.283f, 19.717f, 6.5f, 18.751f, 6.5f)
                horizontalLineTo(5.249f)
                curveTo(4.283f, 6.5f, 3.5f, 7.283f, 3.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.716f, 4.284f, 17.5f, 5.25f, 17.5f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 18.02f, 13.073f, 18.523f, 13.208f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 19.0f, 2.0f, 17.545f, 2.0f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.455f, 3.454f, 5.0f, 5.249f, 5.0f)
                horizontalLineTo(18.751f)
                close()
                moveTo(7.72f, 10.22f)
                curveTo(8.013f, 9.927f, 8.487f, 9.927f, 8.78f, 10.22f)
                curveTo(9.073f, 10.513f, 9.073f, 10.987f, 8.78f, 11.28f)
                lineTo(8.062f, 12.0f)
                lineTo(8.78f, 12.719f)
                curveTo(9.073f, 13.012f, 9.073f, 13.486f, 8.78f, 13.779f)
                curveTo(8.487f, 14.072f, 8.013f, 14.072f, 7.72f, 13.779f)
                lineTo(7.0f, 13.061f)
                lineTo(6.28f, 13.78f)
                curveTo(5.987f, 14.073f, 5.513f, 14.073f, 5.22f, 13.78f)
                curveTo(4.927f, 13.487f, 4.927f, 13.013f, 5.22f, 12.72f)
                lineTo(5.939f, 12.0f)
                lineTo(5.22f, 11.28f)
                curveTo(4.927f, 10.987f, 4.927f, 10.513f, 5.22f, 10.22f)
                curveTo(5.513f, 9.927f, 5.987f, 9.927f, 6.28f, 10.22f)
                lineTo(7.0f, 10.939f)
                lineTo(7.72f, 10.22f)
                close()
                moveTo(13.22f, 10.22f)
                curveTo(13.513f, 9.927f, 13.987f, 9.927f, 14.28f, 10.22f)
                curveTo(14.573f, 10.513f, 14.573f, 10.987f, 14.28f, 11.28f)
                lineTo(13.561f, 12.0f)
                lineTo(14.28f, 12.719f)
                curveTo(14.573f, 13.012f, 14.573f, 13.486f, 14.28f, 13.779f)
                curveTo(13.987f, 14.072f, 13.513f, 14.072f, 13.22f, 13.779f)
                lineTo(12.5f, 13.061f)
                lineTo(11.78f, 13.78f)
                curveTo(11.487f, 14.073f, 11.013f, 14.073f, 10.72f, 13.78f)
                curveTo(10.427f, 13.487f, 10.427f, 13.013f, 10.72f, 12.72f)
                lineTo(11.439f, 12.0f)
                lineTo(10.72f, 11.28f)
                curveTo(10.427f, 10.987f, 10.427f, 10.513f, 10.72f, 10.22f)
                curveTo(11.013f, 9.927f, 11.487f, 9.927f, 11.78f, 10.22f)
                lineTo(12.5f, 10.939f)
                lineTo(13.22f, 10.22f)
                close()
            }
        }
        .build()
        return _passwordClock!!
    }

@Suppress("ObjectPropertyName")
private var _passwordClock: ImageVector? = null

@Preview
@Composable
private fun PasswordClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PasswordClock, contentDescription = "PasswordClock Icon")
    }
}

