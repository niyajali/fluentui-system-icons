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
 * TabDesktopMultipleAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: tab, desktop, multiple, add
 * - Source: ic_fluent_tab_desktop_multiple_add_20_regular.svg
 * 
 * @return The [ImageVector] for the TabDesktopMultipleAdd icon.
 */
public val FluentIcons.Regular.TabDesktopMultipleAdd: ImageVector
    get() {
        if (_tabDesktopMultipleAdd != null) {
            return _tabDesktopMultipleAdd!!
        }
        _tabDesktopMultipleAdd = Builder(name = "TabDesktopMultipleAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                curveTo(3.119f, 2.0f, 2.0f, 3.119f, 2.0f, 4.5f)
                verticalLineTo(10.257f)
                curveTo(2.307f, 10.003f, 2.642f, 9.783f, 3.0f, 9.6f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 3.672f, 3.672f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.5f)
                curveTo(6.0f, 5.328f, 6.672f, 6.0f, 7.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 13.328f, 13.328f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(10.978f)
                curveTo(10.992f, 14.165f, 11.0f, 14.332f, 11.0f, 14.5f)
                curveTo(11.0f, 14.668f, 10.992f, 14.835f, 10.978f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 15.0f, 15.0f, 13.881f, 15.0f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.119f, 13.881f, 2.0f, 12.5f, 2.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineTo(9.743f)
                curveTo(9.996f, 17.693f, 10.217f, 17.358f, 10.4f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 17.0f, 17.0f, 15.657f, 17.0f, 14.0f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 6.847f, 16.582f, 6.291f, 16.0f, 6.085f)
                verticalLineTo(5.05f)
                curveTo(17.141f, 5.282f, 18.0f, 6.291f, 18.0f, 7.5f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 16.209f, 16.209f, 18.0f, 14.0f, 18.0f)
                close()
                moveTo(14.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 5.0f, 7.0f, 4.776f, 7.0f, 4.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 3.0f, 14.0f, 3.672f, 14.0f, 4.5f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 7.985f, 19.0f, 5.5f, 19.0f)
                curveTo(3.015f, 19.0f, 1.0f, 16.985f, 1.0f, 14.5f)
                curveTo(1.0f, 12.015f, 3.015f, 10.0f, 5.5f, 10.0f)
                curveTo(7.985f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(6.0f, 12.5f)
                curveTo(6.0f, 12.224f, 5.776f, 12.0f, 5.5f, 12.0f)
                curveTo(5.224f, 12.0f, 5.0f, 12.224f, 5.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 14.0f, 3.0f, 14.224f, 3.0f, 14.5f)
                curveTo(3.0f, 14.776f, 3.224f, 15.0f, 3.5f, 15.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 16.5f)
                curveTo(5.0f, 16.776f, 5.224f, 17.0f, 5.5f, 17.0f)
                curveTo(5.776f, 17.0f, 6.0f, 16.776f, 6.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 15.0f, 8.0f, 14.776f, 8.0f, 14.5f)
                curveTo(8.0f, 14.224f, 7.776f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _tabDesktopMultipleAdd!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopMultipleAdd: ImageVector? = null

@Preview
@Composable
private fun TabDesktopMultipleAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopMultipleAdd, contentDescription = null)
    }
}

