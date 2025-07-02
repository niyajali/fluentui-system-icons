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
 * DismissSquareMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: dismiss, square, multiple
 * - Source: ic_fluent_dismiss_square_multiple_20_filled.svg
 * 
 * @return The [ImageVector] for the DismissSquareMultiple icon.
 */
public val FluentIcons.Filled.DismissSquareMultiple: ImageVector
    get() {
        if (_dismissSquareMultiple != null) {
            return _dismissSquareMultiple!!
        }
        _dismissSquareMultiple = Builder(name = "DismissSquareMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 3.0f, 15.0f, 4.119f, 15.0f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 13.881f, 13.881f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 15.0f, 3.0f, 13.881f, 3.0f, 12.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(6.146f, 6.146f)
                curveTo(5.951f, 6.342f, 5.951f, 6.658f, 6.146f, 6.854f)
                lineTo(8.293f, 9.0f)
                lineTo(6.146f, 11.146f)
                curveTo(5.951f, 11.342f, 5.951f, 11.658f, 6.146f, 11.854f)
                curveTo(6.342f, 12.049f, 6.658f, 12.049f, 6.854f, 11.854f)
                lineTo(9.0f, 9.707f)
                lineTo(11.146f, 11.854f)
                curveTo(11.342f, 12.049f, 11.658f, 12.049f, 11.854f, 11.854f)
                curveTo(12.049f, 11.658f, 12.049f, 11.342f, 11.854f, 11.146f)
                lineTo(9.707f, 9.0f)
                lineTo(11.854f, 6.854f)
                curveTo(12.049f, 6.658f, 12.049f, 6.342f, 11.854f, 6.146f)
                curveTo(11.658f, 5.951f, 11.342f, 5.951f, 11.146f, 6.146f)
                lineTo(9.0f, 8.293f)
                lineTo(6.854f, 6.146f)
                curveTo(6.658f, 5.951f, 6.342f, 5.951f, 6.146f, 6.146f)
                close()
                moveTo(5.5f, 16.0f)
                curveTo(5.956f, 16.607f, 6.682f, 17.0f, 7.5f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(14.986f, 17.0f, 17.0f, 14.986f, 17.0f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 6.682f, 16.607f, 5.956f, 16.0f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(16.0f, 14.433f, 14.433f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _dismissSquareMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _dismissSquareMultiple: ImageVector? = null

@Preview
@Composable
private fun DismissSquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DismissSquareMultiple, contentDescription = null)
    }
}

