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
 * WindowEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: window, edit
 * - Source: ic_fluent_window_edit_20_regular.svg
 * 
 * @return The [ImageVector] for the WindowEdit icon.
 */
public val FluentIcons.Regular.WindowEdit: ImageVector
    get() {
        if (_windowEdit != null) {
            return _windowEdit!!
        }
        _windowEdit = Builder(name = "WindowEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.22f)
                lineTo(9.432f, 16.155f)
                curveTo(9.445f, 16.103f, 9.459f, 16.051f, 9.475f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.232f)
                curveTo(16.319f, 9.095f, 16.659f, 9.019f, 17.0f, 9.003f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(10.98f, 15.377f)
                lineTo(15.809f, 10.548f)
                curveTo(16.539f, 9.817f, 17.724f, 9.817f, 18.454f, 10.548f)
                curveTo(19.184f, 11.278f, 19.184f, 12.462f, 18.454f, 13.193f)
                lineTo(13.625f, 18.022f)
                curveTo(13.343f, 18.304f, 12.99f, 18.503f, 12.604f, 18.6f)
                lineTo(11.106f, 18.974f)
                curveTo(10.455f, 19.137f, 9.865f, 18.547f, 10.027f, 17.896f)
                lineTo(10.402f, 16.398f)
                curveTo(10.498f, 16.012f, 10.698f, 15.659f, 10.98f, 15.377f)
                close()
            }
        }
        .build()
        return _windowEdit!!
    }

@Suppress("ObjectPropertyName")
private var _windowEdit: ImageVector? = null

@Preview
@Composable
private fun WindowEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowEdit, contentDescription = null)
    }
}

