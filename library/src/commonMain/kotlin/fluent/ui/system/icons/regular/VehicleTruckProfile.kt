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
 * VehicleTruckProfile icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, truck, profile
 * - Source: ic_fluent_vehicle_truck_profile_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleTruckProfile icon.
 */
public val FluentIcons.Regular.VehicleTruckProfile: ImageVector
    get() {
        if (_vehicleTruckProfile != null) {
            return _vehicleTruckProfile!!
        }
        _vehicleTruckProfile = Builder(name = "VehicleTruckProfile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.25f, 3.0f)
                curveTo(3.007f, 3.0f, 2.0f, 4.007f, 2.0f, 5.25f)
                verticalLineTo(17.25f)
                curveTo(2.0f, 18.422f, 2.896f, 19.384f, 4.04f, 19.49f)
                curveTo(4.274f, 20.914f, 5.51f, 22.0f, 7.0f, 22.0f)
                curveTo(8.486f, 22.0f, 9.72f, 20.919f, 9.959f, 19.5f)
                horizontalLineTo(12.042f)
                curveTo(12.28f, 20.919f, 13.514f, 22.0f, 15.0f, 22.0f)
                curveTo(16.486f, 22.0f, 17.721f, 20.919f, 17.958f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 19.5f, 22.0f, 18.493f, 22.0f, 17.25f)
                verticalLineTo(11.837f)
                curveTo(22.0f, 11.504f, 21.926f, 11.175f, 21.783f, 10.874f)
                lineTo(20.084f, 7.287f)
                curveTo(19.712f, 6.501f, 18.92f, 6.0f, 18.051f, 6.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 4.007f, 15.493f, 3.0f, 14.25f, 3.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(17.829f, 18.0f)
                curveTo(17.59f, 17.322f, 17.114f, 16.756f, 16.5f, 16.401f)
                verticalLineTo(12.5f)
                lineTo(20.5f, 12.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.25f)
                curveTo(18.836f, 15.5f, 18.5f, 15.836f, 18.5f, 16.25f)
                curveTo(18.5f, 16.664f, 18.836f, 17.0f, 19.25f, 17.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 17.664f, 20.164f, 18.0f, 19.75f, 18.0f)
                horizontalLineTo(17.829f)
                close()
                moveTo(15.0f, 16.0f)
                curveTo(13.694f, 16.0f, 12.583f, 16.835f, 12.171f, 18.0f)
                horizontalLineTo(9.829f)
                curveTo(9.417f, 16.835f, 8.306f, 16.0f, 7.0f, 16.0f)
                curveTo(5.695f, 16.0f, 4.585f, 16.833f, 4.172f, 17.996f)
                curveTo(3.795f, 17.957f, 3.5f, 17.638f, 3.5f, 17.25f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 4.836f, 3.836f, 4.5f, 4.25f, 4.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 4.5f, 15.0f, 4.836f, 15.0f, 5.25f)
                verticalLineTo(16.0f)
                close()
                moveTo(16.5f, 7.5f)
                horizontalLineTo(18.051f)
                curveTo(18.341f, 7.5f, 18.604f, 7.667f, 18.729f, 7.929f)
                lineTo(20.183f, 11.0f)
                lineTo(16.5f, 11.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(7.0f, 20.5f)
                curveTo(6.172f, 20.5f, 5.5f, 19.828f, 5.5f, 19.0f)
                curveTo(5.5f, 18.172f, 6.172f, 17.5f, 7.0f, 17.5f)
                curveTo(7.828f, 17.5f, 8.5f, 18.172f, 8.5f, 19.0f)
                curveTo(8.5f, 19.828f, 7.828f, 20.5f, 7.0f, 20.5f)
                close()
                moveTo(16.5f, 19.0f)
                curveTo(16.5f, 19.828f, 15.828f, 20.5f, 15.0f, 20.5f)
                curveTo(14.172f, 20.5f, 13.5f, 19.828f, 13.5f, 19.0f)
                curveTo(13.5f, 18.172f, 14.172f, 17.5f, 15.0f, 17.5f)
                curveTo(15.828f, 17.5f, 16.5f, 18.172f, 16.5f, 19.0f)
                close()
            }
        }
        .build()
        return _vehicleTruckProfile!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTruckProfile: ImageVector? = null

@Preview
@Composable
private fun VehicleTruckProfilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleTruckProfile, contentDescription = null)
    }
}

