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
 * CircleOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: circle, off
 * - Source: ic_fluent_circle_off_20_regular.svg
 * 
 * @return The [ImageVector] for the CircleOff icon.
 */
public val FluentIcons.Regular.CircleOff: ImageVector
    get() {
        if (_circleOff != null) {
            return _circleOff!!
        }
        _circleOff = Builder(name = "CircleOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.001f, 4.708f)
                lineTo(2.146f, 2.854f)
                curveTo(1.951f, 2.658f, 1.951f, 2.342f, 2.146f, 2.146f)
                curveTo(2.342f, 1.951f, 2.658f, 1.951f, 2.854f, 2.146f)
                lineTo(17.854f, 17.146f)
                curveTo(18.049f, 17.342f, 18.049f, 17.658f, 17.854f, 17.854f)
                curveTo(17.658f, 18.049f, 17.342f, 18.049f, 17.146f, 17.854f)
                lineTo(15.292f, 15.999f)
                curveTo(13.882f, 17.244f, 12.029f, 18.0f, 10.0f, 18.0f)
                curveTo(5.582f, 18.0f, 2.0f, 14.418f, 2.0f, 10.0f)
                curveTo(2.0f, 7.971f, 2.756f, 6.118f, 4.001f, 4.708f)
                close()
                moveTo(14.584f, 15.291f)
                lineTo(4.709f, 5.416f)
                curveTo(3.644f, 6.644f, 3.0f, 8.247f, 3.0f, 10.0f)
                curveTo(3.0f, 13.866f, 6.134f, 17.0f, 10.0f, 17.0f)
                curveTo(11.753f, 17.0f, 13.356f, 16.356f, 14.584f, 15.291f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 11.39f, 16.595f, 12.686f, 15.896f, 13.775f)
                lineTo(16.618f, 14.496f)
                curveTo(17.49f, 13.215f, 18.0f, 11.667f, 18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                curveTo(8.333f, 2.0f, 6.785f, 2.51f, 5.504f, 3.382f)
                lineTo(6.225f, 4.104f)
                curveTo(7.314f, 3.405f, 8.61f, 3.0f, 10.0f, 3.0f)
                curveTo(13.866f, 3.0f, 17.0f, 6.134f, 17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleOff!!
    }

@Suppress("ObjectPropertyName")
private var _circleOff: ImageVector? = null

@Preview
@Composable
private fun CircleOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CircleOff, contentDescription = null)
    }
}

