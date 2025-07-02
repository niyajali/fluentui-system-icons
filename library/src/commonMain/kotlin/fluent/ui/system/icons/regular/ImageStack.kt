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
 * ImageStack icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: image, stack
 * - Source: ic_fluent_image_stack_20_regular.svg
 * 
 * @return The [ImageVector] for the ImageStack icon.
 */
public val FluentIcons.Regular.ImageStack: ImageVector
    get() {
        if (_imageStack != null) {
            return _imageStack!!
        }
        _imageStack = Builder(name = "ImageStack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 17.0f, 17.0f, 15.657f, 17.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(13.707f, 16.0f)
                lineTo(11.237f, 13.53f)
                curveTo(10.554f, 12.847f, 9.446f, 12.847f, 8.763f, 13.53f)
                lineTo(6.293f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 15.105f, 15.105f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(13.707f)
                close()
                moveTo(7.707f, 16.0f)
                lineTo(9.47f, 14.237f)
                curveTo(9.763f, 13.944f, 10.237f, 13.944f, 10.53f, 14.237f)
                lineTo(12.293f, 16.0f)
                horizontalLineTo(7.707f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(13.207f)
                lineTo(11.237f, 7.03f)
                curveTo(10.554f, 6.347f, 9.446f, 6.347f, 8.763f, 7.03f)
                lineTo(6.793f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.207f, 9.0f)
                lineTo(9.47f, 7.737f)
                curveTo(9.763f, 7.445f, 10.237f, 7.445f, 10.53f, 7.737f)
                lineTo(11.793f, 9.0f)
                horizontalLineTo(8.207f)
                close()
                moveTo(15.0f, 6.0f)
                curveTo(15.0f, 6.552f, 14.552f, 7.0f, 14.0f, 7.0f)
                curveTo(13.448f, 7.0f, 13.0f, 6.552f, 13.0f, 6.0f)
                curveTo(13.0f, 5.448f, 13.448f, 5.0f, 14.0f, 5.0f)
                curveTo(14.552f, 5.0f, 15.0f, 5.448f, 15.0f, 6.0f)
                close()
                moveTo(14.0f, 13.5f)
                curveTo(14.552f, 13.5f, 15.0f, 13.052f, 15.0f, 12.5f)
                curveTo(15.0f, 11.948f, 14.552f, 11.5f, 14.0f, 11.5f)
                curveTo(13.448f, 11.5f, 13.0f, 11.948f, 13.0f, 12.5f)
                curveTo(13.0f, 13.052f, 13.448f, 13.5f, 14.0f, 13.5f)
                close()
            }
        }
        .build()
        return _imageStack!!
    }

@Suppress("ObjectPropertyName")
private var _imageStack: ImageVector? = null

@Preview
@Composable
private fun ImageStackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageStack, contentDescription = null)
    }
}

