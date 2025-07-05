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
 * ArrowTurnDownUp Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_down_up_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnDownUp icon.
 */
public val FluentIcons.Filled.ArrowTurnDownUp: ImageVector
    get() {
        if (_arrowTurnDownUp != null) {
            return _arrowTurnDownUp!!
        }
        _arrowTurnDownUp = Builder(name = "ArrowTurnDownUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.447f, 3.472f)
                curveTo(16.369f, 3.277f, 16.214f, 3.124f, 16.017f, 3.049f)
                curveTo(15.821f, 2.974f, 15.603f, 2.985f, 15.415f, 3.079f)
                lineTo(10.415f, 5.579f)
                curveTo(10.044f, 5.764f, 9.894f, 6.215f, 10.079f, 6.585f)
                curveTo(10.264f, 6.956f, 10.715f, 7.106f, 11.085f, 6.921f)
                lineTo(14.329f, 5.299f)
                lineTo(10.009f, 15.117f)
                lineTo(5.44f, 4.455f)
                curveTo(5.276f, 4.074f, 4.835f, 3.897f, 4.455f, 4.061f)
                curveTo(4.074f, 4.224f, 3.898f, 4.665f, 4.061f, 5.045f)
                lineTo(8.857f, 16.237f)
                curveTo(9.288f, 17.242f, 10.71f, 17.249f, 11.15f, 16.248f)
                lineTo(15.756f, 5.782f)
                lineTo(17.054f, 9.028f)
                curveTo(17.207f, 9.413f, 17.644f, 9.6f, 18.028f, 9.446f)
                curveTo(18.413f, 9.293f, 18.6f, 8.856f, 18.446f, 8.472f)
                lineTo(16.447f, 3.472f)
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
        Image(imageVector = FluentIcons.Filled.ArrowTurnDownUp, contentDescription = "ArrowTurnDownUp Icon")
    }
}

