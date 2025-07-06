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
 * VideoClipMultiple Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_clip_multiple_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoClipMultiple icon.
 */
public val FluentIcons.Regular.VideoClipMultiple: ImageVector
    get() {
        if (_videoClipMultiple != null) {
            return _videoClipMultiple!!
        }
        _videoClipMultiple = Builder(name = "VideoClipMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.752f)
                verticalLineTo(13.249f)
                curveTo(8.0f, 13.842f, 8.655f, 14.2f, 9.155f, 13.88f)
                lineTo(13.773f, 10.921f)
                curveTo(14.08f, 10.725f, 14.08f, 10.276f, 13.773f, 10.079f)
                lineTo(9.155f, 7.12f)
                curveTo(8.655f, 6.8f, 8.0f, 7.159f, 8.0f, 7.752f)
                close()
                moveTo(5.25f, 3.0f)
                curveTo(3.455f, 3.0f, 2.0f, 4.455f, 2.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 17.045f, 3.455f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 18.5f, 19.0f, 17.045f, 19.0f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(19.0f, 4.455f, 17.545f, 3.0f, 15.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 4.5f, 17.5f, 5.284f, 17.5f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 16.216f, 16.716f, 17.0f, 15.75f, 17.0f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 17.0f, 3.5f, 16.216f, 3.5f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.011f, 19.5f)
                curveTo(5.588f, 20.402f, 6.599f, 21.0f, 7.75f, 21.0f)
                horizontalLineTo(16.25f)
                curveTo(19.149f, 21.0f, 21.5f, 18.649f, 21.5f, 15.75f)
                verticalLineTo(8.75f)
                curveTo(21.5f, 7.599f, 20.902f, 6.588f, 20.0f, 6.011f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.821f, 18.321f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(5.011f)
                close()
            }
        }
        .build()
        return _videoClipMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _videoClipMultiple: ImageVector? = null

@Preview
@Composable
private fun VideoClipMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoClipMultiple, contentDescription = "VideoClipMultiple Icon")
    }
}

