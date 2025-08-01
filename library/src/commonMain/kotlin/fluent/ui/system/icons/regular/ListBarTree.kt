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
 * ListBarTree Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent stacked list view.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_list_bar_tree_20_regular.svg)
 * 
 * @return The [ImageVector] for the ListBarTree icon.
 */
public val FluentIcons.Regular.ListBarTree: ImageVector
    get() {
        if (_listBarTree != null) {
            return _listBarTree!!
        }
        _listBarTree = Builder(name = "ListBarTree", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 7.105f, 3.895f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(5.268f)
                curveTo(5.097f, 8.294f, 5.0f, 8.636f, 5.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 11.597f, 5.262f, 12.134f, 5.677f, 12.5f)
                curveTo(5.262f, 12.866f, 5.0f, 13.403f, 5.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 16.105f, 5.895f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 17.0f, 17.0f, 16.105f, 17.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 13.403f, 16.738f, 12.866f, 16.323f, 12.5f)
                curveTo(16.738f, 12.134f, 17.0f, 11.597f, 17.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 8.403f, 16.738f, 7.866f, 16.323f, 7.5f)
                curveTo(16.738f, 7.134f, 17.0f, 6.597f, 17.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.895f, 16.105f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 8.0f, 16.0f, 8.448f, 16.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 11.552f, 15.552f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(9.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 12.0f, 6.0f, 11.552f, 6.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 8.448f, 6.448f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 13.0f, 16.0f, 13.448f, 16.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 15.552f, 15.552f, 16.0f, 15.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 16.0f, 6.0f, 15.552f, 6.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 13.448f, 6.448f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 4.0f, 16.0f, 4.448f, 16.0f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 6.552f, 15.552f, 7.0f, 15.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 7.0f, 4.0f, 6.552f, 4.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _listBarTree!!
    }

@Suppress("ObjectPropertyName")
private var _listBarTree: ImageVector? = null

@Preview
@Composable
private fun ListBarTreePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ListBarTree, contentDescription = "ListBarTree Icon")
    }
}

