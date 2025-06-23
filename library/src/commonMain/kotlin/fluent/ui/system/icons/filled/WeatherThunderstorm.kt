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

public val FluentIcons.Filled.WeatherThunderstorm: ImageVector
    get() {
        if (_WeatherThunderstorm != null) {
            return _WeatherThunderstorm!!
        }
        _WeatherThunderstorm = ImageVector.Builder(
            name = "Filled.WeatherThunderstorm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.759f, 13.204f)
                curveTo(14.068f, 13.481f, 14.093f, 13.955f, 13.816f, 14.263f)
                lineTo(12.705f, 15.499f)
                horizontalLineTo(14.981f)
                curveTo(15.609f, 15.499f, 15.959f, 16.225f, 15.568f, 16.717f)
                lineTo(12.356f, 20.748f)
                curveTo(12.098f, 21.072f, 11.626f, 21.126f, 11.302f, 20.868f)
                curveTo(10.978f, 20.609f, 10.925f, 20.138f, 11.183f, 19.813f)
                lineTo(13.425f, 16.999f)
                horizontalLineTo(11.022f)
                curveTo(10.373f, 16.999f, 10.031f, 16.231f, 10.464f, 15.748f)
                lineTo(12.7f, 13.26f)
                curveTo(12.977f, 12.952f, 13.451f, 12.927f, 13.759f, 13.204f)
                close()
                moveTo(13.002f, 5.009f)
                curveTo(16.17f, 5.009f, 17.968f, 7.106f, 18.229f, 9.639f)
                lineTo(18.309f, 9.639f)
                curveTo(20.348f, 9.639f, 22.001f, 11.288f, 22.001f, 13.322f)
                curveTo(22.001f, 15.355f, 20.348f, 17.004f, 18.309f, 17.004f)
                lineTo(16.562f, 17.005f)
                curveTo(17.104f, 15.891f, 16.31f, 14.499f, 14.981f, 14.499f)
                horizontalLineTo(14.846f)
                curveTo(15.161f, 13.82f, 15.014f, 12.987f, 14.428f, 12.46f)
                curveTo(13.709f, 11.814f, 12.603f, 11.873f, 11.957f, 12.592f)
                lineTo(9.721f, 15.08f)
                curveTo(9.202f, 15.656f, 9.159f, 16.408f, 9.444f, 17.005f)
                lineTo(7.694f, 17.004f)
                curveTo(5.655f, 17.004f, 4.002f, 15.355f, 4.002f, 13.322f)
                curveTo(4.002f, 11.288f, 5.655f, 9.639f, 7.694f, 9.639f)
                lineTo(7.774f, 9.639f)
                curveTo(8.037f, 7.09f, 9.833f, 5.009f, 13.002f, 5.009f)
                close()
                moveTo(10f, 2f)
                curveTo(11.617f, 2f, 13.049f, 2.815f, 13.9f, 4.062f)
                curveTo(13.61f, 4.027f, 13.31f, 4.009f, 13.002f, 4.009f)
                curveTo(10.008f, 4.009f, 7.831f, 5.686f, 7.065f, 8.222f)
                lineTo(6.997f, 8.462f)
                lineTo(6.939f, 8.7f)
                lineTo(6.733f, 8.739f)
                curveTo(5.124f, 9.077f, 3.816f, 10.247f, 3.284f, 11.784f)
                curveTo(2.504f, 11.184f, 2f, 10.241f, 2f, 9.179f)
                curveTo(2f, 7.429f, 3.37f, 5.999f, 5.096f, 5.903f)
                lineTo(5.353f, 5.897f)
                curveTo(5.742f, 3.676f, 7.682f, 2f, 10f, 2f)
                close()
            }
        }.build()

        return _WeatherThunderstorm!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherThunderstorm: ImageVector? = null

@Preview
@Composable
private fun WeatherThunderstormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherThunderstorm, contentDescription = null)
    }
}
