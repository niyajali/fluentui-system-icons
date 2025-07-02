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
 * ColumnArrowRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: column, arrow, right
 * - Source: ic_fluent_column_arrow_right_20_regular.svg
 * 
 * @return The [ImageVector] for the ColumnArrowRight icon.
 */
public val FluentIcons.Regular.ColumnArrowRight: ImageVector
    get() {
        if (_columnArrowRight != null) {
            return _columnArrowRight!!
        }
        _columnArrowRight = Builder(name = "ColumnArrowRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(5.552f, 3.0f, 6.0f, 3.448f, 6.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                curveTo(7.0f, 2.895f, 6.105f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 2.0f, 2.0f, 2.895f, 2.0f, 4.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.105f, 2.895f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(6.105f, 17.0f, 7.0f, 16.105f, 7.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 15.552f, 5.552f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 16.0f, 3.0f, 15.552f, 3.0f, 15.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(15.0f, 2.0f)
                curveTo(13.895f, 2.0f, 13.0f, 2.895f, 13.0f, 4.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 16.105f, 13.895f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 17.0f, 18.0f, 16.105f, 18.0f, 15.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.895f, 17.105f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(16.552f, 3.0f, 17.0f, 3.448f, 17.0f, 4.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.552f, 16.552f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(14.448f, 16.0f, 14.0f, 15.552f, 14.0f, 15.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 3.448f, 14.448f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(9.146f, 7.146f)
                curveTo(9.342f, 6.951f, 9.658f, 6.951f, 9.854f, 7.146f)
                lineTo(11.854f, 9.146f)
                curveTo(12.049f, 9.342f, 12.049f, 9.658f, 11.854f, 9.854f)
                lineTo(9.854f, 11.854f)
                curveTo(9.658f, 12.049f, 9.342f, 12.049f, 9.146f, 11.854f)
                curveTo(8.951f, 11.658f, 8.951f, 11.342f, 9.146f, 11.146f)
                lineTo(10.293f, 10.0f)
                lineTo(5.5f, 10.0f)
                curveTo(5.224f, 10.0f, 5.0f, 9.776f, 5.0f, 9.5f)
                curveTo(5.0f, 9.224f, 5.224f, 9.0f, 5.5f, 9.0f)
                lineTo(10.293f, 9.0f)
                lineTo(9.146f, 7.854f)
                curveTo(8.951f, 7.658f, 8.951f, 7.342f, 9.146f, 7.146f)
                close()
            }
        }
        .build()
        return _columnArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _columnArrowRight: ImageVector? = null

@Preview
@Composable
private fun ColumnArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColumnArrowRight, contentDescription = null)
    }
}

