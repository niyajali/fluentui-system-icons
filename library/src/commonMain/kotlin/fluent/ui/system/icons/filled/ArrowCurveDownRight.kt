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
 * ArrowCurveDownRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, curve, down, right
 * - Source: ic_fluent_arrow_curve_down_right_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowCurveDownRight icon.
 */
public val FluentIcons.Filled.ArrowCurveDownRight: ImageVector
    get() {
        if (_arrowCurveDownRight != null) {
            return _arrowCurveDownRight!!
        }
        _arrowCurveDownRight = Builder(name = "ArrowCurveDownRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.614f, 3.143f)
                curveTo(6.259f, 2.93f, 6.144f, 2.469f, 6.357f, 2.114f)
                curveTo(6.57f, 1.759f, 7.031f, 1.644f, 7.386f, 1.857f)
                curveTo(8.733f, 2.665f, 9.726f, 3.642f, 10.365f, 4.992f)
                curveTo(10.995f, 6.321f, 11.25f, 7.947f, 11.25f, 10.0f)
                verticalLineTo(15.439f)
                lineTo(13.97f, 12.72f)
                curveTo(14.263f, 12.427f, 14.737f, 12.427f, 15.03f, 12.72f)
                curveTo(15.323f, 13.013f, 15.323f, 13.488f, 15.03f, 13.781f)
                lineTo(11.03f, 17.781f)
                curveTo(10.737f, 18.073f, 10.263f, 18.073f, 9.97f, 17.781f)
                lineTo(5.97f, 13.781f)
                curveTo(5.677f, 13.488f, 5.677f, 13.013f, 5.97f, 12.72f)
                curveTo(6.263f, 12.427f, 6.737f, 12.427f, 7.03f, 12.72f)
                lineTo(9.75f, 15.439f)
                verticalLineTo(10.0f)
                curveTo(9.75f, 8.053f, 9.505f, 6.679f, 9.01f, 5.634f)
                curveTo(8.524f, 4.608f, 7.767f, 3.835f, 6.614f, 3.143f)
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
        Image(imageVector = FluentIcons.Filled.ArrowCurveDownRight, contentDescription = null)
    }
}

