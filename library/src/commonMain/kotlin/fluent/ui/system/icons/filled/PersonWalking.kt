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

public val FluentUi.Filled.PersonWalking: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonWalking",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 6.5f)
            curveTo(14.243f, 6.5f, 15.25f, 5.493f, 15.25f, 4.25f)
            curveTo(15.25f, 3.007f, 14.243f, 2f, 13f, 2f)
            curveTo(11.757f, 2f, 10.75f, 3.007f, 10.75f, 4.25f)
            curveTo(10.75f, 5.493f, 11.757f, 6.5f, 13f, 6.5f)
            close()
            moveTo(10.361f, 6.419f)
            curveTo(10.546f, 6.464f, 10.711f, 6.565f, 10.854f, 6.691f)
            curveTo(11.427f, 7.195f, 12.178f, 7.5f, 13f, 7.5f)
            curveTo(13.261f, 7.5f, 13.515f, 7.469f, 13.758f, 7.411f)
            curveTo(13.943f, 7.367f, 14.137f, 7.355f, 14.322f, 7.401f)
            lineTo(14.454f, 7.434f)
            curveTo(14.837f, 7.528f, 15.167f, 7.77f, 15.373f, 8.107f)
            lineTo(16.705f, 10.284f)
            curveTo(16.85f, 10.522f, 17.088f, 10.689f, 17.362f, 10.743f)
            lineTo(18.793f, 11.029f)
            curveTo(19.605f, 11.191f, 20.132f, 11.981f, 19.97f, 12.794f)
            curveTo(19.808f, 13.606f, 19.018f, 14.133f, 18.205f, 13.971f)
            lineTo(15.702f, 13.471f)
            curveTo(15.292f, 13.389f, 14.934f, 13.139f, 14.716f, 12.783f)
            lineTo(14.533f, 12.484f)
            curveTo(14.299f, 12.1f, 13.726f, 12.154f, 13.567f, 12.574f)
            curveTo(13.391f, 13.036f, 13.454f, 13.556f, 13.736f, 13.962f)
            lineTo(14.731f, 15.395f)
            curveTo(14.888f, 15.621f, 14.98f, 15.887f, 14.996f, 16.162f)
            lineTo(15.246f, 20.412f)
            curveTo(15.295f, 21.239f, 14.664f, 21.949f, 13.837f, 21.997f)
            curveTo(13.01f, 22.046f, 12.3f, 21.415f, 12.251f, 20.588f)
            lineTo(12.052f, 17.197f)
            curveTo(12.038f, 16.974f, 11.951f, 16.762f, 11.804f, 16.595f)
            lineTo(10.953f, 15.627f)
            curveTo(10.786f, 15.437f, 10.545f, 15.328f, 10.292f, 15.328f)
            curveTo(9.933f, 15.328f, 9.61f, 15.546f, 9.476f, 15.879f)
            lineTo(7.389f, 21.06f)
            curveTo(7.079f, 21.829f, 6.206f, 22.201f, 5.437f, 21.891f)
            curveTo(4.669f, 21.582f, 4.297f, 20.708f, 4.606f, 19.94f)
            lineTo(7.682f, 12.305f)
            curveTo(7.696f, 12.251f, 7.713f, 12.197f, 7.734f, 12.144f)
            lineTo(8.299f, 10.672f)
            curveTo(8.394f, 10.425f, 8.265f, 10.148f, 8.014f, 10.061f)
            curveTo(7.785f, 9.982f, 7.533f, 10.091f, 7.434f, 10.311f)
            lineTo(6.166f, 13.117f)
            curveTo(5.825f, 13.872f, 4.938f, 14.208f, 4.183f, 13.868f)
            curveTo(3.428f, 13.527f, 3.092f, 12.64f, 3.431f, 11.885f)
            lineTo(5.055f, 8.274f)
            curveTo(5.219f, 7.908f, 5.524f, 7.623f, 5.901f, 7.483f)
            lineTo(8.976f, 6.343f)
            curveTo(9.259f, 6.239f, 9.566f, 6.222f, 9.859f, 6.294f)
            lineTo(10.361f, 6.419f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonWalkingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonWalking, contentDescription = null)
    }
}
