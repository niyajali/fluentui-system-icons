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
 * TableSimpleMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, simple, multiple
 * - Source: ic_fluent_table_simple_multiple_24_regular.svg
 * 
 * @return The [ImageVector] for the TableSimpleMultiple icon.
 */
public val FluentIcons.Regular.TableSimpleMultiple: ImageVector
    get() {
        if (_tableSimpleMultiple != null) {
            return _tableSimpleMultiple!!
        }
        _tableSimpleMultiple = Builder(name = "TableSimpleMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 2.0f)
                curveTo(3.455f, 2.0f, 2.0f, 3.455f, 2.0f, 5.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.545f, 3.455f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 19.0f, 19.0f, 17.545f, 19.0f, 15.75f)
                verticalLineTo(5.25f)
                curveTo(19.0f, 3.455f, 17.545f, 2.0f, 15.75f, 2.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 5.25f)
                curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(5.25f)
                close()
                moveTo(11.5f, 10.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 3.5f, 17.5f, 4.284f, 17.5f, 5.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(3.5f, 11.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
                verticalLineTo(11.5f)
                close()
                moveTo(11.5f, 11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 16.716f, 16.716f, 17.5f, 15.75f, 17.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(8.251f, 22.0f)
                curveTo(6.899f, 22.0f, 5.74f, 21.174f, 5.25f, 20.0f)
                horizontalLineTo(7.026f)
                curveTo(7.342f, 20.309f, 7.774f, 20.5f, 8.251f, 20.5f)
                horizontalLineTo(16.501f)
                curveTo(18.71f, 20.5f, 20.501f, 18.709f, 20.501f, 16.5f)
                verticalLineTo(8.25f)
                curveTo(20.501f, 7.773f, 20.31f, 7.341f, 20.001f, 7.025f)
                verticalLineTo(5.25f)
                curveTo(21.175f, 5.74f, 22.001f, 6.898f, 22.001f, 8.25f)
                verticalLineTo(16.5f)
                curveTo(22.001f, 19.538f, 19.538f, 22.0f, 16.501f, 22.0f)
                horizontalLineTo(8.251f)
                close()
            }
        }
        .build()
        return _tableSimpleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _tableSimpleMultiple: ImageVector? = null

@Preview
@Composable
private fun TableSimpleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSimpleMultiple, contentDescription = null)
    }
}

