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
 * TableSearch icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, search
 * - Source: ic_fluent_table_search_24_regular.svg
 * 
 * @return The [ImageVector] for the TableSearch icon.
 */
public val FluentIcons.Regular.TableSearch: ImageVector
    get() {
        if (_tableSearch != null) {
            return _tableSearch!!
        }
        _tableSearch = Builder(name = "TableSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(12.475f)
                lineTo(10.975f, 19.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.909f)
                curveTo(10.812f, 14.969f, 10.638f, 14.465f, 10.4f, 14.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.337f)
                curveTo(9.597f, 12.764f, 9.087f, 12.272f, 8.5f, 11.889f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.091f)
                curveTo(3.969f, 11.188f, 3.466f, 11.362f, 3.0f, 11.6f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 10.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(15.5f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.5f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(5.5f, 21.0f)
                curveTo(6.472f, 21.0f, 7.372f, 20.692f, 8.107f, 20.168f)
                lineTo(10.72f, 22.78f)
                curveTo(11.013f, 23.073f, 11.487f, 23.073f, 11.78f, 22.78f)
                curveTo(12.073f, 22.487f, 12.073f, 22.013f, 11.78f, 21.72f)
                lineTo(9.168f, 19.107f)
                curveTo(9.692f, 18.372f, 10.0f, 17.472f, 10.0f, 16.5f)
                curveTo(10.0f, 14.015f, 7.985f, 12.0f, 5.5f, 12.0f)
                curveTo(3.015f, 12.0f, 1.0f, 14.015f, 1.0f, 16.5f)
                curveTo(1.0f, 18.985f, 3.015f, 21.0f, 5.5f, 21.0f)
                close()
                moveTo(5.5f, 19.5f)
                curveTo(3.843f, 19.5f, 2.5f, 18.157f, 2.5f, 16.5f)
                curveTo(2.5f, 14.843f, 3.843f, 13.5f, 5.5f, 13.5f)
                curveTo(7.157f, 13.5f, 8.5f, 14.843f, 8.5f, 16.5f)
                curveTo(8.5f, 18.157f, 7.157f, 19.5f, 5.5f, 19.5f)
                close()
            }
        }
        .build()
        return _tableSearch!!
    }

@Suppress("ObjectPropertyName")
private var _tableSearch: ImageVector? = null

@Preview
@Composable
private fun TableSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSearch, contentDescription = null)
    }
}

