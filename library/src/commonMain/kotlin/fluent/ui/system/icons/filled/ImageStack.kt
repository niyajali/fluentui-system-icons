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
 * ImageStack icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: image, stack
 * - Source: ic_fluent_image_stack_20_filled.svg
 * 
 * @return The [ImageVector] for the ImageStack icon.
 */
public val FluentIcons.Filled.ImageStack: ImageVector
    get() {
        if (_imageStack != null) {
            return _imageStack!!
        }
        _imageStack = Builder(name = "ImageStack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.293f)
                lineTo(8.763f, 6.53f)
                curveTo(9.446f, 5.847f, 10.554f, 5.847f, 11.237f, 6.53f)
                lineTo(13.707f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.438f, 15.989f, 16.639f, 14.639f, 16.932f)
                lineTo(11.237f, 13.53f)
                curveTo(10.554f, 12.847f, 9.446f, 12.847f, 8.763f, 13.53f)
                lineTo(5.361f, 16.932f)
                curveTo(4.011f, 16.639f, 3.0f, 15.438f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(6.707f, 17.0f)
                horizontalLineTo(13.293f)
                lineTo(10.53f, 14.237f)
                curveTo(10.237f, 13.944f, 9.763f, 13.944f, 9.47f, 14.237f)
                lineTo(6.707f, 17.0f)
                close()
                moveTo(7.707f, 9.0f)
                horizontalLineTo(12.293f)
                lineTo(10.53f, 7.237f)
                curveTo(10.237f, 6.945f, 9.763f, 6.945f, 9.47f, 7.237f)
                lineTo(7.707f, 9.0f)
                close()
                moveTo(15.5f, 5.5f)
                curveTo(15.5f, 6.052f, 15.052f, 6.5f, 14.5f, 6.5f)
                curveTo(13.948f, 6.5f, 13.5f, 6.052f, 13.5f, 5.5f)
                curveTo(13.5f, 4.948f, 13.948f, 4.5f, 14.5f, 4.5f)
                curveTo(15.052f, 4.5f, 15.5f, 4.948f, 15.5f, 5.5f)
                close()
                moveTo(14.5f, 13.5f)
                curveTo(15.052f, 13.5f, 15.5f, 13.052f, 15.5f, 12.5f)
                curveTo(15.5f, 11.948f, 15.052f, 11.5f, 14.5f, 11.5f)
                curveTo(13.948f, 11.5f, 13.5f, 11.948f, 13.5f, 12.5f)
                curveTo(13.5f, 13.052f, 13.948f, 13.5f, 14.5f, 13.5f)
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
        Image(imageVector = FluentIcons.Filled.ImageStack, contentDescription = null)
    }
}

