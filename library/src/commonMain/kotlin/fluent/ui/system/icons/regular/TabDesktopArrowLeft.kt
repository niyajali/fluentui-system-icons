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
 * TabDesktopArrowLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: tab, desktop, arrow, left
 * - Source: ic_fluent_tab_desktop_arrow_left_20_regular.svg
 * 
 * @return The [ImageVector] for the TabDesktopArrowLeft icon.
 */
public val FluentIcons.Regular.TabDesktopArrowLeft: ImageVector
    get() {
        if (_tabDesktopArrowLeft != null) {
            return _tabDesktopArrowLeft!!
        }
        _tabDesktopArrowLeft = Builder(name = "TabDesktopArrowLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.996f, 5.5f)
                curveTo(2.996f, 4.119f, 4.115f, 3.0f, 5.496f, 3.0f)
                horizontalLineTo(14.496f)
                curveTo(15.877f, 3.0f, 16.996f, 4.119f, 16.996f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(16.996f, 15.881f, 15.877f, 17.0f, 14.496f, 17.0f)
                horizontalLineTo(10.4f)
                curveTo(10.562f, 16.683f, 10.694f, 16.349f, 10.793f, 16.0f)
                horizontalLineTo(14.496f)
                curveTo(15.325f, 16.0f, 15.996f, 15.328f, 15.996f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.496f)
                curveTo(8.668f, 7.0f, 7.996f, 6.328f, 7.996f, 5.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.496f)
                curveTo(4.668f, 4.0f, 3.996f, 4.672f, 3.996f, 5.5f)
                verticalLineTo(9.208f)
                curveTo(3.647f, 9.307f, 3.313f, 9.439f, 2.996f, 9.602f)
                verticalLineTo(5.5f)
                close()
                moveTo(15.996f, 6.0f)
                verticalLineTo(5.5f)
                curveTo(15.996f, 4.672f, 15.325f, 4.0f, 14.496f, 4.0f)
                horizontalLineTo(8.996f)
                verticalLineTo(5.5f)
                curveTo(8.996f, 5.776f, 9.22f, 6.0f, 9.496f, 6.0f)
                horizontalLineTo(15.996f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 7.985f, 19.0f, 5.5f, 19.0f)
                curveTo(3.015f, 19.0f, 1.0f, 16.985f, 1.0f, 14.5f)
                curveTo(1.0f, 12.015f, 3.015f, 10.0f, 5.5f, 10.0f)
                curveTo(7.985f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(3.147f, 14.146f)
                lineTo(3.144f, 14.149f)
                curveTo(3.097f, 14.196f, 3.062f, 14.25f, 3.038f, 14.309f)
                curveTo(3.014f, 14.367f, 3.0f, 14.43f, 3.0f, 14.497f)
                lineTo(3.0f, 14.5f)
                lineTo(3.0f, 14.503f)
                curveTo(3.0f, 14.57f, 3.014f, 14.633f, 3.038f, 14.691f)
                curveTo(3.062f, 14.75f, 3.099f, 14.806f, 3.146f, 14.854f)
                lineTo(5.146f, 16.854f)
                curveTo(5.342f, 17.049f, 5.658f, 17.049f, 5.854f, 16.854f)
                curveTo(6.049f, 16.658f, 6.049f, 16.342f, 5.854f, 16.146f)
                lineTo(4.707f, 15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 15.0f, 8.0f, 14.776f, 8.0f, 14.5f)
                curveTo(8.0f, 14.224f, 7.776f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(4.707f)
                lineTo(5.854f, 12.854f)
                curveTo(6.049f, 12.658f, 6.049f, 12.342f, 5.854f, 12.146f)
                curveTo(5.658f, 11.951f, 5.342f, 11.951f, 5.146f, 12.146f)
                lineTo(3.147f, 14.146f)
                close()
            }
        }
        .build()
        return _tabDesktopArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopArrowLeft: ImageVector? = null

@Preview
@Composable
private fun TabDesktopArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopArrowLeft, contentDescription = null)
    }
}

