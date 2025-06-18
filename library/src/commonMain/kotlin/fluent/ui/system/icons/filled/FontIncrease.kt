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

public val FluentUi.Filled.FontIncrease: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontIncrease",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.625f, 5.781f)
            curveTo(16.193f, 6.126f, 15.564f, 6.056f, 15.219f, 5.625f)
            curveTo(14.874f, 5.193f, 14.944f, 4.564f, 15.375f, 4.219f)
            lineTo(17.875f, 2.219f)
            curveTo(18.24f, 1.927f, 18.76f, 1.927f, 19.125f, 2.219f)
            lineTo(21.625f, 4.219f)
            curveTo(22.056f, 4.564f, 22.126f, 5.193f, 21.781f, 5.625f)
            curveTo(21.436f, 6.056f, 20.806f, 6.126f, 20.375f, 5.781f)
            lineTo(18.5f, 4.281f)
            lineTo(16.625f, 5.781f)
            close()
            moveTo(12.919f, 4.606f)
            curveTo(12.762f, 4.239f, 12.4f, 4f, 12f, 4f)
            curveTo(11.6f, 4f, 11.239f, 4.239f, 11.081f, 4.606f)
            lineTo(5.081f, 18.606f)
            curveTo(4.864f, 19.114f, 5.099f, 19.701f, 5.606f, 19.919f)
            curveTo(6.114f, 20.136f, 6.702f, 19.901f, 6.919f, 19.394f)
            lineTo(8.803f, 15f)
            horizontalLineTo(15.198f)
            lineTo(17.081f, 19.394f)
            curveTo(17.299f, 19.901f, 17.886f, 20.136f, 18.394f, 19.919f)
            curveTo(18.902f, 19.701f, 19.137f, 19.114f, 18.919f, 18.606f)
            lineTo(12.919f, 4.606f)
            close()
            moveTo(12f, 7.539f)
            lineTo(14.341f, 13f)
            horizontalLineTo(9.66f)
            lineTo(12f, 7.539f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FontIncreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FontIncrease, contentDescription = null)
    }
}
