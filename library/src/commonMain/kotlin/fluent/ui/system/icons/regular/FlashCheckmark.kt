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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.FlashCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlashCheckmark",
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
            curveTo(17.212f, 11f, 16.929f, 11.019f, 16.651f, 11.055f)
            lineTo(18.158f, 9.5f)
            horizontalLineTo(13.749f)
            curveTo(13.508f, 9.5f, 13.281f, 9.384f, 13.141f, 9.189f)
            curveTo(13f, 8.993f, 12.961f, 8.742f, 13.037f, 8.513f)
            lineTo(14.708f, 3.5f)
            horizontalLineTo(8.778f)
            lineTo(5.516f, 12.656f)
            curveTo(5.458f, 12.819f, 5.578f, 12.99f, 5.751f, 12.99f)
            lineTo(8.252f, 13f)
            curveTo(8.479f, 13.001f, 8.694f, 13.105f, 8.835f, 13.282f)
            curveTo(8.977f, 13.46f, 9.03f, 13.692f, 8.981f, 13.914f)
            lineTo(7.508f, 20.492f)
            lineTo(11.032f, 16.855f)
            curveTo(11.011f, 17.067f, 11f, 17.282f, 11f, 17.5f)
            curveTo(11f, 17.977f, 11.051f, 18.442f, 11.149f, 18.89f)
            lineTo(8.585f, 21.536f)
            curveTo(7.531f, 22.624f, 5.713f, 21.642f, 6.044f, 20.164f)
            lineTo(7.313f, 14.496f)
            lineTo(5.745f, 14.49f)
            curveTo(4.538f, 14.486f, 3.698f, 13.29f, 4.103f, 12.153f)
            lineTo(7.424f, 2.831f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FlashCheckmark, contentDescription = null)
    }
}
