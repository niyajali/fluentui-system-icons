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
 * VideoClip Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_clip_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoClip icon.
 */
public val FluentIcons.Regular.VideoClip: ImageVector
    get() {
        if (_videoClip != null) {
            return _videoClip!!
        }
        _videoClip = Builder(name = "VideoClip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.455f, 3.455f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 3.0f, 22.0f, 4.455f, 22.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 19.545f, 20.545f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 21.0f, 2.0f, 19.545f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.25f, 4.5f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.284f, 19.716f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(9.0f, 9.251f)
                verticalLineTo(14.75f)
                curveTo(9.0f, 15.511f, 9.815f, 15.993f, 10.482f, 15.626f)
                lineTo(15.481f, 12.877f)
                curveTo(16.172f, 12.497f, 16.172f, 11.504f, 15.481f, 11.124f)
                lineTo(10.482f, 8.374f)
                curveTo(9.815f, 8.008f, 9.0f, 8.49f, 9.0f, 9.251f)
                close()
            }
        }
        .build()
        return _videoClip!!
    }

@Suppress("ObjectPropertyName")
private var _videoClip: ImageVector? = null

@Preview
@Composable
private fun VideoClipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoClip, contentDescription = "VideoClip Icon")
    }
}

