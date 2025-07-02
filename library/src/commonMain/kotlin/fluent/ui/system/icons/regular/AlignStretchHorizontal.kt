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
 * AlignStretchHorizontal icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: align, stretch, horizontal
 * - Source: ic_fluent_align_stretch_horizontal_20_regular.svg
 * 
 * @return The [ImageVector] for the AlignStretchHorizontal icon.
 */
public val FluentIcons.Regular.AlignStretchHorizontal: ImageVector
    get() {
        if (_alignStretchHorizontal != null) {
            return _alignStretchHorizontal!!
        }
        _alignStretchHorizontal = Builder(name = "AlignStretchHorizontal", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.5f)
                curveTo(3.0f, 17.776f, 3.224f, 18.0f, 3.5f, 18.0f)
                curveTo(3.776f, 18.0f, 4.0f, 17.776f, 4.0f, 17.5f)
                verticalLineTo(2.5f)
                curveTo(4.0f, 2.224f, 3.776f, 2.0f, 3.5f, 2.0f)
                curveTo(3.224f, 2.0f, 3.0f, 2.224f, 3.0f, 2.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.5f)
                curveTo(16.0f, 17.776f, 16.224f, 18.0f, 16.5f, 18.0f)
                curveTo(16.776f, 18.0f, 17.0f, 17.776f, 17.0f, 17.5f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.224f, 16.776f, 2.0f, 16.5f, 2.0f)
                curveTo(16.224f, 2.0f, 16.0f, 2.224f, 16.0f, 2.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                curveTo(14.105f, 16.0f, 15.0f, 15.105f, 15.0f, 14.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 11.895f, 14.105f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 11.0f, 5.0f, 11.895f, 5.0f, 13.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 15.105f, 5.895f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(14.0f, 14.0f)
                curveTo(14.0f, 14.552f, 13.552f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 15.0f, 6.0f, 14.552f, 6.0f, 14.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 12.448f, 6.448f, 12.0f, 7.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 12.0f, 14.0f, 12.448f, 14.0f, 13.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                curveTo(15.0f, 8.105f, 14.105f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 9.0f, 5.0f, 8.105f, 5.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 4.895f, 5.895f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(14.105f, 4.0f, 15.0f, 4.895f, 15.0f, 6.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.552f, 8.0f, 14.0f, 7.552f, 14.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(14.0f, 5.448f, 13.552f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 5.0f, 6.0f, 5.448f, 6.0f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 7.552f, 6.448f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _alignStretchHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _alignStretchHorizontal: ImageVector? = null

@Preview
@Composable
private fun AlignStretchHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignStretchHorizontal, contentDescription = null)
    }
}

