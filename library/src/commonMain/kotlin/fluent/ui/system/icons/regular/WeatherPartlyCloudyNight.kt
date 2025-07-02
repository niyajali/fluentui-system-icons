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
 * WeatherPartlyCloudyNight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, partly, cloudy, night
 * - Source: ic_fluent_weather_partly_cloudy_night_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherPartlyCloudyNight icon.
 */
public val FluentIcons.Regular.WeatherPartlyCloudyNight: ImageVector
    get() {
        if (_weatherPartlyCloudyNight != null) {
            return _weatherPartlyCloudyNight!!
        }
        _weatherPartlyCloudyNight = Builder(name = "WeatherPartlyCloudyNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.002f, 8.009f)
                curveTo(16.17f, 8.009f, 17.968f, 10.106f, 18.229f, 12.639f)
                lineTo(18.309f, 12.639f)
                curveTo(20.348f, 12.639f, 22.001f, 14.288f, 22.001f, 16.322f)
                curveTo(22.001f, 18.355f, 20.348f, 20.004f, 18.309f, 20.004f)
                horizontalLineTo(7.694f)
                curveTo(5.655f, 20.004f, 4.002f, 18.355f, 4.002f, 16.322f)
                curveTo(4.002f, 14.288f, 5.655f, 12.639f, 7.694f, 12.639f)
                lineTo(7.774f, 12.639f)
                curveTo(8.037f, 10.09f, 9.833f, 8.009f, 13.002f, 8.009f)
                close()
                moveTo(13.002f, 9.506f)
                curveTo(10.93f, 9.506f, 9.125f, 11.14f, 9.125f, 13.396f)
                curveTo(9.125f, 13.753f, 8.806f, 14.034f, 8.441f, 14.034f)
                lineTo(7.75f, 14.034f)
                curveTo(6.489f, 14.034f, 5.467f, 15.035f, 5.467f, 16.27f)
                curveTo(5.467f, 17.505f, 6.489f, 18.507f, 7.75f, 18.507f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 18.507f, 20.536f, 17.505f, 20.536f, 16.27f)
                curveTo(20.536f, 15.035f, 19.514f, 14.034f, 18.253f, 14.034f)
                lineTo(17.563f, 14.034f)
                curveTo(17.197f, 14.034f, 16.878f, 13.753f, 16.878f, 13.396f)
                curveTo(16.878f, 11.111f, 15.073f, 9.506f, 13.002f, 9.506f)
                close()
                moveTo(6.589f, 4.001f)
                curveTo(7.384f, 4.044f, 8.156f, 4.273f, 8.852f, 4.675f)
                curveTo(9.907f, 5.284f, 10.66f, 6.214f, 11.06f, 7.27f)
                curveTo(10.56f, 7.411f, 10.097f, 7.608f, 9.674f, 7.854f)
                curveTo(9.399f, 7.089f, 8.861f, 6.414f, 8.101f, 5.975f)
                curveTo(7.903f, 5.861f, 7.697f, 5.766f, 7.484f, 5.692f)
                curveTo(7.645f, 7.044f, 7.437f, 8.205f, 6.862f, 9.303f)
                lineTo(6.744f, 9.516f)
                curveTo(6.173f, 10.492f, 5.312f, 11.224f, 4.025f, 11.82f)
                curveTo(4.181f, 11.95f, 4.348f, 12.066f, 4.526f, 12.168f)
                curveTo(4.71f, 12.275f, 4.901f, 12.363f, 5.095f, 12.434f)
                curveTo(4.644f, 12.736f, 4.25f, 13.115f, 3.929f, 13.553f)
                curveTo(3.878f, 13.527f, 3.826f, 13.498f, 3.775f, 13.469f)
                curveTo(3.117f, 13.089f, 2.559f, 12.574f, 2.133f, 11.954f)
                curveTo(1.853f, 11.548f, 2.034f, 10.988f, 2.498f, 10.822f)
                curveTo(4.141f, 10.234f, 5.025f, 9.572f, 5.532f, 8.606f)
                curveTo(6.084f, 7.551f, 6.186f, 6.432f, 5.819f, 4.929f)
                curveTo(5.7f, 4.44f, 6.086f, 3.974f, 6.589f, 4.001f)
                close()
            }
        }
        .build()
        return _weatherPartlyCloudyNight!!
    }

@Suppress("ObjectPropertyName")
private var _weatherPartlyCloudyNight: ImageVector? = null

@Preview
@Composable
private fun WeatherPartlyCloudyNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherPartlyCloudyNight, contentDescription = null)
    }
}

