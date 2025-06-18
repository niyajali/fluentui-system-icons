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

public val FluentIcons.Regular.SkipForward30: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SkipForward30",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 2.5f)
            curveTo(21.664f, 2.5f, 22f, 2.836f, 22f, 3.25f)
            verticalLineTo(8.75f)
            curveTo(22f, 9.164f, 21.664f, 9.5f, 21.25f, 9.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 9.5f, 15f, 9.164f, 15f, 8.75f)
            curveTo(15f, 8.336f, 15.336f, 8f, 15.75f, 8f)
            horizontalLineTo(19.658f)
            curveTo(18.6f, 6.602f, 17.23f, 5.464f, 15.528f, 4.938f)
            curveTo(13.462f, 4.298f, 11.277f, 4.353f, 9.262f, 5.103f)
            curveTo(7.233f, 5.858f, 5.352f, 7.388f, 4.408f, 9.11f)
            curveTo(4.209f, 9.474f, 3.753f, 9.607f, 3.39f, 9.407f)
            curveTo(3.026f, 9.208f, 2.893f, 8.752f, 3.093f, 8.389f)
            curveTo(4.235f, 6.307f, 6.423f, 4.558f, 8.739f, 3.697f)
            curveTo(11.068f, 2.83f, 13.593f, 2.769f, 15.972f, 3.505f)
            curveTo(17.851f, 4.086f, 19.347f, 5.261f, 20.5f, 6.649f)
            verticalLineTo(3.25f)
            curveTo(20.5f, 2.836f, 20.836f, 2.5f, 21.25f, 2.5f)
            close()
            moveTo(8.75f, 15.25f)
            curveTo(9.513f, 15.25f, 10.003f, 15.029f, 10.288f, 14.775f)
            curveTo(10.572f, 14.523f, 10.693f, 14.205f, 10.683f, 13.9f)
            curveTo(10.665f, 13.353f, 10.143f, 12.5f, 8.5f, 12.5f)
            curveTo(7.781f, 12.5f, 7.22f, 12.717f, 6.838f, 12.934f)
            curveTo(6.647f, 13.042f, 6.503f, 13.149f, 6.41f, 13.226f)
            curveTo(6.364f, 13.264f, 6.331f, 13.294f, 6.311f, 13.312f)
            curveTo(6.302f, 13.321f, 6.296f, 13.327f, 6.293f, 13.33f)
            lineTo(6.292f, 13.331f)
            curveTo(6.008f, 13.628f, 5.536f, 13.641f, 5.236f, 13.359f)
            curveTo(4.934f, 13.075f, 4.92f, 12.6f, 5.204f, 12.299f)
            lineTo(5.205f, 12.297f)
            lineTo(5.206f, 12.296f)
            lineTo(5.208f, 12.294f)
            lineTo(5.214f, 12.288f)
            lineTo(5.23f, 12.271f)
            curveTo(5.243f, 12.258f, 5.26f, 12.241f, 5.281f, 12.222f)
            curveTo(5.324f, 12.182f, 5.382f, 12.129f, 5.457f, 12.067f)
            curveTo(5.606f, 11.944f, 5.821f, 11.786f, 6.099f, 11.629f)
            curveTo(6.654f, 11.314f, 7.468f, 11f, 8.5f, 11f)
            curveTo(10.708f, 11f, 12.129f, 12.271f, 12.182f, 13.85f)
            curveTo(12.208f, 14.608f, 11.897f, 15.352f, 11.285f, 15.896f)
            curveTo(11.245f, 15.932f, 11.204f, 15.966f, 11.162f, 16f)
            curveTo(11.204f, 16.033f, 11.245f, 16.068f, 11.285f, 16.104f)
            curveTo(11.897f, 16.648f, 12.208f, 17.392f, 12.182f, 18.15f)
            curveTo(12.129f, 19.728f, 10.708f, 21f, 8.5f, 21f)
            curveTo(7.468f, 21f, 6.654f, 20.686f, 6.099f, 20.371f)
            curveTo(5.821f, 20.214f, 5.606f, 20.055f, 5.457f, 19.933f)
            curveTo(5.382f, 19.871f, 5.324f, 19.818f, 5.281f, 19.778f)
            curveTo(5.26f, 19.758f, 5.243f, 19.741f, 5.23f, 19.728f)
            lineTo(5.214f, 19.712f)
            lineTo(5.208f, 19.706f)
            lineTo(5.206f, 19.703f)
            lineTo(5.205f, 19.702f)
            lineTo(5.204f, 19.701f)
            curveTo(5.204f, 19.701f, 4.738f, 19.109f, 5.236f, 18.641f)
            curveTo(5.536f, 18.359f, 6.008f, 18.372f, 6.292f, 18.669f)
            lineTo(6.293f, 18.67f)
            curveTo(6.296f, 18.673f, 6.302f, 18.679f, 6.311f, 18.688f)
            curveTo(6.331f, 18.706f, 6.364f, 18.736f, 6.41f, 18.774f)
            curveTo(6.503f, 18.851f, 6.647f, 18.958f, 6.838f, 19.066f)
            curveTo(7.22f, 19.282f, 7.781f, 19.5f, 8.5f, 19.5f)
            curveTo(10.143f, 19.5f, 10.665f, 18.646f, 10.683f, 18.1f)
            curveTo(10.693f, 17.795f, 10.572f, 17.477f, 10.288f, 17.224f)
            curveTo(10.003f, 16.971f, 9.513f, 16.75f, 8.75f, 16.75f)
            curveTo(8.336f, 16.75f, 8f, 16.414f, 8f, 16f)
            curveTo(8f, 15.586f, 8.336f, 15.25f, 8.75f, 15.25f)
            close()
            moveTo(14.199f, 12.629f)
            curveTo(14.753f, 11.637f, 15.682f, 11f, 17.002f, 11f)
            curveTo(18.322f, 11f, 19.251f, 11.637f, 19.805f, 12.629f)
            curveTo(20.327f, 13.562f, 20.502f, 14.776f, 20.502f, 16f)
            curveTo(20.502f, 17.224f, 20.327f, 18.437f, 19.805f, 19.371f)
            curveTo(19.251f, 20.362f, 18.322f, 21f, 17.002f, 21f)
            curveTo(15.682f, 21f, 14.753f, 20.362f, 14.199f, 19.371f)
            curveTo(13.677f, 18.437f, 13.502f, 17.224f, 13.502f, 16f)
            curveTo(13.502f, 14.776f, 13.677f, 13.562f, 14.199f, 12.629f)
            close()
            moveTo(15.508f, 13.36f)
            curveTo(15.17f, 13.965f, 15.002f, 14.876f, 15.002f, 16f)
            curveTo(15.002f, 17.123f, 15.17f, 18.035f, 15.508f, 18.639f)
            curveTo(15.814f, 19.186f, 16.259f, 19.5f, 17.002f, 19.5f)
            curveTo(17.745f, 19.5f, 18.19f, 19.186f, 18.496f, 18.639f)
            curveTo(18.833f, 18.035f, 19.002f, 17.123f, 19.002f, 16f)
            curveTo(19.002f, 14.876f, 18.833f, 13.965f, 18.496f, 13.36f)
            curveTo(18.19f, 12.814f, 17.745f, 12.5f, 17.002f, 12.5f)
            curveTo(16.259f, 12.5f, 15.814f, 12.814f, 15.508f, 13.36f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SkipForward30Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SkipForward30, contentDescription = null)
    }
}
