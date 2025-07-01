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

public val FluentIcons.Color.PersonFeedback: ImageVector
    get() {
        if (_PersonFeedback != null) {
            return _PersonFeedback!!
        }
        _PersonFeedback = ImageVector.Builder(
            name = "Colored.PersonFeedback",
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
                    start = Offset(4.854f, 15.931f),
                    end = Offset(7.41f, 22.928f)
                )
            ) {
                moveTo(8.001f, 22f)
                curveTo(5.941f, 22f, 4.361f, 21.44f, 3.301f, 20.33f)
                curveTo(1.964f, 18.926f, 1.997f, 17.156f, 2.001f, 16.973f)
                lineTo(2.001f, 16.96f)
                curveTo(2.001f, 15.89f, 2.901f, 15f, 4.001f, 15f)
                horizontalLineTo(12.001f)
                curveTo(13.101f, 15f, 14.001f, 15.9f, 14.001f, 17f)
                lineTo(14.001f, 17.006f)
                curveTo(14.004f, 17.132f, 14.046f, 18.917f, 12.701f, 20.33f)
                curveTo(11.641f, 21.44f, 10.061f, 22f, 8.001f, 22f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(8.001f, 14.167f),
                    end = Offset(11.608f, 25.721f)
                )
            ) {
                moveTo(8.001f, 22f)
                curveTo(5.941f, 22f, 4.361f, 21.44f, 3.301f, 20.33f)
                curveTo(1.964f, 18.926f, 1.997f, 17.156f, 2.001f, 16.973f)
                lineTo(2.001f, 16.96f)
                curveTo(2.001f, 15.89f, 2.901f, 15f, 4.001f, 15f)
                horizontalLineTo(12.001f)
                curveTo(13.101f, 15f, 14.001f, 15.9f, 14.001f, 17f)
                lineTo(14.001f, 17.006f)
                curveTo(14.004f, 17.132f, 14.046f, 18.917f, 12.701f, 20.33f)
                curveTo(11.641f, 21.44f, 10.061f, 22f, 8.001f, 22f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(6.165f, 7.431f),
                    end = Offset(9.732f, 13.127f)
                )
            ) {
                moveTo(8f, 13.5f)
                curveTo(6.07f, 13.5f, 4.5f, 11.93f, 4.5f, 10f)
                curveTo(4.5f, 8.07f, 6.07f, 6.5f, 8f, 6.5f)
                curveTo(9.93f, 6.5f, 11.5f, 8.07f, 11.5f, 10f)
                curveTo(11.5f, 11.93f, 9.93f, 13.5f, 8f, 13.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFAB500),
                        0.535f to Color(0xFFFE8401),
                        1f to Color(0xFFFB5937)
                    ),
                    center = Offset(9.692f, -1.231f),
                    radius = 19.036f
                )
            ) {
                moveTo(14.77f, 12.4f)
                curveTo(14.92f, 12.47f, 15.09f, 12.5f, 15.25f, 12.5f)
                curveTo(15.58f, 12.5f, 15.89f, 12.37f, 16.13f, 12.14f)
                lineTo(18.31f, 10f)
                horizontalLineTo(19.25f)
                curveTo(20.77f, 10f, 22f, 8.77f, 22f, 7.25f)
                verticalLineTo(4.75f)
                curveTo(22f, 3.23f, 20.77f, 2f, 19.25f, 2f)
                horizontalLineTo(14.75f)
                curveTo(13.23f, 2f, 12f, 3.23f, 12f, 4.75f)
                verticalLineTo(7.25f)
                curveTo(12f, 8.51f, 12.85f, 9.57f, 14f, 9.9f)
                verticalLineTo(11.25f)
                curveTo(14f, 11.75f, 14.31f, 12.2f, 14.77f, 12.4f)
                close()
            }
        }.build()

        return _PersonFeedback!!
    }

@Suppress("ObjectPropertyName")
private var _PersonFeedback: ImageVector? = null

@Preview
@Composable
private fun PersonFeedbackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.PersonFeedback, contentDescription = null)
    }
}
