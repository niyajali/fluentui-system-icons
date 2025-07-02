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
 * LineHorizontal1DashDotDash icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: line, horizontal1dash, dot, dash
 * - Source: ic_fluent_line_horizontal_1_dash_dot_dash_20_filled.svg
 * 
 * @return The [ImageVector] for the LineHorizontal1DashDotDash icon.
 */
public val FluentIcons.Filled.LineHorizontal1DashDotDash: ImageVector
    get() {
        if (_lineHorizontal1DashDotDash != null) {
            return _lineHorizontal1DashDotDash!!
        }
        _lineHorizontal1DashDotDash = Builder(name = "LineHorizontal1DashDotDash", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 11.75f)
                curveTo(10.967f, 11.75f, 11.75f, 10.967f, 11.75f, 10.0f)
                curveTo(11.75f, 9.033f, 10.967f, 8.25f, 10.0f, 8.25f)
                curveTo(9.033f, 8.25f, 8.25f, 9.033f, 8.25f, 10.0f)
                curveTo(8.25f, 10.967f, 9.033f, 11.75f, 10.0f, 11.75f)
                close()
                moveTo(2.75f, 9.0f)
                curveTo(2.336f, 9.0f, 2.0f, 9.336f, 2.0f, 9.75f)
                curveTo(2.0f, 10.164f, 2.336f, 10.5f, 2.75f, 10.5f)
                horizontalLineTo(5.25f)
                curveTo(5.664f, 10.5f, 6.0f, 10.164f, 6.0f, 9.75f)
                curveTo(6.0f, 9.336f, 5.664f, 9.0f, 5.25f, 9.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(14.75f, 9.0f)
                curveTo(14.336f, 9.0f, 14.0f, 9.336f, 14.0f, 9.75f)
                curveTo(14.0f, 10.164f, 14.336f, 10.5f, 14.75f, 10.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 10.5f, 18.0f, 10.164f, 18.0f, 9.75f)
                curveTo(18.0f, 9.336f, 17.664f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _lineHorizontal1DashDotDash!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal1DashDotDash: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal1DashDotDashPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal1DashDotDash, contentDescription = null)
    }
}

