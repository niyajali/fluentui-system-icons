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
 * WeatherMoonOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_moon_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherMoonOff icon.
 */
public val FluentIcons.Regular.WeatherMoonOff: ImageVector
    get() {
        if (_weatherMoonOff != null) {
            return _weatherMoonOff!!
        }
        _weatherMoonOff = Builder(name = "WeatherMoonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(10.413f, 11.473f)
                curveTo(9.236f, 13.67f, 7.221f, 15.214f, 3.494f, 16.548f)
                curveTo(3.031f, 16.714f, 2.85f, 17.274f, 3.129f, 17.68f)
                curveTo(3.964f, 18.892f, 5.061f, 19.91f, 6.364f, 20.662f)
                curveTo(10.281f, 22.924f, 15.092f, 22.234f, 18.223f, 19.284f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.161f, 18.222f)
                curveTo(14.499f, 20.704f, 10.43f, 21.278f, 7.114f, 19.363f)
                curveTo(6.293f, 18.889f, 5.57f, 18.293f, 4.962f, 17.597f)
                curveTo(8.23f, 16.292f, 10.242f, 14.717f, 11.513f, 12.574f)
                lineTo(17.161f, 18.222f)
                close()
                moveTo(15.615f, 4.638f)
                curveTo(19.53f, 6.898f, 20.967f, 11.802f, 18.974f, 15.792f)
                lineTo(20.083f, 16.902f)
                curveTo(22.765f, 12.133f, 21.116f, 6.082f, 16.365f, 3.339f)
                curveTo(14.986f, 2.543f, 13.465f, 2.095f, 11.908f, 2.012f)
                curveTo(11.406f, 1.985f, 11.02f, 2.45f, 11.139f, 2.938f)
                curveTo(11.644f, 5.008f, 11.744f, 6.75f, 11.493f, 8.311f)
                lineTo(12.759f, 9.577f)
                curveTo(13.213f, 7.816f, 13.255f, 5.881f, 12.823f, 3.622f)
                curveTo(13.796f, 3.792f, 14.738f, 4.132f, 15.615f, 4.638f)
                close()
            }
        }
        .build()
        return _weatherMoonOff!!
    }

@Suppress("ObjectPropertyName")
private var _weatherMoonOff: ImageVector? = null

@Preview
@Composable
private fun WeatherMoonOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherMoonOff, contentDescription = "WeatherMoonOff Icon")
    }
}

