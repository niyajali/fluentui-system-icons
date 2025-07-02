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
 * ArrowTurnLeftUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, turn, left, up
 * - Source: ic_fluent_arrow_turn_left_up_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowTurnLeftUp icon.
 */
public val FluentIcons.Regular.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.146f, 8.854f)
                curveTo(2.951f, 8.658f, 2.951f, 8.342f, 3.146f, 8.146f)
                lineTo(7.146f, 4.146f)
                curveTo(7.342f, 3.951f, 7.658f, 3.951f, 7.854f, 4.146f)
                lineTo(11.854f, 8.146f)
                curveTo(12.049f, 8.342f, 12.049f, 8.658f, 11.854f, 8.854f)
                curveTo(11.658f, 9.049f, 11.342f, 9.049f, 11.146f, 8.854f)
                lineTo(8.0f, 5.707f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 13.105f, 8.895f, 14.0f, 10.0f, 14.0f)
                lineTo(16.5f, 14.0f)
                curveTo(16.776f, 14.0f, 17.0f, 14.224f, 17.0f, 14.5f)
                curveTo(17.0f, 14.776f, 16.776f, 15.0f, 16.5f, 15.0f)
                lineTo(10.0f, 15.0f)
                curveTo(8.343f, 15.0f, 7.0f, 13.657f, 7.0f, 12.0f)
                lineTo(7.0f, 5.707f)
                lineTo(3.854f, 8.854f)
                curveTo(3.658f, 9.049f, 3.342f, 9.049f, 3.146f, 8.854f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnLeftUp: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnLeftUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTurnLeftUp, contentDescription = null)
    }
}

