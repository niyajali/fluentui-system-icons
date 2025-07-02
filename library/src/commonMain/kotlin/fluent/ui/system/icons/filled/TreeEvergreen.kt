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
 * TreeEvergreen icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: tree, evergreen
 * - Source: ic_fluent_tree_evergreen_20_filled.svg
 * 
 * @return The [ImageVector] for the TreeEvergreen icon.
 */
public val FluentIcons.Filled.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.618f, 2.211f)
                curveTo(10.255f, 1.924f, 9.743f, 1.924f, 9.38f, 2.211f)
                lineTo(6.072f, 4.822f)
                curveTo(5.267f, 5.456f, 5.365f, 6.564f, 6.014f, 7.135f)
                lineTo(4.55f, 8.342f)
                curveTo(3.587f, 9.136f, 3.977f, 10.613f, 5.06f, 10.936f)
                lineTo(3.474f, 12.422f)
                curveTo(2.488f, 13.345f, 3.142f, 14.999f, 4.493f, 14.999f)
                horizontalLineTo(7.998f)
                verticalLineTo(16.749f)
                curveTo(7.998f, 17.439f, 8.558f, 17.999f, 9.248f, 17.999f)
                horizontalLineTo(10.748f)
                curveTo(11.438f, 17.999f, 11.998f, 17.439f, 11.998f, 16.749f)
                verticalLineTo(14.999f)
                horizontalLineTo(15.502f)
                curveTo(16.853f, 14.999f, 17.507f, 13.344f, 16.52f, 12.421f)
                lineTo(14.933f, 10.937f)
                curveTo(16.019f, 10.616f, 16.411f, 9.137f, 15.446f, 8.342f)
                lineTo(13.984f, 7.136f)
                curveTo(14.633f, 6.565f, 14.731f, 5.457f, 13.927f, 4.822f)
                lineTo(10.618f, 2.211f)
                close()
                moveTo(8.998f, 14.999f)
                horizontalLineTo(10.998f)
                verticalLineTo(16.749f)
                curveTo(10.998f, 16.887f, 10.886f, 16.999f, 10.748f, 16.999f)
                horizontalLineTo(9.248f)
                curveTo(9.11f, 16.999f, 8.998f, 16.887f, 8.998f, 16.749f)
                verticalLineTo(14.999f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

@Suppress("ObjectPropertyName")
private var _treeEvergreen: ImageVector? = null

@Preview
@Composable
private fun TreeEvergreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TreeEvergreen, contentDescription = null)
    }
}

