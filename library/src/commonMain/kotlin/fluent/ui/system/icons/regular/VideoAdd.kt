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
 * VideoAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, add
 * - Source: ic_fluent_video_add_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoAdd icon.
 */
public val FluentIcons.Regular.VideoAdd: ImageVector
    get() {
        if (_videoAdd != null) {
            return _videoAdd!!
        }
        _videoAdd = Builder(name = "VideoAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 4.0f)
                curveTo(3.455f, 4.0f, 2.0f, 5.455f, 2.0f, 7.25f)
                verticalLineTo(12.81f)
                curveTo(2.444f, 12.383f, 2.949f, 12.019f, 3.5f, 11.732f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(12.75f)
                curveTo(13.717f, 5.5f, 14.5f, 6.284f, 14.5f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(14.5f, 15.658f, 13.808f, 16.405f, 12.922f, 16.492f)
                curveTo(12.973f, 16.82f, 13.0f, 17.157f, 13.0f, 17.5f)
                curveTo(13.0f, 17.666f, 12.994f, 17.83f, 12.982f, 17.992f)
                curveTo(14.668f, 17.873f, 16.0f, 16.467f, 16.0f, 14.75f)
                verticalLineTo(14.438f)
                lineTo(19.257f, 16.687f)
                curveTo(20.418f, 17.489f, 22.002f, 16.658f, 22.002f, 15.247f)
                verticalLineTo(6.752f)
                curveTo(22.002f, 5.341f, 20.418f, 4.51f, 19.257f, 5.312f)
                lineTo(16.0f, 7.561f)
                verticalLineTo(7.25f)
                curveTo(16.0f, 5.455f, 14.545f, 4.0f, 12.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(16.0f, 9.384f)
                lineTo(20.11f, 6.546f)
                curveTo(20.276f, 6.432f, 20.502f, 6.551f, 20.502f, 6.752f)
                verticalLineTo(15.247f)
                curveTo(20.502f, 15.449f, 20.276f, 15.567f, 20.11f, 15.453f)
                lineTo(16.0f, 12.615f)
                verticalLineTo(9.384f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 9.538f, 12.0f, 6.5f, 12.0f)
                curveTo(3.462f, 12.0f, 1.0f, 14.462f, 1.0f, 17.5f)
                curveTo(1.0f, 20.538f, 3.462f, 23.0f, 6.5f, 23.0f)
                curveTo(9.538f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                close()
                moveTo(7.001f, 18.0f)
                lineTo(7.001f, 20.503f)
                curveTo(7.001f, 20.78f, 6.777f, 21.003f, 6.501f, 21.003f)
                curveTo(6.225f, 21.003f, 6.001f, 20.78f, 6.001f, 20.503f)
                lineTo(6.001f, 18.0f)
                horizontalLineTo(3.496f)
                curveTo(3.22f, 18.0f, 2.996f, 17.776f, 2.996f, 17.5f)
                curveTo(2.996f, 17.224f, 3.22f, 17.0f, 3.496f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 14.499f)
                curveTo(6.0f, 14.223f, 6.224f, 13.999f, 6.5f, 13.999f)
                curveTo(6.776f, 13.999f, 7.0f, 14.223f, 7.0f, 14.499f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(9.497f)
                curveTo(9.772f, 17.0f, 9.996f, 17.224f, 9.996f, 17.5f)
                curveTo(9.996f, 17.776f, 9.772f, 18.0f, 9.497f, 18.0f)
                horizontalLineTo(7.001f)
                close()
            }
        }
        .build()
        return _videoAdd!!
    }

@Suppress("ObjectPropertyName")
private var _videoAdd: ImageVector? = null

@Preview
@Composable
private fun VideoAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoAdd, contentDescription = null)
    }
}

