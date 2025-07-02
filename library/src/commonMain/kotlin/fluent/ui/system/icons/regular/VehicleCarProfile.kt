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
 * VehicleCarProfile icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, car, profile
 * - Source: ic_fluent_vehicle_car_profile_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleCarProfile icon.
 */
public val FluentIcons.Regular.VehicleCarProfile: ImageVector
    get() {
        if (_vehicleCarProfile != null) {
            return _vehicleCarProfile!!
        }
        _vehicleCarProfile = Builder(name = "VehicleCarProfile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.374f, 6.026f)
                curveTo(5.701f, 4.83f, 6.787f, 4.0f, 8.028f, 4.0f)
                horizontalLineTo(12.858f)
                curveTo(13.831f, 4.0f, 14.732f, 4.514f, 15.226f, 5.352f)
                lineTo(17.735f, 9.598f)
                lineTo(19.917f, 10.144f)
                curveTo(21.141f, 10.45f, 22.0f, 11.55f, 22.0f, 12.812f)
                verticalLineTo(14.5f)
                curveTo(22.0f, 15.602f, 21.351f, 16.553f, 20.415f, 16.992f)
                curveTo(20.079f, 18.429f, 18.79f, 19.5f, 17.25f, 19.5f)
                curveTo(15.804f, 19.5f, 14.578f, 18.556f, 14.157f, 17.25f)
                horizontalLineTo(9.343f)
                curveTo(8.921f, 18.556f, 7.696f, 19.5f, 6.25f, 19.5f)
                curveTo(4.587f, 19.5f, 3.216f, 18.251f, 3.023f, 16.64f)
                curveTo(2.399f, 16.136f, 2.0f, 15.365f, 2.0f, 14.5f)
                verticalLineTo(12.25f)
                curveTo(2.0f, 10.842f, 3.058f, 9.682f, 4.422f, 9.519f)
                lineTo(5.374f, 6.026f)
                close()
                moveTo(14.038f, 15.75f)
                curveTo(14.279f, 14.193f, 15.625f, 13.0f, 17.25f, 13.0f)
                curveTo(18.662f, 13.0f, 19.864f, 13.901f, 20.312f, 15.159f)
                curveTo(20.431f, 14.968f, 20.5f, 14.742f, 20.5f, 14.5f)
                verticalLineTo(12.812f)
                curveTo(20.5f, 12.238f, 20.11f, 11.738f, 19.553f, 11.599f)
                lineTo(17.156f, 11.0f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 11.0f, 3.5f, 11.56f, 3.5f, 12.25f)
                verticalLineTo(14.5f)
                lineTo(3.5f, 14.517f)
                curveTo(4.076f, 13.605f, 5.092f, 13.0f, 6.25f, 13.0f)
                curveTo(7.875f, 13.0f, 9.221f, 14.193f, 9.462f, 15.75f)
                horizontalLineTo(14.038f)
                close()
                moveTo(11.0f, 9.5f)
                horizontalLineTo(15.934f)
                lineTo(13.935f, 6.114f)
                curveTo(13.71f, 5.734f, 13.301f, 5.5f, 12.858f, 5.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.5f)
                close()
                moveTo(9.5f, 5.5f)
                horizontalLineTo(8.028f)
                curveTo(7.464f, 5.5f, 6.97f, 5.877f, 6.822f, 6.421f)
                lineTo(5.982f, 9.5f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 5.5f)
                close()
                moveTo(6.25f, 14.5f)
                curveTo(5.284f, 14.5f, 4.5f, 15.283f, 4.5f, 16.25f)
                curveTo(4.5f, 17.216f, 5.284f, 18.0f, 6.25f, 18.0f)
                curveTo(7.216f, 18.0f, 8.0f, 17.216f, 8.0f, 16.25f)
                curveTo(8.0f, 15.283f, 7.216f, 14.5f, 6.25f, 14.5f)
                close()
                moveTo(15.5f, 16.25f)
                curveTo(15.5f, 17.216f, 16.284f, 18.0f, 17.25f, 18.0f)
                curveTo(18.216f, 18.0f, 19.0f, 17.216f, 19.0f, 16.25f)
                curveTo(19.0f, 15.283f, 18.216f, 14.5f, 17.25f, 14.5f)
                curveTo(16.284f, 14.5f, 15.5f, 15.283f, 15.5f, 16.25f)
                close()
            }
        }
        .build()
        return _vehicleCarProfile!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleCarProfile: ImageVector? = null

@Preview
@Composable
private fun VehicleCarProfilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleCarProfile, contentDescription = null)
    }
}

