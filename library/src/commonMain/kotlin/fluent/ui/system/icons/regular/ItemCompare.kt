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
 * ItemCompare Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_item_compare_24_regular.svg)
 * 
 * @return The [ImageVector] for the ItemCompare icon.
 */
public val FluentIcons.Regular.ItemCompare: ImageVector
    get() {
        if (_itemCompare != null) {
            return _itemCompare!!
        }
        _itemCompare = Builder(name = "ItemCompare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                curveTo(12.414f, 2.5f, 12.75f, 2.836f, 12.75f, 3.25f)
                verticalLineTo(20.75f)
                lineTo(12.746f, 20.827f)
                curveTo(12.708f, 21.205f, 12.388f, 21.5f, 12.0f, 21.5f)
                curveTo(11.612f, 21.5f, 11.292f, 21.205f, 11.254f, 20.827f)
                lineTo(11.25f, 20.75f)
                verticalLineTo(3.25f)
                curveTo(11.25f, 2.836f, 11.586f, 2.5f, 12.0f, 2.5f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(7.993f, 8.0f, 9.0f, 9.007f, 9.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(9.0f, 14.993f, 7.993f, 16.0f, 6.75f, 16.0f)
                horizontalLineTo(3.25f)
                curveTo(2.007f, 16.0f, 1.0f, 14.993f, 1.0f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(1.0f, 9.007f, 2.007f, 8.0f, 3.25f, 8.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(20.75f, 8.0f)
                curveTo(21.993f, 8.0f, 23.0f, 9.007f, 23.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(23.0f, 14.993f, 21.993f, 16.0f, 20.75f, 16.0f)
                horizontalLineTo(17.25f)
                curveTo(16.007f, 16.0f, 15.0f, 14.993f, 15.0f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(15.0f, 9.007f, 16.007f, 8.0f, 17.25f, 8.0f)
                horizontalLineTo(20.75f)
                close()
                moveTo(3.25f, 9.5f)
                curveTo(2.836f, 9.5f, 2.5f, 9.836f, 2.5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(2.5f, 14.164f, 2.836f, 14.5f, 3.25f, 14.5f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 14.5f, 7.5f, 14.164f, 7.5f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(7.5f, 9.836f, 7.164f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(3.25f)
                close()
                moveTo(17.25f, 9.5f)
                curveTo(16.836f, 9.5f, 16.5f, 9.836f, 16.5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(16.5f, 14.164f, 16.836f, 14.5f, 17.25f, 14.5f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 14.5f, 21.5f, 14.164f, 21.5f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(21.5f, 9.836f, 21.164f, 9.5f, 20.75f, 9.5f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _itemCompare!!
    }

@Suppress("ObjectPropertyName")
private var _itemCompare: ImageVector? = null

@Preview
@Composable
private fun ItemComparePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ItemCompare, contentDescription = "ItemCompare Icon")
    }
}

