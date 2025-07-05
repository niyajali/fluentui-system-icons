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
 * ArrowTurnLeftUp Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_left_up_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnLeftUp icon.
 */
public val FluentIcons.Filled.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.22f, 9.28f)
                curveTo(2.927f, 8.987f, 2.927f, 8.513f, 3.22f, 8.22f)
                lineTo(7.22f, 4.22f)
                curveTo(7.513f, 3.927f, 7.987f, 3.927f, 8.28f, 4.22f)
                lineTo(12.28f, 8.22f)
                curveTo(12.573f, 8.513f, 12.573f, 8.987f, 12.28f, 9.28f)
                curveTo(11.987f, 9.573f, 11.513f, 9.573f, 11.22f, 9.28f)
                lineTo(8.5f, 6.561f)
                verticalLineTo(13.0f)
                curveTo(8.5f, 13.828f, 9.172f, 14.5f, 10.0f, 14.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 14.5f, 17.0f, 14.836f, 17.0f, 15.25f)
                curveTo(17.0f, 15.664f, 16.664f, 16.0f, 16.25f, 16.0f)
                horizontalLineTo(10.0f)
                curveTo(8.343f, 16.0f, 7.0f, 14.657f, 7.0f, 13.0f)
                lineTo(7.0f, 6.561f)
                lineTo(4.28f, 9.28f)
                curveTo(3.987f, 9.573f, 3.513f, 9.573f, 3.22f, 9.28f)
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
        Image(imageVector = FluentIcons.Filled.ArrowTurnLeftUp, contentDescription = "ArrowTurnLeftUp Icon")
    }
}

