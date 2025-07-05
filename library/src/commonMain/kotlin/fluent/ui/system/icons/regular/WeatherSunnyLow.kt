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
 * WeatherSunnyLow Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_sunny_low_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherSunnyLow icon.
 */
public val FluentIcons.Regular.WeatherSunnyLow: ImageVector
    get() {
        if (_weatherSunnyLow != null) {
            return _weatherSunnyLow!!
        }
        _weatherSunnyLow = Builder(name = "WeatherSunnyLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 2.75f)
                curveTo(12.75f, 2.336f, 12.414f, 2.0f, 12.0f, 2.0f)
                curveTo(11.586f, 2.0f, 11.25f, 2.336f, 11.25f, 2.75f)
                verticalLineTo(4.25f)
                curveTo(11.25f, 4.664f, 11.586f, 5.0f, 12.0f, 5.0f)
                curveTo(12.414f, 5.0f, 12.75f, 4.664f, 12.75f, 4.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(19.03f, 4.97f)
                curveTo(19.323f, 5.263f, 19.323f, 5.737f, 19.03f, 6.03f)
                lineTo(17.97f, 7.091f)
                curveTo(17.677f, 7.384f, 17.202f, 7.384f, 16.909f, 7.091f)
                curveTo(16.616f, 6.798f, 16.616f, 6.323f, 16.909f, 6.03f)
                lineTo(17.97f, 4.97f)
                curveTo(18.263f, 4.677f, 18.737f, 4.677f, 19.03f, 4.97f)
                close()
                moveTo(17.409f, 13.0f)
                curveTo(17.469f, 12.676f, 17.5f, 12.342f, 17.5f, 12.0f)
                curveTo(17.5f, 8.962f, 15.038f, 6.5f, 12.0f, 6.5f)
                curveTo(8.962f, 6.5f, 6.5f, 8.962f, 6.5f, 12.0f)
                curveTo(6.5f, 12.342f, 6.531f, 12.676f, 6.591f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 13.336f, 2.0f, 13.75f)
                curveTo(2.0f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 14.5f, 22.0f, 14.164f, 22.0f, 13.75f)
                curveTo(22.0f, 13.336f, 21.664f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(17.409f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                curveTo(16.0f, 12.345f, 15.956f, 12.68f, 15.874f, 13.0f)
                horizontalLineTo(8.126f)
                curveTo(8.044f, 12.68f, 8.0f, 12.345f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(6.0f, 16.75f)
                curveTo(6.0f, 16.336f, 6.336f, 16.0f, 6.75f, 16.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 16.0f, 18.0f, 16.336f, 18.0f, 16.75f)
                curveTo(18.0f, 17.164f, 17.664f, 17.5f, 17.25f, 17.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 17.5f, 6.0f, 17.164f, 6.0f, 16.75f)
                close()
                moveTo(10.0f, 19.75f)
                curveTo(10.0f, 19.336f, 10.336f, 19.0f, 10.75f, 19.0f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 19.0f, 14.0f, 19.336f, 14.0f, 19.75f)
                curveTo(14.0f, 20.164f, 13.664f, 20.5f, 13.25f, 20.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 20.5f, 10.0f, 20.164f, 10.0f, 19.75f)
                close()
                moveTo(4.97f, 4.97f)
                curveTo(5.263f, 4.677f, 5.738f, 4.677f, 6.03f, 4.97f)
                lineTo(7.091f, 6.03f)
                curveTo(7.384f, 6.323f, 7.384f, 6.798f, 7.091f, 7.091f)
                curveTo(6.798f, 7.384f, 6.323f, 7.384f, 6.03f, 7.091f)
                lineTo(4.97f, 6.03f)
                curveTo(4.677f, 5.737f, 4.677f, 5.263f, 4.97f, 4.97f)
                close()
            }
        }
        .build()
        return _weatherSunnyLow!!
    }

@Suppress("ObjectPropertyName")
private var _weatherSunnyLow: ImageVector? = null

@Preview
@Composable
private fun WeatherSunnyLowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherSunnyLow, contentDescription = "WeatherSunnyLow Icon")
    }
}

