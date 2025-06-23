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

public val FluentIcons.Filled.WeatherPartlyCloudyNight: ImageVector
    get() {
        if (_WeatherPartlyCloudyNight != null) {
            return _WeatherPartlyCloudyNight!!
        }
        _WeatherPartlyCloudyNight = ImageVector.Builder(
            name = "Filled.WeatherPartlyCloudyNight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.002f, 8.013f)
                curveTo(16.17f, 8.013f, 17.968f, 10.11f, 18.229f, 12.643f)
                lineTo(18.309f, 12.643f)
                curveTo(20.348f, 12.643f, 22.001f, 14.292f, 22.001f, 16.326f)
                curveTo(22.001f, 18.359f, 20.348f, 20.008f, 18.309f, 20.008f)
                horizontalLineTo(7.694f)
                curveTo(5.655f, 20.008f, 4.002f, 18.359f, 4.002f, 16.326f)
                curveTo(4.002f, 14.292f, 5.655f, 12.643f, 7.694f, 12.643f)
                lineTo(7.774f, 12.643f)
                curveTo(8.037f, 10.094f, 9.833f, 8.013f, 13.002f, 8.013f)
                close()
                moveTo(6.589f, 4.005f)
                curveTo(7.384f, 4.048f, 8.156f, 4.277f, 8.852f, 4.679f)
                curveTo(9.907f, 5.288f, 10.66f, 6.218f, 11.06f, 7.274f)
                curveTo(9.076f, 7.836f, 7.656f, 9.275f, 7.066f, 11.22f)
                lineTo(6.997f, 11.466f)
                lineTo(6.939f, 11.704f)
                lineTo(6.733f, 11.742f)
                curveTo(5.59f, 11.983f, 4.598f, 12.643f, 3.929f, 13.557f)
                curveTo(3.878f, 13.531f, 3.826f, 13.502f, 3.775f, 13.473f)
                curveTo(3.117f, 13.093f, 2.559f, 12.578f, 2.133f, 11.958f)
                curveTo(1.853f, 11.552f, 2.034f, 10.992f, 2.498f, 10.826f)
                curveTo(4.141f, 10.238f, 5.025f, 9.576f, 5.532f, 8.61f)
                curveTo(6.084f, 7.555f, 6.186f, 6.436f, 5.819f, 4.933f)
                curveTo(5.7f, 4.444f, 6.086f, 3.978f, 6.589f, 4.005f)
                close()
            }
        }.build()

        return _WeatherPartlyCloudyNight!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherPartlyCloudyNight: ImageVector? = null

@Preview
@Composable
private fun WeatherPartlyCloudyNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherPartlyCloudyNight, contentDescription = null)
    }
}
