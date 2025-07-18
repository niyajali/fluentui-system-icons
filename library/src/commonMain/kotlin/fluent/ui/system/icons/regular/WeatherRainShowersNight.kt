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
 * WeatherRainShowersNight Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_rain_showers_night_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherRainShowersNight icon.
 */
public val FluentIcons.Regular.WeatherRainShowersNight: ImageVector
    get() {
        if (_weatherRainShowersNight != null) {
            return _weatherRainShowersNight!!
        }
        _weatherRainShowersNight = Builder(name = "WeatherRainShowersNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.001f, 6.018f)
                curveTo(16.17f, 6.018f, 17.967f, 8.115f, 18.229f, 10.648f)
                lineTo(18.309f, 10.648f)
                curveTo(20.348f, 10.648f, 22.001f, 12.297f, 22.001f, 14.33f)
                curveTo(22.001f, 16.364f, 20.348f, 18.013f, 18.309f, 18.013f)
                lineTo(17.672f, 18.013f)
                lineTo(16.136f, 20.625f)
                curveTo(15.929f, 20.984f, 15.47f, 21.107f, 15.112f, 20.9f)
                curveTo(14.783f, 20.71f, 14.652f, 20.309f, 14.792f, 19.967f)
                lineTo(14.837f, 19.875f)
                lineTo(15.94f, 18.013f)
                horizontalLineTo(13.804f)
                lineTo(12.268f, 20.625f)
                curveTo(12.061f, 20.984f, 11.602f, 21.107f, 11.243f, 20.9f)
                curveTo(10.915f, 20.71f, 10.784f, 20.309f, 10.924f, 19.967f)
                lineTo(10.969f, 19.875f)
                lineTo(12.072f, 18.013f)
                horizontalLineTo(9.935f)
                lineTo(8.4f, 20.625f)
                curveTo(8.193f, 20.984f, 7.734f, 21.107f, 7.375f, 20.9f)
                curveTo(7.047f, 20.71f, 6.916f, 20.309f, 7.056f, 19.967f)
                lineTo(7.101f, 19.875f)
                lineTo(8.203f, 18.013f)
                lineTo(7.694f, 18.013f)
                curveTo(5.655f, 18.013f, 4.002f, 16.364f, 4.002f, 14.33f)
                curveTo(4.002f, 12.297f, 5.655f, 10.648f, 7.694f, 10.648f)
                lineTo(7.774f, 10.648f)
                curveTo(8.037f, 8.098f, 9.833f, 6.018f, 13.001f, 6.018f)
                close()
                moveTo(13.001f, 7.515f)
                curveTo(10.93f, 7.515f, 9.124f, 9.149f, 9.124f, 11.405f)
                curveTo(9.124f, 11.762f, 8.806f, 12.042f, 8.44f, 12.042f)
                lineTo(7.75f, 12.042f)
                curveTo(6.489f, 12.042f, 5.467f, 13.044f, 5.467f, 14.279f)
                curveTo(5.467f, 15.514f, 6.489f, 16.515f, 7.75f, 16.515f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 16.515f, 20.536f, 15.514f, 20.536f, 14.279f)
                curveTo(20.536f, 13.044f, 19.514f, 12.042f, 18.253f, 12.042f)
                lineTo(17.562f, 12.042f)
                curveTo(17.197f, 12.042f, 16.878f, 11.762f, 16.878f, 11.405f)
                curveTo(16.878f, 9.12f, 15.073f, 7.515f, 13.001f, 7.515f)
                close()
                moveTo(6.588f, 2.01f)
                curveTo(7.384f, 2.053f, 8.155f, 2.282f, 8.852f, 2.684f)
                curveTo(9.906f, 3.292f, 10.66f, 4.222f, 11.06f, 5.279f)
                curveTo(10.559f, 5.42f, 10.097f, 5.616f, 9.674f, 5.863f)
                curveTo(9.398f, 5.098f, 8.86f, 4.422f, 8.101f, 3.984f)
                curveTo(7.903f, 3.87f, 7.696f, 3.775f, 7.484f, 3.701f)
                curveTo(7.644f, 5.053f, 7.436f, 6.214f, 6.861f, 7.312f)
                lineTo(6.743f, 7.525f)
                curveTo(6.172f, 8.501f, 5.311f, 9.233f, 4.025f, 9.829f)
                curveTo(4.18f, 9.958f, 4.348f, 10.075f, 4.525f, 10.177f)
                curveTo(4.71f, 10.284f, 4.9f, 10.372f, 5.094f, 10.443f)
                curveTo(4.644f, 10.744f, 4.249f, 11.124f, 3.929f, 11.562f)
                lineTo(3.774f, 11.477f)
                curveTo(3.117f, 11.098f, 2.559f, 10.582f, 2.132f, 9.963f)
                curveTo(1.853f, 9.557f, 2.034f, 8.997f, 2.498f, 8.831f)
                curveTo(4.14f, 8.243f, 5.025f, 7.581f, 5.531f, 6.615f)
                curveTo(6.084f, 5.56f, 6.186f, 4.441f, 5.819f, 2.938f)
                curveTo(5.7f, 2.449f, 6.086f, 1.983f, 6.588f, 2.01f)
                close()
            }
        }
        .build()
        return _weatherRainShowersNight!!
    }

@Suppress("ObjectPropertyName")
private var _weatherRainShowersNight: ImageVector? = null

@Preview
@Composable
private fun WeatherRainShowersNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherRainShowersNight, contentDescription = "WeatherRainShowersNight Icon")
    }
}

