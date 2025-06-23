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

public val FluentIcons.Regular.PortMicroUsb: ImageVector
    get() {
        if (_PortMicroUsb != null) {
            return _PortMicroUsb!!
        }
        _PortMicroUsb = ImageVector.Builder(
            name = "Regular.PortMicroUsb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.172f, 10.5f)
                curveTo(15.237f, 10.5f, 15.302f, 10.513f, 15.363f, 10.538f)
                curveTo(15.424f, 10.563f, 15.479f, 10.6f, 15.525f, 10.646f)
                lineTo(17.354f, 12.475f)
                curveTo(17.4f, 12.521f, 17.437f, 12.576f, 17.462f, 12.637f)
                curveTo(17.487f, 12.698f, 17.5f, 12.763f, 17.5f, 12.828f)
                verticalLineTo(13f)
                curveTo(17.5f, 13.133f, 17.447f, 13.26f, 17.353f, 13.353f)
                curveTo(17.26f, 13.447f, 17.133f, 13.5f, 17f, 13.5f)
                horizontalLineTo(7f)
                curveTo(6.867f, 13.5f, 6.74f, 13.447f, 6.647f, 13.353f)
                curveTo(6.553f, 13.26f, 6.5f, 13.133f, 6.5f, 13f)
                verticalLineTo(12.828f)
                curveTo(6.5f, 12.763f, 6.513f, 12.698f, 6.538f, 12.637f)
                curveTo(6.563f, 12.576f, 6.6f, 12.521f, 6.646f, 12.475f)
                lineTo(8.475f, 10.646f)
                curveTo(8.521f, 10.6f, 8.576f, 10.563f, 8.637f, 10.538f)
                curveTo(8.698f, 10.513f, 8.763f, 10.5f, 8.828f, 10.5f)
                horizontalLineTo(15.172f)
                close()
                moveTo(15.172f, 9f)
                horizontalLineTo(8.828f)
                curveTo(8.566f, 9f, 8.306f, 9.052f, 8.063f, 9.152f)
                curveTo(7.82f, 9.253f, 7.6f, 9.4f, 7.414f, 9.586f)
                lineTo(5.586f, 11.414f)
                curveTo(5.4f, 11.6f, 5.253f, 11.82f, 5.152f, 12.063f)
                curveTo(5.052f, 12.306f, 5f, 12.566f, 5f, 12.828f)
                verticalLineTo(13f)
                curveTo(5f, 13.53f, 5.211f, 14.039f, 5.586f, 14.414f)
                curveTo(5.961f, 14.789f, 6.47f, 15f, 7f, 15f)
                horizontalLineTo(17f)
                curveTo(17.53f, 15f, 18.039f, 14.789f, 18.414f, 14.414f)
                curveTo(18.789f, 14.039f, 19f, 13.53f, 19f, 13f)
                verticalLineTo(12.828f)
                curveTo(19f, 12.566f, 18.948f, 12.306f, 18.848f, 12.063f)
                curveTo(18.747f, 11.82f, 18.6f, 11.6f, 18.414f, 11.414f)
                lineTo(16.586f, 9.586f)
                curveTo(16.4f, 9.4f, 16.18f, 9.253f, 15.937f, 9.152f)
                curveTo(15.694f, 9.052f, 15.434f, 9f, 15.172f, 9f)
                close()
            }
        }.build()

        return _PortMicroUsb!!
    }

@Suppress("ObjectPropertyName")
private var _PortMicroUsb: ImageVector? = null

@Preview
@Composable
private fun PortMicroUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PortMicroUsb, contentDescription = null)
    }
}
