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
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.WeatherSnowShowerNight: ImageVector
    get() {
        if (_WeatherSnowShowerNight != null) {
            return _WeatherSnowShowerNight!!
        }
        _WeatherSnowShowerNight = ImageVector.Builder(
            name = "Filled.WeatherSnowShowerNight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.75f, 20f)
                curveTo(11.164f, 20f, 11.5f, 20.336f, 11.5f, 20.75f)
                curveTo(11.5f, 21.164f, 11.164f, 21.5f, 10.75f, 21.5f)
                curveTo(10.336f, 21.5f, 10f, 21.164f, 10f, 20.75f)
                curveTo(10f, 20.336f, 10.336f, 20f, 10.75f, 20f)
                close()
                moveTo(15.25f, 20f)
                curveTo(15.664f, 20f, 16f, 20.336f, 16f, 20.75f)
                curveTo(16f, 21.164f, 15.664f, 21.5f, 15.25f, 21.5f)
                curveTo(14.836f, 21.5f, 14.5f, 21.164f, 14.5f, 20.75f)
                curveTo(14.5f, 20.336f, 14.836f, 20f, 15.25f, 20f)
                close()
                moveTo(8.5f, 19f)
                curveTo(8.914f, 19f, 9.25f, 19.336f, 9.25f, 19.75f)
                curveTo(9.25f, 20.164f, 8.914f, 20.5f, 8.5f, 20.5f)
                curveTo(8.086f, 20.5f, 7.75f, 20.164f, 7.75f, 19.75f)
                curveTo(7.75f, 19.336f, 8.086f, 19f, 8.5f, 19f)
                close()
                moveTo(13f, 19f)
                curveTo(13.414f, 19f, 13.75f, 19.336f, 13.75f, 19.75f)
                curveTo(13.75f, 20.164f, 13.414f, 20.5f, 13f, 20.5f)
                curveTo(12.586f, 20.5f, 12.25f, 20.164f, 12.25f, 19.75f)
                curveTo(12.25f, 19.336f, 12.586f, 19f, 13f, 19f)
                close()
                moveTo(17.5f, 19f)
                curveTo(17.914f, 19f, 18.25f, 19.336f, 18.25f, 19.75f)
                curveTo(18.25f, 20.164f, 17.914f, 20.5f, 17.5f, 20.5f)
                curveTo(17.086f, 20.5f, 16.75f, 20.164f, 16.75f, 19.75f)
                curveTo(16.75f, 19.336f, 17.086f, 19f, 17.5f, 19f)
                close()
                moveTo(13.001f, 6.018f)
                curveTo(16.17f, 6.018f, 17.967f, 8.115f, 18.229f, 10.648f)
                lineTo(18.309f, 10.648f)
                curveTo(20.348f, 10.648f, 22.001f, 12.297f, 22.001f, 14.33f)
                curveTo(22.001f, 16.364f, 20.348f, 18.013f, 18.309f, 18.013f)
                horizontalLineTo(7.694f)
                curveTo(5.655f, 18.013f, 4.002f, 16.364f, 4.002f, 14.33f)
                curveTo(4.002f, 12.297f, 5.655f, 10.648f, 7.694f, 10.648f)
                lineTo(7.774f, 10.648f)
                curveTo(8.037f, 8.098f, 9.833f, 6.018f, 13.001f, 6.018f)
                close()
                moveTo(6.588f, 2.01f)
                curveTo(7.384f, 2.053f, 8.155f, 2.282f, 8.852f, 2.684f)
                curveTo(9.906f, 3.292f, 10.66f, 4.222f, 11.06f, 5.279f)
                curveTo(9.075f, 5.841f, 7.655f, 7.28f, 7.066f, 9.225f)
                lineTo(6.996f, 9.471f)
                lineTo(6.939f, 9.709f)
                lineTo(6.733f, 9.747f)
                curveTo(5.589f, 9.988f, 4.598f, 10.648f, 3.929f, 11.562f)
                lineTo(3.774f, 11.477f)
                curveTo(3.117f, 11.098f, 2.559f, 10.582f, 2.132f, 9.963f)
                curveTo(1.853f, 9.557f, 2.034f, 8.997f, 2.498f, 8.831f)
                curveTo(4.14f, 8.243f, 5.025f, 7.581f, 5.531f, 6.615f)
                curveTo(6.084f, 5.56f, 6.186f, 4.441f, 5.819f, 2.938f)
                curveTo(5.7f, 2.449f, 6.086f, 1.983f, 6.588f, 2.01f)
                close()
            }
        }.build()

        return _WeatherSnowShowerNight!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherSnowShowerNight: ImageVector? = null

@Preview
@Composable
private fun WeatherSnowShowerNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherSnowShowerNight, contentDescription = null)
    }
}
