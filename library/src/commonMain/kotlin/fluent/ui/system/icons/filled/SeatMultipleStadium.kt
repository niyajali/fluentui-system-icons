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
 * SeatMultipleStadium Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent seated together mode in teams.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_seat_multiple_stadium_20_filled.svg)
 * 
 * @return The [ImageVector] for the SeatMultipleStadium icon.
 */
public val FluentIcons.Filled.SeatMultipleStadium: ImageVector
    get() {
        if (_seatMultipleStadium != null) {
            return _seatMultipleStadium!!
        }
        _seatMultipleStadium = Builder(name = "SeatMultipleStadium", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 14.0f)
                curveTo(6.328f, 14.0f, 7.0f, 14.672f, 7.0f, 15.5f)
                curveTo(7.0f, 16.328f, 6.328f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 17.0f, 2.0f, 16.328f, 2.0f, 15.5f)
                curveTo(2.0f, 14.672f, 2.672f, 14.0f, 3.5f, 14.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(10.5f, 14.0f)
                curveTo(11.328f, 14.0f, 12.0f, 14.672f, 12.0f, 15.5f)
                curveTo(12.0f, 16.328f, 11.328f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 17.0f, 8.0f, 16.328f, 8.0f, 15.5f)
                curveTo(8.0f, 14.672f, 8.672f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(17.328f, 14.0f, 18.0f, 14.672f, 18.0f, 15.5f)
                curveTo(18.0f, 16.328f, 17.328f, 17.0f, 16.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 17.0f, 13.0f, 16.328f, 13.0f, 15.5f)
                curveTo(13.0f, 14.672f, 13.672f, 14.0f, 14.5f, 14.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(4.5f, 9.0f)
                curveTo(5.881f, 9.0f, 7.0f, 10.119f, 7.0f, 11.5f)
                verticalLineTo(13.503f)
                curveTo(6.582f, 13.188f, 6.063f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(3.5f)
                curveTo(2.937f, 13.0f, 2.418f, 13.188f, 2.0f, 13.503f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 10.119f, 3.119f, 9.0f, 4.5f, 9.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(11.105f, 9.0f, 12.0f, 9.895f, 12.0f, 11.0f)
                verticalLineTo(13.503f)
                curveTo(11.582f, 13.188f, 11.064f, 13.0f, 10.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(8.937f, 13.0f, 8.418f, 13.188f, 8.0f, 13.503f)
                verticalLineTo(11.0f)
                curveTo(8.0f, 9.895f, 8.895f, 9.0f, 10.0f, 9.0f)
                close()
                moveTo(15.5f, 9.0f)
                curveTo(16.881f, 9.0f, 18.0f, 10.119f, 18.0f, 11.5f)
                verticalLineTo(13.503f)
                curveTo(17.582f, 13.188f, 17.063f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(14.5f)
                curveTo(13.936f, 13.0f, 13.418f, 13.188f, 13.0f, 13.503f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 10.119f, 14.119f, 9.0f, 15.5f, 9.0f)
                close()
                moveTo(7.25f, 3.0f)
                curveTo(8.493f, 3.0f, 9.5f, 4.007f, 9.5f, 5.25f)
                verticalLineTo(8.041f)
                curveTo(9.068f, 8.113f, 8.668f, 8.278f, 8.32f, 8.515f)
                curveTo(7.937f, 8.774f, 7.619f, 9.12f, 7.39f, 9.524f)
                curveTo(7.298f, 9.391f, 7.197f, 9.265f, 7.088f, 9.146f)
                curveTo(6.859f, 8.895f, 6.595f, 8.676f, 6.303f, 8.5f)
                curveTo(5.912f, 8.264f, 5.471f, 8.103f, 5.0f, 8.035f)
                verticalLineTo(5.25f)
                curveTo(5.0f, 4.007f, 6.007f, 3.0f, 7.25f, 3.0f)
                close()
                moveTo(12.75f, 3.0f)
                curveTo(13.993f, 3.0f, 15.0f, 4.007f, 15.0f, 5.25f)
                verticalLineTo(8.035f)
                curveTo(14.529f, 8.103f, 14.089f, 8.265f, 13.697f, 8.5f)
                curveTo(13.366f, 8.7f, 13.07f, 8.953f, 12.821f, 9.247f)
                curveTo(12.746f, 9.336f, 12.675f, 9.428f, 12.609f, 9.524f)
                curveTo(12.566f, 9.448f, 12.518f, 9.374f, 12.469f, 9.302f)
                curveTo(12.261f, 8.999f, 12.0f, 8.737f, 11.697f, 8.528f)
                curveTo(11.345f, 8.285f, 10.939f, 8.115f, 10.5f, 8.041f)
                verticalLineTo(5.25f)
                curveTo(10.5f, 4.007f, 11.507f, 3.0f, 12.75f, 3.0f)
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
        Image(imageVector = FluentIcons.Filled.SeatMultipleStadium, contentDescription = "SeatMultipleStadium Icon")
    }
}

