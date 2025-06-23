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

public val FluentIcons.Colored.Savings: ImageVector
    get() {
        if (_Savings != null) {
            return _Savings!!
        }
        _Savings = ImageVector.Builder(
            name = "Colored.Savings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF08AF4),
                        0.581f to Color(0xFFE869CE),
                        1f to Color(0xFFD7257D)
                    ),
                    center = Offset(8.125f, 4.563f),
                    radius = 18.913f
                )
            ) {
                moveTo(21.071f, 8.86f)
                curveTo(21.676f, 9.858f, 22f, 11.063f, 22f, 12.5f)
                curveTo(22f, 14.706f, 21.167f, 16.249f, 20.319f, 17.238f)
                curveTo(19.899f, 17.729f, 19.478f, 18.08f, 19.158f, 18.311f)
                curveTo(19.102f, 18.351f, 19.049f, 18.388f, 19f, 18.421f)
                verticalLineTo(20.25f)
                curveTo(19f, 21.217f, 18.216f, 22f, 17.25f, 22f)
                horizontalLineTo(16f)
                curveTo(15.172f, 22f, 14.5f, 21.329f, 14.5f, 20.5f)
                horizontalLineTo(12.5f)
                curveTo(12.5f, 21.329f, 11.828f, 22f, 11f, 22f)
                horizontalLineTo(9.75f)
                curveTo(8.783f, 22f, 8f, 21.217f, 8f, 20.25f)
                verticalLineTo(19.567f)
                curveTo(7.862f, 19.521f, 7.705f, 19.463f, 7.536f, 19.392f)
                curveTo(6.94f, 19.143f, 6.16f, 18.72f, 5.47f, 18.03f)
                curveTo(4.686f, 17.246f, 4.161f, 16.428f, 3.865f, 15.899f)
                curveTo(3.778f, 15.743f, 3.648f, 15.66f, 3.536f, 15.641f)
                curveTo(2.65f, 15.494f, 2f, 14.727f, 2f, 13.828f)
                verticalLineTo(12.075f)
                curveTo(2f, 11.232f, 2.609f, 10.513f, 3.441f, 10.375f)
                curveTo(3.527f, 10.36f, 3.655f, 10.274f, 3.717f, 10.091f)
                curveTo(3.909f, 9.515f, 4.282f, 8.657f, 4.97f, 7.97f)
                curveTo(5.532f, 7.407f, 6.155f, 6.994f, 6.628f, 6.724f)
                curveTo(6.764f, 6.646f, 6.89f, 6.579f, 7f, 6.523f)
                verticalLineTo(3.671f)
                curveTo(7f, 2.733f, 8.131f, 2.348f, 8.74f, 2.955f)
                curveTo(9.07f, 3.284f, 9.55f, 3.723f, 10.081f, 4.089f)
                curveTo(10.611f, 4.455f, 11.114f, 4.749f, 11.535f, 4.749f)
                curveTo(15.783f, 4.749f, 19.219f, 5.8f, 21.071f, 8.86f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB91D6B),
                        1f to Color(0xFF670938)
                    ),
                    center = Offset(7.598f, 9.539f),
                    radius = 1.695f
                )
            ) {
                moveTo(9f, 10f)
                curveTo(9f, 10.552f, 8.552f, 11f, 8f, 11f)
                curveTo(7.448f, 11f, 7f, 10.552f, 7f, 10f)
                curveTo(7f, 9.448f, 7.448f, 9f, 8f, 9f)
                curveTo(8.552f, 9f, 9f, 9.448f, 9f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9F1459))) {
                moveTo(10.549f, 6.503f)
                curveTo(10.802f, 5.889f, 11.505f, 5.598f, 12.118f, 5.851f)
                lineTo(19.494f, 8.896f)
                curveTo(20.107f, 9.149f, 20.399f, 9.852f, 20.146f, 10.465f)
                curveTo(19.893f, 11.078f, 19.19f, 11.37f, 18.577f, 11.117f)
                lineTo(11.201f, 8.072f)
                curveTo(10.588f, 7.819f, 10.296f, 7.116f, 10.549f, 6.503f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF8A69),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(18.745f, 9.82f),
                    end = Offset(12.651f, 4.629f)
                )
            ) {
                moveTo(17.545f, 10.691f)
                curveTo(18.987f, 10.086f, 20f, 8.661f, 20f, 7f)
                curveTo(20f, 4.791f, 18.209f, 3f, 16f, 3f)
                curveTo(13.791f, 3f, 12f, 4.791f, 12f, 7f)
                curveTo(12f, 7.54f, 12.107f, 8.056f, 12.301f, 8.526f)
                lineTo(17.545f, 10.691f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.67f to Color(0x00FB5937),
                        1f to Color(0xFFCD3E1D)
                    ),
                    start = Offset(17.188f, 3.438f),
                    end = Offset(14.563f, 9.75f)
                ),
                fillAlpha = 0.8f,
            ) {
                moveTo(17.545f, 10.691f)
                curveTo(18.987f, 10.086f, 20f, 8.661f, 20f, 7f)
                curveTo(20f, 4.791f, 18.209f, 3f, 16f, 3f)
                curveTo(13.791f, 3f, 12f, 4.791f, 12f, 7f)
                curveTo(12f, 7.54f, 12.107f, 8.056f, 12.301f, 8.526f)
                lineTo(17.545f, 10.691f)
                close()
            }
        }.build()

        return _Savings!!
    }

@Suppress("ObjectPropertyName")
private var _Savings: ImageVector? = null

@Preview
@Composable
private fun SavingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Savings, contentDescription = null)
    }
}
