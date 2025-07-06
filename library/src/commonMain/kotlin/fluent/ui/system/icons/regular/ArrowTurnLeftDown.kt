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
 * ArrowTurnLeftDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_left_down_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnLeftDown icon.
 */
public val FluentIcons.Regular.ArrowTurnLeftDown: ImageVector
    get() {
        if (_arrowTurnLeftDown != null) {
            return _arrowTurnLeftDown!!
        }
        _arrowTurnLeftDown = Builder(name = "ArrowTurnLeftDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.146f, 11.146f)
                curveTo(2.951f, 11.342f, 2.951f, 11.658f, 3.146f, 11.854f)
                lineTo(7.146f, 15.854f)
                curveTo(7.342f, 16.049f, 7.658f, 16.049f, 7.854f, 15.854f)
                lineTo(11.854f, 11.854f)
                curveTo(12.049f, 11.658f, 12.049f, 11.342f, 11.854f, 11.146f)
                curveTo(11.658f, 10.951f, 11.342f, 10.951f, 11.146f, 11.146f)
                lineTo(8.0f, 14.293f)
                verticalLineTo(8.0f)
                curveTo(8.0f, 6.895f, 8.895f, 6.0f, 10.0f, 6.0f)
                lineTo(16.5f, 6.0f)
                curveTo(16.776f, 6.0f, 17.0f, 5.776f, 17.0f, 5.5f)
                curveTo(17.0f, 5.224f, 16.776f, 5.0f, 16.5f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveTo(8.343f, 5.0f, 7.0f, 6.343f, 7.0f, 8.0f)
                lineTo(7.0f, 14.293f)
                lineTo(3.854f, 11.146f)
                curveTo(3.658f, 10.951f, 3.342f, 10.951f, 3.146f, 11.146f)
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
        Image(imageVector = FluentIcons.Regular.ArrowTurnLeftDown, contentDescription = "ArrowTurnLeftDown Icon")
    }
}

