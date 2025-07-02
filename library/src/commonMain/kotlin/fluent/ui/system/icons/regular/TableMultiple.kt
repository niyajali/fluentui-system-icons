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
 * TableMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: table, multiple
 * - Source: ic_fluent_table_multiple_20_regular.svg
 * 
 * @return The [ImageVector] for the TableMultiple icon.
 */
public val FluentIcons.Regular.TableMultiple: ImageVector
    get() {
        if (_tableMultiple != null) {
            return _tableMultiple!!
        }
        _tableMultiple = Builder(name = "TableMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.672f, 17.0f)
                lineTo(13.506f, 17.0f)
                curveTo(14.465f, 16.999f, 15.333f, 16.612f, 15.964f, 15.986f)
                lineTo(15.975f, 15.975f)
                lineTo(15.987f, 15.964f)
                curveTo(16.613f, 15.331f, 17.0f, 14.461f, 17.0f, 13.5f)
                lineTo(17.0f, 5.671f)
                curveTo(17.626f, 6.444f, 18.0f, 7.428f, 18.0f, 8.5f)
                lineTo(18.0f, 13.5f)
                curveTo(18.0f, 15.985f, 15.986f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(8.501f)
                curveTo(7.429f, 18.0f, 6.445f, 17.625f, 5.672f, 17.0f)
                close()
                moveTo(15.268f, 2.732f)
                curveTo(15.737f, 3.201f, 16.0f, 3.837f, 16.0f, 4.5f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 14.163f, 15.737f, 14.799f, 15.268f, 15.268f)
                curveTo(14.799f, 15.737f, 14.163f, 16.0f, 13.5f, 16.0f)
                lineTo(4.5f, 16.0f)
                curveTo(3.837f, 16.0f, 3.201f, 15.737f, 2.732f, 15.268f)
                curveTo(2.263f, 14.799f, 2.0f, 14.163f, 2.0f, 13.5f)
                lineTo(2.0f, 4.5f)
                curveTo(2.0f, 3.837f, 2.263f, 3.201f, 2.732f, 2.732f)
                curveTo(3.201f, 2.263f, 3.837f, 2.0f, 4.5f, 2.0f)
                lineTo(13.5f, 2.0f)
                curveTo(14.163f, 2.0f, 14.799f, 2.263f, 15.268f, 2.732f)
                close()
                moveTo(4.5f, 3.0f)
                lineTo(4.356f, 3.007f)
                curveTo(3.985f, 3.043f, 3.64f, 3.216f, 3.39f, 3.492f)
                curveTo(3.139f, 3.768f, 3.0f, 4.127f, 3.0f, 4.5f)
                lineTo(3.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 3.0f)
                lineTo(4.5f, 3.0f)
                close()
                moveTo(11.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineTo(7.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(15.0f, 4.5f)
                lineTo(14.993f, 4.356f)
                curveTo(14.957f, 3.985f, 14.784f, 3.64f, 14.508f, 3.39f)
                curveTo(14.232f, 3.139f, 13.873f, 3.0f, 13.5f, 3.0f)
                lineTo(12.0f, 3.0f)
                verticalLineTo(6.0f)
                lineTo(15.0f, 6.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineTo(15.0f)
                lineTo(11.0f, 15.0f)
                verticalLineTo(12.0f)
                lineTo(7.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.5f)
                lineTo(13.644f, 14.993f)
                curveTo(14.015f, 14.957f, 14.36f, 14.784f, 14.61f, 14.508f)
                curveTo(14.861f, 14.232f, 15.0f, 13.873f, 15.0f, 13.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(3.492f, 14.61f)
                curveTo(3.768f, 14.861f, 4.127f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 12.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 13.5f)
                lineTo(3.007f, 13.644f)
                curveTo(3.043f, 14.015f, 3.216f, 14.36f, 3.492f, 14.61f)
                close()
                moveTo(3.0f, 7.0f)
                lineTo(3.0f, 11.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _tableMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _tableMultiple: ImageVector? = null

@Preview
@Composable
private fun TableMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableMultiple, contentDescription = null)
    }
}

