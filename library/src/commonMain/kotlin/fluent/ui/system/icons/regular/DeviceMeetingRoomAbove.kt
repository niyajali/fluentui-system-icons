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
 * DeviceMeetingRoomAbove Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent meeting room devices in office.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_device_meeting_room_microphone_above_20_regular.svg)
 * 
 * @return The [ImageVector] for the DeviceMeetingRoomAbove icon.
 */
public val FluentIcons.Regular.DeviceMeetingRoomAbove: ImageVector
    get() {
        if (_deviceMeetingRoomAbove != null) {
            return _deviceMeetingRoomAbove!!
        }
        _deviceMeetingRoomAbove = Builder(name = "DeviceMeetingRoomAbove", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.111f, 17.111f)
                curveTo(8.259f, 14.964f, 11.742f, 14.964f, 13.89f, 17.111f)
                curveTo(14.085f, 17.306f, 14.085f, 17.623f, 13.89f, 17.818f)
                curveTo(13.694f, 18.014f, 13.378f, 18.014f, 13.183f, 17.818f)
                curveTo(11.425f, 16.061f, 8.576f, 16.061f, 6.818f, 17.818f)
                curveTo(6.623f, 18.014f, 6.307f, 18.014f, 6.111f, 17.818f)
                curveTo(5.916f, 17.623f, 5.916f, 17.307f, 6.111f, 17.111f)
                close()
                moveTo(4.342f, 15.343f)
                curveTo(7.466f, 12.219f, 12.531f, 12.219f, 15.655f, 15.343f)
                curveTo(15.851f, 15.538f, 15.851f, 15.854f, 15.655f, 16.05f)
                curveTo(15.46f, 16.245f, 15.144f, 16.245f, 14.948f, 16.05f)
                curveTo(12.215f, 13.316f, 7.782f, 13.316f, 5.049f, 16.05f)
                curveTo(4.854f, 16.245f, 4.537f, 16.245f, 4.342f, 16.05f)
                curveTo(4.147f, 15.854f, 4.147f, 15.538f, 4.342f, 15.343f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(11.84f, 2.0f, 13.529f, 2.286f, 14.775f, 2.766f)
                curveTo(15.397f, 3.005f, 15.934f, 3.302f, 16.325f, 3.657f)
                curveTo(16.667f, 3.968f, 16.928f, 4.354f, 16.987f, 4.804f)
                lineTo(17.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 8.535f, 16.716f, 8.987f, 16.325f, 9.343f)
                curveTo(15.934f, 9.698f, 15.397f, 9.995f, 14.775f, 10.234f)
                curveTo(13.529f, 10.714f, 11.84f, 11.0f, 10.0f, 11.0f)
                curveTo(8.16f, 11.0f, 6.471f, 10.714f, 5.225f, 10.234f)
                curveTo(4.603f, 9.995f, 4.065f, 9.698f, 3.675f, 9.343f)
                curveTo(3.284f, 8.987f, 3.0f, 8.535f, 3.0f, 8.0f)
                verticalLineTo(5.0f)
                lineTo(3.013f, 4.804f)
                curveTo(3.072f, 4.354f, 3.333f, 3.968f, 3.675f, 3.657f)
                curveTo(4.065f, 3.302f, 4.603f, 3.005f, 5.225f, 2.766f)
                curveTo(6.471f, 2.286f, 8.16f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(8.25f, 6.0f, 6.689f, 6.274f, 5.583f, 6.699f)
                curveTo(5.029f, 6.912f, 4.615f, 7.154f, 4.348f, 7.396f)
                curveTo(4.081f, 7.639f, 4.0f, 7.844f, 4.0f, 8.0f)
                curveTo(4.0f, 8.156f, 4.081f, 8.361f, 4.348f, 8.604f)
                curveTo(4.615f, 8.846f, 5.029f, 9.088f, 5.583f, 9.301f)
                curveTo(6.689f, 9.726f, 8.25f, 10.0f, 10.0f, 10.0f)
                curveTo(11.75f, 10.0f, 13.311f, 9.726f, 14.417f, 9.301f)
                curveTo(14.971f, 9.088f, 15.385f, 8.846f, 15.652f, 8.604f)
                curveTo(15.919f, 8.361f, 16.0f, 8.156f, 16.0f, 8.0f)
                curveTo(16.0f, 7.844f, 15.919f, 7.639f, 15.652f, 7.396f)
                curveTo(15.385f, 7.154f, 14.971f, 6.912f, 14.417f, 6.699f)
                curveTo(13.311f, 6.274f, 11.75f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(10.0f, 3.0f)
                curveTo(8.25f, 3.0f, 6.689f, 3.274f, 5.583f, 3.699f)
                curveTo(5.029f, 3.912f, 4.615f, 4.154f, 4.348f, 4.396f)
                curveTo(4.114f, 4.609f, 4.023f, 4.793f, 4.004f, 4.939f)
                lineTo(4.0f, 6.397f)
                curveTo(4.344f, 6.155f, 4.761f, 5.944f, 5.225f, 5.766f)
                curveTo(6.471f, 5.286f, 8.16f, 5.0f, 10.0f, 5.0f)
                curveTo(11.84f, 5.0f, 13.529f, 5.286f, 14.775f, 5.766f)
                curveTo(15.239f, 5.944f, 15.656f, 6.155f, 16.0f, 6.397f)
                lineTo(15.996f, 4.939f)
                curveTo(15.977f, 4.793f, 15.886f, 4.609f, 15.652f, 4.396f)
                curveTo(15.385f, 4.154f, 14.971f, 3.912f, 14.417f, 3.699f)
                curveTo(13.311f, 3.274f, 11.75f, 3.0f, 10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _deviceMeetingRoomAbove!!
    }

@Suppress("ObjectPropertyName")
private var _deviceMeetingRoomAbove: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeviceMeetingRoomAbove, contentDescription = "DeviceMeetingRoomAbove Icon")
    }
}

