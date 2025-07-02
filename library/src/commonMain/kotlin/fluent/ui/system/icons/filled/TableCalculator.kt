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
 * TableCalculator icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: table, calculator
 * - Source: ic_fluent_table_calculator_20_filled.svg
 * 
 * @return The [ImageVector] for the TableCalculator icon.
 */
public val FluentIcons.Filled.TableCalculator: ImageVector
    get() {
        if (_tableCalculator != null) {
            return _tableCalculator!!
        }
        _tableCalculator = Builder(name = "TableCalculator", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 8.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.5f)
                curveTo(11.0f, 9.682f, 11.393f, 8.956f, 12.0f, 8.5f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.881f, 4.119f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(7.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveTo(12.0f, 9.672f, 12.672f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 9.0f, 19.0f, 9.672f, 19.0f, 10.5f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 19.0f, 12.0f, 18.328f, 12.0f, 17.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(14.5f, 13.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 13.0f, 13.0f, 13.224f, 13.0f, 13.5f)
                curveTo(13.0f, 13.776f, 13.224f, 14.0f, 13.5f, 14.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 14.0f, 15.0f, 13.776f, 15.0f, 13.5f)
                curveTo(15.0f, 13.224f, 14.776f, 13.0f, 14.5f, 13.0f)
                close()
                moveTo(18.0f, 13.5f)
                curveTo(18.0f, 13.224f, 17.776f, 13.0f, 17.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.224f, 13.0f, 16.0f, 13.224f, 16.0f, 13.5f)
                curveTo(16.0f, 13.776f, 16.224f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 14.0f, 18.0f, 13.776f, 18.0f, 13.5f)
                close()
                moveTo(14.5f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 15.0f, 13.0f, 15.224f, 13.0f, 15.5f)
                curveTo(13.0f, 15.776f, 13.224f, 16.0f, 13.5f, 16.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 16.0f, 15.0f, 15.776f, 15.0f, 15.5f)
                curveTo(15.0f, 15.224f, 14.776f, 15.0f, 14.5f, 15.0f)
                close()
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 15.224f, 17.776f, 15.0f, 17.5f, 15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.224f, 15.0f, 16.0f, 15.224f, 16.0f, 15.5f)
                curveTo(16.0f, 15.776f, 16.224f, 16.0f, 16.5f, 16.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 16.0f, 18.0f, 15.776f, 18.0f, 15.5f)
                close()
                moveTo(14.5f, 17.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 17.0f, 13.0f, 17.224f, 13.0f, 17.5f)
                curveTo(13.0f, 17.776f, 13.224f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 18.0f, 15.0f, 17.776f, 15.0f, 17.5f)
                curveTo(15.0f, 17.224f, 14.776f, 17.0f, 14.5f, 17.0f)
                close()
                moveTo(18.0f, 17.5f)
                curveTo(18.0f, 17.224f, 17.776f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(16.5f)
                curveTo(16.224f, 17.0f, 16.0f, 17.224f, 16.0f, 17.5f)
                curveTo(16.0f, 17.776f, 16.224f, 18.0f, 16.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 18.0f, 18.0f, 17.776f, 18.0f, 17.5f)
                close()
                moveTo(13.5f, 10.0f)
                curveTo(13.224f, 10.0f, 13.0f, 10.224f, 13.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 11.776f, 13.224f, 12.0f, 13.5f, 12.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 12.0f, 18.0f, 11.776f, 18.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(18.0f, 10.224f, 17.776f, 10.0f, 17.5f, 10.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _tableCalculator!!
    }

@Suppress("ObjectPropertyName")
private var _tableCalculator: ImageVector? = null

@Preview
@Composable
private fun TableCalculatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableCalculator, contentDescription = null)
    }
}

