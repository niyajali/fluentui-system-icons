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

public val FluentIcons.Filled.WalletCreditCard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WalletCreditCard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.356f, 2.595f)
            curveTo(14.444f, 2.483f, 14.61f, 2.468f, 14.717f, 2.563f)
            lineTo(15.639f, 3.375f)
            lineTo(12.738f, 7f)
            horizontalLineTo(14.659f)
            lineTo(16.765f, 4.368f)
            lineTo(18.417f, 5.825f)
            curveTo(18.519f, 5.915f, 18.53f, 6.069f, 18.444f, 6.173f)
            lineTo(17.752f, 7f)
            horizontalLineTo(19.697f)
            curveTo(20.191f, 6.279f, 20.078f, 5.289f, 19.409f, 4.7f)
            lineTo(15.71f, 1.437f)
            curveTo(14.956f, 0.773f, 13.799f, 0.878f, 13.177f, 1.667f)
            lineTo(8.976f, 7f)
            horizontalLineTo(10.886f)
            lineTo(14.356f, 2.595f)
            close()
            moveTo(5.25f, 6.5f)
            curveTo(4.836f, 6.5f, 4.5f, 6.836f, 4.5f, 7.25f)
            curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
            lineTo(18.25f, 8f)
            curveTo(20.045f, 8f, 21.5f, 9.455f, 21.5f, 11.25f)
            verticalLineTo(17.75f)
            curveTo(21.5f, 19.545f, 20.045f, 21f, 18.25f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.25f)
            curveTo(3f, 6.007f, 4.007f, 5f, 5.25f, 5f)
            horizontalLineTo(9.57f)
            lineTo(8.378f, 6.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(15.5f, 14.75f)
            curveTo(15.5f, 15.164f, 15.836f, 15.5f, 16.25f, 15.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 15.5f, 19f, 15.164f, 19f, 14.75f)
            curveTo(19f, 14.336f, 18.664f, 14f, 18.25f, 14f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 14f, 15.5f, 14.336f, 15.5f, 14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WalletCreditCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WalletCreditCard, contentDescription = null)
    }
}
