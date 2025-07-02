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
 * ArrowTurnRightDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, turn, right, down
 * - Source: ic_fluent_arrow_turn_right_down_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowTurnRightDown icon.
 */
public val FluentIcons.Regular.ArrowTurnRightDown: ImageVector
    get() {
        if (_arrowTurnRightDown != null) {
            return _arrowTurnRightDown!!
        }
        _arrowTurnRightDown = Builder(name = "ArrowTurnRightDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.854f, 11.146f)
                curveTo(17.049f, 11.342f, 17.049f, 11.658f, 16.854f, 11.854f)
                lineTo(12.854f, 15.854f)
                curveTo(12.658f, 16.049f, 12.342f, 16.049f, 12.146f, 15.854f)
                lineTo(8.146f, 11.854f)
                curveTo(7.951f, 11.658f, 7.951f, 11.342f, 8.146f, 11.146f)
                curveTo(8.342f, 10.951f, 8.658f, 10.951f, 8.854f, 11.146f)
                lineTo(12.0f, 14.293f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 6.895f, 11.105f, 6.0f, 10.0f, 6.0f)
                lineTo(3.5f, 6.0f)
                curveTo(3.224f, 6.0f, 3.0f, 5.776f, 3.0f, 5.5f)
                curveTo(3.0f, 5.224f, 3.224f, 5.0f, 3.5f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveTo(11.657f, 5.0f, 13.0f, 6.343f, 13.0f, 8.0f)
                verticalLineTo(14.293f)
                lineTo(16.146f, 11.146f)
                curveTo(16.342f, 10.951f, 16.658f, 10.951f, 16.854f, 11.146f)
                close()
            }
        }
        .build()
        return _arrowTurnRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnRightDown: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnRightDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTurnRightDown, contentDescription = null)
    }
}

