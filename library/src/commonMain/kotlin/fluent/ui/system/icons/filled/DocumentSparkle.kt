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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DocumentSparkle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSparkle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(10.073f)
            curveTo(4.151f, 10.024f, 4.31f, 9.998f, 4.47f, 9.998f)
            curveTo(5.117f, 9.998f, 5.724f, 10.439f, 5.94f, 11.049f)
            lineTo(6.5f, 12.449f)
            curveTo(6.685f, 12.989f, 7.123f, 13.427f, 7.66f, 13.619f)
            curveTo(7.8f, 13.664f, 7.948f, 13.705f, 8.099f, 13.746f)
            curveTo(8.705f, 13.912f, 9.359f, 14.092f, 9.72f, 14.609f)
            curveTo(9.901f, 14.87f, 9.999f, 15.181f, 10f, 15.499f)
            curveTo(10.04f, 16.184f, 9.644f, 16.769f, 9f, 16.999f)
            curveTo(8.845f, 17.048f, 8.688f, 17.094f, 8.531f, 17.141f)
            curveTo(8.194f, 17.24f, 7.856f, 17.339f, 7.534f, 17.468f)
            curveTo(7.622f, 17.849f, 7.941f, 17.947f, 8.3f, 18f)
            horizontalLineTo(9f)
            verticalLineTo(18.115f)
            curveTo(9.099f, 18.144f, 9.191f, 18.183f, 9.27f, 18.239f)
            curveTo(9.494f, 18.401f, 9.661f, 18.628f, 9.75f, 18.889f)
            lineTo(10f, 19.649f)
            curveTo(10.04f, 19.814f, 10.167f, 19.953f, 10.33f, 19.999f)
            curveTo(10.41f, 20.029f, 10.491f, 20.057f, 10.571f, 20.086f)
            curveTo(11.299f, 20.343f, 11.96f, 20.577f, 11.96f, 21.549f)
            curveTo(11.96f, 21.704f, 11.933f, 21.857f, 11.879f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
            moveTo(3.088f, 17.412f)
            curveTo(3.016f, 17.319f, 2.938f, 17.23f, 2.854f, 17.146f)
            curveTo(2.542f, 16.833f, 2.161f, 16.597f, 1.741f, 16.457f)
            lineTo(0.363f, 16.009f)
            curveTo(0.257f, 15.972f, 0.165f, 15.903f, 0.1f, 15.811f)
            curveTo(0.035f, 15.719f, 0f, 15.609f, 0f, 15.497f)
            curveTo(0f, 15.384f, 0.035f, 15.274f, 0.1f, 15.182f)
            curveTo(0.165f, 15.091f, 0.257f, 15.021f, 0.363f, 14.984f)
            lineTo(1.741f, 14.536f)
            curveTo(2.155f, 14.394f, 2.53f, 14.157f, 2.837f, 13.845f)
            curveTo(3.136f, 13.542f, 3.362f, 13.176f, 3.5f, 12.774f)
            lineTo(3.511f, 12.74f)
            lineTo(3.959f, 11.363f)
            curveTo(3.997f, 11.257f, 4.066f, 11.165f, 4.158f, 11.1f)
            curveTo(4.25f, 11.035f, 4.36f, 11f, 4.472f, 11f)
            curveTo(4.585f, 11f, 4.695f, 11.035f, 4.787f, 11.1f)
            curveTo(4.879f, 11.165f, 4.948f, 11.257f, 4.986f, 11.363f)
            lineTo(5.433f, 12.74f)
            curveTo(5.573f, 13.158f, 5.808f, 13.538f, 6.12f, 13.85f)
            curveTo(6.432f, 14.162f, 6.813f, 14.397f, 7.231f, 14.536f)
            lineTo(8.609f, 14.984f)
            lineTo(8.637f, 14.991f)
            curveTo(8.743f, 15.028f, 8.835f, 15.097f, 8.9f, 15.189f)
            curveTo(8.965f, 15.281f, 9f, 15.391f, 9f, 15.503f)
            curveTo(9f, 15.616f, 8.965f, 15.726f, 8.9f, 15.818f)
            curveTo(8.835f, 15.909f, 8.743f, 15.979f, 8.637f, 16.016f)
            lineTo(7.259f, 16.464f)
            curveTo(6.84f, 16.603f, 6.46f, 16.838f, 6.147f, 17.15f)
            curveTo(5.835f, 17.462f, 5.6f, 17.842f, 5.461f, 18.26f)
            lineTo(5.013f, 19.637f)
            curveTo(5.009f, 19.649f, 5.005f, 19.66f, 5f, 19.671f)
            curveTo(4.961f, 19.763f, 4.896f, 19.842f, 4.814f, 19.9f)
            curveTo(4.722f, 19.965f, 4.613f, 20f, 4.5f, 20f)
            curveTo(4.387f, 20f, 4.278f, 19.965f, 4.186f, 19.9f)
            curveTo(4.094f, 19.835f, 4.024f, 19.743f, 3.987f, 19.637f)
            lineTo(3.539f, 18.26f)
            curveTo(3.438f, 17.953f, 3.285f, 17.667f, 3.088f, 17.412f)
            close()
            moveTo(10.783f, 21.213f)
            lineTo(10.017f, 20.965f)
            curveTo(9.785f, 20.887f, 9.573f, 20.757f, 9.4f, 20.584f)
            curveTo(9.227f, 20.41f, 9.096f, 20.199f, 9.019f, 19.966f)
            lineTo(8.77f, 19.202f)
            curveTo(8.749f, 19.143f, 8.71f, 19.092f, 8.659f, 19.056f)
            curveTo(8.608f, 19.019f, 8.547f, 19f, 8.485f, 19f)
            curveTo(8.422f, 19f, 8.361f, 19.019f, 8.31f, 19.056f)
            curveTo(8.259f, 19.092f, 8.22f, 19.143f, 8.2f, 19.202f)
            lineTo(7.951f, 19.966f)
            curveTo(7.875f, 20.197f, 7.747f, 20.408f, 7.576f, 20.581f)
            curveTo(7.405f, 20.754f, 7.197f, 20.885f, 6.967f, 20.965f)
            lineTo(6.202f, 21.213f)
            curveTo(6.143f, 21.234f, 6.092f, 21.272f, 6.056f, 21.324f)
            curveTo(6.019f, 21.375f, 6f, 21.436f, 6f, 21.498f)
            curveTo(6f, 21.561f, 6.019f, 21.622f, 6.056f, 21.673f)
            curveTo(6.092f, 21.724f, 6.143f, 21.762f, 6.202f, 21.783f)
            lineTo(6.967f, 22.032f)
            curveTo(7.2f, 22.109f, 7.412f, 22.24f, 7.585f, 22.414f)
            curveTo(7.759f, 22.588f, 7.889f, 22.8f, 7.966f, 23.034f)
            lineTo(8.215f, 23.798f)
            curveTo(8.236f, 23.857f, 8.274f, 23.908f, 8.325f, 23.944f)
            curveTo(8.376f, 23.981f, 8.437f, 24f, 8.5f, 24f)
            curveTo(8.563f, 24f, 8.624f, 23.981f, 8.675f, 23.944f)
            curveTo(8.726f, 23.908f, 8.764f, 23.857f, 8.785f, 23.798f)
            lineTo(9.034f, 23.034f)
            curveTo(9.111f, 22.801f, 9.242f, 22.59f, 9.415f, 22.416f)
            curveTo(9.589f, 22.243f, 9.8f, 22.113f, 10.033f, 22.035f)
            lineTo(10.798f, 21.787f)
            curveTo(10.857f, 21.766f, 10.908f, 21.728f, 10.944f, 21.676f)
            curveTo(10.981f, 21.625f, 11f, 21.564f, 11f, 21.502f)
            curveTo(11f, 21.439f, 10.981f, 21.378f, 10.944f, 21.327f)
            curveTo(10.908f, 21.276f, 10.857f, 21.238f, 10.798f, 21.217f)
            lineTo(10.783f, 21.213f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentSparkle, contentDescription = null)
    }
}
