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
 * WeatherRain Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_rain_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherRain icon.
 */
public val FluentIcons.Regular.WeatherRain: ImageVector
    get() {
        if (_weatherRain != null) {
            return _weatherRain!!
        }
        _weatherRain = Builder(name = "WeatherRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.001f)
                curveTo(15.168f, 4.001f, 16.966f, 6.098f, 17.227f, 8.631f)
                lineTo(17.307f, 8.631f)
                curveTo(19.346f, 8.631f, 20.999f, 10.28f, 20.999f, 12.314f)
                curveTo(20.999f, 14.347f, 19.346f, 15.996f, 17.307f, 15.996f)
                lineTo(16.725f, 15.996f)
                lineTo(15.143f, 18.631f)
                curveTo(14.936f, 18.989f, 14.477f, 19.112f, 14.118f, 18.905f)
                curveTo(13.789f, 18.715f, 13.659f, 18.314f, 13.799f, 17.972f)
                lineTo(13.844f, 17.881f)
                lineTo(14.993f, 15.996f)
                horizontalLineTo(12.856f)
                lineTo(11.275f, 18.631f)
                curveTo(11.068f, 18.989f, 10.609f, 19.112f, 10.25f, 18.905f)
                curveTo(9.921f, 18.715f, 9.791f, 18.314f, 9.931f, 17.972f)
                lineTo(9.976f, 17.881f)
                lineTo(11.125f, 15.996f)
                horizontalLineTo(8.987f)
                lineTo(7.406f, 18.631f)
                curveTo(7.199f, 18.989f, 6.741f, 19.112f, 6.382f, 18.905f)
                curveTo(6.053f, 18.715f, 5.922f, 18.314f, 6.062f, 17.972f)
                lineTo(6.107f, 17.881f)
                lineTo(7.255f, 15.996f)
                lineTo(6.693f, 15.996f)
                curveTo(4.653f, 15.996f, 3.0f, 14.347f, 3.0f, 12.314f)
                curveTo(3.0f, 10.28f, 4.653f, 8.631f, 6.693f, 8.631f)
                lineTo(6.773f, 8.631f)
                curveTo(7.035f, 6.082f, 8.831f, 4.001f, 12.0f, 4.001f)
                close()
                moveTo(12.0f, 5.499f)
                curveTo(9.929f, 5.499f, 8.123f, 7.132f, 8.123f, 9.388f)
                curveTo(8.123f, 9.745f, 7.804f, 10.026f, 7.439f, 10.026f)
                lineTo(6.749f, 10.026f)
                curveTo(5.488f, 10.026f, 4.465f, 11.027f, 4.465f, 12.262f)
                curveTo(4.465f, 13.497f, 5.488f, 14.499f, 6.749f, 14.499f)
                horizontalLineTo(17.251f)
                curveTo(18.512f, 14.499f, 19.535f, 13.497f, 19.535f, 12.262f)
                curveTo(19.535f, 11.027f, 18.512f, 10.026f, 17.251f, 10.026f)
                lineTo(16.561f, 10.026f)
                curveTo(16.196f, 10.026f, 15.877f, 9.745f, 15.877f, 9.388f)
                curveTo(15.877f, 7.103f, 14.071f, 5.499f, 12.0f, 5.499f)
                close()
            }
        }
        .build()
        return _weatherRain!!
    }

@Suppress("ObjectPropertyName")
private var _weatherRain: ImageVector? = null

@Preview
@Composable
private fun WeatherRainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherRain, contentDescription = "WeatherRain Icon")
    }
}

