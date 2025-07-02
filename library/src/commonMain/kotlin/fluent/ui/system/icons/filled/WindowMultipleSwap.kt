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
 * WindowMultipleSwap icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: window, multiple, swap
 * - Source: ic_fluent_window_multiple_swap_20_filled.svg
 * 
 * @return The [ImageVector] for the WindowMultipleSwap icon.
 */
public val FluentIcons.Filled.WindowMultipleSwap: ImageVector
    get() {
        if (_windowMultipleSwap != null) {
            return _windowMultipleSwap!!
        }
        _windowMultipleSwap = Builder(name = "WindowMultipleSwap", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 4.5f)
                curveTo(2.0f, 3.119f, 3.119f, 2.0f, 4.5f, 2.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 2.0f, 15.0f, 3.119f, 15.0f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 13.881f, 13.881f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(10.915f)
                curveTo(11.028f, 14.677f, 11.028f, 14.323f, 10.915f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 14.0f, 14.0f, 13.328f, 14.0f, 12.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.085f)
                curveTo(2.795f, 11.158f, 2.603f, 11.276f, 2.439f, 11.439f)
                lineTo(2.0f, 11.879f)
                verticalLineTo(4.5f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineTo(7.5f)
                curveTo(7.884f, 18.0f, 8.268f, 17.854f, 8.561f, 17.561f)
                lineTo(9.121f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 17.0f, 17.0f, 15.657f, 17.0f, 14.0f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 6.847f, 16.582f, 6.291f, 16.0f, 6.085f)
                verticalLineTo(5.05f)
                curveTo(17.141f, 5.282f, 18.0f, 6.291f, 18.0f, 7.5f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 16.209f, 16.209f, 18.0f, 14.0f, 18.0f)
                close()
                moveTo(9.854f, 14.854f)
                lineTo(7.854f, 16.854f)
                curveTo(7.658f, 17.049f, 7.342f, 17.049f, 7.146f, 16.854f)
                curveTo(6.951f, 16.658f, 6.951f, 16.342f, 7.146f, 16.146f)
                lineTo(8.293f, 15.0f)
                horizontalLineTo(2.707f)
                lineTo(3.854f, 16.146f)
                curveTo(4.049f, 16.342f, 4.049f, 16.658f, 3.854f, 16.854f)
                curveTo(3.658f, 17.049f, 3.342f, 17.049f, 3.146f, 16.854f)
                lineTo(1.146f, 14.854f)
                curveTo(0.951f, 14.658f, 0.951f, 14.342f, 1.146f, 14.146f)
                lineTo(3.146f, 12.146f)
                curveTo(3.342f, 11.951f, 3.658f, 11.951f, 3.854f, 12.146f)
                curveTo(4.049f, 12.342f, 4.049f, 12.658f, 3.854f, 12.854f)
                lineTo(2.707f, 14.0f)
                horizontalLineTo(4.5f)
                horizontalLineTo(8.293f)
                lineTo(7.146f, 12.854f)
                curveTo(6.951f, 12.658f, 6.951f, 12.342f, 7.146f, 12.146f)
                curveTo(7.342f, 11.951f, 7.658f, 11.951f, 7.854f, 12.146f)
                lineTo(9.854f, 14.146f)
                curveTo(10.049f, 14.342f, 10.049f, 14.658f, 9.854f, 14.854f)
                close()
                moveTo(3.243f, 14.0f)
                horizontalLineTo(4.5f)
                horizontalLineTo(4.568f)
            }
        }
        .build()
        return _windowMultipleSwap!!
    }

@Suppress("ObjectPropertyName")
private var _windowMultipleSwap: ImageVector? = null

@Preview
@Composable
private fun WindowMultipleSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowMultipleSwap, contentDescription = null)
    }
}

