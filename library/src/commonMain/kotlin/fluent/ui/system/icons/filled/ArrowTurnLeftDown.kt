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
 * ArrowTurnLeftDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, turn, left, down
 * - Source: ic_fluent_arrow_turn_left_down_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowTurnLeftDown icon.
 */
public val FluentIcons.Filled.ArrowTurnLeftDown: ImageVector
    get() {
        if (_arrowTurnLeftDown != null) {
            return _arrowTurnLeftDown!!
        }
        _arrowTurnLeftDown = Builder(name = "ArrowTurnLeftDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.22f, 10.72f)
                curveTo(2.927f, 11.013f, 2.927f, 11.487f, 3.22f, 11.78f)
                lineTo(7.22f, 15.78f)
                curveTo(7.513f, 16.073f, 7.987f, 16.073f, 8.28f, 15.78f)
                lineTo(12.28f, 11.78f)
                curveTo(12.573f, 11.487f, 12.573f, 11.013f, 12.28f, 10.72f)
                curveTo(11.987f, 10.427f, 11.513f, 10.427f, 11.22f, 10.72f)
                lineTo(8.5f, 13.439f)
                verticalLineTo(7.0f)
                curveTo(8.5f, 6.172f, 9.172f, 5.5f, 10.0f, 5.5f)
                lineTo(16.25f, 5.5f)
                curveTo(16.664f, 5.5f, 17.0f, 5.164f, 17.0f, 4.75f)
                curveTo(17.0f, 4.336f, 16.664f, 4.0f, 16.25f, 4.0f)
                lineTo(10.0f, 4.0f)
                curveTo(8.343f, 4.0f, 7.0f, 5.343f, 7.0f, 7.0f)
                lineTo(7.0f, 13.439f)
                lineTo(4.28f, 10.72f)
                curveTo(3.987f, 10.427f, 3.513f, 10.427f, 3.22f, 10.72f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnLeftDown: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnLeftDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnLeftDown, contentDescription = null)
    }
}

