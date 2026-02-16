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

package fluent.ui.system.icons.filled

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
 * VideoShortMultiple Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video short content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_short_multiple_24_filled.svg)
 * 
 * @return The [ImageVector] for the VideoShortMultiple icon.
 */
public val FluentIcons.Filled.VideoShortMultiple: ImageVector
    get() {
        if (_videoShortMultiple != null) {
            return _videoShortMultiple!!
        }
        _videoShortMultiple = Builder(name = "VideoShortMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.493f, 5.007f)
                curveTo(19.399f, 5.584f, 20.001f, 6.596f, 20.001f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(20.001f, 19.426f, 17.427f, 22.0f, 14.251f, 22.0f)
                horizontalLineTo(9.751f)
                curveTo(8.597f, 22.0f, 7.585f, 21.398f, 7.008f, 20.492f)
                curveTo(7.088f, 20.497f, 7.169f, 20.5f, 7.251f, 20.5f)
                horizontalLineTo(14.251f)
                curveTo(16.598f, 20.5f, 18.501f, 18.597f, 18.501f, 16.25f)
                verticalLineTo(5.25f)
                curveTo(18.501f, 5.168f, 18.498f, 5.087f, 18.493f, 5.007f)
                close()
                moveTo(14.25f, 2.0f)
                curveTo(16.045f, 2.0f, 17.5f, 3.455f, 17.5f, 5.25f)
                verticalLineTo(16.25f)
                curveTo(17.5f, 18.045f, 16.045f, 19.5f, 14.25f, 19.5f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 19.5f, 4.0f, 18.045f, 4.0f, 16.25f)
                verticalLineTo(5.25f)
                curveTo(4.0f, 3.455f, 5.455f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(9.904f, 7.688f)
                curveTo(9.071f, 7.177f, 8.0f, 7.777f, 8.0f, 8.754f)
                verticalLineTo(12.746f)
                curveTo(8.0f, 13.723f, 9.071f, 14.323f, 9.904f, 13.811f)
                lineTo(13.155f, 11.815f)
                curveTo(13.95f, 11.328f, 13.95f, 10.172f, 13.155f, 9.685f)
                lineTo(9.904f, 7.688f)
                close()
            }
        }
        .build()
        return _videoShortMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _videoShortMultiple: ImageVector? = null

@Preview
@Composable
private fun VideoShortMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoShortMultiple, contentDescription = "VideoShortMultiple Icon")
    }
}

