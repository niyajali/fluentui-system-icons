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
 * TableCopy icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: table, copy
 * - Source: ic_fluent_table_copy_20_regular.svg
 * 
 * @return The [ImageVector] for the TableCopy icon.
 */
public val FluentIcons.Regular.TableCopy: ImageVector
    get() {
        if (_tableCopy != null) {
            return _tableCopy!!
        }
        _tableCopy = Builder(name = "TableCopy", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                curveTo(3.0f, 15.433f, 4.567f, 17.0f, 6.5f, 17.0f)
                lineTo(14.329f, 17.0f)
                curveTo(13.556f, 17.625f, 12.572f, 18.0f, 11.5f, 18.0f)
                lineTo(6.5f, 18.0f)
                curveTo(4.015f, 18.0f, 2.0f, 15.985f, 2.0f, 13.5f)
                lineTo(2.0f, 8.5f)
                curveTo(2.0f, 7.428f, 2.375f, 6.444f, 3.0f, 5.671f)
                lineTo(3.0f, 13.5f)
                close()
                moveTo(4.732f, 15.268f)
                curveTo(4.263f, 14.799f, 4.0f, 14.163f, 4.0f, 13.5f)
                lineTo(4.0f, 4.5f)
                curveTo(4.0f, 3.837f, 4.263f, 3.201f, 4.732f, 2.732f)
                curveTo(5.201f, 2.263f, 5.837f, 2.0f, 6.5f, 2.0f)
                lineTo(15.5f, 2.0f)
                curveTo(16.163f, 2.0f, 16.799f, 2.263f, 17.268f, 2.732f)
                curveTo(17.737f, 3.201f, 18.0f, 3.837f, 18.0f, 4.5f)
                verticalLineTo(13.5f)
                curveTo(18.0f, 14.163f, 17.737f, 14.799f, 17.268f, 15.268f)
                curveTo(16.799f, 15.737f, 16.163f, 16.0f, 15.5f, 16.0f)
                lineTo(6.5f, 16.0f)
                curveTo(5.837f, 16.0f, 5.201f, 15.737f, 4.732f, 15.268f)
                close()
                moveTo(17.0f, 6.0f)
                lineTo(17.0f, 4.5f)
                curveTo(17.0f, 4.127f, 16.861f, 3.768f, 16.61f, 3.492f)
                curveTo(16.36f, 3.216f, 16.015f, 3.043f, 15.644f, 3.007f)
                lineTo(15.5f, 3.0f)
                lineTo(14.0f, 3.0f)
                verticalLineTo(6.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.0f, 3.0f)
                lineTo(6.5f, 3.0f)
                curveTo(6.127f, 3.0f, 5.768f, 3.139f, 5.492f, 3.39f)
                curveTo(5.216f, 3.64f, 5.043f, 3.985f, 5.007f, 4.356f)
                lineTo(5.0f, 4.5f)
                verticalLineTo(6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(9.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineTo(15.0f)
                lineTo(13.0f, 15.0f)
                verticalLineTo(12.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(6.5f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 13.5f)
                curveTo(5.0f, 13.873f, 5.139f, 14.232f, 5.39f, 14.508f)
                curveTo(5.64f, 14.784f, 5.985f, 14.957f, 6.356f, 14.993f)
                lineTo(6.5f, 15.0f)
                close()
                moveTo(14.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.5f)
                curveTo(15.873f, 15.0f, 16.232f, 14.861f, 16.508f, 14.61f)
                curveTo(16.784f, 14.36f, 16.957f, 14.015f, 16.993f, 13.644f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                lineTo(14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _tableCopy!!
    }

@Suppress("ObjectPropertyName")
private var _tableCopy: ImageVector? = null

@Preview
@Composable
private fun TableCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableCopy, contentDescription = null)
    }
}

