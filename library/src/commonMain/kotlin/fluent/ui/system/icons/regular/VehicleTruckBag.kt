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
 * VehicleTruckBag Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general cargo scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_truck_bag_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleTruckBag icon.
 */
public val FluentIcons.Regular.VehicleTruckBag: ImageVector
    get() {
        if (_vehicleTruckBag != null) {
            return _vehicleTruckBag!!
        }
        _vehicleTruckBag = Builder(name = "VehicleTruckBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.75f, 4.5f)
                curveTo(1.336f, 4.5f, 1.0f, 4.836f, 1.0f, 5.25f)
                verticalLineTo(11.25f)
                curveTo(1.0f, 12.493f, 2.007f, 13.5f, 3.25f, 13.5f)
                horizontalLineTo(8.25f)
                curveTo(9.493f, 13.5f, 10.5f, 12.493f, 10.5f, 11.25f)
                verticalLineTo(5.25f)
                curveTo(10.5f, 4.836f, 10.164f, 4.5f, 9.75f, 4.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.5f)
                curveTo(9.5f, 2.119f, 8.381f, 1.0f, 7.0f, 1.0f)
                curveTo(6.545f, 1.0f, 6.118f, 1.122f, 5.75f, 1.335f)
                curveTo(5.382f, 1.122f, 4.955f, 1.0f, 4.5f, 1.0f)
                curveTo(3.119f, 1.0f, 2.0f, 2.119f, 2.0f, 3.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(1.75f)
                close()
                moveTo(7.0f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(7.0f, 3.152f, 6.929f, 2.821f, 6.801f, 2.52f)
                curveTo(6.865f, 2.507f, 6.932f, 2.5f, 7.0f, 2.5f)
                curveTo(7.552f, 2.5f, 8.0f, 2.948f, 8.0f, 3.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.0f)
                close()
                moveTo(5.5f, 3.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.5f)
                curveTo(3.5f, 2.948f, 3.948f, 2.5f, 4.5f, 2.5f)
                curveTo(5.052f, 2.5f, 5.5f, 2.948f, 5.5f, 3.5f)
                close()
                moveTo(2.0f, 17.25f)
                verticalLineTo(14.251f)
                curveTo(2.385f, 14.411f, 2.807f, 14.5f, 3.25f, 14.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.638f, 3.795f, 17.957f, 4.172f, 17.996f)
                curveTo(4.585f, 16.833f, 5.695f, 16.0f, 7.0f, 16.0f)
                curveTo(8.306f, 16.0f, 9.417f, 16.835f, 9.829f, 18.0f)
                horizontalLineTo(12.171f)
                curveTo(12.583f, 16.835f, 13.694f, 16.0f, 15.0f, 16.0f)
                verticalLineTo(5.25f)
                curveTo(15.0f, 4.836f, 14.664f, 4.5f, 14.25f, 4.5f)
                horizontalLineTo(11.332f)
                curveTo(11.159f, 4.136f, 10.864f, 3.841f, 10.5f, 3.668f)
                verticalLineTo(3.5f)
                curveTo(10.5f, 3.33f, 10.488f, 3.163f, 10.465f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 3.0f, 16.5f, 4.007f, 16.5f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.051f)
                curveTo(18.92f, 6.0f, 19.712f, 6.501f, 20.084f, 7.287f)
                lineTo(21.783f, 10.874f)
                curveTo(21.926f, 11.175f, 22.0f, 11.504f, 22.0f, 11.837f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.493f, 20.993f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(17.958f)
                curveTo(17.721f, 20.919f, 16.486f, 22.0f, 15.0f, 22.0f)
                curveTo(13.514f, 22.0f, 12.28f, 20.919f, 12.042f, 19.5f)
                horizontalLineTo(9.959f)
                curveTo(9.72f, 20.919f, 8.486f, 22.0f, 7.0f, 22.0f)
                curveTo(5.51f, 22.0f, 4.274f, 20.914f, 4.04f, 19.49f)
                curveTo(2.896f, 19.384f, 2.0f, 18.422f, 2.0f, 17.25f)
                close()
                moveTo(17.829f, 18.0f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 18.0f, 20.5f, 17.664f, 20.5f, 17.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.25f)
                curveTo(18.836f, 17.0f, 18.5f, 16.664f, 18.5f, 16.25f)
                curveTo(18.5f, 15.836f, 18.836f, 15.5f, 19.25f, 15.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.5f)
                lineTo(16.5f, 12.5f)
                verticalLineTo(16.401f)
                curveTo(17.114f, 16.756f, 17.59f, 17.322f, 17.829f, 18.0f)
                close()
                moveTo(16.5f, 7.5f)
                verticalLineTo(11.0f)
                lineTo(20.183f, 11.0f)
                lineTo(18.729f, 7.929f)
                curveTo(18.604f, 7.667f, 18.341f, 7.5f, 18.051f, 7.5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(7.0f, 20.5f)
                curveTo(7.828f, 20.5f, 8.5f, 19.828f, 8.5f, 19.0f)
                curveTo(8.5f, 18.172f, 7.828f, 17.5f, 7.0f, 17.5f)
                curveTo(6.172f, 17.5f, 5.5f, 18.172f, 5.5f, 19.0f)
                curveTo(5.5f, 19.828f, 6.172f, 20.5f, 7.0f, 20.5f)
                close()
                moveTo(16.5f, 19.0f)
                curveTo(16.5f, 18.172f, 15.828f, 17.5f, 15.0f, 17.5f)
                curveTo(14.172f, 17.5f, 13.5f, 18.172f, 13.5f, 19.0f)
                curveTo(13.5f, 19.828f, 14.172f, 20.5f, 15.0f, 20.5f)
                curveTo(15.828f, 20.5f, 16.5f, 19.828f, 16.5f, 19.0f)
                close()
                moveTo(3.5f, 3.5f)
                curveTo(3.5f, 3.358f, 3.53f, 3.223f, 3.583f, 3.101f)
                close()
            }
        }
        .build()
        return _vehicleTruckBag!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTruckBag: ImageVector? = null

@Preview
@Composable
private fun VehicleTruckBagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleTruckBag, contentDescription = "VehicleTruckBag Icon")
    }
}

