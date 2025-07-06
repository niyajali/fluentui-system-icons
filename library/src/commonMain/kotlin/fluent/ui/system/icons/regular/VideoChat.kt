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
 * VideoChat Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_chat_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoChat icon.
 */
public val FluentIcons.Regular.VideoChat: ImageVector
    get() {
        if (_videoChat != null) {
            return _videoChat!!
        }
        _videoChat = Builder(name = "VideoChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 5.0f)
                curveTo(3.455f, 5.0f, 2.0f, 6.455f, 2.0f, 8.25f)
                verticalLineTo(11.811f)
                curveTo(2.444f, 11.384f, 2.949f, 11.02f, 3.5f, 10.733f)
                verticalLineTo(8.25f)
                curveTo(3.5f, 7.284f, 4.284f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(12.75f)
                curveTo(13.717f, 6.5f, 14.5f, 7.284f, 14.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.656f, 13.811f, 17.402f, 12.928f, 17.491f)
                curveTo(12.848f, 18.017f, 12.704f, 18.523f, 12.505f, 19.0f)
                horizontalLineTo(12.75f)
                curveTo(14.545f, 19.0f, 16.0f, 17.545f, 16.0f, 15.75f)
                verticalLineTo(15.438f)
                lineTo(19.257f, 17.687f)
                curveTo(20.418f, 18.489f, 22.002f, 17.658f, 22.002f, 16.247f)
                verticalLineTo(7.752f)
                curveTo(22.002f, 6.341f, 20.418f, 5.51f, 19.257f, 6.312f)
                lineTo(16.0f, 8.561f)
                verticalLineTo(8.25f)
                curveTo(16.0f, 6.455f, 14.545f, 5.0f, 12.75f, 5.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(16.0f, 10.384f)
                lineTo(20.11f, 7.546f)
                curveTo(20.276f, 7.432f, 20.502f, 7.551f, 20.502f, 7.752f)
                verticalLineTo(16.247f)
                curveTo(20.502f, 16.449f, 20.276f, 16.567f, 20.11f, 16.453f)
                lineTo(16.0f, 13.615f)
                verticalLineTo(10.384f)
                close()
                moveTo(6.501f, 22.002f)
                curveTo(9.539f, 22.002f, 12.002f, 19.539f, 12.002f, 16.501f)
                curveTo(12.002f, 13.463f, 9.539f, 11.0f, 6.501f, 11.0f)
                curveTo(3.463f, 11.0f, 1.0f, 13.463f, 1.0f, 16.501f)
                curveTo(1.0f, 17.469f, 1.25f, 18.379f, 1.689f, 19.169f)
                lineTo(1.023f, 21.355f)
                curveTo(0.907f, 21.738f, 1.264f, 22.096f, 1.647f, 21.979f)
                lineTo(3.834f, 21.314f)
                curveTo(4.624f, 21.753f, 5.533f, 22.002f, 6.501f, 22.002f)
                close()
                moveTo(4.501f, 16.001f)
                curveTo(4.225f, 16.001f, 4.001f, 15.777f, 4.001f, 15.501f)
                curveTo(4.001f, 15.225f, 4.225f, 15.001f, 4.501f, 15.001f)
                horizontalLineTo(8.502f)
                curveTo(8.778f, 15.001f, 9.002f, 15.225f, 9.002f, 15.501f)
                curveTo(9.002f, 15.777f, 8.778f, 16.001f, 8.502f, 16.001f)
                horizontalLineTo(4.501f)
                close()
                moveTo(6.501f, 18.001f)
                horizontalLineTo(4.501f)
                curveTo(4.225f, 18.001f, 4.001f, 17.778f, 4.001f, 17.501f)
                curveTo(4.001f, 17.225f, 4.225f, 17.001f, 4.501f, 17.001f)
                horizontalLineTo(6.501f)
                curveTo(6.777f, 17.001f, 7.001f, 17.225f, 7.001f, 17.501f)
                curveTo(7.001f, 17.778f, 6.777f, 18.001f, 6.501f, 18.001f)
                close()
            }
        }
        .build()
        return _videoChat!!
    }

@Suppress("ObjectPropertyName")
private var _videoChat: ImageVector? = null

@Preview
@Composable
private fun VideoChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoChat, contentDescription = "VideoChat Icon")
    }
}

