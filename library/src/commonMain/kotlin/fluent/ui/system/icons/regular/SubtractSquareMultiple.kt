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
 * SubtractSquareMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: subtract, square, multiple
 * - Source: ic_fluent_subtract_square_multiple_20_regular.svg
 * 
 * @return The [ImageVector] for the SubtractSquareMultiple icon.
 */
public val FluentIcons.Regular.SubtractSquareMultiple: ImageVector
    get() {
        if (_subtractSquareMultiple != null) {
            return _subtractSquareMultiple!!
        }
        _subtractSquareMultiple = Builder(name = "SubtractSquareMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 5.268f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 14.657f, 14.657f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(5.268f)
                curveTo(5.613f, 16.598f, 6.26f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(15.209f, 17.0f, 17.0f, 15.209f, 17.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.26f, 16.598f, 5.613f, 16.0f, 5.268f)
                close()
                moveTo(11.5f, 9.5f)
                curveTo(11.776f, 9.5f, 12.0f, 9.276f, 12.0f, 9.0f)
                curveTo(12.0f, 8.724f, 11.776f, 8.5f, 11.5f, 8.5f)
                lineTo(6.5f, 8.5f)
                curveTo(6.224f, 8.5f, 6.0f, 8.724f, 6.0f, 9.0f)
                curveTo(6.0f, 9.276f, 6.224f, 9.5f, 6.5f, 9.5f)
                lineTo(11.5f, 9.5f)
                close()
                moveTo(13.0f, 3.0f)
                curveTo(14.105f, 3.0f, 15.0f, 3.895f, 15.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.105f, 14.105f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 15.0f, 3.0f, 14.105f, 3.0f, 13.0f)
                lineTo(3.0f, 5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(14.0f, 5.0f)
                curveTo(14.0f, 4.448f, 13.552f, 4.0f, 13.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveTo(4.448f, 4.0f, 4.0f, 4.448f, 4.0f, 5.0f)
                lineTo(4.0f, 13.0f)
                curveTo(4.0f, 13.552f, 4.448f, 14.0f, 5.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 14.0f, 14.0f, 13.552f, 14.0f, 13.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _subtractSquareMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _subtractSquareMultiple: ImageVector? = null

@Preview
@Composable
private fun SubtractSquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SubtractSquareMultiple, contentDescription = null)
    }
}

