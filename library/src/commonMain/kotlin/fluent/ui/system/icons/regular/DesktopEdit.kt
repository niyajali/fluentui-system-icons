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

public val FluentUi.Regular.DesktopEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.1f, 1.669f)
            lineTo(13.197f, 7.572f)
            curveTo(12.853f, 7.916f, 12.609f, 8.347f, 12.491f, 8.819f)
            lineTo(12.033f, 10.65f)
            curveTo(11.834f, 11.446f, 12.556f, 12.167f, 13.352f, 11.968f)
            lineTo(15.182f, 11.511f)
            curveTo(15.655f, 11.393f, 16.086f, 11.149f, 16.43f, 10.804f)
            lineTo(22.332f, 4.902f)
            curveTo(23.225f, 4.009f, 23.225f, 2.562f, 22.332f, 1.669f)
            curveTo(21.44f, 0.777f, 19.993f, 0.777f, 19.1f, 1.669f)
            close()
            moveTo(4.25f, 3f)
            horizontalLineTo(16.355f)
            lineTo(14.856f, 4.5f)
            horizontalLineTo(4.25f)
            curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
            lineTo(3.5f, 5.25f)
            verticalLineTo(15.752f)
            curveTo(3.5f, 16.132f, 3.782f, 16.445f, 4.148f, 16.495f)
            lineTo(4.25f, 16.502f)
            horizontalLineTo(19.749f)
            curveTo(20.128f, 16.502f, 20.442f, 16.22f, 20.492f, 15.854f)
            lineTo(20.499f, 15.752f)
            verticalLineTo(8.15f)
            lineTo(21.999f, 6.65f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.943f, 21.074f, 17.917f, 19.903f, 17.997f)
            lineTo(19.749f, 18.002f)
            lineTo(15.499f, 18.001f)
            verticalLineTo(20.5f)
            lineTo(17.25f, 20.5f)
            curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
            curveTo(18f, 21.63f, 17.718f, 21.943f, 17.352f, 21.993f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 22f, 6f, 21.664f, 6f, 21.25f)
            curveTo(6f, 20.87f, 6.282f, 20.556f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.001f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            close()
            moveTo(13.998f, 18.001f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(13.999f)
            lineTo(13.998f, 18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DesktopEdit, contentDescription = null)
    }
}
