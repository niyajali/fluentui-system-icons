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
 * ArrowTurnRightDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directions or gesture directions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_turn_right_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowTurnRightDown icon.
 */
public val FluentIcons.Filled.ArrowTurnRightDown: ImageVector
    get() {
        if (_arrowTurnRightDown != null) {
            return _arrowTurnRightDown!!
        }
        _arrowTurnRightDown = Builder(name = "ArrowTurnRightDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.78f, 10.72f)
                curveTo(17.073f, 11.013f, 17.073f, 11.487f, 16.78f, 11.78f)
                lineTo(12.78f, 15.78f)
                curveTo(12.487f, 16.073f, 12.013f, 16.073f, 11.72f, 15.78f)
                lineTo(7.72f, 11.78f)
                curveTo(7.427f, 11.487f, 7.427f, 11.013f, 7.72f, 10.72f)
                curveTo(8.013f, 10.427f, 8.487f, 10.427f, 8.78f, 10.72f)
                lineTo(11.5f, 13.439f)
                verticalLineTo(7.0f)
                curveTo(11.5f, 6.172f, 10.828f, 5.5f, 10.0f, 5.5f)
                lineTo(3.75f, 5.5f)
                curveTo(3.336f, 5.5f, 3.0f, 5.164f, 3.0f, 4.75f)
                curveTo(3.0f, 4.336f, 3.336f, 4.0f, 3.75f, 4.0f)
                lineTo(10.0f, 4.0f)
                curveTo(11.657f, 4.0f, 13.0f, 5.343f, 13.0f, 7.0f)
                verticalLineTo(13.439f)
                lineTo(15.72f, 10.72f)
                curveTo(16.013f, 10.427f, 16.487f, 10.427f, 16.78f, 10.72f)
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
        Image(imageVector = FluentIcons.Filled.ArrowTurnRightDown, contentDescription = "ArrowTurnRightDown Icon")
    }
}

