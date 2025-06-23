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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.CameraSparkles: ImageVector
    get() {
        if (_CameraSparkles != null) {
            return _CameraSparkles!!
        }
        _CameraSparkles = ImageVector.Builder(
            name = "Filled.CameraSparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.854f, 6.146f)
                curveTo(15.938f, 6.23f, 16.016f, 6.319f, 16.088f, 6.412f)
                curveTo(16.285f, 6.667f, 16.438f, 6.953f, 16.539f, 7.26f)
                lineTo(16.987f, 8.637f)
                curveTo(17.024f, 8.743f, 17.094f, 8.835f, 17.186f, 8.9f)
                curveTo(17.278f, 8.965f, 17.387f, 9f, 17.5f, 9f)
                curveTo(17.613f, 9f, 17.722f, 8.965f, 17.814f, 8.9f)
                curveTo(17.896f, 8.842f, 17.961f, 8.763f, 18f, 8.671f)
                curveTo(18.005f, 8.66f, 18.009f, 8.649f, 18.013f, 8.637f)
                lineTo(18.461f, 7.26f)
                curveTo(18.6f, 6.842f, 18.835f, 6.461f, 19.147f, 6.15f)
                curveTo(19.459f, 5.838f, 19.84f, 5.603f, 20.259f, 5.464f)
                lineTo(21.637f, 5.016f)
                curveTo(21.743f, 4.979f, 21.835f, 4.909f, 21.9f, 4.818f)
                curveTo(21.965f, 4.726f, 22f, 4.616f, 22f, 4.503f)
                curveTo(22f, 4.391f, 21.965f, 4.281f, 21.9f, 4.189f)
                curveTo(21.835f, 4.097f, 21.743f, 4.028f, 21.637f, 3.991f)
                lineTo(21.609f, 3.984f)
                lineTo(20.232f, 3.536f)
                curveTo(19.813f, 3.397f, 19.432f, 3.162f, 19.12f, 2.85f)
                curveTo(18.808f, 2.539f, 18.573f, 2.158f, 18.434f, 1.74f)
                lineTo(17.986f, 0.363f)
                curveTo(17.948f, 0.257f, 17.879f, 0.165f, 17.787f, 0.1f)
                curveTo(17.695f, 0.035f, 17.585f, 0f, 17.472f, 0f)
                curveTo(17.36f, 0f, 17.25f, 0.035f, 17.158f, 0.1f)
                curveTo(17.066f, 0.165f, 16.997f, 0.257f, 16.959f, 0.363f)
                lineTo(16.511f, 1.74f)
                lineTo(16.5f, 1.774f)
                curveTo(16.362f, 2.176f, 16.136f, 2.542f, 15.837f, 2.845f)
                curveTo(15.731f, 2.953f, 15.616f, 3.052f, 15.495f, 3.141f)
                lineTo(15.494f, 3.14f)
                curveTo(15.388f, 3.218f, 15.278f, 3.289f, 15.163f, 3.351f)
                curveTo(15.028f, 3.424f, 14.887f, 3.486f, 14.741f, 3.536f)
                lineTo(14.14f, 3.731f)
                lineTo(13.361f, 3.98f)
                curveTo(13.256f, 4.02f, 13.166f, 4.089f, 13.101f, 4.18f)
                curveTo(13.036f, 4.267f, 13.001f, 4.373f, 13f, 4.481f)
                curveTo(13f, 4.486f, 13f, 4.491f, 13f, 4.497f)
                curveTo(13f, 4.504f, 13f, 4.511f, 13f, 4.519f)
                curveTo(13.002f, 4.613f, 13.031f, 4.705f, 13.083f, 4.784f)
                curveTo(13.088f, 4.793f, 13.094f, 4.802f, 13.1f, 4.811f)
                curveTo(13.148f, 4.879f, 13.211f, 4.934f, 13.284f, 4.974f)
                curveTo(13.308f, 4.988f, 13.334f, 5f, 13.361f, 5.01f)
                lineTo(14.741f, 5.46f)
                curveTo(14.998f, 5.545f, 15.242f, 5.666f, 15.464f, 5.819f)
                curveTo(15.603f, 5.916f, 15.733f, 6.025f, 15.854f, 6.146f)
                close()
                moveTo(23.017f, 9.965f)
                lineTo(23.783f, 10.213f)
                lineTo(23.798f, 10.217f)
                curveTo(23.857f, 10.238f, 23.908f, 10.276f, 23.944f, 10.327f)
                curveTo(23.981f, 10.378f, 24f, 10.439f, 24f, 10.502f)
                curveTo(24f, 10.564f, 23.981f, 10.625f, 23.944f, 10.676f)
                curveTo(23.908f, 10.727f, 23.857f, 10.766f, 23.798f, 10.787f)
                lineTo(23.033f, 11.035f)
                curveTo(22.8f, 11.113f, 22.589f, 11.243f, 22.415f, 11.416f)
                curveTo(22.242f, 11.59f, 22.111f, 11.801f, 22.034f, 12.033f)
                lineTo(21.785f, 12.798f)
                curveTo(21.764f, 12.857f, 21.726f, 12.908f, 21.675f, 12.944f)
                curveTo(21.624f, 12.981f, 21.563f, 13f, 21.5f, 13f)
                curveTo(21.467f, 13f, 21.434f, 12.995f, 21.403f, 12.984f)
                curveTo(21.362f, 12.975f, 21.323f, 12.957f, 21.291f, 12.93f)
                curveTo(21.236f, 12.898f, 21.194f, 12.849f, 21.17f, 12.79f)
                lineTo(21.079f, 12.38f)
                lineTo(20.966f, 12.033f)
                curveTo(20.889f, 11.8f, 20.759f, 11.588f, 20.586f, 11.414f)
                curveTo(20.412f, 11.24f, 20.2f, 11.109f, 19.967f, 11.032f)
                lineTo(19.202f, 10.783f)
                curveTo(19.143f, 10.762f, 19.092f, 10.724f, 19.056f, 10.673f)
                curveTo(19.019f, 10.622f, 19f, 10.561f, 19f, 10.498f)
                curveTo(19f, 10.436f, 19.019f, 10.375f, 19.056f, 10.324f)
                curveTo(19.092f, 10.273f, 19.143f, 10.234f, 19.202f, 10.213f)
                lineTo(19.967f, 9.965f)
                curveTo(20.197f, 9.885f, 20.406f, 9.754f, 20.576f, 9.581f)
                curveTo(20.747f, 9.408f, 20.875f, 9.197f, 20.951f, 8.966f)
                lineTo(21.2f, 8.202f)
                curveTo(21.22f, 8.143f, 21.259f, 8.092f, 21.31f, 8.056f)
                curveTo(21.361f, 8.019f, 21.422f, 8f, 21.485f, 8f)
                curveTo(21.547f, 8f, 21.608f, 8.019f, 21.659f, 8.056f)
                curveTo(21.71f, 8.092f, 21.749f, 8.143f, 21.77f, 8.202f)
                lineTo(22.019f, 8.966f)
                curveTo(22.096f, 9.199f, 22.226f, 9.41f, 22.4f, 9.584f)
                curveTo(22.573f, 9.757f, 22.785f, 9.887f, 23.017f, 9.965f)
                close()
                moveTo(15f, 12.5f)
                curveTo(15f, 10.843f, 13.657f, 9.5f, 12f, 9.5f)
                curveTo(10.343f, 9.5f, 9f, 10.843f, 9f, 12.5f)
                curveTo(9f, 14.157f, 10.343f, 15.5f, 12f, 15.5f)
                curveTo(13.657f, 15.5f, 15f, 14.157f, 15f, 12.5f)
                close()
                moveTo(22f, 17.75f)
                verticalLineTo(13.892f)
                curveTo(21.832f, 13.97f, 21.648f, 14.01f, 21.461f, 14.01f)
                curveTo(21.191f, 14.01f, 20.929f, 13.926f, 20.711f, 13.77f)
                curveTo(20.484f, 13.609f, 20.313f, 13.382f, 20.221f, 13.12f)
                lineTo(19.98f, 12.36f)
                curveTo(19.952f, 12.274f, 19.904f, 12.195f, 19.84f, 12.13f)
                curveTo(19.776f, 12.071f, 19.701f, 12.023f, 19.621f, 11.99f)
                lineTo(18.83f, 11.74f)
                curveTo(18.576f, 11.649f, 18.356f, 11.481f, 18.201f, 11.26f)
                curveTo(18.042f, 11.042f, 17.958f, 10.779f, 17.961f, 10.51f)
                curveTo(17.959f, 10.278f, 18.022f, 10.05f, 18.14f, 9.85f)
                curveTo(17.93f, 9.958f, 17.697f, 10.013f, 17.461f, 10.01f)
                curveTo(17.142f, 10.009f, 16.832f, 9.911f, 16.57f, 9.73f)
                curveTo(16.305f, 9.538f, 16.106f, 9.269f, 16f, 8.96f)
                lineTo(15.561f, 7.58f)
                curveTo(15.494f, 7.382f, 15.396f, 7.196f, 15.271f, 7.03f)
                lineTo(15.12f, 6.86f)
                curveTo(14.919f, 6.658f, 14.672f, 6.508f, 14.401f, 6.42f)
                lineTo(13f, 5.96f)
                curveTo(12.703f, 5.848f, 12.445f, 5.649f, 12.26f, 5.39f)
                curveTo(12.079f, 5.129f, 11.981f, 4.818f, 11.981f, 4.5f)
                curveTo(11.981f, 4.179f, 12.079f, 3.865f, 12.26f, 3.6f)
                curveTo(12.455f, 3.338f, 12.723f, 3.14f, 13.031f, 3.03f)
                lineTo(14.391f, 2.59f)
                curveTo(14.412f, 2.583f, 14.434f, 2.575f, 14.456f, 2.567f)
                curveTo(14.284f, 2.525f, 14.106f, 2.503f, 13.925f, 2.503f)
                horizontalLineTo(10.122f)
                curveTo(9.34f, 2.503f, 8.614f, 2.909f, 8.205f, 3.576f)
                lineTo(7.33f, 5f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 21f, 22f, 19.545f, 22f, 17.75f)
                close()
                moveTo(7.5f, 12.5f)
                curveTo(7.5f, 10.015f, 9.515f, 8f, 12f, 8f)
                curveTo(14.485f, 8f, 16.5f, 10.015f, 16.5f, 12.5f)
                curveTo(16.5f, 14.985f, 14.485f, 17f, 12f, 17f)
                curveTo(9.515f, 17f, 7.5f, 14.985f, 7.5f, 12.5f)
                close()
            }
        }.build()

        return _CameraSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSparkles: ImageVector? = null

@Preview
@Composable
private fun CameraSparklesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CameraSparkles, contentDescription = null)
    }
}
