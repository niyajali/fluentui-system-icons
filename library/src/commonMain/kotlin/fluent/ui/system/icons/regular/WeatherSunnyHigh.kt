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
 * WeatherSunnyHigh Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_sunny_high_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherSunnyHigh icon.
 */
public val FluentIcons.Regular.WeatherSunnyHigh: ImageVector
    get() {
        if (_weatherSunnyHigh != null) {
            return _weatherSunnyHigh!!
        }
        _weatherSunnyHigh = Builder(name = "WeatherSunnyHigh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.414f, 2.0f, 12.75f, 2.336f, 12.75f, 2.75f)
                verticalLineTo(3.25f)
                curveTo(12.75f, 3.664f, 12.414f, 4.0f, 12.0f, 4.0f)
                curveTo(11.586f, 4.0f, 11.25f, 3.664f, 11.25f, 3.25f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.336f, 11.586f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(9.791f, 5.0f, 8.0f, 6.791f, 8.0f, 9.0f)
                curveTo(8.0f, 11.209f, 9.791f, 13.0f, 12.0f, 13.0f)
                curveTo(14.209f, 13.0f, 16.0f, 11.209f, 16.0f, 9.0f)
                curveTo(16.0f, 6.791f, 14.209f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(9.5f, 9.0f)
                curveTo(9.5f, 7.619f, 10.619f, 6.5f, 12.0f, 6.5f)
                curveTo(13.381f, 6.5f, 14.5f, 7.619f, 14.5f, 9.0f)
                curveTo(14.5f, 10.381f, 13.381f, 11.5f, 12.0f, 11.5f)
                curveTo(10.619f, 11.5f, 9.5f, 10.381f, 9.5f, 9.0f)
                close()
                moveTo(12.75f, 14.75f)
                curveTo(12.75f, 14.336f, 12.414f, 14.0f, 12.0f, 14.0f)
                curveTo(11.586f, 14.0f, 11.25f, 14.336f, 11.25f, 14.75f)
                verticalLineTo(15.25f)
                curveTo(11.25f, 15.664f, 11.586f, 16.0f, 12.0f, 16.0f)
                curveTo(12.414f, 16.0f, 12.75f, 15.664f, 12.75f, 15.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(5.75f, 8.0f)
                curveTo(5.336f, 8.0f, 5.0f, 8.336f, 5.0f, 8.75f)
                curveTo(5.0f, 9.164f, 5.336f, 9.5f, 5.75f, 9.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 9.5f, 7.0f, 9.164f, 7.0f, 8.75f)
                curveTo(7.0f, 8.336f, 6.664f, 8.0f, 6.25f, 8.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(17.0f, 8.75f)
                curveTo(17.0f, 8.336f, 17.336f, 8.0f, 17.75f, 8.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 8.0f, 19.0f, 8.336f, 19.0f, 8.75f)
                curveTo(19.0f, 9.164f, 18.664f, 9.5f, 18.25f, 9.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 9.5f, 17.0f, 9.164f, 17.0f, 8.75f)
                close()
                moveTo(6.72f, 5.78f)
                curveTo(7.013f, 6.073f, 7.487f, 6.073f, 7.78f, 5.78f)
                curveTo(8.073f, 5.487f, 8.073f, 5.013f, 7.78f, 4.72f)
                lineTo(7.28f, 4.22f)
                curveTo(6.987f, 3.927f, 6.513f, 3.927f, 6.22f, 4.22f)
                curveTo(5.927f, 4.513f, 5.927f, 4.987f, 6.22f, 5.28f)
                lineTo(6.72f, 5.78f)
                close()
                moveTo(7.78f, 12.22f)
                curveTo(7.487f, 11.927f, 7.013f, 11.927f, 6.72f, 12.22f)
                lineTo(6.22f, 12.72f)
                curveTo(5.927f, 13.013f, 5.927f, 13.487f, 6.22f, 13.78f)
                curveTo(6.513f, 14.073f, 6.987f, 14.073f, 7.28f, 13.78f)
                lineTo(7.78f, 13.28f)
                curveTo(8.073f, 12.987f, 8.073f, 12.513f, 7.78f, 12.22f)
                close()
                moveTo(17.28f, 5.78f)
                curveTo(16.987f, 6.073f, 16.513f, 6.073f, 16.22f, 5.78f)
                curveTo(15.927f, 5.487f, 15.927f, 5.013f, 16.22f, 4.72f)
                lineTo(16.72f, 4.22f)
                curveTo(17.013f, 3.927f, 17.487f, 3.927f, 17.78f, 4.22f)
                curveTo(18.073f, 4.513f, 18.073f, 4.987f, 17.78f, 5.28f)
                lineTo(17.28f, 5.78f)
                close()
                moveTo(16.22f, 12.22f)
                curveTo(16.513f, 11.927f, 16.987f, 11.927f, 17.28f, 12.22f)
                lineTo(17.78f, 12.72f)
                curveTo(18.073f, 13.013f, 18.073f, 13.487f, 17.78f, 13.78f)
                curveTo(17.487f, 14.073f, 17.013f, 14.073f, 16.72f, 13.78f)
                lineTo(16.22f, 13.28f)
                curveTo(15.927f, 12.987f, 15.927f, 12.513f, 16.22f, 12.22f)
                close()
                moveTo(3.218f, 21.836f)
                curveTo(2.895f, 22.094f, 2.423f, 22.042f, 2.164f, 21.719f)
                curveTo(1.756f, 21.208f, 2.283f, 20.664f, 2.283f, 20.664f)
                lineTo(2.284f, 20.663f)
                lineTo(2.299f, 20.65f)
                curveTo(2.309f, 20.643f, 2.322f, 20.633f, 2.339f, 20.62f)
                curveTo(2.372f, 20.594f, 2.42f, 20.558f, 2.482f, 20.514f)
                curveTo(2.606f, 20.424f, 2.785f, 20.299f, 3.016f, 20.15f)
                curveTo(3.479f, 19.853f, 4.15f, 19.461f, 4.998f, 19.069f)
                curveTo(6.693f, 18.287f, 9.114f, 17.5f, 12.0f, 17.5f)
                curveTo(14.886f, 17.5f, 17.307f, 18.287f, 19.002f, 19.069f)
                curveTo(19.851f, 19.461f, 20.522f, 19.853f, 20.984f, 20.15f)
                curveTo(21.215f, 20.299f, 21.394f, 20.424f, 21.518f, 20.514f)
                curveTo(21.58f, 20.558f, 21.628f, 20.594f, 21.662f, 20.62f)
                curveTo(21.678f, 20.633f, 21.691f, 20.643f, 21.701f, 20.65f)
                lineTo(21.713f, 20.66f)
                lineTo(21.716f, 20.663f)
                lineTo(21.719f, 20.664f)
                curveTo(22.042f, 20.923f, 22.094f, 21.395f, 21.836f, 21.719f)
                curveTo(21.577f, 22.042f, 21.105f, 22.094f, 20.782f, 21.836f)
                lineTo(20.777f, 21.832f)
                lineTo(20.752f, 21.813f)
                curveTo(20.728f, 21.794f, 20.69f, 21.766f, 20.638f, 21.729f)
                curveTo(20.535f, 21.654f, 20.379f, 21.545f, 20.173f, 21.412f)
                curveTo(19.76f, 21.147f, 19.15f, 20.789f, 18.373f, 20.431f)
                curveTo(16.818f, 19.713f, 14.614f, 19.0f, 12.0f, 19.0f)
                curveTo(9.386f, 19.0f, 7.182f, 19.713f, 5.627f, 20.431f)
                curveTo(4.851f, 20.789f, 4.24f, 21.147f, 3.828f, 21.412f)
                curveTo(3.621f, 21.545f, 3.465f, 21.654f, 3.362f, 21.729f)
                curveTo(3.31f, 21.766f, 3.272f, 21.794f, 3.248f, 21.813f)
                lineTo(3.223f, 21.832f)
                lineTo(3.218f, 21.836f)
                close()
            }
        }
        .build()
        return _weatherSunnyHigh!!
    }

@Suppress("ObjectPropertyName")
private var _weatherSunnyHigh: ImageVector? = null

@Preview
@Composable
private fun WeatherSunnyHighPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherSunnyHigh, contentDescription = "WeatherSunnyHigh Icon")
    }
}

