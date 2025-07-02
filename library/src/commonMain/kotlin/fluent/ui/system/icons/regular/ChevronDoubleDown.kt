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
 * ChevronDoubleDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: chevron, double, down
 * - Source: ic_fluent_chevron_double_down_20_regular.svg
 * 
 * @return The [ImageVector] for the ChevronDoubleDown icon.
 */
public val FluentIcons.Regular.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.854f, 8.646f)
                curveTo(16.049f, 8.841f, 16.05f, 9.157f, 15.855f, 9.353f)
                lineTo(10.39f, 14.837f)
                curveTo(10.175f, 15.053f, 9.826f, 15.053f, 9.611f, 14.837f)
                lineTo(4.146f, 9.353f)
                curveTo(3.951f, 9.157f, 3.951f, 8.841f, 4.147f, 8.646f)
                curveTo(4.343f, 8.451f, 4.659f, 8.451f, 4.854f, 8.647f)
                lineTo(10.0f, 13.812f)
                lineTo(15.147f, 8.647f)
                curveTo(15.342f, 8.451f, 15.658f, 8.451f, 15.854f, 8.646f)
                close()
                moveTo(15.854f, 4.646f)
                curveTo(16.049f, 4.841f, 16.05f, 5.157f, 15.855f, 5.353f)
                lineTo(10.39f, 10.837f)
                curveTo(10.175f, 11.053f, 9.826f, 11.053f, 9.611f, 10.837f)
                lineTo(4.146f, 5.353f)
                curveTo(3.951f, 5.157f, 3.951f, 4.841f, 4.147f, 4.646f)
                curveTo(4.343f, 4.451f, 4.659f, 4.451f, 4.854f, 4.647f)
                lineTo(10.0f, 9.812f)
                lineTo(15.147f, 4.647f)
                curveTo(15.342f, 4.451f, 15.658f, 4.451f, 15.854f, 4.646f)
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
        Image(imageVector = FluentIcons.Regular.ChevronDoubleDown, contentDescription = null)
    }
}

