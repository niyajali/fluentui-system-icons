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
 * Calendar3Day icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: calendar3day
 * - Source: ic_fluent_calendar_3_day_32_light.svg
 * 
 * @return The [ImageVector] for the Calendar3Day icon.
 */
public val FluentIcons.Light.Calendar3Day: ImageVector
    get() {
        if (_calendar3Day != null) {
            return _calendar3Day!!
        }
        _calendar3Day = Builder(name = "Calendar3Day", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.5f)
                curveTo(10.0f, 9.224f, 9.776f, 9.0f, 9.5f, 9.0f)
                curveTo(9.224f, 9.0f, 9.0f, 9.224f, 9.0f, 9.5f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 22.776f, 9.224f, 23.0f, 9.5f, 23.0f)
                curveTo(9.776f, 23.0f, 10.0f, 22.776f, 10.0f, 22.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(16.276f, 9.0f, 16.5f, 9.224f, 16.5f, 9.5f)
                verticalLineTo(22.5f)
                curveTo(16.5f, 22.776f, 16.276f, 23.0f, 16.0f, 23.0f)
                curveTo(15.724f, 23.0f, 15.5f, 22.776f, 15.5f, 22.5f)
                verticalLineTo(9.5f)
                curveTo(15.5f, 9.224f, 15.724f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(23.0f, 9.5f)
                curveTo(23.0f, 9.224f, 22.776f, 9.0f, 22.5f, 9.0f)
                curveTo(22.224f, 9.0f, 22.0f, 9.224f, 22.0f, 9.5f)
                verticalLineTo(22.5f)
                curveTo(22.0f, 22.776f, 22.224f, 23.0f, 22.5f, 23.0f)
                curveTo(22.776f, 23.0f, 23.0f, 22.776f, 23.0f, 22.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 5.015f, 5.015f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3.0f, 29.0f, 5.015f, 29.0f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(29.0f, 26.985f, 26.985f, 29.0f, 24.5f, 29.0f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29.0f, 3.0f, 26.985f, 3.0f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(5.567f, 4.0f, 4.0f, 5.567f, 4.0f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4.0f, 26.433f, 5.567f, 28.0f, 7.5f, 28.0f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28.0f, 28.0f, 26.433f, 28.0f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(28.0f, 5.567f, 26.433f, 4.0f, 24.5f, 4.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _calendar3Day!!
    }

@Suppress("ObjectPropertyName")
private var _calendar3Day: ImageVector? = null

@Preview
@Composable
private fun Calendar3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Calendar3Day, contentDescription = null)
    }
}

