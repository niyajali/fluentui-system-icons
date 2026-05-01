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

package fluent.ui.system.icons.light

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
 * CalendarCheckmark Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used in calendar scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_calendar_checkmark_32_light.svg)
 * 
 * @return The [ImageVector] for the CalendarCheckmark icon.
 */
public val FluentIcons.Light.CalendarCheckmark: ImageVector
    get() {
        if (_calendarCheckmark != null) {
            return _calendarCheckmark!!
        }
        _calendarCheckmark = Builder(name = "CalendarCheckmark", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 15.5f)
                curveTo(27.142f, 15.5f, 30.5f, 18.858f, 30.5f, 23.0f)
                curveTo(30.5f, 27.142f, 27.142f, 30.5f, 23.0f, 30.5f)
                curveTo(18.858f, 30.5f, 15.5f, 27.142f, 15.5f, 23.0f)
                curveTo(15.5f, 18.858f, 18.858f, 15.5f, 23.0f, 15.5f)
                close()
                moveTo(24.5f, 3.0f)
                curveTo(26.985f, 3.0f, 29.0f, 5.015f, 29.0f, 7.5f)
                verticalLineTo(16.376f)
                curveTo(28.683f, 16.131f, 28.349f, 15.906f, 28.0f, 15.704f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(24.5f)
                curveTo(4.0f, 26.433f, 5.567f, 28.0f, 7.5f, 28.0f)
                horizontalLineTo(15.704f)
                curveTo(15.906f, 28.349f, 16.131f, 28.683f, 16.376f, 29.0f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29.0f, 3.0f, 26.985f, 3.0f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.015f, 5.015f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(24.5f)
                close()
                moveTo(27.53f, 20.22f)
                curveTo(27.237f, 19.927f, 26.763f, 19.927f, 26.47f, 20.22f)
                lineTo(21.75f, 24.94f)
                lineTo(19.78f, 22.97f)
                curveTo(19.487f, 22.677f, 19.013f, 22.677f, 18.72f, 22.97f)
                curveTo(18.427f, 23.263f, 18.427f, 23.737f, 18.72f, 24.03f)
                lineTo(21.22f, 26.53f)
                curveTo(21.513f, 26.823f, 21.987f, 26.823f, 22.28f, 26.53f)
                lineTo(27.53f, 21.28f)
                curveTo(27.823f, 20.987f, 27.823f, 20.513f, 27.53f, 20.22f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(5.567f, 4.0f, 4.0f, 5.567f, 4.0f, 7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(28.0f)
                verticalLineTo(7.5f)
                curveTo(28.0f, 5.567f, 26.433f, 4.0f, 24.5f, 4.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _calendarCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _calendarCheckmark: ImageVector? = null

@Preview
@Composable
private fun CalendarCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarCheckmark, contentDescription = "CalendarCheckmark Icon")
    }
}

