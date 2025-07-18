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

public val FluentIcons.Filled.ArrowTrendingSparkle: ImageVector
    get() {
        if (_ArrowTrendingSparkle != null) {
            return _ArrowTrendingSparkle!!
        }
        _ArrowTrendingSparkle = ImageVector.Builder(
            name = "Filled.ArrowTrendingSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.854f, 8.146f)
                curveTo(4.938f, 8.23f, 5.016f, 8.319f, 5.088f, 8.412f)
                curveTo(5.285f, 8.667f, 5.438f, 8.953f, 5.539f, 9.26f)
                lineTo(5.987f, 10.637f)
                curveTo(6.024f, 10.743f, 6.094f, 10.835f, 6.186f, 10.9f)
                curveTo(6.278f, 10.965f, 6.387f, 11f, 6.5f, 11f)
                curveTo(6.613f, 11f, 6.722f, 10.965f, 6.814f, 10.9f)
                curveTo(6.896f, 10.842f, 6.961f, 10.763f, 7f, 10.671f)
                curveTo(7.005f, 10.66f, 7.009f, 10.649f, 7.013f, 10.637f)
                lineTo(7.461f, 9.26f)
                curveTo(7.6f, 8.842f, 7.835f, 8.461f, 8.147f, 8.15f)
                curveTo(8.46f, 7.838f, 8.84f, 7.603f, 9.259f, 7.464f)
                lineTo(10.637f, 7.016f)
                curveTo(10.743f, 6.979f, 10.835f, 6.909f, 10.9f, 6.818f)
                curveTo(10.965f, 6.726f, 11f, 6.616f, 11f, 6.503f)
                curveTo(11f, 6.391f, 10.965f, 6.281f, 10.9f, 6.189f)
                curveTo(10.835f, 6.097f, 10.743f, 6.028f, 10.637f, 5.991f)
                lineTo(10.609f, 5.984f)
                lineTo(9.231f, 5.536f)
                curveTo(8.813f, 5.397f, 8.432f, 5.162f, 8.12f, 4.85f)
                curveTo(7.808f, 4.539f, 7.573f, 4.158f, 7.433f, 3.74f)
                lineTo(6.986f, 2.363f)
                curveTo(6.948f, 2.257f, 6.879f, 2.165f, 6.787f, 2.1f)
                curveTo(6.695f, 2.035f, 6.585f, 2f, 6.472f, 2f)
                curveTo(6.36f, 2f, 6.25f, 2.035f, 6.158f, 2.1f)
                curveTo(6.066f, 2.165f, 5.997f, 2.257f, 5.959f, 2.363f)
                lineTo(5.511f, 3.74f)
                lineTo(5.5f, 3.774f)
                curveTo(5.362f, 4.176f, 5.136f, 4.542f, 4.837f, 4.845f)
                curveTo(4.53f, 5.157f, 4.155f, 5.394f, 3.741f, 5.536f)
                lineTo(2.363f, 5.984f)
                curveTo(2.257f, 6.021f, 2.165f, 6.091f, 2.1f, 6.182f)
                curveTo(2.035f, 6.274f, 2f, 6.384f, 2f, 6.497f)
                curveTo(2f, 6.609f, 2.035f, 6.719f, 2.1f, 6.811f)
                curveTo(2.165f, 6.903f, 2.257f, 6.972f, 2.363f, 7.009f)
                lineTo(3.741f, 7.457f)
                curveTo(4.161f, 7.597f, 4.542f, 7.833f, 4.854f, 8.146f)
                close()
                moveTo(20f, 7f)
                curveTo(20.552f, 7f, 21f, 7.448f, 21f, 8f)
                lineTo(21f, 13f)
                curveTo(21f, 13.552f, 20.552f, 14f, 20f, 14f)
                curveTo(19.448f, 14f, 19f, 13.552f, 19f, 13f)
                lineTo(19f, 10.414f)
                lineTo(13.207f, 16.207f)
                curveTo(13.019f, 16.395f, 12.765f, 16.5f, 12.5f, 16.5f)
                curveTo(12.235f, 16.5f, 11.98f, 16.395f, 11.793f, 16.207f)
                lineTo(10f, 14.414f)
                lineTo(4.707f, 19.707f)
                curveTo(4.316f, 20.098f, 3.683f, 20.098f, 3.293f, 19.707f)
                curveTo(2.902f, 19.317f, 2.902f, 18.683f, 3.293f, 18.293f)
                lineTo(9.293f, 12.293f)
                curveTo(9.48f, 12.105f, 9.735f, 12f, 10f, 12f)
                curveTo(10.265f, 12f, 10.519f, 12.105f, 10.707f, 12.293f)
                lineTo(12.5f, 14.086f)
                lineTo(17.586f, 9f)
                lineTo(15f, 9f)
                curveTo(14.448f, 9f, 14f, 8.552f, 14f, 8f)
                curveTo(14f, 7.448f, 14.448f, 7f, 15f, 7f)
                lineTo(20f, 7f)
                close()
                moveTo(20.017f, 17.965f)
                lineTo(20.783f, 18.213f)
                lineTo(20.798f, 18.217f)
                curveTo(20.857f, 18.238f, 20.908f, 18.276f, 20.944f, 18.327f)
                curveTo(20.981f, 18.378f, 21f, 18.439f, 21f, 18.502f)
                curveTo(21f, 18.564f, 20.981f, 18.625f, 20.944f, 18.676f)
                curveTo(20.908f, 18.728f, 20.857f, 18.766f, 20.798f, 18.787f)
                lineTo(20.033f, 19.035f)
                curveTo(19.8f, 19.113f, 19.589f, 19.243f, 19.415f, 19.416f)
                curveTo(19.242f, 19.59f, 19.111f, 19.801f, 19.034f, 20.034f)
                lineTo(18.785f, 20.798f)
                curveTo(18.764f, 20.857f, 18.726f, 20.908f, 18.675f, 20.944f)
                curveTo(18.624f, 20.981f, 18.563f, 21f, 18.5f, 21f)
                curveTo(18.437f, 21f, 18.376f, 20.981f, 18.325f, 20.944f)
                curveTo(18.274f, 20.908f, 18.236f, 20.857f, 18.215f, 20.798f)
                lineTo(17.966f, 20.034f)
                curveTo(17.889f, 19.8f, 17.759f, 19.588f, 17.586f, 19.414f)
                curveTo(17.412f, 19.24f, 17.2f, 19.109f, 16.967f, 19.032f)
                lineTo(16.202f, 18.783f)
                curveTo(16.143f, 18.762f, 16.092f, 18.724f, 16.056f, 18.673f)
                curveTo(16.019f, 18.622f, 16f, 18.561f, 16f, 18.498f)
                curveTo(16f, 18.436f, 16.019f, 18.375f, 16.056f, 18.324f)
                curveTo(16.092f, 18.272f, 16.143f, 18.234f, 16.202f, 18.213f)
                lineTo(16.967f, 17.965f)
                curveTo(17.197f, 17.885f, 17.406f, 17.754f, 17.576f, 17.581f)
                curveTo(17.747f, 17.408f, 17.875f, 17.197f, 17.951f, 16.966f)
                lineTo(18.2f, 16.202f)
                curveTo(18.22f, 16.143f, 18.259f, 16.092f, 18.31f, 16.056f)
                curveTo(18.361f, 16.019f, 18.422f, 16f, 18.485f, 16f)
                curveTo(18.547f, 16f, 18.608f, 16.019f, 18.659f, 16.056f)
                curveTo(18.71f, 16.092f, 18.749f, 16.143f, 18.77f, 16.202f)
                lineTo(19.019f, 16.966f)
                curveTo(19.096f, 17.199f, 19.226f, 17.41f, 19.4f, 17.584f)
                curveTo(19.573f, 17.757f, 19.785f, 17.887f, 20.017f, 17.965f)
                close()
            }
        }.build()

        return _ArrowTrendingSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingSparkle: ImageVector? = null

@Preview
@Composable
private fun ArrowTrendingSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTrendingSparkle, contentDescription = null)
    }
}
