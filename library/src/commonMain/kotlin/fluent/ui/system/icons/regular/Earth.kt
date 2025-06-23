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

public val FluentIcons.Regular.Earth: ImageVector
    get() {
        if (_Earth != null) {
            return _Earth!!
        }
        _Earth = ImageVector.Builder(
            name = "Regular.Earth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.946f, 2.047f)
                lineTo(10.95f, 2.054f)
                curveTo(11.295f, 2.018f, 11.646f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(8.791f, 22f, 5.935f, 20.488f, 4.105f, 18.138f)
                lineTo(4.102f, 18.137f)
                lineTo(4.103f, 18.135f)
                curveTo(2.785f, 16.441f, 2f, 14.312f, 2f, 12f)
                curveTo(2f, 6.838f, 5.911f, 2.59f, 10.932f, 2.056f)
                lineTo(10.946f, 2.047f)
                close()
                moveTo(12f, 3.5f)
                curveTo(11.947f, 3.5f, 11.894f, 3.5f, 11.841f, 3.501f)
                curveTo(11.963f, 3.746f, 12.095f, 4.034f, 12.215f, 4.352f)
                curveTo(12.561f, 5.274f, 12.88f, 6.633f, 12.314f, 7.838f)
                curveTo(11.792f, 8.951f, 10.89f, 9.239f, 10.224f, 9.411f)
                lineTo(10.14f, 9.432f)
                curveTo(9.483f, 9.602f, 9.231f, 9.667f, 9.047f, 9.946f)
                curveTo(8.878f, 10.203f, 8.903f, 10.528f, 9.108f, 11.196f)
                curveTo(9.123f, 11.243f, 9.138f, 11.292f, 9.154f, 11.344f)
                curveTo(9.236f, 11.602f, 9.333f, 11.914f, 9.384f, 12.207f)
                curveTo(9.448f, 12.571f, 9.466f, 13.034f, 9.232f, 13.482f)
                curveTo(9.001f, 13.926f, 8.694f, 14.229f, 8.331f, 14.427f)
                curveTo(7.991f, 14.612f, 7.638f, 14.683f, 7.374f, 14.729f)
                lineTo(7.281f, 14.746f)
                curveTo(6.766f, 14.836f, 6.52f, 14.88f, 6.28f, 15.137f)
                curveTo(6.094f, 15.336f, 5.974f, 15.689f, 5.904f, 16.215f)
                curveTo(5.875f, 16.429f, 5.858f, 16.642f, 5.84f, 16.861f)
                lineTo(5.831f, 16.978f)
                curveTo(5.811f, 17.221f, 5.786f, 17.499f, 5.731f, 17.739f)
                lineTo(5.731f, 17.74f)
                curveTo(7.285f, 19.436f, 9.518f, 20.5f, 12f, 20.5f)
                curveTo(13.577f, 20.5f, 15.054f, 20.07f, 16.32f, 19.322f)
                curveTo(16.221f, 19.222f, 16.115f, 19.104f, 16.009f, 18.972f)
                curveTo(15.67f, 18.544f, 15.224f, 17.808f, 15.379f, 16.939f)
                curveTo(15.453f, 16.521f, 15.677f, 16.171f, 15.894f, 15.903f)
                curveTo(16.114f, 15.63f, 16.38f, 15.377f, 16.613f, 15.163f)
                curveTo(16.669f, 15.112f, 16.722f, 15.063f, 16.772f, 15.017f)
                curveTo(16.951f, 14.854f, 17.102f, 14.716f, 17.232f, 14.58f)
                curveTo(17.404f, 14.399f, 17.442f, 14.318f, 17.444f, 14.313f)
                curveTo(17.512f, 14.089f, 17.428f, 13.929f, 17.338f, 13.859f)
                curveTo(17.292f, 13.824f, 17.231f, 13.798f, 17.148f, 13.798f)
                curveTo(17.064f, 13.797f, 16.928f, 13.822f, 16.747f, 13.937f)
                curveTo(16.537f, 14.07f, 16.232f, 14.152f, 15.911f, 14.023f)
                curveTo(15.644f, 13.915f, 15.496f, 13.709f, 15.425f, 13.591f)
                curveTo(15.281f, 13.354f, 15.2f, 13.045f, 15.147f, 12.819f)
                curveTo(15.106f, 12.645f, 15.068f, 12.447f, 15.032f, 12.266f)
                curveTo(15.018f, 12.194f, 15.005f, 12.124f, 14.992f, 12.06f)
                curveTo(14.941f, 11.81f, 14.899f, 11.632f, 14.858f, 11.521f)
                curveTo(14.857f, 11.519f, 14.852f, 11.507f, 14.838f, 11.483f)
                curveTo(14.824f, 11.455f, 14.803f, 11.421f, 14.774f, 11.378f)
                curveTo(14.716f, 11.289f, 14.641f, 11.186f, 14.547f, 11.061f)
                curveTo(14.512f, 11.016f, 14.476f, 10.968f, 14.437f, 10.918f)
                curveTo(14.276f, 10.706f, 14.084f, 10.455f, 13.921f, 10.206f)
                curveTo(13.725f, 9.908f, 13.504f, 9.518f, 13.434f, 9.102f)
                curveTo(13.397f, 8.881f, 13.398f, 8.627f, 13.489f, 8.368f)
                curveTo(13.583f, 8.104f, 13.754f, 7.886f, 13.976f, 7.719f)
                curveTo(14.459f, 7.357f, 15.169f, 6.547f, 15.799f, 5.76f)
                curveTo(16.087f, 5.401f, 16.344f, 5.065f, 16.535f, 4.809f)
                curveTo(15.222f, 3.98f, 13.667f, 3.5f, 12f, 3.5f)
                close()
                moveTo(17.728f, 5.719f)
                curveTo(17.53f, 5.983f, 17.266f, 6.328f, 16.97f, 6.698f)
                curveTo(16.368f, 7.449f, 15.57f, 8.383f, 14.92f, 8.885f)
                curveTo(14.946f, 8.984f, 15.021f, 9.147f, 15.175f, 9.383f)
                curveTo(15.306f, 9.583f, 15.456f, 9.779f, 15.614f, 9.987f)
                curveTo(15.657f, 10.043f, 15.7f, 10.1f, 15.744f, 10.158f)
                curveTo(15.916f, 10.386f, 16.155f, 10.705f, 16.265f, 11.001f)
                curveTo(16.351f, 11.235f, 16.413f, 11.52f, 16.462f, 11.763f)
                curveTo(16.479f, 11.849f, 16.495f, 11.93f, 16.511f, 12.009f)
                curveTo(16.536f, 12.14f, 16.56f, 12.262f, 16.585f, 12.379f)
                curveTo(17.187f, 12.207f, 17.787f, 12.311f, 18.255f, 12.673f)
                curveTo(18.864f, 13.143f, 19.118f, 13.959f, 18.88f, 14.747f)
                curveTo(18.771f, 15.109f, 18.516f, 15.407f, 18.317f, 15.616f)
                curveTo(18.148f, 15.793f, 17.945f, 15.978f, 17.761f, 16.145f)
                curveTo(17.716f, 16.187f, 17.671f, 16.227f, 17.629f, 16.266f)
                curveTo(17.399f, 16.478f, 17.206f, 16.666f, 17.061f, 16.845f)
                curveTo(16.913f, 17.029f, 16.866f, 17.144f, 16.856f, 17.201f)
                curveTo(16.817f, 17.42f, 16.923f, 17.711f, 17.184f, 18.039f)
                curveTo(17.302f, 18.188f, 17.428f, 18.313f, 17.525f, 18.402f)
                curveTo(17.537f, 18.412f, 17.548f, 18.422f, 17.558f, 18.431f)
                curveTo(19.36f, 16.872f, 20.5f, 14.569f, 20.5f, 12f)
                curveTo(20.5f, 9.512f, 19.431f, 7.274f, 17.728f, 5.719f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 13.398f, 3.838f, 14.718f, 4.436f, 15.881f)
                curveTo(4.521f, 15.324f, 4.698f, 14.633f, 5.184f, 14.113f)
                curveTo(5.783f, 13.471f, 6.519f, 13.35f, 6.982f, 13.274f)
                curveTo(7.028f, 13.267f, 7.072f, 13.26f, 7.112f, 13.252f)
                curveTo(7.36f, 13.208f, 7.503f, 13.17f, 7.614f, 13.109f)
                curveTo(7.702f, 13.061f, 7.802f, 12.982f, 7.902f, 12.789f)
                curveTo(7.917f, 12.76f, 7.944f, 12.682f, 7.906f, 12.464f)
                curveTo(7.874f, 12.278f, 7.813f, 12.083f, 7.734f, 11.828f)
                curveTo(7.715f, 11.767f, 7.695f, 11.703f, 7.674f, 11.636f)
                curveTo(7.489f, 11.032f, 7.193f, 10.033f, 7.794f, 9.121f)
                curveTo(8.316f, 8.329f, 9.155f, 8.127f, 9.687f, 7.998f)
                curveTo(9.745f, 7.984f, 9.799f, 7.971f, 9.849f, 7.958f)
                curveTo(10.412f, 7.813f, 10.732f, 7.678f, 10.957f, 7.2f)
                curveTo(11.252f, 6.571f, 11.125f, 5.715f, 10.811f, 4.88f)
                curveTo(10.662f, 4.484f, 10.487f, 4.136f, 10.348f, 3.887f)
                curveTo(10.305f, 3.808f, 10.265f, 3.74f, 10.232f, 3.684f)
                curveTo(6.386f, 4.498f, 3.5f, 7.912f, 3.5f, 12f)
                close()
            }
        }.build()

        return _Earth!!
    }

@Suppress("ObjectPropertyName")
private var _Earth: ImageVector? = null

@Preview
@Composable
private fun EarthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Earth, contentDescription = null)
    }
}
