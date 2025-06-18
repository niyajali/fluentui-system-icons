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

public val FluentUi.Filled.FontDecrease: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontDecrease",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.625f, 2.219f)
            curveTo(16.194f, 1.874f, 15.564f, 1.944f, 15.219f, 2.375f)
            curveTo(14.874f, 2.807f, 14.944f, 3.436f, 15.375f, 3.781f)
            lineTo(17.875f, 5.781f)
            curveTo(18.241f, 6.073f, 18.76f, 6.073f, 19.125f, 5.781f)
            lineTo(21.625f, 3.781f)
            curveTo(22.056f, 3.436f, 22.126f, 2.807f, 21.781f, 2.375f)
            curveTo(21.436f, 1.944f, 20.807f, 1.874f, 20.375f, 2.219f)
            lineTo(18.5f, 3.719f)
            lineTo(16.625f, 2.219f)
            close()
            moveTo(12f, 4f)
            curveTo(12.4f, 4f, 12.762f, 4.238f, 12.919f, 4.606f)
            lineTo(18.919f, 18.606f)
            curveTo(19.136f, 19.114f, 18.901f, 19.701f, 18.394f, 19.919f)
            curveTo(17.886f, 20.136f, 17.298f, 19.901f, 17.081f, 19.394f)
            lineTo(15.198f, 15f)
            horizontalLineTo(8.802f)
            lineTo(6.919f, 19.394f)
            curveTo(6.702f, 19.901f, 6.114f, 20.136f, 5.606f, 19.919f)
            curveTo(5.099f, 19.701f, 4.864f, 19.114f, 5.081f, 18.606f)
            lineTo(11.081f, 4.606f)
            curveTo(11.238f, 4.238f, 11.6f, 4f, 12f, 4f)
            close()
            moveTo(12f, 7.539f)
            lineTo(9.66f, 13f)
            horizontalLineTo(14.341f)
            lineTo(12f, 7.539f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FontDecreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FontDecrease, contentDescription = null)
    }
}
