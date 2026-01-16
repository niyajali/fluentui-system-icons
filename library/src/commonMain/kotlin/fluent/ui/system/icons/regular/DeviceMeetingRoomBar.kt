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
 * DeviceMeetingRoomBar Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent meeting room devices in office.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_device_meeting_room_bar_24_regular.svg)
 * 
 * @return The [ImageVector] for the DeviceMeetingRoomBar icon.
 */
public val FluentIcons.Regular.DeviceMeetingRoomBar: ImageVector
    get() {
        if (_deviceMeetingRoomBar != null) {
            return _deviceMeetingRoomBar!!
        }
        _deviceMeetingRoomBar = Builder(name = "DeviceMeetingRoomBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.251f, 17.5f)
                curveTo(15.665f, 17.5f, 16.001f, 17.836f, 16.001f, 18.25f)
                curveTo(16.001f, 18.664f, 15.665f, 19.0f, 15.251f, 19.0f)
                horizontalLineTo(8.754f)
                curveTo(8.34f, 19.0f, 8.004f, 18.664f, 8.004f, 18.25f)
                curveTo(8.004f, 17.836f, 8.34f, 17.5f, 8.754f, 17.5f)
                horizontalLineTo(15.251f)
                close()
                moveTo(18.751f, 5.0f)
                curveTo(20.546f, 5.0f, 22.001f, 6.455f, 22.001f, 8.25f)
                verticalLineTo(12.75f)
                curveTo(22.001f, 14.545f, 20.546f, 16.0f, 18.751f, 16.0f)
                horizontalLineTo(5.254f)
                curveTo(3.459f, 16.0f, 2.004f, 14.545f, 2.004f, 12.75f)
                verticalLineTo(8.25f)
                curveTo(2.004f, 6.455f, 3.459f, 5.0f, 5.254f, 5.0f)
                horizontalLineTo(18.751f)
                close()
                moveTo(5.254f, 6.5f)
                curveTo(4.287f, 6.5f, 3.504f, 7.284f, 3.504f, 8.25f)
                verticalLineTo(12.75f)
                curveTo(3.504f, 13.717f, 4.287f, 14.5f, 5.254f, 14.5f)
                horizontalLineTo(18.751f)
                curveTo(19.717f, 14.5f, 20.501f, 13.716f, 20.501f, 12.75f)
                verticalLineTo(8.25f)
                curveTo(20.501f, 7.284f, 19.717f, 6.5f, 18.751f, 6.5f)
                horizontalLineTo(5.254f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(13.657f, 7.5f, 15.0f, 8.843f, 15.0f, 10.5f)
                curveTo(15.0f, 12.157f, 13.657f, 13.5f, 12.0f, 13.5f)
                curveTo(10.343f, 13.5f, 9.0f, 12.157f, 9.0f, 10.5f)
                curveTo(9.0f, 8.843f, 10.343f, 7.5f, 12.0f, 7.5f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.172f, 9.0f, 10.5f, 9.672f, 10.5f, 10.5f)
                curveTo(10.5f, 11.328f, 11.172f, 12.0f, 12.0f, 12.0f)
                curveTo(12.828f, 12.0f, 13.5f, 11.328f, 13.5f, 10.5f)
                curveTo(13.5f, 9.672f, 12.828f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(6.5f, 9.5f)
                curveTo(7.052f, 9.5f, 7.5f, 9.948f, 7.5f, 10.5f)
                curveTo(7.5f, 11.052f, 7.052f, 11.5f, 6.5f, 11.5f)
                curveTo(5.948f, 11.5f, 5.5f, 11.052f, 5.5f, 10.5f)
                curveTo(5.5f, 9.948f, 5.948f, 9.5f, 6.5f, 9.5f)
                close()
            }
        }
        .build()
        return _deviceMeetingRoomBar!!
    }

@Suppress("ObjectPropertyName")
private var _deviceMeetingRoomBar: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeviceMeetingRoomBar, contentDescription = "DeviceMeetingRoomBar Icon")
    }
}

