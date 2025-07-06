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
 * ArrowTurnDownUp Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_down_up_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnDownUp icon.
 */
public val FluentIcons.Regular.ArrowTurnDownUp: ImageVector
    get() {
        if (_arrowTurnDownUp != null) {
            return _arrowTurnDownUp!!
        }
        _arrowTurnDownUp = Builder(name = "ArrowTurnDownUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.566f, 3.004f)
                curveTo(15.604f, 3.009f, 15.642f, 3.019f, 15.679f, 3.033f)
                curveTo(15.809f, 3.082f, 15.913f, 3.185f, 15.965f, 3.315f)
                lineTo(17.964f, 8.315f)
                curveTo(18.067f, 8.571f, 17.942f, 8.862f, 17.686f, 8.964f)
                curveTo(17.429f, 9.067f, 17.138f, 8.942f, 17.036f, 8.686f)
                lineTo(15.502f, 4.848f)
                lineTo(10.912f, 16.372f)
                curveTo(10.582f, 17.2f, 9.416f, 17.216f, 9.064f, 16.397f)
                lineTo(4.041f, 4.697f)
                curveTo(3.932f, 4.444f, 4.049f, 4.149f, 4.303f, 4.041f)
                curveTo(4.557f, 3.932f, 4.851f, 4.049f, 4.96f, 4.303f)
                lineTo(9.983f, 16.002f)
                lineTo(14.55f, 4.535f)
                lineTo(10.724f, 6.447f)
                curveTo(10.477f, 6.571f, 10.176f, 6.471f, 10.053f, 6.224f)
                curveTo(9.929f, 5.977f, 10.03f, 5.676f, 10.277f, 5.553f)
                lineTo(15.259f, 3.062f)
                curveTo(15.351f, 3.012f, 15.458f, 2.99f, 15.566f, 3.004f)
                close()
            }
        }
        .build()
        return _arrowTurnDownUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnDownUp: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnDownUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTurnDownUp, contentDescription = "ArrowTurnDownUp Icon")
    }
}

