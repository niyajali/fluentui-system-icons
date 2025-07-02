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
 * Calendar3Day icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: calendar3day
 * - Source: ic_fluent_calendar_3_day_24_regular.svg
 * 
 * @return The [ImageVector] for the Calendar3Day icon.
 */
public val FluentIcons.Regular.Calendar3Day: ImageVector
    get() {
        if (_calendar3Day != null) {
            return _calendar3Day!!
        }
        _calendar3Day = Builder(name = "Calendar3Day", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(7.75f, 7.0f)
                curveTo(8.13f, 7.0f, 8.443f, 7.282f, 8.493f, 7.648f)
                lineTo(8.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(8.5f, 16.664f, 8.164f, 17.0f, 7.75f, 17.0f)
                curveTo(7.37f, 17.0f, 7.057f, 16.718f, 7.007f, 16.352f)
                lineTo(7.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(7.0f, 7.336f, 7.336f, 7.0f, 7.75f, 7.0f)
                close()
                moveTo(16.25f, 7.0f)
                curveTo(16.63f, 7.0f, 16.944f, 7.282f, 16.993f, 7.648f)
                lineTo(17.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 16.664f, 16.664f, 17.0f, 16.25f, 17.0f)
                curveTo(15.87f, 17.0f, 15.557f, 16.718f, 15.507f, 16.352f)
                lineTo(15.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 7.336f, 15.836f, 7.0f, 16.25f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.38f, 7.0f, 12.693f, 7.282f, 12.743f, 7.648f)
                lineTo(12.75f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(12.75f, 16.664f, 12.414f, 17.0f, 12.0f, 17.0f)
                curveTo(11.62f, 17.0f, 11.307f, 16.718f, 11.257f, 16.352f)
                lineTo(11.25f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(11.25f, 7.336f, 11.586f, 7.0f, 12.0f, 7.0f)
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
        Image(imageVector = FluentIcons.Regular.Calendar3Day, contentDescription = null)
    }
}

