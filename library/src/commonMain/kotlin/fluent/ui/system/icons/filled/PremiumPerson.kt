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

public val FluentIcons.Filled.PremiumPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PremiumPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.832f, 3.445f)
            curveTo(18.648f, 3.169f, 18.337f, 3f, 18f, 3f)
            horizontalLineTo(6f)
            lineTo(5.875f, 3.008f)
            curveTo(5.546f, 3.049f, 5.256f, 3.252f, 5.106f, 3.553f)
            lineTo(2.106f, 9.553f)
            lineTo(2.053f, 9.678f)
            curveTo(1.938f, 10.017f, 2.012f, 10.397f, 2.257f, 10.669f)
            lineTo(11.239f, 20.652f)
            curveTo(11.381f, 20.821f, 11.57f, 20.928f, 11.771f, 20.974f)
            lineTo(11.884f, 20.993f)
            curveTo(11.946f, 21f, 12.008f, 21.002f, 12.071f, 20.998f)
            curveTo(12.334f, 20.98f, 12.59f, 20.861f, 12.77f, 20.642f)
            lineTo(13.031f, 20.352f)
            curveTo(13.01f, 20.194f, 13f, 20.034f, 13f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(13f, 18.24f, 14.243f, 17f, 15.773f, 17f)
            horizontalLineTo(16.047f)
            lineTo(16.049f, 16.998f)
            curveTo(15.402f, 16.363f, 15f, 15.478f, 15f, 14.5f)
            curveTo(15f, 12.567f, 16.567f, 11f, 18.5f, 11f)
            curveTo(19.346f, 11f, 20.122f, 11.3f, 20.726f, 11.799f)
            lineTo(21.743f, 10.669f)
            lineTo(21.827f, 10.562f)
            curveTo(22.029f, 10.266f, 22.058f, 9.88f, 21.894f, 9.553f)
            lineTo(18.894f, 3.553f)
            lineTo(18.832f, 3.445f)
            close()
            moveTo(9.423f, 11f)
            horizontalLineTo(14.576f)
            lineTo(12f, 17.342f)
            lineTo(9.423f, 11f)
            close()
            moveTo(5.246f, 11f)
            horizontalLineTo(7.264f)
            lineTo(8.924f, 15.087f)
            lineTo(5.246f, 11f)
            close()
            moveTo(6.618f, 5f)
            horizontalLineTo(8.622f)
            lineTo(7.322f, 9f)
            horizontalLineTo(4.618f)
            lineTo(6.618f, 5f)
            close()
            moveTo(10.726f, 5f)
            horizontalLineTo(13.273f)
            lineTo(14.572f, 9f)
            horizontalLineTo(9.427f)
            lineTo(10.726f, 5f)
            close()
            moveTo(15.377f, 5f)
            horizontalLineTo(17.381f)
            lineTo(19.381f, 9f)
            horizontalLineTo(16.677f)
            lineTo(15.377f, 5f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PremiumPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PremiumPerson, contentDescription = null)
    }
}
