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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Airplane: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Airplane",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.469f, 9.643f)
            lineTo(8.769f, 3.769f)
            lineTo(8.767f, 3.695f)
            curveTo(8.767f, 2.806f, 9.487f, 2.086f, 10.376f, 2.086f)
            curveTo(11.179f, 2.086f, 11.922f, 2.506f, 12.354f, 3.22f)
            lineTo(12.441f, 3.381f)
            lineTo(15.386f, 9.47f)
            lineTo(19.343f, 9.354f)
            curveTo(20.777f, 9.312f, 21.973f, 10.44f, 22.015f, 11.885f)
            lineTo(22.016f, 11.95f)
            curveTo(22.016f, 13.384f, 20.853f, 14.547f, 19.397f, 14.547f)
            lineTo(15.433f, 14.431f)
            lineTo(12.441f, 20.619f)
            curveTo(12.058f, 21.411f, 11.256f, 21.914f, 10.376f, 21.914f)
            curveTo(9.487f, 21.914f, 8.767f, 21.194f, 8.767f, 20.283f)
            lineTo(8.774f, 20.165f)
            lineTo(9.481f, 14.257f)
            lineTo(7.349f, 14.194f)
            lineTo(7.08f, 14.93f)
            curveTo(6.799f, 15.697f, 6.069f, 16.208f, 5.252f, 16.208f)
            curveTo(4.376f, 16.208f, 3.666f, 15.498f, 3.666f, 14.621f)
            lineTo(3.667f, 13.862f)
            lineTo(3.512f, 13.83f)
            curveTo(2.622f, 13.644f, 1.984f, 12.859f, 1.984f, 11.95f)
            curveTo(1.984f, 11.041f, 2.622f, 10.256f, 3.512f, 10.071f)
            lineTo(3.667f, 10.039f)
            lineTo(3.666f, 9.278f)
            curveTo(3.666f, 8.476f, 4.264f, 7.804f, 5.101f, 7.7f)
            lineTo(5.252f, 7.692f)
            curveTo(5.997f, 7.692f, 6.675f, 8.118f, 7.017f, 8.819f)
            lineTo(7.08f, 8.97f)
            lineTo(7.349f, 9.705f)
            lineTo(9.469f, 9.643f)
            close()
            moveTo(10.376f, 3.586f)
            curveTo(10.316f, 3.586f, 10.267f, 3.635f, 10.267f, 3.673f)
            lineTo(11.153f, 11.095f)
            lineTo(6.313f, 11.236f)
            lineTo(5.685f, 9.521f)
            lineTo(5.653f, 9.442f)
            curveTo(5.578f, 9.29f, 5.423f, 9.192f, 5.299f, 9.191f)
            lineTo(5.241f, 9.193f)
            curveTo(5.199f, 9.198f, 5.166f, 9.235f, 5.166f, 9.278f)
            lineTo(5.167f, 11.259f)
            lineTo(3.818f, 11.54f)
            curveTo(3.623f, 11.58f, 3.484f, 11.752f, 3.484f, 11.95f)
            curveTo(3.484f, 12.149f, 3.624f, 12.321f, 3.818f, 12.361f)
            lineTo(5.167f, 12.642f)
            lineTo(5.166f, 14.622f)
            curveTo(5.166f, 14.669f, 5.205f, 14.708f, 5.252f, 14.708f)
            curveTo(5.44f, 14.708f, 5.607f, 14.591f, 5.671f, 14.415f)
            lineTo(6.311f, 12.663f)
            lineTo(11.165f, 12.805f)
            lineTo(10.268f, 20.276f)
            lineTo(10.267f, 20.305f)
            curveTo(10.267f, 20.365f, 10.316f, 20.414f, 10.376f, 20.414f)
            curveTo(10.68f, 20.414f, 10.958f, 20.24f, 11.09f, 19.966f)
            lineTo(14.505f, 12.903f)
            lineTo(19.419f, 13.047f)
            curveTo(20.025f, 13.047f, 20.516f, 12.556f, 20.516f, 11.961f)
            lineTo(20.515f, 11.918f)
            curveTo(20.498f, 11.312f, 19.992f, 10.836f, 19.387f, 10.854f)
            lineTo(14.458f, 10.998f)
            lineTo(11.107f, 4.066f)
            lineTo(11.054f, 3.967f)
            curveTo(10.911f, 3.731f, 10.654f, 3.586f, 10.376f, 3.586f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AirplanePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Airplane, contentDescription = null)
    }
}
