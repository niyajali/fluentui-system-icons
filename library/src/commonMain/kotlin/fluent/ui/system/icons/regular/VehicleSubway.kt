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
 * VehicleSubway Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent vehicle travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_subway_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleSubway icon.
 */
public val FluentIcons.Regular.VehicleSubway: ImageVector
    get() {
        if (_vehicleSubway != null) {
            return _vehicleSubway!!
        }
        _vehicleSubway = Builder(name = "VehicleSubway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.25f, 3.0f)
                curveTo(18.321f, 3.0f, 20.0f, 4.679f, 20.0f, 6.75f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.525f, 18.766f, 19.012f, 17.11f, 19.401f)
                lineTo(19.572f, 20.573f)
                curveTo(19.946f, 20.751f, 20.105f, 21.198f, 19.927f, 21.573f)
                curveTo(19.764f, 21.915f, 19.374f, 22.077f, 19.022f, 21.965f)
                lineTo(18.927f, 21.927f)
                lineTo(13.83f, 19.5f)
                horizontalLineTo(10.169f)
                lineTo(5.072f, 21.927f)
                curveTo(4.698f, 22.105f, 4.251f, 21.946f, 4.073f, 21.573f)
                curveTo(3.895f, 21.198f, 4.054f, 20.751f, 4.427f, 20.573f)
                lineTo(6.89f, 19.401f)
                curveTo(5.233f, 19.012f, 4.0f, 17.525f, 4.0f, 15.75f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 4.679f, 5.679f, 3.0f, 7.75f, 3.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(18.5f, 14.0f)
                horizontalLineTo(5.5f)
                lineTo(5.5f, 15.75f)
                curveTo(5.5f, 16.993f, 6.507f, 18.0f, 7.75f, 18.0f)
                horizontalLineTo(16.25f)
                curveTo(17.493f, 18.0f, 18.5f, 16.993f, 18.5f, 15.75f)
                lineTo(18.5f, 14.0f)
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
                moveTo(16.25f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(6.507f, 4.5f, 5.5f, 5.507f, 5.5f, 6.75f)
                lineTo(5.5f, 12.5f)
                horizontalLineTo(18.5f)
                lineTo(18.5f, 6.75f)
                curveTo(18.5f, 5.507f, 17.493f, 4.5f, 16.25f, 4.5f)
                close()
                moveTo(13.25f, 6.0f)
                curveTo(13.664f, 6.0f, 14.0f, 6.336f, 14.0f, 6.75f)
                curveTo(14.0f, 7.164f, 13.664f, 7.5f, 13.25f, 7.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 7.5f, 10.0f, 7.164f, 10.0f, 6.75f)
                curveTo(10.0f, 6.336f, 10.336f, 6.0f, 10.75f, 6.0f)
                horizontalLineTo(13.25f)
                close()
            }
        }
        .build()
        return _vehicleSubway!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleSubway: ImageVector? = null

@Preview
@Composable
private fun VehicleSubwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleSubway, contentDescription = "VehicleSubway Icon")
    }
}

