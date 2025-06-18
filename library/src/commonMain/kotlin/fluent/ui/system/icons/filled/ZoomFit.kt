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

public val FluentUi.Filled.ZoomFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ZoomFit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.519f, 2.709f)
            curveTo(12.231f, 2.435f, 11.778f, 2.434f, 11.489f, 2.707f)
            lineTo(9.265f, 4.801f)
            curveTo(8.964f, 5.085f, 8.489f, 5.071f, 8.205f, 4.77f)
            curveTo(7.921f, 4.468f, 7.935f, 3.994f, 8.237f, 3.71f)
            lineTo(10.461f, 1.615f)
            curveTo(11.329f, 0.797f, 12.685f, 0.799f, 13.551f, 1.62f)
            lineTo(15.758f, 3.711f)
            curveTo(16.059f, 3.996f, 16.072f, 4.471f, 15.787f, 4.771f)
            curveTo(15.502f, 5.072f, 15.027f, 5.085f, 14.726f, 4.8f)
            lineTo(12.519f, 2.709f)
            close()
            moveTo(4.772f, 8.203f)
            curveTo(5.073f, 8.487f, 5.087f, 8.962f, 4.803f, 9.263f)
            lineTo(2.709f, 11.487f)
            curveTo(2.436f, 11.777f, 2.437f, 12.229f, 2.71f, 12.517f)
            lineTo(4.802f, 14.724f)
            curveTo(5.087f, 15.025f, 5.074f, 15.5f, 4.773f, 15.785f)
            curveTo(4.473f, 16.07f, 3.998f, 16.057f, 3.713f, 15.756f)
            lineTo(1.622f, 13.549f)
            curveTo(0.801f, 12.683f, 0.799f, 11.327f, 1.617f, 10.459f)
            lineTo(3.711f, 8.235f)
            curveTo(3.995f, 7.933f, 4.47f, 7.919f, 4.772f, 8.203f)
            close()
            moveTo(19.228f, 8.215f)
            curveTo(19.528f, 7.93f, 20.003f, 7.942f, 20.288f, 8.243f)
            lineTo(22.387f, 10.456f)
            curveTo(23.21f, 11.324f, 23.21f, 12.685f, 22.387f, 13.553f)
            lineTo(20.288f, 15.766f)
            curveTo(20.003f, 16.067f, 19.528f, 16.079f, 19.228f, 15.794f)
            curveTo(18.927f, 15.509f, 18.914f, 15.035f, 19.199f, 14.734f)
            lineTo(21.298f, 12.521f)
            curveTo(21.573f, 12.231f, 21.573f, 11.778f, 21.298f, 11.488f)
            lineTo(19.199f, 9.275f)
            curveTo(18.914f, 8.975f, 18.927f, 8.5f, 19.228f, 8.215f)
            close()
            moveTo(15.794f, 19.228f)
            curveTo(16.079f, 19.528f, 16.067f, 20.003f, 15.766f, 20.288f)
            lineTo(13.554f, 22.386f)
            curveTo(12.686f, 23.208f, 11.327f, 23.209f, 10.459f, 22.386f)
            lineTo(8.243f, 20.288f)
            curveTo(7.943f, 20.003f, 7.93f, 19.529f, 8.214f, 19.228f)
            curveTo(8.499f, 18.927f, 8.974f, 18.914f, 9.275f, 19.199f)
            lineTo(11.49f, 21.297f)
            curveTo(11.779f, 21.572f, 12.233f, 21.571f, 12.522f, 21.297f)
            lineTo(14.734f, 19.199f)
            curveTo(15.035f, 18.914f, 15.509f, 18.927f, 15.794f, 19.228f)
            close()
            moveTo(9.75f, 7f)
            curveTo(8.231f, 7f, 7f, 8.231f, 7f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(7f, 15.769f, 8.231f, 17f, 9.75f, 17f)
            horizontalLineTo(14.25f)
            curveTo(15.769f, 17f, 17f, 15.769f, 17f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(17f, 8.231f, 15.769f, 7f, 14.25f, 7f)
            horizontalLineTo(9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ZoomFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ZoomFit, contentDescription = null)
    }
}
