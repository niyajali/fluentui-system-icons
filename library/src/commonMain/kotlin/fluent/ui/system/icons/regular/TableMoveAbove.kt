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
 * TableMoveAbove icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, move, above
 * - Source: ic_fluent_table_move_above_24_regular.svg
 * 
 * @return The [ImageVector] for the TableMoveAbove icon.
 */
public val FluentIcons.Regular.TableMoveAbove: ImageVector
    get() {
        if (_tableMoveAbove != null) {
            return _tableMoveAbove!!
        }
        _tableMoveAbove = Builder(name = "TableMoveAbove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 4.5f)
                curveTo(20.664f, 4.5f, 21.0f, 4.164f, 21.0f, 3.75f)
                curveTo(21.0f, 3.336f, 20.664f, 3.0f, 20.25f, 3.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 3.0f, 3.0f, 3.336f, 3.0f, 3.75f)
                curveTo(3.0f, 4.164f, 3.336f, 4.5f, 3.75f, 4.5f)
                lineTo(20.25f, 4.5f)
                close()
                moveTo(20.25f, 8.5f)
                curveTo(20.664f, 8.5f, 21.0f, 8.836f, 21.0f, 9.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                lineTo(6.25f, 21.0f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(9.25f)
                curveTo(3.0f, 8.836f, 3.336f, 8.5f, 3.75f, 8.5f)
                lineTo(8.018f, 8.5f)
                curveTo(7.947f, 8.992f, 8.086f, 9.512f, 8.442f, 9.913f)
                curveTo(8.847f, 10.369f, 9.438f, 10.563f, 10.0f, 10.482f)
                verticalLineTo(14.0f)
                lineTo(14.0f, 14.0f)
                verticalLineTo(10.482f)
                curveTo(14.562f, 10.563f, 15.153f, 10.369f, 15.558f, 9.913f)
                curveTo(15.914f, 9.512f, 16.053f, 8.992f, 15.982f, 8.5f)
                lineTo(20.25f, 8.5f)
                close()
                moveTo(8.5f, 10.0f)
                lineTo(4.5f, 10.0f)
                lineTo(4.5f, 14.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.5f, 15.5f)
                horizontalLineTo(4.5f)
                lineTo(4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(14.0f, 19.5f)
                verticalLineTo(15.5f)
                lineTo(10.0f, 15.5f)
                verticalLineTo(19.5f)
                lineTo(14.0f, 19.5f)
                close()
                moveTo(15.5f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.5f)
                close()
                moveTo(15.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(14.811f, 9.248f)
                curveTo(14.535f, 9.558f, 14.061f, 9.586f, 13.752f, 9.311f)
                lineTo(12.75f, 8.42f)
                verticalLineTo(11.25f)
                curveTo(12.75f, 11.664f, 12.414f, 12.0f, 12.0f, 12.0f)
                curveTo(11.586f, 12.0f, 11.25f, 11.664f, 11.25f, 11.25f)
                verticalLineTo(8.42f)
                lineTo(10.248f, 9.311f)
                curveTo(9.939f, 9.586f, 9.465f, 9.558f, 9.189f, 9.248f)
                curveTo(8.914f, 8.939f, 8.942f, 8.465f, 9.252f, 8.189f)
                lineTo(11.502f, 6.189f)
                curveTo(11.786f, 5.937f, 12.214f, 5.937f, 12.498f, 6.189f)
                lineTo(14.748f, 8.189f)
                curveTo(15.058f, 8.465f, 15.086f, 8.939f, 14.811f, 9.248f)
                close()
            }
        }
        .build()
        return _tableMoveAbove!!
    }

@Suppress("ObjectPropertyName")
private var _tableMoveAbove: ImageVector? = null

@Preview
@Composable
private fun TableMoveAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableMoveAbove, contentDescription = null)
    }
}

