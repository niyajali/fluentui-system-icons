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
 * ArrowTurnDownLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, turn, down, left
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_down_left_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnDownLeft icon.
 */
public val FluentIcons.Filled.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.28f, 16.78f)
                curveTo(8.987f, 17.073f, 8.513f, 17.073f, 8.22f, 16.78f)
                lineTo(4.22f, 12.78f)
                curveTo(3.927f, 12.487f, 3.927f, 12.013f, 4.22f, 11.72f)
                lineTo(8.22f, 7.72f)
                curveTo(8.513f, 7.427f, 8.987f, 7.427f, 9.28f, 7.72f)
                curveTo(9.573f, 8.013f, 9.573f, 8.487f, 9.28f, 8.78f)
                lineTo(6.561f, 11.5f)
                horizontalLineTo(13.0f)
                curveTo(13.828f, 11.5f, 14.5f, 10.828f, 14.5f, 10.0f)
                verticalLineTo(3.75f)
                curveTo(14.5f, 3.336f, 14.836f, 3.0f, 15.25f, 3.0f)
                curveTo(15.664f, 3.0f, 16.0f, 3.336f, 16.0f, 3.75f)
                verticalLineTo(10.0f)
                curveTo(16.0f, 11.657f, 14.657f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(6.561f)
                lineTo(9.28f, 15.72f)
                curveTo(9.573f, 16.013f, 9.573f, 16.487f, 9.28f, 16.78f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnDownLeft, contentDescription = "ArrowTurnDownLeft Icon")
    }
}

