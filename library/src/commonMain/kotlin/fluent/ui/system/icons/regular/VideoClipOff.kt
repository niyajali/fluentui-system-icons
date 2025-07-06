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
 * VideoClipOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_clip_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoClipOff icon.
 */
public val FluentIcons.Regular.VideoClipOff: ImageVector
    get() {
        if (_videoClipOff != null) {
            return _videoClipOff!!
        }
        _videoClipOff = Builder(name = "VideoClipOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(2.922f, 3.982f)
                curveTo(2.351f, 4.568f, 2.0f, 5.368f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 19.545f, 3.455f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(19.108f, 21.0f, 19.452f, 20.942f, 19.774f, 20.835f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(18.439f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.782f, 3.684f, 5.357f, 3.983f, 5.043f)
                lineTo(9.0f, 10.061f)
                verticalLineTo(14.75f)
                curveTo(9.0f, 15.511f, 9.815f, 15.993f, 10.482f, 15.626f)
                lineTo(13.116f, 14.177f)
                lineTo(18.439f, 19.5f)
                close()
                moveTo(12.87f, 9.688f)
                lineTo(15.793f, 12.611f)
                curveTo(16.149f, 12.151f, 16.045f, 11.434f, 15.481f, 11.124f)
                lineTo(12.87f, 9.688f)
                close()
                moveTo(20.5f, 6.25f)
                verticalLineTo(17.318f)
                lineTo(21.864f, 18.683f)
                curveTo(21.953f, 18.387f, 22.0f, 18.074f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.455f, 20.545f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(6.182f)
                lineTo(7.682f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 4.5f, 20.5f, 5.284f, 20.5f, 6.25f)
                close()
            }
        }
        .build()
        return _videoClipOff!!
    }

@Suppress("ObjectPropertyName")
private var _videoClipOff: ImageVector? = null

@Preview
@Composable
private fun VideoClipOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoClipOff, contentDescription = "VideoClipOff Icon")
    }
}

