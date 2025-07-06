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
 * WeatherDuststorm Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent current weather.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_weather_duststorm_24_regular.svg)
 * 
 * @return The [ImageVector] for the WeatherDuststorm icon.
 */
public val FluentIcons.Regular.WeatherDuststorm: ImageVector
    get() {
        if (_weatherDuststorm != null) {
            return _weatherDuststorm!!
        }
        _weatherDuststorm = Builder(name = "WeatherDuststorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.5f)
                curveTo(5.0f, 5.224f, 4.776f, 5.0f, 4.5f, 5.0f)
                curveTo(4.224f, 5.0f, 4.0f, 5.224f, 4.0f, 5.5f)
                curveTo(4.0f, 5.776f, 4.224f, 6.0f, 4.5f, 6.0f)
                curveTo(4.776f, 6.0f, 5.0f, 5.776f, 5.0f, 5.5f)
                close()
                moveTo(6.5f, 5.5f)
                curveTo(6.5f, 6.605f, 5.605f, 7.5f, 4.5f, 7.5f)
                curveTo(3.395f, 7.5f, 2.5f, 6.605f, 2.5f, 5.5f)
                curveTo(2.5f, 4.395f, 3.395f, 3.5f, 4.5f, 3.5f)
                curveTo(5.605f, 3.5f, 6.5f, 4.395f, 6.5f, 5.5f)
                close()
                moveTo(11.973f, 4.0f)
                curveTo(10.191f, 4.0f, 8.592f, 5.167f, 8.077f, 6.884f)
                lineTo(8.032f, 7.034f)
                curveTo(7.913f, 7.431f, 8.138f, 7.849f, 8.534f, 7.968f)
                curveTo(8.931f, 8.087f, 9.349f, 7.862f, 9.468f, 7.466f)
                lineTo(9.513f, 7.315f)
                curveTo(9.835f, 6.243f, 10.843f, 5.5f, 11.973f, 5.5f)
                curveTo(13.362f, 5.5f, 14.5f, 6.627f, 14.5f, 8.0f)
                curveTo(14.5f, 9.381f, 13.381f, 10.5f, 12.0f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.5f, 2.0f, 10.836f, 2.0f, 11.25f)
                curveTo(2.0f, 11.664f, 2.336f, 12.0f, 2.75f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 12.0f, 16.0f, 10.209f, 16.0f, 8.0f)
                curveTo(16.0f, 5.783f, 14.174f, 4.0f, 11.973f, 4.0f)
                close()
                moveTo(19.071f, 10.0f)
                curveTo(17.806f, 10.0f, 16.686f, 10.821f, 16.288f, 12.013f)
                curveTo(16.157f, 12.406f, 16.37f, 12.83f, 16.763f, 12.962f)
                curveTo(17.156f, 13.092f, 17.58f, 12.88f, 17.712f, 12.487f)
                curveTo(17.907f, 11.9f, 18.46f, 11.5f, 19.071f, 11.5f)
                curveTo(19.86f, 11.5f, 20.5f, 12.14f, 20.5f, 12.929f)
                verticalLineTo(13.0f)
                curveTo(20.5f, 13.828f, 19.828f, 14.5f, 19.0f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.5f, 2.0f, 14.836f, 2.0f, 15.25f)
                curveTo(2.0f, 15.664f, 2.336f, 16.0f, 2.75f, 16.0f)
                horizontalLineTo(12.246f)
                lineTo(12.25f, 16.0f)
                horizontalLineTo(15.25f)
                curveTo(15.94f, 16.0f, 16.5f, 16.56f, 16.5f, 17.25f)
                curveTo(16.5f, 17.94f, 15.94f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(15.115f)
                curveTo(14.715f, 18.5f, 14.35f, 18.274f, 14.17f, 17.917f)
                curveTo(13.985f, 17.547f, 13.534f, 17.397f, 13.164f, 17.583f)
                curveTo(12.793f, 17.769f, 12.644f, 18.219f, 12.83f, 18.59f)
                curveTo(13.263f, 19.454f, 14.148f, 20.0f, 15.115f, 20.0f)
                horizontalLineTo(15.25f)
                curveTo(16.769f, 20.0f, 18.0f, 18.769f, 18.0f, 17.25f)
                curveTo(18.0f, 16.8f, 17.892f, 16.375f, 17.7f, 16.0f)
                horizontalLineTo(19.0f)
                curveTo(20.656f, 16.0f, 22.0f, 14.657f, 22.0f, 13.0f)
                verticalLineTo(12.929f)
                curveTo(22.0f, 11.311f, 20.688f, 10.0f, 19.071f, 10.0f)
                close()
                moveTo(9.5f, 20.0f)
                curveTo(9.224f, 20.0f, 9.0f, 19.776f, 9.0f, 19.5f)
                curveTo(9.0f, 19.224f, 9.224f, 19.0f, 9.5f, 19.0f)
                curveTo(9.776f, 19.0f, 10.0f, 19.224f, 10.0f, 19.5f)
                curveTo(10.0f, 19.776f, 9.776f, 20.0f, 9.5f, 20.0f)
                close()
                moveTo(9.5f, 21.5f)
                curveTo(10.605f, 21.5f, 11.5f, 20.605f, 11.5f, 19.5f)
                curveTo(11.5f, 18.395f, 10.605f, 17.5f, 9.5f, 17.5f)
                curveTo(8.395f, 17.5f, 7.5f, 18.395f, 7.5f, 19.5f)
                curveTo(7.5f, 20.605f, 8.395f, 21.5f, 9.5f, 21.5f)
                close()
                moveTo(20.0f, 6.5f)
                curveTo(20.0f, 6.224f, 19.776f, 6.0f, 19.5f, 6.0f)
                curveTo(19.224f, 6.0f, 19.0f, 6.224f, 19.0f, 6.5f)
                curveTo(19.0f, 6.776f, 19.224f, 7.0f, 19.5f, 7.0f)
                curveTo(19.776f, 7.0f, 20.0f, 6.776f, 20.0f, 6.5f)
                close()
                moveTo(21.5f, 6.5f)
                curveTo(21.5f, 7.605f, 20.605f, 8.5f, 19.5f, 8.5f)
                curveTo(18.395f, 8.5f, 17.5f, 7.605f, 17.5f, 6.5f)
                curveTo(17.5f, 5.395f, 18.395f, 4.5f, 19.5f, 4.5f)
                curveTo(20.605f, 4.5f, 21.5f, 5.395f, 21.5f, 6.5f)
                close()
            }
        }
        .build()
        return _weatherDuststorm!!
    }

@Suppress("ObjectPropertyName")
private var _weatherDuststorm: ImageVector? = null

@Preview
@Composable
private fun WeatherDuststormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WeatherDuststorm, contentDescription = "WeatherDuststorm Icon")
    }
}

