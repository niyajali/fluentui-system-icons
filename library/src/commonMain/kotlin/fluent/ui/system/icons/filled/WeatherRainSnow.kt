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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.WeatherRainSnow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherRainSnow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.534f, 17.553f)
            curveTo(14.948f, 17.553f, 15.284f, 17.889f, 15.284f, 18.303f)
            curveTo(15.284f, 18.717f, 14.948f, 19.053f, 14.534f, 19.053f)
            curveTo(14.12f, 19.053f, 13.784f, 18.717f, 13.784f, 18.303f)
            curveTo(13.784f, 17.889f, 14.12f, 17.553f, 14.534f, 17.553f)
            close()
            moveTo(12f, 4.001f)
            curveTo(15.168f, 4.001f, 16.966f, 6.098f, 17.227f, 8.631f)
            lineTo(17.307f, 8.631f)
            curveTo(19.346f, 8.631f, 20.999f, 10.28f, 20.999f, 12.314f)
            curveTo(20.999f, 14.347f, 19.346f, 15.996f, 17.307f, 15.996f)
            lineTo(16f, 15.997f)
            curveTo(15.905f, 16.303f, 15.62f, 16.524f, 15.284f, 16.524f)
            curveTo(14.947f, 16.524f, 14.662f, 16.303f, 14.567f, 15.997f)
            lineTo(8.987f, 15.996f)
            lineTo(7.405f, 18.625f)
            curveTo(7.198f, 18.983f, 6.739f, 19.106f, 6.381f, 18.899f)
            curveTo(6.052f, 18.709f, 5.921f, 18.308f, 6.061f, 17.966f)
            lineTo(6.106f, 17.875f)
            lineTo(7.255f, 15.996f)
            lineTo(6.693f, 15.996f)
            curveTo(4.653f, 15.996f, 3f, 14.347f, 3f, 12.314f)
            curveTo(3f, 10.28f, 4.653f, 8.631f, 6.693f, 8.631f)
            lineTo(6.773f, 8.631f)
            curveTo(7.035f, 6.082f, 8.831f, 4.001f, 12f, 4.001f)
            close()
            moveTo(11.578f, 16.705f)
            curveTo(11.906f, 16.895f, 12.037f, 17.296f, 11.897f, 17.638f)
            lineTo(11.852f, 17.729f)
            lineTo(11.295f, 18.625f)
            curveTo(11.088f, 18.984f, 10.63f, 19.107f, 10.271f, 18.9f)
            curveTo(9.942f, 18.71f, 9.811f, 18.309f, 9.951f, 17.967f)
            lineTo(9.996f, 17.875f)
            lineTo(10.553f, 16.979f)
            curveTo(10.76f, 16.621f, 11.219f, 16.498f, 11.578f, 16.705f)
            close()
            moveTo(17.033f, 16.803f)
            curveTo(17.448f, 16.803f, 17.783f, 17.139f, 17.783f, 17.553f)
            curveTo(17.783f, 17.967f, 17.448f, 18.303f, 17.033f, 18.303f)
            curveTo(16.619f, 18.303f, 16.283f, 17.967f, 16.283f, 17.553f)
            curveTo(16.283f, 17.139f, 16.619f, 16.803f, 17.033f, 16.803f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherRainSnowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherRainSnow, contentDescription = null)
    }
}
