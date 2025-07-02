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
 * ArrowWrapUpToDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, wrap, up, to, down
 * - Source: ic_fluent_arrow_wrap_up_to_down_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowWrapUpToDown icon.
 */
public val FluentIcons.Filled.ArrowWrapUpToDown: ImageVector
    get() {
        if (_arrowWrapUpToDown != null) {
            return _arrowWrapUpToDown!!
        }
        _arrowWrapUpToDown = Builder(name = "ArrowWrapUpToDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 13.75f)
                curveTo(4.0f, 15.545f, 5.455f, 17.0f, 7.25f, 17.0f)
                curveTo(9.045f, 17.0f, 10.5f, 15.545f, 10.5f, 13.75f)
                lineTo(10.5f, 6.25f)
                curveTo(10.5f, 5.284f, 11.283f, 4.5f, 12.25f, 4.5f)
                curveTo(13.217f, 4.5f, 14.0f, 5.284f, 14.0f, 6.25f)
                lineTo(14.0f, 15.439f)
                lineTo(13.78f, 15.22f)
                curveTo(13.487f, 14.927f, 13.013f, 14.927f, 12.72f, 15.22f)
                curveTo(12.427f, 15.513f, 12.427f, 15.987f, 12.72f, 16.28f)
                lineTo(14.22f, 17.78f)
                curveTo(14.513f, 18.073f, 14.987f, 18.073f, 15.28f, 17.78f)
                lineTo(16.78f, 16.28f)
                curveTo(17.073f, 15.987f, 17.073f, 15.513f, 16.78f, 15.22f)
                curveTo(16.487f, 14.927f, 16.013f, 14.927f, 15.72f, 15.22f)
                lineTo(15.5f, 15.439f)
                lineTo(15.5f, 6.25f)
                curveTo(15.5f, 4.455f, 14.045f, 3.0f, 12.25f, 3.0f)
                curveTo(10.455f, 3.0f, 9.0f, 4.455f, 9.0f, 6.25f)
                lineTo(9.0f, 13.75f)
                curveTo(9.0f, 14.717f, 8.217f, 15.5f, 7.25f, 15.5f)
                curveTo(6.284f, 15.5f, 5.5f, 14.717f, 5.5f, 13.75f)
                lineTo(5.5f, 3.75f)
                curveTo(5.5f, 3.336f, 5.164f, 3.0f, 4.75f, 3.0f)
                curveTo(4.336f, 3.0f, 4.0f, 3.336f, 4.0f, 3.75f)
                lineTo(4.0f, 13.75f)
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
        Image(imageVector = FluentIcons.Filled.ArrowWrapUpToDown, contentDescription = null)
    }
}

