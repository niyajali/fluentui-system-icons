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
 * TableSimpleInclude icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, simple, include
 * - Source: ic_fluent_table_simple_include_24_regular.svg
 * 
 * @return The [ImageVector] for the TableSimpleInclude icon.
 */
public val FluentIcons.Regular.TableSimpleInclude: ImageVector
    get() {
        if (_tableSimpleInclude != null) {
            return _tableSimpleInclude!!
        }
        _tableSimpleInclude = Builder(name = "TableSimpleInclude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(11.423f)
                curveTo(20.611f, 10.955f, 20.093f, 10.598f, 19.5f, 10.407f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.337f)
                curveTo(12.176f, 10.472f, 11.661f, 10.76f, 11.25f, 11.155f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.155f)
                curveTo(10.76f, 11.661f, 10.472f, 12.176f, 10.337f, 12.75f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(10.407f)
                curveTo(10.598f, 20.093f, 10.955f, 20.611f, 11.423f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.25f, 13.5f)
                curveTo(11.25f, 12.257f, 12.257f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(18.5f)
                curveTo(19.743f, 11.25f, 20.75f, 12.257f, 20.75f, 13.5f)
                verticalLineTo(18.5f)
                curveTo(20.75f, 19.743f, 19.743f, 20.75f, 18.5f, 20.75f)
                horizontalLineTo(13.5f)
                curveTo(12.257f, 20.75f, 11.25f, 19.743f, 11.25f, 18.5f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _tableSimpleInclude!!
    }

@Suppress("ObjectPropertyName")
private var _tableSimpleInclude: ImageVector? = null

@Preview
@Composable
private fun TableSimpleIncludePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSimpleInclude, contentDescription = null)
    }
}

