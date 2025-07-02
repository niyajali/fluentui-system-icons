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
 * ArrowTurnUpDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, turn, up, down
 * - Source: ic_fluent_arrow_turn_up_down_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowTurnUpDown icon.
 */
public val FluentIcons.Regular.ArrowTurnUpDown: ImageVector
    get() {
        if (_arrowTurnUpDown != null) {
            return _arrowTurnUpDown!!
        }
        _arrowTurnUpDown = Builder(name = "ArrowTurnUpDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.566f, 16.996f)
                curveTo(15.604f, 16.991f, 15.642f, 16.982f, 15.679f, 16.968f)
                curveTo(15.809f, 16.918f, 15.913f, 16.816f, 15.965f, 16.686f)
                lineTo(17.964f, 11.686f)
                curveTo(18.067f, 11.429f, 17.942f, 11.139f, 17.686f, 11.036f)
                curveTo(17.429f, 10.934f, 17.138f, 11.058f, 17.036f, 11.315f)
                lineTo(15.502f, 15.152f)
                lineTo(10.912f, 3.628f)
                curveTo(10.582f, 2.8f, 9.416f, 2.785f, 9.064f, 3.604f)
                lineTo(4.041f, 15.303f)
                curveTo(3.932f, 15.557f, 4.049f, 15.851f, 4.303f, 15.96f)
                curveTo(4.557f, 16.069f, 4.851f, 15.951f, 4.96f, 15.698f)
                lineTo(9.983f, 3.998f)
                lineTo(14.55f, 15.466f)
                lineTo(10.724f, 13.553f)
                curveTo(10.477f, 13.43f, 10.176f, 13.53f, 10.053f, 13.777f)
                curveTo(9.929f, 14.024f, 10.03f, 14.324f, 10.277f, 14.448f)
                lineTo(15.259f, 16.938f)
                curveTo(15.351f, 16.989f, 15.458f, 17.01f, 15.566f, 16.996f)
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
        Image(imageVector = FluentIcons.Regular.ArrowTurnUpDown, contentDescription = null)
    }
}

