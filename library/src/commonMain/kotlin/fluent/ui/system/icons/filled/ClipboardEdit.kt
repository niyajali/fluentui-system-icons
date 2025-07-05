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
 * ClipboardEdit Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in copy & task scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_clipboard_edit_20_filled.svg)
 * 
 * @return The [ImageVector] for the ClipboardEdit icon.
 */
public val FluentIcons.Filled.ClipboardEdit: ImageVector
    get() {
        if (_clipboardEdit != null) {
            return _clipboardEdit!!
        }
        _clipboardEdit = Builder(name = "ClipboardEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(7.847f, 2.0f, 7.291f, 2.417f, 7.085f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 3.0f, 4.0f, 3.672f, 4.0f, 4.5f)
                verticalLineTo(16.5f)
                curveTo(4.0f, 17.328f, 4.672f, 18.0f, 5.5f, 18.0f)
                horizontalLineTo(8.004f)
                curveTo(8.011f, 17.886f, 8.029f, 17.77f, 8.058f, 17.653f)
                lineTo(8.433f, 16.155f)
                curveTo(8.573f, 15.593f, 8.864f, 15.08f, 9.274f, 14.67f)
                lineTo(14.103f, 9.841f)
                curveTo(14.63f, 9.314f, 15.31f, 9.035f, 16.0f, 9.003f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 3.672f, 15.328f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(12.915f)
                curveTo(12.709f, 2.417f, 12.153f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(8.0f, 3.5f)
                curveTo(8.0f, 3.224f, 8.224f, 3.0f, 8.5f, 3.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 3.0f, 12.0f, 3.224f, 12.0f, 3.5f)
                curveTo(12.0f, 3.776f, 11.776f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 4.0f, 8.0f, 3.776f, 8.0f, 3.5f)
                close()
                moveTo(9.98f, 15.377f)
                lineTo(14.809f, 10.548f)
                curveTo(15.54f, 9.817f, 16.724f, 9.817f, 17.454f, 10.548f)
                curveTo(18.184f, 11.278f, 18.184f, 12.462f, 17.454f, 13.193f)
                lineTo(12.625f, 18.022f)
                curveTo(12.343f, 18.304f, 11.99f, 18.503f, 11.604f, 18.6f)
                lineTo(10.106f, 18.974f)
                curveTo(9.455f, 19.137f, 8.865f, 18.547f, 9.027f, 17.896f)
                lineTo(9.402f, 16.398f)
                curveTo(9.498f, 16.012f, 9.698f, 15.659f, 9.98f, 15.377f)
                close()
            }
        }
        .build()
        return _clipboardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardEdit: ImageVector? = null

@Preview
@Composable
private fun ClipboardEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardEdit, contentDescription = "ClipboardEdit Icon")
    }
}

