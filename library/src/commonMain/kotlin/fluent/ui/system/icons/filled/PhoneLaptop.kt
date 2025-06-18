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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.PhoneLaptop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneLaptop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.254f, 8.003f)
            curveTo(9.221f, 8.003f, 10.004f, 8.786f, 10.004f, 9.753f)
            verticalLineTo(19.253f)
            curveTo(10.004f, 20.219f, 9.221f, 21.003f, 8.254f, 21.003f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 21.003f, 2f, 20.219f, 2f, 19.253f)
            verticalLineTo(9.753f)
            curveTo(2f, 8.786f, 2.783f, 8.003f, 3.75f, 8.003f)
            horizontalLineTo(8.254f)
            close()
            moveTo(6.252f, 17.498f)
            horizontalLineTo(5.752f)
            curveTo(5.338f, 17.498f, 5.002f, 17.834f, 5.002f, 18.248f)
            curveTo(5.002f, 18.662f, 5.338f, 18.998f, 5.752f, 18.998f)
            horizontalLineTo(6.252f)
            curveTo(6.666f, 18.998f, 7.002f, 18.662f, 7.002f, 18.248f)
            curveTo(7.002f, 17.834f, 6.666f, 17.498f, 6.252f, 17.498f)
            close()
            moveTo(21.249f, 16.5f)
            curveTo(21.664f, 16.5f, 21.999f, 16.835f, 21.999f, 17.25f)
            curveTo(21.999f, 17.629f, 21.717f, 17.943f, 21.351f, 17.993f)
            lineTo(21.249f, 18f)
            lineTo(11f, 17.999f)
            verticalLineTo(16.499f)
            lineTo(21.249f, 16.5f)
            close()
            moveTo(18.25f, 5f)
            curveTo(19.216f, 5f, 20f, 5.784f, 20f, 6.75f)
            verticalLineTo(14.25f)
            curveTo(20f, 15.217f, 19.216f, 16f, 18.25f, 16f)
            lineTo(11f, 16f)
            lineTo(11f, 9f)
            curveTo(11f, 7.945f, 10.184f, 7.081f, 9.149f, 7.005f)
            lineTo(9f, 7f)
            lineTo(4f, 6.999f)
            lineTo(4f, 6.75f)
            curveTo(4f, 5.784f, 4.784f, 5f, 5.75f, 5f)
            horizontalLineTo(18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneLaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneLaptop, contentDescription = null)
    }
}
