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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextNumberFormat Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_number_format_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextNumberFormat icon.
 */
public val FluentIcons.Regular.TextNumberFormat: ImageVector
    get() {
        if (_textNumberFormat != null) {
            return _textNumberFormat!!
        }
        _textNumberFormat = Builder(name = "TextNumberFormat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.759f, 3.0f)
                lineTo(9.75f, 3.0f)
                curveTo(9.336f, 3.0f, 9.0f, 3.336f, 9.0f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(9.0f, 10.664f, 9.336f, 11.0f, 9.75f, 11.0f)
                lineTo(12.375f, 11.0f)
                curveTo(12.658f, 11.0f, 13.273f, 10.962f, 13.844f, 10.655f)
                curveTo(14.14f, 10.496f, 14.438f, 10.257f, 14.659f, 9.904f)
                curveTo(14.882f, 9.549f, 15.0f, 9.12f, 15.0f, 8.625f)
                curveTo(15.0f, 8.109f, 14.888f, 7.663f, 14.664f, 7.295f)
                curveTo(14.53f, 7.076f, 14.367f, 6.902f, 14.192f, 6.764f)
                curveTo(14.429f, 6.408f, 14.575f, 5.949f, 14.575f, 5.375f)
                curveTo(14.575f, 4.873f, 14.479f, 4.44f, 14.284f, 4.079f)
                curveTo(14.086f, 3.713f, 13.809f, 3.462f, 13.516f, 3.298f)
                curveTo(12.979f, 2.999f, 12.398f, 3.0f, 12.183f, 3.0f)
                lineTo(12.163f, 3.0f)
                horizontalLineTo(9.759f)
                close()
                moveTo(12.375f, 9.5f)
                horizontalLineTo(10.5f)
                lineTo(10.5f, 7.75f)
                horizontalLineTo(12.163f)
                lineTo(12.171f, 7.75f)
                horizontalLineTo(12.375f)
                curveTo(12.622f, 7.75f, 12.922f, 7.76f, 13.156f, 7.875f)
                curveTo(13.256f, 7.925f, 13.329f, 7.988f, 13.383f, 8.076f)
                curveTo(13.437f, 8.165f, 13.5f, 8.329f, 13.5f, 8.625f)
                curveTo(13.5f, 8.873f, 13.443f, 9.019f, 13.388f, 9.107f)
                curveTo(13.331f, 9.199f, 13.247f, 9.273f, 13.133f, 9.334f)
                curveTo(12.884f, 9.468f, 12.562f, 9.5f, 12.375f, 9.5f)
                close()
                moveTo(10.5f, 6.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(12.163f)
                curveTo(12.381f, 4.5f, 12.611f, 4.511f, 12.784f, 4.608f)
                curveTo(12.854f, 4.647f, 12.915f, 4.701f, 12.964f, 4.792f)
                curveTo(13.016f, 4.888f, 13.075f, 5.064f, 13.075f, 5.375f)
                curveTo(13.075f, 5.639f, 13.021f, 5.797f, 12.968f, 5.891f)
                curveTo(12.917f, 5.985f, 12.847f, 6.051f, 12.761f, 6.103f)
                curveTo(12.57f, 6.219f, 12.319f, 6.249f, 12.168f, 6.25f)
                horizontalLineTo(10.5f)
                close()
                moveTo(5.277f, 3.0f)
                curveTo(5.591f, 3.005f, 5.868f, 3.204f, 5.973f, 3.499f)
                lineTo(8.28f, 9.999f)
                curveTo(8.418f, 10.39f, 8.214f, 10.818f, 7.824f, 10.957f)
                curveTo(7.433f, 11.095f, 7.004f, 10.891f, 6.866f, 10.501f)
                lineTo(6.528f, 9.548f)
                lineTo(3.826f, 9.548f)
                lineTo(3.45f, 10.521f)
                curveTo(3.3f, 10.907f, 2.866f, 11.099f, 2.479f, 10.95f)
                curveTo(2.093f, 10.8f, 1.901f, 10.366f, 2.051f, 9.979f)
                lineTo(4.567f, 3.479f)
                curveTo(4.68f, 3.187f, 4.963f, 2.996f, 5.277f, 3.0f)
                close()
                moveTo(5.236f, 5.907f)
                lineTo(4.407f, 8.048f)
                lineTo(5.996f, 8.048f)
                lineTo(5.236f, 5.907f)
                close()
                moveTo(20.528f, 3.272f)
                curveTo(21.144f, 3.574f, 21.627f, 4.144f, 21.956f, 5.056f)
                curveTo(22.096f, 5.445f, 21.894f, 5.875f, 21.504f, 6.016f)
                curveTo(21.115f, 6.156f, 20.685f, 5.954f, 20.545f, 5.564f)
                curveTo(20.311f, 4.916f, 20.047f, 4.706f, 19.868f, 4.618f)
                curveTo(19.649f, 4.511f, 19.4f, 4.5f, 19.0f, 4.5f)
                curveTo(18.622f, 4.5f, 18.377f, 4.62f, 18.198f, 4.779f)
                curveTo(18.003f, 4.953f, 17.848f, 5.208f, 17.734f, 5.513f)
                curveTo(17.62f, 5.816f, 17.56f, 6.129f, 17.53f, 6.374f)
                curveTo(17.515f, 6.495f, 17.507f, 6.594f, 17.504f, 6.661f)
                curveTo(17.502f, 6.695f, 17.501f, 6.72f, 17.501f, 6.735f)
                lineTo(17.5f, 6.751f)
                curveTo(17.5f, 7.275f, 17.508f, 7.948f, 17.73f, 8.513f)
                curveTo(17.835f, 8.782f, 17.98f, 9.0f, 18.176f, 9.161f)
                curveTo(18.368f, 9.319f, 18.649f, 9.456f, 19.083f, 9.505f)
                curveTo(19.435f, 9.544f, 20.212f, 9.483f, 20.567f, 8.698f)
                curveTo(20.738f, 8.321f, 21.182f, 8.154f, 21.56f, 8.325f)
                curveTo(21.937f, 8.495f, 22.104f, 8.94f, 21.933f, 9.317f)
                curveTo(21.164f, 11.017f, 19.474f, 11.057f, 18.917f, 10.995f)
                curveTo(18.227f, 10.919f, 17.664f, 10.683f, 17.223f, 10.319f)
                curveTo(16.786f, 9.96f, 16.509f, 9.509f, 16.333f, 9.061f)
                curveTo(16.0f, 8.211f, 16.0f, 7.28f, 16.0f, 6.781f)
                lineTo(16.0f, 6.749f)
                lineTo(16.0f, 6.747f)
                lineTo(16.0f, 6.743f)
                lineTo(16.0f, 6.732f)
                lineTo(16.001f, 6.698f)
                curveTo(16.002f, 6.669f, 16.003f, 6.63f, 16.006f, 6.581f)
                curveTo(16.011f, 6.484f, 16.021f, 6.349f, 16.041f, 6.188f)
                curveTo(16.081f, 5.871f, 16.162f, 5.434f, 16.329f, 4.987f)
                curveTo(16.496f, 4.542f, 16.764f, 4.047f, 17.201f, 3.658f)
                curveTo(17.654f, 3.255f, 18.253f, 3.0f, 19.0f, 3.0f)
                lineTo(19.039f, 3.0f)
                curveTo(19.399f, 3.0f, 19.972f, 2.999f, 20.528f, 3.272f)
                close()
                moveTo(16.971f, 15.138f)
                curveTo(17.003f, 15.026f, 17.08f, 14.867f, 17.222f, 14.741f)
                curveTo(17.351f, 14.628f, 17.578f, 14.5f, 18.0f, 14.5f)
                curveTo(18.761f, 14.5f, 19.0f, 15.0f, 19.0f, 15.227f)
                curveTo(19.0f, 15.472f, 18.948f, 15.718f, 18.81f, 15.891f)
                curveTo(18.699f, 16.031f, 18.432f, 16.25f, 17.708f, 16.25f)
                curveTo(17.294f, 16.25f, 16.958f, 16.586f, 16.958f, 17.0f)
                curveTo(16.958f, 17.414f, 17.294f, 17.75f, 17.708f, 17.75f)
                curveTo(17.982f, 17.75f, 18.36f, 17.786f, 18.643f, 17.919f)
                curveTo(18.775f, 17.981f, 18.857f, 18.051f, 18.907f, 18.121f)
                curveTo(18.952f, 18.184f, 19.0f, 18.287f, 19.0f, 18.477f)
                curveTo(19.0f, 18.965f, 18.848f, 19.181f, 18.719f, 19.289f)
                curveTo(18.569f, 19.417f, 18.324f, 19.5f, 18.0f, 19.5f)
                curveTo(17.638f, 19.5f, 17.433f, 19.437f, 17.308f, 19.358f)
                curveTo(17.196f, 19.287f, 17.068f, 19.154f, 16.963f, 18.834f)
                curveTo(16.833f, 18.44f, 16.409f, 18.226f, 16.016f, 18.356f)
                curveTo(15.622f, 18.485f, 15.408f, 18.909f, 15.538f, 19.303f)
                curveTo(15.724f, 19.869f, 16.033f, 20.326f, 16.505f, 20.625f)
                curveTo(16.963f, 20.915f, 17.487f, 21.0f, 18.0f, 21.0f)
                curveTo(18.551f, 21.0f, 19.182f, 20.862f, 19.687f, 20.435f)
                curveTo(20.215f, 19.99f, 20.5f, 19.319f, 20.5f, 18.477f)
                curveTo(20.5f, 18.003f, 20.37f, 17.589f, 20.129f, 17.25f)
                curveTo(20.05f, 17.14f, 19.963f, 17.042f, 19.871f, 16.956f)
                curveTo(19.911f, 16.913f, 19.949f, 16.869f, 19.985f, 16.824f)
                curveTo(20.423f, 16.273f, 20.5f, 15.632f, 20.5f, 15.227f)
                curveTo(20.5f, 14.154f, 19.572f, 13.0f, 18.0f, 13.0f)
                curveTo(17.235f, 13.0f, 16.649f, 13.247f, 16.23f, 13.616f)
                curveTo(15.825f, 13.973f, 15.621f, 14.405f, 15.529f, 14.726f)
                curveTo(15.415f, 15.124f, 15.646f, 15.539f, 16.044f, 15.653f)
                curveTo(16.443f, 15.767f, 16.858f, 15.536f, 16.971f, 15.138f)
                close()
                moveTo(10.5f, 15.523f)
                curveTo(10.5f, 14.995f, 10.944f, 14.5f, 11.486f, 14.5f)
                curveTo(11.893f, 14.5f, 12.221f, 14.691f, 12.379f, 14.934f)
                curveTo(12.515f, 15.143f, 12.597f, 15.5f, 12.286f, 16.029f)
                curveTo(12.136f, 16.284f, 11.91f, 16.511f, 11.604f, 16.753f)
                curveTo(11.452f, 16.874f, 11.289f, 16.99f, 11.111f, 17.116f)
                lineTo(11.038f, 17.168f)
                curveTo(10.885f, 17.275f, 10.722f, 17.39f, 10.565f, 17.509f)
                curveTo(9.821f, 18.068f, 9.0f, 18.854f, 9.0f, 20.25f)
                curveTo(9.0f, 20.664f, 9.336f, 21.0f, 9.75f, 21.0f)
                lineTo(9.758f, 21.0f)
                lineTo(9.767f, 21.0f)
                horizontalLineTo(13.201f)
                curveTo(13.615f, 21.0f, 13.951f, 20.664f, 13.951f, 20.25f)
                curveTo(13.951f, 19.836f, 13.615f, 19.5f, 13.201f, 19.5f)
                horizontalLineTo(10.688f)
                curveTo(10.849f, 19.218f, 11.111f, 18.975f, 11.467f, 18.707f)
                curveTo(11.604f, 18.604f, 11.746f, 18.504f, 11.899f, 18.396f)
                lineTo(11.977f, 18.341f)
                curveTo(12.156f, 18.215f, 12.347f, 18.077f, 12.534f, 17.93f)
                curveTo(12.906f, 17.636f, 13.295f, 17.273f, 13.579f, 16.789f)
                curveTo(14.136f, 15.841f, 14.125f, 14.868f, 13.637f, 14.117f)
                curveTo(13.171f, 13.4f, 12.341f, 13.0f, 11.486f, 13.0f)
                curveTo(10.009f, 13.0f, 9.0f, 14.278f, 9.0f, 15.523f)
                curveTo(9.0f, 15.937f, 9.336f, 16.273f, 9.75f, 16.273f)
                curveTo(10.165f, 16.273f, 10.5f, 15.937f, 10.5f, 15.523f)
                close()
                moveTo(4.916f, 16.738f)
                curveTo(5.127f, 16.597f, 5.331f, 16.438f, 5.524f, 16.263f)
                verticalLineTo(20.25f)
                curveTo(5.524f, 20.664f, 5.859f, 21.0f, 6.274f, 21.0f)
                curveTo(6.688f, 21.0f, 7.024f, 20.664f, 7.024f, 20.25f)
                verticalLineTo(13.75f)
                curveTo(7.024f, 13.352f, 6.714f, 13.026f, 6.322f, 13.001f)
                curveTo(5.958f, 12.977f, 5.621f, 13.222f, 5.54f, 13.59f)
                curveTo(5.414f, 14.168f, 4.849f, 14.98f, 4.084f, 15.49f)
                curveTo(3.74f, 15.719f, 3.647f, 16.185f, 3.876f, 16.53f)
                curveTo(4.106f, 16.874f, 4.572f, 16.967f, 4.916f, 16.738f)
                close()
            }
        }
        .build()
        return _textNumberFormat!!
    }

@Suppress("ObjectPropertyName")
private var _textNumberFormat: ImageVector? = null

@Preview
@Composable
private fun TextNumberFormatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextNumberFormat, contentDescription = "TextNumberFormat Icon")
    }
}

