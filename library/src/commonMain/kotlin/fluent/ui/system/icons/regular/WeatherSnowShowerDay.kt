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
 * WeatherSnowShowerDay icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, snow, shower, day
 * - Source: ic_fluent_weather_snow_shower_day_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherSnowShowerDay icon.
 */
public val FluentIcons.Regular.WeatherSnowShowerDay: ImageVector
    get() {
        if (_weatherSnowShowerDay != null) {
            return _weatherSnowShowerDay!!
        }
        _weatherSnowShowerDay = Builder(name = "WeatherSnowShowerDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 20.0f)
                curveTo(11.164f, 20.0f, 11.5f, 20.336f, 11.5f, 20.75f)
                curveTo(11.5f, 21.164f, 11.164f, 21.5f, 10.75f, 21.5f)
                curveTo(10.336f, 21.5f, 10.0f, 21.164f, 10.0f, 20.75f)
                curveTo(10.0f, 20.336f, 10.336f, 20.0f, 10.75f, 20.0f)
                close()
                moveTo(15.25f, 20.0f)
                curveTo(15.664f, 20.0f, 16.0f, 20.336f, 16.0f, 20.75f)
                curveTo(16.0f, 21.164f, 15.664f, 21.5f, 15.25f, 21.5f)
                curveTo(14.836f, 21.5f, 14.5f, 21.164f, 14.5f, 20.75f)
                curveTo(14.5f, 20.336f, 14.836f, 20.0f, 15.25f, 20.0f)
                close()
                moveTo(8.5f, 19.0f)
                curveTo(8.914f, 19.0f, 9.25f, 19.336f, 9.25f, 19.75f)
                curveTo(9.25f, 20.164f, 8.914f, 20.5f, 8.5f, 20.5f)
                curveTo(8.086f, 20.5f, 7.75f, 20.164f, 7.75f, 19.75f)
                curveTo(7.75f, 19.336f, 8.086f, 19.0f, 8.5f, 19.0f)
                close()
                moveTo(13.0f, 19.0f)
                curveTo(13.414f, 19.0f, 13.75f, 19.336f, 13.75f, 19.75f)
                curveTo(13.75f, 20.164f, 13.414f, 20.5f, 13.0f, 20.5f)
                curveTo(12.586f, 20.5f, 12.25f, 20.164f, 12.25f, 19.75f)
                curveTo(12.25f, 19.336f, 12.586f, 19.0f, 13.0f, 19.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(17.914f, 19.0f, 18.25f, 19.336f, 18.25f, 19.75f)
                curveTo(18.25f, 20.164f, 17.914f, 20.5f, 17.5f, 20.5f)
                curveTo(17.086f, 20.5f, 16.75f, 20.164f, 16.75f, 19.75f)
                curveTo(16.75f, 19.336f, 17.086f, 19.0f, 17.5f, 19.0f)
                close()
                moveTo(13.002f, 6.01f)
                curveTo(16.171f, 6.01f, 17.968f, 8.107f, 18.23f, 10.64f)
                lineTo(18.31f, 10.64f)
                curveTo(20.349f, 10.64f, 22.002f, 12.289f, 22.002f, 14.323f)
                curveTo(22.002f, 16.356f, 20.349f, 18.005f, 18.31f, 18.005f)
                horizontalLineTo(7.695f)
                curveTo(5.656f, 18.005f, 4.003f, 16.356f, 4.003f, 14.323f)
                curveTo(4.003f, 12.289f, 5.656f, 10.64f, 7.695f, 10.64f)
                lineTo(7.775f, 10.64f)
                curveTo(8.038f, 8.091f, 9.834f, 6.01f, 13.002f, 6.01f)
                close()
                moveTo(13.002f, 7.507f)
                curveTo(10.931f, 7.507f, 9.126f, 9.141f, 9.126f, 11.397f)
                curveTo(9.126f, 11.754f, 8.807f, 12.035f, 8.441f, 12.035f)
                lineTo(7.751f, 12.035f)
                curveTo(6.49f, 12.035f, 5.468f, 13.036f, 5.468f, 14.271f)
                curveTo(5.468f, 15.506f, 6.49f, 16.507f, 7.751f, 16.507f)
                horizontalLineTo(18.254f)
                curveTo(19.515f, 16.507f, 20.537f, 15.506f, 20.537f, 14.271f)
                curveTo(20.537f, 13.036f, 19.515f, 12.035f, 18.254f, 12.035f)
                lineTo(17.563f, 12.035f)
                curveTo(17.198f, 12.035f, 16.879f, 11.754f, 16.879f, 11.397f)
                curveTo(16.879f, 9.112f, 15.074f, 7.507f, 13.002f, 7.507f)
                close()
                moveTo(4.368f, 10.165f)
                curveTo(4.513f, 10.516f, 4.373f, 10.914f, 4.053f, 11.1f)
                lineTo(3.962f, 11.145f)
                lineTo(3.036f, 11.529f)
                curveTo(2.653f, 11.687f, 2.214f, 11.506f, 2.056f, 11.123f)
                curveTo(1.911f, 10.772f, 2.051f, 10.374f, 2.37f, 10.188f)
                lineTo(2.462f, 10.143f)
                lineTo(3.388f, 9.759f)
                curveTo(3.771f, 9.601f, 4.209f, 9.783f, 4.368f, 10.165f)
                close()
                moveTo(10.855f, 5.332f)
                lineTo(10.683f, 5.39f)
                curveTo(10.149f, 5.578f, 9.661f, 5.834f, 9.223f, 6.148f)
                curveTo(8.69f, 5.974f, 8.093f, 5.982f, 7.534f, 6.214f)
                curveTo(6.288f, 6.73f, 5.696f, 8.158f, 6.212f, 9.404f)
                curveTo(6.273f, 9.55f, 6.346f, 9.688f, 6.43f, 9.815f)
                curveTo(5.938f, 9.953f, 5.477f, 10.171f, 5.064f, 10.455f)
                curveTo(4.975f, 10.304f, 4.896f, 10.145f, 4.827f, 9.978f)
                curveTo(3.994f, 7.967f, 4.949f, 5.661f, 6.96f, 4.828f)
                curveTo(8.302f, 4.272f, 9.776f, 4.513f, 10.855f, 5.332f)
                close()
                moveTo(2.941f, 5.363f)
                lineTo(3.047f, 5.398f)
                lineTo(3.973f, 5.782f)
                curveTo(4.356f, 5.94f, 4.537f, 6.379f, 4.379f, 6.762f)
                curveTo(4.235f, 7.11f, 3.859f, 7.291f, 3.504f, 7.202f)
                lineTo(3.399f, 7.168f)
                lineTo(2.473f, 6.784f)
                curveTo(2.09f, 6.625f, 1.908f, 6.187f, 2.067f, 5.804f)
                curveTo(2.211f, 5.456f, 2.587f, 5.274f, 2.941f, 5.363f)
                close()
                moveTo(6.756f, 2.377f)
                lineTo(6.802f, 2.468f)
                lineTo(7.185f, 3.394f)
                curveTo(7.344f, 3.777f, 7.162f, 4.216f, 6.779f, 4.374f)
                curveTo(6.429f, 4.52f, 6.031f, 4.379f, 5.845f, 4.06f)
                lineTo(5.8f, 3.968f)
                lineTo(5.416f, 3.042f)
                curveTo(5.257f, 2.66f, 5.439f, 2.221f, 5.822f, 2.062f)
                curveTo(6.173f, 1.917f, 6.57f, 2.058f, 6.756f, 2.377f)
                close()
                moveTo(11.11f, 2.058f)
                curveTo(11.458f, 2.202f, 11.639f, 2.578f, 11.55f, 2.933f)
                lineTo(11.516f, 3.038f)
                lineTo(11.132f, 3.964f)
                curveTo(10.973f, 4.347f, 10.535f, 4.529f, 10.152f, 4.37f)
                curveTo(9.804f, 4.226f, 9.622f, 3.851f, 9.711f, 3.496f)
                lineTo(9.746f, 3.39f)
                lineTo(10.13f, 2.464f)
                curveTo(10.288f, 2.081f, 10.727f, 1.9f, 11.11f, 2.058f)
                close()
            }
        }
        .build()
        return _weatherSnowShowerDay!!
    }

@Suppress("ObjectPropertyName")
private var _weatherSnowShowerDay: ImageVector? = null

@Preview
@Composable
private fun WeatherSnowShowerDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherSnowShowerDay, contentDescription = null)
    }
}

