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
 * WiFiSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_settings_20_regular.svg)
 * 
 * @return The [ImageVector] for the WiFiSettings icon.
 */
public val FluentIcons.Regular.WiFiSettings: ImageVector
    get() {
        if (_wiFiSettings != null) {
            return _wiFiSettings!!
        }
        _wiFiSettings = Builder(name = "WiFiSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.964f, 8.181f)
                curveTo(17.627f, 7.693f, 17.24f, 7.225f, 16.831f, 6.815f)
                curveTo(13.078f, 3.062f, 6.992f, 3.062f, 3.238f, 6.815f)
                curveTo(2.845f, 7.208f, 2.463f, 7.675f, 2.117f, 8.175f)
                curveTo(1.959f, 8.402f, 2.016f, 8.713f, 2.242f, 8.871f)
                curveTo(2.469f, 9.028f, 2.781f, 8.972f, 2.938f, 8.745f)
                curveTo(3.252f, 8.292f, 3.597f, 7.871f, 3.945f, 7.522f)
                curveTo(7.308f, 4.159f, 12.761f, 4.159f, 16.124f, 7.522f)
                curveTo(16.49f, 7.888f, 16.838f, 8.309f, 17.141f, 8.749f)
                curveTo(17.298f, 8.976f, 17.609f, 9.033f, 17.837f, 8.876f)
                curveTo(18.064f, 8.719f, 18.121f, 8.408f, 17.964f, 8.181f)
                close()
                moveTo(7.183f, 11.286f)
                curveTo(8.227f, 10.242f, 9.7f, 9.89f, 11.034f, 10.23f)
                curveTo(10.714f, 10.489f, 10.425f, 10.784f, 10.171f, 11.108f)
                curveTo(9.35f, 11.071f, 8.517f, 11.366f, 7.89f, 11.993f)
                curveTo(7.627f, 12.256f, 7.414f, 12.575f, 7.259f, 12.93f)
                curveTo(7.148f, 13.183f, 6.853f, 13.299f, 6.6f, 13.188f)
                curveTo(6.347f, 13.077f, 6.232f, 12.783f, 6.343f, 12.53f)
                curveTo(6.547f, 12.063f, 6.829f, 11.639f, 7.183f, 11.286f)
                close()
                moveTo(14.595f, 8.789f)
                curveTo(14.666f, 8.86f, 14.736f, 8.933f, 14.804f, 9.008f)
                curveTo(14.703f, 9.003f, 14.602f, 9.0f, 14.5f, 9.0f)
                curveTo(14.14f, 9.0f, 13.789f, 9.035f, 13.448f, 9.1f)
                curveTo(11.308f, 7.377f, 8.168f, 7.509f, 6.181f, 9.496f)
                curveTo(5.768f, 9.909f, 5.432f, 10.374f, 5.173f, 10.885f)
                curveTo(5.048f, 11.132f, 4.748f, 11.231f, 4.501f, 11.106f)
                curveTo(4.255f, 10.981f, 4.156f, 10.68f, 4.281f, 10.434f)
                curveTo(4.587f, 9.829f, 4.985f, 9.277f, 5.474f, 8.789f)
                curveTo(7.993f, 6.27f, 12.076f, 6.27f, 14.595f, 8.789f)
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
        Image(imageVector = FluentIcons.Regular.WiFiSettings, contentDescription = "WiFiSettings Icon")
    }
}

