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
 * VideoPersonClock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent general video meetings, views & settings in video meetings, meeting time, meeting timer.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_person_clock_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoPersonClock icon.
 */
public val FluentIcons.Regular.VideoPersonClock: ImageVector
    get() {
        if (_videoPersonClock != null) {
            return _videoPersonClock!!
        }
        _videoPersonClock = Builder(name = "VideoPersonClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.995f, 5.25f)
                curveTo(21.995f, 4.007f, 20.988f, 3.0f, 19.745f, 3.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 3.0f, 2.0f, 4.007f, 2.0f, 5.25f)
                verticalLineTo(16.755f)
                curveTo(2.0f, 17.997f, 3.007f, 19.005f, 4.25f, 19.005f)
                horizontalLineTo(11.175f)
                curveTo(11.061f, 18.523f, 11.0f, 18.021f, 11.0f, 17.504f)
                horizontalLineTo(8.499f)
                lineTo(8.5f, 14.75f)
                lineTo(8.507f, 14.693f)
                curveTo(8.533f, 14.582f, 8.632f, 14.5f, 8.75f, 14.5f)
                horizontalLineTo(11.732f)
                curveTo(12.019f, 13.949f, 12.383f, 13.444f, 12.81f, 13.0f)
                horizontalLineTo(8.75f)
                lineTo(8.606f, 13.006f)
                curveTo(7.707f, 13.079f, 7.0f, 13.832f, 7.0f, 14.75f)
                lineTo(6.999f, 17.504f)
                lineTo(4.25f, 17.505f)
                curveTo(3.836f, 17.505f, 3.5f, 17.169f, 3.5f, 16.755f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 4.836f, 3.836f, 4.5f, 4.25f, 4.5f)
                horizontalLineTo(19.745f)
                curveTo(20.16f, 4.5f, 20.495f, 4.836f, 20.495f, 5.25f)
                verticalLineTo(11.73f)
                curveTo(21.046f, 12.016f, 21.551f, 12.38f, 21.995f, 12.805f)
                verticalLineTo(5.25f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.0f, 7.344f, 13.657f, 6.0f, 12.0f, 6.0f)
                curveTo(10.343f, 6.0f, 9.0f, 7.344f, 9.0f, 9.0f)
                curveTo(9.0f, 10.657f, 10.343f, 12.0f, 12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 10.657f, 15.0f, 9.0f)
                close()
                moveTo(10.5f, 9.0f)
                curveTo(10.5f, 8.172f, 11.172f, 7.5f, 12.0f, 7.5f)
                curveTo(12.828f, 7.5f, 13.5f, 8.172f, 13.5f, 9.0f)
                curveTo(13.5f, 9.829f, 12.828f, 10.5f, 12.0f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 9.829f, 10.5f, 9.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(17.776f, 14.0f, 18.0f, 14.224f, 18.0f, 14.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.276f, 17.0f, 20.5f, 17.224f, 20.5f, 17.5f)
                curveTo(20.5f, 17.776f, 20.276f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 18.0f, 17.0f, 17.776f, 17.0f, 17.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 17.224f, 14.0f, 17.5f, 14.0f)
                close()
            }
        }
        .build()
        return _videoPersonClock!!
    }

@Suppress("ObjectPropertyName")
private var _videoPersonClock: ImageVector? = null

@Preview
@Composable
private fun VideoPersonClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPersonClock, contentDescription = "VideoPersonClock Icon")
    }
}

