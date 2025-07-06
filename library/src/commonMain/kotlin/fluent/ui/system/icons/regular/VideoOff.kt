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
 * VideoOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoOff icon.
 */
public val FluentIcons.Regular.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = Builder(name = "VideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4.135f, 5.196f)
                curveTo(2.889f, 5.651f, 2.0f, 6.847f, 2.0f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.545f, 3.455f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(12.75f)
                curveTo(14.153f, 19.0f, 15.349f, 18.111f, 15.804f, 16.865f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(14.5f, 15.561f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.716f, 13.717f, 17.5f, 12.75f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(3.5f, 7.284f, 4.284f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(5.439f)
                lineTo(14.5f, 15.561f)
                close()
                moveTo(14.5f, 8.25f)
                verticalLineTo(11.318f)
                lineTo(16.0f, 12.818f)
                verticalLineTo(10.384f)
                lineTo(20.11f, 7.546f)
                curveTo(20.276f, 7.432f, 20.502f, 7.551f, 20.502f, 7.752f)
                verticalLineTo(16.247f)
                curveTo(20.502f, 16.449f, 20.276f, 16.567f, 20.11f, 16.453f)
                lineTo(18.575f, 15.393f)
                lineTo(21.007f, 17.826f)
                curveTo(21.578f, 17.552f, 22.002f, 16.977f, 22.002f, 16.247f)
                verticalLineTo(7.752f)
                curveTo(22.002f, 6.341f, 20.418f, 5.51f, 19.257f, 6.312f)
                lineTo(16.0f, 8.561f)
                verticalLineTo(8.25f)
                curveTo(16.0f, 6.455f, 14.545f, 5.0f, 12.75f, 5.0f)
                horizontalLineTo(8.182f)
                lineTo(9.682f, 6.5f)
                horizontalLineTo(12.75f)
                curveTo(13.717f, 6.5f, 14.5f, 7.284f, 14.5f, 8.25f)
                close()
            }
        }
        .build()
        return _videoOff!!
    }

@Suppress("ObjectPropertyName")
private var _videoOff: ImageVector? = null

@Preview
@Composable
private fun VideoOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoOff, contentDescription = "VideoOff Icon")
    }
}

