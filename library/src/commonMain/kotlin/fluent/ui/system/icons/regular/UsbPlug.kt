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
 * UsbPlug Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent physical usb connections in plug form. Minor difference with USB Stick.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_usb_plug_24_regular.svg)
 * 
 * @return The [ImageVector] for the UsbPlug icon.
 */
public val FluentIcons.Regular.UsbPlug: ImageVector
    get() {
        if (_usbPlug != null) {
            return _usbPlug!!
        }
        _usbPlug = Builder(name = "UsbPlug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 21.248f)
                curveTo(11.0f, 21.663f, 10.664f, 21.998f, 10.25f, 21.998f)
                curveTo(9.87f, 21.998f, 9.557f, 21.716f, 9.507f, 21.35f)
                lineTo(9.5f, 21.248f)
                lineTo(9.499f, 16.999f)
                lineTo(8.754f, 17.0f)
                curveTo(7.563f, 17.0f, 6.588f, 16.075f, 6.509f, 14.904f)
                lineTo(6.504f, 14.75f)
                verticalLineTo(9.25f)
                curveTo(6.504f, 8.265f, 7.136f, 7.428f, 8.017f, 7.123f)
                lineTo(8.016f, 2.747f)
                curveTo(8.016f, 2.367f, 8.299f, 2.054f, 8.665f, 2.004f)
                lineTo(8.766f, 1.997f)
                horizontalLineTo(15.267f)
                curveTo(15.647f, 1.997f, 15.961f, 2.279f, 16.01f, 2.645f)
                lineTo(16.017f, 2.747f)
                lineTo(16.018f, 7.133f)
                curveTo(16.833f, 7.427f, 17.43f, 8.179f, 17.498f, 9.079f)
                lineTo(17.504f, 9.25f)
                verticalLineTo(14.75f)
                curveTo(17.504f, 15.941f, 16.579f, 16.915f, 15.408f, 16.995f)
                lineTo(15.254f, 17.0f)
                lineTo(14.499f, 16.999f)
                lineTo(14.5f, 21.245f)
                curveTo(14.5f, 21.66f, 14.164f, 21.995f, 13.75f, 21.995f)
                curveTo(13.37f, 21.995f, 13.057f, 21.713f, 13.007f, 21.347f)
                lineTo(13.0f, 21.245f)
                lineTo(12.999f, 16.999f)
                horizontalLineTo(10.999f)
                lineTo(11.0f, 21.248f)
                close()
                moveTo(15.254f, 8.5f)
                horizontalLineTo(8.754f)
                curveTo(8.374f, 8.5f, 8.061f, 8.782f, 8.011f, 9.148f)
                lineTo(8.004f, 9.25f)
                verticalLineTo(14.75f)
                curveTo(8.004f, 15.13f, 8.286f, 15.443f, 8.652f, 15.493f)
                lineTo(8.754f, 15.5f)
                lineTo(13.75f, 15.497f)
                lineTo(13.793f, 15.499f)
                lineTo(15.254f, 15.5f)
                curveTo(15.634f, 15.5f, 15.948f, 15.218f, 15.997f, 14.852f)
                lineTo(16.004f, 14.75f)
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
        return _usbPlug!!
    }

@Suppress("ObjectPropertyName")
private var _usbPlug: ImageVector? = null

@Preview
@Composable
private fun UsbPlugPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.UsbPlug, contentDescription = "UsbPlug Icon")
    }
}

