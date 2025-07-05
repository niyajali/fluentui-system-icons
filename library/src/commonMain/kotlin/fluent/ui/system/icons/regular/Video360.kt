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
 * Video360 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent general video meetings, views & settings in video meetings.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_360_24_regular.svg)
 * 
 * @return The [ImageVector] for the Video360 icon.
 */
public val FluentIcons.Regular.Video360: ImageVector
    get() {
        if (_video360 != null) {
            return _video360!!
        }
        _video360 = Builder(name = "Video360", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 11.5f)
                curveTo(13.5f, 12.328f, 12.828f, 13.0f, 12.0f, 13.0f)
                curveTo(11.172f, 13.0f, 10.5f, 12.328f, 10.5f, 11.5f)
                curveTo(10.5f, 10.671f, 11.172f, 10.0f, 12.0f, 10.0f)
                curveTo(12.828f, 10.0f, 13.5f, 10.671f, 13.5f, 11.5f)
                close()
                moveTo(7.0f, 14.0f)
                curveTo(7.828f, 14.0f, 8.5f, 13.328f, 8.5f, 12.5f)
                curveTo(8.5f, 11.671f, 7.828f, 11.0f, 7.0f, 11.0f)
                curveTo(6.172f, 11.0f, 5.5f, 11.671f, 5.5f, 12.5f)
                curveTo(5.5f, 13.328f, 6.172f, 14.0f, 7.0f, 14.0f)
                close()
                moveTo(17.0f, 14.0f)
                curveTo(17.828f, 14.0f, 18.5f, 13.328f, 18.5f, 12.5f)
                curveTo(18.5f, 11.671f, 17.828f, 11.0f, 17.0f, 11.0f)
                curveTo(16.172f, 11.0f, 15.5f, 11.671f, 15.5f, 12.5f)
                curveTo(15.5f, 13.328f, 16.172f, 14.0f, 17.0f, 14.0f)
                close()
                moveTo(2.0f, 6.316f)
                curveTo(2.0f, 4.875f, 3.318f, 3.824f, 4.692f, 4.017f)
                curveTo(6.268f, 4.238f, 8.809f, 4.5f, 12.0f, 4.5f)
                curveTo(15.191f, 4.5f, 17.732f, 4.238f, 19.308f, 4.017f)
                curveTo(20.682f, 3.824f, 22.0f, 4.875f, 22.0f, 6.316f)
                verticalLineTo(17.684f)
                curveTo(22.0f, 19.125f, 20.682f, 20.175f, 19.309f, 19.983f)
                curveTo(17.732f, 19.762f, 15.189f, 19.5f, 12.0f, 19.5f)
                curveTo(8.811f, 19.5f, 6.268f, 19.762f, 4.691f, 19.983f)
                curveTo(3.318f, 20.175f, 2.0f, 19.125f, 2.0f, 17.684f)
                lineTo(2.0f, 6.316f)
                close()
                moveTo(4.483f, 5.502f)
                curveTo(3.959f, 5.429f, 3.5f, 5.84f, 3.5f, 6.316f)
                lineTo(3.5f, 17.684f)
                curveTo(3.5f, 18.16f, 3.958f, 18.571f, 4.483f, 18.497f)
                curveTo(4.646f, 18.475f, 4.818f, 18.451f, 5.0f, 18.428f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 15.447f, 5.448f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(18.104f)
                curveTo(8.977f, 18.075f, 9.477f, 18.051f, 10.001f, 18.033f)
                curveTo(10.0f, 18.022f, 10.0f, 18.011f, 10.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 14.447f, 10.448f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 14.0f, 14.0f, 14.447f, 14.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(14.0f, 18.011f, 14.0f, 18.022f, 13.999f, 18.033f)
                curveTo(14.523f, 18.051f, 15.023f, 18.075f, 15.5f, 18.104f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 15.0f, 19.0f, 15.447f, 19.0f, 16.0f)
                verticalLineTo(18.428f)
                curveTo(19.182f, 18.451f, 19.354f, 18.475f, 19.517f, 18.497f)
                curveTo(20.042f, 18.571f, 20.5f, 18.16f, 20.5f, 17.684f)
                verticalLineTo(6.316f)
                curveTo(20.5f, 5.84f, 20.042f, 5.429f, 19.517f, 5.502f)
                curveTo(17.884f, 5.731f, 15.272f, 6.0f, 12.0f, 6.0f)
                curveTo(8.728f, 6.0f, 6.116f, 5.731f, 4.483f, 5.502f)
                close()
            }
        }
        .build()
        return _video360!!
    }

@Suppress("ObjectPropertyName")
private var _video360: ImageVector? = null

@Preview
@Composable
private fun Video360Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Video360, contentDescription = "Video360 Icon")
    }
}

