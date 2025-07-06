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
 * TableOffsetLessThanOrEqualTo Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a data table specifically around conditional formatting of the rows & columns.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_offset_less_than_or_equal_to_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableOffsetLessThanOrEqualTo icon.
 */
public val FluentIcons.Regular.TableOffsetLessThanOrEqualTo: ImageVector
    get() {
        if (_tableOffsetLessThanOrEqualTo != null) {
            return _tableOffsetLessThanOrEqualTo!!
        }
        _tableOffsetLessThanOrEqualTo = Builder(name = "TableOffsetLessThanOrEqualTo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 14.967f, 11.725f, 14.463f, 12.022f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.314f)
                curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21.0f, 12.022f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(8.5f)
                close()
                moveTo(17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(15.5f, 20.0f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 20.0f, 20.0f, 20.224f, 20.0f, 20.5f)
                curveTo(20.0f, 20.776f, 19.776f, 21.0f, 19.5f, 21.0f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 21.0f, 15.0f, 20.776f, 15.0f, 20.5f)
                curveTo(15.0f, 20.224f, 15.224f, 20.0f, 15.5f, 20.0f)
                close()
                moveTo(18.89f, 14.188f)
                curveTo(19.063f, 14.403f, 19.028f, 14.718f, 18.812f, 14.89f)
                lineTo(16.8f, 16.5f)
                lineTo(18.812f, 18.11f)
                curveTo(19.028f, 18.282f, 19.063f, 18.597f, 18.89f, 18.812f)
                curveTo(18.718f, 19.028f, 18.403f, 19.063f, 18.188f, 18.89f)
                lineTo(15.688f, 16.89f)
                curveTo(15.569f, 16.795f, 15.5f, 16.652f, 15.5f, 16.5f)
                curveTo(15.5f, 16.348f, 15.569f, 16.205f, 15.688f, 16.11f)
                lineTo(18.188f, 14.11f)
                curveTo(18.403f, 13.937f, 18.718f, 13.972f, 18.89f, 14.188f)
                close()
            }
        }
        .build()
        return _tableOffsetLessThanOrEqualTo!!
    }

@Suppress("ObjectPropertyName")
private var _tableOffsetLessThanOrEqualTo: ImageVector? = null

@Preview
@Composable
private fun TableOffsetLessThanOrEqualToPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableOffsetLessThanOrEqualTo, contentDescription = "TableOffsetLessThanOrEqualTo Icon")
    }
}

