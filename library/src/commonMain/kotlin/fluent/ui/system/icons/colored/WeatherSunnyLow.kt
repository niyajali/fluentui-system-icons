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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.WeatherSunnyLow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.WeatherSunnyLow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE580),
                    0.273f to Color(0xFFFFBF70),
                    0.57f to Color(0xFFFFA342),
                    0.96f to Color(0xFFFA6673),
                ),
                start = Offset(10.31f, 6.089f),
                end = Offset(14.51f, 14.585f),
            ),
        ) {
            moveTo(17.125f, 14f)
            curveTo(17.367f, 13.38f, 17.5f, 12.706f, 17.5f, 12f)
            curveTo(17.5f, 8.962f, 15.038f, 6.5f, 12f, 6.5f)
            curveTo(8.962f, 6.5f, 6.5f, 8.962f, 6.5f, 12f)
            curveTo(6.5f, 12.706f, 6.633f, 13.38f, 6.875f, 14f)
            horizontalLineTo(17.125f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.061f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0094F0),
                ),
                start = Offset(0.531f, 13f),
                end = Offset(22f, 13f),
            ),
        ) {
            moveTo(2f, 14f)
            curveTo(2f, 13.448f, 2.448f, 13f, 3f, 13f)
            horizontalLineTo(21f)
            curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
            curveTo(22f, 14.552f, 21.552f, 15f, 21f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.061f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0094F0),
                ),
                start = Offset(0.531f, 13f),
                end = Offset(22f, 13f),
            ),
        ) {
            moveTo(6f, 17f)
            curveTo(6f, 16.448f, 6.448f, 16f, 7f, 16f)
            horizontalLineTo(17f)
            curveTo(17.552f, 16f, 18f, 16.448f, 18f, 17f)
            curveTo(18f, 17.552f, 17.552f, 18f, 17f, 18f)
            horizontalLineTo(7f)
            curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.061f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0094F0),
                ),
                start = Offset(0.531f, 13f),
                end = Offset(22f, 13f),
            ),
        ) {
            moveTo(10f, 20f)
            curveTo(10f, 19.448f, 10.448f, 19f, 11f, 19f)
            horizontalLineTo(13f)
            curveTo(13.552f, 19f, 14f, 19.448f, 14f, 20f)
            curveTo(14f, 20.552f, 13.552f, 21f, 13f, 21f)
            horizontalLineTo(11f)
            curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE580),
                    0.273f to Color(0xFFFFBF70),
                    0.57f to Color(0xFFFFA342),
                    0.815f to Color(0xFFFA6673),
                ),
                start = Offset(9.696f, 1.699f),
                end = Offset(12.931f, 13.084f),
            ),
        ) {
            moveTo(12f, 2f)
            curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
            verticalLineTo(4.25f)
            curveTo(13f, 4.802f, 12.552f, 5.25f, 12f, 5.25f)
            curveTo(11.448f, 5.25f, 11f, 4.802f, 11f, 4.25f)
            verticalLineTo(3f)
            curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE580),
                    0.273f to Color(0xFFFFBF70),
                    0.57f to Color(0xFFFFA342),
                    0.815f to Color(0xFFFA6673),
                ),
                start = Offset(9.696f, 1.699f),
                end = Offset(12.931f, 13.084f),
            ),
        ) {
            moveTo(4.793f, 4.793f)
            curveTo(5.183f, 4.402f, 5.817f, 4.402f, 6.207f, 4.793f)
            lineTo(7.207f, 5.793f)
            curveTo(7.598f, 6.183f, 7.598f, 6.817f, 7.207f, 7.207f)
            curveTo(6.817f, 7.598f, 6.183f, 7.598f, 5.793f, 7.207f)
            lineTo(4.793f, 6.207f)
            curveTo(4.402f, 5.817f, 4.402f, 5.183f, 4.793f, 4.793f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE580),
                    0.273f to Color(0xFFFFBF70),
                    0.57f to Color(0xFFFFA342),
                    0.815f to Color(0xFFFA6673),
                ),
                start = Offset(9.696f, 1.699f),
                end = Offset(12.931f, 13.084f),
            ),
        ) {
            moveTo(19.207f, 4.793f)
            curveTo(19.598f, 5.183f, 19.598f, 5.817f, 19.207f, 6.207f)
            lineTo(18.207f, 7.207f)
            curveTo(17.817f, 7.598f, 17.183f, 7.598f, 16.793f, 7.207f)
            curveTo(16.402f, 6.817f, 16.402f, 6.183f, 16.793f, 5.793f)
            lineTo(17.793f, 4.793f)
            curveTo(18.183f, 4.402f, 18.817f, 4.402f, 19.207f, 4.793f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherSunnyLowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.WeatherSunnyLow, contentDescription = null)
    }
}
