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

public val FluentUi.Filled.Wallet: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallet",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(18.25f)
            curveTo(20.045f, 21f, 21.5f, 19.545f, 21.5f, 17.75f)
            verticalLineTo(9.25f)
            curveTo(21.5f, 7.713f, 20.433f, 6.426f, 19f, 6.087f)
            verticalLineTo(5.25f)
            curveTo(19f, 4.007f, 17.993f, 3f, 16.75f, 3f)
            horizontalLineTo(5.25f)
            curveTo(4.092f, 3f, 3.138f, 3.875f, 3.014f, 5f)
            horizontalLineTo(3f)
            close()
            moveTo(5.25f, 6f)
            curveTo(4.836f, 6f, 4.5f, 5.664f, 4.5f, 5.25f)
            curveTo(4.5f, 4.836f, 4.836f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 4.5f, 17.5f, 4.836f, 17.5f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(5.25f)
            close()
            moveTo(16.25f, 13f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 13f, 19f, 13.336f, 19f, 13.75f)
            curveTo(19f, 14.164f, 18.664f, 14.5f, 18.25f, 14.5f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 14.5f, 15.5f, 14.164f, 15.5f, 13.75f)
            curveTo(15.5f, 13.336f, 15.836f, 13f, 16.25f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WalletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Wallet, contentDescription = null)
    }
}
