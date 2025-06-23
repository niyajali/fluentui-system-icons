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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.Sparkle: ImageVector
    get() {
        if (_Sparkle != null) {
            return _Sparkle!!
        }
        _Sparkle = ImageVector.Builder(
            name = "Regular.Sparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.665f, 15.734f)
                curveTo(8.91f, 15.908f, 9.202f, 16f, 9.501f, 15.999f)
                verticalLineTo(15.995f)
                curveTo(9.784f, 15.995f, 10.06f, 15.913f, 10.296f, 15.758f)
                curveTo(10.532f, 15.603f, 10.717f, 15.382f, 10.828f, 15.123f)
                lineTo(11.441f, 13.259f)
                curveTo(11.583f, 12.837f, 11.821f, 12.453f, 12.136f, 12.139f)
                curveTo(12.451f, 11.824f, 12.836f, 11.587f, 13.258f, 11.447f)
                lineTo(15.036f, 10.869f)
                curveTo(15.323f, 10.768f, 15.57f, 10.58f, 15.743f, 10.33f)
                curveTo(15.916f, 10.081f, 16.007f, 9.784f, 16.001f, 9.48f)
                curveTo(15.995f, 9.177f, 15.894f, 8.883f, 15.711f, 8.64f)
                curveTo(15.529f, 8.397f, 15.274f, 8.219f, 14.984f, 8.129f)
                lineTo(13.229f, 7.559f)
                curveTo(12.805f, 7.418f, 12.419f, 7.179f, 12.103f, 6.863f)
                curveTo(11.786f, 6.546f, 11.548f, 6.161f, 11.407f, 5.736f)
                lineTo(10.829f, 3.959f)
                curveTo(10.729f, 3.676f, 10.542f, 3.431f, 10.296f, 3.259f)
                curveTo(10.05f, 3.087f, 9.756f, 2.996f, 9.455f, 2.998f)
                curveTo(9.155f, 3.001f, 8.863f, 3.096f, 8.619f, 3.273f)
                curveTo(8.376f, 3.449f, 8.194f, 3.696f, 8.097f, 3.981f)
                lineTo(7.514f, 5.773f)
                curveTo(7.374f, 6.185f, 7.141f, 6.56f, 6.835f, 6.87f)
                curveTo(6.528f, 7.179f, 6.155f, 7.415f, 5.744f, 7.559f)
                lineTo(3.967f, 8.13f)
                curveTo(3.756f, 8.204f, 3.565f, 8.326f, 3.409f, 8.486f)
                curveTo(3.252f, 8.647f, 3.136f, 8.842f, 3.068f, 9.055f)
                curveTo(3f, 9.269f, 2.983f, 9.495f, 3.017f, 9.716f)
                curveTo(3.052f, 9.937f, 3.138f, 10.147f, 3.267f, 10.33f)
                curveTo(3.444f, 10.579f, 3.695f, 10.766f, 3.984f, 10.864f)
                lineTo(5.738f, 11.433f)
                curveTo(6.164f, 11.575f, 6.55f, 11.815f, 6.867f, 12.133f)
                curveTo(6.952f, 12.217f, 7.032f, 12.307f, 7.105f, 12.402f)
                curveTo(7.304f, 12.66f, 7.458f, 12.95f, 7.56f, 13.259f)
                lineTo(8.138f, 15.034f)
                curveTo(8.237f, 15.317f, 8.421f, 15.561f, 8.665f, 15.734f)
                close()
                moveTo(8.291f, 11.485f)
                curveTo(8.18f, 11.339f, 8.059f, 11.201f, 7.928f, 11.072f)
                horizontalLineTo(7.931f)
                curveTo(7.448f, 10.589f, 6.859f, 10.225f, 6.211f, 10.009f)
                lineTo(4.611f, 9.501f)
                lineTo(6.222f, 8.977f)
                curveTo(6.86f, 8.756f, 7.438f, 8.392f, 7.912f, 7.912f)
                curveTo(8.384f, 7.429f, 8.74f, 6.845f, 8.953f, 6.204f)
                lineTo(9.468f, 4.622f)
                lineTo(9.984f, 6.209f)
                curveTo(10.2f, 6.856f, 10.563f, 7.444f, 11.046f, 7.925f)
                curveTo(11.529f, 8.406f, 12.118f, 8.768f, 12.765f, 8.982f)
                lineTo(14.384f, 9.504f)
                lineTo(12.795f, 10.019f)
                curveTo(12.149f, 10.234f, 11.562f, 10.597f, 11.08f, 11.078f)
                curveTo(10.598f, 11.56f, 10.236f, 12.147f, 10.021f, 12.794f)
                lineTo(9.506f, 14.376f)
                lineTo(8.991f, 12.791f)
                curveTo(8.834f, 12.319f, 8.597f, 11.877f, 8.291f, 11.485f)
                close()
                moveTo(16.332f, 20.782f)
                curveTo(16.142f, 20.646f, 15.998f, 20.454f, 15.922f, 20.233f)
                lineTo(15.594f, 19.226f)
                curveTo(15.53f, 19.034f, 15.423f, 18.86f, 15.281f, 18.717f)
                curveTo(15.139f, 18.574f, 14.965f, 18.466f, 14.773f, 18.403f)
                lineTo(13.782f, 18.08f)
                curveTo(13.552f, 18.003f, 13.352f, 17.854f, 13.211f, 17.656f)
                curveTo(13.074f, 17.464f, 13f, 17.233f, 13.001f, 16.997f)
                curveTo(13.001f, 16.759f, 13.076f, 16.527f, 13.214f, 16.334f)
                curveTo(13.351f, 16.139f, 13.547f, 15.993f, 13.772f, 15.917f)
                lineTo(14.778f, 15.591f)
                curveTo(14.965f, 15.524f, 15.134f, 15.416f, 15.273f, 15.274f)
                curveTo(15.412f, 15.132f, 15.516f, 14.96f, 15.578f, 14.772f)
                lineTo(15.902f, 13.78f)
                curveTo(15.978f, 13.556f, 16.122f, 13.361f, 16.314f, 13.222f)
                curveTo(16.506f, 13.083f, 16.736f, 13.007f, 16.973f, 13.005f)
                curveTo(17.21f, 13.002f, 17.442f, 13.074f, 17.636f, 13.209f)
                curveTo(17.831f, 13.344f, 17.978f, 13.536f, 18.059f, 13.759f)
                lineTo(18.388f, 14.773f)
                curveTo(18.452f, 14.963f, 18.56f, 15.136f, 18.702f, 15.277f)
                curveTo(18.844f, 15.419f, 19.018f, 15.525f, 19.208f, 15.589f)
                lineTo(20.2f, 15.912f)
                curveTo(20.429f, 15.983f, 20.629f, 16.125f, 20.773f, 16.317f)
                curveTo(20.916f, 16.509f, 20.996f, 16.741f, 21f, 16.98f)
                curveTo(21.004f, 17.22f, 20.933f, 17.455f, 20.797f, 17.652f)
                curveTo(20.66f, 17.848f, 20.465f, 17.997f, 20.239f, 18.077f)
                lineTo(19.225f, 18.406f)
                curveTo(19.035f, 18.471f, 18.862f, 18.578f, 18.72f, 18.72f)
                curveTo(18.578f, 18.863f, 18.471f, 19.037f, 18.407f, 19.228f)
                lineTo(18.085f, 20.217f)
                curveTo(18.007f, 20.447f, 17.859f, 20.647f, 17.66f, 20.787f)
                curveTo(17.468f, 20.925f, 17.237f, 20.999f, 17.001f, 20.999f)
                curveTo(16.761f, 20.999f, 16.527f, 20.923f, 16.332f, 20.782f)
                close()
                moveTo(15.301f, 16.999f)
                curveTo(15.694f, 17.139f, 16.051f, 17.365f, 16.345f, 17.66f)
                curveTo(16.639f, 17.956f, 16.864f, 18.314f, 17.001f, 18.708f)
                curveTo(17.14f, 18.316f, 17.365f, 17.96f, 17.659f, 17.666f)
                curveTo(17.953f, 17.372f, 18.309f, 17.147f, 18.701f, 17.008f)
                curveTo(18.303f, 16.868f, 17.941f, 16.641f, 17.642f, 16.343f)
                curveTo(17.347f, 16.049f, 17.122f, 15.693f, 16.983f, 15.3f)
                curveTo(16.845f, 15.69f, 16.622f, 16.044f, 16.331f, 16.338f)
                curveTo(16.041f, 16.632f, 15.689f, 16.857f, 15.301f, 16.999f)
                close()
            }
        }.build()

        return _Sparkle!!
    }

@Suppress("ObjectPropertyName")
private var _Sparkle: ImageVector? = null

@Preview
@Composable
private fun SparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Sparkle, contentDescription = null)
    }
}
