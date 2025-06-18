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

public val FluentUi.Filled.WeatherHailNight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherHailNight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 20f)
            curveTo(13.552f, 20f, 14f, 20.448f, 14f, 21f)
            curveTo(14f, 21.552f, 13.552f, 22f, 13f, 22f)
            curveTo(12.448f, 22f, 12f, 21.552f, 12f, 21f)
            curveTo(12f, 20.448f, 12.448f, 20f, 13f, 20f)
            close()
            moveTo(9.5f, 19f)
            curveTo(10.052f, 19f, 10.5f, 19.448f, 10.5f, 20f)
            curveTo(10.5f, 20.552f, 10.052f, 21f, 9.5f, 21f)
            curveTo(8.948f, 21f, 8.5f, 20.552f, 8.5f, 20f)
            curveTo(8.5f, 19.448f, 8.948f, 19f, 9.5f, 19f)
            close()
            moveTo(16.5f, 19f)
            curveTo(17.052f, 19f, 17.5f, 19.448f, 17.5f, 20f)
            curveTo(17.5f, 20.552f, 17.052f, 21f, 16.5f, 21f)
            curveTo(15.948f, 21f, 15.5f, 20.552f, 15.5f, 20f)
            curveTo(15.5f, 19.448f, 15.948f, 19f, 16.5f, 19f)
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
            moveTo(6.589f, 2.001f)
            curveTo(7.384f, 2.044f, 8.156f, 2.273f, 8.852f, 2.675f)
            curveTo(9.907f, 3.284f, 10.66f, 4.214f, 11.06f, 5.27f)
            curveTo(9.076f, 5.833f, 7.656f, 7.272f, 7.066f, 9.217f)
            lineTo(6.997f, 9.462f)
            lineTo(6.939f, 9.7f)
            lineTo(6.733f, 9.739f)
            curveTo(5.59f, 9.979f, 4.598f, 10.639f, 3.929f, 11.553f)
            curveTo(3.878f, 11.527f, 3.826f, 11.498f, 3.775f, 11.469f)
            curveTo(3.117f, 11.089f, 2.559f, 10.574f, 2.133f, 9.954f)
            curveTo(1.853f, 9.548f, 2.034f, 8.988f, 2.498f, 8.822f)
            curveTo(4.141f, 8.234f, 5.025f, 7.572f, 5.532f, 6.606f)
            curveTo(6.084f, 5.551f, 6.186f, 4.432f, 5.819f, 2.929f)
            curveTo(5.7f, 2.44f, 6.086f, 1.974f, 6.589f, 2.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherHailNightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherHailNight, contentDescription = null)
    }
}
