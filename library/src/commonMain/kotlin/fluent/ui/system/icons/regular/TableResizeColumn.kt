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
 * TableResizeColumn icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, resize, column
 * - Source: ic_fluent_table_resize_column_24_regular.svg
 * 
 * @return The [ImageVector] for the TableResizeColumn icon.
 */
public val FluentIcons.Regular.TableResizeColumn: ImageVector
    get() {
        if (_tableResizeColumn != null) {
            return _tableResizeColumn!!
        }
        _tableResizeColumn = Builder(name = "TableResizeColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.58f, 11.25f)
                horizontalLineTo(8.42f)
                lineTo(9.311f, 10.248f)
                curveTo(9.586f, 9.939f, 9.558f, 9.465f, 9.248f, 9.189f)
                curveTo(8.939f, 8.914f, 8.465f, 8.942f, 8.189f, 9.252f)
                lineTo(6.189f, 11.502f)
                curveTo(5.937f, 11.786f, 5.937f, 12.214f, 6.189f, 12.498f)
                lineTo(8.189f, 14.748f)
                curveTo(8.465f, 15.058f, 8.939f, 15.086f, 9.248f, 14.811f)
                curveTo(9.558f, 14.535f, 9.586f, 14.061f, 9.311f, 13.752f)
                lineTo(8.42f, 12.75f)
                horizontalLineTo(15.58f)
                lineTo(14.689f, 13.752f)
                curveTo(14.414f, 14.061f, 14.442f, 14.535f, 14.752f, 14.811f)
                curveTo(15.061f, 15.086f, 15.535f, 15.058f, 15.811f, 14.748f)
                lineTo(17.811f, 12.498f)
                curveTo(17.814f, 12.494f, 17.818f, 12.49f, 17.821f, 12.486f)
                curveTo(17.926f, 12.363f, 17.992f, 12.205f, 17.999f, 12.031f)
                curveTo(18.0f, 12.011f, 18.0f, 11.991f, 17.999f, 11.971f)
                curveTo(17.993f, 11.79f, 17.921f, 11.625f, 17.808f, 11.499f)
                lineTo(15.811f, 9.252f)
                curveTo(15.535f, 8.942f, 15.061f, 8.914f, 14.752f, 9.189f)
                curveTo(14.442f, 9.465f, 14.414f, 9.939f, 14.689f, 10.248f)
                lineTo(15.58f, 11.25f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(19.5f, 6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.647f)
                lineTo(16.558f, 8.587f)
                curveTo(16.397f, 8.406f, 16.206f, 8.266f, 16.0f, 8.168f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.168f)
                curveTo(7.794f, 8.266f, 7.603f, 8.406f, 7.442f, 8.587f)
                lineTo(6.5f, 9.647f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.353f)
                lineTo(7.442f, 15.413f)
                curveTo(7.603f, 15.594f, 7.794f, 15.734f, 8.0f, 15.832f)
                verticalLineTo(19.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.832f)
                curveTo(16.206f, 15.734f, 16.397f, 15.594f, 16.558f, 15.413f)
                lineTo(17.5f, 14.353f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _tableResizeColumn!!
    }

@Suppress("ObjectPropertyName")
private var _tableResizeColumn: ImageVector? = null

@Preview
@Composable
private fun TableResizeColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableResizeColumn, contentDescription = null)
    }
}

