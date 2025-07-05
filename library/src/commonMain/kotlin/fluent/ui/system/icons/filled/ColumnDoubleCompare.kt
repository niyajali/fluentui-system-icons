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
 * ColumnDoubleCompare Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, visual studio
 * - Description: Used in reviewing informational differences.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_column_double_compare_20_filled.svg)
 * 
 * @return The [ImageVector] for the ColumnDoubleCompare icon.
 */
public val FluentIcons.Filled.ColumnDoubleCompare: ImageVector
    get() {
        if (_columnDoubleCompare != null) {
            return _columnDoubleCompare!!
        }
        _columnDoubleCompare = Builder(name = "ColumnDoubleCompare", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.47f, 3.0f, 1.961f, 3.211f, 1.586f, 3.586f)
                curveTo(1.211f, 3.961f, 1.0f, 4.47f, 1.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 15.53f, 1.211f, 16.039f, 1.586f, 16.414f)
                curveTo(1.961f, 16.789f, 2.47f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(7.53f, 17.0f, 8.039f, 16.789f, 8.414f, 16.414f)
                curveTo(8.789f, 16.039f, 9.0f, 15.53f, 9.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 4.47f, 8.789f, 3.961f, 8.414f, 3.586f)
                curveTo(8.039f, 3.211f, 7.53f, 3.0f, 7.0f, 3.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.037f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(12.47f, 3.0f, 11.961f, 3.211f, 11.586f, 3.586f)
                curveTo(11.211f, 3.961f, 11.0f, 4.47f, 11.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 15.53f, 11.211f, 16.039f, 11.586f, 16.414f)
                curveTo(11.961f, 16.789f, 12.47f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.53f, 17.0f, 18.039f, 16.789f, 18.414f, 16.414f)
                curveTo(18.789f, 16.039f, 19.0f, 15.53f, 19.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 4.47f, 18.789f, 3.961f, 18.414f, 3.586f)
                curveTo(18.039f, 3.211f, 17.53f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _columnDoubleCompare!!
    }

@Suppress("ObjectPropertyName")
private var _columnDoubleCompare: ImageVector? = null

@Preview
@Composable
private fun ColumnDoubleComparePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColumnDoubleCompare, contentDescription = "ColumnDoubleCompare Icon")
    }
}

