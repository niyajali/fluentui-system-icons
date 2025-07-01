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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.Trophy: ImageVector
    get() {
        if (_Trophy != null) {
            return _Trophy!!
        }
        _Trophy = ImageVector.Builder(
            name = "Colored.Trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFFC55D5D))) {
                moveTo(11f, 18.5f)
                verticalLineTo(14.818f)
                horizontalLineTo(12.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.174f to Color(0xFFEB4824),
                        0.563f to Color(0xFBFF921F),
                        0.853f to Color(0xFFEB4824)
                    ),
                    start = Offset(10.25f, 14.082f),
                    end = Offset(16.106f, 22.284f)
                )
            ) {
                moveTo(11f, 18.5f)
                verticalLineTo(14.818f)
                horizontalLineTo(12.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD9D9D9))) {
                moveTo(14.253f, 17.5f)
                curveTo(15.986f, 17.5f, 17.402f, 18.857f, 17.498f, 20.566f)
                lineTo(17.503f, 20.75f)
                verticalLineTo(21.25f)
                curveTo(17.503f, 21.63f, 17.221f, 21.944f, 16.855f, 21.993f)
                lineTo(16.753f, 22f)
                horizontalLineTo(6.75f)
                curveTo(6.37f, 22f, 6.057f, 21.718f, 6.007f, 21.352f)
                lineTo(6f, 21.25f)
                verticalLineTo(20.75f)
                curveTo(6f, 19.017f, 7.356f, 17.601f, 9.066f, 17.505f)
                lineTo(9.25f, 17.5f)
                horizontalLineTo(14.253f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.184f to Color(0xFFFFCD0F),
                        1f to Color(0xFFFF6F47)
                    ),
                    start = Offset(38.592f, 35.5f),
                    end = Offset(31.535f, 10.62f)
                )
            ) {
                moveTo(14.253f, 17.5f)
                curveTo(15.986f, 17.5f, 17.402f, 18.857f, 17.498f, 20.566f)
                lineTo(17.503f, 20.75f)
                verticalLineTo(21.25f)
                curveTo(17.503f, 21.63f, 17.221f, 21.944f, 16.855f, 21.993f)
                lineTo(16.753f, 22f)
                horizontalLineTo(6.75f)
                curveTo(6.37f, 22f, 6.057f, 21.718f, 6.007f, 21.352f)
                lineTo(6f, 21.25f)
                verticalLineTo(20.75f)
                curveTo(6f, 19.017f, 7.356f, 17.601f, 9.066f, 17.505f)
                lineTo(9.25f, 17.5f)
                horizontalLineTo(14.253f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD96A6A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 5.75f)
                curveTo(3f, 4.784f, 3.783f, 4f, 4.75f, 4f)
                horizontalLineTo(7.75f)
                curveTo(8.717f, 4f, 9.5f, 4.784f, 9.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(9.5f, 10.545f, 8.045f, 12f, 6.25f, 12f)
                curveTo(4.455f, 12f, 3f, 10.545f, 3f, 8.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveTo(4.612f, 5.5f, 4.5f, 5.612f, 4.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(4.5f, 9.717f, 5.284f, 10.5f, 6.25f, 10.5f)
                curveTo(7.216f, 10.5f, 8f, 9.717f, 8f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(8f, 5.612f, 7.888f, 5.5f, 7.75f, 5.5f)
                horizontalLineTo(4.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB4824),
                        1f to Color(0xFBFFCD0F)
                    ),
                    start = Offset(7.875f, 7.333f),
                    end = Offset(1.375f, 7.333f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 5.75f)
                curveTo(3f, 4.784f, 3.783f, 4f, 4.75f, 4f)
                horizontalLineTo(7.75f)
                curveTo(8.717f, 4f, 9.5f, 4.784f, 9.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(9.5f, 10.545f, 8.045f, 12f, 6.25f, 12f)
                curveTo(4.455f, 12f, 3f, 10.545f, 3f, 8.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveTo(4.612f, 5.5f, 4.5f, 5.612f, 4.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(4.5f, 9.717f, 5.284f, 10.5f, 6.25f, 10.5f)
                curveTo(7.216f, 10.5f, 8f, 9.717f, 8f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(8f, 5.612f, 7.888f, 5.5f, 7.75f, 5.5f)
                horizontalLineTo(4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD96A6A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14f, 5.75f)
                curveTo(14f, 4.784f, 14.783f, 4f, 15.75f, 4f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 4f, 20.5f, 4.784f, 20.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 10.545f, 19.045f, 12f, 17.25f, 12f)
                curveTo(15.455f, 12f, 14f, 10.545f, 14f, 8.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(15.75f, 5.5f)
                curveTo(15.612f, 5.5f, 15.5f, 5.612f, 15.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(15.5f, 9.717f, 16.284f, 10.5f, 17.25f, 10.5f)
                curveTo(18.216f, 10.5f, 19f, 9.717f, 19f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(19f, 5.612f, 18.888f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(15.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB4824),
                        1f to Color(0xFBFFCD0F)
                    ),
                    start = Offset(16.167f, 7.333f),
                    end = Offset(22.125f, 7.333f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14f, 5.75f)
                curveTo(14f, 4.784f, 14.783f, 4f, 15.75f, 4f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 4f, 20.5f, 4.784f, 20.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 10.545f, 19.045f, 12f, 17.25f, 12f)
                curveTo(15.455f, 12f, 14f, 10.545f, 14f, 8.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(15.75f, 5.5f)
                curveTo(15.612f, 5.5f, 15.5f, 5.612f, 15.5f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(15.5f, 9.717f, 16.284f, 10.5f, 17.25f, 10.5f)
                curveTo(18.216f, 10.5f, 19f, 9.717f, 19f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(19f, 5.612f, 18.888f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 2f)
                curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
                verticalLineTo(10.25f)
                curveTo(6f, 13.426f, 8.574f, 16f, 11.75f, 16f)
                curveTo(14.926f, 16f, 17.5f, 13.426f, 17.5f, 10.25f)
                verticalLineTo(4.25f)
                curveTo(17.5f, 3.007f, 16.493f, 2f, 15.25f, 2f)
                horizontalLineTo(8.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    center = Offset(17.5f, 15.391f),
                    radius = 16.315f
                )
            ) {
                moveTo(8.25f, 2f)
                curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
                verticalLineTo(10.25f)
                curveTo(6f, 13.426f, 8.574f, 16f, 11.75f, 16f)
                curveTo(14.926f, 16f, 17.5f, 13.426f, 17.5f, 10.25f)
                verticalLineTo(4.25f)
                curveTo(17.5f, 3.007f, 16.493f, 2f, 15.25f, 2f)
                horizontalLineTo(8.25f)
                close()
            }
        }.build()

        return _Trophy!!
    }

@Suppress("ObjectPropertyName")
private var _Trophy: ImageVector? = null

@Preview
@Composable
private fun TrophyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Trophy, contentDescription = null)
    }
}
