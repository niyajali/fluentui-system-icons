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
 * VehicleCarProfileLtrClock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent commute time in driving scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_car_profile_ltr_clock_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleCarProfileLtrClock icon.
 */
public val FluentIcons.Regular.VehicleCarProfileLtrClock: ImageVector
    get() {
        if (_vehicleCarProfileLtrClock != null) {
            return _vehicleCarProfileLtrClock!!
        }
        _vehicleCarProfileLtrClock = Builder(name = "VehicleCarProfileLtrClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.826f, 8.0f)
                curveTo(12.939f, 7.52f, 13.0f, 7.019f, 13.0f, 6.504f)
                curveTo(13.918f, 6.551f, 14.756f, 7.055f, 15.226f, 7.852f)
                lineTo(17.735f, 12.099f)
                lineTo(19.917f, 12.644f)
                curveTo(21.141f, 12.95f, 22.0f, 14.05f, 22.0f, 15.312f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.102f, 21.351f, 19.053f, 20.415f, 19.492f)
                curveTo(20.079f, 20.929f, 18.79f, 22.0f, 17.25f, 22.0f)
                curveTo(15.804f, 22.0f, 14.578f, 21.056f, 14.157f, 19.75f)
                horizontalLineTo(9.343f)
                curveTo(8.921f, 21.056f, 7.696f, 22.0f, 6.25f, 22.0f)
                curveTo(4.587f, 22.0f, 3.216f, 20.751f, 3.023f, 19.14f)
                curveTo(2.399f, 18.636f, 2.0f, 17.865f, 2.0f, 17.0f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 13.669f, 2.624f, 12.733f, 3.531f, 12.284f)
                curveTo(4.421f, 12.742f, 5.43f, 13.0f, 6.5f, 13.0f)
                curveTo(8.246f, 13.0f, 9.832f, 12.311f, 11.0f, 11.19f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.934f)
                lineTo(13.935f, 8.614f)
                curveTo(13.71f, 8.234f, 13.301f, 8.0f, 12.858f, 8.0f)
                horizontalLineTo(12.826f)
                close()
                moveTo(14.038f, 18.25f)
                curveTo(14.279f, 16.692f, 15.625f, 15.5f, 17.25f, 15.5f)
                curveTo(18.662f, 15.5f, 19.864f, 16.401f, 20.312f, 17.659f)
                curveTo(20.431f, 17.468f, 20.5f, 17.242f, 20.5f, 17.0f)
                verticalLineTo(15.312f)
                curveTo(20.5f, 14.738f, 20.11f, 14.238f, 19.553f, 14.099f)
                lineTo(17.156f, 13.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 13.5f, 3.5f, 14.06f, 3.5f, 14.75f)
                verticalLineTo(17.0f)
                lineTo(3.5f, 17.017f)
                curveTo(4.076f, 16.105f, 5.092f, 15.5f, 6.25f, 15.5f)
                curveTo(7.875f, 15.5f, 9.221f, 16.692f, 9.462f, 18.25f)
                horizontalLineTo(14.038f)
                close()
                moveTo(6.25f, 17.0f)
                curveTo(5.284f, 17.0f, 4.5f, 17.784f, 4.5f, 18.75f)
                curveTo(4.5f, 19.716f, 5.284f, 20.5f, 6.25f, 20.5f)
                curveTo(7.216f, 20.5f, 8.0f, 19.716f, 8.0f, 18.75f)
                curveTo(8.0f, 17.784f, 7.216f, 17.0f, 6.25f, 17.0f)
                close()
                moveTo(15.5f, 18.75f)
                curveTo(15.5f, 19.716f, 16.284f, 20.5f, 17.25f, 20.5f)
                curveTo(18.216f, 20.5f, 19.0f, 19.716f, 19.0f, 18.75f)
                curveTo(19.0f, 17.784f, 18.216f, 17.0f, 17.25f, 17.0f)
                curveTo(16.284f, 17.0f, 15.5f, 17.784f, 15.5f, 18.75f)
                close()
            }
        }
        .build()
        return _vehicleCarProfileLtrClock!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleCarProfileLtrClock: ImageVector? = null

@Preview
@Composable
private fun VehicleCarProfileLtrClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleCarProfileLtrClock, contentDescription = "VehicleCarProfileLtrClock Icon")
    }
}

