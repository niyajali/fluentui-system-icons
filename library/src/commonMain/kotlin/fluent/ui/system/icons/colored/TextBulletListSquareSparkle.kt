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

public val FluentUi.Colored.TextBulletListSquareSparkle: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.TextBulletListSquareSparkle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.643f, 6.375f),
                end = Offset(16.065f, 19.281f)
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(8.817f, 7.981f),
                end = Offset(15.189f, 25.449f)
            )
        ) {
            moveTo(7.75f, 9.25f)
            curveTo(8.302f, 9.25f, 8.75f, 8.802f, 8.75f, 8.25f)
            curveTo(8.75f, 7.698f, 8.302f, 7.25f, 7.75f, 7.25f)
            curveTo(7.198f, 7.25f, 6.75f, 7.698f, 6.75f, 8.25f)
            curveTo(6.75f, 8.802f, 7.198f, 9.25f, 7.75f, 9.25f)
            close()
            moveTo(11.25f, 7.5f)
            curveTo(10.836f, 7.5f, 10.5f, 7.836f, 10.5f, 8.25f)
            curveTo(10.5f, 8.664f, 10.836f, 9f, 11.25f, 9f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 9f, 17.5f, 8.664f, 17.5f, 8.25f)
            curveTo(17.5f, 7.836f, 17.164f, 7.5f, 16.75f, 7.5f)
            horizontalLineTo(11.25f)
            close()
            moveTo(11.25f, 11.25f)
            curveTo(10.836f, 11.25f, 10.5f, 11.586f, 10.5f, 12f)
            curveTo(10.5f, 12.414f, 10.836f, 12.75f, 11.25f, 12.75f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 12.75f, 17.5f, 12.414f, 17.5f, 12f)
            curveTo(17.5f, 11.586f, 17.164f, 11.25f, 16.75f, 11.25f)
            horizontalLineTo(11.25f)
            close()
            moveTo(10.5f, 15.75f)
            curveTo(10.5f, 16.164f, 10.836f, 16.5f, 11.25f, 16.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 16.5f, 17.5f, 16.164f, 17.5f, 15.75f)
            curveTo(17.5f, 15.336f, 17.164f, 15f, 16.75f, 15f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 15f, 10.5f, 15.336f, 10.5f, 15.75f)
            close()
            moveTo(8.75f, 12f)
            curveTo(8.75f, 11.448f, 8.302f, 11f, 7.75f, 11f)
            curveTo(7.198f, 11f, 6.75f, 11.448f, 6.75f, 12f)
            curveTo(6.75f, 12.552f, 7.198f, 13f, 7.75f, 13f)
            curveTo(8.302f, 13f, 8.75f, 12.552f, 8.75f, 12f)
            close()
            moveTo(7.75f, 16.75f)
            curveTo(8.302f, 16.75f, 8.75f, 16.302f, 8.75f, 15.75f)
            curveTo(8.75f, 15.198f, 8.302f, 14.75f, 7.75f, 14.75f)
            curveTo(7.198f, 14.75f, 6.75f, 15.198f, 6.75f, 15.75f)
            curveTo(6.75f, 16.302f, 7.198f, 16.75f, 7.75f, 16.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(20.438f, 10.875f),
                radius = 4.098f
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(16.54f, 4.446f),
                radius = 5.665f
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(16.54f, 4.446f),
                radius = 5.987f
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(20.317f, 11.277f),
                radius = 2.729f
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.718f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505)
                ),
                center = Offset(9.375f, -10.813f),
                radius = 28.614f
            )
        ) {
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
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.698f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505)
                ),
                center = Offset(0.83f, -22.661f),
                radius = 38.697f
            )
        ) {
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
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListSquareSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.TextBulletListSquareSparkle, contentDescription = null)
    }
}
