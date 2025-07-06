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
 * SquaresNested Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent focusing in on UI experiences.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_squares_nested_20_filled.svg)
 * 
 * @return The [ImageVector] for the SquaresNested icon.
 */
public val FluentIcons.Filled.SquaresNested: ImageVector
    get() {
        if (_squaresNested != null) {
            return _squaresNested!!
        }
        _squaresNested = Builder(name = "SquaresNested", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(7.764f)
                curveTo(16.469f, 7.289f, 15.768f, 7.0f, 15.0f, 7.0f)
                horizontalLineTo(10.0f)
                curveTo(8.343f, 7.0f, 7.0f, 8.343f, 7.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 15.768f, 7.289f, 16.469f, 7.764f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 17.0f, 17.0f, 15.657f, 17.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 8.895f, 16.105f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 8.0f, 8.0f, 8.895f, 8.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(8.0f, 16.105f, 8.895f, 17.0f, 10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _squaresNested!!
    }

@Suppress("ObjectPropertyName")
private var _squaresNested: ImageVector? = null

@Preview
@Composable
private fun SquaresNestedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquaresNested, contentDescription = "SquaresNested Icon")
    }
}

