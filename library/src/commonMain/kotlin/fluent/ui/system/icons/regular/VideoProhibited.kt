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
 * VideoProhibited Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_prohibited_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoProhibited icon.
 */
public val FluentIcons.Regular.VideoProhibited: ImageVector
    get() {
        if (_videoProhibited != null) {
            return _videoProhibited!!
        }
        _videoProhibited = Builder(name = "VideoProhibited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 5.0f)
                curveTo(15.545f, 5.0f, 17.0f, 6.455f, 17.0f, 8.25f)
                verticalLineTo(8.423f)
                lineTo(20.864f, 6.105f)
                curveTo(21.364f, 5.805f, 22.0f, 6.165f, 22.0f, 6.748f)
                verticalLineTo(12.81f)
                curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
                verticalLineTo(8.073f)
                lineTo(17.0f, 10.175f)
                verticalLineTo(11.019f)
                curveTo(16.48f, 11.059f, 15.978f, 11.159f, 15.5f, 11.314f)
                verticalLineTo(8.25f)
                curveTo(15.5f, 7.284f, 14.717f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 6.5f, 3.5f, 7.284f, 3.5f, 8.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(11.076f)
                curveTo(11.157f, 19.023f, 11.3f, 19.526f, 11.498f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20.0f, 2.0f, 18.545f, 2.0f, 16.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.455f, 3.455f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.333f, 13.755f, 19.108f, 14.191f, 19.748f)
                lineTo(19.748f, 14.191f)
                curveTo(19.108f, 13.755f, 18.333f, 13.5f, 17.5f, 13.5f)
                curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
                curveTo(21.5f, 16.667f, 21.245f, 15.892f, 20.809f, 15.252f)
                lineTo(15.252f, 20.809f)
                curveTo(15.892f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
                close()
            }
        }
        .build()
        return _videoProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _videoProhibited: ImageVector? = null

@Preview
@Composable
private fun VideoProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoProhibited, contentDescription = "VideoProhibited Icon")
    }
}

