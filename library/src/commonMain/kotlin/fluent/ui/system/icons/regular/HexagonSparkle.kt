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

public val FluentIcons.Regular.HexagonSparkle: ImageVector
    get() {
        if (_HexagonSparkle != null) {
            return _HexagonSparkle!!
        }
        _HexagonSparkle = ImageVector.Builder(
            name = "Regular.HexagonSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.088f, 6.412f)
                curveTo(15.016f, 6.319f, 14.938f, 6.23f, 14.854f, 6.146f)
                curveTo(14.542f, 5.833f, 14.161f, 5.597f, 13.741f, 5.457f)
                lineTo(12.363f, 5.009f)
                curveTo(12.257f, 4.972f, 12.165f, 4.903f, 12.1f, 4.811f)
                curveTo(12.035f, 4.719f, 12f, 4.609f, 12f, 4.497f)
                curveTo(12f, 4.384f, 12.035f, 4.274f, 12.1f, 4.182f)
                curveTo(12.165f, 4.091f, 12.257f, 4.021f, 12.363f, 3.984f)
                lineTo(13.741f, 3.536f)
                curveTo(14.155f, 3.394f, 14.53f, 3.157f, 14.837f, 2.845f)
                curveTo(15.136f, 2.542f, 15.362f, 2.176f, 15.5f, 1.774f)
                lineTo(15.511f, 1.74f)
                lineTo(15.959f, 0.363f)
                curveTo(15.997f, 0.257f, 16.066f, 0.165f, 16.158f, 0.1f)
                curveTo(16.25f, 0.035f, 16.36f, 0f, 16.472f, 0f)
                curveTo(16.585f, 0f, 16.695f, 0.035f, 16.787f, 0.1f)
                curveTo(16.879f, 0.165f, 16.948f, 0.257f, 16.986f, 0.363f)
                lineTo(17.434f, 1.74f)
                curveTo(17.573f, 2.158f, 17.808f, 2.539f, 18.12f, 2.85f)
                curveTo(18.432f, 3.162f, 18.813f, 3.397f, 19.232f, 3.536f)
                lineTo(20.609f, 3.984f)
                lineTo(20.637f, 3.991f)
                curveTo(20.743f, 4.028f, 20.835f, 4.097f, 20.9f, 4.189f)
                curveTo(20.965f, 4.281f, 21f, 4.391f, 21f, 4.503f)
                curveTo(21f, 4.616f, 20.965f, 4.726f, 20.9f, 4.818f)
                curveTo(20.835f, 4.909f, 20.743f, 4.979f, 20.637f, 5.016f)
                lineTo(19.259f, 5.464f)
                curveTo(18.84f, 5.603f, 18.459f, 5.838f, 18.147f, 6.15f)
                curveTo(17.835f, 6.461f, 17.6f, 6.842f, 17.461f, 7.26f)
                lineTo(17.013f, 8.637f)
                curveTo(17.009f, 8.649f, 17.005f, 8.66f, 17f, 8.671f)
                curveTo(16.961f, 8.763f, 16.896f, 8.842f, 16.814f, 8.9f)
                curveTo(16.722f, 8.965f, 16.613f, 9f, 16.5f, 9f)
                curveTo(16.387f, 9f, 16.278f, 8.965f, 16.186f, 8.9f)
                curveTo(16.094f, 8.835f, 16.024f, 8.743f, 15.987f, 8.637f)
                lineTo(15.539f, 7.26f)
                curveTo(15.438f, 6.953f, 15.285f, 6.667f, 15.088f, 6.412f)
                close()
                moveTo(22.783f, 10.213f)
                lineTo(22.017f, 9.965f)
                curveTo(21.785f, 9.887f, 21.573f, 9.757f, 21.4f, 9.584f)
                curveTo(21.226f, 9.41f, 21.096f, 9.199f, 21.019f, 8.966f)
                lineTo(20.77f, 8.202f)
                curveTo(20.749f, 8.143f, 20.71f, 8.092f, 20.659f, 8.056f)
                curveTo(20.608f, 8.019f, 20.547f, 8f, 20.485f, 8f)
                curveTo(20.422f, 8f, 20.361f, 8.019f, 20.31f, 8.056f)
                curveTo(20.259f, 8.092f, 20.22f, 8.143f, 20.2f, 8.202f)
                lineTo(19.951f, 8.966f)
                curveTo(19.875f, 9.197f, 19.747f, 9.408f, 19.576f, 9.581f)
                curveTo(19.406f, 9.754f, 19.197f, 9.885f, 18.967f, 9.965f)
                lineTo(18.202f, 10.213f)
                curveTo(18.143f, 10.234f, 18.092f, 10.273f, 18.056f, 10.324f)
                curveTo(18.019f, 10.375f, 18f, 10.436f, 18f, 10.498f)
                curveTo(18f, 10.561f, 18.019f, 10.622f, 18.056f, 10.673f)
                curveTo(18.092f, 10.724f, 18.143f, 10.762f, 18.202f, 10.783f)
                lineTo(18.967f, 11.032f)
                curveTo(19.2f, 11.109f, 19.412f, 11.24f, 19.586f, 11.414f)
                curveTo(19.759f, 11.588f, 19.889f, 11.8f, 19.966f, 12.033f)
                lineTo(20.215f, 12.798f)
                curveTo(20.236f, 12.857f, 20.274f, 12.908f, 20.325f, 12.944f)
                curveTo(20.376f, 12.981f, 20.437f, 13f, 20.5f, 13f)
                curveTo(20.563f, 13f, 20.624f, 12.981f, 20.675f, 12.944f)
                curveTo(20.726f, 12.908f, 20.764f, 12.857f, 20.785f, 12.798f)
                lineTo(21.034f, 12.033f)
                curveTo(21.111f, 11.801f, 21.242f, 11.59f, 21.415f, 11.416f)
                curveTo(21.589f, 11.243f, 21.8f, 11.113f, 22.033f, 11.035f)
                lineTo(22.798f, 10.787f)
                curveTo(22.857f, 10.766f, 22.908f, 10.727f, 22.944f, 10.676f)
                curveTo(22.981f, 10.625f, 23f, 10.564f, 23f, 10.502f)
                curveTo(23f, 10.439f, 22.981f, 10.378f, 22.944f, 10.327f)
                curveTo(22.908f, 10.276f, 22.857f, 10.238f, 22.798f, 10.217f)
                lineTo(22.783f, 10.213f)
                close()
                moveTo(17.844f, 19.875f)
                lineTo(21.523f, 13.5f)
                curveTo(21.306f, 13.822f, 20.996f, 14.05f, 20.5f, 14.05f)
                lineTo(20.48f, 14.049f)
                lineTo(20.46f, 14.05f)
                curveTo(20.107f, 14.05f, 19.847f, 13.933f, 19.647f, 13.749f)
                lineTo(16.545f, 19.125f)
                curveTo(16.411f, 19.357f, 16.163f, 19.5f, 15.895f, 19.5f)
                horizontalLineTo(8.105f)
                curveTo(7.837f, 19.5f, 7.59f, 19.357f, 7.456f, 19.125f)
                lineTo(3.56f, 12.375f)
                curveTo(3.426f, 12.143f, 3.426f, 11.857f, 3.56f, 11.625f)
                lineTo(7.456f, 4.875f)
                curveTo(7.59f, 4.643f, 7.837f, 4.5f, 8.105f, 4.5f)
                horizontalLineTo(11f)
                curveTo(11f, 4.49f, 11f, 4.479f, 11f, 4.469f)
                curveTo(11.002f, 3.804f, 11.424f, 3.224f, 12.047f, 3f)
                horizontalLineTo(8.105f)
                curveTo(7.301f, 3f, 6.559f, 3.429f, 6.157f, 4.125f)
                lineTo(2.261f, 10.875f)
                curveTo(1.86f, 11.571f, 1.86f, 12.429f, 2.261f, 13.125f)
                lineTo(6.157f, 19.875f)
                curveTo(6.559f, 20.571f, 7.301f, 21f, 8.105f, 21f)
                horizontalLineTo(15.895f)
                curveTo(16.699f, 21f, 17.442f, 20.571f, 17.844f, 19.875f)
                close()
            }
        }.build()

        return _HexagonSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonSparkle: ImageVector? = null

@Preview
@Composable
private fun HexagonSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HexagonSparkle, contentDescription = null)
    }
}
