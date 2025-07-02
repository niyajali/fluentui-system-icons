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

public val FluentIcons.Color.CalendarCancel: ImageVector
    get() {
        if (_CalendarCancel != null) {
            return _CalendarCancel!!
        }
        _CalendarCancel = ImageVector.Builder(
            name = "Colored.CalendarCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3E0FF),
                        1f to Color(0xFF8CD0FF)
                    ),
                    start = Offset(9.429f, 6.5f),
                    end = Offset(14.137f, 20.932f)
                )
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00DCF8FF),
                        1f to Color(0xB2FF6CE8)
                    ),
                    start = Offset(13.929f, 12.432f),
                    end = Offset(16.625f, 24.267f)
                )
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.786f, 19.023f),
                    radius = 8.568f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(21f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(3.723f, 3f),
                    end = Offset(5.356f, 11.537f)
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF83F54),
                        1f to Color(0xFFCA2134)
                    ),
                    start = Offset(13.719f, 12.688f),
                    end = Offset(20.938f, 23.344f)
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
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFFECBE6)
                    ),
                    start = Offset(15.503f, 17.701f),
                    end = Offset(17.857f, 20.149f)
                )
            ) {
                moveTo(15.024f, 15.024f)
                curveTo(14.829f, 15.22f, 14.829f, 15.536f, 15.024f, 15.731f)
                lineTo(16.793f, 17.501f)
                lineTo(15.026f, 19.268f)
                curveTo(14.831f, 19.463f, 14.831f, 19.78f, 15.026f, 19.975f)
                curveTo(15.222f, 20.17f, 15.538f, 20.17f, 15.734f, 19.975f)
                lineTo(17.5f, 18.208f)
                lineTo(19.27f, 19.977f)
                curveTo(19.465f, 20.172f, 19.781f, 20.172f, 19.977f, 19.977f)
                curveTo(20.172f, 19.782f, 20.172f, 19.465f, 19.977f, 19.27f)
                lineTo(18.208f, 17.501f)
                lineTo(19.979f, 15.731f)
                curveTo(20.175f, 15.536f, 20.175f, 15.22f, 19.979f, 15.024f)
                curveTo(19.784f, 14.829f, 19.468f, 14.829f, 19.272f, 15.024f)
                lineTo(17.501f, 16.794f)
                lineTo(15.731f, 15.024f)
                curveTo(15.536f, 14.829f, 15.219f, 14.829f, 15.024f, 15.024f)
                close()
            }
        }.build()

        return _CalendarCancel!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCancel: ImageVector? = null

@Preview
@Composable
private fun CalendarCancelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.CalendarCancel, contentDescription = null)
    }
}
