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
 * CalendarPhone Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used in calendar scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_calendar_phone_20_regular.svg)
 * 
 * @return The [ImageVector] for the CalendarPhone icon.
 */
public val FluentIcons.Regular.CalendarPhone: ImageVector
    get() {
        if (_calendarPhone != null) {
            return _calendarPhone!!
        }
        _calendarPhone = Builder(name = "CalendarPhone", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(8.05f)
                curveTo(16.838f, 8.017f, 16.671f, 8.0f, 16.5f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 15.328f, 4.672f, 16.0f, 5.5f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.5f)
                curveTo(11.0f, 16.671f, 11.017f, 16.838f, 11.05f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 4.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 4.0f, 4.0f, 4.672f, 4.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 4.672f, 15.328f, 4.0f, 14.5f, 4.0f)
                close()
                moveTo(13.75f, 9.0f)
                curveTo(12.783f, 9.0f, 12.0f, 9.783f, 12.0f, 10.75f)
                verticalLineTo(16.25f)
                curveTo(12.0f, 17.216f, 12.783f, 18.0f, 13.75f, 18.0f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 18.0f, 18.0f, 17.216f, 18.0f, 16.25f)
                verticalLineTo(10.75f)
                curveTo(18.0f, 9.783f, 17.216f, 9.0f, 16.25f, 9.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(14.0f, 15.5f)
                curveTo(14.0f, 15.224f, 14.224f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 15.0f, 16.0f, 15.224f, 16.0f, 15.5f)
                curveTo(16.0f, 15.776f, 15.776f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 16.0f, 14.0f, 15.776f, 14.0f, 15.5f)
                close()
            }
        }
        .build()
        return _calendarPhone!!
    }

@Suppress("ObjectPropertyName")
private var _calendarPhone: ImageVector? = null

@Preview
@Composable
private fun CalendarPhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarPhone, contentDescription = "CalendarPhone Icon")
    }
}

