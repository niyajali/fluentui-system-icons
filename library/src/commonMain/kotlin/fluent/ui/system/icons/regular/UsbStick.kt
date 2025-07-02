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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * UsbStick icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: usb, stick
 * - Source: ic_fluent_usb_stick_24_regular.svg
 * 
 * @return The [ImageVector] for the UsbStick icon.
 */
public val FluentIcons.Regular.UsbStick: ImageVector
    get() {
        if (_usbStick != null) {
            return _usbStick!!
        }
        _usbStick = Builder(name = "UsbStick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.267f, 1.997f)
                curveTo(15.647f, 1.997f, 15.961f, 2.279f, 16.01f, 2.645f)
                lineTo(16.017f, 2.747f)
                lineTo(16.018f, 7.133f)
                curveTo(16.833f, 7.427f, 17.43f, 8.179f, 17.498f, 9.079f)
                lineTo(17.504f, 9.25f)
                verticalLineTo(19.75f)
                curveTo(17.504f, 20.941f, 16.579f, 21.915f, 15.408f, 21.995f)
                lineTo(15.254f, 22.0f)
                horizontalLineTo(8.754f)
                curveTo(7.563f, 22.0f, 6.589f, 21.075f, 6.509f, 19.904f)
                lineTo(6.504f, 19.75f)
                verticalLineTo(9.25f)
                curveTo(6.504f, 8.265f, 7.136f, 7.428f, 8.017f, 7.123f)
                lineTo(8.016f, 2.747f)
                curveTo(8.016f, 2.367f, 8.299f, 2.054f, 8.665f, 2.004f)
                lineTo(8.766f, 1.997f)
                horizontalLineTo(15.267f)
                close()
                moveTo(15.254f, 8.5f)
                horizontalLineTo(8.754f)
                curveTo(8.374f, 8.5f, 8.061f, 8.782f, 8.011f, 9.148f)
                lineTo(8.004f, 9.25f)
                verticalLineTo(19.75f)
                curveTo(8.004f, 20.129f, 8.286f, 20.443f, 8.652f, 20.493f)
                lineTo(8.754f, 20.5f)
                horizontalLineTo(15.254f)
                curveTo(15.634f, 20.5f, 15.948f, 20.218f, 15.997f, 19.852f)
                lineTo(16.004f, 19.75f)
                verticalLineTo(9.25f)
                curveTo(16.004f, 8.87f, 15.722f, 8.556f, 15.356f, 8.507f)
                lineTo(15.254f, 8.5f)
                close()
                moveTo(14.517f, 3.497f)
                horizontalLineTo(9.516f)
                verticalLineTo(6.999f)
                horizontalLineTo(14.517f)
                verticalLineTo(3.497f)
                close()
            }
        }
        .build()
        return _usbStick!!
    }

@Suppress("ObjectPropertyName")
private var _usbStick: ImageVector? = null

@Preview
@Composable
private fun UsbStickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.UsbStick, contentDescription = null)
    }
}

