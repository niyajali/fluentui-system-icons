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

public val FluentIcons.Filled.WeatherRainShowersNight: ImageVector
    get() {
        if (_WeatherRainShowersNight != null) {
            return _WeatherRainShowersNight!!
        }
        _WeatherRainShowersNight = ImageVector.Builder(
            name = "Filled.WeatherRainShowersNight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.001f, 6.01f)
                curveTo(16.17f, 6.01f, 17.967f, 8.107f, 18.229f, 10.64f)
                lineTo(18.309f, 10.64f)
                curveTo(20.348f, 10.64f, 22.001f, 12.289f, 22.001f, 14.323f)
                curveTo(22.001f, 16.356f, 20.348f, 18.005f, 18.309f, 18.005f)
                lineTo(17.676f, 18f)
                lineTo(16.134f, 20.631f)
                curveTo(15.927f, 20.99f, 15.468f, 21.112f, 15.109f, 20.905f)
                curveTo(14.78f, 20.715f, 14.65f, 20.314f, 14.79f, 19.972f)
                lineTo(14.835f, 19.881f)
                lineTo(15.944f, 18f)
                horizontalLineTo(13.808f)
                lineTo(12.265f, 20.631f)
                curveTo(12.058f, 20.99f, 11.6f, 21.112f, 11.241f, 20.905f)
                curveTo(10.912f, 20.715f, 10.781f, 20.314f, 10.921f, 19.972f)
                lineTo(10.966f, 19.881f)
                lineTo(12.076f, 18f)
                horizontalLineTo(9.939f)
                lineTo(8.397f, 20.631f)
                curveTo(8.19f, 20.99f, 7.731f, 21.112f, 7.373f, 20.905f)
                curveTo(7.044f, 20.715f, 6.913f, 20.314f, 7.053f, 19.972f)
                lineTo(7.098f, 19.881f)
                lineTo(8.207f, 18f)
                lineTo(7.6f, 18f)
                curveTo(5.561f, 18f, 4.002f, 16.356f, 4.002f, 14.323f)
                curveTo(4.002f, 12.289f, 5.655f, 10.64f, 7.694f, 10.64f)
                lineTo(7.774f, 10.64f)
                curveTo(8.037f, 8.091f, 9.833f, 6.01f, 13.001f, 6.01f)
                close()
                moveTo(6.588f, 2.002f)
                curveTo(7.384f, 2.045f, 8.155f, 2.274f, 8.852f, 2.676f)
                curveTo(9.906f, 3.285f, 10.66f, 4.215f, 11.06f, 5.271f)
                curveTo(9.075f, 5.834f, 7.655f, 7.273f, 7.066f, 9.217f)
                lineTo(6.996f, 9.463f)
                lineTo(6.939f, 9.701f)
                lineTo(6.733f, 9.739f)
                curveTo(5.589f, 9.98f, 4.598f, 10.64f, 3.929f, 11.554f)
                lineTo(3.774f, 11.47f)
                curveTo(3.117f, 11.09f, 2.559f, 10.575f, 2.132f, 9.955f)
                curveTo(1.853f, 9.549f, 2.034f, 8.989f, 2.498f, 8.823f)
                curveTo(4.14f, 8.235f, 5.025f, 7.573f, 5.531f, 6.607f)
                curveTo(6.084f, 5.552f, 6.186f, 4.433f, 5.819f, 2.93f)
                curveTo(5.7f, 2.441f, 6.086f, 1.975f, 6.588f, 2.002f)
                close()
            }
        }.build()

        return _WeatherRainShowersNight!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherRainShowersNight: ImageVector? = null

@Preview
@Composable
private fun WeatherRainShowersNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherRainShowersNight, contentDescription = null)
    }
}
