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

public val FluentIcons.Regular.ClockSparkle: ImageVector
    get() {
        if (_ClockSparkle != null) {
            return _ClockSparkle!!
        }
        _ClockSparkle = ImageVector.Builder(
            name = "Regular.ClockSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.96f, 20.549f)
                curveTo(11.96f, 20.532f, 11.96f, 20.516f, 11.96f, 20.5f)
                lineTo(12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                curveTo(8.336f, 3.5f, 5.214f, 5.818f, 4.02f, 9.067f)
                curveTo(3.565f, 9.207f, 3.175f, 9.552f, 3f, 9.999f)
                lineTo(2.54f, 11.399f)
                curveTo(2.441f, 11.714f, 2.25f, 11.994f, 2.002f, 12.208f)
                curveTo(2.001f, 12.139f, 2f, 12.07f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(11.537f, 22f, 11.081f, 21.969f, 10.634f, 21.907f)
                curveTo(10.7f, 21.889f, 10.765f, 21.872f, 10.828f, 21.856f)
                curveTo(10.913f, 21.834f, 10.995f, 21.813f, 11.07f, 21.789f)
                curveTo(11.334f, 21.7f, 11.562f, 21.528f, 11.72f, 21.299f)
                curveTo(11.876f, 21.08f, 11.96f, 20.818f, 11.96f, 20.549f)
                close()
                moveTo(11.993f, 6.648f)
                curveTo(11.943f, 6.282f, 11.63f, 6f, 11.25f, 6f)
                curveTo(10.836f, 6f, 10.5f, 6.336f, 10.5f, 6.75f)
                verticalLineTo(12.75f)
                lineTo(10.507f, 12.852f)
                curveTo(10.557f, 13.218f, 10.87f, 13.5f, 11.25f, 13.5f)
                horizontalLineTo(15.25f)
                lineTo(15.352f, 13.493f)
                curveTo(15.718f, 13.443f, 16f, 13.13f, 16f, 12.75f)
                curveTo(16f, 12.336f, 15.664f, 12f, 15.25f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(6.75f)
                lineTo(11.993f, 6.648f)
                close()
                moveTo(3.088f, 16.412f)
                curveTo(3.016f, 16.319f, 2.938f, 16.23f, 2.854f, 16.146f)
                curveTo(2.542f, 15.833f, 2.161f, 15.597f, 1.741f, 15.457f)
                lineTo(0.363f, 15.009f)
                curveTo(0.257f, 14.972f, 0.165f, 14.903f, 0.1f, 14.811f)
                curveTo(0.035f, 14.719f, 0f, 14.609f, 0f, 14.497f)
                curveTo(0f, 14.384f, 0.035f, 14.274f, 0.1f, 14.182f)
                curveTo(0.165f, 14.091f, 0.257f, 14.021f, 0.363f, 13.984f)
                lineTo(1.741f, 13.536f)
                curveTo(2.155f, 13.394f, 2.53f, 13.157f, 2.837f, 12.845f)
                curveTo(3.136f, 12.542f, 3.362f, 12.176f, 3.5f, 11.774f)
                lineTo(3.511f, 11.74f)
                lineTo(3.959f, 10.363f)
                curveTo(3.997f, 10.257f, 4.066f, 10.165f, 4.158f, 10.1f)
                curveTo(4.25f, 10.035f, 4.36f, 10f, 4.472f, 10f)
                curveTo(4.585f, 10f, 4.695f, 10.035f, 4.787f, 10.1f)
                curveTo(4.879f, 10.165f, 4.948f, 10.257f, 4.986f, 10.363f)
                lineTo(5.433f, 11.74f)
                curveTo(5.573f, 12.158f, 5.808f, 12.538f, 6.12f, 12.85f)
                curveTo(6.432f, 13.162f, 6.813f, 13.397f, 7.231f, 13.536f)
                lineTo(8.609f, 13.984f)
                lineTo(8.637f, 13.991f)
                curveTo(8.743f, 14.028f, 8.835f, 14.097f, 8.9f, 14.189f)
                curveTo(8.965f, 14.281f, 9f, 14.391f, 9f, 14.503f)
                curveTo(9f, 14.616f, 8.965f, 14.726f, 8.9f, 14.818f)
                curveTo(8.835f, 14.909f, 8.743f, 14.979f, 8.637f, 15.016f)
                lineTo(7.259f, 15.464f)
                curveTo(6.84f, 15.603f, 6.46f, 15.838f, 6.147f, 16.15f)
                curveTo(5.835f, 16.462f, 5.6f, 16.842f, 5.461f, 17.26f)
                lineTo(5.013f, 18.637f)
                curveTo(5.009f, 18.649f, 5.005f, 18.66f, 5f, 18.671f)
                curveTo(4.961f, 18.763f, 4.896f, 18.842f, 4.814f, 18.9f)
                curveTo(4.722f, 18.965f, 4.613f, 19f, 4.5f, 19f)
                curveTo(4.387f, 19f, 4.278f, 18.965f, 4.186f, 18.9f)
                curveTo(4.094f, 18.835f, 4.024f, 18.743f, 3.987f, 18.637f)
                lineTo(3.539f, 17.26f)
                curveTo(3.438f, 16.953f, 3.285f, 16.667f, 3.088f, 16.412f)
                close()
                moveTo(10.783f, 20.213f)
                lineTo(10.017f, 19.965f)
                curveTo(9.785f, 19.887f, 9.573f, 19.757f, 9.4f, 19.584f)
                curveTo(9.227f, 19.41f, 9.096f, 19.199f, 9.019f, 18.966f)
                lineTo(8.77f, 18.202f)
                curveTo(8.749f, 18.143f, 8.71f, 18.092f, 8.659f, 18.056f)
                curveTo(8.608f, 18.019f, 8.547f, 18f, 8.485f, 18f)
                curveTo(8.422f, 18f, 8.361f, 18.019f, 8.31f, 18.056f)
                curveTo(8.259f, 18.092f, 8.22f, 18.143f, 8.2f, 18.202f)
                lineTo(7.951f, 18.966f)
                curveTo(7.875f, 19.197f, 7.747f, 19.408f, 7.576f, 19.581f)
                curveTo(7.405f, 19.754f, 7.197f, 19.885f, 6.967f, 19.965f)
                lineTo(6.202f, 20.213f)
                curveTo(6.143f, 20.234f, 6.092f, 20.272f, 6.056f, 20.324f)
                curveTo(6.019f, 20.375f, 6f, 20.436f, 6f, 20.498f)
                curveTo(6f, 20.561f, 6.019f, 20.622f, 6.056f, 20.673f)
                curveTo(6.092f, 20.724f, 6.143f, 20.762f, 6.202f, 20.783f)
                lineTo(6.967f, 21.032f)
                curveTo(7.2f, 21.109f, 7.412f, 21.24f, 7.585f, 21.414f)
                curveTo(7.759f, 21.588f, 7.889f, 21.8f, 7.966f, 22.034f)
                lineTo(8.215f, 22.798f)
                curveTo(8.236f, 22.857f, 8.274f, 22.908f, 8.325f, 22.944f)
                curveTo(8.376f, 22.981f, 8.437f, 23f, 8.5f, 23f)
                curveTo(8.563f, 23f, 8.624f, 22.981f, 8.675f, 22.944f)
                curveTo(8.726f, 22.908f, 8.764f, 22.857f, 8.785f, 22.798f)
                lineTo(9.034f, 22.034f)
                curveTo(9.111f, 21.801f, 9.242f, 21.59f, 9.415f, 21.416f)
                curveTo(9.589f, 21.243f, 9.8f, 21.113f, 10.033f, 21.035f)
                lineTo(10.798f, 20.787f)
                curveTo(10.857f, 20.766f, 10.908f, 20.728f, 10.944f, 20.676f)
                curveTo(10.981f, 20.625f, 11f, 20.564f, 11f, 20.502f)
                curveTo(11f, 20.439f, 10.981f, 20.378f, 10.944f, 20.327f)
                curveTo(10.908f, 20.276f, 10.857f, 20.238f, 10.798f, 20.217f)
                lineTo(10.783f, 20.213f)
                close()
            }
        }.build()

        return _ClockSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _ClockSparkle: ImageVector? = null

@Preview
@Composable
private fun ClockSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClockSparkle, contentDescription = null)
    }
}
