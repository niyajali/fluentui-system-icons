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
 * SeatMultipleStadium Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent seated together mode in teams.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_seat_multiple_stadium_20_regular.svg)
 * 
 * @return The [ImageVector] for the SeatMultipleStadium icon.
 */
public val FluentIcons.Regular.SeatMultipleStadium: ImageVector
    get() {
        if (_seatMultipleStadium != null) {
            return _seatMultipleStadium!!
        }
        _seatMultipleStadium = Builder(name = "SeatMultipleStadium", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 3.0f)
                curveTo(13.769f, 3.0f, 15.0f, 4.231f, 15.0f, 5.75f)
                verticalLineTo(8.0f)
                curveTo(16.657f, 8.0f, 18.0f, 9.343f, 18.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 16.105f, 17.105f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(13.402f, 17.0f, 12.866f, 16.736f, 12.5f, 16.319f)
                curveTo(12.134f, 16.736f, 11.598f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(8.402f, 17.0f, 7.867f, 16.736f, 7.5f, 16.319f)
                curveTo(7.133f, 16.736f, 6.598f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 17.0f, 2.0f, 16.105f, 2.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 9.343f, 3.343f, 8.0f, 5.0f, 8.0f)
                verticalLineTo(5.75f)
                curveTo(5.0f, 4.231f, 6.231f, 3.0f, 7.75f, 3.0f)
                curveTo(8.681f, 3.0f, 9.502f, 3.464f, 10.0f, 4.172f)
                curveTo(10.498f, 3.464f, 11.319f, 3.0f, 12.25f, 3.0f)
                close()
                moveTo(4.0f, 14.0f)
                curveTo(3.448f, 14.0f, 3.0f, 14.448f, 3.0f, 15.0f)
                curveTo(3.0f, 15.552f, 3.448f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(6.552f, 16.0f, 7.0f, 15.552f, 7.0f, 15.0f)
                curveTo(7.0f, 14.448f, 6.552f, 14.0f, 6.0f, 14.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveTo(8.448f, 14.0f, 8.0f, 14.448f, 8.0f, 15.0f)
                curveTo(8.0f, 15.552f, 8.448f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(11.552f, 16.0f, 12.0f, 15.552f, 12.0f, 15.0f)
                curveTo(12.0f, 14.448f, 11.552f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(14.0f, 14.0f)
                curveTo(13.448f, 14.0f, 13.0f, 14.448f, 13.0f, 15.0f)
                curveTo(13.0f, 15.552f, 13.448f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 16.0f, 17.0f, 15.552f, 17.0f, 15.0f)
                curveTo(17.0f, 14.448f, 16.552f, 14.0f, 16.0f, 14.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(5.0f, 9.0f)
                curveTo(3.895f, 9.0f, 3.0f, 9.895f, 3.0f, 11.0f)
                verticalLineTo(13.269f)
                curveTo(3.294f, 13.099f, 3.635f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(6.0f)
                curveTo(6.365f, 13.0f, 6.706f, 13.099f, 7.0f, 13.269f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 9.895f, 6.105f, 9.0f, 5.0f, 9.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(8.895f, 9.0f, 8.0f, 9.895f, 8.0f, 11.0f)
                verticalLineTo(13.269f)
                curveTo(8.294f, 13.099f, 8.635f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(11.365f, 13.0f, 11.706f, 13.099f, 12.0f, 13.269f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 9.895f, 11.105f, 9.0f, 10.0f, 9.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(13.895f, 9.0f, 13.0f, 9.895f, 13.0f, 11.0f)
                verticalLineTo(13.269f)
                curveTo(13.294f, 13.099f, 13.635f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.365f, 13.0f, 16.706f, 13.099f, 17.0f, 13.269f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 9.895f, 16.105f, 9.0f, 15.0f, 9.0f)
                close()
                moveTo(7.75f, 4.0f)
                curveTo(6.784f, 4.0f, 6.0f, 4.784f, 6.0f, 5.75f)
                verticalLineTo(8.172f)
                curveTo(6.618f, 8.391f, 7.143f, 8.806f, 7.5f, 9.343f)
                curveTo(7.95f, 8.666f, 8.666f, 8.183f, 9.5f, 8.043f)
                verticalLineTo(5.75f)
                curveTo(9.5f, 4.784f, 8.717f, 4.0f, 7.75f, 4.0f)
                close()
                moveTo(12.25f, 4.0f)
                curveTo(11.283f, 4.0f, 10.5f, 4.784f, 10.5f, 5.75f)
                verticalLineTo(8.043f)
                curveTo(11.334f, 8.183f, 12.05f, 8.666f, 12.5f, 9.343f)
                curveTo(12.857f, 8.806f, 13.382f, 8.391f, 14.0f, 8.172f)
                verticalLineTo(5.75f)
                curveTo(14.0f, 4.784f, 13.217f, 4.0f, 12.25f, 4.0f)
                close()
            }
        }
        .build()
        return _seatMultipleStadium!!
    }

@Suppress("ObjectPropertyName")
private var _seatMultipleStadium: ImageVector? = null

@Preview
@Composable
private fun SeatMultipleStadiumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SeatMultipleStadium, contentDescription = "SeatMultipleStadium Icon")
    }
}

