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
 * ChevronDoubleUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: chevron, double, up
 * - Source: ic_fluent_chevron_double_up_20_filled.svg
 * 
 * @return The [ImageVector] for the ChevronDoubleUp icon.
 */
public val FluentIcons.Filled.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.207f, 15.267f)
                curveTo(3.921f, 14.967f, 3.933f, 14.493f, 4.233f, 14.207f)
                lineTo(9.483f, 9.206f)
                curveTo(9.772f, 8.93f, 10.228f, 8.93f, 10.517f, 9.206f)
                lineTo(15.767f, 14.207f)
                curveTo(16.067f, 14.493f, 16.079f, 14.967f, 15.793f, 15.267f)
                curveTo(15.507f, 15.567f, 15.033f, 15.579f, 14.733f, 15.293f)
                lineTo(10.0f, 10.784f)
                lineTo(5.267f, 15.293f)
                curveTo(4.967f, 15.579f, 4.493f, 15.567f, 4.207f, 15.267f)
                close()
                moveTo(4.207f, 10.269f)
                curveTo(3.921f, 9.969f, 3.933f, 9.494f, 4.233f, 9.208f)
                lineTo(9.483f, 4.207f)
                curveTo(9.772f, 3.931f, 10.228f, 3.931f, 10.517f, 4.207f)
                lineTo(15.767f, 9.208f)
                curveTo(16.067f, 9.494f, 16.079f, 9.969f, 15.793f, 10.269f)
                curveTo(15.507f, 10.569f, 15.033f, 10.58f, 14.733f, 10.295f)
                lineTo(10.0f, 5.786f)
                lineTo(5.267f, 10.295f)
                curveTo(4.967f, 10.58f, 4.493f, 10.569f, 4.207f, 10.269f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

@Suppress("ObjectPropertyName")
private var _chevronDoubleUp: ImageVector? = null

@Preview
@Composable
private fun ChevronDoubleUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDoubleUp, contentDescription = null)
    }
}

