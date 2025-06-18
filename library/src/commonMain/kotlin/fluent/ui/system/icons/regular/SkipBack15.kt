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

public val FluentUi.Regular.SkipBack15: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SkipBack15",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 3.25f)
            curveTo(2f, 2.836f, 2.336f, 2.5f, 2.75f, 2.5f)
            curveTo(3.164f, 2.5f, 3.5f, 2.836f, 3.5f, 3.25f)
            verticalLineTo(6.649f)
            curveTo(4.653f, 5.262f, 6.15f, 4.087f, 8.028f, 3.505f)
            curveTo(10.407f, 2.769f, 12.932f, 2.831f, 15.261f, 3.697f)
            curveTo(17.577f, 4.559f, 19.765f, 6.307f, 20.907f, 8.39f)
            curveTo(21.107f, 8.753f, 20.974f, 9.209f, 20.611f, 9.408f)
            curveTo(20.247f, 9.607f, 19.791f, 9.474f, 19.592f, 9.111f)
            curveTo(18.648f, 7.388f, 16.767f, 5.858f, 14.738f, 5.103f)
            curveTo(12.723f, 4.354f, 10.538f, 4.299f, 8.472f, 4.938f)
            curveTo(6.77f, 5.465f, 5.401f, 6.602f, 4.343f, 8f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 8f, 9f, 8.336f, 9f, 8.75f)
            curveTo(9f, 9.164f, 8.664f, 9.5f, 8.25f, 9.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9.5f, 2f, 9.164f, 2f, 8.75f)
            verticalLineTo(3.25f)
            close()
            moveTo(9.5f, 11.75f)
            curveTo(9.5f, 11.414f, 9.276f, 11.119f, 8.953f, 11.028f)
            curveTo(8.629f, 10.937f, 8.285f, 11.072f, 8.11f, 11.359f)
            lineTo(8.11f, 11.36f)
            lineTo(8.104f, 11.369f)
            curveTo(8.099f, 11.377f, 8.09f, 11.391f, 8.078f, 11.41f)
            curveTo(8.053f, 11.448f, 8.014f, 11.506f, 7.963f, 11.579f)
            curveTo(7.86f, 11.726f, 7.706f, 11.933f, 7.507f, 12.168f)
            curveTo(7.104f, 12.642f, 6.54f, 13.202f, 5.864f, 13.607f)
            curveTo(5.509f, 13.82f, 5.394f, 14.281f, 5.607f, 14.636f)
            curveTo(5.82f, 14.991f, 6.281f, 15.106f, 6.636f, 14.893f)
            curveTo(7.16f, 14.579f, 7.618f, 14.202f, 8f, 13.833f)
            verticalLineTo(20.25f)
            curveTo(8f, 20.664f, 8.336f, 21f, 8.75f, 21f)
            curveTo(9.164f, 21f, 9.5f, 20.664f, 9.5f, 20.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(17.2f, 12.5f)
            curveTo(17.614f, 12.5f, 17.95f, 12.164f, 17.95f, 11.75f)
            curveTo(17.95f, 11.336f, 17.614f, 11f, 17.2f, 11f)
            horizontalLineTo(13.652f)
            curveTo(13.276f, 11f, 12.958f, 11.278f, 12.909f, 11.651f)
            lineTo(12.509f, 14.651f)
            curveTo(12.48f, 14.865f, 12.545f, 15.081f, 12.688f, 15.244f)
            curveTo(12.83f, 15.407f, 13.036f, 15.5f, 13.252f, 15.5f)
            lineTo(15.411f, 15.5f)
            lineTo(15.42f, 15.5f)
            curveTo(15.521f, 15.499f, 15.624f, 15.505f, 15.728f, 15.519f)
            curveTo(16.822f, 15.673f, 17.584f, 16.685f, 17.43f, 17.778f)
            curveTo(17.277f, 18.872f, 16.265f, 19.634f, 15.171f, 19.481f)
            curveTo(14.502f, 19.386f, 13.956f, 18.972f, 13.668f, 18.41f)
            curveTo(13.48f, 18.042f, 13.028f, 17.896f, 12.659f, 18.085f)
            curveTo(12.29f, 18.274f, 12.145f, 18.726f, 12.334f, 19.094f)
            curveTo(12.835f, 20.072f, 13.789f, 20.801f, 14.963f, 20.966f)
            curveTo(16.877f, 21.235f, 18.647f, 19.901f, 18.916f, 17.987f)
            curveTo(19.185f, 16.073f, 17.851f, 14.303f, 15.937f, 14.034f)
            curveTo(15.759f, 14.009f, 15.582f, 13.998f, 15.406f, 14f)
            lineTo(14.109f, 14f)
            lineTo(14.309f, 12.5f)
            horizontalLineTo(17.2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SkipBack15Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SkipBack15, contentDescription = null)
    }
}
