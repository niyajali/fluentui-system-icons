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
 * TableStackRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, stack, right
 * - Source: ic_fluent_table_stack_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TableStackRight icon.
 */
public val FluentIcons.Regular.TableStackRight: ImageVector
    get() {
        if (_tableStackRight != null) {
            return _tableStackRight!!
        }
        _tableStackRight = Builder(name = "TableStackRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 3.75f)
                curveTo(15.5f, 3.336f, 15.164f, 3.0f, 14.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 21.0f, 15.5f, 20.664f, 15.5f, 20.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.5f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.0f, 8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(8.5f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(19.5f)
                close()
                moveTo(10.0f, 15.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                close()
                moveTo(19.5f, 3.75f)
                curveTo(19.5f, 3.336f, 19.836f, 3.0f, 20.25f, 3.0f)
                curveTo(20.664f, 3.0f, 21.0f, 3.336f, 21.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(21.0f, 20.664f, 20.664f, 21.0f, 20.25f, 21.0f)
                curveTo(19.836f, 21.0f, 19.5f, 20.664f, 19.5f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _tableStackRight!!
    }

@Suppress("ObjectPropertyName")
private var _tableStackRight: ImageVector? = null

@Preview
@Composable
private fun TableStackRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableStackRight, contentDescription = null)
    }
}

