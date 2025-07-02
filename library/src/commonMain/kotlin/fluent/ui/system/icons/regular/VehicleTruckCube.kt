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
 * VehicleTruckCube icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, truck, cube
 * - Source: ic_fluent_vehicle_truck_cube_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleTruckCube icon.
 */
public val FluentIcons.Regular.VehicleTruckCube: ImageVector
    get() {
        if (_vehicleTruckCube != null) {
            return _vehicleTruckCube!!
        }
        _vehicleTruckCube = Builder(name = "VehicleTruckCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 8.574f)
                verticalLineTo(4.428f)
                curveTo(1.0f, 3.86f, 1.321f, 3.34f, 1.829f, 3.086f)
                lineTo(5.329f, 1.336f)
                curveTo(5.751f, 1.125f, 6.249f, 1.125f, 6.671f, 1.336f)
                lineTo(10.171f, 3.086f)
                curveTo(10.679f, 3.34f, 11.0f, 3.86f, 11.0f, 4.428f)
                verticalLineTo(8.574f)
                curveTo(11.0f, 9.142f, 10.679f, 9.661f, 10.171f, 9.915f)
                lineTo(6.671f, 11.665f)
                curveTo(6.249f, 11.876f, 5.751f, 11.876f, 5.329f, 11.665f)
                lineTo(1.829f, 9.915f)
                curveTo(1.321f, 9.661f, 1.0f, 9.142f, 1.0f, 8.574f)
                close()
                moveTo(2.553f, 4.527f)
                curveTo(2.429f, 4.774f, 2.529f, 5.074f, 2.776f, 5.198f)
                lineTo(5.5f, 6.56f)
                verticalLineTo(9.501f)
                curveTo(5.5f, 9.777f, 5.724f, 10.001f, 6.0f, 10.001f)
                curveTo(6.276f, 10.001f, 6.5f, 9.777f, 6.5f, 9.501f)
                verticalLineTo(6.56f)
                lineTo(9.224f, 5.198f)
                curveTo(9.471f, 5.074f, 9.571f, 4.774f, 9.447f, 4.527f)
                curveTo(9.324f, 4.28f, 9.023f, 4.18f, 8.776f, 4.303f)
                lineTo(6.0f, 5.692f)
                lineTo(3.224f, 4.303f)
                curveTo(2.977f, 4.18f, 2.676f, 4.28f, 2.553f, 4.527f)
                close()
                moveTo(3.5f, 11.868f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.638f, 3.795f, 17.958f, 4.172f, 17.997f)
                curveTo(4.585f, 16.833f, 5.695f, 16.0f, 7.0f, 16.0f)
                curveTo(8.306f, 16.0f, 9.417f, 16.835f, 9.829f, 18.0f)
                horizontalLineTo(12.171f)
                curveTo(12.583f, 16.835f, 13.694f, 16.0f, 15.0f, 16.0f)
                verticalLineTo(5.25f)
                curveTo(15.0f, 4.836f, 14.664f, 4.5f, 14.25f, 4.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.428f)
                curveTo(12.0f, 3.907f, 11.839f, 3.412f, 11.553f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 3.0f, 16.5f, 4.008f, 16.5f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.051f)
                curveTo(18.92f, 6.0f, 19.712f, 6.501f, 20.084f, 7.287f)
                lineTo(21.783f, 10.875f)
                curveTo(21.926f, 11.176f, 22.0f, 11.505f, 22.0f, 11.838f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.493f, 20.993f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(17.958f)
                curveTo(17.721f, 20.919f, 16.486f, 22.0f, 15.0f, 22.0f)
                curveTo(13.514f, 22.0f, 12.28f, 20.919f, 12.042f, 19.5f)
                horizontalLineTo(9.959f)
                curveTo(9.72f, 20.919f, 8.486f, 22.0f, 7.0f, 22.0f)
                curveTo(5.51f, 22.0f, 4.274f, 20.914f, 4.04f, 19.491f)
                curveTo(2.896f, 19.385f, 2.0f, 18.422f, 2.0f, 17.25f)
                verticalLineTo(11.118f)
                lineTo(3.5f, 11.868f)
                close()
                moveTo(16.5f, 16.402f)
                curveTo(17.114f, 16.757f, 17.59f, 17.323f, 17.829f, 18.0f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 18.0f, 20.5f, 17.665f, 20.5f, 17.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.25f)
                curveTo(18.836f, 17.0f, 18.5f, 16.665f, 18.5f, 16.25f)
                curveTo(18.5f, 15.836f, 18.836f, 15.5f, 19.25f, 15.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.5f)
                lineTo(16.5f, 12.5f)
                verticalLineTo(16.402f)
                close()
                moveTo(18.051f, 7.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.0f)
                lineTo(20.183f, 11.0f)
                lineTo(18.729f, 7.929f)
                curveTo(18.604f, 7.667f, 18.341f, 7.5f, 18.051f, 7.5f)
                close()
                moveTo(5.5f, 19.0f)
                curveTo(5.5f, 19.829f, 6.172f, 20.5f, 7.0f, 20.5f)
                curveTo(7.828f, 20.5f, 8.5f, 19.829f, 8.5f, 19.0f)
                curveTo(8.5f, 18.172f, 7.828f, 17.5f, 7.0f, 17.5f)
                curveTo(6.172f, 17.5f, 5.5f, 18.172f, 5.5f, 19.0f)
                close()
                moveTo(15.0f, 20.5f)
                curveTo(15.828f, 20.5f, 16.5f, 19.829f, 16.5f, 19.0f)
                curveTo(16.5f, 18.172f, 15.828f, 17.5f, 15.0f, 17.5f)
                curveTo(14.172f, 17.5f, 13.5f, 18.172f, 13.5f, 19.0f)
                curveTo(13.5f, 19.829f, 14.172f, 20.5f, 15.0f, 20.5f)
                close()
            }
        }
        .build()
        return _vehicleTruckCube!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTruckCube: ImageVector? = null

@Preview
@Composable
private fun VehicleTruckCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleTruckCube, contentDescription = null)
    }
}

