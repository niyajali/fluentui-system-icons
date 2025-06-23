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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.NumberSymbol: ImageVector
    get() {
        if (_NumberSymbol != null) {
            return _NumberSymbol!!
        }
        _NumberSymbol = ImageVector.Builder(
            name = "Regular.NumberSymbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.987f, 2.89f)
                curveTo(11.064f, 2.483f, 10.796f, 2.09f, 10.389f, 2.013f)
                curveTo(9.982f, 1.936f, 9.59f, 2.204f, 9.513f, 2.611f)
                lineTo(8.494f, 7.998f)
                lineTo(3.75f, 8f)
                curveTo(3.335f, 8.001f, 3f, 8.337f, 3f, 8.751f)
                curveTo(3f, 9.165f, 3.336f, 9.501f, 3.75f, 9.5f)
                lineTo(8.21f, 9.498f)
                lineTo(7.264f, 14.498f)
                lineTo(2.75f, 14.5f)
                curveTo(2.335f, 14.5f, 2f, 14.836f, 2f, 15.25f)
                curveTo(2f, 15.665f, 2.336f, 16f, 2.75f, 16f)
                lineTo(6.981f, 15.998f)
                lineTo(6.013f, 21.114f)
                curveTo(5.936f, 21.521f, 6.204f, 21.913f, 6.611f, 21.99f)
                curveTo(7.018f, 22.067f, 7.41f, 21.799f, 7.487f, 21.392f)
                lineTo(8.507f, 15.997f)
                lineTo(13.981f, 15.995f)
                lineTo(13.013f, 21.114f)
                curveTo(12.936f, 21.521f, 13.204f, 21.913f, 13.611f, 21.99f)
                curveTo(14.018f, 22.067f, 14.41f, 21.799f, 14.487f, 21.392f)
                lineTo(15.508f, 15.994f)
                lineTo(20.25f, 15.992f)
                curveTo(20.665f, 15.992f, 21f, 15.656f, 21f, 15.242f)
                curveTo(21f, 14.827f, 20.664f, 14.492f, 20.25f, 14.492f)
                lineTo(15.792f, 14.494f)
                lineTo(16.738f, 9.494f)
                lineTo(21.25f, 9.492f)
                curveTo(21.665f, 9.492f, 22f, 9.156f, 22f, 8.742f)
                curveTo(22f, 8.328f, 21.664f, 7.992f, 21.25f, 7.992f)
                lineTo(17.021f, 7.994f)
                lineTo(17.987f, 2.89f)
                curveTo(18.064f, 2.483f, 17.796f, 2.09f, 17.389f, 2.013f)
                curveTo(16.982f, 1.936f, 16.59f, 2.204f, 16.513f, 2.611f)
                lineTo(15.495f, 7.995f)
                lineTo(10.021f, 7.997f)
                lineTo(10.987f, 2.89f)
                close()
                moveTo(9.737f, 9.498f)
                lineTo(15.211f, 9.495f)
                lineTo(14.265f, 14.495f)
                lineTo(8.791f, 14.497f)
                lineTo(9.737f, 9.498f)
                close()
            }
        }.build()

        return _NumberSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSymbol: ImageVector? = null

@Preview
@Composable
private fun NumberSymbolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NumberSymbol, contentDescription = null)
    }
}
