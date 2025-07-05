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
 * HeartPulseCheckmark Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent health (physically or device).
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_heart_pulse_checkmark_20_regular.svg)
 * 
 * @return The [ImageVector] for the HeartPulseCheckmark icon.
 */
public val FluentIcons.Regular.HeartPulseCheckmark: ImageVector
    get() {
        if (_heartPulseCheckmark != null) {
            return _heartPulseCheckmark!!
        }
        _heartPulseCheckmark = Builder(name = "HeartPulseCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.876f, 8.171f)
                lineTo(13.828f, 9.259f)
                curveTo(13.491f, 9.366f, 13.167f, 9.505f, 12.862f, 9.673f)
                lineTo(12.567f, 9.336f)
                lineTo(11.982f, 10.272f)
                curveTo(11.155f, 10.961f, 10.533f, 11.888f, 10.222f, 12.948f)
                curveTo(10.142f, 12.988f, 10.051f, 13.006f, 9.959f, 12.998f)
                curveTo(9.773f, 12.983f, 9.61f, 12.865f, 9.538f, 12.692f)
                lineTo(7.495f, 7.789f)
                lineTo(6.26f, 10.696f)
                curveTo(6.182f, 10.88f, 6.001f, 11.0f, 5.8f, 11.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 11.0f, 2.0f, 10.776f, 2.0f, 10.5f)
                curveTo(2.0f, 10.224f, 2.224f, 10.0f, 2.5f, 10.0f)
                horizontalLineTo(5.469f)
                lineTo(7.04f, 6.304f)
                curveTo(7.119f, 6.119f, 7.301f, 5.999f, 7.502f, 6.0f)
                curveTo(7.703f, 6.001f, 7.884f, 6.122f, 7.962f, 6.308f)
                lineTo(10.089f, 11.414f)
                lineTo(12.076f, 8.235f)
                curveTo(12.16f, 8.101f, 12.302f, 8.014f, 12.46f, 8.002f)
                curveTo(12.618f, 7.989f, 12.772f, 8.052f, 12.876f, 8.171f)
                close()
                moveTo(16.724f, 4.312f)
                curveTo(17.986f, 5.587f, 18.312f, 7.442f, 17.702f, 9.014f)
                curveTo(17.636f, 9.005f, 17.569f, 9.0f, 17.5f, 9.0f)
                horizontalLineTo(16.611f)
                curveTo(17.283f, 7.722f, 17.085f, 6.099f, 16.013f, 5.016f)
                curveTo(14.703f, 3.692f, 12.596f, 3.691f, 11.3f, 5.0f)
                lineTo(10.349f, 5.963f)
                curveTo(10.153f, 6.161f, 9.834f, 6.161f, 9.638f, 5.963f)
                lineTo(8.678f, 4.993f)
                curveTo(7.37f, 3.672f, 5.265f, 3.671f, 3.972f, 4.977f)
                curveTo(2.899f, 6.061f, 2.713f, 7.711f, 3.42f, 9.0f)
                horizontalLineTo(2.5f)
                curveTo(2.439f, 9.0f, 2.379f, 9.004f, 2.321f, 9.011f)
                curveTo(1.683f, 7.429f, 1.996f, 5.552f, 3.261f, 4.274f)
                curveTo(4.917f, 2.602f, 7.586f, 2.577f, 9.288f, 4.191f)
                curveTo(9.322f, 4.223f, 9.355f, 4.256f, 9.388f, 4.29f)
                lineTo(9.993f, 4.9f)
                lineTo(10.589f, 4.297f)
                curveTo(10.625f, 4.261f, 10.661f, 4.225f, 10.698f, 4.191f)
                curveTo(12.396f, 2.589f, 15.061f, 2.633f, 16.724f, 4.312f)
                close()
                moveTo(4.856f, 12.0f)
                lineTo(9.64f, 16.847f)
                curveTo(9.834f, 17.043f, 10.151f, 17.045f, 10.347f, 16.851f)
                curveTo(10.544f, 16.657f, 10.546f, 16.341f, 10.352f, 16.144f)
                lineTo(6.206f, 11.944f)
                curveTo(6.076f, 11.981f, 5.94f, 12.0f, 5.8f, 12.0f)
                horizontalLineTo(4.856f)
                close()
                moveTo(20.0f, 14.5f)
                curveTo(20.0f, 16.985f, 17.985f, 19.0f, 15.5f, 19.0f)
                curveTo(13.015f, 19.0f, 11.0f, 16.985f, 11.0f, 14.5f)
                curveTo(11.0f, 12.015f, 13.015f, 10.0f, 15.5f, 10.0f)
                curveTo(17.985f, 10.0f, 20.0f, 12.015f, 20.0f, 14.5f)
                close()
                moveTo(17.854f, 12.646f)
                curveTo(17.658f, 12.451f, 17.342f, 12.451f, 17.146f, 12.646f)
                lineTo(14.5f, 15.293f)
                lineTo(13.854f, 14.646f)
                curveTo(13.658f, 14.451f, 13.342f, 14.451f, 13.146f, 14.646f)
                curveTo(12.951f, 14.842f, 12.951f, 15.158f, 13.146f, 15.354f)
                lineTo(14.146f, 16.354f)
                curveTo(14.342f, 16.549f, 14.658f, 16.549f, 14.854f, 16.354f)
                lineTo(17.854f, 13.354f)
                curveTo(18.049f, 13.158f, 18.049f, 12.842f, 17.854f, 12.646f)
                close()
            }
        }
        .build()
        return _heartPulseCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _heartPulseCheckmark: ImageVector? = null

@Preview
@Composable
private fun HeartPulseCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HeartPulseCheckmark, contentDescription = "HeartPulseCheckmark Icon")
    }
}

