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
 * ArrowCurveUpRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, curve, up, right
 * - Source: ic_fluent_arrow_curve_up_right_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowCurveUpRight icon.
 */
public val FluentIcons.Regular.ArrowCurveUpRight: ImageVector
    get() {
        if (_arrowCurveUpRight != null) {
            return _arrowCurveUpRight!!
        }
        _arrowCurveUpRight = Builder(name = "ArrowCurveUpRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.146f, 6.854f)
                curveTo(14.342f, 7.049f, 14.658f, 7.049f, 14.854f, 6.854f)
                curveTo(15.049f, 6.658f, 15.049f, 6.342f, 14.854f, 6.146f)
                lineTo(10.854f, 2.146f)
                curveTo(10.658f, 1.951f, 10.342f, 1.951f, 10.146f, 2.146f)
                lineTo(6.146f, 6.146f)
                curveTo(5.951f, 6.342f, 5.951f, 6.658f, 6.146f, 6.854f)
                curveTo(6.342f, 7.049f, 6.658f, 7.049f, 6.854f, 6.854f)
                lineTo(10.0f, 3.707f)
                lineTo(10.0f, 10.0f)
                curveTo(10.0f, 11.965f, 9.753f, 13.381f, 9.236f, 14.473f)
                curveTo(8.724f, 15.553f, 7.928f, 16.36f, 6.743f, 17.071f)
                curveTo(6.506f, 17.213f, 6.429f, 17.52f, 6.571f, 17.757f)
                curveTo(6.713f, 17.994f, 7.02f, 18.071f, 7.257f, 17.929f)
                curveTo(8.572f, 17.14f, 9.526f, 16.197f, 10.139f, 14.901f)
                curveTo(10.747f, 13.619f, 11.0f, 12.035f, 11.0f, 10.0f)
                lineTo(11.0f, 3.707f)
                lineTo(14.146f, 6.854f)
                close()
            }
        }
        .build()
        return _arrowCurveUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _arrowCurveUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowCurveUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCurveUpRight, contentDescription = null)
    }
}

