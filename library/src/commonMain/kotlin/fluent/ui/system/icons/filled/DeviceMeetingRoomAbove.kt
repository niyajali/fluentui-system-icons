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
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent meeting room devices in office.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_device_meeting_room_microphone_above_20_filled.svg)
 * 
 * @return The [ImageVector] for the DeviceMeetingRoomAbove icon.
 */
public val FluentIcons.Filled.DeviceMeetingRoomAbove: ImageVector
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
                moveTo(10.0f, 5.0f)
                curveTo(12.015f, 5.0f, 13.814f, 5.382f, 15.092f, 5.979f)
                curveTo(16.41f, 6.594f, 17.0f, 7.343f, 17.0f, 8.0f)
                curveTo(17.0f, 8.046f, 16.995f, 8.091f, 16.991f, 8.136f)
                curveTo(16.916f, 8.759f, 16.32f, 9.448f, 15.092f, 10.021f)
                curveTo(13.814f, 10.618f, 12.01f, 11.0f, 10.0f, 11.0f)
                curveTo(7.99f, 11.0f, 6.186f, 10.618f, 4.908f, 10.021f)
                curveTo(3.68f, 9.448f, 3.083f, 8.759f, 3.008f, 8.136f)
                curveTo(3.004f, 8.091f, 3.0f, 8.046f, 3.0f, 8.0f)
                curveTo(3.0f, 7.343f, 3.59f, 6.594f, 4.908f, 5.979f)
                curveTo(6.185f, 5.382f, 7.985f, 5.0f, 10.0f, 5.0f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(11.84f, 2.0f, 13.529f, 2.286f, 14.775f, 2.766f)
                curveTo(15.397f, 3.005f, 15.934f, 3.302f, 16.325f, 3.657f)
                curveTo(16.716f, 4.013f, 17.0f, 4.466f, 17.0f, 5.0f)
                verticalLineTo(6.025f)
                curveTo(16.588f, 5.655f, 16.077f, 5.335f, 15.515f, 5.072f)
                curveTo(14.078f, 4.402f, 12.127f, 4.0f, 10.0f, 4.0f)
                curveTo(7.873f, 4.0f, 5.923f, 4.402f, 4.485f, 5.072f)
                curveTo(3.923f, 5.335f, 3.412f, 5.655f, 3.0f, 6.025f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.466f, 3.284f, 4.013f, 3.675f, 3.657f)
                curveTo(4.065f, 3.302f, 4.603f, 3.005f, 5.225f, 2.766f)
                curveTo(6.471f, 2.286f, 8.16f, 2.0f, 10.0f, 2.0f)
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
        Image(imageVector = FluentIcons.Filled.DeviceMeetingRoomAbove, contentDescription = "DeviceMeetingRoomAbove Icon")
    }
}

