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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.WeatherHaze: ImageVector
    get() {
        if (_WeatherHaze != null) {
            return _WeatherHaze!!
        }
        _WeatherHaze = ImageVector.Builder(
            name = "Filled.WeatherHaze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.842f, 13.984f)
                curveTo(7.376f, 13.909f, 7.9f, 13.912f, 8.423f, 13.985f)
                curveTo(8.467f, 13.991f, 8.511f, 13.998f, 8.555f, 14.005f)
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
                moveTo(9.64f, 11.277f)
                curveTo(9.281f, 11.157f, 8.92f, 11.064f, 8.554f, 11.004f)
                curveTo(7.895f, 10.897f, 7.238f, 10.901f, 6.56f, 11.03f)
                curveTo(6.56f, 11.03f, 6.56f, 11.03f, 6.56f, 11.03f)
                curveTo(5.865f, 11.162f, 5.149f, 11.427f, 4.39f, 11.841f)
                curveTo(4.027f, 12.039f, 3.893f, 12.495f, 4.091f, 12.858f)
                curveTo(4.289f, 13.222f, 4.745f, 13.356f, 5.109f, 13.158f)
                curveTo(6.36f, 12.475f, 7.357f, 12.33f, 8.314f, 12.485f)
                curveTo(8.592f, 12.531f, 8.872f, 12.602f, 9.16f, 12.698f)
                curveTo(9.902f, 12.945f, 10.691f, 13.355f, 11.621f, 13.897f)
                curveTo(11.681f, 13.932f, 11.742f, 13.966f, 11.802f, 14f)
                curveTo(14.583f, 15.533f, 17.719f, 15.264f, 19.685f, 13.859f)
                curveTo(20.022f, 13.619f, 20.101f, 13.15f, 19.86f, 12.813f)
                curveTo(19.619f, 12.476f, 19.15f, 12.398f, 18.813f, 12.639f)
                curveTo(18.405f, 12.931f, 17.913f, 13.163f, 17.366f, 13.319f)
                curveTo(17.366f, 13.319f, 17.366f, 13.318f, 17.366f, 13.319f)
                curveTo(16.285f, 13.626f, 14.988f, 13.63f, 13.688f, 13.196f)
                curveTo(13.249f, 13.05f, 12.809f, 12.853f, 12.377f, 12.601f)
                curveTo(11.444f, 12.057f, 10.549f, 11.581f, 9.64f, 11.277f)
                close()
                moveTo(17.525f, 12f)
                curveTo(17.525f, 12.07f, 17.523f, 12.14f, 17.521f, 12.209f)
                curveTo(16.312f, 12.698f, 14.557f, 12.715f, 12.88f, 11.737f)
                curveTo(11.571f, 10.973f, 10.204f, 10.259f, 8.714f, 10.017f)
                curveTo(8.094f, 9.917f, 7.478f, 9.9f, 6.858f, 9.973f)
                curveTo(7.667f, 7.924f, 9.664f, 6.475f, 12f, 6.475f)
                curveTo(15.051f, 6.475f, 17.525f, 8.948f, 17.525f, 12f)
                close()
                moveTo(12.122f, 22f)
                curveTo(12.081f, 22.007f, 12.039f, 22.01f, 11.996f, 22.01f)
                curveTo(11.953f, 22.01f, 11.911f, 22.007f, 11.87f, 22f)
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
                curveTo(12.693f, 2.271f, 12.38f, 1.989f, 12f, 1.989f)
                curveTo(11.586f, 1.989f, 11.25f, 2.325f, 11.25f, 2.739f)
                verticalLineTo(4.239f)
                lineTo(11.257f, 4.341f)
                curveTo(11.306f, 4.707f, 11.62f, 4.989f, 12f, 4.989f)
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
        }.build()

        return _WeatherHaze!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherHaze: ImageVector? = null

@Preview
@Composable
private fun WeatherHazePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherHaze, contentDescription = null)
    }
}
