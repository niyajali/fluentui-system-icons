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

public val FluentUi.Filled.HeartPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.82f, 5.58f)
            lineTo(11.999f, 6.402f)
            lineTo(11.176f, 5.579f)
            curveTo(9.077f, 3.48f, 5.673f, 3.48f, 3.574f, 5.579f)
            curveTo(2.103f, 7.05f, 1.663f, 9.162f, 2.254f, 11.017f)
            curveTo(2.335f, 11.006f, 2.417f, 11f, 2.5f, 11f)
            horizontalLineTo(5.744f)
            lineTo(7.169f, 7.999f)
            curveTo(7.456f, 7.395f, 8.063f, 7.007f, 8.732f, 7f)
            curveTo(9.402f, 6.993f, 10.016f, 7.369f, 10.315f, 7.967f)
            lineTo(12.273f, 11.883f)
            lineTo(13.831f, 9.725f)
            curveTo(14.144f, 9.293f, 14.636f, 9.027f, 15.168f, 9.002f)
            curveTo(15.701f, 8.977f, 16.216f, 9.196f, 16.567f, 9.598f)
            lineTo(17.794f, 11f)
            horizontalLineTo(21.5f)
            curveTo(21.584f, 11f, 21.667f, 11.006f, 21.748f, 11.017f)
            curveTo(22.341f, 9.162f, 21.903f, 7.052f, 20.43f, 5.58f)
            curveTo(18.327f, 3.477f, 14.923f, 3.477f, 12.82f, 5.58f)
            close()
            moveTo(11.47f, 21.076f)
            lineTo(4.894f, 14.5f)
            horizontalLineTo(6.85f)
            curveTo(7.526f, 14.5f, 8.141f, 14.111f, 8.431f, 13.501f)
            lineTo(8.79f, 12.744f)
            lineTo(10.435f, 16.033f)
            curveTo(10.708f, 16.58f, 11.248f, 16.945f, 11.858f, 16.994f)
            curveTo(12.469f, 17.044f, 13.06f, 16.771f, 13.419f, 16.275f)
            lineTo(15.381f, 13.557f)
            lineTo(15.683f, 13.902f)
            curveTo(16.015f, 14.282f, 16.495f, 14.5f, 17f, 14.5f)
            horizontalLineTo(19.11f)
            lineTo(12.53f, 21.076f)
            curveTo(12.237f, 21.368f, 11.763f, 21.368f, 11.47f, 21.076f)
            close()
            moveTo(8.742f, 8f)
            curveTo(9.029f, 7.997f, 9.292f, 8.158f, 9.421f, 8.415f)
            lineTo(12.117f, 13.807f)
            lineTo(14.642f, 10.311f)
            curveTo(14.776f, 10.126f, 14.987f, 10.012f, 15.215f, 10.001f)
            curveTo(15.443f, 9.99f, 15.664f, 10.084f, 15.814f, 10.256f)
            lineTo(17.34f, 12f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 12f, 22f, 12.336f, 22f, 12.75f)
            curveTo(22f, 13.164f, 21.664f, 13.5f, 21.25f, 13.5f)
            horizontalLineTo(17f)
            curveTo(16.784f, 13.5f, 16.578f, 13.407f, 16.436f, 13.244f)
            lineTo(15.306f, 11.953f)
            lineTo(12.608f, 15.689f)
            curveTo(12.454f, 15.902f, 12.201f, 16.019f, 11.939f, 15.998f)
            curveTo(11.678f, 15.976f, 11.446f, 15.82f, 11.329f, 15.585f)
            lineTo(8.769f, 10.464f)
            lineTo(7.535f, 13.071f)
            curveTo(7.411f, 13.333f, 7.147f, 13.5f, 6.857f, 13.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 13.5f, 2f, 13.164f, 2f, 12.75f)
            curveTo(2f, 12.336f, 2.336f, 12f, 2.75f, 12f)
            horizontalLineTo(6.382f)
            lineTo(8.072f, 8.429f)
            curveTo(8.195f, 8.17f, 8.455f, 8.003f, 8.742f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HeartPulse, contentDescription = null)
    }
}
