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
 * ArrowTurnLeftRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, turn, left, right
 * - Source: ic_fluent_arrow_turn_left_right_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowTurnLeftRight icon.
 */
public val FluentIcons.Regular.ArrowTurnLeftRight: ImageVector
    get() {
        if (_arrowTurnLeftRight != null) {
            return _arrowTurnLeftRight!!
        }
        _arrowTurnLeftRight = Builder(name = "ArrowTurnLeftRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.996f, 14.566f)
                curveTo(15.991f, 14.604f, 15.982f, 14.642f, 15.968f, 14.679f)
                curveTo(15.918f, 14.809f, 15.816f, 14.913f, 15.686f, 14.965f)
                lineTo(10.686f, 16.964f)
                curveTo(10.429f, 17.067f, 10.139f, 16.942f, 10.036f, 16.686f)
                curveTo(9.933f, 16.429f, 10.058f, 16.138f, 10.315f, 16.036f)
                lineTo(14.152f, 14.502f)
                lineTo(2.628f, 9.912f)
                curveTo(1.8f, 9.582f, 1.785f, 8.416f, 2.604f, 8.064f)
                lineTo(14.303f, 3.041f)
                curveTo(14.557f, 2.932f, 14.851f, 3.049f, 14.96f, 3.303f)
                curveTo(15.069f, 3.557f, 14.951f, 3.851f, 14.698f, 3.96f)
                lineTo(2.998f, 8.983f)
                lineTo(14.466f, 13.55f)
                lineTo(12.553f, 9.724f)
                curveTo(12.43f, 9.477f, 12.53f, 9.176f, 12.777f, 9.053f)
                curveTo(13.024f, 8.929f, 13.324f, 9.03f, 13.448f, 9.277f)
                lineTo(15.938f, 14.259f)
                curveTo(15.989f, 14.351f, 16.01f, 14.458f, 15.996f, 14.566f)
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
        Image(imageVector = FluentIcons.Regular.ArrowTurnLeftRight, contentDescription = null)
    }
}

