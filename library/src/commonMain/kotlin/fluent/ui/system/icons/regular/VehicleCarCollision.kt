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
 * VehicleCarCollision icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, car, collision
 * - Source: ic_fluent_vehicle_car_collision_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleCarCollision icon.
 */
public val FluentIcons.Regular.VehicleCarCollision: ImageVector
    get() {
        if (_vehicleCarCollision != null) {
            return _vehicleCarCollision!!
        }
        _vehicleCarCollision = Builder(name = "VehicleCarCollision", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.509f, 2.04f)
                curveTo(11.813f, 1.937f, 12.149f, 2.038f, 12.344f, 2.293f)
                lineTo(14.424f, 4.996f)
                lineTo(17.344f, 3.119f)
                curveTo(17.612f, 2.947f, 17.959f, 2.963f, 18.21f, 3.158f)
                curveTo(18.461f, 3.353f, 18.562f, 3.685f, 18.462f, 3.987f)
                lineTo(17.291f, 7.5f)
                horizontalLineTo(21.25f)
                curveTo(21.553f, 7.5f, 21.827f, 7.683f, 21.943f, 7.963f)
                curveTo(22.059f, 8.243f, 21.995f, 8.566f, 21.78f, 8.78f)
                lineTo(19.73f, 10.831f)
                lineTo(21.86f, 13.814f)
                curveTo(22.024f, 14.043f, 22.045f, 14.343f, 21.917f, 14.593f)
                curveTo(21.788f, 14.843f, 21.531f, 15.0f, 21.25f, 15.0f)
                horizontalLineTo(18.25f)
                curveTo(17.836f, 15.0f, 17.5f, 14.664f, 17.5f, 14.25f)
                curveTo(17.5f, 13.836f, 17.836f, 13.5f, 18.25f, 13.5f)
                horizontalLineTo(19.793f)
                lineTo(18.14f, 11.186f)
                curveTo(17.927f, 10.888f, 17.96f, 10.479f, 18.22f, 10.22f)
                lineTo(19.439f, 9.0f)
                horizontalLineTo(16.25f)
                curveTo(16.009f, 9.0f, 15.783f, 8.884f, 15.642f, 8.689f)
                curveTo(15.501f, 8.493f, 15.462f, 8.242f, 15.538f, 8.013f)
                lineTo(16.366f, 5.532f)
                lineTo(14.656f, 6.631f)
                curveTo(14.328f, 6.842f, 13.893f, 6.766f, 13.656f, 6.457f)
                lineTo(12.5f, 4.955f)
                verticalLineTo(7.25f)
                curveTo(12.5f, 7.664f, 12.164f, 8.0f, 11.75f, 8.0f)
                curveTo(11.336f, 8.0f, 11.0f, 7.664f, 11.0f, 7.25f)
                verticalLineTo(2.75f)
                curveTo(11.0f, 2.429f, 11.205f, 2.143f, 11.509f, 2.04f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.552f, 17.5f, 13.0f, 17.052f, 13.0f, 16.5f)
                curveTo(13.0f, 15.948f, 12.552f, 15.5f, 12.0f, 15.5f)
                curveTo(11.448f, 15.5f, 11.0f, 15.948f, 11.0f, 16.5f)
                curveTo(11.0f, 17.052f, 11.448f, 17.5f, 12.0f, 17.5f)
                close()
                moveTo(7.0f, 16.5f)
                curveTo(7.0f, 17.052f, 6.552f, 17.5f, 6.0f, 17.5f)
                curveTo(5.448f, 17.5f, 5.0f, 17.052f, 5.0f, 16.5f)
                curveTo(5.0f, 15.948f, 5.448f, 15.5f, 6.0f, 15.5f)
                curveTo(6.552f, 15.5f, 7.0f, 15.948f, 7.0f, 16.5f)
                close()
                moveTo(15.137f, 13.75f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 13.75f, 16.0f, 13.414f, 16.0f, 13.0f)
                curveTo(16.0f, 12.586f, 15.664f, 12.25f, 15.25f, 12.25f)
                horizontalLineTo(14.648f)
                lineTo(14.262f, 10.704f)
                curveTo(14.011f, 9.703f, 13.111f, 9.0f, 12.079f, 9.0f)
                horizontalLineTo(5.995f)
                curveTo(4.912f, 9.0f, 3.983f, 9.771f, 3.783f, 10.835f)
                lineTo(3.518f, 12.25f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.25f, 2.0f, 12.586f, 2.0f, 13.0f)
                curveTo(2.0f, 13.414f, 2.336f, 13.75f, 2.75f, 13.75f)
                horizontalLineTo(2.863f)
                curveTo(2.331f, 14.251f, 2.0f, 14.962f, 2.0f, 15.75f)
                verticalLineTo(20.5f)
                curveTo(2.0f, 21.329f, 2.672f, 22.0f, 3.5f, 22.0f)
                curveTo(4.328f, 22.0f, 5.0f, 21.329f, 5.0f, 20.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.5f)
                curveTo(13.0f, 21.329f, 13.672f, 22.0f, 14.5f, 22.0f)
                curveTo(15.328f, 22.0f, 16.0f, 21.329f, 16.0f, 20.5f)
                verticalLineTo(15.75f)
                curveTo(16.0f, 14.962f, 15.669f, 14.251f, 15.137f, 13.75f)
                close()
                moveTo(5.995f, 10.5f)
                horizontalLineTo(12.079f)
                curveTo(12.423f, 10.5f, 12.723f, 10.734f, 12.806f, 11.068f)
                lineTo(13.259f, 12.88f)
                curveTo(13.253f, 12.919f, 13.25f, 12.959f, 13.25f, 13.0f)
                horizontalLineTo(4.904f)
                lineTo(5.258f, 11.112f)
                curveTo(5.324f, 10.757f, 5.634f, 10.5f, 5.995f, 10.5f)
                close()
                moveTo(14.5f, 18.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 15.06f, 4.06f, 14.5f, 4.75f, 14.5f)
                horizontalLineTo(13.25f)
                curveTo(13.94f, 14.5f, 14.5f, 15.06f, 14.5f, 15.75f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _vehicleCarCollision!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleCarCollision: ImageVector? = null

@Preview
@Composable
private fun VehicleCarCollisionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleCarCollision, contentDescription = null)
    }
}

