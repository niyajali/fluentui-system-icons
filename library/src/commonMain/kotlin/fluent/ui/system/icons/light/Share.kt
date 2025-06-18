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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.Share: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Share",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.5f, 3f)
            curveTo(14.776f, 3f, 15f, 3.224f, 15f, 3.5f)
            curveTo(15f, 3.776f, 14.776f, 4f, 14.5f, 4f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(23.5f)
            curveTo(25.433f, 28f, 27f, 26.433f, 27f, 24.5f)
            verticalLineTo(18.5f)
            curveTo(27f, 18.224f, 27.224f, 18f, 27.5f, 18f)
            curveTo(27.776f, 18f, 28f, 18.224f, 28f, 18.5f)
            verticalLineTo(24.5f)
            curveTo(28f, 26.985f, 25.985f, 29f, 23.5f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(14.5f)
            close()
            moveTo(19.3f, 2.043f)
            curveTo(19.48f, 1.963f, 19.69f, 1.996f, 19.837f, 2.128f)
            lineTo(29.835f, 11.128f)
            curveTo(29.94f, 11.223f, 30f, 11.358f, 30f, 11.5f)
            curveTo(30f, 11.642f, 29.94f, 11.777f, 29.835f, 11.872f)
            lineTo(19.837f, 20.872f)
            curveTo(19.69f, 21.004f, 19.48f, 21.037f, 19.3f, 20.957f)
            curveTo(19.119f, 20.877f, 19.003f, 20.698f, 19.003f, 20.5f)
            verticalLineTo(15.012f)
            curveTo(15.431f, 15.169f, 12.716f, 16.994f, 10.856f, 18.854f)
            curveTo(9.885f, 19.825f, 9.155f, 20.798f, 8.669f, 21.527f)
            curveTo(8.426f, 21.892f, 8.244f, 22.194f, 8.124f, 22.404f)
            curveTo(8.02f, 22.587f, 7.962f, 22.7f, 7.951f, 22.721f)
            lineTo(7.95f, 22.724f)
            curveTo(7.848f, 22.928f, 7.62f, 23.037f, 7.396f, 22.988f)
            curveTo(7.201f, 22.946f, 7.052f, 22.792f, 7.013f, 22.602f)
            curveTo(7.003f, 22.516f, 7.001f, 22.432f, 7f, 22.346f)
            curveTo(6.999f, 22.238f, 7f, 22.082f, 7.006f, 21.885f)
            curveTo(7.017f, 21.49f, 7.047f, 20.928f, 7.123f, 20.256f)
            curveTo(7.275f, 18.914f, 7.612f, 17.115f, 8.354f, 15.31f)
            curveTo(9.096f, 13.503f, 10.251f, 11.672f, 12.051f, 10.291f)
            curveTo(13.762f, 8.978f, 16.026f, 8.097f, 19.003f, 8.009f)
            verticalLineTo(2.5f)
            lineTo(19.008f, 2.427f)
            curveTo(19.033f, 2.259f, 19.142f, 2.113f, 19.3f, 2.043f)
            close()
            moveTo(20.003f, 8.5f)
            curveTo(20.003f, 8.633f, 19.95f, 8.76f, 19.856f, 8.854f)
            curveTo(19.763f, 8.947f, 19.635f, 9f, 19.503f, 9f)
            curveTo(16.478f, 9f, 14.275f, 9.844f, 12.659f, 11.084f)
            curveTo(11.037f, 12.328f, 9.974f, 13.997f, 9.278f, 15.69f)
            curveTo(8.583f, 17.384f, 8.262f, 19.086f, 8.117f, 20.369f)
            curveTo(8.108f, 20.447f, 8.1f, 20.524f, 8.093f, 20.599f)
            curveTo(8.594f, 19.885f, 9.28f, 19.016f, 10.149f, 18.146f)
            curveTo(12.204f, 16.092f, 15.324f, 14f, 19.503f, 14f)
            curveTo(19.635f, 14f, 19.763f, 14.053f, 19.856f, 14.146f)
            curveTo(19.95f, 14.24f, 20.003f, 14.368f, 20.003f, 14.5f)
            verticalLineTo(19.376f)
            lineTo(28.751f, 11.5f)
            lineTo(20.003f, 3.623f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SharePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Share, contentDescription = null)
    }
}
