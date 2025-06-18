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

public val FluentUi.Regular.SendBeaker: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SendBeaker",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 11.089f)
            verticalLineTo(11.092f)
            lineTo(4.402f, 4.293f)
            lineTo(7.011f, 11.002f)
            lineTo(13.639f, 11.003f)
            curveTo(14.018f, 11.003f, 14.332f, 11.285f, 14.382f, 11.651f)
            lineTo(14.389f, 11.753f)
            curveTo(14.389f, 12.132f, 14.106f, 12.446f, 13.74f, 12.496f)
            lineTo(13.639f, 12.503f)
            lineTo(7.011f, 12.502f)
            lineTo(4.402f, 19.212f)
            lineTo(14.108f, 14.359f)
            curveTo(14.304f, 14.887f, 14.748f, 15.295f, 15.298f, 15.441f)
            lineTo(3.334f, 21.423f)
            curveTo(2.751f, 21.715f, 2.117f, 21.179f, 2.269f, 20.576f)
            lineTo(2.299f, 20.481f)
            lineTo(5.694f, 11.753f)
            lineTo(2.299f, 3.024f)
            curveTo(2.194f, 2.753f, 2.254f, 2.487f, 2.404f, 2.295f)
            curveTo(2.504f, 2.164f, 2.642f, 2.072f, 2.794f, 2.029f)
            curveTo(2.85f, 2.013f, 2.908f, 2.003f, 2.968f, 2.001f)
            curveTo(3.091f, 1.995f, 3.217f, 2.02f, 3.335f, 2.079f)
            lineTo(21.335f, 11.079f)
            curveTo(21.696f, 11.259f, 21.848f, 11.69f, 21.685f, 12.055f)
            curveTo(21.546f, 12.019f, 21.4f, 12f, 21.25f, 12f)
            horizontalLineTo(19.823f)
            lineTo(18f, 11.089f)
            close()
            moveTo(15.75f, 14.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(17.195f)
            curveTo(16.5f, 17.543f, 16.409f, 17.884f, 16.237f, 18.186f)
            lineTo(15.773f, 19f)
            horizontalLineTo(21.226f)
            lineTo(20.763f, 18.189f)
            curveTo(20.591f, 17.887f, 20.5f, 17.545f, 20.5f, 17.197f)
            verticalLineTo(14.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 14.5f, 22f, 14.164f, 22f, 13.75f)
            curveTo(22f, 13.336f, 21.664f, 13f, 21.25f, 13f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 13f, 15f, 13.336f, 15f, 13.75f)
            curveTo(15f, 14.164f, 15.336f, 14.5f, 15.75f, 14.5f)
            close()
            moveTo(15.202f, 20f)
            lineTo(14.199f, 21.757f)
            curveTo(13.629f, 22.757f, 14.351f, 24f, 15.502f, 24f)
            horizontalLineTo(21.497f)
            curveTo(22.648f, 24f, 23.37f, 22.757f, 22.799f, 21.757f)
            lineTo(21.797f, 20f)
            horizontalLineTo(15.202f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendBeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SendBeaker, contentDescription = null)
    }
}
