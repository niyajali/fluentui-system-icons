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

public val FluentIcons.Color.Mail: ImageVector
    get() {
        if (_Mail != null) {
            return _Mail!!
        }
        _Mail = ImageVector.Builder(
            name = "Colored.Mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF367AF2))) {
                moveTo(22f, 7.5f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.5f)
                lineTo(11.652f, 12.556f)
                curveTo(11.87f, 12.67f, 12.13f, 12.67f, 12.348f, 12.556f)
                lineTo(22f, 7.5f)
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
                moveTo(22f, 7.5f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.5f)
                lineTo(11.652f, 12.556f)
                curveTo(11.87f, 12.67f, 12.13f, 12.67f, 12.348f, 12.556f)
                lineTo(22f, 7.5f)
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
                moveTo(22f, 7.5f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.5f)
                lineTo(11.652f, 12.556f)
                curveTo(11.87f, 12.67f, 12.13f, 12.67f, 12.348f, 12.556f)
                lineTo(22f, 7.5f)
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
                moveTo(22f, 7.5f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.5f)
                lineTo(11.652f, 12.556f)
                curveTo(11.87f, 12.67f, 12.13f, 12.67f, 12.348f, 12.556f)
                lineTo(22f, 7.5f)
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
                moveTo(22f, 7.5f)
                lineTo(22f, 16.75f)
                curveTo(22f, 18.483f, 20.644f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                lineTo(2f, 7.5f)
                lineTo(11.652f, 12.556f)
                curveTo(11.87f, 12.67f, 12.13f, 12.67f, 12.348f, 12.556f)
                lineTo(22f, 7.5f)
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
                moveTo(2f, 7.86f)
                lineTo(11.652f, 12.916f)
                curveTo(11.87f, 13.031f, 12.13f, 13.031f, 12.348f, 12.916f)
                lineTo(22f, 7.86f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                lineTo(5.25f, 4f)
                curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
                verticalLineTo(7.86f)
                close()
            }
        }.build()

        return _Mail!!
    }

@Suppress("ObjectPropertyName")
private var _Mail: ImageVector? = null

@Preview
@Composable
private fun MailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Mail, contentDescription = null)
    }
}
