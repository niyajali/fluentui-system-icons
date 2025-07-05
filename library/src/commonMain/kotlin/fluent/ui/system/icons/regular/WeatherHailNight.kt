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
 * WeatherHailNight Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_hail_night_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherHailNight icon.
 */
public val FluentIcons.Regular.WeatherHailNight: ImageVector
    get() {
        if (_weatherHailNight != null) {
            return _weatherHailNight!!
        }
        _weatherHailNight = Builder(name = "WeatherHailNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                curveTo(13.552f, 20.0f, 14.0f, 20.448f, 14.0f, 21.0f)
                curveTo(14.0f, 21.552f, 13.552f, 22.0f, 13.0f, 22.0f)
                curveTo(12.448f, 22.0f, 12.0f, 21.552f, 12.0f, 21.0f)
                curveTo(12.0f, 20.448f, 12.448f, 20.0f, 13.0f, 20.0f)
                close()
                moveTo(9.5f, 19.0f)
                curveTo(10.052f, 19.0f, 10.5f, 19.448f, 10.5f, 20.0f)
                curveTo(10.5f, 20.552f, 10.052f, 21.0f, 9.5f, 21.0f)
                curveTo(8.948f, 21.0f, 8.5f, 20.552f, 8.5f, 20.0f)
                curveTo(8.5f, 19.448f, 8.948f, 19.0f, 9.5f, 19.0f)
                close()
                moveTo(16.5f, 19.0f)
                curveTo(17.052f, 19.0f, 17.5f, 19.448f, 17.5f, 20.0f)
                curveTo(17.5f, 20.552f, 17.052f, 21.0f, 16.5f, 21.0f)
                curveTo(15.948f, 21.0f, 15.5f, 20.552f, 15.5f, 20.0f)
                curveTo(15.5f, 19.448f, 15.948f, 19.0f, 16.5f, 19.0f)
                close()
                moveTo(13.002f, 6.009f)
                curveTo(16.17f, 6.009f, 17.968f, 8.106f, 18.229f, 10.639f)
                lineTo(18.309f, 10.639f)
                curveTo(20.348f, 10.639f, 22.001f, 12.288f, 22.001f, 14.322f)
                curveTo(22.001f, 16.355f, 20.348f, 18.004f, 18.309f, 18.004f)
                horizontalLineTo(7.694f)
                curveTo(5.655f, 18.004f, 4.002f, 16.355f, 4.002f, 14.322f)
                curveTo(4.002f, 12.288f, 5.655f, 10.639f, 7.694f, 10.639f)
                lineTo(7.774f, 10.639f)
                curveTo(8.037f, 8.09f, 9.833f, 6.009f, 13.002f, 6.009f)
                close()
                moveTo(13.002f, 7.506f)
                curveTo(10.93f, 7.506f, 9.125f, 9.14f, 9.125f, 11.396f)
                curveTo(9.125f, 11.753f, 8.806f, 12.034f, 8.441f, 12.034f)
                lineTo(7.75f, 12.034f)
                curveTo(6.489f, 12.034f, 5.467f, 13.035f, 5.467f, 14.27f)
                curveTo(5.467f, 15.505f, 6.489f, 16.507f, 7.75f, 16.507f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 16.507f, 20.536f, 15.505f, 20.536f, 14.27f)
                curveTo(20.536f, 13.035f, 19.514f, 12.034f, 18.253f, 12.034f)
                lineTo(17.563f, 12.034f)
                curveTo(17.197f, 12.034f, 16.878f, 11.753f, 16.878f, 11.396f)
                curveTo(16.878f, 9.111f, 15.073f, 7.506f, 13.002f, 7.506f)
                close()
                moveTo(6.589f, 2.001f)
                curveTo(7.384f, 2.044f, 8.156f, 2.273f, 8.852f, 2.675f)
                curveTo(9.907f, 3.284f, 10.66f, 4.214f, 11.06f, 5.27f)
                curveTo(10.56f, 5.411f, 10.097f, 5.608f, 9.674f, 5.854f)
                curveTo(9.399f, 5.089f, 8.861f, 4.414f, 8.101f, 3.975f)
                curveTo(7.903f, 3.861f, 7.697f, 3.766f, 7.484f, 3.692f)
                curveTo(7.645f, 5.044f, 7.437f, 6.205f, 6.862f, 7.303f)
                lineTo(6.744f, 7.516f)
                curveTo(6.173f, 8.492f, 5.312f, 9.224f, 4.025f, 9.82f)
                curveTo(4.181f, 9.95f, 4.348f, 10.066f, 4.526f, 10.168f)
                curveTo(4.71f, 10.275f, 4.901f, 10.363f, 5.095f, 10.434f)
                curveTo(4.644f, 10.736f, 4.25f, 11.115f, 3.929f, 11.553f)
                curveTo(3.878f, 11.527f, 3.826f, 11.498f, 3.775f, 11.469f)
                curveTo(3.117f, 11.089f, 2.559f, 10.574f, 2.133f, 9.954f)
                curveTo(1.853f, 9.548f, 2.034f, 8.988f, 2.498f, 8.822f)
                curveTo(4.141f, 8.234f, 5.025f, 7.572f, 5.532f, 6.606f)
                curveTo(6.084f, 5.551f, 6.186f, 4.432f, 5.819f, 2.929f)
                curveTo(5.7f, 2.44f, 6.086f, 1.974f, 6.589f, 2.001f)
                close()
            }
        }
        .build()
        return _weatherHailNight!!
    }

@Suppress("ObjectPropertyName")
private var _weatherHailNight: ImageVector? = null

@Preview
@Composable
private fun WeatherHailNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherHailNight, contentDescription = "WeatherHailNight Icon")
    }
}

