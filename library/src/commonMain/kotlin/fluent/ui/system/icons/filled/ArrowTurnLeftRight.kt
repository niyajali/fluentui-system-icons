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
 * ArrowTurnLeftRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, turn, left, right
 * - Source: ic_fluent_arrow_turn_left_right_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowTurnLeftRight icon.
 */
public val FluentIcons.Filled.ArrowTurnLeftRight: ImageVector
    get() {
        if (_arrowTurnLeftRight != null) {
            return _arrowTurnLeftRight!!
        }
        _arrowTurnLeftRight = Builder(name = "ArrowTurnLeftRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.529f, 15.447f)
                curveTo(15.724f, 15.369f, 15.877f, 15.214f, 15.952f, 15.017f)
                curveTo(16.026f, 14.821f, 16.015f, 14.603f, 15.922f, 14.415f)
                lineTo(13.422f, 9.415f)
                curveTo(13.236f, 9.044f, 12.786f, 8.894f, 12.415f, 9.079f)
                curveTo(12.045f, 9.264f, 11.895f, 9.715f, 12.08f, 10.085f)
                lineTo(13.701f, 13.329f)
                lineTo(3.883f, 9.009f)
                lineTo(14.546f, 4.44f)
                curveTo(14.927f, 4.276f, 15.103f, 3.835f, 14.94f, 3.455f)
                curveTo(14.777f, 3.074f, 14.336f, 2.898f, 13.955f, 3.061f)
                lineTo(2.763f, 7.857f)
                curveTo(1.759f, 8.288f, 1.752f, 9.71f, 2.752f, 10.15f)
                lineTo(13.219f, 14.756f)
                lineTo(9.972f, 16.054f)
                curveTo(9.588f, 16.207f, 9.4f, 16.644f, 9.554f, 17.028f)
                curveTo(9.708f, 17.413f, 10.144f, 17.6f, 10.529f, 17.446f)
                lineTo(15.529f, 15.447f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnLeftRight: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnLeftRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnLeftRight, contentDescription = null)
    }
}

