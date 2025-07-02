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
 * ArrowWrapUpToDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, wrap, up, to, down
 * - Source: ic_fluent_arrow_wrap_up_to_down_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowWrapUpToDown icon.
 */
public val FluentIcons.Regular.ArrowWrapUpToDown: ImageVector
    get() {
        if (_arrowWrapUpToDown != null) {
            return _arrowWrapUpToDown!!
        }
        _arrowWrapUpToDown = Builder(name = "ArrowWrapUpToDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                curveTo(4.0f, 15.657f, 5.343f, 17.0f, 7.0f, 17.0f)
                curveTo(8.657f, 17.0f, 10.0f, 15.657f, 10.0f, 14.0f)
                lineTo(10.0f, 6.0f)
                curveTo(10.0f, 4.895f, 10.895f, 4.0f, 12.0f, 4.0f)
                curveTo(13.105f, 4.0f, 14.0f, 4.895f, 14.0f, 6.0f)
                lineTo(14.0f, 16.293f)
                lineTo(13.354f, 15.646f)
                curveTo(13.158f, 15.451f, 12.842f, 15.451f, 12.646f, 15.646f)
                curveTo(12.451f, 15.842f, 12.451f, 16.158f, 12.646f, 16.354f)
                lineTo(14.146f, 17.854f)
                curveTo(14.342f, 18.049f, 14.658f, 18.049f, 14.854f, 17.854f)
                lineTo(16.354f, 16.354f)
                curveTo(16.549f, 16.158f, 16.549f, 15.842f, 16.354f, 15.646f)
                curveTo(16.158f, 15.451f, 15.842f, 15.451f, 15.646f, 15.646f)
                lineTo(15.0f, 16.293f)
                lineTo(15.0f, 6.0f)
                curveTo(15.0f, 4.343f, 13.657f, 3.0f, 12.0f, 3.0f)
                curveTo(10.343f, 3.0f, 9.0f, 4.343f, 9.0f, 6.0f)
                lineTo(9.0f, 14.0f)
                curveTo(9.0f, 15.105f, 8.105f, 16.0f, 7.0f, 16.0f)
                curveTo(5.895f, 16.0f, 5.0f, 15.105f, 5.0f, 14.0f)
                lineTo(5.0f, 3.5f)
                curveTo(5.0f, 3.224f, 4.776f, 3.0f, 4.5f, 3.0f)
                curveTo(4.224f, 3.0f, 4.0f, 3.224f, 4.0f, 3.5f)
                lineTo(4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowWrapUpToDown!!
    }

@Suppress("ObjectPropertyName")
private var _arrowWrapUpToDown: ImageVector? = null

@Preview
@Composable
private fun ArrowWrapUpToDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowWrapUpToDown, contentDescription = null)
    }
}

