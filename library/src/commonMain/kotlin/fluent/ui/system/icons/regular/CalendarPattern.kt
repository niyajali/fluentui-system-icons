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
 * CalendarPattern Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used in calendar scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_calendar_pattern_20_regular.svg)
 * 
 * @return The [ImageVector] for the CalendarPattern icon.
 */
public val FluentIcons.Regular.CalendarPattern: ImageVector
    get() {
        if (_calendarPattern != null) {
            return _calendarPattern!!
        }
        _calendarPattern = Builder(name = "CalendarPattern", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.881f, 15.881f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                close()
                moveTo(4.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 4.672f, 15.328f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 4.0f, 4.0f, 4.672f, 4.0f, 5.5f)
                close()
                moveTo(14.707f, 8.0f)
                lineTo(10.707f, 12.0f)
                horizontalLineTo(13.293f)
                lineTo(16.0f, 9.293f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.707f)
                close()
                moveTo(13.293f, 8.0f)
                horizontalLineTo(10.707f)
                lineTo(6.707f, 12.0f)
                horizontalLineTo(9.293f)
                lineTo(13.293f, 8.0f)
                close()
                moveTo(5.293f, 12.0f)
                lineTo(9.293f, 8.0f)
                horizontalLineTo(6.707f)
                lineTo(4.0f, 10.707f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.293f)
                close()
                moveTo(4.0f, 9.293f)
                lineTo(5.293f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.293f)
                close()
                moveTo(14.707f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.707f)
                lineTo(14.707f, 12.0f)
                close()
            }
        }
        .build()
        return _calendarPattern!!
    }

@Suppress("ObjectPropertyName")
private var _calendarPattern: ImageVector? = null

@Preview
@Composable
private fun CalendarPatternPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarPattern, contentDescription = "CalendarPattern Icon")
    }
}

