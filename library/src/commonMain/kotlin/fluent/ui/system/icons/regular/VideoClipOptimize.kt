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
 * VideoClipOptimize Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent optimization processes for videos.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_clip_optimize_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoClipOptimize icon.
 */
public val FluentIcons.Regular.VideoClipOptimize: ImageVector
    get() {
        if (_videoClipOptimize != null) {
            return _videoClipOptimize!!
        }
        _videoClipOptimize = Builder(name = "VideoClipOptimize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 7.75f)
                curveTo(3.5f, 5.403f, 5.403f, 3.5f, 7.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 3.5f, 9.0f, 3.164f, 9.0f, 2.75f)
                curveTo(9.0f, 2.336f, 8.664f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(7.75f)
                curveTo(4.574f, 2.0f, 2.0f, 4.574f, 2.0f, 7.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 8.664f, 2.336f, 9.0f, 2.75f, 9.0f)
                curveTo(3.164f, 9.0f, 3.5f, 8.664f, 3.5f, 8.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(3.5f, 16.25f)
                curveTo(3.5f, 18.597f, 5.403f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 20.5f, 9.0f, 20.836f, 9.0f, 21.25f)
                curveTo(9.0f, 21.664f, 8.664f, 22.0f, 8.25f, 22.0f)
                horizontalLineTo(7.75f)
                curveTo(4.574f, 22.0f, 2.0f, 19.426f, 2.0f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 15.336f, 2.336f, 15.0f, 2.75f, 15.0f)
                curveTo(3.164f, 15.0f, 3.5f, 15.336f, 3.5f, 15.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(16.25f, 3.5f)
                curveTo(18.597f, 3.5f, 20.5f, 5.403f, 20.5f, 7.75f)
                verticalLineTo(8.25f)
                curveTo(20.5f, 8.664f, 20.836f, 9.0f, 21.25f, 9.0f)
                curveTo(21.664f, 9.0f, 22.0f, 8.664f, 22.0f, 8.25f)
                verticalLineTo(7.75f)
                curveTo(22.0f, 4.574f, 19.426f, 2.0f, 16.25f, 2.0f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 2.0f, 15.0f, 2.336f, 15.0f, 2.75f)
                curveTo(15.0f, 3.164f, 15.336f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(16.25f)
                close()
                moveTo(20.5f, 16.25f)
                curveTo(20.5f, 18.597f, 18.597f, 20.5f, 16.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 20.5f, 15.0f, 20.836f, 15.0f, 21.25f)
                curveTo(15.0f, 21.664f, 15.336f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(16.25f)
                curveTo(19.426f, 22.0f, 22.0f, 19.426f, 22.0f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(22.0f, 15.336f, 21.664f, 15.0f, 21.25f, 15.0f)
                curveTo(20.836f, 15.0f, 20.5f, 15.336f, 20.5f, 15.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(5.0f, 8.25f)
                curveTo(5.0f, 6.455f, 6.455f, 5.0f, 8.25f, 5.0f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 5.0f, 19.0f, 6.455f, 19.0f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(19.0f, 17.545f, 17.545f, 19.0f, 15.75f, 19.0f)
                horizontalLineTo(8.25f)
                curveTo(6.455f, 19.0f, 5.0f, 17.545f, 5.0f, 15.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(8.25f, 6.5f)
                curveTo(7.284f, 6.5f, 6.5f, 7.284f, 6.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(6.5f, 16.716f, 7.284f, 17.5f, 8.25f, 17.5f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 17.5f, 17.5f, 16.716f, 17.5f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(17.5f, 7.284f, 16.716f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(8.25f)
                close()
                moveTo(9.0f, 14.75f)
                verticalLineTo(9.251f)
                curveTo(9.0f, 8.49f, 9.815f, 8.008f, 10.482f, 8.374f)
                lineTo(15.481f, 11.124f)
                curveTo(16.172f, 11.504f, 16.172f, 12.497f, 15.481f, 12.877f)
                lineTo(10.482f, 15.626f)
                curveTo(9.815f, 15.993f, 9.0f, 15.511f, 9.0f, 14.75f)
                close()
            }
        }
        .build()
        return _videoClipOptimize!!
    }

@Suppress("ObjectPropertyName")
private var _videoClipOptimize: ImageVector? = null

@Preview
@Composable
private fun VideoClipOptimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoClipOptimize, contentDescription = "VideoClipOptimize Icon")
    }
}

