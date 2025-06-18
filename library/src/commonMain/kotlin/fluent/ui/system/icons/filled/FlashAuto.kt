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

public val FluentIcons.Filled.FlashAuto: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashAuto",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.425f, 2.831f)
            curveTo(7.602f, 2.333f, 8.074f, 2f, 8.603f, 2f)
            horizontalLineTo(15.056f)
            curveTo(15.909f, 2f, 16.512f, 2.836f, 16.242f, 3.645f)
            lineTo(14.79f, 8f)
            horizontalLineTo(18.749f)
            curveTo(19.853f, 8f, 20.415f, 9.327f, 19.647f, 10.12f)
            lineTo(18.975f, 10.813f)
            curveTo(18.243f, 9.643f, 16.411f, 9.732f, 15.868f, 11.107f)
            lineTo(13.927f, 16.024f)
            lineTo(8.586f, 21.536f)
            curveTo(7.532f, 22.624f, 5.714f, 21.642f, 6.045f, 20.164f)
            lineTo(7.314f, 14.496f)
            lineTo(5.746f, 14.49f)
            curveTo(4.539f, 14.486f, 3.699f, 13.29f, 4.104f, 12.153f)
            lineTo(7.425f, 2.831f)
            close()
            moveTo(18.194f, 11.474f)
            lineTo(21.943f, 20.97f)
            curveTo(22.095f, 21.356f, 21.906f, 21.791f, 21.521f, 21.943f)
            curveTo(21.168f, 22.083f, 20.772f, 21.936f, 20.592f, 21.613f)
            lineTo(20.548f, 21.521f)
            lineTo(19.55f, 18.996f)
            horizontalLineTo(15.44f)
            lineTo(14.444f, 21.521f)
            curveTo(14.304f, 21.875f, 13.927f, 22.063f, 13.568f, 21.974f)
            lineTo(13.471f, 21.943f)
            curveTo(13.118f, 21.804f, 12.929f, 21.426f, 13.018f, 21.068f)
            lineTo(13.049f, 20.97f)
            lineTo(16.798f, 11.474f)
            curveTo(16.886f, 11.251f, 17.055f, 11.107f, 17.247f, 11.041f)
            curveTo(17.424f, 10.981f, 17.622f, 10.987f, 17.794f, 11.06f)
            curveTo(17.934f, 11.119f, 18.058f, 11.222f, 18.143f, 11.37f)
            lineTo(18.194f, 11.474f)
            close()
            moveTo(16.032f, 17.496f)
            horizontalLineTo(18.958f)
            lineTo(17.495f, 13.791f)
            lineTo(16.032f, 17.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashAutoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlashAuto, contentDescription = null)
    }
}
