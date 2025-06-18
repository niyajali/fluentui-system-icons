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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.HandDraw: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HandDraw",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.405f, 2.598f)
            curveTo(19.721f, 2.851f, 20f, 3.234f, 20f, 3.75f)
            curveTo(20f, 4.534f, 19.501f, 5.046f, 18.932f, 5.344f)
            curveTo(18.387f, 5.629f, 17.674f, 5.786f, 16.922f, 5.881f)
            curveTo(15.471f, 6.065f, 13.577f, 6.049f, 11.737f, 6.034f)
            lineTo(11.494f, 6.032f)
            curveTo(9.538f, 6.016f, 7.665f, 6.011f, 6.282f, 6.215f)
            curveTo(5.584f, 6.318f, 5.092f, 6.465f, 4.792f, 6.638f)
            curveTo(4.524f, 6.794f, 4.5f, 6.908f, 4.5f, 6.999f)
            lineTo(4.501f, 7.001f)
            curveTo(4.506f, 7.01f, 4.524f, 7.039f, 4.576f, 7.084f)
            curveTo(4.687f, 7.181f, 4.89f, 7.297f, 5.212f, 7.411f)
            curveTo(5.85f, 7.637f, 6.746f, 7.787f, 7.698f, 7.879f)
            curveTo(7.798f, 7.889f, 7.899f, 7.898f, 8f, 7.906f)
            verticalLineTo(9.411f)
            curveTo(7.852f, 9.4f, 7.703f, 9.387f, 7.553f, 9.372f)
            curveTo(6.567f, 9.277f, 5.525f, 9.114f, 4.71f, 8.825f)
            curveTo(4.305f, 8.681f, 3.903f, 8.488f, 3.59f, 8.216f)
            curveTo(3.265f, 7.932f, 3f, 7.526f, 3f, 7.001f)
            curveTo(3f, 6.217f, 3.462f, 5.675f, 4.04f, 5.34f)
            curveTo(4.588f, 5.023f, 5.306f, 4.843f, 6.062f, 4.731f)
            curveTo(7.585f, 4.506f, 9.587f, 4.516f, 11.506f, 4.532f)
            lineTo(11.688f, 4.533f)
            curveTo(13.582f, 4.549f, 15.386f, 4.563f, 16.734f, 4.393f)
            curveTo(17.436f, 4.304f, 17.933f, 4.174f, 18.236f, 4.015f)
            curveTo(18.43f, 3.913f, 18.482f, 3.839f, 18.495f, 3.793f)
            curveTo(18.488f, 3.786f, 18.479f, 3.778f, 18.468f, 3.769f)
            curveTo(18.37f, 3.691f, 18.181f, 3.591f, 17.87f, 3.493f)
            curveTo(17.255f, 3.297f, 16.379f, 3.169f, 15.409f, 3.092f)
            curveTo(13.815f, 2.966f, 12.122f, 2.986f, 11.212f, 2.997f)
            curveTo(11.021f, 2.999f, 10.864f, 3.001f, 10.75f, 3.001f)
            curveTo(10.336f, 3.001f, 10f, 2.665f, 10f, 2.251f)
            curveTo(10f, 1.836f, 10.336f, 1.501f, 10.75f, 1.501f)
            curveTo(10.849f, 1.501f, 10.991f, 1.499f, 11.168f, 1.497f)
            curveTo(12.062f, 1.486f, 13.853f, 1.464f, 15.528f, 1.597f)
            curveTo(16.527f, 1.676f, 17.542f, 1.814f, 18.325f, 2.063f)
            curveTo(18.713f, 2.187f, 19.101f, 2.355f, 19.405f, 2.598f)
            close()
            moveTo(13.995f, 9.329f)
            curveTo(13.928f, 7.97f, 13.098f, 7.001f, 11.749f, 7.001f)
            curveTo(10.342f, 7.001f, 9.499f, 8.056f, 9.499f, 9.509f)
            verticalLineTo(13.677f)
            lineTo(9.24f, 13.597f)
            curveTo(8.049f, 13.25f, 7.116f, 13.23f, 6.414f, 13.581f)
            curveTo(5.461f, 14.057f, 4.97f, 14.913f, 4.995f, 16.021f)
            curveTo(5.001f, 16.3f, 5.161f, 16.552f, 5.411f, 16.676f)
            lineTo(7.774f, 17.852f)
            lineTo(7.871f, 17.904f)
            lineTo(7.965f, 17.962f)
            lineTo(9.849f, 19.218f)
            lineTo(10.042f, 19.357f)
            curveTo(10.481f, 19.695f, 10.834f, 20.135f, 11.068f, 20.64f)
            lineTo(11.098f, 20.702f)
            lineTo(11.177f, 20.857f)
            curveTo(11.629f, 21.661f, 12.533f, 22.113f, 13.457f, 21.981f)
            lineTo(15.875f, 21.634f)
            lineTo(16.041f, 21.604f)
            curveTo(16.857f, 21.424f, 17.512f, 20.803f, 17.73f, 19.987f)
            lineTo(18.778f, 16.064f)
            lineTo(18.82f, 15.885f)
            curveTo(19.169f, 14.209f, 18.151f, 12.533f, 16.477f, 12.085f)
            curveTo(16.392f, 12.063f, 16.305f, 12.043f, 16.219f, 12.028f)
            lineTo(13.999f, 11.625f)
            verticalLineTo(9.509f)
            lineTo(13.995f, 9.329f)
            close()
            moveTo(11.003f, 9.367f)
            curveTo(11.037f, 8.775f, 11.289f, 8.501f, 11.749f, 8.501f)
            curveTo(12.245f, 8.501f, 12.499f, 8.819f, 12.499f, 9.509f)
            verticalLineTo(12.251f)
            lineTo(12.507f, 12.358f)
            curveTo(12.552f, 12.673f, 12.794f, 12.93f, 13.115f, 12.988f)
            lineTo(16.02f, 13.517f)
            lineTo(16.09f, 13.535f)
            curveTo(17.023f, 13.784f, 17.578f, 14.743f, 17.329f, 15.677f)
            lineTo(16.281f, 19.6f)
            lineTo(16.244f, 19.705f)
            curveTo(16.141f, 19.941f, 15.923f, 20.111f, 15.662f, 20.149f)
            lineTo(13.244f, 20.496f)
            lineTo(13.136f, 20.503f)
            curveTo(12.848f, 20.503f, 12.582f, 20.336f, 12.458f, 20.07f)
            lineTo(12.429f, 20.007f)
            lineTo(12.307f, 19.763f)
            curveTo(11.922f, 19.042f, 11.363f, 18.425f, 10.681f, 17.97f)
            lineTo(8.797f, 16.714f)
            lineTo(8.623f, 16.606f)
            lineTo(8.442f, 16.509f)
            lineTo(6.537f, 15.561f)
            lineTo(6.575f, 15.441f)
            curveTo(6.665f, 15.213f, 6.831f, 15.049f, 7.085f, 14.922f)
            curveTo(7.522f, 14.704f, 8.503f, 14.844f, 9.964f, 15.446f)
            curveTo(10.457f, 15.65f, 10.999f, 15.287f, 10.999f, 14.753f)
            verticalLineTo(9.509f)
            lineTo(11.003f, 9.367f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HandDrawPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HandDraw, contentDescription = null)
    }
}
