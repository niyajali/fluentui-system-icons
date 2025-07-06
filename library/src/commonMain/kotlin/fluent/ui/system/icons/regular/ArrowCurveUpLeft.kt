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
 * ArrowCurveUpLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directional indicators, links. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_curve_up_left_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowCurveUpLeft icon.
 */
public val FluentIcons.Regular.ArrowCurveUpLeft: ImageVector
    get() {
        if (_arrowCurveUpLeft != null) {
            return _arrowCurveUpLeft!!
        }
        _arrowCurveUpLeft = Builder(name = "ArrowCurveUpLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.854f, 6.854f)
                curveTo(5.658f, 7.049f, 5.342f, 7.049f, 5.146f, 6.854f)
                curveTo(4.951f, 6.658f, 4.951f, 6.342f, 5.146f, 6.146f)
                lineTo(9.146f, 2.146f)
                curveTo(9.342f, 1.951f, 9.658f, 1.951f, 9.854f, 2.146f)
                lineTo(13.854f, 6.146f)
                curveTo(14.049f, 6.342f, 14.049f, 6.658f, 13.854f, 6.854f)
                curveTo(13.658f, 7.049f, 13.342f, 7.049f, 13.146f, 6.854f)
                lineTo(10.0f, 3.707f)
                lineTo(10.0f, 10.0f)
                curveTo(10.0f, 11.965f, 10.247f, 13.381f, 10.764f, 14.473f)
                curveTo(11.276f, 15.553f, 12.072f, 16.36f, 13.257f, 17.071f)
                curveTo(13.494f, 17.213f, 13.571f, 17.52f, 13.429f, 17.757f)
                curveTo(13.287f, 17.994f, 12.979f, 18.071f, 12.743f, 17.929f)
                curveTo(11.428f, 17.14f, 10.474f, 16.197f, 9.861f, 14.901f)
                curveTo(9.253f, 13.619f, 9.0f, 12.035f, 9.0f, 10.0f)
                lineTo(9.0f, 3.707f)
                lineTo(5.854f, 6.854f)
                close()
            }
        }
        .build()
        return _arrowCurveUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowCurveUpLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowCurveUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCurveUpLeft, contentDescription = "ArrowCurveUpLeft Icon")
    }
}

