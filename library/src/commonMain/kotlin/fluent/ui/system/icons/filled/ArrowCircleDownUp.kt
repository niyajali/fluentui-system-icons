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
 * ArrowCircleDownUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, circle, down, up
 * - Source: ic_fluent_arrow_circle_down_up_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowCircleDownUp icon.
 */
public val FluentIcons.Filled.ArrowCircleDownUp: ImageVector
    get() {
        if (_arrowCircleDownUp != null) {
            return _arrowCircleDownUp!!
        }
        _arrowCircleDownUp = Builder(name = "ArrowCircleDownUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveTo(14.418f, 18.0f, 18.0f, 14.418f, 18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                curveTo(5.582f, 2.0f, 2.0f, 5.582f, 2.0f, 10.0f)
                curveTo(2.0f, 14.418f, 5.582f, 18.0f, 10.0f, 18.0f)
                close()
                moveTo(9.0f, 12.207f)
                lineTo(7.354f, 13.854f)
                curveTo(7.158f, 14.049f, 6.842f, 14.049f, 6.646f, 13.854f)
                lineTo(5.0f, 12.207f)
                curveTo(4.805f, 12.012f, 4.805f, 11.695f, 5.0f, 11.5f)
                curveTo(5.195f, 11.305f, 5.512f, 11.305f, 5.707f, 11.5f)
                lineTo(6.5f, 12.293f)
                lineTo(6.5f, 6.5f)
                curveTo(6.5f, 6.224f, 6.724f, 6.0f, 7.0f, 6.0f)
                curveTo(7.276f, 6.0f, 7.5f, 6.224f, 7.5f, 6.5f)
                lineTo(7.5f, 12.293f)
                lineTo(8.293f, 11.5f)
                curveTo(8.488f, 11.305f, 8.805f, 11.305f, 9.0f, 11.5f)
                curveTo(9.195f, 11.695f, 9.195f, 12.012f, 9.0f, 12.207f)
                close()
                moveTo(15.0f, 7.793f)
                curveTo(15.195f, 7.988f, 15.195f, 8.305f, 15.0f, 8.5f)
                curveTo(14.805f, 8.695f, 14.488f, 8.695f, 14.293f, 8.5f)
                lineTo(13.5f, 7.707f)
                lineTo(13.5f, 13.5f)
                curveTo(13.5f, 13.776f, 13.276f, 14.0f, 13.0f, 14.0f)
                curveTo(12.724f, 14.0f, 12.5f, 13.776f, 12.5f, 13.5f)
                lineTo(12.5f, 7.707f)
                lineTo(11.707f, 8.5f)
                curveTo(11.512f, 8.695f, 11.195f, 8.695f, 11.0f, 8.5f)
                curveTo(10.805f, 8.305f, 10.805f, 7.988f, 11.0f, 7.793f)
                lineTo(12.646f, 6.146f)
                curveTo(12.842f, 5.951f, 13.158f, 5.951f, 13.354f, 6.146f)
                lineTo(15.0f, 7.793f)
                close()
            }
        }
        .build()
        return _arrowCircleDownUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowCircleDownUp: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleDownUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCircleDownUp, contentDescription = null)
    }
}

