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
 * VehicleMotorcycle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, motorcycle
 * - Source: ic_fluent_vehicle_motorcycle_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleMotorcycle icon.
 */
public val FluentIcons.Regular.VehicleMotorcycle: ImageVector
    get() {
        if (_vehicleMotorcycle != null) {
            return _vehicleMotorcycle!!
        }
        _vehicleMotorcycle = Builder(name = "VehicleMotorcycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 4.0f)
                curveTo(10.336f, 4.0f, 10.0f, 4.336f, 10.0f, 4.75f)
                curveTo(10.0f, 5.164f, 10.336f, 5.5f, 10.75f, 5.5f)
                horizontalLineTo(12.341f)
                curveTo(12.62f, 5.5f, 12.876f, 5.655f, 13.006f, 5.903f)
                lineTo(14.669f, 9.09f)
                curveTo(14.456f, 9.031f, 14.232f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(11.781f)
                curveTo(10.256f, 9.0f, 8.848f, 9.817f, 8.091f, 11.141f)
                lineTo(7.315f, 12.5f)
                horizontalLineTo(4.75f)
                curveTo(2.679f, 12.5f, 1.0f, 14.179f, 1.0f, 16.25f)
                curveTo(1.0f, 18.321f, 2.679f, 20.0f, 4.75f, 20.0f)
                curveTo(6.383f, 20.0f, 7.772f, 18.956f, 8.287f, 17.5f)
                horizontalLineTo(10.299f)
                curveTo(11.465f, 17.5f, 12.542f, 16.875f, 13.121f, 15.863f)
                lineTo(14.189f, 13.993f)
                curveTo(15.196f, 13.918f, 16.037f, 13.246f, 16.359f, 12.33f)
                lineTo(16.885f, 13.339f)
                curveTo(16.04f, 14.027f, 15.5f, 15.075f, 15.5f, 16.25f)
                curveTo(15.5f, 18.321f, 17.179f, 20.0f, 19.25f, 20.0f)
                curveTo(21.321f, 20.0f, 23.0f, 18.321f, 23.0f, 16.25f)
                curveTo(23.0f, 14.179f, 21.321f, 12.5f, 19.25f, 12.5f)
                curveTo(18.891f, 12.5f, 18.544f, 12.55f, 18.215f, 12.645f)
                lineTo(17.151f, 10.605f)
                curveTo(17.54f, 10.855f, 18.003f, 11.0f, 18.5f, 11.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 11.0f, 21.0f, 10.664f, 21.0f, 10.25f)
                verticalLineTo(6.75f)
                curveTo(21.0f, 6.336f, 20.664f, 6.0f, 20.25f, 6.0f)
                horizontalLineTo(18.5f)
                curveTo(17.152f, 6.0f, 16.053f, 7.067f, 16.002f, 8.403f)
                lineTo(14.335f, 5.209f)
                curveTo(13.948f, 4.466f, 13.179f, 4.0f, 12.341f, 4.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(13.764f, 12.5f)
                curveTo(13.755f, 12.5f, 13.746f, 12.5f, 13.737f, 12.5f)
                horizontalLineTo(9.042f)
                lineTo(9.393f, 11.886f)
                curveTo(9.883f, 11.029f, 10.794f, 10.5f, 11.781f, 10.5f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 10.5f, 15.0f, 10.948f, 15.0f, 11.5f)
                curveTo(15.0f, 12.052f, 14.552f, 12.5f, 14.0f, 12.5f)
                horizontalLineTo(13.764f)
                close()
                moveTo(12.458f, 14.0f)
                lineTo(11.819f, 15.118f)
                curveTo(11.507f, 15.663f, 10.927f, 16.0f, 10.299f, 16.0f)
                horizontalLineTo(8.492f)
                curveTo(8.443f, 15.252f, 8.174f, 14.564f, 7.75f, 14.0f)
                horizontalLineTo(12.458f)
                close()
                moveTo(4.75f, 14.0f)
                curveTo(5.993f, 14.0f, 7.0f, 15.007f, 7.0f, 16.25f)
                curveTo(7.0f, 17.493f, 5.993f, 18.5f, 4.75f, 18.5f)
                curveTo(3.507f, 18.5f, 2.5f, 17.493f, 2.5f, 16.25f)
                curveTo(2.5f, 15.007f, 3.507f, 14.0f, 4.75f, 14.0f)
                close()
                moveTo(17.604f, 14.716f)
                lineTo(18.585f, 16.597f)
                curveTo(18.777f, 16.964f, 19.23f, 17.107f, 19.597f, 16.915f)
                curveTo(19.964f, 16.723f, 20.107f, 16.27f, 19.915f, 15.903f)
                lineTo(18.934f, 14.022f)
                curveTo(19.037f, 14.007f, 19.143f, 14.0f, 19.25f, 14.0f)
                curveTo(20.493f, 14.0f, 21.5f, 15.007f, 21.5f, 16.25f)
                curveTo(21.5f, 17.493f, 20.493f, 18.5f, 19.25f, 18.5f)
                curveTo(18.007f, 18.5f, 17.0f, 17.493f, 17.0f, 16.25f)
                curveTo(17.0f, 15.657f, 17.229f, 15.118f, 17.604f, 14.716f)
                close()
                moveTo(17.5f, 8.5f)
                curveTo(17.5f, 7.948f, 17.948f, 7.5f, 18.5f, 7.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.5f)
                curveTo(17.948f, 9.5f, 17.5f, 9.052f, 17.5f, 8.5f)
                close()
            }
        }
        .build()
        return _vehicleMotorcycle!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleMotorcycle: ImageVector? = null

@Preview
@Composable
private fun VehicleMotorcyclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleMotorcycle, contentDescription = null)
    }
}

