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
 * Toilet Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a toilet.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_toilet_20_regular.svg)
 * 
 * @return The [ImageVector] for the Toilet icon.
 */
public val FluentIcons.Regular.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 1.0f)
                curveTo(17.328f, 1.0f, 18.0f, 1.672f, 18.0f, 2.5f)
                verticalLineTo(8.5f)
                curveTo(18.0f, 9.709f, 17.142f, 10.717f, 16.001f, 10.949f)
                verticalLineTo(16.0f)
                curveTo(16.001f, 17.105f, 15.106f, 18.0f, 14.001f, 18.0f)
                horizontalLineTo(6.001f)
                curveTo(5.272f, 18.0f, 4.787f, 17.243f, 5.093f, 16.581f)
                lineTo(6.382f, 13.784f)
                curveTo(5.127f, 12.833f, 4.258f, 11.4f, 4.051f, 9.76f)
                curveTo(3.425f, 9.422f, 3.0f, 8.761f, 3.0f, 8.0f)
                curveTo(3.0f, 6.895f, 3.895f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 1.672f, 13.672f, 1.0f, 14.5f, 1.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(15.001f, 12.313f)
                curveTo(13.927f, 13.932f, 12.09f, 15.0f, 10.001f, 15.0f)
                curveTo(9.003f, 15.0f, 8.062f, 14.755f, 7.234f, 14.324f)
                lineTo(6.001f, 17.0f)
                horizontalLineTo(14.001f)
                curveTo(14.553f, 17.0f, 15.001f, 16.552f, 15.001f, 16.0f)
                verticalLineTo(12.313f)
                close()
                moveTo(13.5f, 10.0f)
                horizontalLineTo(5.102f)
                curveTo(5.565f, 12.282f, 7.582f, 14.0f, 10.001f, 14.0f)
                curveTo(12.11f, 14.0f, 13.913f, 12.694f, 14.648f, 10.848f)
                curveTo(14.187f, 10.681f, 13.792f, 10.383f, 13.503f, 9.999f)
                lineTo(13.5f, 10.0f)
                close()
                moveTo(14.5f, 2.0f)
                curveTo(14.224f, 2.0f, 14.0f, 2.224f, 14.0f, 2.5f)
                verticalLineTo(8.5f)
                curveTo(14.0f, 9.328f, 14.672f, 10.0f, 15.5f, 10.0f)
                curveTo(16.328f, 10.0f, 17.0f, 9.328f, 17.0f, 8.5f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.224f, 16.776f, 2.0f, 16.5f, 2.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(5.0f, 7.0f)
                curveTo(4.448f, 7.0f, 4.0f, 7.448f, 4.0f, 8.0f)
                curveTo(4.0f, 8.552f, 4.448f, 9.0f, 5.0f, 9.0f)
                horizontalLineTo(13.05f)
                curveTo(13.017f, 8.838f, 13.0f, 8.671f, 13.0f, 8.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
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
        Image(imageVector = FluentIcons.Regular.Toilet, contentDescription = "Toilet Icon")
    }
}

