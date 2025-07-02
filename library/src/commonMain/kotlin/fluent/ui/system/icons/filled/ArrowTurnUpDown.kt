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
 * ArrowTurnUpDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, turn, up, down
 * - Source: ic_fluent_arrow_turn_up_down_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowTurnUpDown icon.
 */
public val FluentIcons.Filled.ArrowTurnUpDown: ImageVector
    get() {
        if (_arrowTurnUpDown != null) {
            return _arrowTurnUpDown!!
        }
        _arrowTurnUpDown = Builder(name = "ArrowTurnUpDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.447f, 16.529f)
                curveTo(16.369f, 16.724f, 16.214f, 16.877f, 16.017f, 16.952f)
                curveTo(15.821f, 17.026f, 15.603f, 17.015f, 15.415f, 16.921f)
                lineTo(10.415f, 14.422f)
                curveTo(10.044f, 14.236f, 9.894f, 13.786f, 10.079f, 13.415f)
                curveTo(10.264f, 13.045f, 10.715f, 12.895f, 11.085f, 13.08f)
                lineTo(14.329f, 14.701f)
                lineTo(10.009f, 4.883f)
                lineTo(5.44f, 15.546f)
                curveTo(5.276f, 15.927f, 4.835f, 16.103f, 4.455f, 15.94f)
                curveTo(4.074f, 15.777f, 3.898f, 15.336f, 4.061f, 14.955f)
                lineTo(8.857f, 3.763f)
                curveTo(9.288f, 2.759f, 10.71f, 2.752f, 11.15f, 3.752f)
                lineTo(15.756f, 14.219f)
                lineTo(17.054f, 10.972f)
                curveTo(17.207f, 10.588f, 17.644f, 10.401f, 18.028f, 10.554f)
                curveTo(18.413f, 10.708f, 18.6f, 11.144f, 18.446f, 11.529f)
                lineTo(16.447f, 16.529f)
                close()
            }
        }
        .build()
        return _arrowTurnUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnUpDown: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnUpDown, contentDescription = null)
    }
}

