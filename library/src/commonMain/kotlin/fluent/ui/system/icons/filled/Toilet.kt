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
 * Toilet Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a toilet.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_toilet_20_filled.svg)
 * 
 * @return The [ImageVector] for the Toilet icon.
 */
public val FluentIcons.Filled.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.997f, 16.0f)
                curveTo(15.997f, 17.105f, 15.102f, 18.0f, 13.997f, 18.0f)
                horizontalLineTo(5.997f)
                curveTo(5.268f, 18.0f, 4.784f, 17.243f, 5.089f, 16.581f)
                lineTo(5.952f, 14.709f)
                curveTo(7.095f, 15.521f, 8.491f, 16.0f, 10.0f, 16.0f)
                curveTo(12.545f, 16.0f, 14.772f, 14.641f, 15.997f, 12.61f)
                verticalLineTo(16.0f)
                close()
                moveTo(13.174f, 10.0f)
                curveTo(13.504f, 10.933f, 14.281f, 11.652f, 15.25f, 11.901f)
                curveTo(14.228f, 13.748f, 12.262f, 15.0f, 10.001f, 15.0f)
                curveTo(7.028f, 15.0f, 4.562f, 12.838f, 4.086f, 10.0f)
                horizontalLineTo(13.174f)
                close()
                moveTo(16.5f, 1.0f)
                curveTo(17.328f, 1.0f, 18.0f, 1.672f, 18.0f, 2.5f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 10.105f, 17.105f, 11.0f, 16.0f, 11.0f)
                curveTo(14.895f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                verticalLineTo(2.5f)
                curveTo(14.0f, 1.672f, 14.672f, 1.0f, 15.5f, 1.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 9.0f, 3.0f, 8.328f, 3.0f, 7.5f)
                curveTo(3.0f, 6.672f, 3.672f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

@Suppress("ObjectPropertyName")
private var _toilet: ImageVector? = null

@Preview
@Composable
private fun ToiletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Toilet, contentDescription = "Toilet Icon")
    }
}

