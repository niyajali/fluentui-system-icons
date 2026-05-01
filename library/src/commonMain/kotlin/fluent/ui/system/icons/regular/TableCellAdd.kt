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
 * TableCellAdd Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent adding a new cell in a table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_cell_add_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableCellAdd icon.
 */
public val FluentIcons.Regular.TableCellAdd: ImageVector
    get() {
        if (_tableCellAdd != null) {
            return _tableCellAdd!!
        }
        _tableCellAdd = Builder(name = "TableCellAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.993f, 2.0f, 16.0f, 3.007f, 16.0f, 4.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 8.0f, 22.0f, 9.007f, 22.0f, 10.25f)
                verticalLineTo(12.811f)
                curveTo(21.556f, 12.385f, 21.051f, 12.021f, 20.5f, 11.733f)
                verticalLineTo(10.25f)
                curveTo(20.5f, 9.836f, 20.164f, 9.5f, 19.75f, 9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.176f)
                curveTo(15.472f, 11.3f, 14.969f, 11.489f, 14.5f, 11.733f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.733f)
                curveTo(11.489f, 14.969f, 11.3f, 15.472f, 11.176f, 16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.75f)
                curveTo(9.5f, 20.164f, 9.836f, 20.5f, 10.25f, 20.5f)
                horizontalLineTo(11.733f)
                curveTo(12.021f, 21.051f, 12.385f, 21.556f, 12.811f, 22.0f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 22.0f, 8.0f, 20.993f, 8.0f, 19.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 16.0f, 2.0f, 14.993f, 2.0f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 9.007f, 3.007f, 8.0f, 4.25f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.25f)
                curveTo(8.0f, 3.007f, 9.007f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(17.5f, 13.999f)
                curveTo(17.224f, 13.999f, 17.0f, 14.223f, 17.0f, 14.499f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.495f)
                curveTo(14.219f, 17.0f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.219f, 18.0f, 14.495f, 18.0f)
                horizontalLineTo(17.001f)
                verticalLineTo(20.504f)
                curveTo(17.001f, 20.78f, 17.225f, 21.004f, 17.501f, 21.004f)
                curveTo(17.777f, 21.004f, 18.001f, 20.78f, 18.001f, 20.504f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.497f)
                curveTo(20.773f, 18.0f, 20.996f, 17.776f, 20.996f, 17.5f)
                curveTo(20.996f, 17.224f, 20.773f, 17.0f, 20.497f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.499f)
                curveTo(18.0f, 14.223f, 17.776f, 13.999f, 17.5f, 13.999f)
                close()
                moveTo(4.25f, 9.5f)
                curveTo(3.836f, 9.5f, 3.5f, 9.836f, 3.5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(3.5f, 14.164f, 3.836f, 14.5f, 4.25f, 14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(10.25f, 3.5f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _tableCellAdd!!
    }

@Suppress("ObjectPropertyName")
private var _tableCellAdd: ImageVector? = null

@Preview
@Composable
private fun TableCellAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableCellAdd, contentDescription = "TableCellAdd Icon")
    }
}

