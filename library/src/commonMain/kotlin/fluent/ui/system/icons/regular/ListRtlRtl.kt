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
 * ListRtlRtl Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Direction: RTL
 * - Keywords: fluent-icon
 * - Description: Used to represent list in right to left languages.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_list_rtl_20_regular.svg)
 * 
 * @return The [ImageVector] for the ListRtlRtl icon.
 */
public val FluentIcons.Regular.ListRtlRtl: ImageVector
    get() {
        if (_listRtlRtl != null) {
            return _listRtlRtl!!
        }
        _listRtlRtl = Builder(name = "ListRtlRtl", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                curveTo(6.0f, 4.224f, 6.224f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 4.0f, 18.0f, 4.224f, 18.0f, 4.5f)
                curveTo(18.0f, 4.776f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 5.0f, 6.0f, 4.776f, 6.0f, 4.5f)
                close()
                moveTo(7.0f, 14.5f)
                curveTo(7.0f, 14.224f, 7.224f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 14.0f, 18.0f, 14.224f, 18.0f, 14.5f)
                curveTo(18.0f, 14.776f, 17.776f, 15.0f, 17.5f, 15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 15.0f, 7.0f, 14.776f, 7.0f, 14.5f)
                close()
                moveTo(2.5f, 9.0f)
                curveTo(2.224f, 9.0f, 2.0f, 9.224f, 2.0f, 9.5f)
                curveTo(2.0f, 9.776f, 2.224f, 10.0f, 2.5f, 10.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 10.0f, 18.0f, 9.776f, 18.0f, 9.5f)
                curveTo(18.0f, 9.224f, 17.776f, 9.0f, 17.5f, 9.0f)
                horizontalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _listRtlRtl!!
    }

@Suppress("ObjectPropertyName")
private var _listRtlRtl: ImageVector? = null

@Preview
@Composable
private fun ListRtlRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ListRtlRtl, contentDescription = "ListRtlRtl Icon")
    }
}

