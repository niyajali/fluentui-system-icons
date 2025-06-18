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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Patient: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Patient",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF),
                ),
                start = Offset(9.714f, 2f),
                end = Offset(14.263f, 15.313f),
            ),
        ) {
            moveTo(20f, 4.25f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(20f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(9.902f, 11.594f),
                end = Offset(11.503f, 16.133f),
            ),
        ) {
            moveTo(8f, 15.5f)
            verticalLineTo(12.246f)
            curveTo(8f, 11.598f, 8.492f, 11.066f, 9.122f, 11.002f)
            lineTo(9.25f, 10.996f)
            horizontalLineTo(14.75f)
            curveTo(15.397f, 10.996f, 15.929f, 11.488f, 15.993f, 12.118f)
            lineTo(16f, 12.246f)
            verticalLineTo(15.5f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(10.689f, 5.66f),
                end = Offset(13.237f, 9.729f),
            ),
        ) {
            moveTo(12f, 4.996f)
            curveTo(13.381f, 4.996f, 14.5f, 6.115f, 14.5f, 7.496f)
            curveTo(14.5f, 8.876f, 13.381f, 9.996f, 12f, 9.996f)
            curveTo(10.619f, 9.996f, 9.5f, 8.876f, 9.5f, 7.496f)
            curveTo(9.5f, 6.115f, 10.619f, 4.996f, 12f, 4.996f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(0f, 1.004f),
                end = Offset(19.767f, 22.176f),
            ),
        ) {
            moveTo(20f, 15f)
            verticalLineTo(19.755f)
            curveTo(20f, 20.997f, 18.993f, 22.005f, 17.75f, 22.005f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22.005f, 4f, 20.997f, 4f, 19.755f)
            verticalLineTo(15f)
            horizontalLineTo(20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.619f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8),
                ),
                start = Offset(12f, 8.579f),
                end = Offset(13.531f, 25.331f),
            ),
            fillAlpha = 0.7f,
        ) {
            moveTo(20f, 15f)
            verticalLineTo(19.755f)
            curveTo(20f, 20.997f, 18.993f, 22.005f, 17.75f, 22.005f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22.005f, 4f, 20.997f, 4f, 19.755f)
            verticalLineTo(15f)
            horizontalLineTo(20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(8.924f, 17.615f),
                end = Offset(9.117f, 20.729f),
            ),
        ) {
            moveTo(7.751f, 17.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 17.5f, 17f, 17.836f, 17f, 18.25f)
            curveTo(17f, 18.63f, 16.718f, 18.944f, 16.352f, 18.993f)
            lineTo(16.25f, 19f)
            horizontalLineTo(7.751f)
            curveTo(7.337f, 19f, 7.001f, 18.664f, 7.001f, 18.25f)
            curveTo(7.001f, 17.87f, 7.284f, 17.556f, 7.65f, 17.507f)
            lineTo(7.751f, 17.5f)
            horizontalLineTo(16.25f)
            horizontalLineTo(7.751f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PatientPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Patient, contentDescription = null)
    }
}
