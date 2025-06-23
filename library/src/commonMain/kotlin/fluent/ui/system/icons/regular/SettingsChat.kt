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

public val FluentIcons.Regular.SettingsChat: ImageVector
    get() {
        if (_SettingsChat != null) {
            return _SettingsChat!!
        }
        _SettingsChat = ImageVector.Builder(
            name = "Regular.SettingsChat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.013f, 2.25f)
                curveTo(12.747f, 2.258f, 13.478f, 2.343f, 14.195f, 2.503f)
                curveTo(14.507f, 2.573f, 14.741f, 2.834f, 14.777f, 3.152f)
                lineTo(14.947f, 4.679f)
                curveTo(15.024f, 5.38f, 15.616f, 5.911f, 16.322f, 5.912f)
                curveTo(16.511f, 5.912f, 16.699f, 5.872f, 16.874f, 5.795f)
                lineTo(18.275f, 5.18f)
                curveTo(18.566f, 5.052f, 18.906f, 5.121f, 19.124f, 5.354f)
                curveTo(20.136f, 6.435f, 20.89f, 7.731f, 21.329f, 9.146f)
                curveTo(21.423f, 9.451f, 21.314f, 9.782f, 21.057f, 9.972f)
                lineTo(19.816f, 10.887f)
                curveTo(19.664f, 10.998f, 19.539f, 11.138f, 19.445f, 11.295f)
                curveTo(18.961f, 11.144f, 18.452f, 11.047f, 17.926f, 11.014f)
                curveTo(18.118f, 10.486f, 18.463f, 10.019f, 18.927f, 9.678f)
                lineTo(19.724f, 9.091f)
                curveTo(19.403f, 8.251f, 18.948f, 7.468f, 18.376f, 6.774f)
                lineTo(17.479f, 7.167f)
                curveTo(17.114f, 7.329f, 16.719f, 7.412f, 16.32f, 7.412f)
                curveTo(14.85f, 7.41f, 13.616f, 6.304f, 13.456f, 4.844f)
                lineTo(13.347f, 3.867f)
                curveTo(12.902f, 3.794f, 12.454f, 3.755f, 12.013f, 3.75f)
                curveTo(11.559f, 3.755f, 11.106f, 3.794f, 10.659f, 3.867f)
                lineTo(10.55f, 4.844f)
                curveTo(10.448f, 5.754f, 9.921f, 6.561f, 9.131f, 7.019f)
                curveTo(8.337f, 7.483f, 7.368f, 7.539f, 6.526f, 7.169f)
                lineTo(5.627f, 6.775f)
                curveTo(5.055f, 7.469f, 4.6f, 8.251f, 4.28f, 9.092f)
                lineTo(5.077f, 9.679f)
                curveTo(5.816f, 10.222f, 6.252f, 11.084f, 6.252f, 12f)
                curveTo(6.252f, 12.917f, 5.816f, 13.779f, 5.078f, 14.321f)
                lineTo(4.279f, 14.91f)
                curveTo(4.599f, 15.752f, 5.055f, 16.536f, 5.627f, 17.232f)
                lineTo(6.532f, 16.835f)
                curveTo(7.37f, 16.469f, 8.332f, 16.523f, 9.125f, 16.979f)
                curveTo(9.917f, 17.436f, 10.445f, 18.242f, 10.549f, 19.153f)
                lineTo(10.658f, 20.136f)
                curveTo(10.972f, 20.19f, 11.288f, 20.224f, 11.604f, 20.24f)
                lineTo(11.615f, 20.264f)
                lineTo(11.174f, 21.714f)
                curveTo(10.712f, 21.674f, 10.253f, 21.599f, 9.799f, 21.492f)
                curveTo(9.491f, 21.418f, 9.262f, 21.159f, 9.227f, 20.844f)
                lineTo(9.058f, 19.32f)
                curveTo(9.009f, 18.884f, 8.755f, 18.498f, 8.375f, 18.279f)
                curveTo(7.995f, 18.06f, 7.534f, 18.034f, 7.133f, 18.209f)
                lineTo(5.727f, 18.826f)
                curveTo(5.435f, 18.953f, 5.095f, 18.883f, 4.878f, 18.651f)
                curveTo(3.866f, 17.569f, 3.112f, 16.271f, 2.674f, 14.855f)
                curveTo(2.58f, 14.55f, 2.689f, 14.219f, 2.946f, 14.029f)
                lineTo(4.189f, 13.113f)
                curveTo(4.543f, 12.853f, 4.752f, 12.44f, 4.752f, 12f)
                curveTo(4.752f, 11.561f, 4.543f, 11.148f, 4.189f, 10.887f)
                lineTo(2.946f, 9.973f)
                curveTo(2.689f, 9.783f, 2.58f, 9.452f, 2.674f, 9.147f)
                curveTo(3.113f, 7.732f, 3.867f, 6.436f, 4.879f, 5.355f)
                curveTo(5.097f, 5.122f, 5.437f, 5.053f, 5.728f, 5.181f)
                lineTo(7.129f, 5.796f)
                curveTo(7.532f, 5.973f, 7.995f, 5.946f, 8.377f, 5.723f)
                curveTo(8.757f, 5.502f, 9.01f, 5.114f, 9.059f, 4.678f)
                lineTo(9.229f, 3.152f)
                curveTo(9.265f, 2.833f, 9.499f, 2.573f, 9.812f, 2.503f)
                curveTo(10.529f, 2.343f, 11.261f, 2.259f, 12.013f, 2.25f)
                close()
                moveTo(17.753f, 12.006f)
                curveTo(18.287f, 12.03f, 18.801f, 12.13f, 19.285f, 12.295f)
                curveTo(19.285f, 12.295f, 19.285f, 12.295f, 19.285f, 12.295f)
                curveTo(21.448f, 13.036f, 23.003f, 15.087f, 23.003f, 17.501f)
                curveTo(23.003f, 20.539f, 20.54f, 23.002f, 17.502f, 23.002f)
                curveTo(16.534f, 23.002f, 15.625f, 22.753f, 14.835f, 22.314f)
                lineTo(12.648f, 22.979f)
                curveTo(12.265f, 23.096f, 11.907f, 22.738f, 12.024f, 22.355f)
                lineTo(12.689f, 20.169f)
                curveTo(12.25f, 19.379f, 12f, 18.469f, 12f, 17.501f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.502f, 12f)
                curveTo(17.586f, 12f, 17.669f, 12.002f, 17.753f, 12.006f)
                curveTo(17.753f, 12.006f, 17.753f, 12.006f, 17.753f, 12.006f)
                close()
                moveTo(17.502f, 18.001f)
                horizontalLineTo(15.501f)
                curveTo(15.225f, 18.001f, 15.001f, 18.225f, 15.001f, 18.501f)
                curveTo(15.001f, 18.617f, 15.04f, 18.723f, 15.106f, 18.808f)
                curveTo(15.106f, 18.808f, 15.106f, 18.808f, 15.106f, 18.808f)
                curveTo(15.198f, 18.926f, 15.341f, 19.001f, 15.501f, 19.001f)
                horizontalLineTo(17.502f)
                curveTo(17.778f, 19.001f, 18.002f, 18.778f, 18.002f, 18.501f)
                curveTo(18.002f, 18.225f, 17.778f, 18.001f, 17.502f, 18.001f)
                close()
                moveTo(15.501f, 17.001f)
                curveTo(15.501f, 17.001f, 15.501f, 17.001f, 15.501f, 17.001f)
                horizontalLineTo(19.502f)
                curveTo(19.778f, 17.001f, 20.002f, 16.777f, 20.002f, 16.501f)
                curveTo(20.002f, 16.225f, 19.778f, 16.001f, 19.502f, 16.001f)
                horizontalLineTo(15.501f)
                curveTo(15.225f, 16.001f, 15.001f, 16.225f, 15.001f, 16.501f)
                curveTo(15.001f, 16.633f, 15.052f, 16.753f, 15.136f, 16.843f)
                curveTo(15.136f, 16.843f, 15.136f, 16.843f, 15.136f, 16.843f)
                curveTo(15.227f, 16.94f, 15.357f, 17.001f, 15.501f, 17.001f)
                close()
                moveTo(12.001f, 8.25f)
                curveTo(13.818f, 8.25f, 15.334f, 9.543f, 15.678f, 11.259f)
                curveTo(15.173f, 11.407f, 14.693f, 11.614f, 14.247f, 11.872f)
                curveTo(14.181f, 10.689f, 13.2f, 9.75f, 12.001f, 9.75f)
                curveTo(10.758f, 9.75f, 9.751f, 10.757f, 9.751f, 12f)
                curveTo(9.751f, 13.2f, 10.69f, 14.18f, 11.873f, 14.246f)
                curveTo(11.614f, 14.692f, 11.408f, 15.172f, 11.26f, 15.677f)
                curveTo(9.544f, 15.333f, 8.251f, 13.818f, 8.251f, 12f)
                curveTo(8.251f, 9.929f, 9.93f, 8.25f, 12.001f, 8.25f)
                close()
            }
        }.build()

        return _SettingsChat!!
    }

@Suppress("ObjectPropertyName")
private var _SettingsChat: ImageVector? = null

@Preview
@Composable
private fun SettingsChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SettingsChat, contentDescription = null)
    }
}
