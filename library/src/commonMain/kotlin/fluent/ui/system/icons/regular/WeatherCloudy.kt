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
 * WeatherCloudy icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, cloudy
 * - Source: ic_fluent_weather_cloudy_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherCloudy icon.
 */
public val FluentIcons.Regular.WeatherCloudy: ImageVector
    get() {
        if (_weatherCloudy != null) {
            return _weatherCloudy!!
        }
        _weatherCloudy = Builder(name = "WeatherCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.002f, 7.009f)
                curveTo(16.17f, 7.009f, 17.968f, 9.106f, 18.229f, 11.639f)
                lineTo(18.309f, 11.639f)
                curveTo(20.348f, 11.639f, 22.001f, 13.288f, 22.001f, 15.322f)
                curveTo(22.001f, 17.355f, 20.348f, 19.004f, 18.309f, 19.004f)
                horizontalLineTo(7.694f)
                curveTo(5.655f, 19.004f, 4.002f, 17.355f, 4.002f, 15.322f)
                curveTo(4.002f, 13.288f, 5.655f, 11.639f, 7.694f, 11.639f)
                lineTo(7.774f, 11.639f)
                curveTo(8.037f, 9.09f, 9.833f, 7.009f, 13.002f, 7.009f)
                close()
                moveTo(13.002f, 8.506f)
                curveTo(10.93f, 8.506f, 9.125f, 10.14f, 9.125f, 12.396f)
                curveTo(9.125f, 12.753f, 8.806f, 13.034f, 8.441f, 13.034f)
                lineTo(7.75f, 13.034f)
                curveTo(6.489f, 13.034f, 5.467f, 14.035f, 5.467f, 15.27f)
                curveTo(5.467f, 16.505f, 6.489f, 17.507f, 7.75f, 17.507f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 17.507f, 20.536f, 16.505f, 20.536f, 15.27f)
                curveTo(20.536f, 14.035f, 19.514f, 13.034f, 18.253f, 13.034f)
                lineTo(17.563f, 13.034f)
                curveTo(17.197f, 13.034f, 16.878f, 12.753f, 16.878f, 12.396f)
                curveTo(16.878f, 10.111f, 15.073f, 8.506f, 13.002f, 8.506f)
                close()
                moveTo(10.0f, 4.0f)
                curveTo(11.617f, 4.0f, 13.049f, 4.815f, 13.9f, 6.062f)
                curveTo(13.61f, 6.027f, 13.31f, 6.009f, 13.002f, 6.009f)
                curveTo(12.608f, 6.009f, 12.227f, 6.038f, 11.863f, 6.094f)
                curveTo(11.335f, 5.719f, 10.69f, 5.5f, 10.0f, 5.5f)
                curveTo(8.433f, 5.5f, 7.098f, 6.63f, 6.831f, 8.156f)
                lineTo(6.758f, 8.57f)
                curveTo(6.674f, 9.048f, 6.259f, 9.397f, 5.773f, 9.397f)
                lineTo(5.282f, 9.397f)
                curveTo(4.298f, 9.397f, 3.5f, 10.195f, 3.5f, 11.179f)
                curveTo(3.5f, 11.67f, 3.698f, 12.114f, 4.019f, 12.437f)
                curveTo(3.704f, 12.837f, 3.454f, 13.292f, 3.284f, 13.784f)
                curveTo(2.504f, 13.184f, 2.0f, 12.241f, 2.0f, 11.179f)
                curveTo(2.0f, 9.429f, 3.37f, 7.999f, 5.096f, 7.903f)
                lineTo(5.353f, 7.897f)
                curveTo(5.742f, 5.676f, 7.682f, 4.0f, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _weatherCloudy!!
    }

@Suppress("ObjectPropertyName")
private var _weatherCloudy: ImageVector? = null

@Preview
@Composable
private fun WeatherCloudyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherCloudy, contentDescription = null)
    }
}

