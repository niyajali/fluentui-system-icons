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
 * VehicleShip icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: vehicle, ship
 * - Source: ic_fluent_vehicle_ship_24_regular.svg
 * 
 * @return The [ImageVector] for the VehicleShip icon.
 */
public val FluentIcons.Regular.VehicleShip: ImageVector
    get() {
        if (_vehicleShip != null) {
            return _vehicleShip!!
        }
        _vehicleShip = Builder(name = "VehicleShip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.75f, 2.0f)
                curveTo(8.336f, 2.0f, 8.0f, 2.336f, 8.0f, 2.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 5.0f, 5.0f, 5.336f, 5.0f, 5.75f)
                verticalLineTo(10.514f)
                lineTo(3.539f, 11.049f)
                curveTo(3.342f, 11.121f, 3.185f, 11.273f, 3.104f, 11.467f)
                curveTo(3.024f, 11.661f, 3.029f, 11.88f, 3.117f, 12.07f)
                lineTo(5.452f, 17.088f)
                curveTo(5.617f, 17.033f, 5.793f, 17.003f, 5.974f, 17.0f)
                curveTo(6.532f, 16.992f, 7.046f, 17.249f, 7.376f, 17.669f)
                lineTo(4.822f, 12.177f)
                lineTo(11.409f, 9.765f)
                curveTo(11.793f, 9.624f, 12.214f, 9.623f, 12.599f, 9.76f)
                lineTo(19.374f, 12.178f)
                lineTo(16.752f, 17.523f)
                curveTo(17.081f, 17.189f, 17.539f, 16.992f, 18.031f, 17.0f)
                curveTo(18.238f, 17.004f, 18.438f, 17.044f, 18.623f, 17.115f)
                lineTo(21.091f, 12.084f)
                curveTo(21.185f, 11.892f, 21.193f, 11.669f, 21.113f, 11.471f)
                curveTo(21.032f, 11.273f, 20.871f, 11.119f, 20.67f, 11.047f)
                lineTo(19.0f, 10.451f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.336f, 18.664f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.75f)
                curveTo(16.0f, 2.336f, 15.664f, 2.0f, 15.25f, 2.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(14.5f, 5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.5f, 6.5f)
                verticalLineTo(9.916f)
                lineTo(13.103f, 8.347f)
                curveTo(12.388f, 8.092f, 11.606f, 8.095f, 10.893f, 8.356f)
                lineTo(6.5f, 9.965f)
                verticalLineTo(6.5f)
                horizontalLineTo(17.5f)
                close()
                moveTo(18.727f, 18.563f)
                lineTo(18.724f, 18.555f)
                curveTo(18.637f, 18.232f, 18.347f, 18.006f, 18.013f, 18.0f)
                curveTo(17.678f, 17.994f, 17.38f, 18.211f, 17.283f, 18.531f)
                lineTo(17.282f, 18.533f)
                lineTo(17.279f, 18.542f)
                curveTo(17.275f, 18.553f, 17.269f, 18.573f, 17.259f, 18.6f)
                curveTo(17.239f, 18.653f, 17.208f, 18.733f, 17.163f, 18.832f)
                curveTo(17.074f, 19.031f, 16.935f, 19.292f, 16.742f, 19.55f)
                curveTo(16.355f, 20.065f, 15.803f, 20.5f, 15.0f, 20.5f)
                curveTo(14.197f, 20.5f, 13.644f, 20.065f, 13.257f, 19.549f)
                curveTo(13.064f, 19.292f, 12.925f, 19.031f, 12.835f, 18.832f)
                curveTo(12.791f, 18.733f, 12.759f, 18.653f, 12.74f, 18.599f)
                curveTo(12.73f, 18.573f, 12.723f, 18.553f, 12.719f, 18.542f)
                lineTo(12.716f, 18.532f)
                curveTo(12.716f, 18.532f, 12.716f, 18.532f, 12.716f, 18.532f)
                curveTo(12.62f, 18.216f, 12.328f, 18.0f, 11.998f, 18.0f)
                curveTo(11.667f, 18.0f, 11.376f, 18.217f, 11.281f, 18.533f)
                lineTo(11.28f, 18.534f)
                lineTo(11.277f, 18.543f)
                curveTo(11.274f, 18.555f, 11.267f, 18.574f, 11.257f, 18.601f)
                curveTo(11.238f, 18.654f, 11.207f, 18.735f, 11.162f, 18.833f)
                curveTo(11.073f, 19.032f, 10.935f, 19.293f, 10.743f, 19.55f)
                curveTo(10.357f, 20.065f, 9.806f, 20.5f, 9.0f, 20.5f)
                curveTo(8.194f, 20.5f, 7.642f, 20.065f, 7.256f, 19.55f)
                curveTo(7.063f, 19.293f, 6.926f, 19.032f, 6.836f, 18.833f)
                curveTo(6.792f, 18.734f, 6.761f, 18.654f, 6.741f, 18.601f)
                curveTo(6.732f, 18.574f, 6.725f, 18.555f, 6.721f, 18.543f)
                lineTo(6.718f, 18.532f)
                curveTo(6.62f, 18.212f, 6.323f, 17.995f, 5.989f, 18.0f)
                curveTo(5.655f, 18.005f, 5.365f, 18.23f, 5.277f, 18.552f)
                lineTo(5.274f, 18.561f)
                curveTo(5.271f, 18.571f, 5.265f, 18.59f, 5.256f, 18.615f)
                curveTo(5.239f, 18.666f, 5.21f, 18.743f, 5.169f, 18.839f)
                curveTo(5.084f, 19.031f, 4.949f, 19.286f, 4.752f, 19.537f)
                curveTo(4.368f, 20.027f, 3.756f, 20.5f, 2.75f, 20.5f)
                curveTo(2.336f, 20.5f, 2.0f, 20.836f, 2.0f, 21.25f)
                curveTo(2.0f, 21.664f, 2.336f, 22.0f, 2.75f, 22.0f)
                curveTo(4.324f, 22.0f, 5.337f, 21.223f, 5.933f, 20.463f)
                curveTo(5.956f, 20.433f, 5.978f, 20.404f, 6.0f, 20.374f)
                curveTo(6.019f, 20.399f, 6.037f, 20.425f, 6.056f, 20.45f)
                curveTo(6.608f, 21.185f, 7.556f, 22.0f, 9.0f, 22.0f)
                curveTo(10.444f, 22.0f, 11.392f, 21.185f, 11.943f, 20.45f)
                curveTo(11.963f, 20.424f, 11.981f, 20.398f, 12.0f, 20.372f)
                curveTo(12.019f, 20.398f, 12.038f, 20.424f, 12.058f, 20.451f)
                curveTo(12.61f, 21.185f, 13.558f, 22.0f, 15.0f, 22.0f)
                curveTo(16.442f, 22.0f, 17.39f, 21.185f, 17.942f, 20.45f)
                curveTo(17.961f, 20.425f, 17.979f, 20.4f, 17.997f, 20.375f)
                curveTo(18.018f, 20.404f, 18.04f, 20.433f, 18.063f, 20.462f)
                curveTo(18.658f, 21.223f, 19.672f, 22.0f, 21.25f, 22.0f)
                curveTo(21.664f, 22.0f, 22.0f, 21.664f, 22.0f, 21.25f)
                curveTo(22.0f, 20.836f, 21.664f, 20.5f, 21.25f, 20.5f)
                curveTo(20.238f, 20.5f, 19.627f, 20.027f, 19.245f, 19.538f)
                curveTo(19.048f, 19.287f, 18.915f, 19.033f, 18.831f, 18.84f)
                curveTo(18.789f, 18.745f, 18.761f, 18.668f, 18.744f, 18.617f)
                curveTo(18.735f, 18.592f, 18.73f, 18.574f, 18.727f, 18.563f)
                close()
            }
        }
        .build()
        return _vehicleShip!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleShip: ImageVector? = null

@Preview
@Composable
private fun VehicleShipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleShip, contentDescription = null)
    }
}

