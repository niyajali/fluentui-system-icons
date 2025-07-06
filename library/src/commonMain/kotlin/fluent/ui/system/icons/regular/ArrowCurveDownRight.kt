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
 * ArrowCurveDownRight Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directional indicators, links. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_curve_down_right_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowCurveDownRight icon.
 */
public val FluentIcons.Regular.ArrowCurveDownRight: ImageVector
    get() {
        if (_arrowCurveDownRight != null) {
            return _arrowCurveDownRight!!
        }
        _arrowCurveDownRight = Builder(name = "ArrowCurveDownRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.743f, 2.929f)
                curveTo(6.506f, 2.787f, 6.429f, 2.48f, 6.571f, 2.243f)
                curveTo(6.713f, 2.006f, 7.02f, 1.929f, 7.257f, 2.071f)
                curveTo(8.572f, 2.86f, 9.526f, 3.803f, 10.139f, 5.099f)
                curveTo(10.747f, 6.381f, 11.0f, 7.965f, 11.0f, 10.0f)
                verticalLineTo(16.293f)
                lineTo(14.146f, 13.146f)
                curveTo(14.342f, 12.951f, 14.658f, 12.951f, 14.854f, 13.146f)
                curveTo(15.049f, 13.342f, 15.049f, 13.658f, 14.854f, 13.854f)
                lineTo(10.854f, 17.854f)
                curveTo(10.658f, 18.049f, 10.342f, 18.049f, 10.146f, 17.854f)
                lineTo(6.146f, 13.854f)
                curveTo(5.951f, 13.658f, 5.951f, 13.342f, 6.146f, 13.146f)
                curveTo(6.342f, 12.951f, 6.658f, 12.951f, 6.854f, 13.146f)
                lineTo(10.0f, 16.293f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 8.035f, 9.753f, 6.619f, 9.236f, 5.527f)
                curveTo(8.724f, 4.447f, 7.928f, 3.64f, 6.743f, 2.929f)
                close()
            }
        }
        .build()
        return _arrowCurveDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _arrowCurveDownRight: ImageVector? = null

@Preview
@Composable
private fun ArrowCurveDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCurveDownRight, contentDescription = "ArrowCurveDownRight Icon")
    }
}

