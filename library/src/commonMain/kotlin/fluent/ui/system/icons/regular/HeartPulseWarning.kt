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
 * HeartPulseWarning Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent health (physically or device).
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_heart_pulse_warning_20_regular.svg)
 * 
 * @return The [ImageVector] for the HeartPulseWarning icon.
 */
public val FluentIcons.Regular.HeartPulseWarning: ImageVector
    get() {
        if (_heartPulseWarning != null) {
            return _heartPulseWarning!!
        }
        _heartPulseWarning = Builder(name = "HeartPulseWarning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.713f, 9.107f)
                curveTo(12.833f, 8.867f, 12.988f, 8.667f, 13.169f, 8.505f)
                lineTo(12.876f, 8.171f)
                curveTo(12.772f, 8.052f, 12.618f, 7.989f, 12.46f, 8.002f)
                curveTo(12.302f, 8.014f, 12.16f, 8.101f, 12.076f, 8.235f)
                lineTo(10.089f, 11.414f)
                lineTo(7.962f, 6.308f)
                curveTo(7.884f, 6.122f, 7.703f, 6.001f, 7.502f, 6.0f)
                curveTo(7.301f, 5.999f, 7.119f, 6.119f, 7.04f, 6.304f)
                lineTo(5.469f, 10.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 10.0f, 2.0f, 10.224f, 2.0f, 10.5f)
                curveTo(2.0f, 10.776f, 2.224f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(5.8f)
                curveTo(6.001f, 11.0f, 6.182f, 10.88f, 6.26f, 10.696f)
                lineTo(7.495f, 7.789f)
                lineTo(9.538f, 12.692f)
                curveTo(9.61f, 12.865f, 9.773f, 12.983f, 9.959f, 12.998f)
                curveTo(10.146f, 13.014f, 10.325f, 12.924f, 10.424f, 12.765f)
                lineTo(12.567f, 9.336f)
                lineTo(12.587f, 9.359f)
                lineTo(12.713f, 9.107f)
                close()
                moveTo(4.799f, 12.0f)
                lineTo(9.112f, 16.357f)
                curveTo(9.141f, 16.272f, 9.177f, 16.188f, 9.218f, 16.104f)
                lineTo(9.571f, 15.399f)
                lineTo(6.162f, 11.956f)
                curveTo(6.045f, 11.985f, 5.924f, 12.0f, 5.8f, 12.0f)
                horizontalLineTo(4.799f)
                close()
                moveTo(17.702f, 9.014f)
                curveTo(18.312f, 7.442f, 17.986f, 5.587f, 16.724f, 4.312f)
                curveTo(15.061f, 2.633f, 12.396f, 2.589f, 10.698f, 4.191f)
                curveTo(10.661f, 4.225f, 10.625f, 4.261f, 10.589f, 4.297f)
                lineTo(9.993f, 4.9f)
                lineTo(9.388f, 4.29f)
                curveTo(9.355f, 4.256f, 9.322f, 4.223f, 9.288f, 4.191f)
                curveTo(7.586f, 2.577f, 4.917f, 2.602f, 3.261f, 4.274f)
                curveTo(1.996f, 5.552f, 1.683f, 7.429f, 2.321f, 9.011f)
                curveTo(2.379f, 9.004f, 2.439f, 9.0f, 2.5f, 9.0f)
                horizontalLineTo(3.42f)
                curveTo(2.713f, 7.711f, 2.899f, 6.061f, 3.972f, 4.977f)
                curveTo(5.265f, 3.671f, 7.37f, 3.672f, 8.678f, 4.993f)
                lineTo(9.638f, 5.963f)
                curveTo(9.834f, 6.161f, 10.153f, 6.161f, 10.349f, 5.963f)
                lineTo(11.3f, 5.0f)
                curveTo(12.596f, 3.691f, 14.703f, 3.692f, 16.013f, 5.016f)
                curveTo(17.085f, 6.099f, 17.283f, 7.722f, 16.611f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.569f, 9.0f, 17.636f, 9.005f, 17.702f, 9.014f)
                close()
                moveTo(13.603f, 9.554f)
                lineTo(10.107f, 16.552f)
                curveTo(9.774f, 17.217f, 10.258f, 18.0f, 11.002f, 18.0f)
                horizontalLineTo(17.998f)
                curveTo(18.742f, 18.0f, 19.226f, 17.217f, 18.893f, 16.552f)
                lineTo(15.394f, 9.553f)
                curveTo(15.025f, 8.815f, 13.972f, 8.816f, 13.603f, 9.554f)
                close()
                moveTo(14.998f, 11.495f)
                verticalLineTo(14.497f)
                curveTo(14.998f, 14.774f, 14.774f, 14.998f, 14.498f, 14.998f)
                curveTo(14.222f, 14.998f, 13.998f, 14.774f, 13.998f, 14.497f)
                verticalLineTo(11.495f)
                curveTo(13.998f, 11.219f, 14.222f, 10.995f, 14.498f, 10.995f)
                curveTo(14.774f, 10.995f, 14.998f, 11.219f, 14.998f, 11.495f)
                close()
                moveTo(14.498f, 16.999f)
                curveTo(14.222f, 16.999f, 13.998f, 16.775f, 13.998f, 16.499f)
                curveTo(13.998f, 16.223f, 14.222f, 15.999f, 14.498f, 15.999f)
                curveTo(14.774f, 15.999f, 14.998f, 16.223f, 14.998f, 16.499f)
                curveTo(14.998f, 16.775f, 14.774f, 16.999f, 14.498f, 16.999f)
                close()
            }
        }
        .build()
        return _heartPulseWarning!!
    }

@Suppress("ObjectPropertyName")
private var _heartPulseWarning: ImageVector? = null

@Preview
@Composable
private fun HeartPulseWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HeartPulseWarning, contentDescription = "HeartPulseWarning Icon")
    }
}

