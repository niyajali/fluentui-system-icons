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
 * ArrowTurnUpLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_up_left_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnUpLeft icon.
 */
public val FluentIcons.Regular.ArrowTurnUpLeft: ImageVector
    get() {
        if (_arrowTurnUpLeft != null) {
            return _arrowTurnUpLeft!!
        }
        _arrowTurnUpLeft = Builder(name = "ArrowTurnUpLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.854f, 3.146f)
                curveTo(8.658f, 2.951f, 8.342f, 2.951f, 8.146f, 3.146f)
                lineTo(4.146f, 7.146f)
                curveTo(3.951f, 7.342f, 3.951f, 7.658f, 4.146f, 7.854f)
                lineTo(8.146f, 11.854f)
                curveTo(8.342f, 12.049f, 8.658f, 12.049f, 8.854f, 11.854f)
                curveTo(9.049f, 11.658f, 9.049f, 11.342f, 8.854f, 11.146f)
                lineTo(5.707f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.776f, 14.224f, 17.0f, 14.5f, 17.0f)
                curveTo(14.776f, 17.0f, 15.0f, 16.776f, 15.0f, 16.5f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.343f, 13.657f, 7.0f, 12.0f, 7.0f)
                horizontalLineTo(5.707f)
                lineTo(8.854f, 3.854f)
                curveTo(9.049f, 3.658f, 9.049f, 3.342f, 8.854f, 3.146f)
                close()
            }
        }
        .build()
        return _arrowTurnUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowTurnUpLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTurnUpLeft, contentDescription = "ArrowTurnUpLeft Icon")
    }
}

