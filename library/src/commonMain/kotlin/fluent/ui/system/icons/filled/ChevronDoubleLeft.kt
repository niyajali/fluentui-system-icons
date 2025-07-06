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
 * ChevronDoubleLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in directional scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chevron_double_left_20_filled.svg)
 * 
 * @return The [ImageVector] for the ChevronDoubleLeft icon.
 */
public val FluentIcons.Filled.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.269f, 15.794f)
                curveTo(10.969f, 16.08f, 10.494f, 16.068f, 10.208f, 15.768f)
                lineTo(5.207f, 10.518f)
                curveTo(4.931f, 10.228f, 4.931f, 9.773f, 5.207f, 9.483f)
                lineTo(10.208f, 4.233f)
                curveTo(10.494f, 3.933f, 10.969f, 3.921f, 11.269f, 4.207f)
                curveTo(11.568f, 4.493f, 11.58f, 4.967f, 11.294f, 5.267f)
                lineTo(6.786f, 10.0f)
                lineTo(11.294f, 14.734f)
                curveTo(11.58f, 15.034f, 11.568f, 15.508f, 11.269f, 15.794f)
                close()
                moveTo(15.27f, 15.795f)
                curveTo(14.97f, 16.081f, 14.495f, 16.069f, 14.209f, 15.769f)
                lineTo(9.208f, 10.519f)
                curveTo(8.932f, 10.229f, 8.932f, 9.774f, 9.208f, 9.484f)
                lineTo(14.209f, 4.234f)
                curveTo(14.495f, 3.934f, 14.97f, 3.922f, 15.27f, 4.208f)
                curveTo(15.569f, 4.494f, 15.581f, 4.968f, 15.295f, 5.268f)
                lineTo(10.787f, 10.001f)
                lineTo(15.295f, 14.735f)
                curveTo(15.581f, 15.035f, 15.569f, 15.509f, 15.27f, 15.795f)
                close()
            }
        }
        .build()
        return _chevronDoubleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _chevronDoubleLeft: ImageVector? = null

@Preview
@Composable
private fun ChevronDoubleLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDoubleLeft, contentDescription = "ChevronDoubleLeft Icon")
    }
}

