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
 * WeatherSnowflake Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_snowflake_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherSnowflake icon.
 */
public val FluentIcons.Regular.WeatherSnowflake: ImageVector
    get() {
        if (_weatherSnowflake != null) {
            return _weatherSnowflake!!
        }
        _weatherSnowflake = Builder(name = "WeatherSnowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 2.0f)
                curveTo(12.164f, 2.0f, 12.5f, 2.336f, 12.5f, 2.75f)
                verticalLineTo(5.905f)
                lineTo(14.634f, 3.771f)
                curveTo(14.926f, 3.478f, 15.401f, 3.478f, 15.694f, 3.771f)
                curveTo(15.987f, 4.064f, 15.987f, 4.539f, 15.694f, 4.832f)
                lineTo(12.5f, 8.026f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.474f)
                lineTo(18.668f, 7.806f)
                curveTo(18.961f, 7.513f, 19.436f, 7.513f, 19.729f, 7.806f)
                curveTo(20.021f, 8.099f, 20.021f, 8.574f, 19.729f, 8.867f)
                lineTo(17.595f, 11.0f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 11.0f, 21.5f, 11.336f, 21.5f, 11.75f)
                curveTo(21.5f, 12.164f, 21.164f, 12.5f, 20.75f, 12.5f)
                horizontalLineTo(17.595f)
                lineTo(19.729f, 14.634f)
                curveTo(20.021f, 14.926f, 20.021f, 15.401f, 19.729f, 15.694f)
                curveTo(19.436f, 15.987f, 18.961f, 15.987f, 18.668f, 15.694f)
                lineTo(15.474f, 12.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(15.474f)
                lineTo(15.694f, 18.668f)
                curveTo(15.987f, 18.961f, 15.987f, 19.436f, 15.694f, 19.729f)
                curveTo(15.401f, 20.021f, 14.926f, 20.021f, 14.634f, 19.729f)
                lineTo(12.5f, 17.595f)
                verticalLineTo(20.75f)
                curveTo(12.5f, 21.164f, 12.164f, 21.5f, 11.75f, 21.5f)
                curveTo(11.336f, 21.5f, 11.0f, 21.164f, 11.0f, 20.75f)
                verticalLineTo(17.595f)
                lineTo(8.867f, 19.729f)
                curveTo(8.574f, 20.021f, 8.099f, 20.021f, 7.806f, 19.729f)
                curveTo(7.513f, 19.436f, 7.513f, 18.961f, 7.806f, 18.668f)
                lineTo(11.0f, 15.474f)
                verticalLineTo(12.5f)
                horizontalLineTo(8.026f)
                lineTo(4.832f, 15.694f)
                curveTo(4.539f, 15.987f, 4.064f, 15.987f, 3.771f, 15.694f)
                curveTo(3.478f, 15.401f, 3.478f, 14.926f, 3.771f, 14.634f)
                lineTo(5.905f, 12.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.5f, 2.0f, 12.164f, 2.0f, 11.75f)
                curveTo(2.0f, 11.336f, 2.336f, 11.0f, 2.75f, 11.0f)
                horizontalLineTo(5.905f)
                lineTo(3.771f, 8.867f)
                curveTo(3.478f, 8.574f, 3.478f, 8.099f, 3.771f, 7.806f)
                curveTo(4.064f, 7.513f, 4.539f, 7.513f, 4.832f, 7.806f)
                lineTo(8.026f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.026f)
                lineTo(7.806f, 4.832f)
                curveTo(7.513f, 4.539f, 7.513f, 4.064f, 7.806f, 3.771f)
                curveTo(8.099f, 3.478f, 8.574f, 3.478f, 8.867f, 3.771f)
                lineTo(11.0f, 5.905f)
                verticalLineTo(2.75f)
                curveTo(11.0f, 2.336f, 11.336f, 2.0f, 11.75f, 2.0f)
                close()
            }
        }
        .build()
        return _weatherSnowflake!!
    }

@Suppress("ObjectPropertyName")
private var _weatherSnowflake: ImageVector? = null

@Preview
@Composable
private fun WeatherSnowflakePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherSnowflake, contentDescription = "WeatherSnowflake Icon")
    }
}

