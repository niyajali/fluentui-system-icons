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
 * ArrowCurveUpLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for directional indicators, links. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_curve_up_left_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowCurveUpLeft icon.
 */
public val FluentIcons.Filled.ArrowCurveUpLeft: ImageVector
    get() {
        if (_arrowCurveUpLeft != null) {
            return _arrowCurveUpLeft!!
        }
        _arrowCurveUpLeft = Builder(name = "ArrowCurveUpLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.03f, 7.03f)
                curveTo(5.737f, 7.323f, 5.263f, 7.323f, 4.97f, 7.03f)
                curveTo(4.677f, 6.737f, 4.677f, 6.263f, 4.97f, 5.97f)
                lineTo(8.97f, 1.97f)
                curveTo(9.263f, 1.677f, 9.737f, 1.677f, 10.03f, 1.97f)
                lineTo(14.03f, 5.97f)
                curveTo(14.323f, 6.263f, 14.323f, 6.737f, 14.03f, 7.03f)
                curveTo(13.737f, 7.323f, 13.263f, 7.323f, 12.97f, 7.03f)
                lineTo(10.25f, 4.311f)
                lineTo(10.25f, 9.75f)
                curveTo(10.25f, 11.697f, 10.495f, 13.071f, 10.99f, 14.116f)
                curveTo(11.476f, 15.142f, 12.233f, 15.915f, 13.386f, 16.607f)
                curveTo(13.741f, 16.82f, 13.856f, 17.281f, 13.643f, 17.636f)
                curveTo(13.43f, 17.991f, 12.969f, 18.106f, 12.614f, 17.893f)
                curveTo(11.267f, 17.085f, 10.274f, 16.108f, 9.635f, 14.759f)
                curveTo(9.005f, 13.429f, 8.75f, 11.803f, 8.75f, 9.75f)
                lineTo(8.75f, 4.311f)
                lineTo(6.03f, 7.03f)
                close()
            }
        }
        .build()
        return _arrowCurveUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _arrowCurveUpLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowCurveUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCurveUpLeft, contentDescription = "ArrowCurveUpLeft Icon")
    }
}

