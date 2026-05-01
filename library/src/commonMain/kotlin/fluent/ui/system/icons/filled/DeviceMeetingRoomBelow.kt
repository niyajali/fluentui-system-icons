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
 * DeviceMeetingRoomBelow Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent meeting room devices in office.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_device_meeting_room_microphone_below_20_filled.svg)
 * 
 * @return The [ImageVector] for the DeviceMeetingRoomBelow icon.
 */
public val FluentIcons.Filled.DeviceMeetingRoomBelow: ImageVector
    get() {
        if (_deviceMeetingRoomBelow != null) {
            return _deviceMeetingRoomBelow!!
        }
        _deviceMeetingRoomBelow = Builder(name = "DeviceMeetingRoomBelow", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                curveTo(17.0f, 15.535f, 16.716f, 15.987f, 16.325f, 16.343f)
                curveTo(15.934f, 16.698f, 15.397f, 16.995f, 14.775f, 17.234f)
                curveTo(13.529f, 17.714f, 11.84f, 18.0f, 10.0f, 18.0f)
                curveTo(8.16f, 18.0f, 6.471f, 17.714f, 5.225f, 17.234f)
                curveTo(4.603f, 16.995f, 4.065f, 16.698f, 3.675f, 16.343f)
                curveTo(3.284f, 15.987f, 3.0f, 15.535f, 3.0f, 15.0f)
                verticalLineTo(13.975f)
                curveTo(3.412f, 14.345f, 3.923f, 14.665f, 4.485f, 14.928f)
                curveTo(5.923f, 15.598f, 7.873f, 16.0f, 10.0f, 16.0f)
                curveTo(12.127f, 16.0f, 14.078f, 15.598f, 15.515f, 14.928f)
                curveTo(16.077f, 14.665f, 16.588f, 14.345f, 17.0f, 13.975f)
                verticalLineTo(15.0f)
                close()
                moveTo(15.092f, 9.979f)
                curveTo(16.32f, 10.552f, 16.916f, 11.241f, 16.991f, 11.864f)
                curveTo(16.995f, 11.909f, 17.0f, 11.954f, 17.0f, 12.0f)
                curveTo(17.0f, 12.657f, 16.41f, 13.406f, 15.092f, 14.021f)
                curveTo(13.814f, 14.618f, 12.015f, 15.0f, 10.0f, 15.0f)
                curveTo(7.985f, 15.0f, 6.185f, 14.618f, 4.908f, 14.021f)
                curveTo(3.59f, 13.406f, 3.0f, 12.657f, 3.0f, 12.0f)
                curveTo(3.0f, 11.954f, 3.004f, 11.909f, 3.008f, 11.864f)
                curveTo(3.083f, 11.241f, 3.68f, 10.552f, 4.908f, 9.979f)
                curveTo(6.186f, 9.382f, 7.99f, 9.0f, 10.0f, 9.0f)
                curveTo(12.01f, 9.0f, 13.814f, 9.382f, 15.092f, 9.979f)
                close()
                moveTo(14.948f, 3.95f)
                curveTo(15.144f, 3.755f, 15.46f, 3.755f, 15.655f, 3.95f)
                curveTo(15.851f, 4.145f, 15.851f, 4.462f, 15.655f, 4.657f)
                curveTo(12.531f, 7.781f, 7.466f, 7.781f, 4.342f, 4.657f)
                curveTo(4.147f, 4.462f, 4.147f, 4.145f, 4.342f, 3.95f)
                curveTo(4.537f, 3.755f, 4.854f, 3.755f, 5.049f, 3.95f)
                curveTo(7.782f, 6.684f, 12.215f, 6.684f, 14.948f, 3.95f)
                close()
                moveTo(13.183f, 2.182f)
                curveTo(13.378f, 1.986f, 13.694f, 1.986f, 13.89f, 2.182f)
                curveTo(14.085f, 2.377f, 14.085f, 2.693f, 13.89f, 2.889f)
                curveTo(11.742f, 5.037f, 8.259f, 5.037f, 6.111f, 2.889f)
                curveTo(5.916f, 2.693f, 5.916f, 2.377f, 6.111f, 2.182f)
                curveTo(6.307f, 1.986f, 6.623f, 1.986f, 6.818f, 2.182f)
                curveTo(8.576f, 3.939f, 11.425f, 3.939f, 13.183f, 2.182f)
                close()
            }
        }
        .build()
        return _deviceMeetingRoomBelow!!
    }

@Suppress("ObjectPropertyName")
private var _deviceMeetingRoomBelow: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomBelowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DeviceMeetingRoomBelow, contentDescription = "DeviceMeetingRoomBelow Icon")
    }
}

