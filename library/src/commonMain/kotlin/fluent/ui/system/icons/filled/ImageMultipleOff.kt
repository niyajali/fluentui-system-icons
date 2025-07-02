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
 * ImageMultipleOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: image, multiple, off
 * - Source: ic_fluent_image_multiple_off_20_filled.svg
 * 
 * @return The [ImageVector] for the ImageMultipleOff icon.
 */
public val FluentIcons.Filled.ImageMultipleOff: ImageVector
    get() {
        if (_imageMultipleOff != null) {
            return _imageMultipleOff!!
        }
        _imageMultipleOff = Builder(name = "ImageMultipleOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.555f, 4.262f)
                curveTo(3.205f, 4.752f, 3.0f, 5.352f, 3.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 12.648f, 3.205f, 13.248f, 3.555f, 13.738f)
                lineTo(7.586f, 9.707f)
                curveTo(7.843f, 9.45f, 8.154f, 9.277f, 8.482f, 9.189f)
                lineTo(14.596f, 15.303f)
                curveTo(14.012f, 15.741f, 13.286f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(5.764f)
                curveTo(6.313f, 16.614f, 7.112f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(13.563f, 17.0f, 14.539f, 16.632f, 15.309f, 16.016f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(15.797f, 13.676f)
                lineTo(16.562f, 14.44f)
                curveTo(16.843f, 13.853f, 17.0f, 13.195f, 17.0f, 12.5f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.112f, 16.614f, 6.313f, 16.0f, 5.764f)
                verticalLineTo(12.5f)
                curveTo(16.0f, 12.621f, 15.994f, 12.74f, 15.982f, 12.858f)
                curveTo(15.953f, 13.142f, 15.89f, 13.416f, 15.797f, 13.676f)
                close()
                moveTo(5.223f, 3.102f)
                lineTo(14.898f, 12.777f)
                curveTo(14.965f, 12.529f, 15.0f, 12.269f, 15.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.343f, 13.657f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.731f, 3.0f, 5.471f, 3.035f, 5.223f, 3.102f)
                close()
                moveTo(12.5f, 6.5f)
                curveTo(12.5f, 7.052f, 12.052f, 7.5f, 11.5f, 7.5f)
                curveTo(10.948f, 7.5f, 10.5f, 7.052f, 10.5f, 6.5f)
                curveTo(10.5f, 5.948f, 10.948f, 5.5f, 11.5f, 5.5f)
                curveTo(12.052f, 5.5f, 12.5f, 5.948f, 12.5f, 6.5f)
                close()
                moveTo(13.738f, 14.445f)
                lineTo(9.707f, 10.414f)
                curveTo(9.317f, 10.024f, 8.683f, 10.024f, 8.293f, 10.414f)
                lineTo(4.262f, 14.445f)
                curveTo(4.752f, 14.795f, 5.352f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(12.648f, 15.0f, 13.248f, 14.795f, 13.738f, 14.445f)
                close()
            }
        }
        .build()
        return _imageMultipleOff!!
    }

@Suppress("ObjectPropertyName")
private var _imageMultipleOff: ImageVector? = null

@Preview
@Composable
private fun ImageMultipleOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageMultipleOff, contentDescription = null)
    }
}

