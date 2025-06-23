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

public val FluentIcons.Filled.Fingerprint: ImageVector
    get() {
        if (_Fingerprint != null) {
            return _Fingerprint!!
        }
        _Fingerprint = ImageVector.Builder(
            name = "Filled.Fingerprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.976f, 11.975f)
                curveTo(15.572f, 12.582f, 15.906f, 13.307f, 16.145f, 14.299f)
                lineTo(16.259f, 14.828f)
                lineTo(16.355f, 15.338f)
                curveTo(16.479f, 16.005f, 16.553f, 16.31f, 16.663f, 16.553f)
                curveTo(16.948f, 17.189f, 17.457f, 17.847f, 18.198f, 18.522f)
                curveTo(18.605f, 18.893f, 18.633f, 19.521f, 18.26f, 19.925f)
                curveTo(17.886f, 20.329f, 17.254f, 20.357f, 16.847f, 19.986f)
                curveTo(15.916f, 19.139f, 15.242f, 18.267f, 14.836f, 17.363f)
                curveTo(14.679f, 17.012f, 14.585f, 16.686f, 14.475f, 16.146f)
                lineTo(14.286f, 15.158f)
                lineTo(14.251f, 14.99f)
                curveTo(14.08f, 14.188f, 13.873f, 13.696f, 13.544f, 13.363f)
                curveTo(12.946f, 12.754f, 11.492f, 12.923f, 11.138f, 13.48f)
                curveTo(10.617f, 14.298f, 10.48f, 15.721f, 10.906f, 17.165f)
                curveTo(11.247f, 18.316f, 11.698f, 19.45f, 12.262f, 20.565f)
                curveTo(12.509f, 21.056f, 12.309f, 21.652f, 11.816f, 21.898f)
                curveTo(11.322f, 22.144f, 10.721f, 21.946f, 10.474f, 21.456f)
                curveTo(9.857f, 20.235f, 9.361f, 18.991f, 8.987f, 17.725f)
                curveTo(8.407f, 15.761f, 8.6f, 13.749f, 9.448f, 12.419f)
                curveTo(10.487f, 10.788f, 13.467f, 10.44f, 14.976f, 11.975f)
                close()
                moveTo(12.473f, 14.101f)
                curveTo(13.025f, 14.083f, 13.487f, 14.515f, 13.506f, 15.067f)
                curveTo(13.556f, 16.566f, 14.043f, 18.014f, 14.904f, 19.236f)
                lineTo(15.094f, 19.494f)
                lineTo(15.395f, 19.884f)
                curveTo(15.731f, 20.321f, 15.65f, 20.949f, 15.212f, 21.286f)
                curveTo(14.808f, 21.597f, 14.242f, 21.551f, 13.892f, 21.198f)
                lineTo(13.81f, 21.104f)
                lineTo(13.509f, 20.713f)
                curveTo(12.274f, 19.109f, 11.574f, 17.157f, 11.507f, 15.134f)
                curveTo(11.488f, 14.582f, 11.921f, 14.119f, 12.473f, 14.101f)
                close()
                moveTo(8.573f, 9.189f)
                curveTo(10.774f, 7.56f, 13.649f, 7.648f, 15.59f, 8.895f)
                curveTo(16.551f, 9.513f, 17.283f, 10.238f, 17.773f, 11.073f)
                curveTo(18.052f, 11.549f, 17.892f, 12.162f, 17.416f, 12.441f)
                curveTo(16.939f, 12.72f, 16.327f, 12.561f, 16.047f, 12.084f)
                curveTo(15.727f, 11.537f, 15.218f, 11.034f, 14.508f, 10.578f)
                curveTo(13.229f, 9.755f, 11.252f, 9.694f, 9.763f, 10.797f)
                curveTo(8.204f, 11.951f, 7.543f, 13.943f, 7.741f, 16.054f)
                curveTo(7.853f, 17.249f, 8.214f, 18.46f, 8.828f, 19.689f)
                curveTo(9.076f, 20.183f, 8.875f, 20.784f, 8.381f, 21.031f)
                curveTo(7.887f, 21.278f, 7.287f, 21.078f, 7.04f, 20.584f)
                curveTo(6.317f, 19.139f, 5.885f, 17.69f, 5.749f, 16.241f)
                curveTo(5.492f, 13.492f, 6.381f, 10.812f, 8.573f, 9.189f)
                close()
                moveTo(19.147f, 14.348f)
                curveTo(19.176f, 14.909f, 19.312f, 15.359f, 19.547f, 15.717f)
                curveTo(19.769f, 16.053f, 19.946f, 16.212f, 20.035f, 16.239f)
                curveTo(20.564f, 16.399f, 20.863f, 16.957f, 20.703f, 17.486f)
                curveTo(20.543f, 18.014f, 19.985f, 18.313f, 19.456f, 18.153f)
                curveTo(18.844f, 17.969f, 18.333f, 17.508f, 17.877f, 16.817f)
                curveTo(17.436f, 16.147f, 17.196f, 15.353f, 17.149f, 14.451f)
                curveTo(17.121f, 13.899f, 17.545f, 13.429f, 18.097f, 13.401f)
                curveTo(18.648f, 13.373f, 19.118f, 13.797f, 19.147f, 14.348f)
                close()
                moveTo(10.465f, 5.954f)
                curveTo(10.692f, 6.458f, 10.467f, 7.05f, 9.964f, 7.276f)
                curveTo(8.17f, 8.084f, 6.856f, 9.229f, 5.994f, 10.722f)
                curveTo(4.912f, 12.596f, 4.618f, 14.796f, 4.861f, 16.645f)
                curveTo(4.933f, 17.192f, 4.547f, 17.694f, 4f, 17.766f)
                curveTo(3.452f, 17.838f, 2.95f, 17.452f, 2.878f, 16.905f)
                curveTo(2.583f, 14.654f, 2.933f, 12.023f, 4.262f, 9.722f)
                curveTo(5.341f, 7.854f, 6.977f, 6.427f, 9.143f, 5.453f)
                curveTo(9.647f, 5.226f, 10.239f, 5.45f, 10.465f, 5.954f)
                close()
                moveTo(12.929f, 4.922f)
                curveTo(14.824f, 4.961f, 16.7f, 5.827f, 18.548f, 7.472f)
                curveTo(20.418f, 9.135f, 21.544f, 11.394f, 21.924f, 14.205f)
                curveTo(21.998f, 14.752f, 21.615f, 15.256f, 21.067f, 15.33f)
                curveTo(20.52f, 15.404f, 20.016f, 15.021f, 19.942f, 14.473f)
                curveTo(19.624f, 12.119f, 18.716f, 10.298f, 17.219f, 8.966f)
                curveTo(15.701f, 7.615f, 14.26f, 6.95f, 12.888f, 6.922f)
                curveTo(12.335f, 6.91f, 11.897f, 6.454f, 11.908f, 5.901f)
                curveTo(11.92f, 5.349f, 12.376f, 4.911f, 12.929f, 4.922f)
                close()
                moveTo(5.611f, 5.152f)
                curveTo(5.978f, 5.565f, 5.942f, 6.197f, 5.529f, 6.564f)
                curveTo(5.269f, 6.796f, 4.994f, 7.074f, 4.707f, 7.398f)
                curveTo(4.442f, 7.696f, 4.169f, 8.087f, 3.89f, 8.57f)
                curveTo(3.614f, 9.048f, 3.002f, 9.212f, 2.524f, 8.936f)
                curveTo(2.045f, 8.66f, 1.882f, 8.048f, 2.158f, 7.57f)
                curveTo(2.5f, 6.977f, 2.85f, 6.478f, 3.21f, 6.071f)
                curveTo(3.548f, 5.691f, 3.877f, 5.357f, 4.199f, 5.071f)
                curveTo(4.611f, 4.703f, 5.244f, 4.74f, 5.611f, 5.152f)
                close()
                moveTo(12.497f, 2.018f)
                curveTo(14.738f, 2.123f, 16.818f, 2.613f, 18.361f, 3.805f)
                curveTo(18.798f, 4.142f, 18.879f, 4.77f, 18.541f, 5.207f)
                curveTo(18.204f, 5.644f, 17.576f, 5.725f, 17.138f, 5.387f)
                curveTo(15.936f, 4.459f, 14.251f, 4.102f, 12.403f, 4.016f)
                curveTo(10.547f, 3.929f, 9.038f, 4.258f, 7.852f, 4.986f)
                curveTo(7.381f, 5.276f, 6.765f, 5.128f, 6.476f, 4.658f)
                curveTo(6.187f, 4.187f, 6.334f, 3.571f, 6.805f, 3.282f)
                curveTo(8.357f, 2.329f, 10.262f, 1.913f, 12.497f, 2.018f)
                close()
            }
        }.build()

        return _Fingerprint!!
    }

@Suppress("ObjectPropertyName")
private var _Fingerprint: ImageVector? = null

@Preview
@Composable
private fun FingerprintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Fingerprint, contentDescription = null)
    }
}
