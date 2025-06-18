/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.WeatherRain: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherRain",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4.001f)
            curveTo(15.168f, 4.001f, 16.966f, 6.098f, 17.227f, 8.631f)
            lineTo(17.307f, 8.631f)
            curveTo(19.346f, 8.631f, 20.999f, 10.28f, 20.999f, 12.314f)
            curveTo(20.999f, 14.347f, 19.346f, 15.996f, 17.307f, 15.996f)
            lineTo(16.725f, 15.996f)
            lineTo(15.142f, 18.633f)
            curveTo(14.935f, 18.991f, 14.476f, 19.114f, 14.118f, 18.907f)
            curveTo(13.789f, 18.717f, 13.658f, 18.316f, 13.798f, 17.974f)
            lineTo(13.843f, 17.883f)
            lineTo(14.993f, 15.996f)
            horizontalLineTo(12.856f)
            lineTo(11.274f, 18.633f)
            curveTo(11.067f, 18.991f, 10.608f, 19.114f, 10.249f, 18.907f)
            curveTo(9.921f, 18.717f, 9.79f, 18.316f, 9.93f, 17.974f)
            lineTo(9.975f, 17.883f)
            lineTo(11.125f, 15.996f)
            horizontalLineTo(8.987f)
            lineTo(7.406f, 18.633f)
            curveTo(7.199f, 18.991f, 6.74f, 19.114f, 6.381f, 18.907f)
            curveTo(6.052f, 18.717f, 5.922f, 18.316f, 6.062f, 17.974f)
            lineTo(6.107f, 17.883f)
            lineTo(7.255f, 15.996f)
            lineTo(6.693f, 15.996f)
            curveTo(4.653f, 15.996f, 3f, 14.347f, 3f, 12.314f)
            curveTo(3f, 10.28f, 4.653f, 8.631f, 6.693f, 8.631f)
            lineTo(6.773f, 8.631f)
            curveTo(7.035f, 6.082f, 8.831f, 4.001f, 12f, 4.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherRainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherRain, contentDescription = null)
    }
}
