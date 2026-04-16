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
 * DeviceMeetingRoomBelow Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent meeting room devices in office.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_device_meeting_room_microphone_below_20_regular.svg)
 * 
 * @return The [ImageVector] for the DeviceMeetingRoomBelow icon.
 */
public val FluentIcons.Regular.DeviceMeetingRoomBelow: ImageVector
    get() {
        if (_deviceMeetingRoomBelow != null) {
            return _deviceMeetingRoomBelow!!
        }
        _deviceMeetingRoomBelow = Builder(name = "DeviceMeetingRoomBelow", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                curveTo(11.84f, 9.0f, 13.529f, 9.286f, 14.775f, 9.766f)
                curveTo(15.397f, 10.005f, 15.934f, 10.302f, 16.325f, 10.657f)
                curveTo(16.716f, 11.013f, 17.0f, 11.465f, 17.0f, 12.0f)
                verticalLineTo(15.0f)
                lineTo(16.987f, 15.196f)
                curveTo(16.928f, 15.646f, 16.667f, 16.032f, 16.325f, 16.343f)
                curveTo(15.934f, 16.698f, 15.397f, 16.995f, 14.775f, 17.234f)
                curveTo(13.529f, 17.714f, 11.84f, 18.0f, 10.0f, 18.0f)
                curveTo(8.16f, 18.0f, 6.471f, 17.714f, 5.225f, 17.234f)
                curveTo(4.603f, 16.995f, 4.065f, 16.698f, 3.675f, 16.343f)
                curveTo(3.333f, 16.032f, 3.072f, 15.646f, 3.013f, 15.196f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 11.465f, 3.284f, 11.013f, 3.675f, 10.657f)
                curveTo(4.065f, 10.302f, 4.603f, 10.005f, 5.225f, 9.766f)
                curveTo(6.471f, 9.286f, 8.16f, 9.0f, 10.0f, 9.0f)
                close()
                moveTo(16.0f, 13.603f)
                curveTo(15.656f, 13.845f, 15.239f, 14.056f, 14.775f, 14.234f)
                curveTo(13.529f, 14.714f, 11.84f, 15.0f, 10.0f, 15.0f)
                curveTo(8.16f, 15.0f, 6.471f, 14.714f, 5.225f, 14.234f)
                curveTo(4.761f, 14.056f, 4.344f, 13.845f, 4.0f, 13.603f)
                lineTo(4.004f, 15.061f)
                curveTo(4.023f, 15.208f, 4.114f, 15.391f, 4.348f, 15.604f)
                curveTo(4.615f, 15.846f, 5.029f, 16.088f, 5.583f, 16.301f)
                curveTo(6.689f, 16.726f, 8.25f, 17.0f, 10.0f, 17.0f)
                curveTo(11.75f, 17.0f, 13.311f, 16.726f, 14.417f, 16.301f)
                curveTo(14.971f, 16.088f, 15.385f, 15.846f, 15.652f, 15.604f)
                curveTo(15.886f, 15.391f, 15.977f, 15.208f, 15.996f, 15.061f)
                lineTo(16.0f, 13.603f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(8.25f, 10.0f, 6.689f, 10.274f, 5.583f, 10.699f)
                curveTo(5.029f, 10.912f, 4.615f, 11.154f, 4.348f, 11.396f)
                curveTo(4.081f, 11.639f, 4.0f, 11.844f, 4.0f, 12.0f)
                curveTo(4.0f, 12.156f, 4.081f, 12.361f, 4.348f, 12.604f)
                curveTo(4.615f, 12.846f, 5.029f, 13.088f, 5.583f, 13.301f)
                curveTo(6.689f, 13.726f, 8.25f, 14.0f, 10.0f, 14.0f)
                curveTo(11.75f, 14.0f, 13.311f, 13.726f, 14.417f, 13.301f)
                curveTo(14.971f, 13.088f, 15.385f, 12.846f, 15.652f, 12.604f)
                curveTo(15.919f, 12.361f, 16.0f, 12.156f, 16.0f, 12.0f)
                curveTo(16.0f, 11.844f, 15.919f, 11.639f, 15.652f, 11.396f)
                curveTo(15.385f, 11.154f, 14.971f, 10.912f, 14.417f, 10.699f)
                curveTo(13.311f, 10.274f, 11.75f, 10.0f, 10.0f, 10.0f)
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
        Image(imageVector = FluentIcons.Regular.DeviceMeetingRoomBelow, contentDescription = "DeviceMeetingRoomBelow Icon")
    }
}

