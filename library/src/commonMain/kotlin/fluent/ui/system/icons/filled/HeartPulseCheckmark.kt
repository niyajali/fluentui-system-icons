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
 * HeartPulseCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: heart, pulse, checkmark
 * - Source: ic_fluent_heart_pulse_checkmark_20_filled.svg
 * 
 * @return The [ImageVector] for the HeartPulseCheckmark icon.
 */
public val FluentIcons.Filled.HeartPulseCheckmark: ImageVector
    get() {
        if (_heartPulseCheckmark != null) {
            return _heartPulseCheckmark!!
        }
        _heartPulseCheckmark = Builder(name = "HeartPulseCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.388f, 4.29f)
                curveTo(7.693f, 2.577f, 4.95f, 2.569f, 3.261f, 4.274f)
                curveTo(1.996f, 5.552f, 1.683f, 7.429f, 2.321f, 9.011f)
                curveTo(2.379f, 9.004f, 2.439f, 9.0f, 2.5f, 9.0f)
                horizontalLineTo(4.808f)
                lineTo(6.12f, 5.913f)
                curveTo(6.356f, 5.358f, 6.902f, 4.998f, 7.505f, 5.0f)
                curveTo(8.109f, 5.002f, 8.652f, 5.366f, 8.885f, 5.923f)
                lineTo(10.267f, 9.242f)
                lineTo(11.228f, 7.705f)
                curveTo(11.48f, 7.302f, 11.907f, 7.043f, 12.38f, 7.005f)
                curveTo(12.853f, 6.967f, 13.316f, 7.155f, 13.629f, 7.512f)
                lineTo(14.931f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.569f, 9.0f, 17.636f, 9.005f, 17.702f, 9.014f)
                curveTo(18.312f, 7.442f, 17.986f, 5.587f, 16.724f, 4.312f)
                curveTo(15.025f, 2.597f, 12.281f, 2.588f, 10.589f, 4.297f)
                lineTo(9.993f, 4.9f)
                lineTo(9.388f, 4.29f)
                close()
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
                moveTo(9.877f, 13.995f)
                curveTo(9.926f, 13.999f, 9.974f, 14.001f, 10.022f, 14.0f)
                curveTo(10.008f, 14.165f, 10.0f, 14.331f, 10.0f, 14.5f)
                curveTo(10.0f, 15.32f, 10.18f, 16.098f, 10.502f, 16.798f)
                lineTo(10.497f, 16.803f)
                curveTo(10.236f, 17.066f, 9.814f, 17.066f, 9.554f, 16.803f)
                lineTo(4.799f, 12.0f)
                horizontalLineTo(5.8f)
                curveTo(6.402f, 12.0f, 6.945f, 11.641f, 7.181f, 11.087f)
                lineTo(7.486f, 10.367f)
                lineTo(8.615f, 13.077f)
                curveTo(8.831f, 13.595f, 9.318f, 13.949f, 9.877f, 13.995f)
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
        Image(imageVector = FluentIcons.Filled.HeartPulseCheckmark, contentDescription = null)
    }
}

