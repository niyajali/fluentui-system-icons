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
 * TableInsertColumn Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used in adding cells into table scenarios. Contains column, row variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_insert_column_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableInsertColumn icon.
 */
public val FluentIcons.Regular.TableInsertColumn: ImageVector
    get() {
        if (_tableInsertColumn != null) {
            return _tableInsertColumn!!
        }
        _tableInsertColumn = Builder(name = "TableInsertColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.75f)
                lineTo(4.5f, 20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21.0f, 3.75f, 21.0f)
                curveTo(3.336f, 21.0f, 3.0f, 20.664f, 3.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(3.0f, 3.336f, 3.336f, 3.0f, 3.75f, 3.0f)
                curveTo(4.164f, 3.0f, 4.5f, 3.336f, 4.5f, 3.75f)
                close()
                moveTo(14.25f, 3.0f)
                curveTo(15.493f, 3.0f, 16.5f, 4.007f, 16.5f, 5.25f)
                lineTo(16.5f, 18.75f)
                curveTo(16.5f, 19.993f, 15.493f, 21.0f, 14.25f, 21.0f)
                horizontalLineTo(9.75f)
                curveTo(8.507f, 21.0f, 7.5f, 19.993f, 7.5f, 18.75f)
                lineTo(7.5f, 5.25f)
                curveTo(7.5f, 4.007f, 8.507f, 3.0f, 9.75f, 3.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(15.0f, 5.25f)
                curveTo(15.0f, 4.836f, 14.664f, 4.5f, 14.25f, 4.5f)
                lineTo(9.75f, 4.5f)
                curveTo(9.336f, 4.5f, 9.0f, 4.836f, 9.0f, 5.25f)
                verticalLineTo(8.5f)
                lineTo(15.0f, 8.5f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                verticalLineTo(10.0f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 15.5f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 19.164f, 9.336f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 19.5f, 15.0f, 19.164f, 15.0f, 18.75f)
                verticalLineTo(15.5f)
                lineTo(9.0f, 15.5f)
                close()
                moveTo(21.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(21.0f, 3.336f, 20.664f, 3.0f, 20.25f, 3.0f)
                curveTo(19.836f, 3.0f, 19.5f, 3.336f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 20.664f, 19.836f, 21.0f, 20.25f, 21.0f)
                curveTo(20.664f, 21.0f, 21.0f, 20.664f, 21.0f, 20.25f)
                close()
            }
        }
        .build()
        return _tableInsertColumn!!
    }

@Suppress("ObjectPropertyName")
private var _tableInsertColumn: ImageVector? = null

@Preview
@Composable
private fun TableInsertColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableInsertColumn, contentDescription = "TableInsertColumn Icon")
    }
}

