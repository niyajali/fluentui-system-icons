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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Handshake: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Handshake",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.241f, 2.965f)
            curveTo(12.006f, 2.965f, 11.797f, 3.072f, 11.66f, 3.241f)
            lineTo(11.602f, 3.284f)
            curveTo(9.458f, 2.634f, 7.032f, 3.151f, 5.336f, 4.837f)
            curveTo(3.827f, 6.335f, 3.249f, 8.408f, 3.6f, 10.348f)
            lineTo(3.585f, 10.362f)
            lineTo(2.627f, 11.314f)
            curveTo(1.795f, 12.14f, 1.795f, 13.481f, 2.627f, 14.308f)
            curveTo(3.116f, 14.794f, 3.784f, 14.994f, 4.42f, 14.909f)
            curveTo(4.514f, 15.256f, 4.697f, 15.583f, 4.971f, 15.855f)
            curveTo(5.343f, 16.224f, 5.818f, 16.428f, 6.303f, 16.468f)
            curveTo(6.343f, 16.951f, 6.549f, 17.423f, 6.921f, 17.792f)
            curveTo(7.31f, 18.179f, 7.811f, 18.385f, 8.321f, 18.41f)
            curveTo(8.346f, 18.916f, 8.553f, 19.414f, 8.942f, 19.801f)
            curveTo(9.702f, 20.556f, 10.894f, 20.621f, 11.729f, 19.997f)
            lineTo(12.116f, 20.381f)
            curveTo(12.952f, 21.212f, 14.308f, 21.212f, 15.144f, 20.381f)
            curveTo(15.515f, 20.013f, 15.721f, 19.543f, 15.763f, 19.063f)
            curveTo(16.246f, 19.021f, 16.718f, 18.817f, 17.087f, 18.45f)
            curveTo(17.458f, 18.082f, 17.664f, 17.612f, 17.704f, 17.131f)
            curveTo(18.181f, 17.086f, 18.645f, 16.883f, 19.01f, 16.52f)
            curveTo(19.297f, 16.236f, 19.484f, 15.891f, 19.574f, 15.526f)
            curveTo(20.201f, 15.601f, 20.854f, 15.399f, 21.335f, 14.921f)
            curveTo(22.167f, 14.094f, 22.167f, 12.753f, 21.335f, 11.927f)
            lineTo(20.501f, 11.098f)
            lineTo(20.673f, 10.432f)
            curveTo(21.045f, 8.983f, 20.858f, 7.447f, 20.148f, 6.129f)
            curveTo(19.101f, 4.183f, 17.062f, 2.97f, 14.845f, 2.97f)
            lineTo(13.238f, 2.97f)
            curveTo(13.17f, 2.967f, 13.101f, 2.965f, 13.032f, 2.965f)
            horizontalLineTo(12.241f)
            close()
            moveTo(15.165f, 7.91f)
            lineTo(18.629f, 11.351f)
            lineTo(18.632f, 11.356f)
            lineTo(18.646f, 11.369f)
            lineTo(20.271f, 12.984f)
            curveTo(20.515f, 13.227f, 20.515f, 13.621f, 20.271f, 13.864f)
            curveTo(20.026f, 14.107f, 19.63f, 14.107f, 19.385f, 13.864f)
            lineTo(17.76f, 12.249f)
            curveTo(17.466f, 11.958f, 16.99f, 11.958f, 16.696f, 12.249f)
            lineTo(16.68f, 12.266f)
            curveTo(16.386f, 12.557f, 16.386f, 13.031f, 16.68f, 13.323f)
            lineTo(17.946f, 14.582f)
            curveTo(18.191f, 14.825f, 18.191f, 15.219f, 17.946f, 15.463f)
            curveTo(17.723f, 15.684f, 17.372f, 15.704f, 17.127f, 15.521f)
            curveTo(16.827f, 15.296f, 16.405f, 15.327f, 16.14f, 15.592f)
            curveTo(15.876f, 15.858f, 15.849f, 16.278f, 16.078f, 16.574f)
            curveTo(16.267f, 16.818f, 16.248f, 17.17f, 16.023f, 17.393f)
            curveTo(15.797f, 17.618f, 15.439f, 17.635f, 15.193f, 17.443f)
            curveTo(14.895f, 17.209f, 14.467f, 17.234f, 14.198f, 17.5f)
            curveTo(13.928f, 17.766f, 13.901f, 18.191f, 14.134f, 18.489f)
            curveTo(14.328f, 18.737f, 14.309f, 19.096f, 14.08f, 19.323f)
            curveTo(13.832f, 19.57f, 13.428f, 19.57f, 13.18f, 19.323f)
            lineTo(12.808f, 18.954f)
            lineTo(12.913f, 18.849f)
            curveTo(13.745f, 18.022f, 13.745f, 16.682f, 12.913f, 15.855f)
            curveTo(12.524f, 15.468f, 12.023f, 15.262f, 11.513f, 15.237f)
            curveTo(11.488f, 14.731f, 11.281f, 14.233f, 10.892f, 13.847f)
            curveTo(10.52f, 13.477f, 10.045f, 13.273f, 9.559f, 13.233f)
            curveTo(9.52f, 12.75f, 9.314f, 12.278f, 8.942f, 11.909f)
            curveTo(8.453f, 11.423f, 7.786f, 11.223f, 7.149f, 11.308f)
            curveTo(7.056f, 10.961f, 6.872f, 10.634f, 6.599f, 10.362f)
            curveTo(6.167f, 9.934f, 5.597f, 9.727f, 5.032f, 9.743f)
            curveTo(4.885f, 8.37f, 5.341f, 6.946f, 6.4f, 5.894f)
            curveTo(7.384f, 4.916f, 8.692f, 4.455f, 9.981f, 4.512f)
            lineTo(8.484f, 5.647f)
            curveTo(7.46f, 6.423f, 7.262f, 7.88f, 8.043f, 8.9f)
            curveTo(8.822f, 9.918f, 10.281f, 10.115f, 11.302f, 9.341f)
            lineTo(13.191f, 7.91f)
            horizontalLineTo(15.165f)
            close()
            moveTo(9.389f, 6.843f)
            lineTo(12.528f, 4.465f)
            horizontalLineTo(13.032f)
            curveTo(13.081f, 4.465f, 13.13f, 4.466f, 13.179f, 4.469f)
            curveTo(13.192f, 4.469f, 13.206f, 4.47f, 13.219f, 4.47f)
            horizontalLineTo(14.845f)
            curveTo(16.513f, 4.47f, 18.043f, 5.382f, 18.827f, 6.84f)
            curveTo(19.322f, 7.759f, 19.477f, 8.818f, 19.271f, 9.835f)
            lineTo(16.059f, 6.639f)
            curveTo(15.918f, 6.492f, 15.723f, 6.41f, 15.52f, 6.41f)
            lineTo(12.939f, 6.41f)
            curveTo(12.775f, 6.41f, 12.616f, 6.463f, 12.486f, 6.562f)
            lineTo(10.396f, 8.145f)
            curveTo(10.033f, 8.421f, 9.512f, 8.35f, 9.234f, 7.988f)
            curveTo(8.959f, 7.628f, 9.028f, 7.116f, 9.389f, 6.843f)
            close()
            moveTo(6.035f, 14.797f)
            curveTo(5.867f, 14.631f, 5.814f, 14.393f, 5.877f, 14.181f)
            curveTo(5.906f, 14.085f, 5.958f, 13.993f, 6.035f, 13.917f)
            lineTo(6.992f, 12.966f)
            curveTo(7.237f, 12.723f, 7.633f, 12.723f, 7.878f, 12.966f)
            curveTo(8.12f, 13.207f, 8.123f, 13.594f, 7.886f, 13.838f)
            lineTo(7.878f, 13.847f)
            lineTo(6.921f, 14.797f)
            lineTo(6.912f, 14.806f)
            curveTo(6.837f, 14.877f, 6.749f, 14.927f, 6.655f, 14.954f)
            curveTo(6.442f, 15.017f, 6.203f, 14.964f, 6.035f, 14.797f)
            close()
            moveTo(5.544f, 11.429f)
            curveTo(5.619f, 11.507f, 5.67f, 11.6f, 5.697f, 11.698f)
            curveTo(5.753f, 11.906f, 5.699f, 12.137f, 5.535f, 12.3f)
            lineTo(4.577f, 13.251f)
            curveTo(4.333f, 13.494f, 3.936f, 13.494f, 3.691f, 13.251f)
            curveTo(3.447f, 13.008f, 3.447f, 12.614f, 3.691f, 12.371f)
            lineTo(4.649f, 11.42f)
            curveTo(4.893f, 11.177f, 5.29f, 11.177f, 5.535f, 11.42f)
            lineTo(5.544f, 11.429f)
            close()
            moveTo(10.892f, 18.743f)
            curveTo(10.815f, 18.82f, 10.723f, 18.872f, 10.626f, 18.9f)
            curveTo(10.413f, 18.962f, 10.174f, 18.91f, 10.006f, 18.743f)
            curveTo(9.838f, 18.576f, 9.786f, 18.339f, 9.848f, 18.128f)
            curveTo(9.877f, 18.031f, 9.929f, 17.939f, 10.006f, 17.863f)
            lineTo(10.963f, 16.912f)
            curveTo(11.208f, 16.669f, 11.605f, 16.669f, 11.849f, 16.912f)
            curveTo(12.094f, 17.155f, 12.094f, 17.549f, 11.849f, 17.792f)
            lineTo(10.892f, 18.743f)
            close()
            moveTo(8.871f, 16.735f)
            curveTo(8.794f, 16.811f, 8.702f, 16.864f, 8.605f, 16.892f)
            curveTo(8.392f, 16.954f, 8.153f, 16.902f, 7.985f, 16.735f)
            curveTo(7.817f, 16.568f, 7.764f, 16.33f, 7.827f, 16.118f)
            curveTo(7.854f, 16.025f, 7.904f, 15.938f, 7.976f, 15.863f)
            lineTo(7.985f, 15.855f)
            lineTo(8.942f, 14.904f)
            lineTo(8.95f, 14.895f)
            curveTo(9.196f, 14.661f, 9.586f, 14.663f, 9.828f, 14.904f)
            curveTo(10.072f, 15.147f, 10.072f, 15.541f, 9.828f, 15.784f)
            lineTo(8.871f, 16.735f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HandshakePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Handshake, contentDescription = null)
    }
}
