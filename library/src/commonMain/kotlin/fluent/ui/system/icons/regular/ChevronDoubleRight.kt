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
 * ChevronDoubleRight Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in directional scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chevron_double_right_20_regular.svg)
 * 
 * @return The [ImageVector] for the ChevronDoubleRight icon.
 */
public val FluentIcons.Regular.ChevronDoubleRight: ImageVector
    get() {
        if (_chevronDoubleRight != null) {
            return _chevronDoubleRight!!
        }
        _chevronDoubleRight = Builder(name = "ChevronDoubleRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.646f, 4.147f)
                curveTo(8.841f, 3.951f, 9.157f, 3.951f, 9.353f, 4.146f)
                lineTo(14.837f, 9.611f)
                curveTo(15.053f, 9.826f, 15.053f, 10.175f, 14.837f, 10.39f)
                lineTo(9.353f, 15.855f)
                curveTo(9.157f, 16.05f, 8.841f, 16.049f, 8.646f, 15.854f)
                curveTo(8.451f, 15.658f, 8.451f, 15.342f, 8.647f, 15.147f)
                lineTo(13.812f, 10.0f)
                lineTo(8.647f, 4.854f)
                curveTo(8.451f, 4.659f, 8.451f, 4.343f, 8.646f, 4.147f)
                close()
                moveTo(4.646f, 4.147f)
                curveTo(4.841f, 3.951f, 5.157f, 3.951f, 5.353f, 4.146f)
                lineTo(10.837f, 9.611f)
                curveTo(11.053f, 9.826f, 11.053f, 10.175f, 10.837f, 10.39f)
                lineTo(5.353f, 15.855f)
                curveTo(5.157f, 16.05f, 4.841f, 16.049f, 4.646f, 15.854f)
                curveTo(4.451f, 15.658f, 4.451f, 15.342f, 4.647f, 15.147f)
                lineTo(9.812f, 10.0f)
                lineTo(4.647f, 4.854f)
                curveTo(4.451f, 4.659f, 4.451f, 4.343f, 4.646f, 4.147f)
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
        Image(imageVector = FluentIcons.Regular.ChevronDoubleRight, contentDescription = "ChevronDoubleRight Icon")
    }
}

