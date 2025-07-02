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
 * ArrowTurnRightLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, turn, right, left
 * - Source: ic_fluent_arrow_turn_right_left_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowTurnRightLeft icon.
 */
public val FluentIcons.Regular.ArrowTurnRightLeft: ImageVector
    get() {
        if (_arrowTurnRightLeft != null) {
            return _arrowTurnRightLeft!!
        }
        _arrowTurnRightLeft = Builder(name = "ArrowTurnRightLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.004f, 14.566f)
                curveTo(4.009f, 14.604f, 4.019f, 14.642f, 4.033f, 14.679f)
                curveTo(4.082f, 14.809f, 4.185f, 14.913f, 4.315f, 14.965f)
                lineTo(9.315f, 16.964f)
                curveTo(9.571f, 17.067f, 9.862f, 16.942f, 9.964f, 16.686f)
                curveTo(10.067f, 16.429f, 9.942f, 16.138f, 9.686f, 16.036f)
                lineTo(5.848f, 14.502f)
                lineTo(17.372f, 9.912f)
                curveTo(18.2f, 9.582f, 18.216f, 8.416f, 17.397f, 8.064f)
                lineTo(5.697f, 3.041f)
                curveTo(5.444f, 2.932f, 5.149f, 3.049f, 5.041f, 3.303f)
                curveTo(4.932f, 3.557f, 5.049f, 3.851f, 5.303f, 3.96f)
                lineTo(17.002f, 8.983f)
                lineTo(5.535f, 13.55f)
                lineTo(7.447f, 9.724f)
                curveTo(7.571f, 9.477f, 7.471f, 9.176f, 7.224f, 9.053f)
                curveTo(6.977f, 8.929f, 6.676f, 9.03f, 6.553f, 9.277f)
                lineTo(4.062f, 14.259f)
                curveTo(4.012f, 14.351f, 3.99f, 14.458f, 4.004f, 14.566f)
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
        Image(imageVector = FluentIcons.Regular.ArrowTurnRightLeft, contentDescription = null)
    }
}

