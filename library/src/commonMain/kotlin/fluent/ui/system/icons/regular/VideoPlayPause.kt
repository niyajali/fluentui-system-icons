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
 * VideoPlayPause Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in playback controls. Collection includes Fastforward, Rewind, Previous, Next, Stop, Pause.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_play_pause_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoPlayPause icon.
 */
public val FluentIcons.Regular.VideoPlayPause: ImageVector
    get() {
        if (_videoPlayPause != null) {
            return _videoPlayPause!!
        }
        _videoPlayPause = Builder(name = "VideoPlayPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.75f)
                curveTo(12.0f, 6.784f, 12.783f, 6.0f, 13.75f, 6.0f)
                horizontalLineTo(15.25f)
                curveTo(16.216f, 6.0f, 17.0f, 6.784f, 17.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 17.216f, 16.216f, 18.0f, 15.25f, 18.0f)
                horizontalLineTo(13.75f)
                curveTo(12.783f, 18.0f, 12.0f, 17.216f, 12.0f, 16.25f)
                verticalLineTo(12.12f)
                curveTo(11.976f, 12.671f, 11.696f, 13.212f, 11.161f, 13.537f)
                lineTo(4.659f, 17.489f)
                curveTo(3.493f, 18.197f, 2.0f, 17.358f, 2.0f, 15.993f)
                verticalLineTo(8.004f)
                curveTo(2.0f, 6.632f, 3.507f, 5.794f, 4.673f, 6.518f)
                lineTo(11.175f, 10.555f)
                curveTo(11.701f, 10.882f, 11.976f, 11.417f, 12.0f, 11.963f)
                verticalLineTo(7.75f)
                close()
                moveTo(13.75f, 7.5f)
                curveTo(13.612f, 7.5f, 13.5f, 7.612f, 13.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(13.5f, 16.388f, 13.612f, 16.5f, 13.75f, 16.5f)
                horizontalLineTo(15.25f)
                curveTo(15.388f, 16.5f, 15.5f, 16.388f, 15.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 7.612f, 15.388f, 7.5f, 15.25f, 7.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(18.0f, 7.75f)
                curveTo(18.0f, 6.784f, 18.784f, 6.0f, 19.75f, 6.0f)
                horizontalLineTo(21.25f)
                curveTo(22.216f, 6.0f, 23.0f, 6.784f, 23.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(23.0f, 17.216f, 22.216f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(19.75f)
                curveTo(18.784f, 18.0f, 18.0f, 17.216f, 18.0f, 16.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(19.75f, 7.5f)
                curveTo(19.612f, 7.5f, 19.5f, 7.612f, 19.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(19.5f, 16.388f, 19.612f, 16.5f, 19.75f, 16.5f)
                horizontalLineTo(21.25f)
                curveTo(21.388f, 16.5f, 21.5f, 16.388f, 21.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(21.5f, 7.612f, 21.388f, 7.5f, 21.25f, 7.5f)
                horizontalLineTo(19.75f)
                close()
                moveTo(3.5f, 8.004f)
                verticalLineTo(15.993f)
                curveTo(3.5f, 16.188f, 3.713f, 16.308f, 3.88f, 16.207f)
                lineTo(10.382f, 12.255f)
                curveTo(10.541f, 12.158f, 10.542f, 11.927f, 10.384f, 11.829f)
                lineTo(3.882f, 7.792f)
                curveTo(3.715f, 7.689f, 3.5f, 7.808f, 3.5f, 8.004f)
                close()
            }
        }
        .build()
        return _videoPlayPause!!
    }

@Suppress("ObjectPropertyName")
private var _videoPlayPause: ImageVector? = null

@Preview
@Composable
private fun VideoPlayPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPlayPause, contentDescription = "VideoPlayPause Icon")
    }
}

