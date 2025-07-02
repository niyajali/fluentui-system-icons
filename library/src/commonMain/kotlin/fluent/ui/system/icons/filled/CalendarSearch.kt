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
 * CalendarSearch icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: calendar, search
 * - Source: ic_fluent_calendar_search_20_filled.svg
 * 
 * @return The [ImageVector] for the CalendarSearch icon.
 */
public val FluentIcons.Filled.CalendarSearch: ImageVector
    get() {
        if (_calendarSearch != null) {
            return _calendarSearch!!
        }
        _calendarSearch = Builder(name = "CalendarSearch", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.468f)
                curveTo(3.602f, 9.168f, 4.282f, 9.0f, 5.0f, 9.0f)
                curveTo(7.485f, 9.0f, 9.5f, 11.015f, 9.5f, 13.5f)
                curveTo(9.5f, 14.195f, 9.343f, 14.853f, 9.061f, 15.44f)
                lineTo(10.621f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 17.0f, 17.0f, 15.881f, 17.0f, 14.5f)
                close()
                moveTo(17.0f, 5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 3.0f, 3.0f, 4.119f, 3.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.5f)
                close()
                moveTo(7.096f, 16.303f)
                curveTo(6.512f, 16.741f, 5.786f, 17.0f, 5.0f, 17.0f)
                curveTo(3.067f, 17.0f, 1.5f, 15.433f, 1.5f, 13.5f)
                curveTo(1.5f, 11.567f, 3.067f, 10.0f, 5.0f, 10.0f)
                curveTo(6.933f, 10.0f, 8.5f, 11.567f, 8.5f, 13.5f)
                curveTo(8.5f, 14.286f, 8.241f, 15.012f, 7.803f, 15.596f)
                lineTo(10.354f, 18.146f)
                curveTo(10.549f, 18.342f, 10.549f, 18.658f, 10.354f, 18.854f)
                curveTo(10.158f, 19.049f, 9.842f, 19.049f, 9.646f, 18.854f)
                lineTo(7.096f, 16.303f)
                close()
                moveTo(7.5f, 13.5f)
                curveTo(7.5f, 12.119f, 6.381f, 11.0f, 5.0f, 11.0f)
                curveTo(3.619f, 11.0f, 2.5f, 12.119f, 2.5f, 13.5f)
                curveTo(2.5f, 14.881f, 3.619f, 16.0f, 5.0f, 16.0f)
                curveTo(6.381f, 16.0f, 7.5f, 14.881f, 7.5f, 13.5f)
                close()
            }
        }
        .build()
        return _calendarSearch!!
    }

@Suppress("ObjectPropertyName")
private var _calendarSearch: ImageVector? = null

@Preview
@Composable
private fun CalendarSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarSearch, contentDescription = null)
    }
}

