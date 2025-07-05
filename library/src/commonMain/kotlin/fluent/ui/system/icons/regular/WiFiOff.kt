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
 * WiFiOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the WiFiOff icon.
 */
public val FluentIcons.Regular.WiFiOff: ImageVector
    get() {
        if (_wiFiOff != null) {
            return _wiFiOff!!
        }
        _wiFiOff = Builder(name = "WiFiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(5.584f, 6.645f)
                curveTo(4.863f, 7.104f, 4.181f, 7.649f, 3.551f, 8.279f)
                curveTo(3.062f, 8.768f, 2.587f, 9.348f, 2.157f, 9.968f)
                curveTo(1.921f, 10.308f, 2.006f, 10.776f, 2.346f, 11.012f)
                curveTo(2.686f, 11.248f, 3.154f, 11.163f, 3.39f, 10.823f)
                curveTo(3.771f, 10.273f, 4.19f, 9.761f, 4.612f, 9.339f)
                curveTo(5.245f, 8.706f, 5.939f, 8.172f, 6.674f, 7.735f)
                lineTo(8.266f, 9.327f)
                curveTo(7.575f, 9.694f, 6.925f, 10.168f, 6.343f, 10.751f)
                curveTo(5.732f, 11.361f, 5.234f, 12.05f, 4.852f, 12.807f)
                curveTo(4.665f, 13.177f, 4.813f, 13.628f, 5.182f, 13.815f)
                curveTo(5.552f, 14.002f, 6.003f, 13.854f, 6.19f, 13.484f)
                curveTo(6.501f, 12.869f, 6.906f, 12.309f, 7.404f, 11.811f)
                curveTo(7.994f, 11.221f, 8.668f, 10.767f, 9.388f, 10.449f)
                lineTo(11.318f, 12.379f)
                curveTo(10.266f, 12.53f, 9.251f, 13.01f, 8.442f, 13.819f)
                curveTo(7.995f, 14.266f, 7.638f, 14.801f, 7.381f, 15.389f)
                curveTo(7.215f, 15.769f, 7.388f, 16.211f, 7.767f, 16.377f)
                curveTo(8.147f, 16.543f, 8.589f, 16.37f, 8.755f, 15.991f)
                curveTo(8.94f, 15.569f, 9.192f, 15.191f, 9.502f, 14.88f)
                curveTo(10.413f, 13.969f, 11.692f, 13.65f, 12.861f, 13.922f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(11.584f, 8.402f)
                lineTo(13.168f, 9.986f)
                curveTo(14.455f, 10.208f, 15.689f, 10.817f, 16.684f, 11.811f)
                curveTo(17.16f, 12.288f, 17.581f, 12.877f, 17.901f, 13.503f)
                curveTo(18.09f, 13.872f, 18.541f, 14.018f, 18.91f, 13.829f)
                curveTo(19.279f, 13.641f, 19.425f, 13.189f, 19.236f, 12.82f)
                curveTo(18.847f, 12.058f, 18.335f, 11.341f, 17.744f, 10.751f)
                curveTo(16.053f, 9.059f, 13.798f, 8.277f, 11.584f, 8.402f)
                close()
                moveTo(8.487f, 5.305f)
                lineTo(9.713f, 6.531f)
                curveTo(13.087f, 5.778f, 16.762f, 6.714f, 19.387f, 9.339f)
                curveTo(19.83f, 9.783f, 20.253f, 10.294f, 20.621f, 10.828f)
                curveTo(20.857f, 11.168f, 21.324f, 11.254f, 21.664f, 11.019f)
                curveTo(22.005f, 10.784f, 22.091f, 10.316f, 21.856f, 9.976f)
                curveTo(21.437f, 9.369f, 20.957f, 8.788f, 20.448f, 8.279f)
                curveTo(17.211f, 5.042f, 12.578f, 4.05f, 8.487f, 5.305f)
                close()
                moveTo(13.06f, 16.439f)
                curveTo(13.646f, 17.025f, 13.646f, 17.975f, 13.06f, 18.561f)
                curveTo(12.474f, 19.146f, 11.524f, 19.146f, 10.939f, 18.561f)
                curveTo(10.353f, 17.975f, 10.353f, 17.025f, 10.939f, 16.439f)
                curveTo(11.524f, 15.853f, 12.474f, 15.853f, 13.06f, 16.439f)
                close()
            }
        }
        .build()
        return _wiFiOff!!
    }

@Suppress("ObjectPropertyName")
private var _wiFiOff: ImageVector? = null

@Preview
@Composable
private fun WiFiOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WiFiOff, contentDescription = "WiFiOff Icon")
    }
}

