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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.PeopleChat: ImageVector
    get() {
        if (_PeopleChat != null) {
            return _PeopleChat!!
        }
        _PeopleChat = ImageVector.Builder(
            name = "Colored.PeopleChat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFBD96FF),
                        1f to Color(0xFF9C6CFE)
                    ),
                    start = Offset(4.854f, 13.931f),
                    end = Offset(7.41f, 20.927f)
                )
            ) {
                moveTo(4.25f, 13f)
                curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
                verticalLineTo(15.5f)
                curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
                curveTo(14f, 20f, 14f, 15.5f, 14f, 15.5f)
                verticalLineTo(15.25f)
                curveTo(14f, 14.007f, 12.993f, 13f, 11.75f, 13f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(8f, 12.167f),
                    end = Offset(11.607f, 23.721f)
                )
            ) {
                moveTo(4.25f, 13f)
                curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
                verticalLineTo(15.5f)
                curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
                curveTo(14f, 20f, 14f, 15.5f, 14f, 15.5f)
                verticalLineTo(15.25f)
                curveTo(14f, 14.007f, 12.993f, 13f, 11.75f, 13f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF30116E),
                        0.268f to Color(0xCE30116E),
                        1f to Color(0x0030116E)
                    ),
                    center = Offset(15.2f, 17.375f),
                    radius = 5.589f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(4.25f, 13f)
                curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
                verticalLineTo(15.5f)
                curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
                curveTo(14f, 20f, 14f, 15.5f, 14f, 15.5f)
                verticalLineTo(15.25f)
                curveTo(14f, 14.007f, 12.993f, 13f, 11.75f, 13f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(15.427f, 5.798f),
                    end = Offset(18.485f, 10.68f)
                )
            ) {
                moveTo(17f, 11f)
                curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
                curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
                curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
                curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFBD96FF),
                        1f to Color(0xFF9C6CFE)
                    ),
                    start = Offset(5.902f, 4.063f),
                    end = Offset(9.98f, 10.574f)
                )
            ) {
                moveTo(8f, 11f)
                curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
                curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
                curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
                curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFFCC23D1)
                    ),
                    start = Offset(12.393f, 14.063f),
                    end = Offset(21.998f, 30.439f)
                )
            ) {
                moveTo(17.501f, 23.002f)
                curveTo(20.539f, 23.002f, 23.002f, 20.539f, 23.002f, 17.501f)
                curveTo(23.002f, 14.463f, 20.539f, 12f, 17.501f, 12f)
                curveTo(14.463f, 12f, 12f, 14.463f, 12f, 17.501f)
                curveTo(12f, 18.469f, 12.25f, 19.379f, 12.689f, 20.169f)
                lineTo(12.023f, 22.355f)
                curveTo(11.907f, 22.738f, 12.264f, 23.096f, 12.647f, 22.979f)
                lineTo(14.834f, 22.314f)
                curveTo(15.624f, 22.753f, 16.534f, 23.002f, 17.501f, 23.002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.501f, 17.001f)
                curveTo(15.225f, 17.001f, 15.001f, 16.777f, 15.001f, 16.501f)
                curveTo(15.001f, 16.225f, 15.225f, 16.001f, 15.501f, 16.001f)
                horizontalLineTo(19.501f)
                curveTo(19.778f, 16.001f, 20.002f, 16.225f, 20.002f, 16.501f)
                curveTo(20.002f, 16.777f, 19.778f, 17.001f, 19.501f, 17.001f)
                horizontalLineTo(15.501f)
                close()
                moveTo(17.501f, 19.001f)
                horizontalLineTo(15.501f)
                curveTo(15.225f, 19.001f, 15.001f, 18.778f, 15.001f, 18.501f)
                curveTo(15.001f, 18.225f, 15.225f, 18.001f, 15.501f, 18.001f)
                horizontalLineTo(17.501f)
                curveTo(17.777f, 18.001f, 18.001f, 18.225f, 18.001f, 18.501f)
                curveTo(18.001f, 18.778f, 17.777f, 19.001f, 17.501f, 19.001f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFCCEAFF)
                    ),
                    start = Offset(15.438f, 16.054f),
                    end = Offset(15.742f, 19.319f)
                )
            ) {
                moveTo(15.501f, 17.001f)
                curveTo(15.225f, 17.001f, 15.001f, 16.777f, 15.001f, 16.501f)
                curveTo(15.001f, 16.225f, 15.225f, 16.001f, 15.501f, 16.001f)
                horizontalLineTo(19.501f)
                curveTo(19.778f, 16.001f, 20.002f, 16.225f, 20.002f, 16.501f)
                curveTo(20.002f, 16.777f, 19.778f, 17.001f, 19.501f, 17.001f)
                horizontalLineTo(15.501f)
                close()
                moveTo(17.501f, 19.001f)
                horizontalLineTo(15.501f)
                curveTo(15.225f, 19.001f, 15.001f, 18.778f, 15.001f, 18.501f)
                curveTo(15.001f, 18.225f, 15.225f, 18.001f, 15.501f, 18.001f)
                horizontalLineTo(17.501f)
                curveTo(17.777f, 18.001f, 18.001f, 18.225f, 18.001f, 18.501f)
                curveTo(18.001f, 18.778f, 17.777f, 19.001f, 17.501f, 19.001f)
                close()
            }
        }.build()

        return _PeopleChat!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleChat: ImageVector? = null

@Preview
@Composable
private fun PeopleChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.PeopleChat, contentDescription = null)
    }
}
