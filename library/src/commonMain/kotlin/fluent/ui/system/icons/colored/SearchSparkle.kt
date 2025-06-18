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

public val FluentUi.Colored.SearchSparkle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.SearchSparkle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(13.5f, 5.333f),
                end = Offset(3f, 17f),
            ),
        ) {
            moveTo(17f, 10f)
            curveTo(17f, 13.866f, 13.866f, 17f, 10f, 17f)
            curveTo(6.134f, 17f, 3f, 13.866f, 3f, 10f)
            curveTo(3f, 6.134f, 6.134f, 3f, 10f, 3f)
            curveTo(13.866f, 3f, 17f, 6.134f, 17f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF29C3FF),
                ),
                start = Offset(3f, 19f),
                end = Offset(19f, 6f),
            ),
        ) {
            moveTo(14.843f, 16.368f)
            curveTo(13.499f, 17.392f, 11.82f, 18f, 10f, 18f)
            curveTo(5.582f, 18f, 2f, 14.418f, 2f, 10f)
            curveTo(2f, 5.582f, 5.582f, 2f, 10f, 2f)
            curveTo(14.418f, 2f, 18f, 5.582f, 18f, 10f)
            curveTo(18f, 11.877f, 17.354f, 13.603f, 16.271f, 14.967f)
            lineTo(20.698f, 19.284f)
            curveTo(21.094f, 19.67f, 21.101f, 20.303f, 20.716f, 20.698f)
            curveTo(20.33f, 21.094f, 19.697f, 21.101f, 19.302f, 20.716f)
            lineTo(14.843f, 16.368f)
            close()
            moveTo(16f, 10f)
            curveTo(16f, 6.686f, 13.314f, 4f, 10f, 4f)
            curveTo(6.686f, 4f, 4f, 6.686f, 4f, 10f)
            curveTo(4f, 13.314f, 6.686f, 16f, 10f, 16f)
            curveTo(13.314f, 16f, 16f, 13.314f, 16f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.718f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505),
                ),
                center = Offset(7.375f, -10.813f),
                radius = 28.614f,
            ),
        ) {
            moveTo(20.783f, 10.213f)
            lineTo(20.017f, 9.965f)
            curveTo(19.785f, 9.887f, 19.573f, 9.757f, 19.4f, 9.584f)
            curveTo(19.226f, 9.41f, 19.096f, 9.199f, 19.019f, 8.966f)
            lineTo(18.77f, 8.202f)
            curveTo(18.749f, 8.143f, 18.71f, 8.092f, 18.659f, 8.056f)
            curveTo(18.608f, 8.019f, 18.547f, 8f, 18.485f, 8f)
            curveTo(18.422f, 8f, 18.361f, 8.019f, 18.31f, 8.056f)
            curveTo(18.259f, 8.092f, 18.22f, 8.143f, 18.2f, 8.202f)
            lineTo(17.951f, 8.966f)
            curveTo(17.875f, 9.197f, 17.747f, 9.408f, 17.576f, 9.581f)
            curveTo(17.406f, 9.754f, 17.197f, 9.885f, 16.967f, 9.965f)
            lineTo(16.202f, 10.213f)
            curveTo(16.143f, 10.234f, 16.092f, 10.273f, 16.056f, 10.324f)
            curveTo(16.019f, 10.375f, 16f, 10.436f, 16f, 10.498f)
            curveTo(16f, 10.561f, 16.019f, 10.622f, 16.056f, 10.673f)
            curveTo(16.092f, 10.724f, 16.143f, 10.762f, 16.202f, 10.783f)
            lineTo(16.967f, 11.032f)
            curveTo(17.2f, 11.109f, 17.412f, 11.24f, 17.586f, 11.414f)
            curveTo(17.759f, 11.588f, 17.889f, 11.8f, 17.966f, 12.033f)
            lineTo(18.215f, 12.798f)
            curveTo(18.236f, 12.857f, 18.274f, 12.908f, 18.325f, 12.944f)
            curveTo(18.376f, 12.981f, 18.437f, 13f, 18.5f, 13f)
            curveTo(18.563f, 13f, 18.624f, 12.981f, 18.675f, 12.944f)
            curveTo(18.726f, 12.908f, 18.764f, 12.857f, 18.785f, 12.798f)
            lineTo(19.034f, 12.033f)
            curveTo(19.111f, 11.801f, 19.242f, 11.59f, 19.415f, 11.416f)
            curveTo(19.589f, 11.243f, 19.8f, 11.113f, 20.033f, 11.035f)
            lineTo(20.798f, 10.787f)
            curveTo(20.857f, 10.766f, 20.908f, 10.727f, 20.944f, 10.676f)
            curveTo(20.981f, 10.625f, 21f, 10.564f, 21f, 10.502f)
            curveTo(21f, 10.439f, 20.981f, 10.378f, 20.944f, 10.327f)
            curveTo(20.908f, 10.276f, 20.857f, 10.238f, 20.798f, 10.217f)
            lineTo(20.783f, 10.213f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.698f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505),
                ),
                center = Offset(-1.17f, -22.661f),
                radius = 38.697f,
            ),
        ) {
            moveTo(13.088f, 6.412f)
            curveTo(13.016f, 6.319f, 12.938f, 6.23f, 12.854f, 6.146f)
            curveTo(12.542f, 5.833f, 12.161f, 5.597f, 11.741f, 5.457f)
            lineTo(10.363f, 5.009f)
            curveTo(10.257f, 4.972f, 10.165f, 4.903f, 10.1f, 4.811f)
            curveTo(10.035f, 4.719f, 10f, 4.609f, 10f, 4.497f)
            curveTo(10f, 4.384f, 10.035f, 4.274f, 10.1f, 4.182f)
            curveTo(10.165f, 4.091f, 10.257f, 4.021f, 10.363f, 3.984f)
            lineTo(11.741f, 3.536f)
            curveTo(12.155f, 3.394f, 12.53f, 3.157f, 12.837f, 2.845f)
            curveTo(13.136f, 2.542f, 13.362f, 2.176f, 13.5f, 1.774f)
            lineTo(13.511f, 1.74f)
            lineTo(13.959f, 0.363f)
            curveTo(13.997f, 0.257f, 14.066f, 0.165f, 14.158f, 0.1f)
            curveTo(14.25f, 0.035f, 14.36f, 0f, 14.472f, 0f)
            curveTo(14.585f, 0f, 14.695f, 0.035f, 14.787f, 0.1f)
            curveTo(14.879f, 0.165f, 14.948f, 0.257f, 14.986f, 0.363f)
            lineTo(15.434f, 1.74f)
            curveTo(15.573f, 2.158f, 15.808f, 2.539f, 16.12f, 2.85f)
            curveTo(16.432f, 3.162f, 16.813f, 3.397f, 17.232f, 3.536f)
            lineTo(18.609f, 3.984f)
            lineTo(18.637f, 3.991f)
            curveTo(18.743f, 4.028f, 18.835f, 4.097f, 18.9f, 4.189f)
            curveTo(18.965f, 4.281f, 19f, 4.391f, 19f, 4.503f)
            curveTo(19f, 4.616f, 18.965f, 4.726f, 18.9f, 4.818f)
            curveTo(18.835f, 4.909f, 18.743f, 4.979f, 18.637f, 5.016f)
            lineTo(17.259f, 5.464f)
            curveTo(16.84f, 5.603f, 16.459f, 5.838f, 16.147f, 6.15f)
            curveTo(15.835f, 6.461f, 15.6f, 6.842f, 15.461f, 7.26f)
            lineTo(15.013f, 8.637f)
            curveTo(15.009f, 8.649f, 15.005f, 8.66f, 15f, 8.671f)
            curveTo(14.96f, 8.763f, 14.896f, 8.842f, 14.814f, 8.9f)
            curveTo(14.722f, 8.965f, 14.613f, 9f, 14.5f, 9f)
            curveTo(14.387f, 9f, 14.278f, 8.965f, 14.186f, 8.9f)
            curveTo(14.094f, 8.835f, 14.024f, 8.743f, 13.987f, 8.637f)
            lineTo(13.539f, 7.26f)
            curveTo(13.438f, 6.953f, 13.285f, 6.667f, 13.088f, 6.412f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SearchSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.SearchSparkle, contentDescription = null)
    }
}
