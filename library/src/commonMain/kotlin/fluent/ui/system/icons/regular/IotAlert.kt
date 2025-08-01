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
 * IoTAlert Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent devices with sensors, software, and other technology that shares data with other devices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_iot_alert_24_regular.svg)
 * 
 * @return The [ImageVector] for the IoTAlert icon.
 */
public val FluentIcons.Regular.IoTAlert: ImageVector
    get() {
        if (_ioTAlert != null) {
            return _ioTAlert!!
        }
        _ioTAlert = Builder(name = "IoTAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.491f)
                curveTo(19.0f, 5.872f, 17.881f, 6.991f, 16.5f, 6.991f)
                curveTo(16.325f, 6.991f, 16.153f, 6.973f, 15.988f, 6.939f)
                lineTo(14.708f, 9.056f)
                curveTo(15.033f, 9.355f, 15.307f, 9.706f, 15.519f, 10.096f)
                curveTo(15.009f, 10.198f, 14.527f, 10.377f, 14.086f, 10.621f)
                curveTo(13.638f, 9.945f, 12.871f, 9.5f, 12.0f, 9.5f)
                curveTo(10.619f, 9.5f, 9.5f, 10.619f, 9.5f, 12.0f)
                curveTo(9.5f, 13.22f, 10.374f, 14.236f, 11.53f, 14.456f)
                curveTo(11.511f, 14.635f, 11.501f, 14.816f, 11.501f, 15.0f)
                lineTo(11.501f, 15.969f)
                curveTo(10.386f, 15.83f, 9.414f, 15.233f, 8.779f, 14.373f)
                lineTo(6.985f, 15.22f)
                curveTo(6.995f, 15.312f, 7.0f, 15.406f, 7.0f, 15.5f)
                curveTo(7.0f, 16.881f, 5.881f, 18.0f, 4.5f, 18.0f)
                curveTo(3.119f, 18.0f, 2.0f, 16.881f, 2.0f, 15.5f)
                curveTo(2.0f, 14.119f, 3.119f, 13.0f, 4.5f, 13.0f)
                curveTo(5.248f, 13.0f, 5.919f, 13.328f, 6.377f, 13.849f)
                lineTo(8.131f, 13.02f)
                curveTo(8.046f, 12.694f, 8.0f, 12.352f, 8.0f, 12.0f)
                curveTo(8.0f, 11.032f, 8.344f, 10.145f, 8.915f, 9.453f)
                lineTo(7.924f, 8.324f)
                curveTo(7.638f, 8.438f, 7.326f, 8.5f, 7.0f, 8.5f)
                curveTo(5.619f, 8.5f, 4.5f, 7.381f, 4.5f, 6.0f)
                curveTo(4.5f, 4.619f, 5.619f, 3.5f, 7.0f, 3.5f)
                curveTo(8.381f, 3.5f, 9.5f, 4.619f, 9.5f, 6.0f)
                curveTo(9.5f, 6.508f, 9.348f, 6.981f, 9.088f, 7.376f)
                lineTo(10.07f, 8.495f)
                curveTo(10.643f, 8.18f, 11.3f, 8.0f, 12.0f, 8.0f)
                curveTo(12.505f, 8.0f, 12.989f, 8.094f, 13.434f, 8.265f)
                lineTo(14.679f, 6.205f)
                curveTo(14.258f, 5.757f, 14.0f, 5.154f, 14.0f, 4.491f)
                curveTo(14.0f, 3.111f, 15.119f, 1.991f, 16.5f, 1.991f)
                curveTo(17.881f, 1.991f, 19.0f, 3.111f, 19.0f, 4.491f)
                close()
                moveTo(17.5f, 4.491f)
                curveTo(17.5f, 3.939f, 17.052f, 3.491f, 16.5f, 3.491f)
                curveTo(15.948f, 3.491f, 15.5f, 3.939f, 15.5f, 4.491f)
                curveTo(15.5f, 5.044f, 15.948f, 5.491f, 16.5f, 5.491f)
                curveTo(17.052f, 5.491f, 17.5f, 5.044f, 17.5f, 4.491f)
                close()
                moveTo(7.0f, 7.0f)
                curveTo(7.552f, 7.0f, 8.0f, 6.552f, 8.0f, 6.0f)
                curveTo(8.0f, 5.448f, 7.552f, 5.0f, 7.0f, 5.0f)
                curveTo(6.448f, 5.0f, 6.0f, 5.448f, 6.0f, 6.0f)
                curveTo(6.0f, 6.552f, 6.448f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(5.5f, 15.5f)
                curveTo(5.5f, 14.948f, 5.052f, 14.5f, 4.5f, 14.5f)
                curveTo(3.948f, 14.5f, 3.5f, 14.948f, 3.5f, 15.5f)
                curveTo(3.5f, 16.052f, 3.948f, 16.5f, 4.5f, 16.5f)
                curveTo(5.052f, 16.5f, 5.5f, 16.052f, 5.5f, 15.5f)
                close()
                moveTo(16.503f, 11.0f)
                curveTo(14.293f, 11.0f, 12.502f, 12.791f, 12.502f, 15.0f)
                lineTo(12.502f, 18.0f)
                lineTo(11.554f, 18.8f)
                curveTo(11.246f, 19.06f, 11.092f, 19.19f, 11.046f, 19.291f)
                curveTo(10.931f, 19.541f, 11.039f, 19.836f, 11.288f, 19.952f)
                curveTo(11.389f, 20.0f, 11.59f, 20.0f, 11.993f, 20.0f)
                horizontalLineTo(21.012f)
                curveTo(21.415f, 20.0f, 21.616f, 20.0f, 21.717f, 19.952f)
                curveTo(21.966f, 19.836f, 22.073f, 19.541f, 21.959f, 19.291f)
                curveTo(21.912f, 19.19f, 21.758f, 19.06f, 21.451f, 18.8f)
                lineTo(20.503f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(20.503f, 12.791f, 18.712f, 11.0f, 16.503f, 11.0f)
                close()
                moveTo(18.003f, 21.0f)
                curveTo(17.784f, 21.583f, 17.195f, 22.0f, 16.503f, 22.0f)
                curveTo(15.81f, 22.0f, 15.221f, 21.583f, 15.002f, 21.0f)
                horizontalLineTo(18.003f)
                close()
            }
        }
        .build()
        return _ioTAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ioTAlert: ImageVector? = null

@Preview
@Composable
private fun IoTAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.IoTAlert, contentDescription = "IoTAlert Icon")
    }
}

