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

public val FluentIcons.Regular.Cellular4G: ImageVector
    get() {
        if (_Cellular4G != null) {
            return _Cellular4G!!
        }
        _Cellular4G = ImageVector.Builder(
            name = "Regular.Cellular4G",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.896f, 3.619f)
                lineTo(12.896f, 3.62f)
                curveTo(13.106f, 3.977f, 12.987f, 4.437f, 12.63f, 4.647f)
                curveTo(12.281f, 4.851f, 11.835f, 4.743f, 11.619f, 4.406f)
                curveTo(11.616f, 4.402f, 11.611f, 4.396f, 11.604f, 4.388f)
                curveTo(11.579f, 4.363f, 11.53f, 4.317f, 11.45f, 4.272f)
                curveTo(11.303f, 4.19f, 10.982f, 4.071f, 10.385f, 4.181f)
                curveTo(9.977f, 4.256f, 9.766f, 4.515f, 9.636f, 4.848f)
                curveTo(9.57f, 5.017f, 9.534f, 5.188f, 9.516f, 5.319f)
                curveTo(9.507f, 5.383f, 9.503f, 5.435f, 9.501f, 5.467f)
                curveTo(9.5f, 5.484f, 9.5f, 5.495f, 9.5f, 5.501f)
                lineTo(9.5f, 5.504f)
                verticalLineTo(6.75f)
                curveTo(9.5f, 7.302f, 9.947f, 7.75f, 10.5f, 7.75f)
                horizontalLineTo(10.75f)
                curveTo(11.216f, 7.75f, 11.607f, 7.431f, 11.718f, 7f)
                horizontalLineTo(11.25f)
                curveTo(10.835f, 7f, 10.5f, 6.664f, 10.5f, 6.25f)
                curveTo(10.5f, 5.836f, 10.835f, 5.5f, 11.25f, 5.5f)
                horizontalLineTo(12.491f)
                lineTo(12.5f, 5.5f)
                curveTo(12.914f, 5.5f, 13.25f, 5.836f, 13.25f, 6.25f)
                verticalLineTo(6.75f)
                curveTo(13.25f, 8.131f, 12.13f, 9.25f, 10.75f, 9.25f)
                horizontalLineTo(10.5f)
                curveTo(9.119f, 9.25f, 8f, 8.131f, 8f, 6.75f)
                verticalLineTo(5.499f)
                lineTo(8f, 5.497f)
                lineTo(8f, 5.494f)
                lineTo(8f, 5.485f)
                lineTo(8f, 5.459f)
                curveTo(8.001f, 5.439f, 8.002f, 5.411f, 8.004f, 5.378f)
                curveTo(8.008f, 5.313f, 8.015f, 5.223f, 8.03f, 5.116f)
                curveTo(8.059f, 4.904f, 8.117f, 4.612f, 8.239f, 4.302f)
                curveTo(8.484f, 3.675f, 9.022f, 2.906f, 10.114f, 2.705f)
                curveTo(11.027f, 2.538f, 11.706f, 2.697f, 12.182f, 2.963f)
                curveTo(12.413f, 3.092f, 12.581f, 3.238f, 12.696f, 3.36f)
                curveTo(12.753f, 3.421f, 12.797f, 3.476f, 12.83f, 3.521f)
                curveTo(12.847f, 3.543f, 12.86f, 3.563f, 12.871f, 3.58f)
                curveTo(12.877f, 3.588f, 12.881f, 3.596f, 12.886f, 3.602f)
                lineTo(12.891f, 3.612f)
                lineTo(12.894f, 3.616f)
                lineTo(12.895f, 3.618f)
                lineTo(12.896f, 3.619f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.728f, 3.061f)
                curveTo(5.324f, 2.337f, 6.5f, 2.759f, 6.5f, 3.697f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 6.5f, 7.5f, 6.836f, 7.5f, 7.25f)
                curveTo(7.5f, 7.664f, 7.164f, 8f, 6.75f, 8f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.5f)
                curveTo(6.5f, 8.914f, 6.164f, 9.25f, 5.75f, 9.25f)
                curveTo(5.335f, 9.25f, 5f, 8.914f, 5f, 8.5f)
                verticalLineTo(8f)
                horizontalLineTo(3.203f)
                curveTo(2.189f, 8f, 1.632f, 6.82f, 2.277f, 6.037f)
                lineTo(4.728f, 3.061f)
                close()
                moveTo(5f, 6.5f)
                verticalLineTo(5.09f)
                lineTo(3.839f, 6.5f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.75f, 12f)
                curveTo(12.13f, 12f, 12.443f, 12.282f, 12.493f, 12.648f)
                lineTo(12.5f, 12.75f)
                verticalLineTo(20.25f)
                curveTo(12.5f, 20.664f, 12.164f, 21f, 11.75f, 21f)
                curveTo(11.37f, 21f, 11.056f, 20.718f, 11.007f, 20.352f)
                lineTo(11f, 20.25f)
                verticalLineTo(12.75f)
                curveTo(11f, 12.336f, 11.335f, 12f, 11.75f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.75f, 9f)
                curveTo(16.129f, 9f, 16.443f, 9.282f, 16.493f, 9.648f)
                lineTo(16.5f, 9.75f)
                verticalLineTo(20.25f)
                curveTo(16.5f, 20.664f, 16.164f, 21f, 15.75f, 21f)
                curveTo(15.37f, 21f, 15.056f, 20.718f, 15.007f, 20.352f)
                lineTo(15f, 20.25f)
                verticalLineTo(9.75f)
                curveTo(15f, 9.336f, 15.335f, 9f, 15.75f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 18f)
                curveTo(4.129f, 18f, 4.443f, 18.282f, 4.493f, 18.648f)
                lineTo(4.5f, 18.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
                curveTo(3.37f, 21f, 3.056f, 20.718f, 3.007f, 20.352f)
                lineTo(3f, 20.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 18.336f, 3.336f, 18f, 3.75f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.743f, 6f)
                curveTo(20.122f, 5.996f, 20.439f, 6.275f, 20.492f, 6.641f)
                lineTo(20.5f, 6.742f)
                verticalLineTo(20.243f)
                curveTo(20.504f, 20.657f, 20.171f, 20.996f, 19.757f, 21f)
                curveTo(19.377f, 21.003f, 19.061f, 20.725f, 19.008f, 20.359f)
                lineTo(19f, 20.258f)
                verticalLineTo(6.757f)
                curveTo(18.996f, 6.343f, 19.328f, 6.004f, 19.743f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 15f)
                curveTo(8.129f, 15f, 8.443f, 15.282f, 8.493f, 15.648f)
                lineTo(8.5f, 15.75f)
                verticalLineTo(20.249f)
                curveTo(8.5f, 20.663f, 8.164f, 20.999f, 7.75f, 20.999f)
                curveTo(7.37f, 20.999f, 7.056f, 20.717f, 7.007f, 20.351f)
                lineTo(7f, 20.249f)
                verticalLineTo(15.75f)
                curveTo(7f, 15.336f, 7.336f, 15f, 7.75f, 15f)
                close()
            }
        }.build()

        return _Cellular4G!!
    }

@Suppress("ObjectPropertyName")
private var _Cellular4G: ImageVector? = null

@Preview
@Composable
private fun Cellular4GPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Cellular4G, contentDescription = null)
    }
}
