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
 * TableMultiple Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a data table collection.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_multiple_20_filled.svg)
 * 
 * @return The [ImageVector] for the TableMultiple icon.
 */
public val FluentIcons.Filled.TableMultiple: ImageVector
    get() {
        if (_tableMultiple != null) {
            return _tableMultiple!!
        }
        _tableMultiple = Builder(name = "TableMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.001f, 13.5f)
                curveTo(17.001f, 15.433f, 15.434f, 17.0f, 13.501f, 17.0f)
                lineTo(5.672f, 17.0f)
                curveTo(6.445f, 17.625f, 7.429f, 18.0f, 8.501f, 18.0f)
                horizontalLineTo(13.501f)
                curveTo(15.986f, 18.0f, 18.001f, 15.985f, 18.001f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(18.001f, 7.428f, 17.626f, 6.444f, 17.001f, 5.671f)
                lineTo(17.001f, 13.5f)
                close()
                moveTo(4.5f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 13.5f)
                curveTo(2.0f, 14.881f, 3.12f, 16.0f, 4.5f, 16.0f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                lineTo(11.0f, 7.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(12.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 14.881f, 14.881f, 16.0f, 13.5f, 16.0f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(2.0f, 6.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 2.0f)
                lineTo(4.5f, 2.0f)
                curveTo(3.12f, 2.0f, 2.0f, 3.119f, 2.0f, 4.5f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(7.0f, 2.0f)
                lineTo(11.0f, 2.0f)
                verticalLineTo(6.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(12.0f, 6.0f)
                lineTo(12.0f, 2.0f)
                lineTo(13.5f, 2.0f)
                curveTo(14.881f, 2.0f, 16.0f, 3.119f, 16.0f, 4.5f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _tableMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _tableMultiple: ImageVector? = null

@Preview
@Composable
private fun TableMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableMultiple, contentDescription = "TableMultiple Icon")
    }
}

