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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.MailAlert: ImageVector
    get() {
        if (_MailAlert != null) {
            return _MailAlert!!
        }
        _MailAlert = ImageVector.Builder(
            name = "Colored.MailAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF367AF2))) {
                moveTo(21f, 8.024f)
                lineTo(12.348f, 12.556f)
                curveTo(12.13f, 12.67f, 11.87f, 12.67f, 11.652f, 12.556f)
                lineTo(2f, 7.5f)
                lineTo(2f, 16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                lineTo(22f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8.024f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.199f to Color(0x000094F0),
                        0.431f to Color(0xFF0094F0)
                    ),
                    start = Offset(14.539f, 9.95f),
                    end = Offset(20.005f, 20.515f)
                )
            ) {
                moveTo(21f, 8.024f)
                lineTo(12.348f, 12.556f)
                curveTo(12.13f, 12.67f, 11.87f, 12.67f, 11.652f, 12.556f)
                lineTo(2f, 7.5f)
                lineTo(2f, 16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                lineTo(22f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8.024f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.191f to Color(0x000094F0),
                        0.431f to Color(0xFF0094F0)
                    ),
                    start = Offset(9.143f, 8.816f),
                    end = Offset(3.828f, 20.865f)
                )
            ) {
                moveTo(21f, 8.024f)
                lineTo(12.348f, 12.556f)
                curveTo(12.13f, 12.67f, 11.87f, 12.67f, 11.652f, 12.556f)
                lineTo(2f, 7.5f)
                lineTo(2f, 16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                lineTo(22f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8.024f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x002764E7),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(17.273f, 14.957f),
                    end = Offset(18.143f, 21.151f)
                ),
                fillAlpha = 0.75f,
            ) {
                moveTo(21f, 8.024f)
                lineTo(12.348f, 12.556f)
                curveTo(12.13f, 12.67f, 11.87f, 12.67f, 11.652f, 12.556f)
                lineTo(2f, 7.5f)
                lineTo(2f, 16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                lineTo(22f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8.024f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.533f to Color(0x00FF6CE8),
                        1f to Color(0xFFFF6CE8)
                    ),
                    start = Offset(15.095f, 9.035f),
                    end = Offset(16.681f, 21.643f)
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(21f, 8.024f)
                lineTo(12.348f, 12.556f)
                curveTo(12.13f, 12.67f, 11.87f, 12.67f, 11.652f, 12.556f)
                lineTo(2f, 7.5f)
                lineTo(2f, 16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                lineTo(22f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8.024f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF6CE0FF),
                        0.462f to Color(0xFF29C3FF),
                        1f to Color(0xFF4894FE)
                    ),
                    start = Offset(7.942f, 1.151f),
                    end = Offset(13.98f, 17.089f)
                )
            ) {
                moveTo(11.652f, 12.916f)
                lineTo(2f, 7.86f)
                verticalLineTo(7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                lineTo(18.75f, 4f)
                curveTo(19.672f, 4f, 20.504f, 4.384f, 21.095f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(8.384f)
                lineTo(12.348f, 12.916f)
                curveTo(12.13f, 13.031f, 11.87f, 13.031f, 11.652f, 12.916f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.5f, 10.5f),
                    radius = 2.5f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21.095f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                lineTo(18.75f, 4f)
                curveTo(19.672f, 4f, 20.504f, 4.384f, 21.095f, 5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.492f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.5f, 9.5f),
                    radius = 2f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21.095f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                lineTo(18.75f, 4f)
                curveTo(19.672f, 4f, 20.504f, 4.384f, 21.095f, 5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(14.143f, 8.364f),
                    radius = 1.304f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21.095f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                lineTo(18.75f, 4f)
                curveTo(19.672f, 4f, 20.504f, 4.384f, 21.095f, 5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(17.5f, 5f),
                    radius = 6f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21.095f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                lineTo(18.75f, 4f)
                curveTo(19.672f, 4f, 20.504f, 4.384f, 21.095f, 5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB4824),
                        1f to Color(0xFBFFCD0F)
                    ),
                    start = Offset(17.513f, 9.666f),
                    end = Offset(17.513f, 12f)
                )
            ) {
                moveTo(17.5f, 10f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(23.02f, 9.997f),
                    end = Offset(14.299f, 1.273f)
                )
            ) {
                moveTo(17.503f, 1f)
                curveTo(15.293f, 1f, 13.502f, 2.791f, 13.502f, 5f)
                lineTo(13.502f, 8f)
                lineTo(12.554f, 8.8f)
                curveTo(12.246f, 9.06f, 12.092f, 9.19f, 12.046f, 9.291f)
                curveTo(11.931f, 9.541f, 12.039f, 9.836f, 12.288f, 9.953f)
                curveTo(12.389f, 10f, 12.59f, 10f, 12.993f, 10f)
                horizontalLineTo(22.012f)
                curveTo(22.415f, 10f, 22.616f, 10f, 22.717f, 9.953f)
                curveTo(22.966f, 9.836f, 23.073f, 9.541f, 22.959f, 9.291f)
                curveTo(22.912f, 9.19f, 22.758f, 9.06f, 22.451f, 8.8f)
                lineTo(21.503f, 8f)
                verticalLineTo(5f)
                curveTo(21.503f, 2.791f, 19.712f, 1f, 17.503f, 1f)
                close()
            }
        }.build()

        return _MailAlert!!
    }

@Suppress("ObjectPropertyName")
private var _MailAlert: ImageVector? = null

@Preview
@Composable
private fun MailAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.MailAlert, contentDescription = null)
    }
}
