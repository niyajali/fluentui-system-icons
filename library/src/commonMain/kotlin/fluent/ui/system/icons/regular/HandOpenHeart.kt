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
 * HandOpenHeart icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: hand, open, heart
 * - Source: ic_fluent_hand_open_heart_20_regular.svg
 * 
 * @return The [ImageVector] for the HandOpenHeart icon.
 */
public val FluentIcons.Regular.HandOpenHeart: ImageVector
    get() {
        if (_handOpenHeart != null) {
            return _handOpenHeart!!
        }
        _handOpenHeart = Builder(name = "HandOpenHeart", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.499f, 3.003f)
                lineTo(13.871f, 2.51f)
                curveTo(12.836f, 1.698f, 11.339f, 1.874f, 10.52f, 2.904f)
                curveTo(9.788f, 3.825f, 9.833f, 5.142f, 10.627f, 6.01f)
                lineTo(14.13f, 9.84f)
                curveTo(14.329f, 10.057f, 14.67f, 10.057f, 14.868f, 9.84f)
                lineTo(18.372f, 6.009f)
                curveTo(19.165f, 5.141f, 19.211f, 3.825f, 18.479f, 2.905f)
                curveTo(17.661f, 1.874f, 16.164f, 1.698f, 15.128f, 2.51f)
                lineTo(14.499f, 3.003f)
                close()
                moveTo(15.88f, 13.09f)
                lineTo(15.055f, 10.897f)
                curveTo(15.259f, 10.816f, 15.448f, 10.689f, 15.606f, 10.515f)
                lineTo(15.862f, 10.236f)
                lineTo(16.8f, 12.73f)
                curveTo(17.009f, 13.293f, 17.044f, 13.905f, 16.902f, 14.488f)
                curveTo(16.759f, 15.071f, 16.445f, 15.597f, 16.0f, 16.0f)
                lineTo(14.78f, 17.1f)
                curveTo(14.169f, 17.642f, 13.376f, 17.934f, 12.56f, 17.92f)
                curveTo(12.045f, 17.917f, 11.536f, 17.816f, 11.06f, 17.62f)
                curveTo(8.876f, 16.775f, 6.551f, 16.354f, 4.21f, 16.38f)
                curveTo(3.992f, 16.386f, 3.777f, 16.334f, 3.587f, 16.228f)
                curveTo(3.397f, 16.123f, 3.239f, 15.968f, 3.13f, 15.78f)
                curveTo(3.042f, 15.628f, 2.996f, 15.455f, 2.996f, 15.28f)
                curveTo(2.996f, 15.104f, 3.042f, 14.932f, 3.13f, 14.78f)
                curveTo(3.453f, 14.329f, 3.863f, 13.947f, 4.335f, 13.655f)
                curveTo(4.807f, 13.363f, 5.332f, 13.168f, 5.88f, 13.08f)
                lineTo(2.42f, 9.63f)
                curveTo(2.274f, 9.485f, 2.159f, 9.313f, 2.08f, 9.123f)
                curveTo(2.001f, 8.934f, 1.961f, 8.73f, 1.961f, 8.525f)
                curveTo(1.961f, 8.32f, 2.001f, 8.116f, 2.08f, 7.927f)
                curveTo(2.159f, 7.737f, 2.274f, 7.565f, 2.42f, 7.42f)
                curveTo(2.556f, 7.287f, 2.716f, 7.178f, 2.89f, 7.1f)
                curveTo(2.649f, 6.845f, 2.501f, 6.517f, 2.47f, 6.167f)
                curveTo(2.439f, 5.818f, 2.526f, 5.469f, 2.718f, 5.175f)
                curveTo(2.91f, 4.882f, 3.195f, 4.661f, 3.527f, 4.55f)
                curveTo(3.859f, 4.438f, 4.22f, 4.442f, 4.55f, 4.56f)
                curveTo(4.619f, 4.32f, 4.75f, 4.103f, 4.93f, 3.93f)
                curveTo(5.074f, 3.785f, 5.245f, 3.67f, 5.434f, 3.591f)
                curveTo(5.623f, 3.512f, 5.825f, 3.472f, 6.03f, 3.472f)
                curveTo(6.234f, 3.472f, 6.437f, 3.512f, 6.626f, 3.591f)
                curveTo(6.814f, 3.67f, 6.986f, 3.785f, 7.13f, 3.93f)
                curveTo(7.208f, 3.753f, 7.316f, 3.59f, 7.45f, 3.45f)
                curveTo(7.745f, 3.161f, 8.142f, 2.999f, 8.555f, 2.999f)
                curveTo(8.792f, 2.999f, 9.024f, 3.053f, 9.235f, 3.153f)
                curveTo(9.106f, 3.48f, 9.03f, 3.823f, 9.008f, 4.168f)
                lineTo(9.0f, 4.16f)
                curveTo(8.888f, 4.049f, 8.737f, 3.986f, 8.58f, 3.986f)
                curveTo(8.502f, 3.986f, 8.425f, 4.001f, 8.352f, 4.031f)
                curveTo(8.28f, 4.061f, 8.215f, 4.105f, 8.16f, 4.16f)
                curveTo(8.105f, 4.215f, 8.061f, 4.281f, 8.031f, 4.353f)
                curveTo(8.001f, 4.425f, 7.986f, 4.502f, 7.986f, 4.58f)
                curveTo(7.986f, 4.738f, 8.048f, 4.889f, 8.16f, 5.0f)
                lineTo(8.86f, 5.65f)
                lineTo(10.183f, 7.006f)
                lineTo(11.435f, 8.374f)
                curveTo(11.446f, 8.415f, 11.451f, 8.457f, 11.451f, 8.5f)
                curveTo(11.451f, 8.566f, 11.438f, 8.63f, 11.412f, 8.691f)
                curveTo(11.386f, 8.751f, 11.348f, 8.805f, 11.3f, 8.85f)
                curveTo(11.255f, 8.898f, 11.201f, 8.936f, 11.141f, 8.962f)
                curveTo(11.08f, 8.988f, 11.015f, 9.002f, 10.95f, 9.002f)
                curveTo(10.884f, 9.002f, 10.819f, 8.988f, 10.759f, 8.962f)
                curveTo(10.699f, 8.936f, 10.645f, 8.898f, 10.6f, 8.85f)
                lineTo(8.1f, 6.36f)
                lineTo(7.4f, 5.66f)
                lineTo(6.4f, 4.6f)
                curveTo(6.292f, 4.497f, 6.149f, 4.44f, 6.0f, 4.44f)
                curveTo(5.851f, 4.44f, 5.708f, 4.497f, 5.6f, 4.6f)
                curveTo(5.495f, 4.707f, 5.436f, 4.85f, 5.436f, 5.0f)
                curveTo(5.436f, 5.15f, 5.495f, 5.293f, 5.6f, 5.4f)
                lineTo(8.35f, 8.15f)
                curveTo(8.443f, 8.243f, 8.495f, 8.369f, 8.495f, 8.5f)
                curveTo(8.495f, 8.631f, 8.443f, 8.757f, 8.35f, 8.85f)
                curveTo(8.257f, 8.943f, 8.131f, 8.995f, 8.0f, 8.995f)
                curveTo(7.868f, 8.995f, 7.743f, 8.943f, 7.65f, 8.85f)
                lineTo(5.79f, 7.0f)
                lineTo(4.39f, 5.6f)
                curveTo(4.285f, 5.496f, 4.143f, 5.437f, 3.995f, 5.437f)
                curveTo(3.847f, 5.437f, 3.705f, 5.496f, 3.6f, 5.6f)
                curveTo(3.495f, 5.707f, 3.436f, 5.85f, 3.436f, 6.0f)
                curveTo(3.436f, 6.15f, 3.495f, 6.293f, 3.6f, 6.4f)
                lineTo(4.67f, 7.46f)
                lineTo(6.85f, 9.65f)
                curveTo(6.943f, 9.743f, 6.995f, 9.869f, 6.995f, 10.0f)
                curveTo(6.995f, 10.131f, 6.943f, 10.257f, 6.85f, 10.35f)
                curveTo(6.757f, 10.443f, 6.631f, 10.495f, 6.5f, 10.495f)
                curveTo(6.368f, 10.495f, 6.243f, 10.443f, 6.15f, 10.35f)
                lineTo(5.0f, 9.21f)
                lineTo(3.96f, 8.17f)
                curveTo(3.855f, 8.066f, 3.713f, 8.007f, 3.565f, 8.007f)
                curveTo(3.417f, 8.007f, 3.275f, 8.066f, 3.17f, 8.17f)
                curveTo(3.116f, 8.219f, 3.072f, 8.28f, 3.043f, 8.347f)
                curveTo(3.014f, 8.414f, 2.999f, 8.487f, 3.0f, 8.56f)
                curveTo(2.994f, 8.641f, 3.007f, 8.723f, 3.036f, 8.799f)
                curveTo(3.066f, 8.875f, 3.111f, 8.943f, 3.17f, 9.0f)
                lineTo(7.36f, 13.15f)
                curveTo(7.429f, 13.22f, 7.476f, 13.31f, 7.494f, 13.407f)
                curveTo(7.512f, 13.504f, 7.502f, 13.604f, 7.463f, 13.695f)
                curveTo(7.425f, 13.786f, 7.36f, 13.863f, 7.278f, 13.918f)
                curveTo(7.195f, 13.972f, 7.098f, 14.001f, 7.0f, 14.0f)
                curveTo(7.0f, 14.0f, 4.85f, 14.0f, 4.01f, 15.35f)
                curveTo(4.01f, 15.39f, 4.09f, 15.46f, 4.21f, 15.46f)
                curveTo(4.256f, 15.455f, 4.303f, 15.455f, 4.35f, 15.46f)
                curveTo(6.777f, 15.457f, 9.184f, 15.901f, 11.45f, 16.77f)
                curveTo(11.879f, 16.972f, 12.357f, 17.048f, 12.828f, 16.99f)
                curveTo(13.298f, 16.931f, 13.743f, 16.741f, 14.11f, 16.44f)
                lineTo(15.36f, 15.29f)
                curveTo(15.658f, 15.019f, 15.868f, 14.663f, 15.96f, 14.271f)
                curveTo(16.053f, 13.878f, 16.025f, 13.466f, 15.88f, 13.09f)
                close()
                moveTo(9.723f, 13.947f)
                curveTo(10.12f, 13.748f, 10.762f, 13.634f, 11.418f, 13.743f)
                curveTo(12.062f, 13.851f, 12.676f, 14.166f, 13.084f, 14.777f)
                curveTo(13.237f, 15.007f, 13.548f, 15.069f, 13.777f, 14.916f)
                curveTo(14.007f, 14.763f, 14.069f, 14.452f, 13.916f, 14.223f)
                curveTo(13.324f, 13.334f, 12.438f, 12.9f, 11.582f, 12.757f)
                curveTo(10.738f, 12.616f, 9.88f, 12.751f, 9.277f, 13.052f)
                curveTo(9.03f, 13.175f, 8.929f, 13.475f, 9.053f, 13.722f)
                curveTo(9.176f, 13.969f, 9.476f, 14.07f, 9.723f, 13.947f)
                close()
            }
        }
        .build()
        return _handOpenHeart!!
    }

@Suppress("ObjectPropertyName")
private var _handOpenHeart: ImageVector? = null

@Preview
@Composable
private fun HandOpenHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HandOpenHeart, contentDescription = null)
    }
}

