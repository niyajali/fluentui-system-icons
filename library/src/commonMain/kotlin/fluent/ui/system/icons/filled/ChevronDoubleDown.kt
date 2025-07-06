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
 * ChevronDoubleDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in directional scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chevron_double_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the ChevronDoubleDown icon.
 */
public val FluentIcons.Filled.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.794f, 8.733f)
                curveTo(16.08f, 9.033f, 16.068f, 9.507f, 15.768f, 9.793f)
                lineTo(10.518f, 14.794f)
                curveTo(10.228f, 15.07f, 9.773f, 15.07f, 9.483f, 14.794f)
                lineTo(4.233f, 9.793f)
                curveTo(3.933f, 9.507f, 3.921f, 9.033f, 4.207f, 8.733f)
                curveTo(4.493f, 8.433f, 4.967f, 8.421f, 5.267f, 8.707f)
                lineTo(10.0f, 13.215f)
                lineTo(14.734f, 8.707f)
                curveTo(15.034f, 8.421f, 15.508f, 8.433f, 15.794f, 8.733f)
                close()
                moveTo(15.794f, 4.733f)
                curveTo(16.08f, 5.033f, 16.068f, 5.507f, 15.768f, 5.793f)
                lineTo(10.518f, 10.794f)
                curveTo(10.228f, 11.07f, 9.773f, 11.07f, 9.483f, 10.794f)
                lineTo(4.233f, 5.793f)
                curveTo(3.933f, 5.507f, 3.921f, 5.033f, 4.207f, 4.733f)
                curveTo(4.493f, 4.433f, 4.967f, 4.421f, 5.267f, 4.707f)
                lineTo(10.0f, 9.216f)
                lineTo(14.734f, 4.707f)
                curveTo(15.034f, 4.421f, 15.508f, 4.433f, 15.794f, 4.733f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

@Suppress("ObjectPropertyName")
private var _chevronDoubleDown: ImageVector? = null

@Preview
@Composable
private fun ChevronDoubleDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDoubleDown, contentDescription = "ChevronDoubleDown Icon")
    }
}

