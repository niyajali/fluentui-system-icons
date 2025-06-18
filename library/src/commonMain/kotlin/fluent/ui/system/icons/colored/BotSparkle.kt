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

public val FluentUi.Colored.BotSparkle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.BotSparkle",
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
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4E44DB),
                    1f to Color(0x004E44DB),
                ),
                center = Offset(17.542f, 17.693f),
                radius = 3.693f,
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
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4E44DB),
                    1f to Color(0x004E44DB),
                ),
                center = Offset(16.926f, 16.462f),
                radius = 3.481f,
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
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4E44DB),
                    1f to Color(0x004E44DB),
                ),
                center = Offset(17.542f, 15.846f),
                radius = 5.538f,
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
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937),
                ),
                start = Offset(20f, 19.5f),
                end = Offset(23.002f, 23.499f),
            ),
        ) {
            moveTo(23.017f, 20.965f)
            lineTo(23.783f, 21.213f)
            lineTo(23.798f, 21.217f)
            curveTo(23.857f, 21.238f, 23.908f, 21.276f, 23.944f, 21.327f)
            curveTo(23.981f, 21.378f, 24f, 21.439f, 24f, 21.502f)
            curveTo(24f, 21.564f, 23.981f, 21.625f, 23.944f, 21.676f)
            curveTo(23.908f, 21.728f, 23.857f, 21.766f, 23.798f, 21.787f)
            lineTo(23.033f, 22.035f)
            curveTo(22.8f, 22.113f, 22.589f, 22.243f, 22.415f, 22.416f)
            curveTo(22.242f, 22.59f, 22.111f, 22.801f, 22.034f, 23.034f)
            lineTo(21.785f, 23.798f)
            curveTo(21.764f, 23.857f, 21.726f, 23.908f, 21.675f, 23.944f)
            curveTo(21.624f, 23.981f, 21.563f, 24f, 21.5f, 24f)
            curveTo(21.437f, 24f, 21.376f, 23.981f, 21.325f, 23.944f)
            curveTo(21.274f, 23.908f, 21.236f, 23.857f, 21.215f, 23.798f)
            lineTo(20.966f, 23.034f)
            curveTo(20.889f, 22.8f, 20.759f, 22.588f, 20.586f, 22.414f)
            curveTo(20.412f, 22.24f, 20.2f, 22.109f, 19.967f, 22.032f)
            lineTo(19.202f, 21.783f)
            curveTo(19.143f, 21.762f, 19.092f, 21.724f, 19.056f, 21.673f)
            curveTo(19.019f, 21.622f, 19f, 21.561f, 19f, 21.498f)
            curveTo(19f, 21.436f, 19.019f, 21.375f, 19.056f, 21.324f)
            curveTo(19.092f, 21.272f, 19.143f, 21.234f, 19.202f, 21.213f)
            lineTo(19.967f, 20.965f)
            curveTo(20.197f, 20.885f, 20.406f, 20.754f, 20.576f, 20.581f)
            curveTo(20.747f, 20.408f, 20.875f, 20.197f, 20.951f, 19.966f)
            lineTo(21.2f, 19.202f)
            curveTo(21.22f, 19.143f, 21.259f, 19.092f, 21.31f, 19.056f)
            curveTo(21.361f, 19.019f, 21.422f, 19f, 21.485f, 19f)
            curveTo(21.547f, 19f, 21.608f, 19.019f, 21.659f, 19.056f)
            curveTo(21.71f, 19.092f, 21.749f, 19.143f, 21.77f, 19.202f)
            lineTo(22.019f, 19.966f)
            curveTo(22.096f, 20.199f, 22.226f, 20.41f, 22.4f, 20.584f)
            curveTo(22.573f, 20.757f, 22.785f, 20.887f, 23.017f, 20.965f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(20.071f, 18.714f),
                end = Offset(13.76f, 11.457f),
            ),
        ) {
            moveTo(15.854f, 17.146f)
            curveTo(15.938f, 17.23f, 16.016f, 17.319f, 16.088f, 17.412f)
            curveTo(16.285f, 17.667f, 16.438f, 17.953f, 16.539f, 18.26f)
            lineTo(16.987f, 19.637f)
            curveTo(17.024f, 19.743f, 17.094f, 19.835f, 17.186f, 19.9f)
            curveTo(17.278f, 19.965f, 17.387f, 20f, 17.5f, 20f)
            curveTo(17.613f, 20f, 17.722f, 19.965f, 17.814f, 19.9f)
            curveTo(17.896f, 19.842f, 17.961f, 19.763f, 18f, 19.671f)
            curveTo(18.005f, 19.66f, 18.009f, 19.649f, 18.013f, 19.637f)
            lineTo(18.461f, 18.26f)
            curveTo(18.6f, 17.842f, 18.835f, 17.462f, 19.147f, 17.15f)
            curveTo(19.459f, 16.838f, 19.84f, 16.603f, 20.259f, 16.464f)
            lineTo(21.637f, 16.016f)
            curveTo(21.743f, 15.979f, 21.835f, 15.909f, 21.9f, 15.818f)
            curveTo(21.965f, 15.726f, 22f, 15.616f, 22f, 15.503f)
            curveTo(22f, 15.391f, 21.965f, 15.281f, 21.9f, 15.189f)
            curveTo(21.835f, 15.097f, 21.743f, 15.028f, 21.637f, 14.991f)
            lineTo(21.609f, 14.984f)
            lineTo(20.232f, 14.536f)
            curveTo(19.813f, 14.397f, 19.432f, 14.162f, 19.12f, 13.85f)
            curveTo(18.808f, 13.538f, 18.573f, 13.158f, 18.434f, 12.74f)
            lineTo(17.986f, 11.363f)
            curveTo(17.948f, 11.257f, 17.879f, 11.165f, 17.787f, 11.1f)
            curveTo(17.695f, 11.035f, 17.585f, 11f, 17.472f, 11f)
            curveTo(17.36f, 11f, 17.25f, 11.035f, 17.158f, 11.1f)
            curveTo(17.066f, 11.165f, 16.997f, 11.257f, 16.959f, 11.363f)
            lineTo(16.511f, 12.74f)
            lineTo(16.5f, 12.774f)
            curveTo(16.362f, 13.176f, 16.136f, 13.542f, 15.837f, 13.845f)
            curveTo(15.53f, 14.157f, 15.155f, 14.394f, 14.741f, 14.536f)
            lineTo(13.363f, 14.984f)
            curveTo(13.257f, 15.021f, 13.165f, 15.091f, 13.1f, 15.182f)
            curveTo(13.035f, 15.274f, 13f, 15.384f, 13f, 15.497f)
            curveTo(13f, 15.609f, 13.035f, 15.719f, 13.1f, 15.811f)
            curveTo(13.165f, 15.903f, 13.257f, 15.972f, 13.363f, 16.009f)
            lineTo(14.741f, 16.457f)
            curveTo(15.161f, 16.597f, 15.542f, 16.833f, 15.854f, 17.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BotSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.BotSparkle, contentDescription = null)
    }
}
