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
 * VehicleTruck Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general cargo scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_truck_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleTruck icon.
 */
public val FluentIcons.Regular.VehicleTruck: ImageVector
    get() {
        if (_vehicleTruck != null) {
            return _vehicleTruck!!
        }
        _vehicleTruck = Builder(name = "VehicleTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.005f, 15.0f)
                curveTo(9.558f, 15.0f, 10.005f, 14.552f, 10.005f, 14.0f)
                curveTo(10.005f, 13.448f, 9.558f, 13.0f, 9.005f, 13.0f)
                curveTo(8.453f, 13.0f, 8.005f, 13.448f, 8.005f, 14.0f)
                curveTo(8.005f, 14.552f, 8.453f, 15.0f, 9.005f, 15.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(16.0f, 14.552f, 15.552f, 15.0f, 15.0f, 15.0f)
                curveTo(14.448f, 15.0f, 14.0f, 14.552f, 14.0f, 14.0f)
                curveTo(14.0f, 13.448f, 14.448f, 13.0f, 15.0f, 13.0f)
                curveTo(15.552f, 13.0f, 16.0f, 13.448f, 16.0f, 14.0f)
                close()
                moveTo(10.75f, 15.5f)
                curveTo(10.336f, 15.5f, 10.0f, 15.836f, 10.0f, 16.25f)
                curveTo(10.0f, 16.664f, 10.336f, 17.0f, 10.75f, 17.0f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 17.0f, 14.0f, 16.664f, 14.0f, 16.25f)
                curveTo(14.0f, 15.836f, 13.664f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(3.0f, 5.25f)
                curveTo(3.0f, 4.007f, 4.007f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 3.0f, 21.0f, 4.007f, 21.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(21.0f, 19.164f, 20.664f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(20.25f)
                curveTo(18.5f, 21.216f, 17.716f, 22.0f, 16.75f, 22.0f)
                horizontalLineTo(15.25f)
                curveTo(14.283f, 22.0f, 13.5f, 21.216f, 13.5f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(20.25f)
                curveTo(10.5f, 21.216f, 9.717f, 22.0f, 8.75f, 22.0f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 22.0f, 5.5f, 21.216f, 5.5f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 19.5f, 3.0f, 19.164f, 3.0f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.0f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.25f)
                curveTo(7.0f, 20.388f, 7.112f, 20.5f, 7.25f, 20.5f)
                horizontalLineTo(8.75f)
                curveTo(8.888f, 20.5f, 9.0f, 20.388f, 9.0f, 20.25f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(15.0f, 19.5f)
                verticalLineTo(20.25f)
                curveTo(15.0f, 20.388f, 15.112f, 20.5f, 15.25f, 20.5f)
                horizontalLineTo(16.75f)
                curveTo(16.888f, 20.5f, 17.0f, 20.388f, 17.0f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(15.0f)
                close()
                moveTo(19.5f, 18.0f)
                verticalLineTo(5.25f)
                curveTo(19.5f, 4.836f, 19.164f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(11.25f)
                curveTo(5.5f, 11.195f, 5.506f, 11.141f, 5.518f, 11.087f)
                lineTo(6.257f, 7.762f)
                curveTo(6.486f, 6.732f, 7.399f, 6.0f, 8.453f, 6.0f)
                horizontalLineTo(15.547f)
                curveTo(16.601f, 6.0f, 17.514f, 6.732f, 17.743f, 7.762f)
                lineTo(18.482f, 11.087f)
                curveTo(18.494f, 11.141f, 18.5f, 11.195f, 18.5f, 11.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(8.453f, 7.5f)
                curveTo(8.102f, 7.5f, 7.797f, 7.744f, 7.721f, 8.087f)
                lineTo(7.185f, 10.5f)
                horizontalLineTo(16.815f)
                lineTo(16.279f, 8.087f)
                curveTo(16.203f, 7.744f, 15.898f, 7.5f, 15.547f, 7.5f)
                horizontalLineTo(8.453f)
                close()
            }
        }
        .build()
        return _vehicleTruck!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTruck: ImageVector? = null

@Preview
@Composable
private fun VehicleTruckPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleTruck, contentDescription = "VehicleTruck Icon")
    }
}

