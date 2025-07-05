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
 * ChevronDoubleRight Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in directional scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chevron_double_right_20_filled.svg)
 * 
 * @return The [ImageVector] for the ChevronDoubleRight icon.
 */
public val FluentIcons.Filled.ChevronDoubleRight: ImageVector
    get() {
        if (_chevronDoubleRight != null) {
            return _chevronDoubleRight!!
        }
        _chevronDoubleRight = Builder(name = "ChevronDoubleRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.733f, 4.207f)
                curveTo(9.033f, 3.921f, 9.507f, 3.933f, 9.793f, 4.233f)
                lineTo(14.794f, 9.483f)
                curveTo(15.07f, 9.773f, 15.07f, 10.228f, 14.794f, 10.518f)
                lineTo(9.793f, 15.768f)
                curveTo(9.507f, 16.068f, 9.033f, 16.08f, 8.733f, 15.794f)
                curveTo(8.433f, 15.508f, 8.421f, 15.034f, 8.707f, 14.734f)
                lineTo(13.215f, 10.0f)
                lineTo(8.707f, 5.267f)
                curveTo(8.421f, 4.967f, 8.433f, 4.493f, 8.733f, 4.207f)
                close()
                moveTo(4.733f, 4.207f)
                curveTo(5.033f, 3.921f, 5.507f, 3.933f, 5.793f, 4.233f)
                lineTo(10.794f, 9.483f)
                curveTo(11.07f, 9.773f, 11.07f, 10.228f, 10.794f, 10.518f)
                lineTo(5.793f, 15.768f)
                curveTo(5.507f, 16.068f, 5.033f, 16.08f, 4.733f, 15.794f)
                curveTo(4.433f, 15.508f, 4.421f, 15.034f, 4.707f, 14.734f)
                lineTo(9.216f, 10.0f)
                lineTo(4.707f, 5.267f)
                curveTo(4.421f, 4.967f, 4.433f, 4.493f, 4.733f, 4.207f)
                close()
            }
        }
        .build()
        return _chevronDoubleRight!!
    }

@Suppress("ObjectPropertyName")
private var _chevronDoubleRight: ImageVector? = null

@Preview
@Composable
private fun ChevronDoubleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDoubleRight, contentDescription = "ChevronDoubleRight Icon")
    }
}

