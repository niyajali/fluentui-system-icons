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
 * TopSpeed Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in speed measuring scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_top_speed_24_regular.svg)
 * 
 * @return The [ImageVector] for the TopSpeed icon.
 */
public val FluentIcons.Regular.TopSpeed: ImageVector
    get() {
        if (_topSpeed != null) {
            return _topSpeed!!
        }
        _topSpeed = Builder(name = "TopSpeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.543f, 5.483f)
                curveTo(7.84f, 4.396f, 9.466f, 3.689f, 11.25f, 3.533f)
                verticalLineTo(5.25f)
                curveTo(11.25f, 5.664f, 11.586f, 6.0f, 12.0f, 6.0f)
                curveTo(12.414f, 6.0f, 12.75f, 5.664f, 12.75f, 5.25f)
                verticalLineTo(3.533f)
                curveTo(16.929f, 3.898f, 20.241f, 7.287f, 20.486f, 11.5f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 11.5f, 18.0f, 11.836f, 18.0f, 12.25f)
                curveTo(18.0f, 12.664f, 18.336f, 13.0f, 18.75f, 13.0f)
                horizontalLineTo(20.444f)
                curveTo(20.184f, 15.312f, 19.021f, 17.248f, 17.277f, 18.668f)
                curveTo(16.955f, 18.93f, 16.907f, 19.402f, 17.168f, 19.723f)
                curveTo(17.43f, 20.045f, 17.902f, 20.093f, 18.223f, 19.832f)
                curveTo(20.45f, 18.019f, 21.894f, 15.438f, 21.994f, 12.347f)
                curveTo(21.999f, 12.315f, 22.001f, 12.283f, 22.001f, 12.25f)
                curveTo(22.001f, 12.23f, 22.0f, 12.21f, 21.998f, 12.191f)
                curveTo(21.999f, 12.127f, 22.0f, 12.064f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 15.252f, 3.523f, 17.954f, 5.77f, 19.826f)
                curveTo(6.088f, 20.091f, 6.561f, 20.048f, 6.826f, 19.73f)
                curveTo(7.091f, 19.412f, 7.048f, 18.939f, 6.73f, 18.674f)
                curveTo(5.019f, 17.248f, 3.827f, 15.307f, 3.558f, 13.0f)
                horizontalLineTo(5.25f)
                curveTo(5.664f, 13.0f, 6.0f, 12.664f, 6.0f, 12.25f)
                curveTo(6.0f, 11.836f, 5.664f, 11.5f, 5.25f, 11.5f)
                horizontalLineTo(3.514f)
                curveTo(3.624f, 9.618f, 4.345f, 7.9f, 5.483f, 6.543f)
                lineTo(6.72f, 7.78f)
                curveTo(7.013f, 8.073f, 7.487f, 8.073f, 7.78f, 7.78f)
                curveTo(8.073f, 7.487f, 8.073f, 7.013f, 7.78f, 6.72f)
                lineTo(6.543f, 5.483f)
                close()
                moveTo(16.759f, 6.634f)
                curveTo(16.521f, 6.45f, 16.182f, 6.456f, 15.952f, 6.649f)
                lineTo(15.734f, 6.832f)
                curveTo(15.596f, 6.948f, 15.398f, 7.115f, 15.159f, 7.316f)
                curveTo(14.681f, 7.719f, 14.039f, 8.262f, 13.383f, 8.823f)
                curveTo(12.727f, 9.383f, 12.056f, 9.962f, 11.52f, 10.435f)
                curveTo(11.252f, 10.671f, 11.016f, 10.884f, 10.831f, 11.056f)
                curveTo(10.659f, 11.215f, 10.499f, 11.371f, 10.411f, 11.479f)
                curveTo(9.758f, 12.286f, 9.898f, 13.459f, 10.723f, 14.098f)
                curveTo(11.549f, 14.736f, 12.747f, 14.6f, 13.4f, 13.792f)
                curveTo(13.488f, 13.684f, 13.605f, 13.495f, 13.724f, 13.295f)
                curveTo(13.853f, 13.08f, 14.01f, 12.806f, 14.184f, 12.497f)
                curveTo(14.531f, 11.878f, 14.952f, 11.105f, 15.358f, 10.352f)
                curveTo(15.765f, 9.599f, 16.158f, 8.862f, 16.449f, 8.314f)
                curveTo(16.594f, 8.04f, 16.714f, 7.813f, 16.798f, 7.655f)
                lineTo(16.929f, 7.406f)
                curveTo(17.069f, 7.142f, 16.997f, 6.818f, 16.759f, 6.634f)
                close()
            }
        }
        .build()
        return _topSpeed!!
    }

@Suppress("ObjectPropertyName")
private var _topSpeed: ImageVector? = null

@Preview
@Composable
private fun TopSpeedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TopSpeed, contentDescription = "TopSpeed Icon")
    }
}

