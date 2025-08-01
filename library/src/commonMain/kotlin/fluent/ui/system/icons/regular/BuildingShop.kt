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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.BuildingShop: ImageVector
    get() {
        if (_BuildingShop != null) {
            return _BuildingShop!!
        }
        _BuildingShop = ImageVector.Builder(
            name = "Regular.BuildingShop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 2f)
                curveTo(18.174f, 2f, 18.342f, 2.06f, 18.475f, 2.169f)
                lineTo(18.55f, 2.24f)
                lineTo(21.823f, 5.768f)
                lineTo(21.853f, 5.807f)
                curveTo(21.955f, 5.943f, 22.001f, 6.097f, 22.001f, 6.248f)
                lineTo(21.999f, 8.167f)
                curveTo(21.999f, 9.161f, 21.621f, 10.067f, 21f, 10.748f)
                lineTo(20.999f, 21.25f)
                curveTo(20.999f, 21.63f, 20.717f, 21.944f, 20.351f, 21.993f)
                lineTo(20.249f, 22f)
                horizontalLineTo(3.752f)
                curveTo(3.372f, 22f, 3.058f, 21.718f, 3.008f, 21.352f)
                lineTo(3.002f, 21.25f)
                lineTo(3.001f, 10.748f)
                curveTo(2.428f, 10.119f, 2.061f, 9.299f, 2.008f, 8.395f)
                lineTo(2.001f, 8.167f)
                lineTo(2.001f, 6.291f)
                curveTo(1.993f, 6.154f, 2.023f, 6.012f, 2.097f, 5.883f)
                lineTo(2.162f, 5.788f)
                lineTo(2.202f, 5.742f)
                lineTo(5.451f, 2.24f)
                curveTo(5.569f, 2.112f, 5.727f, 2.031f, 5.897f, 2.007f)
                lineTo(6f, 2f)
                horizontalLineTo(18f)
                close()
                moveTo(15.082f, 10.442f)
                lineTo(15.07f, 10.46f)
                curveTo(14.372f, 11.394f, 13.256f, 11.999f, 11.999f, 11.999f)
                curveTo(10.735f, 11.999f, 9.614f, 11.388f, 8.916f, 10.444f)
                curveTo(8.219f, 11.388f, 7.098f, 11.999f, 5.834f, 11.999f)
                curveTo(5.365f, 11.999f, 4.916f, 11.915f, 4.5f, 11.761f)
                lineTo(4.501f, 20.499f)
                horizontalLineTo(6f)
                lineTo(6f, 13.751f)
                curveTo(6f, 13.371f, 6.283f, 13.057f, 6.649f, 13.008f)
                lineTo(6.75f, 13.001f)
                horizontalLineTo(11.246f)
                curveTo(11.626f, 13.001f, 11.94f, 13.283f, 11.99f, 13.649f)
                lineTo(11.996f, 13.751f)
                lineTo(11.996f, 20.499f)
                horizontalLineTo(19.498f)
                lineTo(19.499f, 11.762f)
                curveTo(19.084f, 11.915f, 18.635f, 11.999f, 18.167f, 11.999f)
                curveTo(16.902f, 11.999f, 15.78f, 11.387f, 15.082f, 10.442f)
                close()
                moveTo(10.495f, 14.501f)
                horizontalLineTo(7.5f)
                verticalLineTo(20.499f)
                horizontalLineTo(10.495f)
                verticalLineTo(14.501f)
                close()
                moveTo(17.255f, 13.001f)
                curveTo(17.635f, 13.001f, 17.949f, 13.283f, 17.998f, 13.649f)
                lineTo(18.005f, 13.751f)
                verticalLineTo(17.253f)
                curveTo(18.005f, 17.633f, 17.723f, 17.947f, 17.357f, 17.996f)
                lineTo(17.255f, 18.003f)
                horizontalLineTo(13.754f)
                curveTo(13.374f, 18.003f, 13.06f, 17.721f, 13.01f, 17.355f)
                lineTo(13.004f, 17.253f)
                verticalLineTo(13.751f)
                curveTo(13.004f, 13.371f, 13.286f, 13.057f, 13.652f, 13.008f)
                lineTo(13.754f, 13.001f)
                horizontalLineTo(17.255f)
                close()
                moveTo(16.504f, 14.501f)
                horizontalLineTo(14.503f)
                verticalLineTo(16.503f)
                horizontalLineTo(16.504f)
                verticalLineTo(14.501f)
                close()
                moveTo(8.166f, 7.002f)
                horizontalLineTo(3.501f)
                lineTo(3.501f, 8.167f)
                lineTo(3.508f, 8.338f)
                lineTo(3.536f, 8.569f)
                lineTo(3.569f, 8.725f)
                lineTo(3.618f, 8.897f)
                lineTo(3.673f, 9.045f)
                lineTo(3.713f, 9.139f)
                curveTo(3.744f, 9.207f, 3.779f, 9.273f, 3.816f, 9.337f)
                lineTo(3.919f, 9.499f)
                lineTo(3.973f, 9.573f)
                lineTo(4.102f, 9.729f)
                lineTo(4.244f, 9.873f)
                lineTo(4.34f, 9.958f)
                lineTo(4.382f, 9.992f)
                curveTo(4.697f, 10.243f, 5.077f, 10.414f, 5.494f, 10.475f)
                lineTo(5.674f, 10.494f)
                lineTo(5.834f, 10.499f)
                curveTo(7.069f, 10.499f, 8.079f, 9.54f, 8.161f, 8.326f)
                lineTo(8.167f, 8.167f)
                lineTo(8.166f, 7.002f)
                close()
                moveTo(14.331f, 7.002f)
                horizontalLineTo(9.666f)
                lineTo(9.667f, 8.167f)
                curveTo(9.667f, 9.348f, 10.544f, 10.324f, 11.683f, 10.478f)
                lineTo(11.84f, 10.494f)
                lineTo(11.999f, 10.499f)
                curveTo(13.234f, 10.499f, 14.244f, 9.54f, 14.326f, 8.326f)
                lineTo(14.332f, 8.167f)
                lineTo(14.331f, 7.002f)
                close()
                moveTo(20.498f, 7.002f)
                horizontalLineTo(15.833f)
                lineTo(15.834f, 8.167f)
                curveTo(15.834f, 9.348f, 16.712f, 10.324f, 17.85f, 10.478f)
                lineTo(18.007f, 10.494f)
                lineTo(18.167f, 10.499f)
                curveTo(18.731f, 10.499f, 19.249f, 10.299f, 19.652f, 9.965f)
                lineTo(19.742f, 9.887f)
                lineTo(19.858f, 9.774f)
                lineTo(20.004f, 9.604f)
                curveTo(20.058f, 9.535f, 20.108f, 9.463f, 20.154f, 9.388f)
                lineTo(20.258f, 9.202f)
                lineTo(20.32f, 9.064f)
                lineTo(20.379f, 8.909f)
                lineTo(20.409f, 8.813f)
                lineTo(20.447f, 8.661f)
                lineTo(20.475f, 8.504f)
                lineTo(20.493f, 8.337f)
                lineTo(20.499f, 8.167f)
                lineTo(20.498f, 7.002f)
                close()
                moveTo(9.062f, 3.499f)
                horizontalLineTo(6.327f)
                lineTo(4.469f, 5.502f)
                horizontalLineTo(8.446f)
                lineTo(9.062f, 3.499f)
                close()
                moveTo(13.369f, 3.499f)
                horizontalLineTo(10.631f)
                lineTo(10.015f, 5.502f)
                horizontalLineTo(13.985f)
                lineTo(13.369f, 3.499f)
                close()
                moveTo(17.672f, 3.499f)
                horizontalLineTo(14.938f)
                lineTo(15.554f, 5.502f)
                horizontalLineTo(19.53f)
                lineTo(17.672f, 3.499f)
                close()
            }
        }.build()

        return _BuildingShop!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingShop: ImageVector? = null

@Preview
@Composable
private fun BuildingShopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BuildingShop, contentDescription = null)
    }
}
