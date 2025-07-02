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
 * ArrowTurnRightLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, turn, right, left
 * - Source: ic_fluent_arrow_turn_right_left_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowTurnRightLeft icon.
 */
public val FluentIcons.Filled.ArrowTurnRightLeft: ImageVector
    get() {
        if (_arrowTurnRightLeft != null) {
            return _arrowTurnRightLeft!!
        }
        _arrowTurnRightLeft = Builder(name = "ArrowTurnRightLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.472f, 15.447f)
                curveTo(4.277f, 15.369f, 4.124f, 15.214f, 4.049f, 15.017f)
                curveTo(3.974f, 14.821f, 3.985f, 14.603f, 4.079f, 14.415f)
                lineTo(6.579f, 9.415f)
                curveTo(6.764f, 9.044f, 7.215f, 8.894f, 7.585f, 9.079f)
                curveTo(7.956f, 9.264f, 8.106f, 9.715f, 7.921f, 10.085f)
                lineTo(6.299f, 13.329f)
                lineTo(16.117f, 9.009f)
                lineTo(5.455f, 4.44f)
                curveTo(5.074f, 4.276f, 4.897f, 3.835f, 5.061f, 3.455f)
                curveTo(5.224f, 3.074f, 5.665f, 2.898f, 6.045f, 3.061f)
                lineTo(17.237f, 7.857f)
                curveTo(18.242f, 8.288f, 18.249f, 9.71f, 17.248f, 10.15f)
                lineTo(6.782f, 14.756f)
                lineTo(10.028f, 16.054f)
                curveTo(10.413f, 16.207f, 10.6f, 16.644f, 10.446f, 17.028f)
                curveTo(10.293f, 17.413f, 9.856f, 17.6f, 9.472f, 17.446f)
                lineTo(4.472f, 15.447f)
                close()
            }
        }
        .build()
        return _arrowTurnRightLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnRightLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnRightLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnRightLeft, contentDescription = null)
    }
}

