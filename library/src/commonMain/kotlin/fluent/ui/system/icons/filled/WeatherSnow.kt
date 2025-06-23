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

public val FluentIcons.Filled.WeatherSnow: ImageVector
    get() {
        if (_WeatherSnow != null) {
            return _WeatherSnow!!
        }
        _WeatherSnow = ImageVector.Builder(
            name = "Filled.WeatherSnow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 18.152f)
                curveTo(10.164f, 18.152f, 10.5f, 18.487f, 10.5f, 18.902f)
                curveTo(10.5f, 19.316f, 10.164f, 19.652f, 9.75f, 19.652f)
                curveTo(9.336f, 19.652f, 9f, 19.316f, 9f, 18.902f)
                curveTo(9f, 18.487f, 9.336f, 18.152f, 9.75f, 18.152f)
                close()
                moveTo(14.25f, 18.152f)
                curveTo(14.664f, 18.152f, 15f, 18.487f, 15f, 18.902f)
                curveTo(15f, 19.316f, 14.664f, 19.652f, 14.25f, 19.652f)
                curveTo(13.836f, 19.652f, 13.5f, 19.316f, 13.5f, 18.902f)
                curveTo(13.5f, 18.487f, 13.836f, 18.152f, 14.25f, 18.152f)
                close()
                moveTo(7.5f, 17.152f)
                curveTo(7.914f, 17.152f, 8.25f, 17.487f, 8.25f, 17.902f)
                curveTo(8.25f, 18.316f, 7.914f, 18.652f, 7.5f, 18.652f)
                curveTo(7.086f, 18.652f, 6.75f, 18.316f, 6.75f, 17.902f)
                curveTo(6.75f, 17.487f, 7.086f, 17.152f, 7.5f, 17.152f)
                close()
                moveTo(12f, 17.152f)
                curveTo(12.414f, 17.152f, 12.75f, 17.487f, 12.75f, 17.902f)
                curveTo(12.75f, 18.316f, 12.414f, 18.652f, 12f, 18.652f)
                curveTo(11.586f, 18.652f, 11.25f, 18.316f, 11.25f, 17.902f)
                curveTo(11.25f, 17.487f, 11.586f, 17.152f, 12f, 17.152f)
                close()
                moveTo(16.5f, 17.152f)
                curveTo(16.914f, 17.152f, 17.25f, 17.487f, 17.25f, 17.902f)
                curveTo(17.25f, 18.316f, 16.914f, 18.652f, 16.5f, 18.652f)
                curveTo(16.086f, 18.652f, 15.75f, 18.316f, 15.75f, 17.902f)
                curveTo(15.75f, 17.487f, 16.086f, 17.152f, 16.5f, 17.152f)
                close()
                moveTo(12f, 4.001f)
                curveTo(15.168f, 4.001f, 16.966f, 6.098f, 17.227f, 8.631f)
                lineTo(17.307f, 8.631f)
                curveTo(19.346f, 8.631f, 20.999f, 10.28f, 20.999f, 12.314f)
                curveTo(20.999f, 14.347f, 19.346f, 15.996f, 17.307f, 15.996f)
                horizontalLineTo(6.693f)
                curveTo(4.653f, 15.996f, 3f, 14.347f, 3f, 12.314f)
                curveTo(3f, 10.28f, 4.653f, 8.631f, 6.693f, 8.631f)
                lineTo(6.773f, 8.631f)
                curveTo(7.035f, 6.082f, 8.831f, 4.001f, 12f, 4.001f)
                close()
            }
        }.build()

        return _WeatherSnow!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherSnow: ImageVector? = null

@Preview
@Composable
private fun WeatherSnowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherSnow, contentDescription = null)
    }
}
