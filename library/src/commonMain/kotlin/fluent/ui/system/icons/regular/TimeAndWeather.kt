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
 * TimeAndWeather icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: time, and, weather
 * - Source: ic_fluent_time_and_weather_24_regular.svg
 * 
 * @return The [ImageVector] for the TimeAndWeather icon.
 */
public val FluentIcons.Regular.TimeAndWeather: ImageVector
    get() {
        if (_timeAndWeather != null) {
            return _timeAndWeather!!
        }
        _timeAndWeather = Builder(name = "TimeAndWeather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.996f, 19.01f)
                curveTo(12.376f, 19.01f, 12.689f, 19.292f, 12.739f, 19.659f)
                lineTo(12.746f, 19.76f)
                verticalLineTo(21.26f)
                curveTo(12.746f, 21.674f, 12.41f, 22.01f, 11.996f, 22.01f)
                curveTo(11.616f, 22.01f, 11.302f, 21.728f, 11.253f, 21.362f)
                lineTo(11.246f, 21.26f)
                verticalLineTo(19.76f)
                curveTo(11.246f, 19.346f, 11.582f, 19.01f, 11.996f, 19.01f)
                close()
                moveTo(18.018f, 16.938f)
                lineTo(19.078f, 17.998f)
                curveTo(19.371f, 18.291f, 19.371f, 18.766f, 19.078f, 19.059f)
                curveTo(18.785f, 19.352f, 18.31f, 19.352f, 18.018f, 19.059f)
                lineTo(16.957f, 17.998f)
                curveTo(16.664f, 17.705f, 16.664f, 17.23f, 16.957f, 16.938f)
                curveTo(17.25f, 16.645f, 17.725f, 16.645f, 18.018f, 16.938f)
                close()
                moveTo(7.034f, 16.938f)
                curveTo(7.327f, 17.23f, 7.327f, 17.705f, 7.034f, 17.998f)
                lineTo(5.974f, 19.059f)
                curveTo(5.681f, 19.352f, 5.206f, 19.352f, 4.913f, 19.059f)
                curveTo(4.62f, 18.766f, 4.62f, 18.291f, 4.913f, 17.998f)
                lineTo(5.974f, 16.938f)
                curveTo(6.267f, 16.645f, 6.742f, 16.645f, 7.034f, 16.938f)
                close()
                moveTo(12.0f, 6.475f)
                curveTo(15.051f, 6.475f, 17.525f, 8.948f, 17.525f, 12.0f)
                curveTo(17.525f, 15.051f, 15.051f, 17.525f, 12.0f, 17.525f)
                curveTo(8.948f, 17.525f, 6.475f, 15.051f, 6.475f, 12.0f)
                curveTo(6.475f, 8.948f, 8.948f, 6.475f, 12.0f, 6.475f)
                close()
                moveTo(12.0f, 7.975f)
                curveTo(9.777f, 7.975f, 7.975f, 9.777f, 7.975f, 12.0f)
                curveTo(7.975f, 14.223f, 9.777f, 16.025f, 12.0f, 16.025f)
                curveTo(14.223f, 16.025f, 16.025f, 14.223f, 16.025f, 12.0f)
                curveTo(16.025f, 9.777f, 14.223f, 7.975f, 12.0f, 7.975f)
                close()
                moveTo(11.25f, 9.0f)
                curveTo(11.629f, 9.0f, 11.943f, 9.282f, 11.993f, 9.648f)
                lineTo(12.0f, 9.75f)
                verticalLineTo(12.003f)
                lineTo(13.249f, 12.003f)
                curveTo(13.629f, 12.003f, 13.943f, 12.286f, 13.993f, 12.652f)
                lineTo(13.999f, 12.753f)
                curveTo(13.999f, 13.133f, 13.717f, 13.447f, 13.351f, 13.497f)
                lineTo(13.249f, 13.503f)
                horizontalLineTo(11.25f)
                curveTo(10.87f, 13.503f, 10.556f, 13.221f, 10.507f, 12.855f)
                lineTo(10.5f, 12.753f)
                verticalLineTo(9.75f)
                curveTo(10.5f, 9.336f, 10.835f, 9.0f, 11.25f, 9.0f)
                close()
                moveTo(21.25f, 11.268f)
                curveTo(21.664f, 11.268f, 22.0f, 11.604f, 22.0f, 12.018f)
                curveTo(22.0f, 12.398f, 21.717f, 12.712f, 21.351f, 12.761f)
                lineTo(21.25f, 12.768f)
                horizontalLineTo(19.75f)
                curveTo(19.335f, 12.768f, 19.0f, 12.432f, 19.0f, 12.018f)
                curveTo(19.0f, 11.638f, 19.282f, 11.325f, 19.648f, 11.275f)
                lineTo(19.75f, 11.268f)
                horizontalLineTo(21.25f)
                close()
                moveTo(4.25f, 11.239f)
                curveTo(4.664f, 11.239f, 5.0f, 11.575f, 5.0f, 11.989f)
                curveTo(5.0f, 12.369f, 4.718f, 12.683f, 4.352f, 12.732f)
                lineTo(4.25f, 12.739f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.739f, 2.0f, 12.403f, 2.0f, 11.989f)
                curveTo(2.0f, 11.61f, 2.282f, 11.296f, 2.648f, 11.246f)
                lineTo(2.75f, 11.239f)
                horizontalLineTo(4.25f)
                close()
                moveTo(5.89f, 4.868f)
                lineTo(5.974f, 4.941f)
                lineTo(7.034f, 6.001f)
                curveTo(7.327f, 6.294f, 7.327f, 6.769f, 7.034f, 7.062f)
                curveTo(6.768f, 7.328f, 6.351f, 7.353f, 6.058f, 7.135f)
                lineTo(5.974f, 7.062f)
                lineTo(4.913f, 6.001f)
                curveTo(4.62f, 5.709f, 4.62f, 5.234f, 4.913f, 4.941f)
                curveTo(5.179f, 4.674f, 5.596f, 4.65f, 5.89f, 4.868f)
                close()
                moveTo(19.078f, 4.941f)
                curveTo(19.345f, 5.207f, 19.369f, 5.624f, 19.151f, 5.917f)
                lineTo(19.078f, 6.001f)
                lineTo(18.018f, 7.062f)
                curveTo(17.725f, 7.355f, 17.25f, 7.355f, 16.957f, 7.062f)
                curveTo(16.691f, 6.796f, 16.667f, 6.379f, 16.884f, 6.086f)
                lineTo(16.957f, 6.001f)
                lineTo(18.018f, 4.941f)
                curveTo(18.31f, 4.648f, 18.785f, 4.648f, 19.078f, 4.941f)
                close()
                moveTo(12.0f, 1.989f)
                curveTo(12.38f, 1.989f, 12.693f, 2.271f, 12.743f, 2.637f)
                lineTo(12.75f, 2.739f)
                verticalLineTo(4.239f)
                curveTo(12.75f, 4.653f, 12.414f, 4.989f, 12.0f, 4.989f)
                curveTo(11.62f, 4.989f, 11.307f, 4.707f, 11.257f, 4.341f)
                lineTo(11.25f, 4.239f)
                verticalLineTo(2.739f)
                curveTo(11.25f, 2.325f, 11.586f, 1.989f, 12.0f, 1.989f)
                close()
            }
        }
        .build()
        return _timeAndWeather!!
    }

@Suppress("ObjectPropertyName")
private var _timeAndWeather: ImageVector? = null

@Preview
@Composable
private fun TimeAndWeatherPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TimeAndWeather, contentDescription = null)
    }
}

