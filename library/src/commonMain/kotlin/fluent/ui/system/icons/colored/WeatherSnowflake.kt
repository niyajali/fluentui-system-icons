/**
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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.WeatherSnowflake: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.WeatherSnowflake",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4894FE),
                    0.495f to Color(0xFF0FAFFF),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(17f, 18.25f),
                end = Offset(7.625f, 3.875f)
            )
        ) {
            moveTo(12f, 2f)
            curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
            verticalLineTo(5.551f)
            lineTo(14.707f, 3.845f)
            curveTo(15.097f, 3.454f, 15.73f, 3.454f, 16.121f, 3.845f)
            curveTo(16.511f, 4.235f, 16.511f, 4.868f, 16.121f, 5.259f)
            lineTo(13f, 8.38f)
            verticalLineTo(11f)
            horizontalLineTo(15.62f)
            lineTo(18.741f, 7.879f)
            curveTo(19.132f, 7.489f, 19.765f, 7.489f, 20.155f, 7.879f)
            curveTo(20.546f, 8.27f, 20.546f, 8.903f, 20.155f, 9.293f)
            lineTo(18.449f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(18.449f)
            lineTo(20.155f, 14.707f)
            curveTo(20.546f, 15.097f, 20.546f, 15.73f, 20.155f, 16.121f)
            curveTo(19.765f, 16.511f, 19.132f, 16.511f, 18.741f, 16.121f)
            lineTo(15.62f, 13f)
            horizontalLineTo(13f)
            verticalLineTo(15.62f)
            lineTo(16.121f, 18.741f)
            curveTo(16.511f, 19.132f, 16.511f, 19.765f, 16.121f, 20.155f)
            curveTo(15.73f, 20.546f, 15.097f, 20.546f, 14.707f, 20.155f)
            lineTo(13f, 18.449f)
            verticalLineTo(21f)
            curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
            curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
            verticalLineTo(18.449f)
            lineTo(9.293f, 20.155f)
            curveTo(8.903f, 20.546f, 8.27f, 20.546f, 7.879f, 20.155f)
            curveTo(7.489f, 19.765f, 7.489f, 19.132f, 7.879f, 18.741f)
            lineTo(11f, 15.62f)
            verticalLineTo(13f)
            horizontalLineTo(8.38f)
            lineTo(5.259f, 16.121f)
            curveTo(4.868f, 16.511f, 4.235f, 16.511f, 3.845f, 16.121f)
            curveTo(3.454f, 15.73f, 3.454f, 15.097f, 3.845f, 14.707f)
            lineTo(5.551f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(5.551f)
            lineTo(3.845f, 9.293f)
            curveTo(3.454f, 8.903f, 3.454f, 8.27f, 3.845f, 7.879f)
            curveTo(4.235f, 7.489f, 4.868f, 7.489f, 5.259f, 7.879f)
            lineTo(8.38f, 11f)
            horizontalLineTo(11f)
            verticalLineTo(8.38f)
            lineTo(7.879f, 5.259f)
            curveTo(7.489f, 4.868f, 7.489f, 4.235f, 7.879f, 3.845f)
            curveTo(8.27f, 3.454f, 8.903f, 3.454f, 9.293f, 3.845f)
            lineTo(11f, 5.551f)
            verticalLineTo(3f)
            curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.379f to Color(0x00FF6CE8),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(6.839f, 2.806f),
                end = Offset(22.114f, 22.683f)
            )
        ) {
            moveTo(12f, 2f)
            curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
            verticalLineTo(5.551f)
            lineTo(14.707f, 3.845f)
            curveTo(15.097f, 3.454f, 15.73f, 3.454f, 16.121f, 3.845f)
            curveTo(16.511f, 4.235f, 16.511f, 4.868f, 16.121f, 5.259f)
            lineTo(13f, 8.38f)
            verticalLineTo(11f)
            horizontalLineTo(15.62f)
            lineTo(18.741f, 7.879f)
            curveTo(19.132f, 7.489f, 19.765f, 7.489f, 20.155f, 7.879f)
            curveTo(20.546f, 8.27f, 20.546f, 8.903f, 20.155f, 9.293f)
            lineTo(18.449f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(18.449f)
            lineTo(20.155f, 14.707f)
            curveTo(20.546f, 15.097f, 20.546f, 15.73f, 20.155f, 16.121f)
            curveTo(19.765f, 16.511f, 19.132f, 16.511f, 18.741f, 16.121f)
            lineTo(15.62f, 13f)
            horizontalLineTo(13f)
            verticalLineTo(15.62f)
            lineTo(16.121f, 18.741f)
            curveTo(16.511f, 19.132f, 16.511f, 19.765f, 16.121f, 20.155f)
            curveTo(15.73f, 20.546f, 15.097f, 20.546f, 14.707f, 20.155f)
            lineTo(13f, 18.449f)
            verticalLineTo(21f)
            curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
            curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
            verticalLineTo(18.449f)
            lineTo(9.293f, 20.155f)
            curveTo(8.903f, 20.546f, 8.27f, 20.546f, 7.879f, 20.155f)
            curveTo(7.489f, 19.765f, 7.489f, 19.132f, 7.879f, 18.741f)
            lineTo(11f, 15.62f)
            verticalLineTo(13f)
            horizontalLineTo(8.38f)
            lineTo(5.259f, 16.121f)
            curveTo(4.868f, 16.511f, 4.235f, 16.511f, 3.845f, 16.121f)
            curveTo(3.454f, 15.73f, 3.454f, 15.097f, 3.845f, 14.707f)
            lineTo(5.551f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(5.551f)
            lineTo(3.845f, 9.293f)
            curveTo(3.454f, 8.903f, 3.454f, 8.27f, 3.845f, 7.879f)
            curveTo(4.235f, 7.489f, 4.868f, 7.489f, 5.259f, 7.879f)
            lineTo(8.38f, 11f)
            horizontalLineTo(11f)
            verticalLineTo(8.38f)
            lineTo(7.879f, 5.259f)
            curveTo(7.489f, 4.868f, 7.489f, 4.235f, 7.879f, 3.845f)
            curveTo(8.27f, 3.454f, 8.903f, 3.454f, 9.293f, 3.845f)
            lineTo(11f, 5.551f)
            verticalLineTo(3f)
            curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherSnowflakePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.WeatherSnowflake, contentDescription = null)
    }
}
