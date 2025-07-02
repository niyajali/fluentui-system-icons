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
 * TableChecker icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: table, checker
 * - Source: ic_fluent_table_checker_20_filled.svg
 * 
 * @return The [ImageVector] for the TableChecker icon.
 */
public val FluentIcons.Filled.TableChecker: ImageVector
    get() {
        if (_tableChecker != null) {
            return _tableChecker!!
        }
        _tableChecker = Builder(name = "TableChecker", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.881f, 15.881f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 4.0f, 16.0f, 4.672f, 16.0f, 5.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.5f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 15.328f, 4.672f, 16.0f, 5.5f, 16.0f)
                close()
            }
        }
        .build()
        return _tableChecker!!
    }

@Suppress("ObjectPropertyName")
private var _tableChecker: ImageVector? = null

@Preview
@Composable
private fun TableCheckerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableChecker, contentDescription = null)
    }
}

