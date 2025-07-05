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
 * CalendarInfo Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used in calendar scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_calendar_info_20_filled.svg)
 * 
 * @return The [ImageVector] for the CalendarInfo icon.
 */
public val FluentIcons.Filled.CalendarInfo: ImageVector
    get() {
        if (_calendarInfo != null) {
            return _calendarInfo!!
        }
        _calendarInfo = Builder(name = "CalendarInfo", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                verticalLineTo(9.6f)
                curveTo(16.25f, 9.216f, 15.4f, 9.0f, 14.5f, 9.0f)
                curveTo(11.462f, 9.0f, 9.0f, 11.462f, 9.0f, 14.5f)
                curveTo(9.0f, 15.4f, 9.216f, 16.25f, 9.6f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(14.5f, 3.0f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(13.875f, 12.5f)
                curveTo(13.875f, 12.155f, 14.155f, 11.875f, 14.5f, 11.875f)
                curveTo(14.845f, 11.875f, 15.125f, 12.155f, 15.125f, 12.5f)
                curveTo(15.125f, 12.845f, 14.845f, 13.125f, 14.5f, 13.125f)
                curveTo(14.155f, 13.125f, 13.875f, 12.845f, 13.875f, 12.5f)
                close()
                moveTo(15.0f, 16.5f)
                curveTo(15.0f, 16.776f, 14.776f, 17.0f, 14.5f, 17.0f)
                curveTo(14.224f, 17.0f, 14.0f, 16.776f, 14.0f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(14.0f, 14.224f, 14.224f, 14.0f, 14.5f, 14.0f)
                curveTo(14.776f, 14.0f, 15.0f, 14.224f, 15.0f, 14.5f)
                verticalLineTo(16.5f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 16.433f, 12.567f, 18.0f, 14.5f, 18.0f)
                curveTo(16.433f, 18.0f, 18.0f, 16.433f, 18.0f, 14.5f)
                curveTo(18.0f, 12.567f, 16.433f, 11.0f, 14.5f, 11.0f)
                curveTo(12.567f, 11.0f, 11.0f, 12.567f, 11.0f, 14.5f)
                close()
            }
        }
        .build()
        return _calendarInfo!!
    }

@Suppress("ObjectPropertyName")
private var _calendarInfo: ImageVector? = null

@Preview
@Composable
private fun CalendarInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarInfo, contentDescription = "CalendarInfo Icon")
    }
}

