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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PersonSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.751f, 13.997f)
            curveTo(16.993f, 13.997f, 18f, 15.004f, 18f, 16.246f)
            verticalLineTo(17.165f)
            curveTo(18f, 17.45f, 17.955f, 17.732f, 17.869f, 18.001f)
            horizontalLineTo(15.835f)
            curveTo(16.138f, 17.353f, 16.023f, 16.557f, 15.488f, 16.022f)
            curveTo(14.804f, 15.338f, 13.696f, 15.338f, 13.013f, 16.021f)
            lineTo(10.513f, 18.52f)
            curveTo(10.184f, 18.848f, 10f, 19.293f, 10f, 19.758f)
            curveTo(10f, 20.222f, 10.185f, 20.667f, 10.513f, 20.996f)
            lineTo(11.448f, 21.929f)
            curveTo(10.983f, 21.975f, 10.5f, 21.998f, 9.996f, 21.998f)
            curveTo(6.575f, 21.998f, 4.053f, 20.926f, 2.51f, 18.762f)
            curveTo(2.178f, 18.296f, 2f, 17.738f, 2f, 17.166f)
            verticalLineTo(16.246f)
            curveTo(2f, 15.004f, 3.007f, 13.997f, 4.249f, 13.997f)
            horizontalLineTo(15.751f)
            close()
            moveTo(9.996f, 2.002f)
            curveTo(12.758f, 2.002f, 14.997f, 4.241f, 14.997f, 7.002f)
            curveTo(14.997f, 9.763f, 12.758f, 12.002f, 9.996f, 12.002f)
            curveTo(7.235f, 12.002f, 4.996f, 9.763f, 4.996f, 7.002f)
            curveTo(4.996f, 4.241f, 7.235f, 2.002f, 9.996f, 2.002f)
            close()
            moveTo(14.78f, 17.784f)
            curveTo(15.073f, 17.491f, 15.073f, 17.016f, 14.78f, 16.723f)
            curveTo(14.487f, 16.43f, 14.012f, 16.43f, 13.719f, 16.723f)
            lineTo(11.219f, 19.224f)
            curveTo(11.079f, 19.365f, 11f, 19.556f, 11f, 19.755f)
            curveTo(11f, 19.954f, 11.079f, 20.144f, 11.219f, 20.285f)
            lineTo(13.719f, 22.784f)
            curveTo(14.012f, 23.077f, 14.487f, 23.076f, 14.78f, 22.784f)
            curveTo(15.073f, 22.491f, 15.073f, 22.016f, 14.78f, 21.723f)
            lineTo(13.56f, 20.503f)
            horizontalLineTo(20.44f)
            lineTo(19.22f, 21.723f)
            curveTo(18.927f, 22.016f, 18.927f, 22.49f, 19.219f, 22.784f)
            curveTo(19.512f, 23.076f, 19.987f, 23.077f, 20.28f, 22.784f)
            lineTo(22.78f, 20.285f)
            curveTo(22.921f, 20.145f, 23f, 19.954f, 23f, 19.755f)
            curveTo(23f, 19.556f, 22.921f, 19.365f, 22.78f, 19.225f)
            lineTo(20.28f, 16.723f)
            curveTo(19.987f, 16.43f, 19.513f, 16.43f, 19.22f, 16.723f)
            curveTo(18.927f, 17.016f, 18.927f, 17.49f, 19.219f, 17.784f)
            lineTo(20.438f, 19.003f)
            horizontalLineTo(13.561f)
            lineTo(14.78f, 17.784f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonSwap, contentDescription = null)
    }
}
