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
 * VehicleCarParking Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a vehicle parking lot.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_car_parking_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleCarParking icon.
 */
public val FluentIcons.Regular.VehicleCarParking: ImageVector
    get() {
        if (_vehicleCarParking != null) {
            return _vehicleCarParking!!
        }
        _vehicleCarParking = Builder(name = "VehicleCarParking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 2.0f)
                curveTo(17.25f, 1.448f, 17.698f, 1.0f, 18.25f, 1.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 1.0f, 23.0f, 1.448f, 23.0f, 2.0f)
                verticalLineTo(7.0f)
                curveTo(23.0f, 7.552f, 22.552f, 8.0f, 22.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.25f)
                curveTo(21.0f, 22.664f, 20.664f, 23.0f, 20.25f, 23.0f)
                curveTo(19.836f, 23.0f, 19.5f, 22.664f, 19.5f, 22.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.25f)
                curveTo(17.698f, 8.0f, 17.25f, 7.552f, 17.25f, 7.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(15.799f, 3.0f)
                curveTo(15.952f, 3.0f, 16.102f, 3.011f, 16.25f, 3.031f)
                verticalLineTo(4.559f)
                curveTo(16.105f, 4.52f, 15.954f, 4.5f, 15.799f, 4.5f)
                horizontalLineTo(8.202f)
                curveTo(7.399f, 4.5f, 6.699f, 5.047f, 6.504f, 5.826f)
                lineTo(5.711f, 9.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 10.5f, 4.5f, 10.836f, 4.5f, 11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(17.499f)
                lineTo(17.5f, 19.747f)
                curveTo(17.5f, 19.885f, 17.612f, 19.997f, 17.75f, 19.997f)
                horizontalLineTo(18.5f)
                verticalLineTo(21.497f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 21.497f, 16.0f, 20.713f, 16.0f, 19.747f)
                lineTo(15.999f, 18.5f)
                horizontalLineTo(8.004f)
                lineTo(8.004f, 19.747f)
                curveTo(8.004f, 20.713f, 7.221f, 21.497f, 6.254f, 21.497f)
                horizontalLineTo(4.75f)
                curveTo(3.783f, 21.497f, 3.0f, 20.713f, 3.0f, 19.747f)
                verticalLineTo(11.25f)
                curveTo(3.0f, 10.435f, 3.433f, 9.721f, 4.082f, 9.327f)
                lineTo(4.289f, 8.5f)
                horizontalLineTo(3.75f)
                curveTo(3.37f, 8.5f, 3.057f, 8.218f, 3.007f, 7.852f)
                lineTo(3.0f, 7.75f)
                curveTo(3.0f, 7.37f, 3.282f, 7.057f, 3.648f, 7.007f)
                lineTo(3.75f, 7.0f)
                horizontalLineTo(4.663f)
                lineTo(5.049f, 5.462f)
                curveTo(5.411f, 4.015f, 6.711f, 3.0f, 8.202f, 3.0f)
                horizontalLineTo(15.799f)
                close()
                moveTo(6.504f, 18.5f)
                horizontalLineTo(4.499f)
                lineTo(4.5f, 19.747f)
                curveTo(4.5f, 19.885f, 4.612f, 19.997f, 4.75f, 19.997f)
                horizontalLineTo(6.254f)
                curveTo(6.392f, 19.997f, 6.504f, 19.885f, 6.504f, 19.747f)
                lineTo(6.504f, 18.5f)
                close()
                moveTo(10.249f, 14.0f)
                horizontalLineTo(13.751f)
                curveTo(14.165f, 14.0f, 14.501f, 14.336f, 14.501f, 14.75f)
                curveTo(14.501f, 15.13f, 14.219f, 15.443f, 13.852f, 15.493f)
                lineTo(13.751f, 15.5f)
                horizontalLineTo(10.249f)
                curveTo(9.835f, 15.5f, 9.499f, 15.164f, 9.499f, 14.75f)
                curveTo(9.499f, 14.37f, 9.781f, 14.057f, 10.147f, 14.007f)
                lineTo(10.249f, 14.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.552f, 12.0f, 18.0f, 12.448f, 18.0f, 13.0f)
                curveTo(18.0f, 13.552f, 17.552f, 14.0f, 17.0f, 14.0f)
                curveTo(16.448f, 14.0f, 16.0f, 13.552f, 16.0f, 13.0f)
                curveTo(16.0f, 12.448f, 16.448f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(7.552f, 12.0f, 8.0f, 12.448f, 8.0f, 13.0f)
                curveTo(8.0f, 13.552f, 7.552f, 14.0f, 7.0f, 14.0f)
                curveTo(6.448f, 14.0f, 6.0f, 13.552f, 6.0f, 13.0f)
                curveTo(6.0f, 12.448f, 6.448f, 12.0f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _vehicleCarParking!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleCarParking: ImageVector? = null

@Preview
@Composable
private fun VehicleCarParkingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleCarParking, contentDescription = "VehicleCarParking Icon")
    }
}

