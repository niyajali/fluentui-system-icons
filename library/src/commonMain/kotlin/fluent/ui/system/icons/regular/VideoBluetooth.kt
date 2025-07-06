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
 * VideoBluetooth Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_bluetooth_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoBluetooth icon.
 */
public val FluentIcons.Regular.VideoBluetooth: ImageVector
    get() {
        if (_videoBluetooth != null) {
            return _videoBluetooth!!
        }
        _videoBluetooth = Builder(name = "VideoBluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 4.0f)
                curveTo(4.455f, 4.0f, 3.0f, 5.455f, 3.0f, 7.25f)
                verticalLineTo(8.017f)
                curveTo(3.546f, 7.94f, 4.106f, 8.124f, 4.5f, 8.529f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 6.284f, 5.284f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 5.5f, 15.5f, 6.284f, 15.5f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(15.5f, 15.717f, 14.717f, 16.5f, 13.75f, 16.5f)
                horizontalLineTo(7.927f)
                curveTo(7.965f, 16.628f, 7.989f, 16.76f, 7.997f, 16.895f)
                curveTo(8.021f, 17.29f, 7.91f, 17.679f, 7.686f, 18.0f)
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
                moveTo(3.797f, 9.241f)
                curveTo(3.587f, 9.014f, 3.26f, 8.939f, 2.973f, 9.052f)
                curveTo(2.685f, 9.164f, 2.496f, 9.441f, 2.496f, 9.75f)
                verticalLineTo(12.825f)
                lineTo(1.736f, 12.179f)
                curveTo(1.42f, 11.91f, 0.947f, 11.949f, 0.679f, 12.264f)
                curveTo(0.41f, 12.58f, 0.449f, 13.053f, 0.764f, 13.321f)
                lineTo(2.496f, 14.793f)
                verticalLineTo(15.207f)
                lineTo(0.764f, 16.678f)
                curveTo(0.449f, 16.947f, 0.41f, 17.42f, 0.679f, 17.736f)
                curveTo(0.947f, 18.051f, 1.42f, 18.09f, 1.736f, 17.822f)
                lineTo(2.496f, 17.175f)
                verticalLineTo(20.25f)
                curveTo(2.496f, 20.559f, 2.685f, 20.836f, 2.973f, 20.948f)
                curveTo(3.26f, 21.061f, 3.587f, 20.986f, 3.797f, 20.759f)
                lineTo(6.801f, 17.509f)
                curveTo(6.939f, 17.359f, 7.011f, 17.159f, 6.999f, 16.955f)
                curveTo(6.986f, 16.751f, 6.891f, 16.561f, 6.736f, 16.428f)
                lineTo(5.055f, 15.0f)
                lineTo(6.736f, 13.571f)
                curveTo(6.891f, 13.439f, 6.986f, 13.249f, 6.999f, 13.045f)
                curveTo(7.011f, 12.841f, 6.939f, 12.641f, 6.801f, 12.491f)
                lineTo(3.797f, 9.241f)
                close()
                moveTo(5.169f, 17.065f)
                lineTo(3.996f, 18.334f)
                verticalLineTo(16.069f)
                lineTo(5.169f, 17.065f)
                close()
                moveTo(3.996f, 11.666f)
                lineTo(5.169f, 12.935f)
                lineTo(3.996f, 13.932f)
                verticalLineTo(11.666f)
                close()
            }
        }
        .build()
        return _videoBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _videoBluetooth: ImageVector? = null

@Preview
@Composable
private fun VideoBluetoothPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoBluetooth, contentDescription = "VideoBluetooth Icon")
    }
}

