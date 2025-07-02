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
 * DataBarHorizontalDescending icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: data, bar, horizontal, descending
 * - Source: ic_fluent_data_bar_horizontal_descending_16_filled.svg
 * 
 * @return The [ImageVector] for the DataBarHorizontalDescending icon.
 */
public val FluentIcons.Filled.DataBarHorizontalDescending: ImageVector
    get() {
        if (_dataBarHorizontalDescending != null) {
            return _dataBarHorizontalDescending!!
        }
        _dataBarHorizontalDescending = Builder(name = "DataBarHorizontalDescending", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                curveTo(14.105f, 5.0f, 15.0f, 4.105f, 15.0f, 3.0f)
                curveTo(15.0f, 1.895f, 14.105f, 1.0f, 13.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.895f, 1.0f, 1.0f, 1.895f, 1.0f, 3.0f)
                curveTo(1.0f, 4.105f, 1.895f, 5.0f, 3.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(7.0f, 15.0f)
                curveTo(8.105f, 15.0f, 9.0f, 14.105f, 9.0f, 13.0f)
                curveTo(9.0f, 11.895f, 8.105f, 11.0f, 7.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 11.0f, 1.0f, 11.895f, 1.0f, 13.0f)
                curveTo(1.0f, 14.105f, 1.895f, 15.0f, 3.0f, 15.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(11.0f, 8.0f)
                curveTo(11.0f, 9.105f, 10.105f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 10.0f, 1.0f, 9.105f, 1.0f, 8.0f)
                curveTo(1.0f, 6.895f, 1.895f, 6.0f, 3.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                curveTo(10.105f, 6.0f, 11.0f, 6.895f, 11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _dataBarHorizontalDescending!!
    }

@Suppress("ObjectPropertyName")
private var _dataBarHorizontalDescending: ImageVector? = null

@Preview
@Composable
private fun DataBarHorizontalDescendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataBarHorizontalDescending, contentDescription = null)
    }
}

