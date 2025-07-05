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
 * WeatherFog Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_fog_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherFog icon.
 */
public val FluentIcons.Regular.WeatherFog: ImageVector
    get() {
        if (_weatherFog != null) {
            return _weatherFog!!
        }
        _weatherFog = Builder(name = "WeatherFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.745f, 19.5f)
                horizontalLineTo(16.246f)
                curveTo(16.66f, 19.5f, 16.996f, 19.836f, 16.996f, 20.25f)
                curveTo(16.996f, 20.63f, 16.714f, 20.944f, 16.348f, 20.993f)
                lineTo(16.246f, 21.0f)
                horizontalLineTo(7.745f)
                curveTo(7.331f, 21.0f, 6.995f, 20.664f, 6.995f, 20.25f)
                curveTo(6.995f, 19.87f, 7.277f, 19.557f, 7.643f, 19.507f)
                lineTo(7.745f, 19.5f)
                horizontalLineTo(16.246f)
                horizontalLineTo(7.745f)
                close()
                moveTo(4.75f, 16.519f)
                horizontalLineTo(19.25f)
                curveTo(19.664f, 16.519f, 20.0f, 16.855f, 20.0f, 17.269f)
                curveTo(20.0f, 17.649f, 19.718f, 17.963f, 19.352f, 18.012f)
                lineTo(19.25f, 18.019f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 18.019f, 4.0f, 17.684f, 4.0f, 17.269f)
                curveTo(4.0f, 16.89f, 4.282f, 16.576f, 4.648f, 16.526f)
                lineTo(4.75f, 16.519f)
                close()
                moveTo(12.0f, 3.005f)
                curveTo(15.168f, 3.005f, 16.966f, 5.102f, 17.227f, 7.635f)
                lineTo(17.307f, 7.635f)
                curveTo(19.346f, 7.635f, 20.999f, 9.284f, 20.999f, 11.318f)
                curveTo(20.999f, 13.351f, 19.346f, 15.0f, 17.307f, 15.0f)
                horizontalLineTo(6.693f)
                curveTo(4.653f, 15.0f, 3.0f, 13.351f, 3.0f, 11.318f)
                curveTo(3.0f, 9.284f, 4.653f, 7.635f, 6.693f, 7.635f)
                lineTo(6.773f, 7.635f)
                curveTo(7.035f, 5.086f, 8.831f, 3.005f, 12.0f, 3.005f)
                close()
                moveTo(12.0f, 4.502f)
                curveTo(9.929f, 4.502f, 8.123f, 6.136f, 8.123f, 8.392f)
                curveTo(8.123f, 8.749f, 7.804f, 9.03f, 7.439f, 9.03f)
                lineTo(6.749f, 9.03f)
                curveTo(5.488f, 9.03f, 4.465f, 10.031f, 4.465f, 11.266f)
                curveTo(4.465f, 12.501f, 5.488f, 13.502f, 6.749f, 13.502f)
                horizontalLineTo(17.251f)
                curveTo(18.512f, 13.502f, 19.535f, 12.501f, 19.535f, 11.266f)
                curveTo(19.535f, 10.031f, 18.512f, 9.03f, 17.251f, 9.03f)
                lineTo(16.561f, 9.03f)
                curveTo(16.196f, 9.03f, 15.877f, 8.749f, 15.877f, 8.392f)
                curveTo(15.877f, 6.107f, 14.071f, 4.502f, 12.0f, 4.502f)
                close()
            }
        }
        .build()
        return _weatherFog!!
    }

@Suppress("ObjectPropertyName")
private var _weatherFog: ImageVector? = null

@Preview
@Composable
private fun WeatherFogPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherFog, contentDescription = "WeatherFog Icon")
    }
}

