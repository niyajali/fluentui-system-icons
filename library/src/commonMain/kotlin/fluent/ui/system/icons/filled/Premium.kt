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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.Premium: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Premium",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 3f)
            curveTo(18.337f, 3f, 18.648f, 3.169f, 18.832f, 3.445f)
            lineTo(18.894f, 3.553f)
            lineTo(21.894f, 9.553f)
            curveTo(22.058f, 9.88f, 22.029f, 10.266f, 21.827f, 10.562f)
            lineTo(21.743f, 10.669f)
            lineTo(12.77f, 20.642f)
            curveTo(12.59f, 20.861f, 12.334f, 20.98f, 12.071f, 20.998f)
            curveTo(12.008f, 21.002f, 11.946f, 21f, 11.884f, 20.993f)
            lineTo(11.771f, 20.974f)
            curveTo(11.57f, 20.928f, 11.381f, 20.821f, 11.239f, 20.652f)
            lineTo(2.257f, 10.669f)
            curveTo(2.012f, 10.397f, 1.938f, 10.017f, 2.053f, 9.678f)
            lineTo(2.106f, 9.553f)
            lineTo(5.106f, 3.553f)
            curveTo(5.256f, 3.252f, 5.546f, 3.049f, 5.875f, 3.008f)
            lineTo(6f, 3f)
            horizontalLineTo(18f)
            close()
            moveTo(14.576f, 11f)
            horizontalLineTo(9.423f)
            lineTo(12f, 17.342f)
            lineTo(14.576f, 11f)
            close()
            moveTo(18.753f, 11f)
            horizontalLineTo(16.735f)
            lineTo(15.074f, 15.088f)
            lineTo(18.753f, 11f)
            close()
            moveTo(7.264f, 11f)
            horizontalLineTo(5.246f)
            lineTo(8.924f, 15.087f)
            lineTo(7.264f, 11f)
            close()
            moveTo(8.622f, 5f)
            horizontalLineTo(6.618f)
            lineTo(4.618f, 9f)
            horizontalLineTo(7.322f)
            lineTo(8.622f, 5f)
            close()
            moveTo(13.273f, 5f)
            horizontalLineTo(10.726f)
            lineTo(9.427f, 9f)
            horizontalLineTo(14.572f)
            lineTo(13.273f, 5f)
            close()
            moveTo(17.381f, 5f)
            horizontalLineTo(15.377f)
            lineTo(16.677f, 9f)
            horizontalLineTo(19.381f)
            lineTo(17.381f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PremiumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Premium, contentDescription = null)
    }
}
