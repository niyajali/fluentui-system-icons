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
 * VehicleBicycle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, bicycle
 * - Source: ic_fluent_vehicle_bicycle_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleBicycle icon.
 */
public val FluentIcons.Regular.VehicleBicycle: ImageVector
    get() {
        if (_vehicleBicycle != null) {
            return _vehicleBicycle!!
        }
        _vehicleBicycle = Builder(name = "VehicleBicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 3.0f)
                curveTo(12.336f, 3.0f, 12.0f, 3.336f, 12.0f, 3.75f)
                curveTo(12.0f, 4.164f, 12.336f, 4.5f, 12.75f, 4.5f)
                horizontalLineTo(14.177f)
                lineTo(15.132f, 8.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.75f)
                curveTo(8.5f, 5.336f, 8.164f, 5.0f, 7.75f, 5.0f)
                horizontalLineTo(7.749f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 5.0f, 4.0f, 5.336f, 4.0f, 5.75f)
                curveTo(4.0f, 6.164f, 4.336f, 6.5f, 4.75f, 6.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.688f)
                lineTo(6.698f, 10.5f)
                curveTo(4.375f, 10.528f, 2.5f, 12.42f, 2.5f, 14.75f)
                curveTo(2.5f, 17.097f, 4.403f, 19.0f, 6.75f, 19.0f)
                curveTo(9.097f, 19.0f, 11.0f, 17.097f, 11.0f, 14.75f)
                curveTo(11.0f, 14.688f, 10.999f, 14.626f, 10.996f, 14.565f)
                lineTo(15.652f, 9.908f)
                lineTo(15.925f, 10.91f)
                curveTo(14.491f, 11.593f, 13.5f, 13.056f, 13.5f, 14.75f)
                curveTo(13.5f, 17.097f, 15.403f, 19.0f, 17.75f, 19.0f)
                curveTo(20.097f, 19.0f, 22.0f, 17.097f, 22.0f, 14.75f)
                curveTo(22.0f, 12.403f, 20.097f, 10.5f, 17.75f, 10.5f)
                curveTo(17.623f, 10.5f, 17.497f, 10.506f, 17.373f, 10.517f)
                lineTo(15.474f, 3.553f)
                curveTo(15.385f, 3.226f, 15.088f, 3.0f, 14.75f, 3.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(16.33f, 12.394f)
                lineTo(17.026f, 14.947f)
                curveTo(17.135f, 15.347f, 17.548f, 15.583f, 17.947f, 15.474f)
                curveTo(18.347f, 15.365f, 18.583f, 14.952f, 18.474f, 14.553f)
                lineTo(17.777f, 12.0f)
                curveTo(19.284f, 12.015f, 20.5f, 13.24f, 20.5f, 14.75f)
                curveTo(20.5f, 16.269f, 19.269f, 17.5f, 17.75f, 17.5f)
                curveTo(16.231f, 17.5f, 15.0f, 16.269f, 15.0f, 14.75f)
                curveTo(15.0f, 13.751f, 15.533f, 12.876f, 16.33f, 12.394f)
                close()
                moveTo(10.565f, 12.875f)
                curveTo(10.079f, 11.889f, 9.223f, 11.118f, 8.178f, 10.746f)
                lineTo(8.385f, 9.5f)
                horizontalLineTo(13.939f)
                lineTo(10.565f, 12.875f)
                close()
                moveTo(7.925f, 12.263f)
                curveTo(8.636f, 12.599f, 9.179f, 13.231f, 9.396f, 14.0f)
                horizontalLineTo(7.635f)
                lineTo(7.925f, 12.263f)
                close()
                moveTo(6.445f, 12.017f)
                lineTo(6.01f, 14.627f)
                curveTo(5.974f, 14.844f, 6.035f, 15.067f, 6.178f, 15.235f)
                curveTo(6.32f, 15.403f, 6.53f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(9.396f)
                curveTo(9.07f, 16.654f, 8.009f, 17.5f, 6.75f, 17.5f)
                curveTo(5.231f, 17.5f, 4.0f, 16.269f, 4.0f, 14.75f)
                curveTo(4.0f, 13.334f, 5.07f, 12.168f, 6.445f, 12.017f)
                close()
            }
        }
        .build()
        return _vehicleBicycle!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleBicycle: ImageVector? = null

@Preview
@Composable
private fun VehicleBicyclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleBicycle, contentDescription = null)
    }
}

