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
 * Video360Off icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: video360off
 * - Source: ic_fluent_video_360_off_20_regular.svg
 * 
 * @return The [ImageVector] for the Video360Off icon.
 */
public val FluentIcons.Regular.Video360Off: ImageVector
    get() {
        if (_video360Off != null) {
            return _video360Off!!
        }
        _video360Off = Builder(name = "Video360Off", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                curveTo(6.552f, 11.0f, 7.0f, 10.552f, 7.0f, 10.0f)
                curveTo(7.0f, 9.448f, 6.552f, 9.0f, 6.0f, 9.0f)
                curveTo(5.448f, 9.0f, 5.0f, 9.448f, 5.0f, 10.0f)
                curveTo(5.0f, 10.552f, 5.448f, 11.0f, 6.0f, 11.0f)
                close()
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.331f, 4.038f)
                curveTo(2.58f, 4.205f, 2.0f, 4.874f, 2.0f, 5.698f)
                verticalLineTo(14.302f)
                curveTo(2.0f, 15.349f, 2.937f, 16.146f, 3.969f, 15.979f)
                curveTo(7.667f, 15.383f, 11.432f, 15.339f, 15.139f, 15.847f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(16.669f, 15.962f)
                curveTo(16.669f, 15.962f, 16.669f, 15.962f, 16.669f, 15.962f)
                lineTo(10.545f, 9.838f)
                curveTo(10.545f, 9.838f, 10.545f, 9.838f, 10.545f, 9.838f)
                lineTo(9.162f, 8.455f)
                curveTo(9.162f, 8.455f, 9.162f, 8.455f, 9.162f, 8.455f)
                lineTo(6.005f, 5.298f)
                curveTo(6.005f, 5.298f, 6.005f, 5.298f, 6.005f, 5.298f)
                lineTo(4.861f, 4.154f)
                curveTo(4.861f, 4.154f, 4.861f, 4.154f, 4.861f, 4.154f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(13.0f, 13.707f)
                verticalLineTo(14.612f)
                curveTo(12.667f, 14.586f, 12.333f, 14.565f, 12.0f, 14.548f)
                verticalLineTo(12.707f)
                lineTo(13.0f, 13.707f)
                close()
                moveTo(10.293f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 11.0f, 8.0f, 11.448f, 8.0f, 12.0f)
                verticalLineTo(14.548f)
                curveTo(7.666f, 14.565f, 7.333f, 14.586f, 7.0f, 14.612f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 12.0f, 4.0f, 12.448f, 4.0f, 13.0f)
                verticalLineTo(14.962f)
                curveTo(3.937f, 14.972f, 3.873f, 14.982f, 3.81f, 14.992f)
                curveTo(3.385f, 15.061f, 3.0f, 14.733f, 3.0f, 14.302f)
                verticalLineTo(5.698f)
                curveTo(3.0f, 5.267f, 3.385f, 4.939f, 3.81f, 5.008f)
                curveTo(4.003f, 5.039f, 4.196f, 5.069f, 4.39f, 5.097f)
                lineTo(10.293f, 11.0f)
                close()
                moveTo(14.121f, 12.0f)
                lineTo(16.0f, 13.879f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 12.447f, 15.552f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(14.121f)
                close()
                moveTo(16.853f, 14.731f)
                lineTo(17.562f, 15.441f)
                curveTo(17.833f, 15.142f, 18.0f, 14.744f, 18.0f, 14.302f)
                verticalLineTo(5.698f)
                curveTo(18.0f, 4.652f, 17.063f, 3.854f, 16.031f, 4.021f)
                curveTo(12.863f, 4.532f, 9.647f, 4.637f, 6.459f, 4.338f)
                lineTo(7.548f, 5.427f)
                curveTo(10.431f, 5.609f, 13.33f, 5.469f, 16.19f, 5.008f)
                curveTo(16.615f, 4.939f, 17.0f, 5.267f, 17.0f, 5.698f)
                verticalLineTo(14.302f)
                curveTo(17.0f, 14.465f, 16.945f, 14.614f, 16.853f, 14.731f)
                close()
                moveTo(14.0f, 11.0f)
                curveTo(14.552f, 11.0f, 15.0f, 10.552f, 15.0f, 10.0f)
                curveTo(15.0f, 9.448f, 14.552f, 9.0f, 14.0f, 9.0f)
                curveTo(13.448f, 9.0f, 13.0f, 9.448f, 13.0f, 10.0f)
                curveTo(13.0f, 10.552f, 13.448f, 11.0f, 14.0f, 11.0f)
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
        Image(imageVector = FluentIcons.Regular.Video360Off, contentDescription = null)
    }
}

