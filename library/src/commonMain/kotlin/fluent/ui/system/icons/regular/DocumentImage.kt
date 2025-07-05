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
 * DocumentImage Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general file types and actions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_image_20_regular.svg)
 * 
 * @return The [ImageVector] for the DocumentImage icon.
 */
public val FluentIcons.Regular.DocumentImage: ImageVector
    get() {
        if (_documentImage != null) {
            return _documentImage!!
        }
        _documentImage = Builder(name = "DocumentImage", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.552f, 14.552f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(10.965f)
                curveTo(10.914f, 17.353f, 10.811f, 17.689f, 10.663f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 18.0f, 16.0f, 17.105f, 16.0f, 16.0f)
                verticalLineTo(7.414f)
                curveTo(16.0f, 7.016f, 15.842f, 6.635f, 15.561f, 6.354f)
                lineTo(11.646f, 2.439f)
                curveTo(11.365f, 2.158f, 10.984f, 2.0f, 10.586f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.793f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 7.0f, 11.0f, 6.776f, 11.0f, 6.5f)
                verticalLineTo(3.207f)
                lineTo(14.793f, 7.0f)
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
        Image(imageVector = FluentIcons.Regular.DocumentImage, contentDescription = "DocumentImage Icon")
    }
}

