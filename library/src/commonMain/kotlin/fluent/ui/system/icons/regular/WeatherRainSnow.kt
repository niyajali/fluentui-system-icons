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
 * WeatherRainSnow Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_rain_snow_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherRainSnow icon.
 */
public val FluentIcons.Regular.WeatherRainSnow: ImageVector
    get() {
        if (_weatherRainSnow != null) {
            return _weatherRainSnow!!
        }
        _weatherRainSnow = Builder(name = "WeatherRainSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.498f, 17.5f)
                curveTo(14.912f, 17.5f, 15.248f, 17.836f, 15.248f, 18.25f)
                curveTo(15.248f, 18.664f, 14.912f, 19.0f, 14.498f, 19.0f)
                curveTo(14.084f, 19.0f, 13.748f, 18.664f, 13.748f, 18.25f)
                curveTo(13.748f, 17.836f, 14.084f, 17.5f, 14.498f, 17.5f)
                close()
                moveTo(12.0f, 4.001f)
                curveTo(15.168f, 4.001f, 16.966f, 6.098f, 17.227f, 8.631f)
                lineTo(17.307f, 8.631f)
                curveTo(19.346f, 8.631f, 20.999f, 10.28f, 20.999f, 12.314f)
                curveTo(20.999f, 14.347f, 19.346f, 15.996f, 17.307f, 15.996f)
                lineTo(16.0f, 15.997f)
                curveTo(15.905f, 16.303f, 15.62f, 16.524f, 15.284f, 16.524f)
                curveTo(14.947f, 16.524f, 14.662f, 16.303f, 14.567f, 15.997f)
                lineTo(8.987f, 15.996f)
                lineTo(7.409f, 18.623f)
                curveTo(7.202f, 18.982f, 6.743f, 19.105f, 6.384f, 18.898f)
                curveTo(6.055f, 18.708f, 5.925f, 18.306f, 6.065f, 17.965f)
                lineTo(6.11f, 17.873f)
                lineTo(7.255f, 15.996f)
                lineTo(6.693f, 15.996f)
                curveTo(4.653f, 15.996f, 3.0f, 14.347f, 3.0f, 12.314f)
                curveTo(3.0f, 10.28f, 4.653f, 8.631f, 6.693f, 8.631f)
                lineTo(6.773f, 8.631f)
                curveTo(7.035f, 6.082f, 8.831f, 4.001f, 12.0f, 4.001f)
                close()
                moveTo(11.578f, 16.705f)
                curveTo(11.906f, 16.895f, 12.037f, 17.296f, 11.897f, 17.638f)
                lineTo(11.852f, 17.729f)
                lineTo(11.285f, 18.628f)
                curveTo(11.078f, 18.987f, 10.62f, 19.11f, 10.261f, 18.903f)
                curveTo(9.932f, 18.713f, 9.801f, 18.312f, 9.941f, 17.97f)
                lineTo(9.986f, 17.878f)
                lineTo(10.553f, 16.979f)
                curveTo(10.76f, 16.621f, 11.219f, 16.498f, 11.578f, 16.705f)
                close()
                moveTo(17.25f, 17.0f)
                curveTo(17.664f, 17.0f, 18.0f, 17.336f, 18.0f, 17.75f)
                curveTo(18.0f, 18.164f, 17.664f, 18.5f, 17.25f, 18.5f)
                curveTo(16.836f, 18.5f, 16.5f, 18.164f, 16.5f, 17.75f)
                curveTo(16.5f, 17.336f, 16.836f, 17.0f, 17.25f, 17.0f)
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
        return _weatherRainSnow!!
    }

@Suppress("ObjectPropertyName")
private var _weatherRainSnow: ImageVector? = null

@Preview
@Composable
private fun WeatherRainSnowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherRainSnow, contentDescription = "WeatherRainSnow Icon")
    }
}

