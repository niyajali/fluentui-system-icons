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
 * Button icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: button
 * - Source: ic_fluent_button_20_regular.svg
 * 
 * @return The [ImageVector] for the Button icon.
 */
public val FluentIcons.Regular.Button: ImageVector
    get() {
        if (_button != null) {
            return _button!!
        }
        _button = Builder(name = "Button", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 6.343f, 3.343f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(16.657f, 5.0f, 18.0f, 6.343f, 18.0f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 12.657f, 16.657f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 14.0f, 2.0f, 12.657f, 2.0f, 11.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveTo(3.895f, 6.0f, 3.0f, 6.895f, 3.0f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 12.105f, 3.895f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 13.0f, 17.0f, 12.105f, 17.0f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 6.895f, 16.105f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(9.0f, 9.5f)
                curveTo(9.0f, 9.224f, 9.224f, 9.0f, 9.5f, 9.0f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 9.0f, 14.5f, 9.224f, 14.5f, 9.5f)
                curveTo(14.5f, 9.776f, 14.276f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 10.0f, 9.0f, 9.776f, 9.0f, 9.5f)
                close()
                moveTo(8.0f, 9.5f)
                curveTo(8.0f, 10.328f, 7.328f, 11.0f, 6.5f, 11.0f)
                curveTo(5.672f, 11.0f, 5.0f, 10.328f, 5.0f, 9.5f)
                curveTo(5.0f, 8.672f, 5.672f, 8.0f, 6.5f, 8.0f)
                curveTo(7.328f, 8.0f, 8.0f, 8.672f, 8.0f, 9.5f)
                close()
            }
        }
        .build()
        return _button!!
    }

@Suppress("ObjectPropertyName")
private var _button: ImageVector? = null

@Preview
@Composable
private fun ButtonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Button, contentDescription = null)
    }
}

