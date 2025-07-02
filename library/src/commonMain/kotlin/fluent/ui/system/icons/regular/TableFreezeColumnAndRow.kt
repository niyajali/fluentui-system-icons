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
 * TableFreezeColumnAndRow icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, freeze, column, and, row
 * - Source: ic_fluent_table_freeze_column_and_row_24_regular.svg
 * 
 * @return The [ImageVector] for the TableFreezeColumnAndRow icon.
 */
public val FluentIcons.Regular.TableFreezeColumnAndRow: ImageVector
    get() {
        if (_tableFreezeColumnAndRow != null) {
            return _tableFreezeColumnAndRow!!
        }
        _tableFreezeColumnAndRow = Builder(name = "TableFreezeColumnAndRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 8.5f, 8.5f, 8.836f, 8.5f, 9.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(15.5f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(14.0f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.0f)
                close()
                moveTo(15.5f, 19.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _tableFreezeColumnAndRow!!
    }

@Suppress("ObjectPropertyName")
private var _tableFreezeColumnAndRow: ImageVector? = null

@Preview
@Composable
private fun TableFreezeColumnAndRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableFreezeColumnAndRow, contentDescription = null)
    }
}

