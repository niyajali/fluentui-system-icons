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
 * VehicleSubwayClock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent vehicle travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_subway_clock_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleSubwayClock icon.
 */
public val FluentIcons.Regular.VehicleSubwayClock: ImageVector
    get() {
        if (_vehicleSubwayClock != null) {
            return _vehicleSubwayClock!!
        }
        _vehicleSubwayClock = Builder(name = "VehicleSubwayClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(12.0f, 3.462f, 9.538f, 1.0f, 6.5f, 1.0f)
                curveTo(3.462f, 1.0f, 1.0f, 3.462f, 1.0f, 6.5f)
                curveTo(1.0f, 9.538f, 3.462f, 12.0f, 6.5f, 12.0f)
                curveTo(9.538f, 12.0f, 12.0f, 9.538f, 12.0f, 6.5f)
                close()
                moveTo(6.5f, 3.0f)
                curveTo(6.776f, 3.0f, 7.0f, 3.224f, 7.0f, 3.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.276f, 6.0f, 9.5f, 6.224f, 9.5f, 6.5f)
                curveTo(9.5f, 6.776f, 9.276f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 7.0f, 6.0f, 6.776f, 6.0f, 6.5f)
                verticalLineTo(3.5f)
                curveTo(6.0f, 3.224f, 6.224f, 3.0f, 6.5f, 3.0f)
                close()
                moveTo(6.5f, 13.0f)
                curveTo(7.388f, 13.0f, 8.234f, 12.822f, 9.004f, 12.5f)
                horizontalLineTo(18.5f)
                lineTo(18.5f, 6.75f)
                curveTo(18.5f, 5.507f, 17.493f, 4.5f, 16.25f, 4.5f)
                horizontalLineTo(12.686f)
                curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3.0f)
                horizontalLineTo(16.25f)
                curveTo(18.321f, 3.0f, 20.0f, 4.679f, 20.0f, 6.75f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.525f, 18.767f, 19.012f, 17.11f, 19.401f)
                lineTo(19.573f, 20.573f)
                curveTo(19.947f, 20.751f, 20.105f, 21.198f, 19.927f, 21.573f)
                curveTo(19.764f, 21.915f, 19.374f, 22.077f, 19.023f, 21.965f)
                lineTo(18.928f, 21.927f)
                lineTo(13.83f, 19.5f)
                horizontalLineTo(10.169f)
                lineTo(5.073f, 21.927f)
                curveTo(4.699f, 22.105f, 4.251f, 21.946f, 4.073f, 21.573f)
                curveTo(3.895f, 21.198f, 4.054f, 20.751f, 4.428f, 20.573f)
                lineTo(6.89f, 19.401f)
                curveTo(5.234f, 19.012f, 4.0f, 17.525f, 4.0f, 15.75f)
                verticalLineTo(12.502f)
                curveTo(4.77f, 12.823f, 5.614f, 13.0f, 6.5f, 13.0f)
                close()
                moveTo(18.5f, 15.75f)
                lineTo(18.5f, 14.0f)
                horizontalLineTo(5.5f)
                lineTo(5.5f, 15.75f)
                curveTo(5.5f, 16.993f, 6.508f, 18.0f, 7.75f, 18.0f)
                horizontalLineTo(16.25f)
                curveTo(17.493f, 18.0f, 18.5f, 16.993f, 18.5f, 15.75f)
                close()
                moveTo(8.0f, 15.0f)
                curveTo(8.552f, 15.0f, 9.0f, 15.448f, 9.0f, 16.0f)
                curveTo(9.0f, 16.552f, 8.552f, 17.0f, 8.0f, 17.0f)
                curveTo(7.448f, 17.0f, 7.0f, 16.552f, 7.0f, 16.0f)
                curveTo(7.0f, 15.448f, 7.448f, 15.0f, 8.0f, 15.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(16.552f, 15.0f, 17.0f, 15.448f, 17.0f, 16.0f)
                curveTo(17.0f, 16.552f, 16.552f, 17.0f, 16.0f, 17.0f)
                curveTo(15.448f, 17.0f, 15.0f, 16.552f, 15.0f, 16.0f)
                curveTo(15.0f, 15.448f, 15.448f, 15.0f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _vehicleSubwayClock!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleSubwayClock: ImageVector? = null

@Preview
@Composable
private fun VehicleSubwayClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleSubwayClock, contentDescription = "VehicleSubwayClock Icon")
    }
}

