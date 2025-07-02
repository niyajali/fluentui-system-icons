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
 * AlignStartVertical icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: align, start, vertical
 * - Source: ic_fluent_align_start_vertical_20_regular.svg
 * 
 * @return The [ImageVector] for the AlignStartVertical icon.
 */
public val FluentIcons.Regular.AlignStartVertical: ImageVector
    get() {
        if (_alignStartVertical != null) {
            return _alignStartVertical!!
        }
        _alignStartVertical = Builder(name = "AlignStartVertical", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.5f)
                curveTo(2.0f, 3.224f, 2.224f, 3.0f, 2.5f, 3.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 3.0f, 18.0f, 3.224f, 18.0f, 3.5f)
                curveTo(18.0f, 3.776f, 17.776f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 4.0f, 2.0f, 3.776f, 2.0f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(4.895f, 6.0f, 4.0f, 6.895f, 4.0f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 11.105f, 4.895f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 12.0f, 16.0f, 11.105f, 16.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.895f, 15.105f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 7.448f, 5.448f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 7.0f, 15.0f, 7.448f, 15.0f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 10.552f, 14.552f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 11.0f, 5.0f, 10.552f, 5.0f, 10.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _alignStartVertical!!
    }

@Suppress("ObjectPropertyName")
private var _alignStartVertical: ImageVector? = null

@Preview
@Composable
private fun AlignStartVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignStartVertical, contentDescription = null)
    }
}

