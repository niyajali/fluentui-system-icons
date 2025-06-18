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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.WeatherCloudy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherCloudy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.002f, 7.009f)
            curveTo(16.17f, 7.009f, 17.968f, 9.106f, 18.229f, 11.639f)
            lineTo(18.309f, 11.639f)
            curveTo(20.348f, 11.639f, 22.001f, 13.288f, 22.001f, 15.322f)
            curveTo(22.001f, 17.355f, 20.348f, 19.004f, 18.309f, 19.004f)
            horizontalLineTo(7.694f)
            curveTo(5.655f, 19.004f, 4.002f, 17.355f, 4.002f, 15.322f)
            curveTo(4.002f, 13.288f, 5.655f, 11.639f, 7.694f, 11.639f)
            lineTo(7.774f, 11.639f)
            curveTo(8.037f, 9.09f, 9.833f, 7.009f, 13.002f, 7.009f)
            close()
            moveTo(10f, 4f)
            curveTo(11.617f, 4f, 13.049f, 4.815f, 13.9f, 6.062f)
            curveTo(13.61f, 6.027f, 13.31f, 6.009f, 13.002f, 6.009f)
            curveTo(10.008f, 6.009f, 7.831f, 7.686f, 7.065f, 10.222f)
            lineTo(6.997f, 10.462f)
            lineTo(6.939f, 10.7f)
            lineTo(6.733f, 10.738f)
            curveTo(5.124f, 11.077f, 3.816f, 12.247f, 3.284f, 13.784f)
            curveTo(2.504f, 13.184f, 2f, 12.241f, 2f, 11.179f)
            curveTo(2f, 9.429f, 3.37f, 7.999f, 5.096f, 7.903f)
            lineTo(5.353f, 7.897f)
            curveTo(5.742f, 5.676f, 7.682f, 4f, 10f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherCloudyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherCloudy, contentDescription = null)
    }
}
