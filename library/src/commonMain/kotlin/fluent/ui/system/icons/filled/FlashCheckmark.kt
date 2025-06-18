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

public val FluentUi.Filled.FlashCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.424f, 2.831f)
            curveTo(7.601f, 2.333f, 8.073f, 2f, 8.602f, 2f)
            horizontalLineTo(15.055f)
            curveTo(15.908f, 2f, 16.511f, 2.836f, 16.241f, 3.645f)
            lineTo(14.79f, 8f)
            horizontalLineTo(18.748f)
            curveTo(19.852f, 8f, 20.414f, 9.327f, 19.646f, 10.12f)
            lineTo(18.688f, 11.108f)
            curveTo(18.303f, 11.037f, 17.906f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 17.977f, 11.051f, 18.442f, 11.149f, 18.89f)
            lineTo(8.585f, 21.536f)
            curveTo(7.531f, 22.624f, 5.713f, 21.642f, 6.044f, 20.164f)
            lineTo(7.313f, 14.496f)
            lineTo(5.745f, 14.49f)
            curveTo(4.538f, 14.486f, 3.698f, 13.29f, 4.103f, 12.153f)
            lineTo(7.424f, 2.831f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(21.049f, 15.342f, 21.049f, 15.658f, 20.854f, 15.854f)
            lineTo(16.854f, 19.854f)
            curveTo(16.658f, 20.049f, 16.342f, 20.049f, 16.146f, 19.854f)
            lineTo(14.146f, 17.854f)
            curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
            curveTo(14.342f, 16.951f, 14.658f, 16.951f, 14.854f, 17.146f)
            lineTo(16.5f, 18.793f)
            lineTo(20.146f, 15.146f)
            curveTo(20.342f, 14.951f, 20.658f, 14.951f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FlashCheckmark, contentDescription = null)
    }
}
