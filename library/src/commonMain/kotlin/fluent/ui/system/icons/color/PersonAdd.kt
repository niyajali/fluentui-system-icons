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
package fluent.ui.system.icons.color

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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) {
            return _PersonAdd!!
        }
        _PersonAdd = ImageVector.Builder(
            name = "Colored.PersonAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(5.809f, 15.063f),
                    end = Offset(8.394f, 23.319f)
                )
            ) {
                moveTo(15.755f, 14f)
                curveTo(16.997f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
                verticalLineTo(17.167f)
                curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.491f, 18.766f)
                curveTo(15.945f, 20.929f, 13.421f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.764f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                horizontalLineTo(15.755f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(10.004f, 13.047f),
                    end = Offset(13.624f, 26.573f)
                )
            ) {
                moveTo(15.755f, 14f)
                curveTo(16.997f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
                verticalLineTo(17.167f)
                curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.491f, 18.766f)
                curveTo(15.945f, 20.929f, 13.421f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.764f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                horizontalLineTo(15.755f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.493f to Color(0xFF30116E),
                        0.912f to Color(0x0030116E)
                    ),
                    center = Offset(17.5f, 18.5f),
                    radius = 8.5f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(15.755f, 14f)
                curveTo(16.997f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
                verticalLineTo(17.167f)
                curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.491f, 18.766f)
                curveTo(15.945f, 20.929f, 13.421f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.764f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                horizontalLineTo(15.755f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(7.378f, 3.334f),
                    end = Offset(12.474f, 11.472f)
                )
            ) {
                moveTo(10f, 2.005f)
                curveTo(12.761f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.761f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF22918B)
                    ),
                    start = Offset(12.393f, 14.063f),
                    end = Offset(19.984f, 21.95f)
                )
            ) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFE3FFD9)
                    ),
                    start = Offset(15.313f, 14.714f),
                    end = Offset(17.46f, 22.296f)
                )
            ) {
                moveTo(17.5f, 14f)
                curveTo(17.234f, 14f, 17.015f, 14.198f, 16.98f, 14.454f)
                lineTo(16.975f, 14.525f)
                verticalLineTo(16.975f)
                horizontalLineTo(14.525f)
                curveTo(14.235f, 16.975f, 14f, 17.21f, 14f, 17.5f)
                curveTo(14f, 17.766f, 14.198f, 17.985f, 14.454f, 18.02f)
                lineTo(14.525f, 18.025f)
                horizontalLineTo(16.975f)
                verticalLineTo(20.475f)
                curveTo(16.975f, 20.765f, 17.21f, 21f, 17.5f, 21f)
                curveTo(17.766f, 21f, 17.985f, 20.802f, 18.02f, 20.546f)
                lineTo(18.025f, 20.475f)
                verticalLineTo(18.025f)
                horizontalLineTo(20.475f)
                curveTo(20.765f, 18.025f, 21f, 17.79f, 21f, 17.5f)
                curveTo(21f, 17.234f, 20.802f, 17.015f, 20.546f, 16.98f)
                lineTo(20.475f, 16.975f)
                horizontalLineTo(18.025f)
                verticalLineTo(14.525f)
                curveTo(18.025f, 14.235f, 17.79f, 14f, 17.5f, 14f)
                close()
            }
        }.build()

        return _PersonAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAdd: ImageVector? = null

@Preview
@Composable
private fun PersonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.PersonAdd, contentDescription = null)
    }
}
