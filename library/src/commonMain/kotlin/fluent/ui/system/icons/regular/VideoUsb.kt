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
 * VideoUsb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, usb
 * - Source: ic_fluent_video_usb_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoUsb icon.
 */
public val FluentIcons.Regular.VideoUsb: ImageVector
    get() {
        if (_videoUsb != null) {
            return _videoUsb!!
        }
        _videoUsb = Builder(name = "VideoUsb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 4.0f)
                curveTo(4.455f, 4.0f, 3.0f, 5.455f, 3.0f, 7.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 6.284f, 5.284f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 5.5f, 15.5f, 6.284f, 15.5f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(15.5f, 15.717f, 14.717f, 16.5f, 13.75f, 16.5f)
                horizontalLineTo(8.999f)
                curveTo(8.988f, 16.873f, 8.873f, 17.236f, 8.666f, 17.548f)
                lineTo(8.365f, 18.0f)
                horizontalLineTo(13.75f)
                curveTo(15.545f, 18.0f, 17.0f, 16.545f, 17.0f, 14.75f)
                verticalLineTo(14.438f)
                lineTo(20.257f, 16.687f)
                curveTo(21.418f, 17.489f, 23.002f, 16.658f, 23.002f, 15.247f)
                verticalLineTo(6.752f)
                curveTo(23.002f, 5.341f, 21.418f, 4.51f, 20.257f, 5.312f)
                lineTo(17.0f, 7.561f)
                verticalLineTo(7.25f)
                curveTo(17.0f, 5.455f, 15.545f, 4.0f, 13.75f, 4.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.0f, 9.384f)
                lineTo(21.11f, 6.546f)
                curveTo(21.276f, 6.432f, 21.502f, 6.551f, 21.502f, 6.752f)
                verticalLineTo(15.247f)
                curveTo(21.502f, 15.449f, 21.276f, 15.567f, 21.11f, 15.453f)
                lineTo(17.0f, 12.615f)
                verticalLineTo(9.384f)
                close()
                moveTo(2.5f, 19.0f)
                lineTo(1.163f, 16.955f)
                curveTo(1.057f, 16.792f, 1.0f, 16.602f, 1.0f, 16.408f)
                verticalLineTo(13.0f)
                curveTo(1.0f, 12.448f, 1.448f, 12.0f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 9.448f, 2.448f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(6.552f, 9.0f, 7.0f, 9.448f, 7.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(7.552f, 12.0f, 8.0f, 12.448f, 8.0f, 13.0f)
                verticalLineTo(16.441f)
                curveTo(8.0f, 16.638f, 7.942f, 16.83f, 7.833f, 16.994f)
                lineTo(6.5f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(6.5f, 21.552f, 6.052f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(2.948f, 22.0f, 2.5f, 21.552f, 2.5f, 21.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.5f, 12.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _videoUsb!!
    }

@Suppress("ObjectPropertyName")
private var _videoUsb: ImageVector? = null

@Preview
@Composable
private fun VideoUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoUsb, contentDescription = null)
    }
}

