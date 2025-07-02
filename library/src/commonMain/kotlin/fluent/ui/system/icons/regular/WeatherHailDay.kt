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
 * WeatherHailDay icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, hail, day
 * - Source: ic_fluent_weather_hail_day_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherHailDay icon.
 */
public val FluentIcons.Regular.WeatherHailDay: ImageVector
    get() {
        if (_weatherHailDay != null) {
            return _weatherHailDay!!
        }
        _weatherHailDay = Builder(name = "WeatherHailDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(10.931f, 7.506f, 9.125f, 9.14f, 9.125f, 11.396f)
                curveTo(9.125f, 11.753f, 8.806f, 12.034f, 8.441f, 12.034f)
                lineTo(7.75f, 12.034f)
                curveTo(6.489f, 12.034f, 5.467f, 13.035f, 5.467f, 14.27f)
                curveTo(5.467f, 15.505f, 6.489f, 16.507f, 7.75f, 16.507f)
                horizontalLineTo(18.253f)
                curveTo(19.514f, 16.507f, 20.536f, 15.505f, 20.536f, 14.27f)
                curveTo(20.536f, 13.035f, 19.514f, 12.034f, 18.253f, 12.034f)
                lineTo(17.563f, 12.034f)
                curveTo(17.198f, 12.034f, 16.878f, 11.753f, 16.878f, 11.396f)
                curveTo(16.878f, 9.111f, 15.073f, 7.506f, 13.002f, 7.506f)
                close()
                moveTo(4.367f, 10.164f)
                curveTo(4.513f, 10.515f, 4.372f, 10.913f, 4.053f, 11.099f)
                lineTo(3.962f, 11.144f)
                lineTo(3.035f, 11.528f)
                curveTo(2.653f, 11.686f, 2.214f, 11.505f, 2.055f, 11.122f)
                curveTo(1.91f, 10.771f, 2.051f, 10.373f, 2.37f, 10.187f)
                lineTo(2.461f, 10.142f)
                lineTo(3.388f, 9.758f)
                curveTo(3.77f, 9.6f, 4.209f, 9.782f, 4.367f, 10.164f)
                close()
                moveTo(10.854f, 5.331f)
                lineTo(10.683f, 5.389f)
                curveTo(10.149f, 5.577f, 9.66f, 5.833f, 9.223f, 6.147f)
                curveTo(8.689f, 5.973f, 8.093f, 5.981f, 7.533f, 6.213f)
                curveTo(6.288f, 6.729f, 5.696f, 8.157f, 6.212f, 9.403f)
                curveTo(6.273f, 9.549f, 6.346f, 9.687f, 6.43f, 9.814f)
                curveTo(5.938f, 9.952f, 5.477f, 10.17f, 5.063f, 10.453f)
                curveTo(4.974f, 10.303f, 4.895f, 10.144f, 4.826f, 9.977f)
                curveTo(3.993f, 7.966f, 4.948f, 5.66f, 6.959f, 4.827f)
                curveTo(8.302f, 4.271f, 9.775f, 4.512f, 10.854f, 5.331f)
                close()
                moveTo(2.941f, 5.362f)
                lineTo(3.046f, 5.397f)
                lineTo(3.972f, 5.781f)
                curveTo(4.355f, 5.939f, 4.537f, 6.378f, 4.378f, 6.761f)
                curveTo(4.234f, 7.109f, 3.859f, 7.29f, 3.504f, 7.202f)
                lineTo(3.398f, 7.167f)
                lineTo(2.472f, 6.783f)
                curveTo(2.089f, 6.624f, 1.908f, 6.186f, 2.066f, 5.803f)
                curveTo(2.21f, 5.455f, 2.586f, 5.273f, 2.941f, 5.362f)
                close()
                moveTo(6.756f, 2.376f)
                lineTo(6.801f, 2.467f)
                lineTo(7.185f, 3.393f)
                curveTo(7.343f, 3.776f, 7.162f, 4.215f, 6.779f, 4.373f)
                curveTo(6.428f, 4.519f, 6.03f, 4.378f, 5.844f, 4.059f)
                lineTo(5.799f, 3.967f)
                lineTo(5.415f, 3.041f)
                curveTo(5.257f, 2.659f, 5.439f, 2.22f, 5.821f, 2.061f)
                curveTo(6.172f, 1.916f, 6.57f, 2.057f, 6.756f, 2.376f)
                close()
                moveTo(11.109f, 2.057f)
                curveTo(11.457f, 2.201f, 11.639f, 2.577f, 11.55f, 2.932f)
                lineTo(11.515f, 3.037f)
                lineTo(11.132f, 3.963f)
                curveTo(10.973f, 4.346f, 10.534f, 4.528f, 10.151f, 4.369f)
                curveTo(9.804f, 4.225f, 9.622f, 3.85f, 9.711f, 3.495f)
                lineTo(9.746f, 3.389f)
                lineTo(10.129f, 2.463f)
                curveTo(10.288f, 2.08f, 10.727f, 1.899f, 11.109f, 2.057f)
                close()
            }
        }
        .build()
        return _weatherHailDay!!
    }

@Suppress("ObjectPropertyName")
private var _weatherHailDay: ImageVector? = null

@Preview
@Composable
private fun WeatherHailDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherHailDay, contentDescription = null)
    }
}

