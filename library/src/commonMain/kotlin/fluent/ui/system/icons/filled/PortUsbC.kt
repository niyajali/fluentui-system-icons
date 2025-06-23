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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.PortUsbC: ImageVector
    get() {
        if (_PortUsbC != null) {
            return _PortUsbC!!
        }
        _PortUsbC = ImageVector.Builder(
            name = "Filled.PortUsbC",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 12f)
                curveTo(19f, 12.394f, 18.923f, 12.785f, 18.773f, 13.149f)
                curveTo(18.622f, 13.513f, 18.401f, 13.844f, 18.122f, 14.123f)
                curveTo(17.844f, 14.401f, 17.513f, 14.622f, 17.149f, 14.773f)
                curveTo(16.785f, 14.923f, 16.394f, 15f, 16f, 15f)
                horizontalLineTo(8f)
                curveTo(7.204f, 15f, 6.441f, 14.684f, 5.879f, 14.121f)
                curveTo(5.316f, 13.559f, 5f, 12.796f, 5f, 12f)
                curveTo(5f, 11.204f, 5.316f, 10.441f, 5.879f, 9.879f)
                curveTo(6.441f, 9.316f, 7.204f, 9f, 8f, 9f)
                horizontalLineTo(16f)
                curveTo(16.394f, 8.999f, 16.785f, 9.077f, 17.149f, 9.227f)
                curveTo(17.513f, 9.378f, 17.844f, 9.599f, 18.122f, 9.878f)
                curveTo(18.401f, 10.156f, 18.622f, 10.487f, 18.773f, 10.851f)
                curveTo(18.923f, 11.215f, 19f, 11.606f, 19f, 12f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PortUsbC!!
    }

@Suppress("ObjectPropertyName")
private var _PortUsbC: ImageVector? = null

@Preview
@Composable
private fun PortUsbCPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PortUsbC, contentDescription = null)
    }
}
