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
 * WindowColumnOneFourthLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: window, column, one, fourth, left
 * - Source: ic_fluent_window_column_one_fourth_left_20_filled.svg
 * 
 * @return The [ImageVector] for the WindowColumnOneFourthLeft icon.
 */
public val FluentIcons.Filled.WindowColumnOneFourthLeft: ImageVector
    get() {
        if (_windowColumnOneFourthLeft != null) {
            return _windowColumnOneFourthLeft!!
        }
        _windowColumnOneFourthLeft = Builder(name = "WindowColumnOneFourthLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 3.0f)
                curveTo(4.119f, 3.0f, 3.0f, 4.119f, 3.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 17.0f, 17.0f, 15.881f, 17.0f, 14.5f)
                verticalLineTo(7.0f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.881f, 4.119f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _windowColumnOneFourthLeft!!
    }

@Suppress("ObjectPropertyName")
private var _windowColumnOneFourthLeft: ImageVector? = null

@Preview
@Composable
private fun WindowColumnOneFourthLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowColumnOneFourthLeft, contentDescription = null)
    }
}

