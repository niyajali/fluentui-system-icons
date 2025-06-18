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

public val FluentUi.Regular.PuzzlePiece: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PuzzlePiece",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 2.004f)
            curveTo(14.598f, 2.004f, 15.904f, 3.253f, 15.994f, 4.823f)
            lineTo(15.999f, 4.999f)
            lineTo(18.25f, 5f)
            curveTo(19.117f, 5f, 19.837f, 5.631f, 19.976f, 6.459f)
            lineTo(19.994f, 6.607f)
            lineTo(20f, 6.75f)
            lineTo(19.999f, 10.501f)
            lineTo(18.001f, 10.501f)
            curveTo(17.258f, 10.501f, 16.635f, 11.045f, 16.521f, 11.74f)
            lineTo(16.506f, 11.873f)
            lineTo(16.501f, 12.001f)
            curveTo(16.501f, 12.745f, 17.045f, 13.368f, 17.74f, 13.481f)
            lineTo(17.873f, 13.497f)
            lineTo(18.001f, 13.501f)
            lineTo(19.999f, 13.501f)
            lineTo(20f, 17.253f)
            curveTo(20f, 18.171f, 19.293f, 18.924f, 18.393f, 18.997f)
            lineTo(18.25f, 19.003f)
            lineTo(15.999f, 19.002f)
            lineTo(15.995f, 19.175f)
            curveTo(15.911f, 20.631f, 14.788f, 21.808f, 13.357f, 21.977f)
            lineTo(13.176f, 21.993f)
            lineTo(13f, 21.998f)
            curveTo(11.402f, 21.998f, 10.096f, 20.75f, 10.005f, 19.178f)
            lineTo(10f, 19.002f)
            lineTo(7.75f, 19.003f)
            curveTo(6.883f, 19.003f, 6.163f, 18.372f, 6.024f, 17.544f)
            lineTo(6.006f, 17.396f)
            lineTo(6f, 17.253f)
            lineTo(5.999f, 15.001f)
            lineTo(5.836f, 14.996f)
            curveTo(4.38f, 14.912f, 3.203f, 13.789f, 3.033f, 12.358f)
            lineTo(3.017f, 12.178f)
            lineTo(3.012f, 12.001f)
            curveTo(3.012f, 10.404f, 4.261f, 9.098f, 5.836f, 9.006f)
            lineTo(5.999f, 9.001f)
            lineTo(6f, 6.75f)
            curveTo(6f, 5.883f, 6.631f, 5.163f, 7.458f, 5.024f)
            lineTo(7.606f, 5.006f)
            lineTo(7.75f, 5f)
            lineTo(9.999f, 4.999f)
            lineTo(10.005f, 4.828f)
            curveTo(10.089f, 3.372f, 11.212f, 2.195f, 12.643f, 2.025f)
            lineTo(12.824f, 2.009f)
            lineTo(13f, 2.004f)
            close()
            moveTo(13f, 3.504f)
            curveTo(12.22f, 3.504f, 11.58f, 4.099f, 11.507f, 4.86f)
            lineTo(11.5f, 5.005f)
            lineTo(11.498f, 6.499f)
            lineTo(7.75f, 6.5f)
            curveTo(7.632f, 6.5f, 7.533f, 6.582f, 7.507f, 6.693f)
            lineTo(7.5f, 6.75f)
            lineTo(7.499f, 10.501f)
            lineTo(6.012f, 10.501f)
            curveTo(5.184f, 10.501f, 4.512f, 11.173f, 4.512f, 12.001f)
            curveTo(4.512f, 12.781f, 5.107f, 13.422f, 5.868f, 13.494f)
            lineTo(6.012f, 13.501f)
            lineTo(7.499f, 13.501f)
            lineTo(7.5f, 17.253f)
            curveTo(7.5f, 17.371f, 7.582f, 17.47f, 7.693f, 17.496f)
            lineTo(7.75f, 17.503f)
            lineTo(11.498f, 17.502f)
            lineTo(11.5f, 18.998f)
            curveTo(11.5f, 19.827f, 12.172f, 20.498f, 13f, 20.498f)
            curveTo(13.78f, 20.498f, 14.42f, 19.903f, 14.493f, 19.143f)
            lineTo(14.5f, 18.999f)
            lineTo(14.498f, 17.502f)
            lineTo(18.25f, 17.503f)
            curveTo(18.368f, 17.503f, 18.468f, 17.42f, 18.493f, 17.31f)
            lineTo(18.5f, 17.253f)
            lineTo(18.499f, 15f)
            lineTo(17.976f, 15.001f)
            lineTo(17.797f, 14.994f)
            curveTo(16.285f, 14.892f, 15.093f, 13.677f, 15.007f, 12.153f)
            lineTo(15.002f, 11.976f)
            lineTo(15.008f, 11.797f)
            curveTo(15.111f, 10.285f, 16.326f, 9.093f, 17.827f, 9.006f)
            lineTo(18.001f, 9.001f)
            lineTo(18.499f, 9.001f)
            lineTo(18.5f, 6.75f)
            curveTo(18.5f, 6.655f, 18.447f, 6.573f, 18.37f, 6.53f)
            lineTo(18.307f, 6.507f)
            lineTo(18.25f, 6.5f)
            lineTo(14.498f, 6.499f)
            lineTo(14.5f, 5.004f)
            curveTo(14.5f, 4.176f, 13.828f, 3.504f, 13f, 3.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PuzzlePiecePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PuzzlePiece, contentDescription = null)
    }
}
