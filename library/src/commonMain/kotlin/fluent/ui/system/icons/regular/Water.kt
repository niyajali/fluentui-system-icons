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
 * Water icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: water
 * - Source: ic_fluent_water_24_regular.svg
 * 
 * @return The [ImageVector] for the Water icon.
 */
public val FluentIcons.Regular.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(name = "Water", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.379f, 4.0f)
                curveTo(18.69f, 4.0f, 18.969f, 4.192f, 19.08f, 4.482f)
                curveTo(19.64f, 5.944f, 20.689f, 6.497f, 21.25f, 6.497f)
                curveTo(21.664f, 6.497f, 22.0f, 6.832f, 22.0f, 7.247f)
                curveTo(22.0f, 7.661f, 21.664f, 7.997f, 21.25f, 7.997f)
                curveTo(20.248f, 7.997f, 19.163f, 7.386f, 18.377f, 6.31f)
                curveTo(17.563f, 7.403f, 16.406f, 7.997f, 15.19f, 7.997f)
                curveTo(13.973f, 7.997f, 12.814f, 7.402f, 12.0f, 6.308f)
                curveTo(11.186f, 7.402f, 10.027f, 7.997f, 8.81f, 7.997f)
                curveTo(7.595f, 7.997f, 6.437f, 7.404f, 5.624f, 6.311f)
                curveTo(4.838f, 7.388f, 3.753f, 8.0f, 2.75f, 8.0f)
                curveTo(2.336f, 8.0f, 2.0f, 7.664f, 2.0f, 7.25f)
                curveTo(2.0f, 6.836f, 2.336f, 6.5f, 2.75f, 6.5f)
                curveTo(3.311f, 6.5f, 4.359f, 5.947f, 4.92f, 4.482f)
                curveTo(5.031f, 4.192f, 5.31f, 4.001f, 5.621f, 4.001f)
                curveTo(5.931f, 4.0f, 6.21f, 4.192f, 6.321f, 4.482f)
                curveTo(6.865f, 5.901f, 7.89f, 6.497f, 8.81f, 6.497f)
                curveTo(9.731f, 6.497f, 10.756f, 5.901f, 11.3f, 4.482f)
                curveTo(11.411f, 4.192f, 11.689f, 4.001f, 12.0f, 4.001f)
                curveTo(12.311f, 4.001f, 12.589f, 4.192f, 12.7f, 4.482f)
                curveTo(13.244f, 5.901f, 14.269f, 6.497f, 15.19f, 6.497f)
                curveTo(16.11f, 6.497f, 17.135f, 5.9f, 17.679f, 4.482f)
                curveTo(17.79f, 4.192f, 18.069f, 4.0f, 18.379f, 4.0f)
                close()
                moveTo(18.379f, 10.0f)
                curveTo(18.69f, 10.0f, 18.969f, 10.191f, 19.08f, 10.482f)
                curveTo(19.64f, 11.944f, 20.689f, 12.497f, 21.25f, 12.497f)
                curveTo(21.664f, 12.497f, 22.0f, 12.833f, 22.0f, 13.247f)
                curveTo(22.0f, 13.661f, 21.664f, 13.997f, 21.25f, 13.997f)
                curveTo(20.248f, 13.997f, 19.163f, 13.386f, 18.377f, 12.31f)
                curveTo(17.563f, 13.403f, 16.406f, 13.997f, 15.19f, 13.997f)
                curveTo(13.973f, 13.997f, 12.814f, 13.403f, 12.0f, 12.308f)
                curveTo(11.186f, 13.403f, 10.027f, 13.997f, 8.81f, 13.997f)
                curveTo(7.595f, 13.997f, 6.437f, 13.404f, 5.624f, 12.311f)
                curveTo(4.838f, 13.388f, 3.753f, 14.0f, 2.75f, 14.0f)
                curveTo(2.336f, 14.0f, 2.0f, 13.664f, 2.0f, 13.25f)
                curveTo(2.0f, 12.836f, 2.336f, 12.5f, 2.75f, 12.5f)
                curveTo(3.311f, 12.5f, 4.359f, 11.947f, 4.92f, 10.482f)
                curveTo(5.031f, 10.192f, 5.31f, 10.001f, 5.621f, 10.0f)
                curveTo(5.931f, 10.0f, 6.21f, 10.192f, 6.321f, 10.482f)
                curveTo(6.865f, 11.901f, 7.89f, 12.497f, 8.81f, 12.497f)
                curveTo(9.731f, 12.497f, 10.756f, 11.901f, 11.3f, 10.482f)
                curveTo(11.411f, 10.192f, 11.689f, 10.0f, 12.0f, 10.0f)
                curveTo(12.311f, 10.0f, 12.589f, 10.192f, 12.7f, 10.482f)
                curveTo(13.244f, 11.901f, 14.269f, 12.497f, 15.19f, 12.497f)
                curveTo(16.11f, 12.497f, 17.135f, 11.9f, 17.679f, 10.482f)
                curveTo(17.79f, 10.191f, 18.069f, 10.0f, 18.379f, 10.0f)
                close()
                moveTo(19.08f, 16.482f)
                curveTo(18.969f, 16.191f, 18.69f, 16.0f, 18.379f, 16.0f)
                curveTo(18.069f, 16.0f, 17.79f, 16.191f, 17.679f, 16.482f)
                curveTo(17.135f, 17.9f, 16.11f, 18.497f, 15.19f, 18.497f)
                curveTo(14.269f, 18.497f, 13.244f, 17.901f, 12.7f, 16.482f)
                curveTo(12.589f, 16.192f, 12.311f, 16.0f, 12.0f, 16.0f)
                curveTo(11.689f, 16.0f, 11.411f, 16.192f, 11.3f, 16.482f)
                curveTo(10.756f, 17.901f, 9.731f, 18.497f, 8.81f, 18.497f)
                curveTo(7.89f, 18.497f, 6.865f, 17.901f, 6.321f, 16.482f)
                curveTo(6.21f, 16.192f, 5.931f, 16.0f, 5.621f, 16.0f)
                curveTo(5.31f, 16.001f, 5.031f, 16.192f, 4.92f, 16.482f)
                curveTo(4.359f, 17.947f, 3.311f, 18.5f, 2.75f, 18.5f)
                curveTo(2.336f, 18.5f, 2.0f, 18.836f, 2.0f, 19.25f)
                curveTo(2.0f, 19.664f, 2.336f, 20.0f, 2.75f, 20.0f)
                curveTo(3.753f, 20.0f, 4.838f, 19.388f, 5.624f, 18.312f)
                curveTo(6.437f, 19.404f, 7.595f, 19.997f, 8.81f, 19.997f)
                curveTo(10.027f, 19.997f, 11.186f, 19.403f, 12.0f, 18.308f)
                curveTo(12.814f, 19.403f, 13.973f, 19.997f, 15.19f, 19.997f)
                curveTo(16.406f, 19.997f, 17.563f, 19.403f, 18.377f, 18.31f)
                curveTo(19.163f, 19.386f, 20.248f, 19.997f, 21.25f, 19.997f)
                curveTo(21.664f, 19.997f, 22.0f, 19.661f, 22.0f, 19.247f)
                curveTo(22.0f, 18.833f, 21.664f, 18.497f, 21.25f, 18.497f)
                curveTo(20.689f, 18.497f, 19.64f, 17.944f, 19.08f, 16.482f)
                close()
            }
        }
        .build()
        return _water!!
    }

@Suppress("ObjectPropertyName")
private var _water: ImageVector? = null

@Preview
@Composable
private fun WaterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Water, contentDescription = null)
    }
}

