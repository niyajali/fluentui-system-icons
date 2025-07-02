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
 * TabDesktopClock icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: tab, desktop, clock
 * - Source: ic_fluent_tab_desktop_clock_20_regular.svg
 * 
 * @return The [ImageVector] for the TabDesktopClock icon.
 */
public val FluentIcons.Regular.TabDesktopClock: ImageVector
    get() {
        if (_tabDesktopClock != null) {
            return _tabDesktopClock!!
        }
        _tabDesktopClock = Builder(name = "TabDesktopClock", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.881f, 15.881f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(10.4f)
                curveTo(10.562f, 16.683f, 10.694f, 16.349f, 10.793f, 16.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 16.0f, 16.0f, 15.328f, 16.0f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 7.0f, 8.0f, 6.328f, 8.0f, 5.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 4.0f, 4.0f, 4.672f, 4.0f, 5.5f)
                verticalLineTo(9.207f)
                curveTo(3.651f, 9.306f, 3.317f, 9.438f, 3.0f, 9.6f)
                verticalLineTo(5.5f)
                close()
                moveTo(16.0f, 6.0f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 4.672f, 15.328f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 5.776f, 9.224f, 6.0f, 9.5f, 6.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 7.985f, 19.0f, 5.5f, 19.0f)
                curveTo(3.015f, 19.0f, 1.0f, 16.985f, 1.0f, 14.5f)
                curveTo(1.0f, 12.015f, 3.015f, 10.0f, 5.5f, 10.0f)
                curveTo(7.985f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(5.5f, 12.0f)
                curveTo(5.224f, 12.0f, 5.0f, 12.224f, 5.0f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(5.0f, 14.776f, 5.224f, 15.0f, 5.5f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(7.276f, 15.0f, 7.5f, 14.776f, 7.5f, 14.5f)
                curveTo(7.5f, 14.224f, 7.276f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.5f)
                curveTo(6.0f, 12.224f, 5.776f, 12.0f, 5.5f, 12.0f)
                close()
            }
        }
        .build()
        return _tabDesktopClock!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopClock: ImageVector? = null

@Preview
@Composable
private fun TabDesktopClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopClock, contentDescription = null)
    }
}

