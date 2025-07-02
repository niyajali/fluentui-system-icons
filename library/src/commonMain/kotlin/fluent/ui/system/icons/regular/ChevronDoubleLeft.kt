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
 * ChevronDoubleLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: chevron, double, left
 * - Source: ic_fluent_chevron_double_left_20_regular.svg
 * 
 * @return The [ImageVector] for the ChevronDoubleLeft icon.
 */
public val FluentIcons.Regular.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.353f, 15.854f)
                curveTo(11.158f, 16.049f, 10.842f, 16.05f, 10.646f, 15.855f)
                lineTo(5.162f, 10.39f)
                curveTo(4.946f, 10.175f, 4.946f, 9.826f, 5.162f, 9.611f)
                lineTo(10.646f, 4.146f)
                curveTo(10.842f, 3.951f, 11.158f, 3.951f, 11.353f, 4.147f)
                curveTo(11.548f, 4.343f, 11.548f, 4.659f, 11.352f, 4.854f)
                lineTo(6.188f, 10.0f)
                lineTo(11.352f, 15.147f)
                curveTo(11.548f, 15.342f, 11.548f, 15.658f, 11.353f, 15.854f)
                close()
                moveTo(15.352f, 15.854f)
                curveTo(15.158f, 16.049f, 14.841f, 16.05f, 14.645f, 15.855f)
                lineTo(9.161f, 10.39f)
                curveTo(8.945f, 10.175f, 8.945f, 9.826f, 9.161f, 9.611f)
                lineTo(14.645f, 4.146f)
                curveTo(14.841f, 3.951f, 15.158f, 3.951f, 15.352f, 4.147f)
                curveTo(15.547f, 4.343f, 15.547f, 4.659f, 15.351f, 4.854f)
                lineTo(10.187f, 10.0f)
                lineTo(15.351f, 15.147f)
                curveTo(15.547f, 15.342f, 15.547f, 15.658f, 15.352f, 15.854f)
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
        Image(imageVector = FluentIcons.Regular.ChevronDoubleLeft, contentDescription = null)
    }
}

