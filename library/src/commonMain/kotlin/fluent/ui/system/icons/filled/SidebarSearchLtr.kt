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
 * SidebarSearchLtr icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Direction: LTR
 * - Keywords: sidebar, search, ltr
 * - Source: ic_fluent_sidebar_search_20_filled_ltr.svg
 * 
 * @return The [ImageVector] for the SidebarSearchLtr icon.
 */
public val FluentIcons.Filled.SidebarSearchLtr: ImageVector
    get() {
        if (_sidebarSearchLtr != null) {
            return _sidebarSearchLtr!!
        }
        _sidebarSearchLtr = Builder(name = "SidebarSearchLtr", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.881f, 15.881f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(11.915f)
                curveTo(11.842f, 16.795f, 11.724f, 16.603f, 11.561f, 16.439f)
                lineTo(9.561f, 14.44f)
                curveTo(9.842f, 13.852f, 10.0f, 13.194f, 10.0f, 12.5f)
                curveTo(10.0f, 10.015f, 7.985f, 8.0f, 5.5f, 8.0f)
                curveTo(4.575f, 8.0f, 3.715f, 8.279f, 3.0f, 8.758f)
                verticalLineTo(5.5f)
                close()
                moveTo(13.0f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(13.0f, 13.776f, 13.224f, 14.0f, 13.5f, 14.0f)
                curveTo(13.776f, 14.0f, 14.0f, 13.776f, 14.0f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(14.0f, 6.224f, 13.776f, 6.0f, 13.5f, 6.0f)
                curveTo(13.224f, 6.0f, 13.0f, 6.224f, 13.0f, 6.5f)
                close()
                moveTo(9.0f, 12.5f)
                curveTo(9.0f, 13.286f, 8.741f, 14.012f, 8.303f, 14.596f)
                lineTo(10.854f, 17.146f)
                curveTo(11.049f, 17.342f, 11.049f, 17.658f, 10.854f, 17.853f)
                curveTo(10.658f, 18.049f, 10.342f, 18.049f, 10.146f, 17.853f)
                lineTo(7.596f, 15.303f)
                curveTo(7.012f, 15.741f, 6.286f, 16.0f, 5.5f, 16.0f)
                curveTo(3.567f, 16.0f, 2.0f, 14.433f, 2.0f, 12.5f)
                curveTo(2.0f, 10.567f, 3.567f, 9.0f, 5.5f, 9.0f)
                curveTo(7.433f, 9.0f, 9.0f, 10.567f, 9.0f, 12.5f)
                close()
                moveTo(8.0f, 12.5f)
                curveTo(8.0f, 11.119f, 6.881f, 10.0f, 5.5f, 10.0f)
                curveTo(4.119f, 10.0f, 3.0f, 11.119f, 3.0f, 12.5f)
                curveTo(3.0f, 13.881f, 4.119f, 15.0f, 5.5f, 15.0f)
                curveTo(6.881f, 15.0f, 8.0f, 13.881f, 8.0f, 12.5f)
                close()
            }
        }
        .build()
        return _sidebarSearchLtr!!
    }

@Suppress("ObjectPropertyName")
private var _sidebarSearchLtr: ImageVector? = null

@Preview
@Composable
private fun SidebarSearchLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SidebarSearchLtr, contentDescription = null)
    }
}

