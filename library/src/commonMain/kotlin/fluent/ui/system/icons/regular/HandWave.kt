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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.HandWave: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HandWave",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.634f, 2.322f)
            curveTo(18.87f, 1.982f, 19.337f, 1.898f, 19.678f, 2.134f)
            curveTo(20.486f, 2.695f, 21.156f, 3.678f, 21.576f, 4.761f)
            curveTo(22f, 5.855f, 22.205f, 7.145f, 21.989f, 8.379f)
            curveTo(21.917f, 8.787f, 21.529f, 9.06f, 21.121f, 8.989f)
            curveTo(20.713f, 8.917f, 20.44f, 8.529f, 20.511f, 8.121f)
            curveTo(20.671f, 7.208f, 20.524f, 6.197f, 20.177f, 5.303f)
            curveTo(19.826f, 4.397f, 19.308f, 3.703f, 18.822f, 3.366f)
            curveTo(18.482f, 3.13f, 18.398f, 2.663f, 18.634f, 2.322f)
            close()
            moveTo(9.588f, 2.873f)
            curveTo(9.109f, 2.192f, 8.245f, 1.852f, 7.401f, 2.07f)
            curveTo(6.49f, 2.306f, 5.888f, 3.116f, 5.867f, 4.003f)
            curveTo(5.731f, 4.002f, 5.594f, 4.015f, 5.456f, 4.043f)
            curveTo(4.269f, 4.28f, 3.558f, 5.503f, 3.938f, 6.652f)
            lineTo(5.898f, 12.573f)
            curveTo(5.219f, 12.529f, 4.625f, 12.608f, 4.11f, 12.773f)
            curveTo(3.292f, 13.035f, 2.723f, 13.496f, 2.346f, 13.927f)
            curveTo(1.972f, 14.354f, 1.914f, 14.891f, 2.075f, 15.347f)
            curveTo(2.228f, 15.78f, 2.569f, 16.127f, 2.986f, 16.316f)
            curveTo(4.401f, 16.959f, 7.26f, 18.435f, 9.738f, 20.804f)
            curveTo(10.763f, 21.784f, 12.259f, 22.277f, 13.7f, 21.846f)
            lineTo(16.288f, 21.071f)
            curveTo(17.278f, 20.775f, 18.037f, 19.941f, 18.181f, 18.888f)
            curveTo(18.324f, 17.837f, 18.501f, 16.247f, 18.501f, 14.75f)
            curveTo(18.501f, 12.986f, 18.044f, 11.042f, 17.5f, 9.34f)
            curveTo(16.952f, 7.628f, 16.3f, 6.111f, 15.875f, 5.189f)
            curveTo(15.468f, 4.307f, 14.516f, 3.863f, 13.598f, 4.047f)
            curveTo(13.309f, 4.105f, 13.047f, 4.218f, 12.82f, 4.373f)
            lineTo(12.665f, 3.887f)
            curveTo(12.355f, 2.917f, 11.365f, 2.335f, 10.367f, 2.534f)
            curveTo(10.075f, 2.593f, 9.813f, 2.711f, 9.588f, 2.873f)
            close()
            moveTo(8.432f, 3.874f)
            lineTo(8.836f, 5.049f)
            curveTo(8.846f, 5.082f, 8.857f, 5.115f, 8.868f, 5.149f)
            lineTo(10.541f, 9.995f)
            curveTo(10.676f, 10.386f, 11.103f, 10.594f, 11.494f, 10.459f)
            curveTo(11.573f, 10.432f, 11.645f, 10.393f, 11.707f, 10.344f)
            lineTo(11.723f, 10.332f)
            curveTo(11.961f, 10.139f, 12.064f, 9.811f, 11.959f, 9.505f)
            lineTo(10.272f, 4.609f)
            curveTo(10.208f, 4.338f, 10.381f, 4.061f, 10.661f, 4.005f)
            curveTo(10.911f, 3.955f, 11.158f, 4.101f, 11.236f, 4.344f)
            lineTo(11.96f, 6.611f)
            curveTo(11.972f, 6.661f, 11.986f, 6.712f, 12.002f, 6.762f)
            lineTo(12.872f, 9.465f)
            lineTo(13.035f, 9.978f)
            curveTo(13.136f, 10.295f, 13.428f, 10.497f, 13.743f, 10.5f)
            curveTo(13.821f, 10.501f, 13.901f, 10.49f, 13.98f, 10.464f)
            curveTo(14.375f, 10.337f, 14.592f, 9.915f, 14.465f, 9.521f)
            lineTo(14.3f, 9.008f)
            lineTo(13.41f, 6.222f)
            curveTo(13.353f, 5.901f, 13.562f, 5.584f, 13.892f, 5.518f)
            curveTo(14.163f, 5.463f, 14.411f, 5.596f, 14.512f, 5.817f)
            curveTo(14.922f, 6.706f, 15.549f, 8.163f, 16.071f, 9.796f)
            curveTo(16.597f, 11.44f, 17.001f, 13.213f, 17.001f, 14.75f)
            curveTo(17.001f, 16.146f, 16.835f, 17.659f, 16.694f, 18.685f)
            curveTo(16.634f, 19.126f, 16.313f, 19.498f, 15.858f, 19.634f)
            lineTo(13.271f, 20.408f)
            curveTo(12.426f, 20.661f, 11.474f, 20.388f, 10.774f, 19.72f)
            curveTo(8.124f, 17.185f, 5.094f, 15.626f, 3.606f, 14.951f)
            curveTo(3.569f, 14.934f, 3.54f, 14.912f, 3.519f, 14.89f)
            curveTo(3.515f, 14.886f, 3.511f, 14.881f, 3.508f, 14.877f)
            curveTo(3.74f, 14.623f, 4.08f, 14.358f, 4.567f, 14.202f)
            curveTo(5.076f, 14.038f, 5.8f, 13.978f, 6.811f, 14.24f)
            curveTo(7.077f, 14.309f, 7.359f, 14.227f, 7.546f, 14.026f)
            curveTo(7.734f, 13.826f, 7.797f, 13.539f, 7.711f, 13.278f)
            lineTo(5.362f, 6.181f)
            curveTo(5.265f, 5.887f, 5.447f, 5.574f, 5.75f, 5.514f)
            curveTo(6.006f, 5.463f, 6.259f, 5.61f, 6.341f, 5.857f)
            lineTo(7.779f, 10.203f)
            lineTo(8.037f, 10.988f)
            curveTo(8.167f, 11.382f, 8.591f, 11.596f, 8.984f, 11.467f)
            curveTo(9.251f, 11.379f, 9.436f, 11.155f, 9.486f, 10.898f)
            curveTo(9.511f, 10.774f, 9.505f, 10.642f, 9.463f, 10.514f)
            lineTo(9.204f, 9.733f)
            lineTo(7.394f, 4.223f)
            curveTo(7.296f, 3.923f, 7.471f, 3.601f, 7.777f, 3.522f)
            curveTo(8.054f, 3.451f, 8.339f, 3.604f, 8.432f, 3.874f)
            close()
            moveTo(18.299f, 4.239f)
            curveTo(18.016f, 3.936f, 17.542f, 3.919f, 17.239f, 4.201f)
            curveTo(16.936f, 4.484f, 16.919f, 4.958f, 17.201f, 5.261f)
            curveTo(17.619f, 5.71f, 18f, 6.251f, 18f, 7.25f)
            curveTo(18f, 7.664f, 18.336f, 8f, 18.75f, 8f)
            curveTo(19.164f, 8f, 19.5f, 7.664f, 19.5f, 7.25f)
            curveTo(19.5f, 5.749f, 18.877f, 4.86f, 18.299f, 4.239f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HandWavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HandWave, contentDescription = null)
    }
}
