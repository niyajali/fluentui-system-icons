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
 * TableCursor icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, cursor
 * - Source: ic_fluent_table_cursor_24_regular.svg
 * 
 * @return The [ImageVector] for the TableCursor icon.
 */
public val FluentIcons.Regular.TableCursor: ImageVector
    get() {
        if (_tableCursor != null) {
            return _tableCursor!!
        }
        _tableCursor = Builder(name = "TableCursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(15.953f)
                lineTo(19.239f, 14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.019f)
                curveTo(15.374f, 11.037f, 15.249f, 11.069f, 15.127f, 11.116f)
                curveTo(14.451f, 11.376f, 14.005f, 12.025f, 14.005f, 12.749f)
                lineTo(14.0f, 12.75f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.004f)
                lineTo(14.003f, 15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.001f)
                lineTo(14.001f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.5f)
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
                moveTo(4.5f, 15.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.486f, 12.05f)
                curveTo(15.776f, 11.939f, 16.104f, 12.017f, 16.312f, 12.248f)
                lineTo(22.677f, 19.305f)
                curveTo(22.897f, 19.55f, 22.932f, 19.91f, 22.763f, 20.193f)
                curveTo(22.593f, 20.476f, 22.259f, 20.615f, 21.939f, 20.535f)
                lineTo(18.402f, 19.657f)
                lineTo(16.372f, 22.671f)
                curveTo(16.188f, 22.945f, 15.846f, 23.066f, 15.531f, 22.97f)
                curveTo(15.215f, 22.873f, 15.0f, 22.582f, 15.0f, 22.252f)
                lineTo(15.005f, 12.75f)
                curveTo(15.005f, 12.439f, 15.196f, 12.161f, 15.486f, 12.05f)
                close()
            }
        }
        .build()
        return _tableCursor!!
    }

@Suppress("ObjectPropertyName")
private var _tableCursor: ImageVector? = null

@Preview
@Composable
private fun TableCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableCursor, contentDescription = null)
    }
}

