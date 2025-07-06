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
 * Video360Off Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent general video meetings, views & settings in video meetings.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_360_off_20_filled.svg)
 * 
 * @return The [ImageVector] for the Video360Off icon.
 */
public val FluentIcons.Filled.Video360Off: ImageVector
    get() {
        if (_video360Off != null) {
            return _video360Off!!
        }
        _video360Off = Builder(name = "Video360Off", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.331f, 4.038f)
                curveTo(2.58f, 4.205f, 2.0f, 4.874f, 2.0f, 5.698f)
                verticalLineTo(14.302f)
                curveTo(2.0f, 15.349f, 2.937f, 16.146f, 3.969f, 15.979f)
                curveTo(4.469f, 15.899f, 4.969f, 15.828f, 5.471f, 15.768f)
                curveTo(8.683f, 15.381f, 11.932f, 15.407f, 15.139f, 15.847f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(13.995f, 14.702f)
                curveTo(13.663f, 14.668f, 13.332f, 14.638f, 13.0f, 14.612f)
                verticalLineTo(13.707f)
                lineTo(13.995f, 14.702f)
                close()
                moveTo(12.0f, 12.707f)
                verticalLineTo(14.548f)
                curveTo(10.668f, 14.479f, 9.332f, 14.479f, 8.0f, 14.548f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 11.448f, 8.448f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(10.293f)
                lineTo(12.0f, 12.707f)
                close()
                moveTo(4.0f, 14.962f)
                verticalLineTo(13.0f)
                curveTo(4.0f, 12.448f, 4.448f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.612f)
                curveTo(5.997f, 14.69f, 4.996f, 14.806f, 4.0f, 14.962f)
                close()
                moveTo(5.5f, 11.0f)
                curveTo(4.948f, 11.0f, 4.5f, 10.552f, 4.5f, 10.0f)
                curveTo(4.5f, 9.448f, 4.948f, 9.0f, 5.5f, 9.0f)
                curveTo(6.052f, 9.0f, 6.5f, 9.448f, 6.5f, 10.0f)
                curveTo(6.5f, 10.552f, 6.052f, 11.0f, 5.5f, 11.0f)
                close()
                moveTo(14.121f, 12.0f)
                lineTo(6.459f, 4.338f)
                curveTo(9.647f, 4.637f, 12.863f, 4.532f, 16.031f, 4.021f)
                curveTo(17.063f, 3.854f, 18.0f, 4.652f, 18.0f, 5.698f)
                verticalLineTo(14.302f)
                curveTo(18.0f, 14.744f, 17.833f, 15.142f, 17.562f, 15.441f)
                lineTo(16.0f, 13.879f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 12.448f, 15.552f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(14.121f)
                close()
                moveTo(14.5f, 11.0f)
                curveTo(15.052f, 11.0f, 15.5f, 10.553f, 15.5f, 10.0f)
                curveTo(15.5f, 9.448f, 15.052f, 9.0f, 14.5f, 9.0f)
                curveTo(13.948f, 9.0f, 13.5f, 9.448f, 13.5f, 10.0f)
                curveTo(13.5f, 10.553f, 13.948f, 11.0f, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _video360Off!!
    }

@Suppress("ObjectPropertyName")
private var _video360Off: ImageVector? = null

@Preview
@Composable
private fun Video360OffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Video360Off, contentDescription = "Video360Off Icon")
    }
}

