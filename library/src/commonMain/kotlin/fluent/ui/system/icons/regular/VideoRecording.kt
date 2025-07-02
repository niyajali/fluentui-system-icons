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
 * VideoRecording icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: video, recording
 * - Source: ic_fluent_video_recording_20_regular.svg
 * 
 * @return The [ImageVector] for the VideoRecording icon.
 */
public val FluentIcons.Regular.VideoRecording: ImageVector
    get() {
        if (_videoRecording != null) {
            return _videoRecording!!
        }
        _videoRecording = Builder(name = "VideoRecording", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 4.0f)
                curveTo(3.119f, 4.0f, 2.0f, 5.119f, 2.0f, 6.5f)
                verticalLineTo(9.337f)
                curveTo(2.311f, 9.189f, 2.647f, 9.086f, 3.0f, 9.035f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 5.672f, 3.672f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 5.0f, 13.0f, 5.672f, 13.0f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(13.0f, 14.328f, 12.328f, 15.0f, 11.5f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 16.0f, 14.0f, 14.881f, 14.0f, 13.5f)
                verticalLineTo(12.5f)
                lineTo(16.4f, 14.3f)
                curveTo(17.059f, 14.794f, 18.0f, 14.324f, 18.0f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(18.0f, 5.676f, 17.059f, 5.206f, 16.4f, 5.7f)
                lineTo(14.0f, 7.5f)
                verticalLineTo(6.5f)
                curveTo(14.0f, 5.119f, 12.881f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.0f, 8.75f)
                lineTo(17.0f, 6.5f)
                verticalLineTo(13.5f)
                lineTo(14.0f, 11.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(1.0f, 12.5f)
                curveTo(1.0f, 11.119f, 2.119f, 10.0f, 3.5f, 10.0f)
                horizontalLineTo(7.5f)
                curveTo(8.881f, 10.0f, 10.0f, 11.119f, 10.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(10.0f, 17.881f, 8.881f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 19.0f, 1.0f, 17.881f, 1.0f, 16.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(5.02f, 12.534f)
                curveTo(4.942f, 12.481f, 4.856f, 12.455f, 4.761f, 12.455f)
                curveTo(4.695f, 12.455f, 4.632f, 12.469f, 4.573f, 12.497f)
                curveTo(4.513f, 12.523f, 4.461f, 12.56f, 4.417f, 12.605f)
                curveTo(4.373f, 12.651f, 4.338f, 12.705f, 4.311f, 12.767f)
                curveTo(4.285f, 12.829f, 4.272f, 12.894f, 4.272f, 12.963f)
                verticalLineTo(16.037f)
                curveTo(4.272f, 16.104f, 4.285f, 16.169f, 4.311f, 16.231f)
                curveTo(4.338f, 16.292f, 4.373f, 16.347f, 4.417f, 16.395f)
                curveTo(4.463f, 16.441f, 4.516f, 16.478f, 4.575f, 16.506f)
                curveTo(4.634f, 16.532f, 4.696f, 16.545f, 4.761f, 16.545f)
                curveTo(4.81f, 16.545f, 4.856f, 16.538f, 4.898f, 16.524f)
                curveTo(4.942f, 16.51f, 4.985f, 16.489f, 5.028f, 16.461f)
                lineTo(7.324f, 14.894f)
                curveTo(7.393f, 14.849f, 7.448f, 14.787f, 7.487f, 14.709f)
                curveTo(7.526f, 14.632f, 7.545f, 14.55f, 7.545f, 14.466f)
                curveTo(7.545f, 14.377f, 7.525f, 14.296f, 7.484f, 14.222f)
                curveTo(7.443f, 14.146f, 7.388f, 14.085f, 7.316f, 14.04f)
                lineTo(5.02f, 12.534f)
                close()
            }
        }
        .build()
        return _videoRecording!!
    }

@Suppress("ObjectPropertyName")
private var _videoRecording: ImageVector? = null

@Preview
@Composable
private fun VideoRecordingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoRecording, contentDescription = null)
    }
}

