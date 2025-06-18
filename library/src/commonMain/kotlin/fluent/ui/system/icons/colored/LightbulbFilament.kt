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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.LightbulbFilament: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.LightbulbFilament",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505),
                ),
                center = Offset(7f, 3.963f),
                radius = 17.874f,
            ),
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.792f to Color(0x00D34719),
                    0.835f to Color(0xFFD34719),
                    1f to Color(0x00D34719),
                ),
                start = Offset(12f, 2f),
                end = Offset(12f, 21.999f),
            ),
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.165f to Color(0xFF741C06),
                    0.854f to Color(0x00741C06),
                ),
                center = Offset(8.652f, 9.968f),
                radius = 1.99f,
            ),
            fillAlpha = 0.2f,
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.165f to Color(0xFF741C06),
                    0.854f to Color(0x00741C06),
                ),
                center = Offset(12f, 7.774f),
                radius = 2.507f,
            ),
            fillAlpha = 0.2f,
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.165f to Color(0xFF741C06),
                    0.854f to Color(0x00741C06),
                ),
                center = Offset(15.328f, 9.896f),
                radius = 2.389f,
            ),
            fillAlpha = 0.2f,
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.165f to Color(0xFF741C06),
                    0.777f to Color(0x00741C06),
                ),
                center = Offset(12f, 13.714f),
                radius = 1.915f,
            ),
            fillAlpha = 0.2f,
        ) {
            moveTo(13.271f, 21.993f)
            curveTo(14.277f, 21.918f, 15.128f, 21.22f, 15.359f, 20.257f)
            lineTo(16.566f, 15.216f)
            curveTo(16.577f, 15.168f, 16.603f, 15.125f, 16.639f, 15.091f)
            curveTo(18.532f, 13.344f, 19.5f, 11.387f, 19.5f, 9.25f)
            curveTo(19.5f, 5.246f, 16.142f, 2f, 12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.246f, 4.5f, 9.25f)
            curveTo(4.5f, 11.387f, 5.469f, 13.344f, 7.363f, 15.091f)
            curveTo(7.399f, 15.125f, 7.425f, 15.168f, 7.436f, 15.216f)
            lineTo(8.64f, 20.256f)
            lineTo(8.687f, 20.423f)
            curveTo(8.988f, 21.354f, 9.884f, 21.999f, 10.908f, 21.999f)
            horizontalLineTo(13.092f)
            lineTo(13.271f, 21.993f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFF2BE),
                    0.437f to Color(0xFFFFD638),
                ),
                start = Offset(11.999f, 9.999f),
                end = Offset(11.999f, 18.452f),
            ),
        ) {
            moveTo(11.999f, 9.999f)
            lineTo(11.999f, 9.999f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.776f, 10.776f)
            lineTo(12.776f, 17.671f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.999f, 18.448f)
            lineTo(11.999f, 18.448f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.222f, 17.671f)
            lineTo(11.222f, 10.776f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.999f, 9.999f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFF2BE),
                    1f to Color(0xFFFFD638),
                ),
                start = Offset(11.222f, 7.498f),
                end = Offset(12.776f, 7.498f),
            ),
        ) {
            moveTo(11.999f, 5.998f)
            lineTo(11.999f, 5.998f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.776f, 6.775f)
            lineTo(12.776f, 8.221f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.999f, 8.998f)
            lineTo(11.999f, 8.998f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.222f, 8.221f)
            lineTo(11.222f, 6.775f)
            arcTo(0.777f, 0.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.999f, 5.998f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFF2BE),
                    1f to Color(0xFFFFD638),
                ),
                start = Offset(8.154f, 9.815f),
                end = Offset(9.199f, 8.77f),
            ),
        ) {
            moveTo(7.613f, 9.318f)
            curveTo(7.31f, 9.014f, 7.31f, 8.523f, 7.613f, 8.219f)
            curveTo(7.917f, 7.916f, 8.409f, 7.916f, 8.712f, 8.219f)
            lineTo(9.734f, 9.241f)
            curveTo(10.038f, 9.544f, 10.038f, 10.036f, 9.734f, 10.34f)
            curveTo(9.431f, 10.643f, 8.939f, 10.643f, 8.635f, 10.34f)
            lineTo(7.613f, 9.318f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFF2BE),
                    1f to Color(0xFFFFD638),
                ),
                start = Offset(14.763f, 8.809f),
                end = Offset(15.8f, 9.846f),
            ),
        ) {
            moveTo(16.389f, 9.318f)
            curveTo(16.692f, 9.014f, 16.692f, 8.523f, 16.389f, 8.219f)
            curveTo(16.085f, 7.916f, 15.593f, 7.916f, 15.29f, 8.219f)
            lineTo(14.268f, 9.241f)
            curveTo(13.964f, 9.544f, 13.964f, 10.036f, 14.268f, 10.34f)
            curveTo(14.571f, 10.643f, 15.063f, 10.643f, 15.366f, 10.34f)
            lineTo(16.389f, 9.318f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70),
                ),
                start = Offset(11.346f, 17.496f),
                end = Offset(12.289f, 19.995f),
            ),
        ) {
            moveTo(8.339f, 18.997f)
            horizontalLineTo(15.661f)
            lineTo(16.021f, 17.496f)
            horizontalLineTo(7.981f)
            lineTo(8.339f, 18.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbFilamentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.LightbulbFilament, contentDescription = null)
    }
}
