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
 * WeatherMoon icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, moon
 * - Source: ic_fluent_weather_moon_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherMoon icon.
 */
public val FluentIcons.Regular.WeatherMoon: ImageVector
    get() {
        if (_weatherMoon != null) {
            return _weatherMoon!!
        }
        _weatherMoon = Builder(name = "WeatherMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.026f, 17.001f)
                curveTo(17.264f, 21.785f, 11.147f, 23.424f, 6.363f, 20.662f)
                curveTo(5.061f, 19.91f, 3.964f, 18.893f, 3.129f, 17.68f)
                curveTo(2.849f, 17.274f, 3.03f, 16.714f, 3.494f, 16.548f)
                curveTo(7.261f, 15.2f, 9.279f, 13.637f, 10.45f, 11.402f)
                curveTo(11.682f, 9.049f, 12.001f, 6.472f, 11.139f, 2.939f)
                curveTo(11.019f, 2.45f, 11.405f, 1.985f, 11.908f, 2.012f)
                curveTo(13.465f, 2.095f, 14.986f, 2.543f, 16.365f, 3.339f)
                curveTo(21.149f, 6.101f, 22.788f, 12.218f, 20.026f, 17.001f)
                close()
                moveTo(11.778f, 12.098f)
                curveTo(10.527f, 14.487f, 8.467f, 16.197f, 4.961f, 17.597f)
                curveTo(5.569f, 18.293f, 6.293f, 18.889f, 7.113f, 19.363f)
                curveTo(11.18f, 21.711f, 16.379f, 20.318f, 18.727f, 16.251f)
                curveTo(21.074f, 12.185f, 19.681f, 6.986f, 15.615f, 4.638f)
                curveTo(14.738f, 4.132f, 13.795f, 3.792f, 12.823f, 3.623f)
                curveTo(13.47f, 7.007f, 13.052f, 9.666f, 11.778f, 12.098f)
                close()
            }
        }
        .build()
        return _weatherMoon!!
    }

@Suppress("ObjectPropertyName")
private var _weatherMoon: ImageVector? = null

@Preview
@Composable
private fun WeatherMoonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherMoon, contentDescription = null)
    }
}

