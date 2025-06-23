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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUpSparkle: ImageVector
    get() {
        if (_ArrowCircleUpSparkle != null) {
            return _ArrowCircleUpSparkle!!
        }
        _ArrowCircleUpSparkle = ImageVector.Builder(
            name = "Regular.ArrowCircleUpSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.088f, 6.412f)
                curveTo(16.016f, 6.319f, 15.938f, 6.23f, 15.854f, 6.146f)
                curveTo(15.542f, 5.833f, 15.161f, 5.597f, 14.741f, 5.457f)
                lineTo(13.363f, 5.009f)
                curveTo(13.257f, 4.972f, 13.165f, 4.903f, 13.1f, 4.811f)
                curveTo(13.035f, 4.719f, 13f, 4.609f, 13f, 4.497f)
                curveTo(13f, 4.384f, 13.035f, 4.274f, 13.1f, 4.182f)
                curveTo(13.165f, 4.091f, 13.257f, 4.021f, 13.363f, 3.984f)
                lineTo(14.741f, 3.536f)
                curveTo(15.155f, 3.394f, 15.53f, 3.157f, 15.837f, 2.845f)
                curveTo(16.136f, 2.542f, 16.362f, 2.176f, 16.5f, 1.774f)
                lineTo(16.511f, 1.74f)
                lineTo(16.959f, 0.363f)
                curveTo(16.997f, 0.257f, 17.066f, 0.165f, 17.158f, 0.1f)
                curveTo(17.25f, 0.035f, 17.36f, 0f, 17.472f, 0f)
                curveTo(17.585f, 0f, 17.695f, 0.035f, 17.787f, 0.1f)
                curveTo(17.879f, 0.165f, 17.948f, 0.257f, 17.986f, 0.363f)
                lineTo(18.434f, 1.74f)
                curveTo(18.573f, 2.158f, 18.808f, 2.539f, 19.12f, 2.85f)
                curveTo(19.432f, 3.162f, 19.813f, 3.397f, 20.232f, 3.536f)
                lineTo(21.609f, 3.984f)
                lineTo(21.637f, 3.991f)
                curveTo(21.743f, 4.028f, 21.835f, 4.097f, 21.9f, 4.189f)
                curveTo(21.965f, 4.281f, 22f, 4.391f, 22f, 4.503f)
                curveTo(22f, 4.616f, 21.965f, 4.726f, 21.9f, 4.818f)
                curveTo(21.835f, 4.909f, 21.743f, 4.979f, 21.637f, 5.016f)
                lineTo(20.259f, 5.464f)
                curveTo(19.84f, 5.603f, 19.459f, 5.838f, 19.147f, 6.15f)
                curveTo(18.835f, 6.461f, 18.6f, 6.842f, 18.461f, 7.26f)
                lineTo(18.013f, 8.637f)
                curveTo(18.009f, 8.649f, 18.005f, 8.66f, 18f, 8.671f)
                curveTo(17.961f, 8.763f, 17.896f, 8.842f, 17.814f, 8.9f)
                curveTo(17.722f, 8.965f, 17.613f, 9f, 17.5f, 9f)
                curveTo(17.387f, 9f, 17.278f, 8.965f, 17.186f, 8.9f)
                curveTo(17.094f, 8.835f, 17.024f, 8.743f, 16.987f, 8.637f)
                lineTo(16.539f, 7.26f)
                curveTo(16.438f, 6.953f, 16.285f, 6.667f, 16.088f, 6.412f)
                close()
                moveTo(23.783f, 10.213f)
                lineTo(23.017f, 9.965f)
                curveTo(22.785f, 9.887f, 22.573f, 9.757f, 22.4f, 9.584f)
                curveTo(22.226f, 9.41f, 22.096f, 9.199f, 22.019f, 8.966f)
                lineTo(21.77f, 8.202f)
                curveTo(21.749f, 8.143f, 21.71f, 8.092f, 21.659f, 8.056f)
                curveTo(21.608f, 8.019f, 21.547f, 8f, 21.485f, 8f)
                curveTo(21.422f, 8f, 21.361f, 8.019f, 21.31f, 8.056f)
                curveTo(21.259f, 8.092f, 21.22f, 8.143f, 21.2f, 8.202f)
                lineTo(20.951f, 8.966f)
                curveTo(20.875f, 9.197f, 20.747f, 9.408f, 20.576f, 9.581f)
                curveTo(20.406f, 9.754f, 20.197f, 9.885f, 19.967f, 9.965f)
                lineTo(19.202f, 10.213f)
                curveTo(19.143f, 10.234f, 19.092f, 10.273f, 19.056f, 10.324f)
                curveTo(19.019f, 10.375f, 19f, 10.436f, 19f, 10.498f)
                curveTo(19f, 10.561f, 19.019f, 10.622f, 19.056f, 10.673f)
                curveTo(19.092f, 10.724f, 19.143f, 10.762f, 19.202f, 10.783f)
                lineTo(19.967f, 11.032f)
                curveTo(20.2f, 11.109f, 20.412f, 11.24f, 20.586f, 11.414f)
                curveTo(20.759f, 11.588f, 20.889f, 11.8f, 20.966f, 12.033f)
                lineTo(21.215f, 12.798f)
                curveTo(21.236f, 12.857f, 21.274f, 12.908f, 21.325f, 12.944f)
                curveTo(21.376f, 12.981f, 21.437f, 13f, 21.5f, 13f)
                curveTo(21.563f, 13f, 21.624f, 12.981f, 21.675f, 12.944f)
                curveTo(21.726f, 12.908f, 21.764f, 12.857f, 21.785f, 12.798f)
                lineTo(22.034f, 12.033f)
                curveTo(22.111f, 11.801f, 22.242f, 11.59f, 22.415f, 11.416f)
                curveTo(22.589f, 11.243f, 22.8f, 11.113f, 23.033f, 11.035f)
                lineTo(23.798f, 10.787f)
                curveTo(23.857f, 10.766f, 23.908f, 10.727f, 23.944f, 10.676f)
                curveTo(23.981f, 10.625f, 24f, 10.564f, 24f, 10.502f)
                curveTo(24f, 10.439f, 23.981f, 10.378f, 23.944f, 10.327f)
                curveTo(23.908f, 10.276f, 23.857f, 10.238f, 23.798f, 10.217f)
                lineTo(23.783f, 10.213f)
                close()
                moveTo(12f, 2.001f)
                curveTo(12.957f, 2.001f, 13.883f, 2.135f, 14.759f, 2.386f)
                curveTo(14.643f, 2.457f, 14.519f, 2.516f, 14.39f, 2.559f)
                lineTo(13.05f, 2.999f)
                curveTo(12.762f, 3.102f, 12.518f, 3.28f, 12.337f, 3.507f)
                curveTo(12.225f, 3.503f, 12.113f, 3.501f, 12f, 3.501f)
                curveTo(7.306f, 3.501f, 3.5f, 7.306f, 3.5f, 12.001f)
                curveTo(3.5f, 16.695f, 7.306f, 20.501f, 12f, 20.501f)
                curveTo(16.212f, 20.501f, 19.709f, 17.436f, 20.383f, 13.415f)
                curveTo(20.603f, 13.782f, 20.924f, 14.05f, 21.46f, 14.05f)
                curveTo(21.584f, 14.05f, 21.696f, 14.035f, 21.798f, 14.009f)
                curveTo(20.868f, 18.569f, 16.835f, 22.001f, 12f, 22.001f)
                curveTo(6.477f, 22.001f, 2f, 17.524f, 2f, 12.001f)
                curveTo(2f, 6.478f, 6.477f, 2.001f, 12f, 2.001f)
                close()
                moveTo(7.469f, 12.281f)
                lineTo(7.553f, 12.354f)
                curveTo(7.847f, 12.571f, 8.264f, 12.547f, 8.53f, 12.281f)
                lineTo(11.249f, 9.562f)
                lineTo(11.25f, 16.251f)
                lineTo(11.257f, 16.353f)
                curveTo(11.306f, 16.719f, 11.62f, 17.001f, 12f, 17.001f)
                lineTo(12.101f, 16.994f)
                curveTo(12.467f, 16.945f, 12.75f, 16.631f, 12.75f, 16.251f)
                lineTo(12.749f, 9.56f)
                lineTo(15.47f, 12.281f)
                lineTo(15.554f, 12.354f)
                curveTo(15.848f, 12.572f, 16.264f, 12.548f, 16.531f, 12.282f)
                curveTo(16.824f, 11.989f, 16.824f, 11.514f, 16.531f, 11.221f)
                lineTo(12.531f, 7.219f)
                lineTo(12.447f, 7.147f)
                curveTo(12.153f, 6.929f, 11.736f, 6.953f, 11.47f, 7.219f)
                lineTo(7.469f, 11.22f)
                lineTo(7.397f, 11.304f)
                curveTo(7.179f, 11.598f, 7.203f, 12.015f, 7.469f, 12.281f)
                close()
            }
        }.build()

        return _ArrowCircleUpSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleUpSparkle: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleUpSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCircleUpSparkle, contentDescription = null)
    }
}
