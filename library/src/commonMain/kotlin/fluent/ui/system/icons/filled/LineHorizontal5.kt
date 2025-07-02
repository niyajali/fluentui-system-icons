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
 * LineHorizontal5 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: line, horizontal5
 * - Source: ic_fluent_line_horizontal_5_20_filled.svg
 * 
 * @return The [ImageVector] for the LineHorizontal5 icon.
 */
public val FluentIcons.Filled.LineHorizontal5: ImageVector
    get() {
        if (_lineHorizontal5 != null) {
            return _lineHorizontal5!!
        }
        _lineHorizontal5 = Builder(name = "LineHorizontal5", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 3.336f, 2.336f, 3.0f, 2.75f, 3.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 3.0f, 18.0f, 3.336f, 18.0f, 3.75f)
                curveTo(18.0f, 4.164f, 17.664f, 4.5f, 17.25f, 4.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 4.5f, 2.0f, 4.164f, 2.0f, 3.75f)
                close()
                moveTo(2.0f, 9.75f)
                curveTo(2.0f, 9.336f, 2.336f, 9.0f, 2.75f, 9.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.0f, 18.0f, 9.336f, 18.0f, 9.75f)
                curveTo(18.0f, 10.164f, 17.664f, 10.5f, 17.25f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.5f, 2.0f, 10.164f, 2.0f, 9.75f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.336f, 12.0f, 2.0f, 12.336f, 2.0f, 12.75f)
                curveTo(2.0f, 13.164f, 2.336f, 13.5f, 2.75f, 13.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 13.5f, 18.0f, 13.164f, 18.0f, 12.75f)
                curveTo(18.0f, 12.336f, 17.664f, 12.0f, 17.25f, 12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 6.336f, 2.336f, 6.0f, 2.75f, 6.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.0f, 18.0f, 6.336f, 18.0f, 6.75f)
                curveTo(18.0f, 7.164f, 17.664f, 7.5f, 17.25f, 7.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 7.5f, 2.0f, 7.164f, 2.0f, 6.75f)
                close()
                moveTo(2.75f, 15.0f)
                curveTo(2.336f, 15.0f, 2.0f, 15.336f, 2.0f, 15.75f)
                curveTo(2.0f, 16.164f, 2.336f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 16.5f, 18.0f, 16.164f, 18.0f, 15.75f)
                curveTo(18.0f, 15.336f, 17.664f, 15.0f, 17.25f, 15.0f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _lineHorizontal5!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal5: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal5, contentDescription = null)
    }
}

