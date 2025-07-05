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
 * WeatherThunderstorm Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_thunderstorm_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherThunderstorm icon.
 */
public val FluentIcons.Regular.WeatherThunderstorm: ImageVector
    get() {
        if (_weatherThunderstorm != null) {
            return _weatherThunderstorm!!
        }
        _weatherThunderstorm = Builder(name = "WeatherThunderstorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.464f, 15.748f)
                lineTo(12.7f, 13.26f)
                curveTo(12.977f, 12.952f, 13.451f, 12.927f, 13.759f, 13.204f)
                curveTo(14.04f, 13.456f, 14.086f, 13.87f, 13.884f, 14.175f)
                lineTo(13.816f, 14.263f)
                lineTo(12.705f, 15.499f)
                horizontalLineTo(14.981f)
                curveTo(15.575f, 15.499f, 15.92f, 16.147f, 15.626f, 16.633f)
                lineTo(15.568f, 16.717f)
                lineTo(12.356f, 20.748f)
                curveTo(12.098f, 21.072f, 11.626f, 21.126f, 11.302f, 20.868f)
                curveTo(11.008f, 20.633f, 10.937f, 20.222f, 11.12f, 19.905f)
                lineTo(11.183f, 19.813f)
                lineTo(13.425f, 16.999f)
                horizontalLineTo(11.022f)
                curveTo(10.409f, 16.999f, 10.069f, 16.314f, 10.399f, 15.831f)
                lineTo(10.464f, 15.748f)
                lineTo(12.7f, 13.26f)
                lineTo(10.464f, 15.748f)
                close()
                moveTo(13.002f, 5.009f)
                curveTo(16.17f, 5.009f, 17.968f, 7.106f, 18.229f, 9.639f)
                lineTo(18.309f, 9.639f)
                curveTo(20.348f, 9.639f, 22.001f, 11.288f, 22.001f, 13.322f)
                curveTo(22.001f, 15.355f, 20.348f, 17.004f, 18.309f, 17.004f)
                lineTo(16.521f, 17.005f)
                curveTo(16.665f, 16.792f, 16.749f, 16.534f, 16.749f, 16.257f)
                curveTo(16.749f, 15.978f, 16.664f, 15.72f, 16.519f, 15.506f)
                lineTo(18.253f, 15.507f)
                curveTo(19.514f, 15.507f, 20.536f, 14.505f, 20.536f, 13.27f)
                curveTo(20.536f, 12.035f, 19.514f, 11.034f, 18.253f, 11.034f)
                lineTo(17.563f, 11.034f)
                curveTo(17.197f, 11.034f, 16.878f, 10.753f, 16.878f, 10.396f)
                curveTo(16.878f, 8.111f, 15.073f, 6.506f, 13.002f, 6.506f)
                curveTo(10.93f, 6.506f, 9.125f, 8.14f, 9.125f, 10.396f)
                curveTo(9.125f, 10.753f, 8.806f, 11.034f, 8.441f, 11.034f)
                lineTo(7.75f, 11.034f)
                curveTo(6.489f, 11.034f, 5.467f, 12.035f, 5.467f, 13.27f)
                curveTo(5.467f, 14.505f, 6.489f, 15.507f, 7.75f, 15.507f)
                lineTo(9.512f, 15.506f)
                curveTo(9.366f, 15.72f, 9.281f, 15.978f, 9.281f, 16.257f)
                curveTo(9.281f, 16.534f, 9.366f, 16.792f, 9.51f, 17.005f)
                lineTo(7.694f, 17.004f)
                curveTo(5.655f, 17.004f, 4.002f, 15.355f, 4.002f, 13.322f)
                curveTo(4.002f, 11.288f, 5.655f, 9.639f, 7.694f, 9.639f)
                lineTo(7.774f, 9.639f)
                curveTo(8.037f, 7.09f, 9.833f, 5.009f, 13.002f, 5.009f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(11.617f, 2.0f, 13.049f, 2.815f, 13.9f, 4.062f)
                curveTo(13.61f, 4.027f, 13.31f, 4.009f, 13.002f, 4.009f)
                curveTo(12.608f, 4.009f, 12.227f, 4.038f, 11.863f, 4.094f)
                curveTo(11.335f, 3.719f, 10.69f, 3.5f, 10.0f, 3.5f)
                curveTo(8.433f, 3.5f, 7.098f, 4.63f, 6.831f, 6.156f)
                lineTo(6.758f, 6.57f)
                curveTo(6.674f, 7.048f, 6.259f, 7.397f, 5.773f, 7.397f)
                lineTo(5.282f, 7.397f)
                curveTo(4.298f, 7.397f, 3.5f, 8.195f, 3.5f, 9.179f)
                curveTo(3.5f, 9.67f, 3.698f, 10.114f, 4.019f, 10.437f)
                curveTo(3.704f, 10.837f, 3.454f, 11.292f, 3.284f, 11.784f)
                curveTo(2.504f, 11.184f, 2.0f, 10.241f, 2.0f, 9.179f)
                curveTo(2.0f, 7.429f, 3.37f, 5.999f, 5.096f, 5.903f)
                lineTo(5.353f, 5.897f)
                curveTo(5.742f, 3.676f, 7.682f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _weatherThunderstorm!!
    }

@Suppress("ObjectPropertyName")
private var _weatherThunderstorm: ImageVector? = null

@Preview
@Composable
private fun WeatherThunderstormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherThunderstorm, contentDescription = "WeatherThunderstorm Icon")
    }
}

