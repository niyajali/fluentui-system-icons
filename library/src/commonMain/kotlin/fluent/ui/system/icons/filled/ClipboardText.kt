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
 * ClipboardText icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 32dp
 * - Keywords: clipboard, text
 * - Source: ic_fluent_clipboard_text_32_filled.svg
 * 
 * @return The [ImageVector] for the ClipboardText icon.
 */
public val FluentIcons.Filled.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) {
            return _clipboardText!!
        }
        _clipboardText = Builder(name = "ClipboardText", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.829f, 4.0f)
                horizontalLineTo(23.5f)
                curveTo(25.433f, 4.0f, 27.0f, 5.567f, 27.0f, 7.5f)
                verticalLineTo(26.5f)
                curveTo(27.0f, 28.433f, 25.433f, 30.0f, 23.5f, 30.0f)
                horizontalLineTo(8.5f)
                curveTo(6.567f, 30.0f, 5.0f, 28.433f, 5.0f, 26.5f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 5.567f, 6.567f, 4.0f, 8.5f, 4.0f)
                horizontalLineTo(10.171f)
                curveTo(10.583f, 2.835f, 11.694f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.306f, 2.0f, 21.417f, 2.835f, 21.829f, 4.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(12.448f, 4.0f, 12.0f, 4.448f, 12.0f, 5.0f)
                curveTo(12.0f, 5.552f, 12.448f, 6.0f, 13.0f, 6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 6.0f, 20.0f, 5.552f, 20.0f, 5.0f)
                curveTo(20.0f, 4.448f, 19.552f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(10.448f, 12.0f, 10.0f, 12.448f, 10.0f, 13.0f)
                curveTo(10.0f, 13.552f, 10.448f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 14.0f, 22.0f, 13.552f, 22.0f, 13.0f)
                curveTo(22.0f, 12.448f, 21.552f, 12.0f, 21.0f, 12.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(10.0f, 18.0f)
                curveTo(10.0f, 18.552f, 10.448f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 19.0f, 17.0f, 18.552f, 17.0f, 18.0f)
                curveTo(17.0f, 17.448f, 16.552f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(10.448f, 17.0f, 10.0f, 17.448f, 10.0f, 18.0f)
                close()
                moveTo(11.0f, 22.0f)
                curveTo(10.448f, 22.0f, 10.0f, 22.448f, 10.0f, 23.0f)
                curveTo(10.0f, 23.552f, 10.448f, 24.0f, 11.0f, 24.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 24.0f, 20.0f, 23.552f, 20.0f, 23.0f)
                curveTo(20.0f, 22.448f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _clipboardText!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardText: ImageVector? = null

@Preview
@Composable
private fun ClipboardTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardText, contentDescription = null)
    }
}

