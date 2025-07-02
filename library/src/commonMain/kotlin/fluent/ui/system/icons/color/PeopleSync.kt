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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.PeopleSync: ImageVector
    get() {
        if (_PeopleSync != null) {
            return _PeopleSync!!
        }
        _PeopleSync = ImageVector.Builder(
            name = "Colored.PeopleSync",
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
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF22918B)
                    ),
                    start = Offset(12.393f, 14.063f),
                    end = Offset(19.984f, 21.95f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFE3FFD9)
                    ),
                    start = Offset(14f, 13.417f),
                    end = Offset(18.443f, 21.445f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20f, 14.5f)
                curveTo(20f, 14.224f, 20.224f, 14f, 20.5f, 14f)
                curveTo(20.776f, 14f, 21f, 14.224f, 21f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
                horizontalLineTo(18.5f)
                curveTo(18.224f, 17f, 18f, 16.776f, 18f, 16.5f)
                curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
                horizontalLineTo(19.5f)
                curveTo(19.044f, 15.392f, 18.317f, 15f, 17.5f, 15f)
                curveTo(16.667f, 15f, 15.928f, 15.407f, 15.473f, 16.036f)
                curveTo(15.311f, 16.26f, 14.999f, 16.31f, 14.775f, 16.148f)
                curveTo(14.551f, 15.986f, 14.501f, 15.673f, 14.663f, 15.45f)
                curveTo(15.298f, 14.572f, 16.332f, 14f, 17.5f, 14f)
                curveTo(18.48f, 14f, 19.365f, 14.403f, 20f, 15.051f)
                verticalLineTo(14.5f)
                close()
                moveTo(15f, 20.5f)
                verticalLineTo(19.949f)
                curveTo(15.635f, 20.597f, 16.52f, 21f, 17.5f, 21f)
                curveTo(18.573f, 21f, 19.534f, 20.516f, 20.175f, 19.757f)
                curveTo(20.353f, 19.546f, 20.327f, 19.23f, 20.116f, 19.052f)
                curveTo(19.905f, 18.874f, 19.589f, 18.901f, 19.411f, 19.112f)
                curveTo(18.952f, 19.656f, 18.266f, 20f, 17.5f, 20f)
                curveTo(16.683f, 20f, 15.956f, 19.608f, 15.5f, 19f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 19f, 17f, 18.776f, 17f, 18.5f)
                curveTo(17f, 18.224f, 16.776f, 18f, 16.5f, 18f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 18f, 14f, 18.224f, 14f, 18.5f)
                verticalLineTo(20.5f)
                curveTo(14f, 20.776f, 14.224f, 21f, 14.5f, 21f)
                curveTo(14.776f, 21f, 15f, 20.776f, 15f, 20.5f)
                close()
            }
        }.build()

        return _PeopleSync!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleSync: ImageVector? = null

@Preview
@Composable
private fun PeopleSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.PeopleSync, contentDescription = null)
    }
}
