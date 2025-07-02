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
 * ArrowMoveInward icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, move, inward
 * - Source: ic_fluent_arrow_move_inward_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowMoveInward icon.
 */
public val FluentIcons.Regular.ArrowMoveInward: ImageVector
    get() {
        if (_arrowMoveInward != null) {
            return _arrowMoveInward!!
        }
        _arrowMoveInward = Builder(name = "ArrowMoveInward", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.146f, 16.354f)
                curveTo(7.342f, 16.549f, 7.658f, 16.549f, 7.854f, 16.354f)
                lineTo(9.5f, 14.707f)
                verticalLineTo(18.5f)
                curveTo(9.5f, 18.776f, 9.724f, 19.0f, 10.0f, 19.0f)
                curveTo(10.276f, 19.0f, 10.5f, 18.776f, 10.5f, 18.5f)
                verticalLineTo(14.707f)
                lineTo(12.146f, 16.354f)
                curveTo(12.342f, 16.549f, 12.658f, 16.549f, 12.854f, 16.354f)
                curveTo(13.049f, 16.158f, 13.049f, 15.842f, 12.854f, 15.646f)
                lineTo(10.354f, 13.146f)
                curveTo(10.158f, 12.951f, 9.842f, 12.951f, 9.646f, 13.146f)
                lineTo(7.146f, 15.646f)
                curveTo(6.951f, 15.842f, 6.951f, 16.158f, 7.146f, 16.354f)
                close()
                moveTo(16.354f, 7.854f)
                curveTo(16.549f, 7.658f, 16.549f, 7.342f, 16.354f, 7.146f)
                curveTo(16.158f, 6.951f, 15.842f, 6.951f, 15.646f, 7.146f)
                lineTo(13.146f, 9.646f)
                curveTo(12.951f, 9.842f, 12.951f, 10.158f, 13.146f, 10.354f)
                lineTo(15.646f, 12.854f)
                curveTo(15.842f, 13.049f, 16.158f, 13.049f, 16.354f, 12.854f)
                curveTo(16.549f, 12.658f, 16.549f, 12.342f, 16.354f, 12.146f)
                lineTo(14.707f, 10.5f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 10.5f, 19.0f, 10.276f, 19.0f, 10.0f)
                curveTo(19.0f, 9.724f, 18.776f, 9.5f, 18.5f, 9.5f)
                horizontalLineTo(14.707f)
                lineTo(16.354f, 7.854f)
                close()
                moveTo(3.646f, 7.854f)
                curveTo(3.451f, 7.658f, 3.451f, 7.342f, 3.646f, 7.146f)
                curveTo(3.842f, 6.951f, 4.158f, 6.951f, 4.354f, 7.146f)
                lineTo(6.854f, 9.646f)
                curveTo(7.049f, 9.842f, 7.049f, 10.158f, 6.854f, 10.354f)
                lineTo(4.354f, 12.854f)
                curveTo(4.158f, 13.049f, 3.842f, 13.049f, 3.646f, 12.854f)
                curveTo(3.451f, 12.658f, 3.451f, 12.342f, 3.646f, 12.146f)
                lineTo(5.293f, 10.5f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 10.5f, 1.0f, 10.276f, 1.0f, 10.0f)
                curveTo(1.0f, 9.724f, 1.224f, 9.5f, 1.5f, 9.5f)
                horizontalLineTo(5.293f)
                lineTo(3.646f, 7.854f)
                close()
                moveTo(7.854f, 3.646f)
                curveTo(7.658f, 3.451f, 7.342f, 3.451f, 7.146f, 3.646f)
                curveTo(6.951f, 3.842f, 6.951f, 4.158f, 7.146f, 4.354f)
                lineTo(9.646f, 6.854f)
                curveTo(9.842f, 7.049f, 10.158f, 7.049f, 10.354f, 6.854f)
                lineTo(12.854f, 4.354f)
                curveTo(13.049f, 4.158f, 13.049f, 3.842f, 12.854f, 3.646f)
                curveTo(12.658f, 3.451f, 12.342f, 3.451f, 12.146f, 3.646f)
                lineTo(10.5f, 5.293f)
                verticalLineTo(1.5f)
                curveTo(10.5f, 1.224f, 10.276f, 1.0f, 10.0f, 1.0f)
                curveTo(9.724f, 1.0f, 9.5f, 1.224f, 9.5f, 1.5f)
                verticalLineTo(5.293f)
                lineTo(7.854f, 3.646f)
                close()
            }
        }
        .build()
        return _arrowMoveInward!!
    }

@Suppress("ObjectPropertyName")
private var _arrowMoveInward: ImageVector? = null

@Preview
@Composable
private fun ArrowMoveInwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowMoveInward, contentDescription = null)
    }
}

