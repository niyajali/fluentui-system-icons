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

public val FluentUi.Filled.PortMicroUsb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortMicroUsb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 12.83f)
            verticalLineTo(13f)
            curveTo(18.998f, 13.53f, 18.787f, 14.038f, 18.413f, 14.413f)
            curveTo(18.038f, 14.787f, 17.53f, 14.998f, 17f, 15f)
            horizontalLineTo(7f)
            curveTo(6.47f, 14.998f, 5.962f, 14.787f, 5.588f, 14.413f)
            curveTo(5.213f, 14.038f, 5.002f, 13.53f, 5f, 13f)
            verticalLineTo(12.83f)
            curveTo(5f, 12.566f, 5.052f, 12.305f, 5.154f, 12.061f)
            curveTo(5.255f, 11.818f, 5.403f, 11.596f, 5.59f, 11.41f)
            lineTo(7.41f, 9.59f)
            curveTo(7.596f, 9.403f, 7.818f, 9.255f, 8.061f, 9.154f)
            curveTo(8.305f, 9.052f, 8.566f, 9f, 8.83f, 9f)
            horizontalLineTo(15.17f)
            curveTo(15.434f, 9f, 15.695f, 9.052f, 15.939f, 9.154f)
            curveTo(16.182f, 9.255f, 16.404f, 9.403f, 16.59f, 9.59f)
            lineTo(18.41f, 11.41f)
            curveTo(18.597f, 11.596f, 18.745f, 11.818f, 18.847f, 12.061f)
            curveTo(18.948f, 12.305f, 19f, 12.566f, 19f, 12.83f)
            verticalLineTo(12.83f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortMicroUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PortMicroUsb, contentDescription = null)
    }
}
