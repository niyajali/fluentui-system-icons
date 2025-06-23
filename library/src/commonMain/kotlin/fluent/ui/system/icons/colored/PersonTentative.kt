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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.PersonTentative: ImageVector
    get() {
        if (_PersonTentative != null) {
            return _PersonTentative!!
        }
        _PersonTentative = ImageVector.Builder(
            name = "Colored.PersonTentative",
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
                    start = Offset(5.808f, 15.064f),
                    end = Offset(8.394f, 23.319f)
                )
            ) {
                moveTo(13.257f, 14f)
                horizontalLineTo(4.252f)
                curveTo(3.01f, 14f, 2.003f, 15.007f, 2.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.003f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(11.381f, 22.001f, 12.616f, 21.826f, 13.699f, 21.476f)
                curveTo(12.652f, 20.474f, 12f, 19.063f, 12f, 17.5f)
                curveTo(12f, 16.17f, 12.472f, 14.951f, 13.257f, 14f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(10.003f, 13.047f),
                    end = Offset(13.623f, 26.573f)
                )
            ) {
                moveTo(13.257f, 14f)
                horizontalLineTo(4.252f)
                curveTo(3.01f, 14f, 2.003f, 15.007f, 2.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.003f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(11.381f, 22.001f, 12.616f, 21.826f, 13.699f, 21.476f)
                curveTo(12.652f, 20.474f, 12f, 19.063f, 12f, 17.5f)
                curveTo(12f, 16.17f, 12.472f, 14.951f, 13.257f, 14f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.423f to Color(0xFF30116E),
                        1f to Color(0x0030116E)
                    ),
                    center = Offset(17f, 18f),
                    radius = 6.5f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(13.257f, 14f)
                horizontalLineTo(4.252f)
                curveTo(3.01f, 14f, 2.003f, 15.007f, 2.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.003f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(11.381f, 22.001f, 12.616f, 21.826f, 13.699f, 21.476f)
                curveTo(12.652f, 20.474f, 12f, 19.063f, 12f, 17.5f)
                curveTo(12f, 16.17f, 12.472f, 14.951f, 13.257f, 14f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(7.379f, 3.334f),
                    end = Offset(12.475f, 11.472f)
                )
            ) {
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF29C3FF),
                        1f to Color(0xFF0078D4)
                    ),
                    start = Offset(12f, 12.343f),
                    end = Offset(23.916f, 24.03f)
                )
            ) {
                moveTo(17.439f, 12f)
                curveTo(14.45f, 12.032f, 12.032f, 14.449f, 12f, 17.439f)
                lineTo(17.439f, 12f)
                close()
                moveTo(13.116f, 20.822f)
                curveTo(12.763f, 20.357f, 12.482f, 19.834f, 12.291f, 19.269f)
                lineTo(19.27f, 12.29f)
                curveTo(19.834f, 12.482f, 20.357f, 12.763f, 20.823f, 13.116f)
                lineTo(13.116f, 20.822f)
                close()
                moveTo(14.177f, 21.883f)
                curveTo(14.642f, 22.236f, 15.166f, 22.517f, 15.73f, 22.708f)
                lineTo(22.709f, 15.73f)
                curveTo(22.517f, 15.165f, 22.236f, 14.642f, 21.883f, 14.177f)
                lineTo(14.177f, 21.883f)
                close()
                moveTo(22.999f, 17.561f)
                curveTo(22.967f, 20.549f, 20.55f, 22.966f, 17.561f, 22.999f)
                lineTo(22.999f, 17.561f)
                close()
            }
        }.build()

        return _PersonTentative!!
    }

@Suppress("ObjectPropertyName")
private var _PersonTentative: ImageVector? = null

@Preview
@Composable
private fun PersonTentativePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.PersonTentative, contentDescription = null)
    }
}
