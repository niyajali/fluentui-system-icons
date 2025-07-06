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
 * SquareAdd Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general UI, app tile, content or other general layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_square_add_20_filled.svg)
 * 
 * @return The [ImageVector] for the SquareAdd icon.
 */
public val FluentIcons.Filled.SquareAdd: ImageVector
    get() {
        if (_squareAdd != null) {
            return _squareAdd!!
        }
        _squareAdd = Builder(name = "SquareAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.216f, 16.25f, 9.0f, 15.4f, 9.0f, 14.5f)
                curveTo(9.0f, 11.462f, 11.462f, 9.0f, 14.5f, 9.0f)
                curveTo(15.4f, 9.0f, 16.25f, 9.216f, 17.0f, 9.6f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(14.5f, 12.0f)
                curveTo(14.776f, 12.0f, 15.0f, 12.224f, 15.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 14.0f, 17.0f, 14.224f, 17.0f, 14.5f)
                curveTo(17.0f, 14.776f, 16.776f, 15.0f, 16.5f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                curveTo(15.0f, 16.776f, 14.776f, 17.0f, 14.5f, 17.0f)
                curveTo(14.224f, 17.0f, 14.0f, 16.776f, 14.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15.0f, 12.0f, 14.776f, 12.0f, 14.5f)
                curveTo(12.0f, 14.224f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 12.224f, 14.224f, 12.0f, 14.5f, 12.0f)
                close()
            }
        }
        .build()
        return _squareAdd!!
    }

@Suppress("ObjectPropertyName")
private var _squareAdd: ImageVector? = null

@Preview
@Composable
private fun SquareAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareAdd, contentDescription = "SquareAdd Icon")
    }
}

