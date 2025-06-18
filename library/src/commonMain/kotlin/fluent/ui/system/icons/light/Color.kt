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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Color: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Color",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.5f, 8f)
            curveTo(16.328f, 8f, 17f, 7.328f, 17f, 6.5f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            curveTo(14.672f, 5f, 14f, 5.672f, 14f, 6.5f)
            curveTo(14f, 7.328f, 14.672f, 8f, 15.5f, 8f)
            close()
            moveTo(23f, 8.5f)
            curveTo(23f, 9.328f, 22.328f, 10f, 21.5f, 10f)
            curveTo(20.672f, 10f, 20f, 9.328f, 20f, 8.5f)
            curveTo(20f, 7.672f, 20.672f, 7f, 21.5f, 7f)
            curveTo(22.328f, 7f, 23f, 7.672f, 23f, 8.5f)
            close()
            moveTo(24.5f, 15f)
            curveTo(25.328f, 15f, 26f, 14.328f, 26f, 13.5f)
            curveTo(26f, 12.672f, 25.328f, 12f, 24.5f, 12f)
            curveTo(23.672f, 12f, 23f, 12.672f, 23f, 13.5f)
            curveTo(23f, 14.328f, 23.672f, 15f, 24.5f, 15f)
            close()
            moveTo(26f, 19.5f)
            curveTo(26f, 20.328f, 25.328f, 21f, 24.5f, 21f)
            curveTo(23.672f, 21f, 23f, 20.328f, 23f, 19.5f)
            curveTo(23f, 18.672f, 23.672f, 18f, 24.5f, 18f)
            curveTo(25.328f, 18f, 26f, 18.672f, 26f, 19.5f)
            close()
            moveTo(20.5f, 25f)
            curveTo(21.328f, 25f, 22f, 24.328f, 22f, 23.5f)
            curveTo(22f, 22.672f, 21.328f, 22f, 20.5f, 22f)
            curveTo(19.672f, 22f, 19f, 22.672f, 19f, 23.5f)
            curveTo(19f, 24.328f, 19.672f, 25f, 20.5f, 25f)
            close()
            moveTo(15.809f, 2.001f)
            curveTo(11.49f, 2.001f, 7.59f, 4.213f, 5.066f, 7.053f)
            curveTo(2.566f, 9.866f, 1.285f, 13.46f, 2.546f, 16.234f)
            curveTo(2.883f, 16.974f, 3.285f, 17.522f, 3.758f, 17.9f)
            curveTo(4.236f, 18.282f, 4.761f, 18.47f, 5.303f, 18.521f)
            curveTo(6.351f, 18.621f, 7.463f, 18.206f, 8.45f, 17.806f)
            curveTo(8.585f, 17.751f, 8.718f, 17.696f, 8.849f, 17.642f)
            curveTo(9.729f, 17.28f, 10.516f, 16.956f, 11.23f, 16.876f)
            curveTo(11.623f, 16.832f, 11.959f, 16.869f, 12.251f, 16.998f)
            curveTo(12.54f, 17.126f, 12.829f, 17.364f, 13.098f, 17.795f)
            curveTo(13.511f, 18.455f, 13.761f, 19.357f, 13.972f, 20.42f)
            curveTo(14.048f, 20.803f, 14.12f, 21.212f, 14.194f, 21.633f)
            curveTo(14.317f, 22.338f, 14.446f, 23.074f, 14.609f, 23.764f)
            curveTo(14.874f, 24.887f, 15.251f, 26.004f, 15.915f, 26.918f)
            curveTo(16.591f, 27.847f, 17.549f, 28.547f, 18.926f, 28.848f)
            curveTo(21.657f, 29.446f, 24.458f, 28.201f, 26.542f, 25.895f)
            curveTo(28.632f, 23.583f, 30.053f, 20.159f, 30.053f, 16.245f)
            curveTo(30.053f, 8.378f, 23.675f, 2.001f, 15.809f, 2.001f)
            close()
            moveTo(3.457f, 15.82f)
            curveTo(2.44f, 13.585f, 3.415f, 10.416f, 5.813f, 7.718f)
            curveTo(8.187f, 5.047f, 11.829f, 3.001f, 15.809f, 3.001f)
            curveTo(23.123f, 3.001f, 29.053f, 8.931f, 29.053f, 16.245f)
            curveTo(29.053f, 19.921f, 27.718f, 23.103f, 25.801f, 25.225f)
            curveTo(23.877f, 27.352f, 21.418f, 28.37f, 19.14f, 27.872f)
            curveTo(18.011f, 27.625f, 17.261f, 27.069f, 16.724f, 26.33f)
            curveTo(16.176f, 25.575f, 15.837f, 24.611f, 15.583f, 23.534f)
            curveTo(15.424f, 22.863f, 15.307f, 22.191f, 15.189f, 21.514f)
            curveTo(15.114f, 21.087f, 15.039f, 20.657f, 14.953f, 20.225f)
            curveTo(14.74f, 19.151f, 14.463f, 18.092f, 13.946f, 17.265f)
            curveTo(13.59f, 16.695f, 13.158f, 16.306f, 12.656f, 16.084f)
            curveTo(12.158f, 15.863f, 11.633f, 15.825f, 11.118f, 15.883f)
            curveTo(10.252f, 15.98f, 9.317f, 16.366f, 8.456f, 16.722f)
            curveTo(8.327f, 16.775f, 8.199f, 16.828f, 8.074f, 16.879f)
            curveTo(7.057f, 17.292f, 6.166f, 17.598f, 5.397f, 17.526f)
            curveTo(5.032f, 17.491f, 4.695f, 17.369f, 4.382f, 17.119f)
            curveTo(4.064f, 16.865f, 3.747f, 16.459f, 3.457f, 15.82f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Color, contentDescription = null)
    }
}
