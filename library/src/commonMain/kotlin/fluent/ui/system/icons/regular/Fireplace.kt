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

public val FluentUi.Regular.Fireplace: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Fireplace",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 11f)
            curveTo(3f, 6.029f, 7.029f, 2f, 12f, 2f)
            curveTo(16.971f, 2f, 21f, 6.029f, 21f, 11f)
            verticalLineTo(17.25f)
            curveTo(21f, 17.664f, 20.664f, 18f, 20.25f, 18f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 18f, 3f, 17.664f, 3f, 17.25f)
            verticalLineTo(11f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.858f, 3.5f, 4.5f, 6.858f, 4.5f, 11f)
            verticalLineTo(16.5f)
            horizontalLineTo(8.794f)
            curveTo(7.989f, 15.73f, 7.5f, 14.667f, 7.5f, 13.486f)
            curveTo(7.5f, 12.29f, 7.86f, 11.354f, 8.223f, 10.716f)
            curveTo(8.405f, 10.398f, 8.587f, 10.152f, 8.728f, 9.983f)
            curveTo(8.799f, 9.898f, 8.86f, 9.832f, 8.905f, 9.784f)
            curveTo(8.928f, 9.761f, 8.947f, 9.742f, 8.961f, 9.727f)
            lineTo(8.98f, 9.71f)
            lineTo(8.986f, 9.703f)
            lineTo(8.989f, 9.701f)
            lineTo(8.99f, 9.7f)
            lineTo(8.991f, 9.699f)
            curveTo(9.275f, 9.437f, 9.711f, 9.433f, 9.999f, 9.69f)
            curveTo(10.016f, 9.705f, 10.033f, 9.72f, 10.049f, 9.734f)
            lineTo(10.053f, 9.682f)
            curveTo(10.058f, 9.631f, 10.064f, 9.576f, 10.069f, 9.519f)
            curveTo(10.12f, 8.997f, 10.205f, 8.251f, 10.542f, 7.58f)
            curveTo(10.903f, 6.863f, 11.536f, 6.26f, 12.581f, 6.019f)
            curveTo(12.804f, 5.968f, 13.038f, 6.021f, 13.217f, 6.163f)
            curveTo(13.396f, 6.305f, 13.5f, 6.521f, 13.5f, 6.75f)
            curveTo(13.5f, 8.087f, 14.089f, 8.848f, 14.828f, 9.742f)
            lineTo(14.903f, 9.833f)
            curveTo(15.627f, 10.705f, 16.5f, 11.759f, 16.5f, 13.486f)
            curveTo(16.5f, 14.657f, 16.008f, 15.725f, 15.197f, 16.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(11f)
            curveTo(19.5f, 6.858f, 16.142f, 3.5f, 12f, 3.5f)
            close()
            moveTo(9.527f, 11.458f)
            curveTo(9.265f, 11.918f, 9f, 12.6f, 9f, 13.486f)
            curveTo(9f, 14.96f, 10.227f, 16.25f, 12.002f, 16.25f)
            curveTo(13.771f, 16.25f, 15f, 14.937f, 15f, 13.486f)
            curveTo(15f, 12.304f, 14.437f, 11.623f, 13.676f, 10.703f)
            lineTo(13.672f, 10.698f)
            curveTo(13.079f, 9.981f, 12.395f, 9.142f, 12.122f, 7.905f)
            curveTo(12.022f, 8.011f, 11.945f, 8.129f, 11.882f, 8.254f)
            curveTo(11.684f, 8.648f, 11.614f, 9.136f, 11.562f, 9.665f)
            curveTo(11.558f, 9.708f, 11.554f, 9.752f, 11.549f, 9.797f)
            curveTo(11.53f, 10.003f, 11.509f, 10.228f, 11.476f, 10.417f)
            curveTo(11.443f, 10.61f, 11.371f, 10.978f, 11.11f, 11.245f)
            curveTo(10.952f, 11.407f, 10.74f, 11.517f, 10.495f, 11.541f)
            curveTo(10.27f, 11.563f, 10.07f, 11.508f, 9.916f, 11.444f)
            curveTo(9.821f, 11.405f, 9.724f, 11.354f, 9.626f, 11.293f)
            curveTo(9.594f, 11.345f, 9.56f, 11.4f, 9.527f, 11.458f)
            close()
            moveTo(2f, 20.25f)
            curveTo(2f, 19.836f, 2.336f, 19.5f, 2.75f, 19.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19.5f, 22f, 19.836f, 22f, 20.25f)
            curveTo(22f, 20.664f, 21.664f, 21f, 21.25f, 21f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 21f, 2f, 20.664f, 2f, 20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FireplacePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Fireplace, contentDescription = null)
    }
}
