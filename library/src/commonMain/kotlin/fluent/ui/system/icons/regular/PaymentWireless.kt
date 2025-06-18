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

public val FluentUi.Regular.PaymentWireless: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaymentWireless",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(14.343f, 6.208f)
            curveTo(14.036f, 5.931f, 13.538f, 5.931f, 13.23f, 6.208f)
            curveTo(12.923f, 6.486f, 12.923f, 6.937f, 13.23f, 7.214f)
            curveTo(16.153f, 9.857f, 16.153f, 14.142f, 13.23f, 16.785f)
            curveTo(12.923f, 17.063f, 12.923f, 17.514f, 13.23f, 17.791f)
            curveTo(13.538f, 18.069f, 14.036f, 18.069f, 14.343f, 17.791f)
            curveTo(17.881f, 14.593f, 17.881f, 9.407f, 14.343f, 6.208f)
            close()
            moveTo(10.217f, 7.722f)
            curveTo(10.507f, 7.426f, 10.977f, 7.426f, 11.267f, 7.722f)
            curveTo(13.58f, 10.085f, 13.58f, 13.917f, 11.267f, 16.281f)
            curveTo(10.977f, 16.577f, 10.507f, 16.577f, 10.217f, 16.281f)
            curveTo(9.928f, 15.984f, 9.928f, 15.505f, 10.217f, 15.209f)
            curveTo(11.951f, 13.437f, 11.951f, 10.565f, 10.217f, 8.794f)
            curveTo(9.928f, 8.498f, 9.928f, 8.018f, 10.217f, 7.722f)
            close()
            moveTo(8.302f, 9.216f)
            curveTo(8.004f, 8.928f, 7.521f, 8.928f, 7.223f, 9.216f)
            curveTo(6.926f, 9.504f, 6.926f, 9.97f, 7.223f, 10.258f)
            curveTo(8.219f, 11.22f, 8.219f, 12.78f, 7.223f, 13.741f)
            curveTo(6.926f, 14.029f, 6.926f, 14.496f, 7.223f, 14.783f)
            curveTo(7.521f, 15.071f, 8.004f, 15.071f, 8.302f, 14.783f)
            curveTo(9.894f, 13.246f, 9.894f, 10.753f, 8.302f, 9.216f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaymentWirelessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PaymentWireless, contentDescription = null)
    }
}
