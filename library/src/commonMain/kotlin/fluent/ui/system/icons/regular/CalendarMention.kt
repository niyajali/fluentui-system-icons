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
 * CalendarMention icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: calendar, mention
 * - Source: ic_fluent_calendar_mention_20_regular.svg
 * 
 * @return The [ImageVector] for the CalendarMention icon.
 */
public val FluentIcons.Regular.CalendarMention: ImageVector
    get() {
        if (_calendarMention != null) {
            return _calendarMention!!
        }
        _calendarMention = Builder(name = "CalendarMention", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(9.341f)
                curveTo(16.678f, 9.228f, 16.344f, 9.141f, 16.0f, 9.083f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 15.328f, 4.672f, 16.0f, 5.5f, 16.0f)
                horizontalLineTo(9.083f)
                curveTo(9.141f, 16.344f, 9.228f, 16.678f, 9.341f, 17.0f)
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
                moveTo(15.0f, 11.0f)
                curveTo(12.791f, 11.0f, 11.0f, 12.791f, 11.0f, 15.0f)
                curveTo(11.0f, 17.209f, 12.791f, 19.0f, 15.0f, 19.0f)
                curveTo(15.468f, 19.0f, 15.917f, 18.92f, 16.333f, 18.772f)
                curveTo(16.594f, 18.681f, 16.879f, 18.817f, 16.971f, 19.077f)
                curveTo(17.063f, 19.338f, 16.927f, 19.623f, 16.667f, 19.715f)
                curveTo(16.145f, 19.9f, 15.583f, 20.0f, 15.0f, 20.0f)
                curveTo(12.239f, 20.0f, 10.0f, 17.761f, 10.0f, 15.0f)
                curveTo(10.0f, 12.239f, 12.239f, 10.0f, 15.0f, 10.0f)
                curveTo(17.761f, 10.0f, 20.0f, 12.239f, 20.0f, 15.0f)
                curveTo(20.0f, 16.455f, 19.099f, 17.437f, 18.027f, 17.494f)
                curveTo(17.497f, 17.522f, 16.972f, 17.313f, 16.589f, 16.867f)
                curveTo(16.534f, 16.802f, 16.482f, 16.733f, 16.433f, 16.66f)
                curveTo(16.031f, 17.168f, 15.44f, 17.5f, 14.75f, 17.5f)
                curveTo(13.447f, 17.5f, 12.5f, 16.316f, 12.5f, 15.0f)
                curveTo(12.5f, 13.684f, 13.447f, 12.5f, 14.75f, 12.5f)
                curveTo(15.226f, 12.5f, 15.654f, 12.658f, 16.006f, 12.922f)
                curveTo(16.043f, 12.683f, 16.25f, 12.5f, 16.5f, 12.5f)
                curveTo(16.776f, 12.5f, 17.0f, 12.724f, 17.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.619f, 17.164f, 16.001f, 17.348f, 16.215f)
                curveTo(17.528f, 16.425f, 17.753f, 16.507f, 17.973f, 16.496f)
                curveTo(18.401f, 16.473f, 19.0f, 16.045f, 19.0f, 15.0f)
                curveTo(19.0f, 12.791f, 17.209f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(14.75f, 16.5f)
                curveTo(15.38f, 16.5f, 16.0f, 15.893f, 16.0f, 15.0f)
                curveTo(16.0f, 14.107f, 15.38f, 13.5f, 14.75f, 13.5f)
                curveTo(14.12f, 13.5f, 13.5f, 14.107f, 13.5f, 15.0f)
                curveTo(13.5f, 15.893f, 14.12f, 16.5f, 14.75f, 16.5f)
                close()
            }
        }
        .build()
        return _calendarMention!!
    }

@Suppress("ObjectPropertyName")
private var _calendarMention: ImageVector? = null

@Preview
@Composable
private fun CalendarMentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarMention, contentDescription = null)
    }
}

