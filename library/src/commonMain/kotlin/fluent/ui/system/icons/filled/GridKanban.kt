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
 * GridKanban icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: grid, kanban
 * - Source: ic_fluent_grid_kanban_20_filled.svg
 * 
 * @return The [ImageVector] for the GridKanban icon.
 */
public val FluentIcons.Filled.GridKanban: ImageVector
    get() {
        if (_gridKanban != null) {
            return _gridKanban!!
        }
        _gridKanban = Builder(name = "GridKanban", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(2.448f, 2.0f, 2.0f, 2.448f, 2.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 5.552f, 2.448f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 6.0f, 9.0f, 5.552f, 9.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.448f, 8.552f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 8.0f)
                curveTo(2.448f, 8.0f, 2.0f, 8.448f, 2.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.552f, 2.448f, 12.0f, 3.0f, 12.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 12.0f, 9.0f, 11.552f, 9.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 8.448f, 8.552f, 8.0f, 8.0f, 8.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveTo(2.448f, 14.0f, 2.0f, 14.448f, 2.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.552f, 2.448f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 18.0f, 9.0f, 17.552f, 9.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 14.448f, 8.552f, 14.0f, 8.0f, 14.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(11.448f, 2.0f, 11.0f, 2.448f, 11.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 5.552f, 11.448f, 6.0f, 12.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 6.0f, 18.0f, 5.552f, 18.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 2.448f, 17.552f, 2.0f, 17.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(11.448f, 8.0f, 11.0f, 8.448f, 11.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 11.552f, 11.448f, 12.0f, 12.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 12.0f, 18.0f, 11.552f, 18.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.448f, 17.552f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _gridKanban!!
    }

@Suppress("ObjectPropertyName")
private var _gridKanban: ImageVector? = null

@Preview
@Composable
private fun GridKanbanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GridKanban, contentDescription = null)
    }
}

