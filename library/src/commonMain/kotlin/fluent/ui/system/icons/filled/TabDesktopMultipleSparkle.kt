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

public val FluentIcons.Filled.TabDesktopMultipleSparkle: ImageVector
    get() {
        if (_TabDesktopMultipleSparkle != null) {
            return _TabDesktopMultipleSparkle!!
        }
        _TabDesktopMultipleSparkle = ImageVector.Builder(
            name = "Filled.TabDesktopMultipleSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.001f, 11.827f)
                lineTo(19.074f, 11.845f)
                curveTo(19.434f, 11.936f, 19.864f, 12.046f, 19.98f, 12.399f)
                lineTo(19.994f, 12.444f)
                curveTo(20.23f, 13.193f, 20.5f, 14.05f, 21.46f, 14.05f)
                curveTo(21.672f, 14.05f, 21.851f, 14.008f, 22.002f, 13.935f)
                verticalLineTo(17.25f)
                curveTo(22.002f, 19.873f, 19.876f, 22f, 17.252f, 22f)
                horizontalLineTo(9.252f)
                curveTo(7.541f, 22f, 6.139f, 20.678f, 6.012f, 19f)
                horizontalLineTo(14.751f)
                curveTo(17.098f, 19f, 19.001f, 17.097f, 19.001f, 14.75f)
                verticalLineTo(11.827f)
                close()
                moveTo(18f, 14.75f)
                curveTo(18f, 16.545f, 16.545f, 18f, 14.75f, 18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.25f)
                curveTo(8.5f, 6.493f, 9.507f, 7.5f, 10.75f, 7.5f)
                horizontalLineTo(15.573f)
                curveTo(15.579f, 7.516f, 15.585f, 7.533f, 15.59f, 7.549f)
                lineTo(16f, 8.999f)
                curveTo(16.213f, 9.622f, 16.801f, 10.047f, 17.46f, 10.049f)
                curveTo(17.645f, 10.051f, 17.828f, 10.018f, 18f, 9.952f)
                curveTo(18f, 11.547f, 18f, 13.149f, 18f, 14.75f)
                close()
                moveTo(13.003f, 6f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 6f, 10f, 5.664f, 10f, 5.25f)
                verticalLineTo(2f)
                horizontalLineTo(14.75f)
                curveTo(14.897f, 2f, 15.042f, 2.01f, 15.183f, 2.029f)
                curveTo(14.972f, 2.27f, 14.696f, 2.456f, 14.39f, 2.559f)
                lineTo(13.05f, 2.999f)
                curveTo(12.425f, 3.222f, 12.002f, 3.803f, 12f, 4.469f)
                curveTo(12.002f, 5.104f, 12.416f, 5.746f, 13f, 5.999f)
                lineTo(13.003f, 6f)
                close()
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
            }
        }.build()

        return _TabDesktopMultipleSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopMultipleSparkle: ImageVector? = null

@Preview
@Composable
private fun TabDesktopMultipleSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktopMultipleSparkle, contentDescription = null)
    }
}
