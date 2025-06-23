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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.HandWave: ImageVector
    get() {
        if (_HandWave != null) {
            return _HandWave!!
        }
        _HandWave = ImageVector.Builder(
            name = "Filled.HandWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.941f, 2.661f)
                curveTo(7.753f, 2.141f, 7.18f, 1.872f, 6.661f, 2.06f)
                curveTo(6.141f, 2.247f, 5.872f, 2.82f, 6.06f, 3.34f)
                lineTo(8.311f, 9.573f)
                curveTo(8.452f, 9.964f, 8.213f, 10.388f, 7.806f, 10.471f)
                curveTo(7.482f, 10.536f, 7.157f, 10.359f, 7.037f, 10.051f)
                lineTo(4.932f, 4.638f)
                curveTo(4.732f, 4.123f, 4.153f, 3.868f, 3.638f, 4.068f)
                curveTo(3.123f, 4.268f, 2.868f, 4.848f, 3.068f, 5.363f)
                lineTo(6.227f, 13.485f)
                curveTo(4.525f, 13.301f, 3.31f, 13.734f, 2.578f, 14.153f)
                curveTo(2.15f, 14.398f, 1.95f, 14.848f, 2.012f, 15.289f)
                curveTo(2.071f, 15.705f, 2.351f, 16.056f, 2.739f, 16.226f)
                curveTo(4.075f, 16.811f, 7.125f, 18.314f, 9.737f, 20.806f)
                curveTo(10.763f, 21.784f, 12.259f, 22.277f, 13.7f, 21.846f)
                lineTo(16.499f, 21.008f)
                curveTo(17.33f, 20.759f, 18.023f, 20.122f, 18.274f, 19.246f)
                curveTo(18.574f, 18.199f, 19f, 16.425f, 19f, 14.75f)
                curveTo(19f, 13.6f, 18.597f, 12.165f, 18.229f, 11.08f)
                curveTo(17.502f, 8.935f, 16.688f, 6.815f, 15.945f, 4.673f)
                curveTo(15.764f, 4.151f, 15.194f, 3.875f, 14.673f, 4.055f)
                curveTo(14.151f, 4.236f, 13.875f, 4.806f, 14.056f, 5.328f)
                lineTo(15.049f, 8.192f)
                curveTo(15.188f, 8.593f, 14.941f, 9.025f, 14.525f, 9.109f)
                curveTo(14.184f, 9.179f, 13.843f, 8.986f, 13.726f, 8.658f)
                lineTo(11.942f, 3.664f)
                curveTo(11.756f, 3.144f, 11.184f, 2.873f, 10.664f, 3.059f)
                curveTo(10.144f, 3.244f, 9.873f, 3.816f, 10.059f, 4.337f)
                lineTo(11.677f, 8.867f)
                curveTo(11.821f, 9.27f, 11.574f, 9.707f, 11.154f, 9.792f)
                curveTo(10.813f, 9.862f, 10.472f, 9.67f, 10.354f, 9.342f)
                lineTo(7.941f, 2.661f)
                close()
                moveTo(18.634f, 2.323f)
                curveTo(18.87f, 1.982f, 19.337f, 1.898f, 19.678f, 2.134f)
                curveTo(20.486f, 2.695f, 21.156f, 3.678f, 21.576f, 4.761f)
                curveTo(22f, 5.855f, 22.205f, 7.145f, 21.989f, 8.38f)
                curveTo(21.917f, 8.788f, 21.529f, 9.061f, 21.121f, 8.989f)
                curveTo(20.713f, 8.918f, 20.44f, 8.529f, 20.511f, 8.121f)
                curveTo(20.671f, 7.208f, 20.524f, 6.197f, 20.177f, 5.303f)
                curveTo(19.826f, 4.397f, 19.308f, 3.704f, 18.822f, 3.366f)
                curveTo(18.482f, 3.13f, 18.398f, 2.663f, 18.634f, 2.323f)
                close()
                moveTo(18.299f, 4.239f)
                curveTo(18.016f, 3.936f, 17.542f, 3.919f, 17.239f, 4.202f)
                curveTo(16.936f, 4.484f, 16.919f, 4.959f, 17.201f, 5.262f)
                curveTo(17.619f, 5.71f, 18f, 6.251f, 18f, 7.25f)
                curveTo(18f, 7.664f, 18.336f, 8f, 18.75f, 8f)
                curveTo(19.164f, 8f, 19.5f, 7.664f, 19.5f, 7.25f)
                curveTo(19.5f, 5.749f, 18.877f, 4.86f, 18.299f, 4.239f)
                close()
            }
        }.build()

        return _HandWave!!
    }

@Suppress("ObjectPropertyName")
private var _HandWave: ImageVector? = null

@Preview
@Composable
private fun HandWavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandWave, contentDescription = null)
    }
}
