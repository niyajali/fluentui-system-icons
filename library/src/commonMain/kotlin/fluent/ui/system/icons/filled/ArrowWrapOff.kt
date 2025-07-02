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
 * ArrowWrapOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, wrap, off
 * - Source: ic_fluent_arrow_wrap_off_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowWrapOff icon.
 */
public val FluentIcons.Filled.ArrowWrapOff: ImageVector
    get() {
        if (_arrowWrapOff != null) {
            return _arrowWrapOff!!
        }
        _arrowWrapOff = Builder(name = "ArrowWrapOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.126f, 3.833f)
                curveTo(3.047f, 3.953f, 3.0f, 4.096f, 3.0f, 4.25f)
                curveTo(3.0f, 4.664f, 3.336f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(4.293f)
                lineTo(7.793f, 8.5f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 8.5f, 3.0f, 9.955f, 3.0f, 11.75f)
                curveTo(3.0f, 13.545f, 4.455f, 15.0f, 6.25f, 15.0f)
                horizontalLineTo(14.293f)
                lineTo(15.001f, 15.708f)
                curveTo(14.99f, 15.914f, 15.063f, 16.123f, 15.22f, 16.28f)
                curveTo(15.377f, 16.437f, 15.586f, 16.51f, 15.792f, 16.499f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(12.793f, 13.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 13.5f, 4.5f, 12.717f, 4.5f, 11.75f)
                curveTo(4.5f, 10.783f, 5.284f, 10.0f, 6.25f, 10.0f)
                horizontalLineTo(9.293f)
                lineTo(12.793f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 8.5f)
                horizontalLineTo(10.621f)
                lineTo(12.121f, 10.0f)
                horizontalLineTo(13.75f)
                curveTo(15.545f, 10.0f, 17.0f, 8.545f, 17.0f, 6.75f)
                curveTo(17.0f, 4.955f, 15.545f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(5.621f)
                lineTo(7.121f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 5.0f, 15.5f, 5.784f, 15.5f, 6.75f)
                curveTo(15.5f, 7.716f, 14.717f, 8.5f, 13.75f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.341f, 15.22f)
                lineTo(15.014f, 12.892f)
                curveTo(14.968f, 12.656f, 15.037f, 12.403f, 15.22f, 12.22f)
                curveTo(15.513f, 11.927f, 15.987f, 11.927f, 16.28f, 12.22f)
                lineTo(17.78f, 13.72f)
                curveTo(18.073f, 14.013f, 18.073f, 14.487f, 17.78f, 14.78f)
                lineTo(17.341f, 15.22f)
                close()
            }
        }
        .build()
        return _arrowWrapOff!!
    }

@Suppress("ObjectPropertyName")
private var _arrowWrapOff: ImageVector? = null

@Preview
@Composable
private fun ArrowWrapOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowWrapOff, contentDescription = null)
    }
}

