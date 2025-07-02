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
 * CalendarMail icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: calendar, mail
 * - Source: ic_fluent_calendar_mail_20_filled.svg
 * 
 * @return The [ImageVector] for the CalendarMail icon.
 */
public val FluentIcons.Filled.CalendarMail: ImageVector
    get() {
        if (_calendarMail != null) {
            return _calendarMail!!
        }
        _calendarMail = Builder(name = "CalendarMail", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                curveTo(3.119f, 2.0f, 2.0f, 3.119f, 2.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                curveTo(14.0f, 3.119f, 12.881f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 12.881f, 3.119f, 14.0f, 4.5f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 9.343f, 6.343f, 8.0f, 8.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.069f, 10.475f)
                curveTo(6.3f, 9.625f, 7.077f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.923f, 9.0f, 17.7f, 9.625f, 17.93f, 10.475f)
                lineTo(12.0f, 13.961f)
                lineTo(6.069f, 10.475f)
                close()
                moveTo(12.38f, 14.898f)
                lineTo(18.0f, 11.594f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.105f, 17.105f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.895f, 18.0f, 6.0f, 17.105f, 6.0f, 16.0f)
                verticalLineTo(11.594f)
                lineTo(11.62f, 14.898f)
                curveTo(11.855f, 15.036f, 12.146f, 15.036f, 12.38f, 14.898f)
                close()
            }
        }
        .build()
        return _calendarMail!!
    }

@Suppress("ObjectPropertyName")
private var _calendarMail: ImageVector? = null

@Preview
@Composable
private fun CalendarMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarMail, contentDescription = null)
    }
}

