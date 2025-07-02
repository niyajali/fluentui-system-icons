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
 * DocumentImage icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: document, image
 * - Source: ic_fluent_document_image_20_filled.svg
 * 
 * @return The [ImageVector] for the DocumentImage icon.
 */
public val FluentIcons.Filled.DocumentImage: ImageVector
    get() {
        if (_documentImage != null) {
            return _documentImage!!
        }
        _documentImage = Builder(name = "DocumentImage", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 17.328f, 15.328f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(10.663f)
                curveTo(10.879f, 17.545f, 11.0f, 17.037f, 11.0f, 16.5f)
                verticalLineTo(12.5f)
                curveTo(11.0f, 10.567f, 9.433f, 9.0f, 7.5f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 2.672f, 4.672f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(11.0f, 2.25f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.776f, 11.224f, 7.0f, 11.5f, 7.0f)
                horizontalLineTo(15.75f)
                lineTo(11.0f, 2.25f)
                close()
                moveTo(1.0f, 12.5f)
                curveTo(1.0f, 11.119f, 2.119f, 10.0f, 3.5f, 10.0f)
                horizontalLineTo(7.5f)
                curveTo(8.881f, 10.0f, 10.0f, 11.119f, 10.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(10.0f, 17.01f, 9.848f, 17.483f, 9.586f, 17.879f)
                lineTo(6.561f, 14.854f)
                curveTo(5.975f, 14.268f, 5.025f, 14.268f, 4.439f, 14.854f)
                lineTo(1.414f, 17.879f)
                curveTo(1.152f, 17.483f, 1.0f, 17.01f, 1.0f, 16.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(8.0f, 12.75f)
                curveTo(8.0f, 12.336f, 7.664f, 12.0f, 7.25f, 12.0f)
                curveTo(6.836f, 12.0f, 6.5f, 12.336f, 6.5f, 12.75f)
                curveTo(6.5f, 13.164f, 6.836f, 13.5f, 7.25f, 13.5f)
                curveTo(7.664f, 13.5f, 8.0f, 13.164f, 8.0f, 12.75f)
                close()
                moveTo(2.121f, 18.586f)
                curveTo(2.517f, 18.848f, 2.99f, 19.0f, 3.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(8.01f, 19.0f, 8.483f, 18.848f, 8.879f, 18.586f)
                lineTo(5.854f, 15.561f)
                curveTo(5.658f, 15.365f, 5.342f, 15.365f, 5.146f, 15.561f)
                lineTo(2.121f, 18.586f)
                close()
            }
        }
        .build()
        return _documentImage!!
    }

@Suppress("ObjectPropertyName")
private var _documentImage: ImageVector? = null

@Preview
@Composable
private fun DocumentImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentImage, contentDescription = null)
    }
}

