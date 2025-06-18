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

public val FluentUi.Regular.PortUsbC: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PortUsbC",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 10.5f)
            curveTo(16.398f, 10.5f, 16.779f, 10.658f, 17.061f, 10.939f)
            curveTo(17.342f, 11.221f, 17.5f, 11.602f, 17.5f, 12f)
            curveTo(17.5f, 12.398f, 17.342f, 12.779f, 17.061f, 13.061f)
            curveTo(16.779f, 13.342f, 16.398f, 13.5f, 16f, 13.5f)
            horizontalLineTo(8f)
            curveTo(7.602f, 13.5f, 7.221f, 13.342f, 6.939f, 13.061f)
            curveTo(6.658f, 12.779f, 6.5f, 12.398f, 6.5f, 12f)
            curveTo(6.5f, 11.602f, 6.658f, 11.221f, 6.939f, 10.939f)
            curveTo(7.221f, 10.658f, 7.602f, 10.5f, 8f, 10.5f)
            horizontalLineTo(16f)
            close()
            moveTo(16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.204f, 9f, 6.441f, 9.316f, 5.879f, 9.879f)
            curveTo(5.316f, 10.441f, 5f, 11.204f, 5f, 12f)
            curveTo(5f, 12.796f, 5.316f, 13.559f, 5.879f, 14.121f)
            curveTo(6.441f, 14.684f, 7.204f, 15f, 8f, 15f)
            horizontalLineTo(16f)
            curveTo(16.796f, 15f, 17.559f, 14.684f, 18.121f, 14.121f)
            curveTo(18.684f, 13.559f, 19f, 12.796f, 19f, 12f)
            curveTo(19f, 11.204f, 18.684f, 10.441f, 18.121f, 9.879f)
            curveTo(17.559f, 9.316f, 16.796f, 9f, 16f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortUsbCPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PortUsbC, contentDescription = null)
    }
}
