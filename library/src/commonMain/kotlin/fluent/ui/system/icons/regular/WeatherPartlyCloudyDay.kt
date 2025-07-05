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
 * WeatherPartlyCloudyDay Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_partly_cloudy_day_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherPartlyCloudyDay icon.
 */
public val FluentIcons.Regular.WeatherPartlyCloudyDay: ImageVector
    get() {
        if (_weatherPartlyCloudyDay != null) {
            return _weatherPartlyCloudyDay!!
        }
        _weatherPartlyCloudyDay = Builder(name = "WeatherPartlyCloudyDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.002f, 8.007f)
                curveTo(16.171f, 8.007f, 17.968f, 10.104f, 18.229f, 12.637f)
                lineTo(18.309f, 12.637f)
                curveTo(20.348f, 12.637f, 22.001f, 14.286f, 22.001f, 16.32f)
                curveTo(22.001f, 18.353f, 20.348f, 20.002f, 18.309f, 20.002f)
                horizontalLineTo(7.695f)
                curveTo(5.656f, 20.002f, 4.003f, 18.353f, 4.003f, 16.32f)
                curveTo(4.003f, 14.286f, 5.656f, 12.637f, 7.695f, 12.637f)
                lineTo(7.775f, 12.637f)
                curveTo(8.038f, 10.088f, 9.834f, 8.007f, 13.002f, 8.007f)
                close()
                moveTo(13.002f, 9.505f)
                curveTo(10.931f, 9.505f, 9.125f, 11.138f, 9.125f, 13.394f)
                curveTo(9.125f, 13.751f, 8.806f, 14.032f, 8.441f, 14.032f)
                lineTo(7.751f, 14.032f)
                curveTo(6.49f, 14.032f, 5.467f, 15.033f, 5.467f, 16.268f)
                curveTo(5.467f, 17.503f, 6.49f, 18.504f, 7.751f, 18.504f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 18.504f, 20.537f, 17.503f, 20.537f, 16.268f)
                curveTo(20.537f, 15.033f, 19.514f, 14.032f, 18.253f, 14.032f)
                lineTo(17.563f, 14.032f)
                curveTo(17.198f, 14.032f, 16.879f, 13.751f, 16.879f, 13.394f)
                curveTo(16.879f, 11.109f, 15.073f, 9.505f, 13.002f, 9.505f)
                close()
                moveTo(4.368f, 12.162f)
                curveTo(4.513f, 12.513f, 4.372f, 12.911f, 4.053f, 13.097f)
                lineTo(3.962f, 13.142f)
                lineTo(3.036f, 13.526f)
                curveTo(2.653f, 13.684f, 2.214f, 13.503f, 2.056f, 13.12f)
                curveTo(1.91f, 12.769f, 2.051f, 12.371f, 2.37f, 12.185f)
                lineTo(2.461f, 12.14f)
                lineTo(3.388f, 11.757f)
                curveTo(3.77f, 11.598f, 4.209f, 11.78f, 4.368f, 12.162f)
                close()
                moveTo(10.855f, 7.329f)
                lineTo(10.683f, 7.387f)
                curveTo(10.149f, 7.575f, 9.66f, 7.831f, 9.223f, 8.145f)
                curveTo(8.689f, 7.971f, 8.093f, 7.979f, 7.534f, 8.211f)
                curveTo(6.288f, 8.727f, 5.696f, 10.155f, 6.212f, 11.401f)
                curveTo(6.273f, 11.547f, 6.346f, 11.685f, 6.43f, 11.812f)
                curveTo(5.938f, 11.95f, 5.477f, 12.168f, 5.063f, 12.451f)
                curveTo(4.975f, 12.301f, 4.895f, 12.142f, 4.826f, 11.975f)
                curveTo(3.993f, 9.964f, 4.948f, 7.658f, 6.96f, 6.825f)
                curveTo(8.302f, 6.269f, 9.775f, 6.51f, 10.855f, 7.329f)
                close()
                moveTo(2.941f, 7.36f)
                lineTo(3.046f, 7.395f)
                lineTo(3.973f, 7.779f)
                curveTo(4.355f, 7.937f, 4.537f, 8.376f, 4.379f, 8.759f)
                curveTo(4.234f, 9.107f, 3.859f, 9.288f, 3.504f, 9.2f)
                lineTo(3.399f, 9.165f)
                lineTo(2.472f, 8.781f)
                curveTo(2.09f, 8.622f, 1.908f, 8.184f, 2.066f, 7.801f)
                curveTo(2.211f, 7.453f, 2.586f, 7.271f, 2.941f, 7.36f)
                close()
                moveTo(6.756f, 4.374f)
                lineTo(6.801f, 4.465f)
                lineTo(7.185f, 5.392f)
                curveTo(7.344f, 5.774f, 7.162f, 6.213f, 6.779f, 6.371f)
                curveTo(6.428f, 6.517f, 6.031f, 6.376f, 5.845f, 6.057f)
                lineTo(5.799f, 5.966f)
                lineTo(5.416f, 5.039f)
                curveTo(5.257f, 4.657f, 5.439f, 4.218f, 5.821f, 4.059f)
                curveTo(6.172f, 3.914f, 6.57f, 4.055f, 6.756f, 4.374f)
                close()
                moveTo(11.109f, 4.055f)
                curveTo(11.457f, 4.199f, 11.639f, 4.575f, 11.55f, 4.93f)
                lineTo(11.515f, 5.035f)
                lineTo(11.132f, 5.962f)
                curveTo(10.973f, 6.344f, 10.535f, 6.526f, 10.152f, 6.367f)
                curveTo(9.804f, 6.223f, 9.622f, 5.848f, 9.711f, 5.493f)
                lineTo(9.746f, 5.387f)
                lineTo(10.13f, 4.461f)
                curveTo(10.288f, 4.079f, 10.727f, 3.897f, 11.109f, 4.055f)
                close()
            }
        }
        .build()
        return _weatherPartlyCloudyDay!!
    }

@Suppress("ObjectPropertyName")
private var _weatherPartlyCloudyDay: ImageVector? = null

@Preview
@Composable
private fun WeatherPartlyCloudyDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherPartlyCloudyDay, contentDescription = "WeatherPartlyCloudyDay Icon")
    }
}

