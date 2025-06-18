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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.SparkleInfo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SparkleInfo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.083f, 12.076f)
            curveTo(9.423f, 11.639f, 8.679f, 11.32f, 7.88f, 11.147f)
            lineTo(7.866f, 11.133f)
            curveTo(7.55f, 10.815f, 7.163f, 10.575f, 6.737f, 10.433f)
            lineTo(4.983f, 9.864f)
            curveTo(4.694f, 9.766f, 4.443f, 9.579f, 4.266f, 9.33f)
            curveTo(4.137f, 9.147f, 4.051f, 8.937f, 4.016f, 8.716f)
            curveTo(3.982f, 8.495f, 3.999f, 8.269f, 4.067f, 8.055f)
            curveTo(4.135f, 7.842f, 4.251f, 7.647f, 4.408f, 7.486f)
            curveTo(4.564f, 7.326f, 4.755f, 7.204f, 4.966f, 7.13f)
            lineTo(6.743f, 6.559f)
            curveTo(7.154f, 6.415f, 7.527f, 6.179f, 7.834f, 5.87f)
            curveTo(8.14f, 5.56f, 8.373f, 5.185f, 8.513f, 4.773f)
            lineTo(9.096f, 2.981f)
            curveTo(9.193f, 2.696f, 9.375f, 2.449f, 9.618f, 2.273f)
            curveTo(9.862f, 2.096f, 10.154f, 2.001f, 10.455f, 1.998f)
            curveTo(10.755f, 1.996f, 11.049f, 2.087f, 11.295f, 2.259f)
            curveTo(11.541f, 2.431f, 11.727f, 2.676f, 11.828f, 2.959f)
            lineTo(12.406f, 4.736f)
            curveTo(12.547f, 5.161f, 12.785f, 5.546f, 13.102f, 5.863f)
            curveTo(13.418f, 6.179f, 13.804f, 6.418f, 14.228f, 6.559f)
            lineTo(15.983f, 7.129f)
            curveTo(16.273f, 7.219f, 16.528f, 7.397f, 16.71f, 7.64f)
            curveTo(16.893f, 7.883f, 16.994f, 8.177f, 17f, 8.48f)
            curveTo(17.006f, 8.784f, 16.915f, 9.081f, 16.742f, 9.331f)
            curveTo(16.569f, 9.58f, 16.322f, 9.768f, 16.035f, 9.869f)
            lineTo(14.257f, 10.447f)
            curveTo(13.835f, 10.587f, 13.45f, 10.824f, 13.135f, 11.139f)
            curveTo(12.82f, 11.453f, 12.582f, 11.837f, 12.44f, 12.259f)
            lineTo(11.905f, 13.888f)
            curveTo(11.582f, 13.406f, 11.197f, 12.97f, 10.761f, 12.591f)
            lineTo(11.02f, 11.794f)
            curveTo(11.235f, 11.147f, 11.597f, 10.56f, 12.079f, 10.078f)
            curveTo(12.561f, 9.596f, 13.148f, 9.234f, 13.794f, 9.019f)
            lineTo(15.383f, 8.504f)
            lineTo(13.764f, 7.982f)
            curveTo(13.117f, 7.768f, 12.528f, 7.406f, 12.045f, 6.925f)
            curveTo(11.562f, 6.444f, 11.199f, 5.856f, 10.983f, 5.209f)
            lineTo(10.467f, 3.622f)
            lineTo(9.952f, 5.204f)
            curveTo(9.739f, 5.845f, 9.383f, 6.429f, 8.911f, 6.912f)
            curveTo(8.437f, 7.392f, 7.859f, 7.756f, 7.221f, 7.977f)
            lineTo(5.61f, 8.501f)
            lineTo(7.21f, 9.009f)
            curveTo(7.859f, 9.225f, 8.447f, 9.589f, 8.93f, 10.072f)
            horizontalLineTo(8.927f)
            curveTo(9.058f, 10.201f, 9.179f, 10.339f, 9.29f, 10.485f)
            curveTo(9.596f, 10.877f, 9.833f, 11.319f, 9.99f, 11.791f)
            lineTo(10.083f, 12.076f)
            close()
            moveTo(17.331f, 19.782f)
            curveTo(17.14f, 19.646f, 16.997f, 19.454f, 16.921f, 19.233f)
            lineTo(16.593f, 18.226f)
            curveTo(16.529f, 18.034f, 16.422f, 17.86f, 16.28f, 17.717f)
            curveTo(16.138f, 17.574f, 15.964f, 17.466f, 15.772f, 17.403f)
            lineTo(14.781f, 17.08f)
            curveTo(14.551f, 17.003f, 14.351f, 16.854f, 14.21f, 16.656f)
            curveTo(14.073f, 16.464f, 13.999f, 16.233f, 14f, 15.997f)
            curveTo(14f, 15.759f, 14.075f, 15.527f, 14.213f, 15.334f)
            curveTo(14.35f, 15.139f, 14.546f, 14.993f, 14.771f, 14.917f)
            lineTo(15.777f, 14.591f)
            curveTo(15.964f, 14.524f, 16.133f, 14.416f, 16.272f, 14.274f)
            curveTo(16.411f, 14.132f, 16.515f, 13.96f, 16.577f, 13.772f)
            lineTo(16.901f, 12.78f)
            curveTo(16.977f, 12.556f, 17.121f, 12.361f, 17.313f, 12.222f)
            curveTo(17.505f, 12.083f, 17.735f, 12.007f, 17.972f, 12.005f)
            curveTo(18.209f, 12.002f, 18.441f, 12.074f, 18.635f, 12.209f)
            curveTo(18.83f, 12.344f, 18.977f, 12.536f, 19.058f, 12.759f)
            lineTo(19.387f, 13.773f)
            curveTo(19.451f, 13.963f, 19.559f, 14.136f, 19.701f, 14.277f)
            curveTo(19.844f, 14.419f, 20.017f, 14.525f, 20.207f, 14.589f)
            lineTo(21.199f, 14.912f)
            curveTo(21.428f, 14.983f, 21.628f, 15.125f, 21.772f, 15.317f)
            curveTo(21.915f, 15.509f, 21.995f, 15.741f, 21.999f, 15.98f)
            curveTo(22.004f, 16.22f, 21.932f, 16.455f, 21.796f, 16.652f)
            curveTo(21.659f, 16.848f, 21.464f, 16.997f, 21.238f, 17.077f)
            lineTo(20.224f, 17.406f)
            curveTo(20.034f, 17.471f, 19.861f, 17.578f, 19.719f, 17.72f)
            curveTo(19.577f, 17.863f, 19.469f, 18.037f, 19.406f, 18.228f)
            lineTo(19.084f, 19.217f)
            curveTo(19.007f, 19.447f, 18.858f, 19.647f, 18.659f, 19.787f)
            curveTo(18.467f, 19.925f, 18.236f, 19.999f, 18f, 19.999f)
            curveTo(17.76f, 19.999f, 17.526f, 19.923f, 17.331f, 19.782f)
            close()
            moveTo(16.3f, 15.999f)
            curveTo(16.693f, 16.139f, 17.05f, 16.365f, 17.344f, 16.66f)
            curveTo(17.638f, 16.956f, 17.862f, 17.314f, 18f, 17.708f)
            curveTo(18.139f, 17.316f, 18.364f, 16.96f, 18.658f, 16.666f)
            curveTo(18.952f, 16.372f, 19.308f, 16.147f, 19.7f, 16.008f)
            curveTo(19.302f, 15.868f, 18.94f, 15.641f, 18.641f, 15.343f)
            curveTo(18.346f, 15.049f, 18.121f, 14.693f, 17.982f, 14.3f)
            curveTo(17.844f, 14.69f, 17.621f, 15.044f, 17.33f, 15.338f)
            curveTo(17.04f, 15.632f, 16.688f, 15.857f, 16.3f, 15.999f)
            close()
            moveTo(6.5f, 16.5f)
            curveTo(7.052f, 16.5f, 7.5f, 16.052f, 7.5f, 15.5f)
            curveTo(7.5f, 14.948f, 7.052f, 14.5f, 6.5f, 14.5f)
            curveTo(5.948f, 14.5f, 5.5f, 14.948f, 5.5f, 15.5f)
            curveTo(5.5f, 16.052f, 5.948f, 16.5f, 6.5f, 16.5f)
            close()
            moveTo(6.5f, 17.25f)
            curveTo(6.914f, 17.25f, 7.25f, 17.586f, 7.25f, 18f)
            verticalLineTo(19.75f)
            curveTo(7.25f, 20.164f, 6.914f, 20.5f, 6.5f, 20.5f)
            curveTo(6.086f, 20.5f, 5.75f, 20.164f, 5.75f, 19.75f)
            verticalLineTo(18f)
            curveTo(5.75f, 17.586f, 6.086f, 17.25f, 6.5f, 17.25f)
            close()
            moveTo(6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            close()
            moveTo(6.5f, 21.5f)
            curveTo(4.291f, 21.5f, 2.5f, 19.709f, 2.5f, 17.5f)
            curveTo(2.5f, 15.291f, 4.291f, 13.5f, 6.5f, 13.5f)
            curveTo(8.709f, 13.5f, 10.5f, 15.291f, 10.5f, 17.5f)
            curveTo(10.5f, 19.709f, 8.709f, 21.5f, 6.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SparkleInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SparkleInfo, contentDescription = null)
    }
}
