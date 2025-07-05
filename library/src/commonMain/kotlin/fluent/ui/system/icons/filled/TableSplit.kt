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
 * TableSplit Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, excel
 * - Description: Used in splitting table scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_split_20_filled.svg)
 * 
 * @return The [ImageVector] for the TableSplit icon.
 */
public val FluentIcons.Filled.TableSplit: ImageVector
    get() {
        if (_tableSplit != null) {
            return _tableSplit!!
        }
        _tableSplit = Builder(name = "TableSplit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 2.0f, 3.0f, 2.224f, 3.0f, 2.5f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 5.105f, 3.895f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 6.0f, 17.0f, 5.105f, 17.0f, 4.0f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.224f, 16.776f, 2.0f, 16.5f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(17.0f, 17.5f)
                curveTo(17.0f, 17.776f, 16.776f, 18.0f, 16.5f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 14.0f, 17.0f, 14.895f, 17.0f, 16.0f)
                verticalLineTo(17.5f)
                close()
                moveTo(12.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                lineTo(12.0f, 14.0f)
                close()
                moveTo(3.5f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 14.0f, 3.0f, 14.895f, 3.0f, 16.0f)
                lineTo(3.0f, 17.5f)
                curveTo(3.0f, 17.776f, 3.224f, 18.0f, 3.5f, 18.0f)
                close()
                moveTo(2.5f, 9.5f)
                horizontalLineTo(17.505f)
                curveTo(17.784f, 9.5f, 18.008f, 9.727f, 18.005f, 10.005f)
                curveTo(18.002f, 10.279f, 17.779f, 10.5f, 17.505f, 10.5f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 10.5f, 2.0f, 10.276f, 2.0f, 10.0f)
                curveTo(2.0f, 9.724f, 2.224f, 9.5f, 2.5f, 9.5f)
                close()
            }
        }
        .build()
        return _tableSplit!!
    }

@Suppress("ObjectPropertyName")
private var _tableSplit: ImageVector? = null

@Preview
@Composable
private fun TableSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSplit, contentDescription = "TableSplit Icon")
    }
}

