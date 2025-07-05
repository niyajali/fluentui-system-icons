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
 * TableCellEdit Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used in editing cell scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_cell_edit_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableCellEdit icon.
 */
public val FluentIcons.Regular.TableCellEdit: ImageVector
    get() {
        if (_tableCellEdit != null) {
            return _tableCellEdit!!
        }
        _tableCellEdit = Builder(name = "TableCellEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.75f)
                curveTo(3.0f, 7.507f, 4.007f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(18.75f)
                curveTo(19.731f, 6.5f, 20.566f, 7.128f, 20.873f, 8.004f)
                curveTo(20.821f, 8.001f, 20.768f, 8.0f, 20.715f, 8.0f)
                horizontalLineTo(20.713f)
                curveTo(20.247f, 8.0f, 19.781f, 8.099f, 19.348f, 8.297f)
                curveTo(19.211f, 8.117f, 18.994f, 8.0f, 18.75f, 8.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 11.853f)
                lineTo(14.0f, 13.353f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(13.353f)
                lineTo(12.488f, 14.865f)
                curveTo(12.295f, 15.058f, 12.125f, 15.271f, 11.98f, 15.5f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 15.5f, 3.0f, 14.493f, 3.0f, 13.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(4.836f, 8.0f, 4.5f, 8.336f, 4.5f, 8.75f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 13.664f, 4.836f, 14.0f, 5.25f, 14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 8.0f)
                horizontalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.715f, 9.0f)
                horizontalLineTo(20.713f)
                curveTo(20.128f, 9.0f, 19.544f, 9.223f, 19.098f, 9.669f)
                lineTo(13.196f, 15.572f)
                curveTo(12.851f, 15.916f, 12.607f, 16.347f, 12.489f, 16.819f)
                lineTo(12.031f, 18.65f)
                curveTo(11.833f, 19.446f, 12.554f, 20.167f, 13.35f, 19.968f)
                lineTo(15.18f, 19.511f)
                curveTo(15.653f, 19.393f, 16.084f, 19.149f, 16.428f, 18.804f)
                lineTo(22.33f, 12.902f)
                curveTo(23.223f, 12.009f, 23.223f, 10.562f, 22.33f, 9.669f)
                curveTo(21.884f, 9.223f, 21.3f, 9.0f, 20.715f, 9.0f)
                close()
            }
        }
        .build()
        return _tableCellEdit!!
    }

@Suppress("ObjectPropertyName")
private var _tableCellEdit: ImageVector? = null

@Preview
@Composable
private fun TableCellEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableCellEdit, contentDescription = "TableCellEdit Icon")
    }
}

