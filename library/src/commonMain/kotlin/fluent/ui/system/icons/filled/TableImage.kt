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
 * TableImage Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a data table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_image_20_filled.svg)
 * 
 * @return The [ImageVector] for the TableImage icon.
 */
public val FluentIcons.Filled.TableImage: ImageVector
    get() {
        if (_tableImage != null) {
            return _tableImage!!
        }
        _tableImage = Builder(name = "TableImage", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 9.0f)
                curveTo(16.67f, 9.0f, 16.837f, 9.012f, 17.0f, 9.035f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(9.0f, 16.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.035f)
                curveTo(9.012f, 16.837f, 9.0f, 16.67f, 9.0f, 16.5f)
                close()
                moveTo(9.035f, 12.0f)
                curveTo(9.255f, 10.467f, 10.467f, 9.255f, 12.0f, 9.035f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.035f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(3.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(13.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(7.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(10.0f, 12.5f)
                curveTo(10.0f, 11.119f, 11.119f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 10.0f, 19.0f, 11.119f, 19.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 17.01f, 18.848f, 17.483f, 18.586f, 17.879f)
                lineTo(15.561f, 14.854f)
                curveTo(14.975f, 14.268f, 14.025f, 14.268f, 13.439f, 14.854f)
                lineTo(10.414f, 17.879f)
                curveTo(10.152f, 17.483f, 10.0f, 17.01f, 10.0f, 16.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(17.0f, 12.75f)
                curveTo(17.0f, 12.336f, 16.664f, 12.0f, 16.25f, 12.0f)
                curveTo(15.836f, 12.0f, 15.5f, 12.336f, 15.5f, 12.75f)
                curveTo(15.5f, 13.164f, 15.836f, 13.5f, 16.25f, 13.5f)
                curveTo(16.664f, 13.5f, 17.0f, 13.164f, 17.0f, 12.75f)
                close()
                moveTo(11.121f, 18.586f)
                curveTo(11.517f, 18.848f, 11.991f, 19.0f, 12.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.01f, 19.0f, 17.483f, 18.848f, 17.879f, 18.586f)
                lineTo(14.854f, 15.561f)
                curveTo(14.658f, 15.365f, 14.342f, 15.365f, 14.146f, 15.561f)
                lineTo(11.121f, 18.586f)
                close()
            }
        }
        .build()
        return _tableImage!!
    }

@Suppress("ObjectPropertyName")
private var _tableImage: ImageVector? = null

@Preview
@Composable
private fun TableImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableImage, contentDescription = "TableImage Icon")
    }
}

