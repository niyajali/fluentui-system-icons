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
 * HeadphonesConvertible Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent headphone device audio.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_headphones_convertible_20_filled.svg)
 * 
 * @return The [ImageVector] for the HeadphonesConvertible icon.
 */
public val FluentIcons.Filled.HeadphonesConvertible: ImageVector
    get() {
        if (_headphonesConvertible != null) {
            return _headphonesConvertible!!
        }
        _headphonesConvertible = Builder(name = "HeadphonesConvertible", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.347f, 5.559f)
                curveTo(3.515f, 5.307f, 3.871f, 5.285f, 4.085f, 5.499f)
                curveTo(4.262f, 5.676f, 4.28f, 5.956f, 4.143f, 6.166f)
                curveTo(3.42f, 7.267f, 3.0f, 8.585f, 3.0f, 10.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 11.0f, 7.0f, 11.224f, 7.0f, 11.5f)
                verticalLineTo(17.5f)
                curveTo(7.0f, 17.776f, 6.776f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 18.0f, 2.0f, 17.105f, 2.0f, 16.0f)
                verticalLineTo(10.001f)
                curveTo(2.0f, 8.357f, 2.497f, 6.829f, 3.347f, 5.559f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.583f, 18.0f, 10.001f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.105f, 17.105f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 18.0f, 13.0f, 17.776f, 13.0f, 17.5f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 11.224f, 13.224f, 11.0f, 13.5f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.001f)
                curveTo(17.0f, 6.135f, 13.866f, 3.001f, 10.0f, 3.001f)
                curveTo(8.584f, 3.001f, 7.266f, 3.421f, 6.165f, 4.144f)
                curveTo(5.955f, 4.281f, 5.676f, 4.262f, 5.499f, 4.085f)
                curveTo(5.285f, 3.871f, 5.306f, 3.515f, 5.558f, 3.347f)
                curveTo(6.828f, 2.496f, 8.356f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _headphonesConvertible!!
    }

@Suppress("ObjectPropertyName")
private var _headphonesConvertible: ImageVector? = null

@Preview
@Composable
private fun HeadphonesConvertiblePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HeadphonesConvertible, contentDescription = "HeadphonesConvertible Icon")
    }
}

