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
 * WiFi3 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_3_24_regular.svg)
 * 
 * @return The [ImageVector] for the WiFi3 icon.
 */
public val FluentIcons.Regular.WiFi3: ImageVector
    get() {
        if (_wiFi3 != null) {
            return _wiFi3!!
        }
        _wiFi3 = Builder(name = "WiFi3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.939f, 16.439f)
                curveTo(11.525f, 15.853f, 12.475f, 15.853f, 13.061f, 16.439f)
                curveTo(13.647f, 17.025f, 13.647f, 17.975f, 13.061f, 18.561f)
                curveTo(12.475f, 19.147f, 11.525f, 19.147f, 10.939f, 18.561f)
                curveTo(10.353f, 17.975f, 10.353f, 17.025f, 10.939f, 16.439f)
                close()
                moveTo(8.442f, 13.819f)
                curveTo(10.431f, 11.831f, 13.655f, 11.831f, 15.643f, 13.819f)
                curveTo(16.091f, 14.267f, 16.459f, 14.817f, 16.715f, 15.402f)
                curveTo(16.882f, 15.781f, 16.709f, 16.223f, 16.33f, 16.39f)
                curveTo(15.95f, 16.556f, 15.508f, 16.383f, 15.342f, 16.004f)
                curveTo(15.158f, 15.586f, 14.895f, 15.192f, 14.583f, 14.88f)
                curveTo(13.18f, 13.477f, 10.906f, 13.477f, 9.503f, 14.88f)
                curveTo(9.192f, 15.191f, 8.94f, 15.569f, 8.756f, 15.991f)
                curveTo(8.59f, 16.37f, 8.147f, 16.543f, 7.768f, 16.377f)
                curveTo(7.388f, 16.211f, 7.215f, 15.769f, 7.381f, 15.389f)
                curveTo(7.639f, 14.801f, 7.995f, 14.266f, 8.442f, 13.819f)
                close()
            }
        }
        .build()
        return _wiFi3!!
    }

@Suppress("ObjectPropertyName")
private var _wiFi3: ImageVector? = null

@Preview
@Composable
private fun WiFi3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WiFi3, contentDescription = "WiFi3 Icon")
    }
}

