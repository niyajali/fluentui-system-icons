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

public val FluentUi.Filled.DesktopEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopEdit",
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
            moveTo(12.49f, 6.865f)
            lineTo(16.355f, 3f)
            horizontalLineTo(4.25f)
            lineTo(4.096f, 3.005f)
            curveTo(2.925f, 3.084f, 2f, 4.059f, 2f, 5.25f)
            verticalLineTo(15.752f)
            lineTo(2.005f, 15.906f)
            curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
            lineTo(8.499f, 18.001f)
            verticalLineTo(20.5f)
            lineTo(6.75f, 20.5f)
            lineTo(6.648f, 20.507f)
            curveTo(6.282f, 20.556f, 6f, 20.87f, 6f, 21.25f)
            curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
            horizontalLineTo(17.25f)
            lineTo(17.352f, 21.993f)
            curveTo(17.718f, 21.943f, 18f, 21.63f, 18f, 21.25f)
            curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
            lineTo(15.499f, 20.5f)
            verticalLineTo(18.001f)
            lineTo(19.749f, 18.002f)
            lineTo(19.903f, 17.997f)
            curveTo(21.074f, 17.917f, 21.999f, 16.943f, 21.999f, 15.752f)
            verticalLineTo(6.65f)
            lineTo(17.137f, 11.511f)
            curveTo(16.665f, 11.984f, 16.073f, 12.319f, 15.425f, 12.481f)
            lineTo(13.594f, 12.939f)
            curveTo(12.066f, 13.321f, 10.681f, 11.936f, 11.063f, 10.408f)
            lineTo(11.521f, 8.577f)
            curveTo(11.683f, 7.929f, 12.018f, 7.337f, 12.49f, 6.865f)
            close()
            moveTo(13.998f, 18.001f)
            lineTo(13.999f, 20.5f)
            horizontalLineTo(9.999f)
            lineTo(9.998f, 18.001f)
            horizontalLineTo(13.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopEdit, contentDescription = null)
    }
}
