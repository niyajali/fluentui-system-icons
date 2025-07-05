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
 * WiFiSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_settings_20_filled.svg)
 * 
 * @return The [ImageVector] for the WiFiSettings icon.
 */
public val FluentIcons.Filled.WiFiSettings: ImageVector
    get() {
        if (_wiFiSettings != null) {
            return _wiFiSettings!!
        }
        _wiFiSettings = Builder(name = "WiFiSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.845f, 8.117f)
                curveTo(17.513f, 7.637f, 17.133f, 7.177f, 16.729f, 6.773f)
                curveTo(13.032f, 3.076f, 7.037f, 3.076f, 3.34f, 6.773f)
                curveTo(2.951f, 7.161f, 2.576f, 7.621f, 2.235f, 8.111f)
                curveTo(1.999f, 8.451f, 2.084f, 8.919f, 2.424f, 9.155f)
                curveTo(2.764f, 9.391f, 3.232f, 9.306f, 3.468f, 8.966f)
                curveTo(3.76f, 8.545f, 4.079f, 8.155f, 4.4f, 7.834f)
                curveTo(7.512f, 4.722f, 12.557f, 4.722f, 15.668f, 7.834f)
                curveTo(16.006f, 8.172f, 16.329f, 8.562f, 16.61f, 8.969f)
                curveTo(16.845f, 9.31f, 17.312f, 9.396f, 17.653f, 9.161f)
                curveTo(17.994f, 8.925f, 18.08f, 8.458f, 17.845f, 8.117f)
                close()
                moveTo(7.114f, 11.05f)
                curveTo(8.243f, 9.921f, 9.864f, 9.582f, 11.288f, 10.035f)
                curveTo(10.788f, 10.395f, 10.352f, 10.837f, 9.997f, 11.341f)
                curveTo(9.336f, 11.35f, 8.679f, 11.607f, 8.174f, 12.111f)
                curveTo(7.948f, 12.338f, 7.763f, 12.615f, 7.627f, 12.925f)
                curveTo(7.461f, 13.304f, 7.019f, 13.477f, 6.64f, 13.311f)
                curveTo(6.26f, 13.145f, 6.087f, 12.703f, 6.253f, 12.323f)
                curveTo(6.462f, 11.847f, 6.751f, 11.413f, 7.114f, 11.05f)
                close()
                moveTo(14.59f, 8.661f)
                curveTo(14.703f, 8.774f, 14.812f, 8.892f, 14.917f, 9.016f)
                curveTo(14.779f, 9.005f, 14.64f, 9.0f, 14.5f, 9.0f)
                curveTo(13.961f, 9.0f, 13.439f, 9.078f, 12.947f, 9.222f)
                curveTo(11.013f, 7.809f, 8.285f, 7.976f, 6.539f, 9.722f)
                curveTo(6.164f, 10.097f, 5.86f, 10.518f, 5.625f, 10.982f)
                curveTo(5.438f, 11.352f, 4.987f, 11.5f, 4.617f, 11.313f)
                curveTo(4.248f, 11.126f, 4.1f, 10.675f, 4.287f, 10.305f)
                curveTo(4.593f, 9.7f, 4.991f, 9.149f, 5.479f, 8.661f)
                curveTo(7.995f, 6.145f, 12.074f, 6.145f, 14.59f, 8.661f)
                close()
                moveTo(12.067f, 11.442f)
                curveTo(12.37f, 12.523f, 11.724f, 13.642f, 10.636f, 13.92f)
                lineTo(10.175f, 14.038f)
                curveTo(10.16f, 14.19f, 10.152f, 14.344f, 10.152f, 14.5f)
                curveTo(10.152f, 14.688f, 10.163f, 14.873f, 10.185f, 15.054f)
                lineTo(10.535f, 15.137f)
                curveTo(11.654f, 15.402f, 12.32f, 16.554f, 11.991f, 17.656f)
                lineTo(11.864f, 18.079f)
                curveTo(12.122f, 18.282f, 12.401f, 18.456f, 12.699f, 18.597f)
                lineTo(13.024f, 18.253f)
                curveTo(13.814f, 17.416f, 15.144f, 17.417f, 15.934f, 18.254f)
                lineTo(16.271f, 18.612f)
                curveTo(16.563f, 18.477f, 16.839f, 18.31f, 17.093f, 18.114f)
                lineTo(16.937f, 17.558f)
                curveTo(16.633f, 16.477f, 17.279f, 15.358f, 18.367f, 15.08f)
                lineTo(18.828f, 14.962f)
                curveTo(18.843f, 14.81f, 18.85f, 14.656f, 18.85f, 14.5f)
                curveTo(18.85f, 14.312f, 18.839f, 14.127f, 18.818f, 13.946f)
                lineTo(18.469f, 13.863f)
                curveTo(17.349f, 13.598f, 16.683f, 12.446f, 17.013f, 11.344f)
                lineTo(17.139f, 10.922f)
                curveTo(16.882f, 10.718f, 16.602f, 10.544f, 16.304f, 10.404f)
                lineTo(15.979f, 10.747f)
                curveTo(15.189f, 11.584f, 13.859f, 11.583f, 13.07f, 10.746f)
                lineTo(12.732f, 10.388f)
                curveTo(12.44f, 10.523f, 12.165f, 10.69f, 11.91f, 10.885f)
                lineTo(12.067f, 11.442f)
                close()
                moveTo(14.501f, 15.5f)
                curveTo(13.949f, 15.5f, 13.501f, 15.052f, 13.501f, 14.5f)
                curveTo(13.501f, 13.948f, 13.949f, 13.5f, 14.501f, 13.5f)
                curveTo(15.054f, 13.5f, 15.501f, 13.948f, 15.501f, 14.5f)
                curveTo(15.501f, 15.052f, 15.054f, 15.5f, 14.501f, 15.5f)
                close()
            }
        }
        .build()
        return _wiFiSettings!!
    }

@Suppress("ObjectPropertyName")
private var _wiFiSettings: ImageVector? = null

@Preview
@Composable
private fun WiFiSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WiFiSettings, contentDescription = "WiFiSettings Icon")
    }
}

