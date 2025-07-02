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
 * VideoLink icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, link
 * - Source: ic_fluent_video_link_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoLink icon.
 */
public val FluentIcons.Regular.VideoLink: ImageVector
    get() {
        if (_videoLink != null) {
            return _videoLink!!
        }
        _videoLink = Builder(name = "VideoLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 4.0f)
                curveTo(4.455f, 4.0f, 3.0f, 5.455f, 3.0f, 7.25f)
                verticalLineTo(14.333f)
                curveTo(3.468f, 14.147f, 3.973f, 14.034f, 4.5f, 14.007f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 6.284f, 5.284f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 5.5f, 15.5f, 6.284f, 15.5f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(15.5f, 15.717f, 14.717f, 16.5f, 13.75f, 16.5f)
                horizontalLineTo(12.434f)
                curveTo(12.682f, 16.96f, 12.856f, 17.465f, 12.941f, 18.0f)
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
                moveTo(12.0f, 18.75f)
                curveTo(12.0f, 16.679f, 10.321f, 15.0f, 8.25f, 15.0f)
                lineTo(8.148f, 15.007f)
                curveTo(7.782f, 15.057f, 7.5f, 15.37f, 7.5f, 15.75f)
                curveTo(7.5f, 16.164f, 7.836f, 16.5f, 8.25f, 16.5f)
                lineTo(8.404f, 16.505f)
                curveTo(9.575f, 16.584f, 10.5f, 17.559f, 10.5f, 18.75f)
                curveTo(10.5f, 19.993f, 9.493f, 21.0f, 8.25f, 21.0f)
                lineTo(8.247f, 21.005f)
                lineTo(8.145f, 21.012f)
                curveTo(7.779f, 21.063f, 7.498f, 21.378f, 7.5f, 21.758f)
                curveTo(7.502f, 22.172f, 7.839f, 22.507f, 8.253f, 22.505f)
                verticalLineTo(22.5f)
                lineTo(8.452f, 22.495f)
                curveTo(10.428f, 22.391f, 12.0f, 20.754f, 12.0f, 18.75f)
                close()
                moveTo(5.5f, 15.75f)
                curveTo(5.5f, 15.336f, 5.164f, 15.0f, 4.75f, 15.0f)
                lineTo(4.551f, 15.005f)
                curveTo(2.572f, 15.109f, 1.0f, 16.746f, 1.0f, 18.75f)
                curveTo(1.0f, 20.821f, 2.679f, 22.5f, 4.75f, 22.5f)
                lineTo(4.852f, 22.493f)
                curveTo(5.218f, 22.444f, 5.5f, 22.13f, 5.5f, 21.75f)
                curveTo(5.5f, 21.336f, 5.164f, 21.0f, 4.75f, 21.0f)
                lineTo(4.596f, 20.995f)
                curveTo(3.425f, 20.916f, 2.5f, 19.941f, 2.5f, 18.75f)
                curveTo(2.5f, 17.507f, 3.507f, 16.5f, 4.75f, 16.5f)
                lineTo(4.852f, 16.493f)
                curveTo(5.218f, 16.444f, 5.5f, 16.13f, 5.5f, 15.75f)
                close()
                moveTo(9.0f, 18.75f)
                curveTo(9.0f, 18.336f, 8.664f, 18.0f, 8.25f, 18.0f)
                horizontalLineTo(4.75f)
                lineTo(4.648f, 18.007f)
                curveTo(4.282f, 18.056f, 4.0f, 18.37f, 4.0f, 18.75f)
                curveTo(4.0f, 19.164f, 4.336f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(8.25f)
                lineTo(8.352f, 19.493f)
                curveTo(8.718f, 19.444f, 9.0f, 19.13f, 9.0f, 18.75f)
                close()
            }
        }
        .build()
        return _videoLink!!
    }

@Suppress("ObjectPropertyName")
private var _videoLink: ImageVector? = null

@Preview
@Composable
private fun VideoLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoLink, contentDescription = null)
    }
}

