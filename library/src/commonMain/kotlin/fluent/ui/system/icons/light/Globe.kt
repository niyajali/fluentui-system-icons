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

package fluent.ui.system.icons.light

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
 * Globe Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in scenarios representing the internet & global representation scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_globe_32_light.svg)
 * 
 * @return The [ImageVector] for the Globe icon.
 */
public val FluentIcons.Light.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(23.732f, 2.0f, 30.0f, 8.268f, 30.0f, 16.0f)
                curveTo(30.0f, 23.732f, 23.732f, 30.0f, 16.0f, 30.0f)
                curveTo(8.268f, 30.0f, 2.0f, 23.732f, 2.0f, 16.0f)
                curveTo(2.0f, 8.268f, 8.268f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(11.398f, 21.0f)
                curveTo(11.671f, 22.652f, 12.074f, 24.13f, 12.574f, 25.357f)
                curveTo(13.057f, 26.543f, 13.62f, 27.47f, 14.22f, 28.092f)
                curveTo(14.818f, 28.713f, 15.419f, 29.0f, 16.0f, 29.0f)
                curveTo(16.581f, 29.0f, 17.182f, 28.713f, 17.78f, 28.092f)
                curveTo(18.38f, 27.47f, 18.943f, 26.543f, 19.426f, 25.357f)
                curveTo(19.926f, 24.13f, 20.329f, 22.652f, 20.603f, 21.0f)
                horizontalLineTo(11.398f)
                close()
                moveTo(3.997f, 21.0f)
                curveTo(5.642f, 24.945f, 9.176f, 27.906f, 13.469f, 28.753f)
                curveTo(12.765f, 28.011f, 12.152f, 26.973f, 11.648f, 25.734f)
                curveTo(11.1f, 24.39f, 10.669f, 22.782f, 10.385f, 21.0f)
                horizontalLineTo(3.997f)
                close()
                moveTo(21.615f, 21.0f)
                curveTo(21.331f, 22.782f, 20.9f, 24.39f, 20.353f, 25.734f)
                curveTo(19.848f, 26.973f, 19.234f, 28.011f, 18.53f, 28.753f)
                curveTo(22.824f, 27.906f, 26.357f, 24.946f, 28.003f, 21.0f)
                horizontalLineTo(21.615f)
                close()
                moveTo(3.627f, 12.0f)
                curveTo(3.22f, 13.26f, 3.0f, 14.604f, 3.0f, 16.0f)
                curveTo(3.0f, 17.396f, 3.22f, 18.74f, 3.627f, 20.0f)
                horizontalLineTo(10.242f)
                curveTo(10.085f, 18.731f, 10.0f, 17.388f, 10.0f, 16.0f)
                curveTo(10.0f, 14.612f, 10.085f, 13.269f, 10.242f, 12.0f)
                horizontalLineTo(3.627f)
                close()
                moveTo(11.25f, 12.0f)
                curveTo(11.088f, 13.259f, 11.0f, 14.603f, 11.0f, 16.0f)
                curveTo(11.0f, 17.397f, 11.088f, 18.741f, 11.25f, 20.0f)
                horizontalLineTo(20.75f)
                curveTo(20.912f, 18.741f, 21.0f, 17.397f, 21.0f, 16.0f)
                curveTo(21.0f, 14.603f, 20.912f, 13.259f, 20.75f, 12.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(21.758f, 12.0f)
                curveTo(21.915f, 13.269f, 22.0f, 14.612f, 22.0f, 16.0f)
                curveTo(22.0f, 17.388f, 21.915f, 18.731f, 21.758f, 20.0f)
                horizontalLineTo(28.373f)
                curveTo(28.78f, 18.74f, 29.0f, 17.396f, 29.0f, 16.0f)
                curveTo(29.0f, 14.604f, 28.78f, 13.26f, 28.373f, 12.0f)
                horizontalLineTo(21.758f)
                close()
                moveTo(13.469f, 3.246f)
                curveTo(9.176f, 4.093f, 5.642f, 7.055f, 3.997f, 11.0f)
                horizontalLineTo(10.385f)
                curveTo(10.669f, 9.218f, 11.1f, 7.61f, 11.648f, 6.266f)
                curveTo(12.152f, 5.027f, 12.765f, 3.988f, 13.469f, 3.246f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(15.419f, 3.0f, 14.818f, 3.287f, 14.22f, 3.908f)
                curveTo(13.62f, 4.53f, 13.057f, 5.457f, 12.574f, 6.643f)
                curveTo(12.074f, 7.87f, 11.671f, 9.348f, 11.398f, 11.0f)
                horizontalLineTo(20.603f)
                curveTo(20.329f, 9.348f, 19.926f, 7.87f, 19.426f, 6.643f)
                curveTo(18.943f, 5.457f, 18.38f, 4.53f, 17.78f, 3.908f)
                curveTo(17.182f, 3.287f, 16.581f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(18.53f, 3.246f)
                curveTo(19.234f, 3.988f, 19.848f, 5.026f, 20.353f, 6.266f)
                curveTo(20.9f, 7.61f, 21.331f, 9.218f, 21.615f, 11.0f)
                horizontalLineTo(28.003f)
                curveTo(26.357f, 7.054f, 22.824f, 4.093f, 18.53f, 3.246f)
                close()
            }
        }
        .build()
        return _globe!!
    }

@Suppress("ObjectPropertyName")
private var _globe: ImageVector? = null

@Preview
@Composable
private fun GlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Globe, contentDescription = "Globe Icon")
    }
}

