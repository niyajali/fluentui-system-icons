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
 * LineHorizontal1Dot Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent line drawing styles.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_line_horizontal_1_dot_20_filled.svg)
 * 
 * @return The [ImageVector] for the LineHorizontal1Dot icon.
 */
public val FluentIcons.Filled.LineHorizontal1Dot: ImageVector
    get() {
        if (_lineHorizontal1Dot != null) {
            return _lineHorizontal1Dot!!
        }
        _lineHorizontal1Dot = Builder(name = "LineHorizontal1Dot", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 11.0f)
                curveTo(4.328f, 11.0f, 5.0f, 10.328f, 5.0f, 9.5f)
                curveTo(5.0f, 8.672f, 4.328f, 8.0f, 3.5f, 8.0f)
                curveTo(2.672f, 8.0f, 2.0f, 8.672f, 2.0f, 9.5f)
                curveTo(2.0f, 10.328f, 2.672f, 11.0f, 3.5f, 11.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.828f, 11.0f, 9.5f, 10.328f, 9.5f, 9.5f)
                curveTo(9.5f, 8.672f, 8.828f, 8.0f, 8.0f, 8.0f)
                curveTo(7.172f, 8.0f, 6.5f, 8.672f, 6.5f, 9.5f)
                curveTo(6.5f, 10.328f, 7.172f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(12.5f, 11.0f)
                curveTo(13.328f, 11.0f, 14.0f, 10.328f, 14.0f, 9.5f)
                curveTo(14.0f, 8.672f, 13.328f, 8.0f, 12.5f, 8.0f)
                curveTo(11.672f, 8.0f, 11.0f, 8.672f, 11.0f, 9.5f)
                curveTo(11.0f, 10.328f, 11.672f, 11.0f, 12.5f, 11.0f)
                close()
                moveTo(18.5f, 9.5f)
                curveTo(18.5f, 10.328f, 17.828f, 11.0f, 17.0f, 11.0f)
                curveTo(16.172f, 11.0f, 15.5f, 10.328f, 15.5f, 9.5f)
                curveTo(15.5f, 8.672f, 16.172f, 8.0f, 17.0f, 8.0f)
                curveTo(17.828f, 8.0f, 18.5f, 8.672f, 18.5f, 9.5f)
                close()
            }
        }
        .build()
        return _lineHorizontal1Dot!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal1Dot: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal1DotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal1Dot, contentDescription = "LineHorizontal1Dot Icon")
    }
}

