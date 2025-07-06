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
 * PersonSupport Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in a wide range of support scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_person_suport_32_light.svg)
 * 
 * @return The [ImageVector] for the PersonSupport icon.
 */
public val FluentIcons.Light.PersonSupport: ImageVector
    get() {
        if (_personSupport != null) {
            return _personSupport!!
        }
        _personSupport = Builder(name = "PersonSupport", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(8.0f, 6.582f, 11.582f, 3.0f, 16.0f, 3.0f)
                curveTo(20.418f, 3.0f, 24.0f, 6.582f, 24.0f, 11.0f)
                curveTo(24.0f, 11.276f, 24.224f, 11.5f, 24.5f, 11.5f)
                curveTo(24.776f, 11.5f, 25.0f, 11.276f, 25.0f, 11.0f)
                curveTo(25.0f, 6.029f, 20.971f, 2.0f, 16.0f, 2.0f)
                curveTo(11.029f, 2.0f, 7.0f, 6.029f, 7.0f, 11.0f)
                curveTo(7.0f, 15.344f, 10.078f, 18.97f, 14.173f, 19.814f)
                curveTo(14.485f, 20.513f, 15.186f, 21.0f, 16.0f, 21.0f)
                curveTo(17.105f, 21.0f, 18.0f, 20.105f, 18.0f, 19.0f)
                curveTo(18.0f, 18.636f, 17.903f, 18.294f, 17.732f, 18.0f)
                curveTo(17.387f, 17.402f, 16.74f, 17.0f, 16.0f, 17.0f)
                curveTo(14.979f, 17.0f, 14.137f, 17.764f, 14.015f, 18.752f)
                curveTo(10.557f, 17.869f, 8.0f, 14.733f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(13.239f, 6.0f, 11.0f, 8.239f, 11.0f, 11.0f)
                curveTo(11.0f, 13.761f, 13.239f, 16.0f, 16.0f, 16.0f)
                curveTo(15.273f, 16.0f, 14.606f, 16.258f, 14.087f, 16.689f)
                curveTo(11.711f, 15.89f, 10.0f, 13.645f, 10.0f, 11.0f)
                curveTo(10.0f, 7.686f, 12.686f, 5.0f, 16.0f, 5.0f)
                curveTo(19.314f, 5.0f, 22.0f, 7.686f, 22.0f, 11.0f)
                curveTo(22.0f, 13.645f, 20.289f, 15.89f, 17.913f, 16.689f)
                curveTo(17.393f, 16.258f, 16.727f, 16.0f, 16.0f, 16.0f)
                curveTo(18.761f, 16.0f, 21.0f, 13.761f, 21.0f, 11.0f)
                curveTo(21.0f, 8.239f, 18.761f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(24.5f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 18.649f, 18.94f, 18.313f, 18.829f, 18.0f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 18.0f, 28.0f, 19.567f, 28.0f, 21.5f)
                lineTo(28.0f, 22.167f)
                curveTo(28.0f, 24.316f, 25.234f, 30.0f, 16.0f, 30.0f)
                curveTo(6.766f, 30.0f, 4.0f, 24.316f, 4.0f, 22.167f)
                verticalLineTo(21.5f)
                curveTo(4.0f, 19.567f, 5.567f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(8.859f)
                curveTo(9.213f, 18.361f, 9.594f, 18.696f, 9.999f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19.0f, 5.0f, 20.119f, 5.0f, 21.5f)
                verticalLineTo(22.167f)
                curveTo(5.0f, 23.684f, 7.234f, 29.0f, 16.0f, 29.0f)
                curveTo(24.765f, 29.0f, 27.0f, 23.684f, 27.0f, 22.167f)
                lineTo(27.0f, 21.5f)
                curveTo(27.0f, 20.119f, 25.881f, 19.0f, 24.5f, 19.0f)
                close()
            }
        }
        .build()
        return _personSupport!!
    }

@Suppress("ObjectPropertyName")
private var _personSupport: ImageVector? = null

@Preview
@Composable
private fun PersonSupportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonSupport, contentDescription = "PersonSupport Icon")
    }
}

