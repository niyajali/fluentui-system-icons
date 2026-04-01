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
 * VideoShort Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video short content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_short_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoShort icon.
 */
public val FluentIcons.Regular.VideoShort: ImageVector
    get() {
        if (_videoShort != null) {
            return _videoShort!!
        }
        _videoShort = Builder(name = "VideoShort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 2.0f)
                curveTo(18.545f, 2.0f, 20.0f, 3.455f, 20.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(20.0f, 20.545f, 18.545f, 22.0f, 16.75f, 22.0f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 22.0f, 4.0f, 20.545f, 4.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(4.0f, 3.455f, 5.455f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(16.75f)
                close()
                moveTo(7.25f, 3.5f)
                curveTo(6.284f, 3.5f, 5.5f, 4.284f, 5.5f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(5.5f, 19.716f, 6.284f, 20.5f, 7.25f, 20.5f)
                horizontalLineTo(16.75f)
                curveTo(17.716f, 20.5f, 18.5f, 19.716f, 18.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(18.5f, 4.284f, 17.716f, 3.5f, 16.75f, 3.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(9.0f, 9.756f)
                curveTo(9.0f, 8.57f, 10.311f, 7.853f, 11.31f, 8.493f)
                lineTo(14.813f, 10.74f)
                curveTo(15.732f, 11.331f, 15.732f, 12.675f, 14.813f, 13.266f)
                lineTo(11.31f, 15.513f)
                curveTo(10.311f, 16.153f, 9.001f, 15.436f, 9.0f, 14.251f)
                verticalLineTo(9.756f)
                close()
            }
        }
        .build()
        return _videoShort!!
    }

@Suppress("ObjectPropertyName")
private var _videoShort: ImageVector? = null

@Preview
@Composable
private fun VideoShortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoShort, contentDescription = "VideoShort Icon")
    }
}

