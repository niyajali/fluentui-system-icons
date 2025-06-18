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

public val FluentIcons.Regular.HapticStrong: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HapticStrong",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.251f, 21f)
            curveTo(10.2f, 21f, 10.148f, 20.995f, 10.097f, 20.984f)
            curveTo(9.576f, 20.875f, 5f, 19.834f, 5f, 16.87f)
            curveTo(5f, 15.203f, 6.465f, 14.41f, 7.643f, 13.771f)
            curveTo(8.798f, 13.145f, 9.5f, 12.712f, 9.5f, 11.991f)
            curveTo(9.5f, 11.27f, 8.799f, 10.84f, 7.643f, 10.215f)
            curveTo(6.466f, 9.577f, 5f, 8.784f, 5f, 7.12f)
            curveTo(5f, 4.16f, 9.575f, 3.124f, 10.098f, 3.016f)
            curveTo(10.497f, 2.932f, 10.9f, 3.192f, 10.984f, 3.597f)
            curveTo(11.069f, 4.002f, 10.809f, 4.4f, 10.404f, 4.485f)
            curveTo(9.391f, 4.697f, 6.501f, 5.637f, 6.501f, 7.121f)
            curveTo(6.501f, 7.84f, 7.202f, 8.271f, 8.357f, 8.897f)
            curveTo(9.535f, 9.535f, 11.001f, 10.328f, 11.001f, 11.993f)
            curveTo(11.001f, 13.658f, 9.536f, 14.453f, 8.358f, 15.092f)
            curveTo(7.203f, 15.718f, 6.501f, 16.151f, 6.501f, 16.872f)
            curveTo(6.501f, 18.366f, 9.392f, 19.306f, 10.404f, 19.517f)
            curveTo(10.809f, 19.602f, 11.069f, 19.999f, 10.985f, 20.405f)
            curveTo(10.911f, 20.759f, 10.599f, 21.002f, 10.252f, 21.002f)
            lineTo(10.251f, 21f)
            close()
            moveTo(18.984f, 20.403f)
            curveTo(19.068f, 19.997f, 18.808f, 19.6f, 18.403f, 19.515f)
            curveTo(17.39f, 19.304f, 14.5f, 18.364f, 14.5f, 16.87f)
            curveTo(14.5f, 16.149f, 15.202f, 15.716f, 16.357f, 15.09f)
            curveTo(17.535f, 14.452f, 19f, 13.658f, 19f, 11.991f)
            curveTo(19f, 10.324f, 17.534f, 9.533f, 16.356f, 8.895f)
            curveTo(15.201f, 8.27f, 14.5f, 7.838f, 14.5f, 7.119f)
            curveTo(14.5f, 5.636f, 17.391f, 4.696f, 18.403f, 4.483f)
            curveTo(18.808f, 4.398f, 19.068f, 4.001f, 18.983f, 3.595f)
            curveTo(18.899f, 3.19f, 18.496f, 2.93f, 18.097f, 3.014f)
            curveTo(17.575f, 3.122f, 12.999f, 4.159f, 12.999f, 7.118f)
            curveTo(12.999f, 8.783f, 14.465f, 9.576f, 15.642f, 10.213f)
            curveTo(16.798f, 10.838f, 17.499f, 11.27f, 17.499f, 11.989f)
            curveTo(17.499f, 12.708f, 16.797f, 13.143f, 15.642f, 13.769f)
            curveTo(14.464f, 14.407f, 12.999f, 15.201f, 12.999f, 16.868f)
            curveTo(12.999f, 19.832f, 17.574f, 20.873f, 18.096f, 20.982f)
            curveTo(18.148f, 20.993f, 18.2f, 20.998f, 18.25f, 20.998f)
            curveTo(18.598f, 20.998f, 18.909f, 20.755f, 18.983f, 20.401f)
            lineTo(18.984f, 20.403f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HapticStrongPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HapticStrong, contentDescription = null)
    }
}
