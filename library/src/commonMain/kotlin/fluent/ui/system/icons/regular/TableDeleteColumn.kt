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
 * TableDeleteColumn icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, delete, column
 * - Source: ic_fluent_table_delete_column_24_regular.svg
 * 
 * @return The [ImageVector] for the TableDeleteColumn icon.
 */
public val FluentIcons.Regular.TableDeleteColumn: ImageVector
    get() {
        if (_tableDeleteColumn != null) {
            return _tableDeleteColumn!!
        }
        _tableDeleteColumn = Builder(name = "TableDeleteColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 3.75f)
                curveTo(22.0f, 3.336f, 21.664f, 3.0f, 21.25f, 3.0f)
                lineTo(20.25f, 3.0f)
                curveTo(18.455f, 3.0f, 17.0f, 4.455f, 17.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(17.0f, 19.545f, 18.455f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 21.0f, 22.0f, 20.664f, 22.0f, 20.25f)
                curveTo(22.0f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(19.284f, 19.5f, 18.5f, 18.716f, 18.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 15.5f, 22.0f, 15.164f, 22.0f, 14.75f)
                curveTo(22.0f, 14.336f, 21.664f, 14.0f, 21.25f, 14.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 10.0f, 22.0f, 9.664f, 22.0f, 9.25f)
                curveTo(22.0f, 8.836f, 21.664f, 8.5f, 21.25f, 8.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.284f, 19.284f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 4.5f, 22.0f, 4.164f, 22.0f, 3.75f)
                close()
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 3.336f, 2.336f, 3.0f, 2.75f, 3.0f)
                lineTo(3.75f, 3.0f)
                curveTo(5.545f, 3.0f, 7.0f, 4.455f, 7.0f, 6.25f)
                lineTo(7.0f, 17.75f)
                curveTo(7.0f, 19.545f, 5.545f, 21.0f, 3.75f, 21.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 21.0f, 2.0f, 20.664f, 2.0f, 20.25f)
                curveTo(2.0f, 19.836f, 2.336f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(4.716f, 19.5f, 5.5f, 18.716f, 5.5f, 17.75f)
                lineTo(5.5f, 15.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 15.5f, 2.0f, 15.164f, 2.0f, 14.75f)
                curveTo(2.0f, 14.336f, 2.336f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(5.5f)
                lineTo(5.5f, 10.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.0f, 2.0f, 9.664f, 2.0f, 9.25f)
                curveTo(2.0f, 8.836f, 2.336f, 8.5f, 2.75f, 8.5f)
                horizontalLineTo(5.5f)
                lineTo(5.5f, 6.25f)
                curveTo(5.5f, 5.284f, 4.716f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 4.5f, 2.0f, 4.164f, 2.0f, 3.75f)
                close()
                moveTo(10.939f, 12.0f)
                lineTo(9.47f, 13.47f)
                curveTo(9.177f, 13.763f, 9.177f, 14.237f, 9.47f, 14.53f)
                curveTo(9.763f, 14.823f, 10.237f, 14.823f, 10.53f, 14.53f)
                lineTo(12.0f, 13.061f)
                lineTo(13.47f, 14.53f)
                curveTo(13.763f, 14.823f, 14.237f, 14.823f, 14.53f, 14.53f)
                curveTo(14.823f, 14.237f, 14.823f, 13.763f, 14.53f, 13.47f)
                lineTo(13.061f, 12.0f)
                lineTo(14.53f, 10.53f)
                curveTo(14.823f, 10.237f, 14.823f, 9.763f, 14.53f, 9.47f)
                curveTo(14.237f, 9.177f, 13.763f, 9.177f, 13.47f, 9.47f)
                lineTo(12.0f, 10.939f)
                lineTo(10.53f, 9.47f)
                curveTo(10.237f, 9.177f, 9.763f, 9.177f, 9.47f, 9.47f)
                curveTo(9.177f, 9.763f, 9.177f, 10.237f, 9.47f, 10.53f)
                lineTo(10.939f, 12.0f)
                close()
                moveTo(11.25f, 8.727f)
                curveTo(11.276f, 8.75f, 11.301f, 8.774f, 11.326f, 8.799f)
                lineTo(12.0f, 9.473f)
                lineTo(12.674f, 8.799f)
                curveTo(12.699f, 8.774f, 12.724f, 8.75f, 12.75f, 8.727f)
                verticalLineTo(2.75f)
                curveTo(12.75f, 2.336f, 12.414f, 2.0f, 12.0f, 2.0f)
                curveTo(11.586f, 2.0f, 11.25f, 2.336f, 11.25f, 2.75f)
                lineTo(11.25f, 8.727f)
                close()
                moveTo(11.25f, 15.523f)
                verticalLineTo(21.25f)
                curveTo(11.25f, 21.664f, 11.586f, 22.0f, 12.0f, 22.0f)
                curveTo(12.414f, 22.0f, 12.75f, 21.664f, 12.75f, 21.25f)
                verticalLineTo(15.523f)
                curveTo(12.724f, 15.5f, 12.699f, 15.476f, 12.674f, 15.451f)
                lineTo(12.0f, 14.777f)
                lineTo(11.326f, 15.451f)
                curveTo(11.301f, 15.476f, 11.276f, 15.5f, 11.25f, 15.523f)
                close()
            }
        }
        .build()
        return _tableDeleteColumn!!
    }

@Suppress("ObjectPropertyName")
private var _tableDeleteColumn: ImageVector? = null

@Preview
@Composable
private fun TableDeleteColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableDeleteColumn, contentDescription = null)
    }
}

