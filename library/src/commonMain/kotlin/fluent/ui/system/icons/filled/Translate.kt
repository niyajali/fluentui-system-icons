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

public val FluentIcons.Filled.Translate: ImageVector
    get() {
        if (_Translate != null) {
            return _Translate!!
        }
        _Translate = ImageVector.Builder(
            name = "Filled.Translate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.08f, 5.621f)
                curveTo(3.866f, 5.253f, 5.516f, 4.702f, 7.536f, 5.29f)
                lineTo(7.539f, 5.29f)
                curveTo(8.177f, 5.478f, 8.692f, 5.774f, 9.086f, 6.171f)
                curveTo(9.48f, 6.569f, 9.71f, 7.023f, 9.841f, 7.462f)
                curveTo(10.043f, 8.139f, 10.021f, 8.883f, 10.009f, 9.299f)
                curveTo(10.006f, 9.379f, 10.004f, 9.447f, 10.004f, 9.5f)
                verticalLineTo(15.003f)
                curveTo(10.004f, 15.555f, 9.556f, 16.003f, 9.004f, 16.003f)
                curveTo(8.55f, 16.003f, 8.166f, 15.7f, 8.044f, 15.285f)
                curveTo(8.018f, 15.298f, 7.991f, 15.311f, 7.964f, 15.324f)
                curveTo(7f, 15.786f, 5.567f, 16.245f, 4.087f, 15.83f)
                curveTo(2.454f, 15.374f, 1.634f, 14.021f, 1.515f, 12.695f)
                curveTo(1.401f, 11.415f, 1.926f, 9.959f, 3.197f, 9.247f)
                curveTo(4.726f, 8.392f, 6.313f, 8.408f, 7.459f, 8.607f)
                curveTo(7.655f, 8.641f, 7.841f, 8.68f, 8.014f, 8.723f)
                curveTo(8.011f, 8.48f, 7.991f, 8.258f, 7.924f, 8.034f)
                curveTo(7.87f, 7.85f, 7.788f, 7.703f, 7.666f, 7.58f)
                curveTo(7.545f, 7.458f, 7.341f, 7.317f, 6.977f, 7.21f)
                curveTo(5.587f, 6.806f, 4.458f, 7.184f, 3.928f, 7.432f)
                curveTo(3.428f, 7.666f, 2.832f, 7.451f, 2.598f, 6.95f)
                curveTo(2.364f, 6.45f, 2.58f, 5.855f, 3.08f, 5.621f)
                close()
                moveTo(7.117f, 10.577f)
                curveTo(6.233f, 10.424f, 5.161f, 10.44f, 4.174f, 10.993f)
                curveTo(3.75f, 11.23f, 3.445f, 11.822f, 3.507f, 12.516f)
                curveTo(3.565f, 13.163f, 3.928f, 13.709f, 4.626f, 13.905f)
                curveTo(5.417f, 14.126f, 6.307f, 13.901f, 7.099f, 13.52f)
                curveTo(7.466f, 13.344f, 7.779f, 13.151f, 8.004f, 12.997f)
                verticalLineTo(10.799f)
                curveTo(7.764f, 10.72f, 7.461f, 10.637f, 7.117f, 10.577f)
                close()
                moveTo(16.303f, 7.047f)
                curveTo(16.829f, 7.215f, 17.12f, 7.777f, 16.952f, 8.303f)
                curveTo(16.897f, 8.478f, 16.845f, 8.678f, 16.798f, 8.887f)
                curveTo(17.476f, 8.801f, 18.139f, 8.681f, 18.761f, 8.529f)
                curveTo(19.298f, 8.397f, 19.839f, 8.726f, 19.971f, 9.262f)
                curveTo(20.102f, 9.798f, 19.774f, 10.34f, 19.238f, 10.471f)
                curveTo(18.34f, 10.691f, 17.373f, 10.85f, 16.396f, 10.944f)
                curveTo(16.332f, 11.282f, 16.277f, 11.603f, 16.23f, 11.908f)
                curveTo(16.856f, 11.766f, 17.459f, 11.725f, 18.026f, 11.77f)
                curveTo(18.13f, 11.329f, 18.526f, 11f, 19f, 11f)
                curveTo(19.552f, 11f, 20f, 11.448f, 20f, 12f)
                curveTo(20f, 12.11f, 19.997f, 12.218f, 19.994f, 12.326f)
                curveTo(20.926f, 12.811f, 21.658f, 13.573f, 22.097f, 14.49f)
                curveTo(22.6f, 15.541f, 22.702f, 16.778f, 22.268f, 17.955f)
                curveTo(21.832f, 19.137f, 20.887f, 20.174f, 19.447f, 20.894f)
                curveTo(18.953f, 21.141f, 18.352f, 20.941f, 18.105f, 20.447f)
                curveTo(17.858f, 19.953f, 18.058f, 19.353f, 18.552f, 19.106f)
                curveTo(19.612f, 18.576f, 20.158f, 17.896f, 20.391f, 17.263f)
                curveTo(20.627f, 16.624f, 20.577f, 15.947f, 20.293f, 15.353f)
                curveTo(20.142f, 15.038f, 19.92f, 14.74f, 19.635f, 14.489f)
                curveTo(19.102f, 16.241f, 18.048f, 17.618f, 16.9f, 18.549f)
                curveTo(16.913f, 18.586f, 16.927f, 18.625f, 16.941f, 18.663f)
                curveTo(17.127f, 19.183f, 16.856f, 19.756f, 16.336f, 19.942f)
                curveTo(15.911f, 20.094f, 15.45f, 19.94f, 15.195f, 19.594f)
                curveTo(14.861f, 19.737f, 14.529f, 19.845f, 14.207f, 19.914f)
                curveTo(13.412f, 20.083f, 12.383f, 20.062f, 11.708f, 19.325f)
                curveTo(10.768f, 18.299f, 10.844f, 16.726f, 11.468f, 15.443f)
                curveTo(11.963f, 14.426f, 12.842f, 13.458f, 14.106f, 12.742f)
                curveTo(14.16f, 12.22f, 14.239f, 11.657f, 14.345f, 11.045f)
                curveTo(13.863f, 11.046f, 13.388f, 11.03f, 12.928f, 10.998f)
                curveTo(12.377f, 10.958f, 11.963f, 10.48f, 12.002f, 9.929f)
                curveTo(12.041f, 9.378f, 12.52f, 8.963f, 13.071f, 9.003f)
                curveTo(13.602f, 9.04f, 14.158f, 9.053f, 14.723f, 9.04f)
                curveTo(14.811f, 8.595f, 14.923f, 8.086f, 15.047f, 7.697f)
                curveTo(15.214f, 7.171f, 15.776f, 6.88f, 16.303f, 7.047f)
                close()
                moveTo(14.025f, 15.281f)
                curveTo(13.681f, 15.621f, 13.432f, 15.978f, 13.267f, 16.318f)
                curveTo(12.843f, 17.189f, 13.01f, 17.769f, 13.172f, 17.963f)
                lineTo(13.175f, 17.964f)
                curveTo(13.202f, 17.976f, 13.361f, 18.049f, 13.79f, 17.958f)
                curveTo(13.993f, 17.915f, 14.221f, 17.84f, 14.464f, 17.731f)
                curveTo(14.33f, 17.302f, 14.206f, 16.813f, 14.123f, 16.253f)
                curveTo(14.078f, 15.951f, 14.045f, 15.628f, 14.025f, 15.281f)
                close()
                moveTo(16.197f, 16.485f)
                curveTo(16.875f, 15.786f, 17.457f, 14.868f, 17.765f, 13.755f)
                lineTo(16.114f, 14.02f)
                curveTo(16.08f, 14.032f, 16.047f, 14.044f, 16.014f, 14.056f)
                curveTo(15.985f, 14.829f, 16.025f, 15.448f, 16.101f, 15.96f)
                curveTo(16.129f, 16.148f, 16.161f, 16.322f, 16.197f, 16.485f)
                close()
            }
        }.build()

        return _Translate!!
    }

@Suppress("ObjectPropertyName")
private var _Translate: ImageVector? = null

@Preview
@Composable
private fun TranslatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Translate, contentDescription = null)
    }
}
