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
 * WiFi1 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_1_24_regular.svg)
 * 
 * @return The [ImageVector] for the WiFi1 icon.
 */
public val FluentIcons.Regular.WiFi1: ImageVector
    get() {
        if (_wiFi1 != null) {
            return _wiFi1!!
        }
        _wiFi1 = Builder(name = "WiFi1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.745f, 10.751f)
                curveTo(18.336f, 11.341f, 18.847f, 12.058f, 19.237f, 12.82f)
                curveTo(19.426f, 13.189f, 19.279f, 13.641f, 18.911f, 13.829f)
                curveTo(18.542f, 14.018f, 18.09f, 13.872f, 17.901f, 13.503f)
                curveTo(17.581f, 12.877f, 17.161f, 12.288f, 16.684f, 11.811f)
                curveTo(14.122f, 9.249f, 9.967f, 9.249f, 7.404f, 11.811f)
                curveTo(6.906f, 12.309f, 6.502f, 12.869f, 6.19f, 13.484f)
                curveTo(6.004f, 13.854f, 5.552f, 14.002f, 5.183f, 13.815f)
                curveTo(4.813f, 13.628f, 4.665f, 13.177f, 4.852f, 12.807f)
                curveTo(5.235f, 12.05f, 5.733f, 11.361f, 6.343f, 10.751f)
                curveTo(9.492f, 7.602f, 14.597f, 7.602f, 17.745f, 10.751f)
                close()
                moveTo(15.643f, 13.819f)
                curveTo(16.091f, 14.267f, 16.459f, 14.817f, 16.715f, 15.402f)
                curveTo(16.881f, 15.781f, 16.709f, 16.223f, 16.329f, 16.389f)
                curveTo(15.95f, 16.556f, 15.508f, 16.383f, 15.341f, 16.004f)
                curveTo(15.158f, 15.586f, 14.895f, 15.192f, 14.582f, 14.88f)
                curveTo(13.18f, 13.477f, 10.905f, 13.477f, 9.503f, 14.88f)
                curveTo(9.192f, 15.191f, 8.94f, 15.569f, 8.755f, 15.991f)
                curveTo(8.589f, 16.37f, 8.147f, 16.543f, 7.768f, 16.377f)
                curveTo(7.388f, 16.211f, 7.215f, 15.769f, 7.381f, 15.389f)
                curveTo(7.639f, 14.801f, 7.995f, 14.266f, 8.442f, 13.819f)
                curveTo(10.431f, 11.831f, 13.655f, 11.831f, 15.643f, 13.819f)
                close()
                moveTo(20.448f, 8.279f)
                curveTo(20.957f, 8.788f, 21.438f, 9.369f, 21.856f, 9.976f)
                curveTo(22.091f, 10.316f, 22.006f, 10.784f, 21.665f, 11.019f)
                curveTo(21.324f, 11.254f, 20.857f, 11.168f, 20.622f, 10.828f)
                curveTo(20.254f, 10.294f, 19.831f, 9.783f, 19.387f, 9.339f)
                curveTo(15.307f, 5.259f, 8.692f, 5.259f, 4.612f, 9.339f)
                curveTo(4.19f, 9.761f, 3.772f, 10.273f, 3.39f, 10.823f)
                curveTo(3.154f, 11.163f, 2.687f, 11.248f, 2.346f, 11.012f)
                curveTo(2.006f, 10.776f, 1.922f, 10.308f, 2.158f, 9.968f)
                curveTo(2.588f, 9.348f, 3.062f, 8.768f, 3.552f, 8.279f)
                curveTo(8.217f, 3.613f, 15.782f, 3.613f, 20.448f, 8.279f)
                close()
                moveTo(13.061f, 16.439f)
                curveTo(13.646f, 17.025f, 13.646f, 17.975f, 13.061f, 18.561f)
                curveTo(12.475f, 19.146f, 11.525f, 19.146f, 10.939f, 18.561f)
                curveTo(10.353f, 17.975f, 10.353f, 17.025f, 10.939f, 16.439f)
                curveTo(11.525f, 15.853f, 12.475f, 15.853f, 13.061f, 16.439f)
                close()
            }
        }
        .build()
        return _wiFi1!!
    }

@Suppress("ObjectPropertyName")
private var _wiFi1: ImageVector? = null

@Preview
@Composable
private fun WiFi1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WiFi1, contentDescription = "WiFi1 Icon")
    }
}

