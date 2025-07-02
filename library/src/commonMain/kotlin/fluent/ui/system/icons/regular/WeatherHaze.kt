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
 * WeatherHaze icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: weather, haze
 * - Source: ic_fluent_weather_haze_24_regular.svg
 * 
 * @return The [ImageVector] for the WeatherHaze icon.
 */
public val FluentIcons.Regular.WeatherHaze: ImageVector
    get() {
        if (_weatherHaze != null) {
            return _weatherHaze!!
        }
        _weatherHaze = Builder(name = "WeatherHaze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.842f, 13.984f)
                curveTo(7.376f, 13.909f, 7.899f, 13.912f, 8.421f, 13.985f)
                curveTo(8.466f, 13.991f, 8.51f, 13.998f, 8.555f, 14.005f)
                curveTo(9.848f, 14.215f, 11.077f, 14.843f, 12.378f, 15.602f)
                curveTo(14.735f, 16.977f, 17.324f, 16.704f, 18.814f, 15.639f)
                curveTo(19.151f, 15.399f, 19.62f, 15.477f, 19.861f, 15.814f)
                curveTo(20.101f, 16.151f, 20.023f, 16.619f, 19.686f, 16.86f)
                curveTo(17.677f, 18.296f, 14.447f, 18.545f, 11.622f, 16.898f)
                curveTo(10.333f, 16.145f, 9.311f, 15.648f, 8.315f, 15.486f)
                curveTo(7.358f, 15.33f, 6.36f, 15.476f, 5.109f, 16.158f)
                curveTo(4.746f, 16.357f, 4.29f, 16.223f, 4.092f, 15.859f)
                curveTo(3.893f, 15.495f, 4.027f, 15.04f, 4.391f, 14.842f)
                curveTo(5.252f, 14.372f, 6.059f, 14.094f, 6.842f, 13.984f)
                close()
                moveTo(8.113f, 10.95f)
                curveTo(8.113f, 10.95f, 8.113f, 10.95f, 8.113f, 10.95f)
                curveTo(7.601f, 10.905f, 7.086f, 10.929f, 6.56f, 11.03f)
                curveTo(6.56f, 11.03f, 6.56f, 11.03f, 6.56f, 11.03f)
                curveTo(5.865f, 11.162f, 5.149f, 11.427f, 4.39f, 11.841f)
                curveTo(4.027f, 12.039f, 3.893f, 12.495f, 4.091f, 12.858f)
                curveTo(4.289f, 13.222f, 4.745f, 13.356f, 5.109f, 13.158f)
                curveTo(6.36f, 12.475f, 7.357f, 12.33f, 8.314f, 12.485f)
                curveTo(9.311f, 12.647f, 10.332f, 13.145f, 11.622f, 13.897f)
                curveTo(14.446f, 15.545f, 17.676f, 15.295f, 19.685f, 13.859f)
                curveTo(20.022f, 13.619f, 20.101f, 13.15f, 19.86f, 12.813f)
                curveTo(19.619f, 12.476f, 19.15f, 12.398f, 18.813f, 12.639f)
                curveTo(18.405f, 12.931f, 17.913f, 13.163f, 17.366f, 13.319f)
                curveTo(17.366f, 13.319f, 17.366f, 13.318f, 17.366f, 13.319f)
                curveTo(16.858f, 13.463f, 16.302f, 13.54f, 15.721f, 13.537f)
                curveTo(15.721f, 13.536f, 15.721f, 13.537f, 15.721f, 13.537f)
                curveTo(14.648f, 13.53f, 13.487f, 13.248f, 12.377f, 12.601f)
                curveTo(11.076f, 11.842f, 9.847f, 11.215f, 8.554f, 11.005f)
                curveTo(8.407f, 10.981f, 8.26f, 10.962f, 8.113f, 10.95f)
                close()
                moveTo(17.525f, 12.0f)
                curveTo(17.525f, 12.07f, 17.523f, 12.14f, 17.521f, 12.209f)
                curveTo(17.074f, 12.39f, 16.554f, 12.506f, 15.99f, 12.531f)
                curveTo(16.013f, 12.358f, 16.025f, 12.18f, 16.025f, 12.0f)
                curveTo(16.025f, 9.777f, 14.223f, 7.975f, 12.0f, 7.975f)
                curveTo(10.51f, 7.975f, 9.209f, 8.784f, 8.513f, 9.988f)
                curveTo(7.961f, 9.914f, 7.411f, 9.908f, 6.858f, 9.973f)
                curveTo(7.667f, 7.924f, 9.664f, 6.475f, 12.0f, 6.475f)
                curveTo(15.051f, 6.475f, 17.525f, 8.948f, 17.525f, 12.0f)
                close()
                moveTo(12.122f, 22.0f)
                curveTo(12.081f, 22.007f, 12.039f, 22.01f, 11.996f, 22.01f)
                curveTo(11.953f, 22.01f, 11.911f, 22.007f, 11.87f, 22.0f)
                horizontalLineTo(12.122f)
                close()
                moveTo(5.974f, 4.941f)
                lineTo(5.89f, 4.868f)
                curveTo(5.596f, 4.65f, 5.179f, 4.674f, 4.913f, 4.941f)
                curveTo(4.62f, 5.234f, 4.62f, 5.709f, 4.913f, 6.001f)
                lineTo(5.974f, 7.062f)
                lineTo(6.058f, 7.135f)
                curveTo(6.351f, 7.353f, 6.768f, 7.328f, 7.034f, 7.062f)
                curveTo(7.327f, 6.769f, 7.327f, 6.294f, 7.034f, 6.001f)
                lineTo(5.974f, 4.941f)
                close()
                moveTo(19.151f, 5.917f)
                curveTo(19.369f, 5.624f, 19.344f, 5.207f, 19.078f, 4.941f)
                curveTo(18.785f, 4.648f, 18.31f, 4.648f, 18.018f, 4.941f)
                lineTo(16.957f, 6.001f)
                lineTo(16.884f, 6.086f)
                curveTo(16.666f, 6.379f, 16.691f, 6.796f, 16.957f, 7.062f)
                curveTo(17.25f, 7.355f, 17.725f, 7.355f, 18.018f, 7.062f)
                lineTo(19.078f, 6.001f)
                lineTo(19.151f, 5.917f)
                close()
                moveTo(12.743f, 2.637f)
                curveTo(12.693f, 2.271f, 12.38f, 1.989f, 12.0f, 1.989f)
                curveTo(11.586f, 1.989f, 11.25f, 2.325f, 11.25f, 2.739f)
                verticalLineTo(4.239f)
                lineTo(11.257f, 4.341f)
                curveTo(11.306f, 4.707f, 11.62f, 4.989f, 12.0f, 4.989f)
                curveTo(12.414f, 4.989f, 12.75f, 4.653f, 12.75f, 4.239f)
                verticalLineTo(2.739f)
                lineTo(12.743f, 2.637f)
                close()
                moveTo(5.109f, 19.158f)
                curveTo(6.36f, 18.476f, 7.358f, 18.33f, 8.315f, 18.486f)
                curveTo(9.311f, 18.648f, 10.333f, 19.145f, 11.622f, 19.898f)
                curveTo(14.447f, 21.545f, 17.677f, 21.296f, 19.686f, 19.86f)
                curveTo(20.023f, 19.619f, 20.101f, 19.151f, 19.861f, 18.814f)
                curveTo(19.62f, 18.477f, 19.151f, 18.399f, 18.814f, 18.639f)
                curveTo(17.324f, 19.704f, 14.735f, 19.977f, 12.378f, 18.602f)
                curveTo(11.077f, 17.843f, 9.848f, 17.215f, 8.555f, 17.005f)
                curveTo(7.222f, 16.789f, 5.89f, 17.024f, 4.391f, 17.841f)
                curveTo(4.027f, 18.04f, 3.893f, 18.496f, 4.092f, 18.859f)
                curveTo(4.29f, 19.223f, 4.746f, 19.357f, 5.109f, 19.158f)
                close()
            }
        }
        .build()
        return _weatherHaze!!
    }

@Suppress("ObjectPropertyName")
private var _weatherHaze: ImageVector? = null

@Preview
@Composable
private fun WeatherHazePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherHaze, contentDescription = null)
    }
}

