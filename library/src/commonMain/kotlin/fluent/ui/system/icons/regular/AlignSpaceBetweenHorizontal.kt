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
 * AlignSpaceBetweenHorizontal icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: align, space, between, horizontal
 * - Source: ic_fluent_align_space_between_horizontal_20_regular.svg
 * 
 * @return The [ImageVector] for the AlignSpaceBetweenHorizontal icon.
 */
public val FluentIcons.Regular.AlignSpaceBetweenHorizontal: ImageVector
    get() {
        if (_alignSpaceBetweenHorizontal != null) {
            return _alignSpaceBetweenHorizontal!!
        }
        _alignSpaceBetweenHorizontal = Builder(name = "AlignSpaceBetweenHorizontal", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                curveTo(4.895f, 1.0f, 4.0f, 1.895f, 4.0f, 3.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 5.105f, 4.895f, 6.0f, 6.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 6.0f, 16.0f, 5.105f, 16.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(16.0f, 1.895f, 15.105f, 1.0f, 14.0f, 1.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 3.0f)
                curveTo(5.0f, 2.448f, 5.448f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 2.0f, 15.0f, 2.448f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 4.552f, 14.552f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 5.0f, 5.0f, 4.552f, 5.0f, 4.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(6.0f, 14.0f)
                curveTo(4.895f, 14.0f, 4.0f, 14.895f, 4.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.105f, 4.895f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 19.0f, 16.0f, 18.105f, 16.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(16.0f, 14.895f, 15.105f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 16.0f)
                curveTo(5.0f, 15.448f, 5.448f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 15.0f, 15.0f, 15.448f, 15.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 17.552f, 14.552f, 18.0f, 14.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 18.0f, 5.0f, 17.552f, 5.0f, 17.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _alignSpaceBetweenHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _alignSpaceBetweenHorizontal: ImageVector? = null

@Preview
@Composable
private fun AlignSpaceBetweenHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignSpaceBetweenHorizontal, contentDescription = null)
    }
}

