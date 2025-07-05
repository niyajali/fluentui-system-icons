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
 * ListBarTreeOffset Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent stacked list view.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_list_bar_tree_offset_20_filled.svg)
 * 
 * @return The [ImageVector] for the ListBarTreeOffset icon.
 */
public val FluentIcons.Filled.ListBarTreeOffset: ImageVector
    get() {
        if (_listBarTreeOffset != null) {
            return _listBarTreeOffset!!
        }
        _listBarTreeOffset = Builder(name = "ListBarTreeOffset", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 7.0f, 17.0f, 6.328f, 17.0f, 5.5f)
                verticalLineTo(4.5f)
                curveTo(17.0f, 3.672f, 16.328f, 3.0f, 15.5f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 3.0f, 3.0f, 3.672f, 3.0f, 4.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 6.328f, 3.672f, 7.0f, 4.5f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 12.0f, 17.0f, 11.328f, 17.0f, 10.5f)
                verticalLineTo(9.5f)
                curveTo(17.0f, 8.672f, 16.328f, 8.0f, 15.5f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 8.0f, 5.0f, 8.672f, 5.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 11.328f, 5.672f, 12.0f, 6.5f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.5f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 13.0f, 17.0f, 13.672f, 17.0f, 14.5f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 16.328f, 16.328f, 17.0f, 15.5f, 17.0f)
                close()
                moveTo(8.5f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.5f)
                curveTo(7.672f, 17.0f, 7.0f, 16.328f, 7.0f, 15.5f)
                verticalLineTo(14.5f)
                curveTo(7.0f, 13.672f, 7.672f, 13.0f, 8.5f, 13.0f)
                close()
            }
        }
        .build()
        return _listBarTreeOffset!!
    }

@Suppress("ObjectPropertyName")
private var _listBarTreeOffset: ImageVector? = null

@Preview
@Composable
private fun ListBarTreeOffsetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ListBarTreeOffset, contentDescription = "ListBarTreeOffset Icon")
    }
}

