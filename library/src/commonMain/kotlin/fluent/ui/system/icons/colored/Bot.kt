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

public val FluentIcons.Colored.Bot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Bot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB),
                ),
                center = Offset(0.311f, 11.538f),
                radius = 22.253f,
            ),
        ) {
            moveTo(17.753f, 14f)
            curveTo(18.996f, 14f, 20.003f, 15.007f, 20.003f, 16.25f)
            verticalLineTo(17.155f)
            curveTo(20.003f, 18.249f, 19.526f, 19.288f, 18.696f, 20f)
            curveTo(17.13f, 21.344f, 14.89f, 22.001f, 12f, 22.001f)
            curveTo(9.111f, 22.001f, 6.872f, 21.344f, 5.309f, 20.001f)
            curveTo(4.48f, 19.288f, 4.004f, 18.25f, 4.004f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.254f, 14f)
            horizontalLineTo(17.753f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8),
                ),
                start = Offset(12.003f, 13.047f),
                end = Offset(15.623f, 26.573f),
            ),
        ) {
            moveTo(17.753f, 14f)
            curveTo(18.996f, 14f, 20.003f, 15.007f, 20.003f, 16.25f)
            verticalLineTo(17.155f)
            curveTo(20.003f, 18.249f, 19.526f, 19.288f, 18.696f, 20f)
            curveTo(17.13f, 21.344f, 14.89f, 22.001f, 12f, 22.001f)
            curveTo(9.111f, 22.001f, 6.872f, 21.344f, 5.309f, 20.001f)
            curveTo(4.48f, 19.288f, 4.004f, 18.25f, 4.004f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.254f, 14f)
            horizontalLineTo(17.753f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF8B52F4),
                    1f to Color(0xFF3D35B1),
                ),
                start = Offset(11.209f, 2f),
                end = Offset(12.984f, 3.871f),
            ),
        ) {
            moveTo(12f, 2.5f)
            lineTo(11.898f, 2.507f)
            curveTo(11.532f, 2.557f, 11.25f, 2.87f, 11.25f, 3.25f)
            lineTo(11.243f, 5f)
            horizontalLineTo(12.743f)
            lineTo(12.75f, 3.25f)
            lineTo(12.743f, 3.148f)
            curveTo(12.693f, 2.782f, 12.38f, 2.5f, 12f, 2.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB),
                ),
                center = Offset(1.8f, 0.571f),
                radius = 19.999f,
            ),
        ) {
            moveTo(18f, 6.25f)
            curveTo(18f, 5.007f, 16.993f, 4f, 15.75f, 4f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 4f, 6f, 5.007f, 6f, 6.25f)
            verticalLineTo(9.75f)
            curveTo(6f, 10.993f, 7.007f, 12f, 8.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 12f, 18f, 10.993f, 18f, 9.75f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA),
                ),
                start = Offset(13.585f, 6.596f),
                end = Offset(15.479f, 9.865f),
            ),
        ) {
            moveTo(14.242f, 6.5f)
            curveTo(13.552f, 6.5f, 12.993f, 7.059f, 12.993f, 7.749f)
            curveTo(12.993f, 8.439f, 13.552f, 8.999f, 14.242f, 8.999f)
            curveTo(14.932f, 8.999f, 15.491f, 8.439f, 15.491f, 7.749f)
            curveTo(15.491f, 7.059f, 14.932f, 6.5f, 14.242f, 6.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA),
                ),
                start = Offset(9.092f, 6.596f),
                end = Offset(10.986f, 9.865f),
            ),
        ) {
            moveTo(9.749f, 6.5f)
            curveTo(9.059f, 6.5f, 8.5f, 7.059f, 8.5f, 7.749f)
            curveTo(8.5f, 8.439f, 9.059f, 8.999f, 9.749f, 8.999f)
            curveTo(10.439f, 8.999f, 10.999f, 8.439f, 10.999f, 7.749f)
            curveTo(10.999f, 7.059f, 10.439f, 6.5f, 9.749f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Bot, contentDescription = null)
    }
}
