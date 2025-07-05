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
 * TabDesktopSearch Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in large screen browser tab scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_desktop_search_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabDesktopSearch icon.
 */
public val FluentIcons.Regular.TabDesktopSearch: ImageVector
    get() {
        if (_tabDesktopSearch != null) {
            return _tabDesktopSearch!!
        }
        _tabDesktopSearch = Builder(name = "TabDesktopSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.769f, 19.769f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(13.982f)
                curveTo(13.93f, 20.639f, 13.765f, 20.291f, 13.487f, 20.013f)
                lineTo(12.975f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.25f)
                curveTo(12.007f, 8.0f, 11.0f, 6.993f, 11.0f, 5.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(10.375f)
                curveTo(3.952f, 10.589f, 3.446f, 10.889f, 3.0f, 11.257f)
                verticalLineTo(5.75f)
                close()
                moveTo(13.25f, 6.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.164f, 12.836f, 6.5f, 13.25f, 6.5f)
                close()
                moveTo(6.5f, 20.0f)
                curveTo(7.472f, 20.0f, 8.372f, 19.692f, 9.107f, 19.168f)
                lineTo(11.72f, 21.78f)
                curveTo(12.013f, 22.073f, 12.487f, 22.073f, 12.78f, 21.78f)
                curveTo(13.073f, 21.487f, 13.073f, 21.013f, 12.78f, 20.72f)
                lineTo(10.168f, 18.107f)
                curveTo(10.692f, 17.372f, 11.0f, 16.472f, 11.0f, 15.5f)
                curveTo(11.0f, 13.015f, 8.985f, 11.0f, 6.5f, 11.0f)
                curveTo(4.015f, 11.0f, 2.0f, 13.015f, 2.0f, 15.5f)
                curveTo(2.0f, 17.985f, 4.015f, 20.0f, 6.5f, 20.0f)
                close()
                moveTo(6.5f, 18.5f)
                curveTo(4.843f, 18.5f, 3.5f, 17.157f, 3.5f, 15.5f)
                curveTo(3.5f, 13.843f, 4.843f, 12.5f, 6.5f, 12.5f)
                curveTo(8.157f, 12.5f, 9.5f, 13.843f, 9.5f, 15.5f)
                curveTo(9.5f, 17.157f, 8.157f, 18.5f, 6.5f, 18.5f)
                close()
            }
        }
        .build()
        return _tabDesktopSearch!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopSearch: ImageVector? = null

@Preview
@Composable
private fun TabDesktopSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopSearch, contentDescription = "TabDesktopSearch Icon")
    }
}

