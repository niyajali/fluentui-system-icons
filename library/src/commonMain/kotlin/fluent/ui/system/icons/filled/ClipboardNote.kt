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
 * ClipboardNote icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: clipboard, note
 * - Source: ic_fluent_clipboard_note_20_filled.svg
 * 
 * @return The [ImageVector] for the ClipboardNote icon.
 */
public val FluentIcons.Filled.ClipboardNote: ImageVector
    get() {
        if (_clipboardNote != null) {
            return _clipboardNote!!
        }
        _clipboardNote = Builder(name = "ClipboardNote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.085f, 3.0f)
                curveTo(7.291f, 2.417f, 7.847f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(11.5f)
                curveTo(12.153f, 2.0f, 12.709f, 2.417f, 12.915f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 3.0f, 16.0f, 3.672f, 16.0f, 4.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                curveTo(10.343f, 10.0f, 9.0f, 11.343f, 9.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.351f, 9.06f, 17.687f, 9.171f, 18.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 18.0f, 4.0f, 17.328f, 4.0f, 16.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.672f, 4.672f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(7.085f)
                close()
                moveTo(8.5f, 3.0f)
                curveTo(8.224f, 3.0f, 8.0f, 3.224f, 8.0f, 3.5f)
                curveTo(8.0f, 3.776f, 8.224f, 4.0f, 8.5f, 4.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 4.0f, 12.0f, 3.776f, 12.0f, 3.5f)
                curveTo(12.0f, 3.224f, 11.776f, 3.0f, 11.5f, 3.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.895f, 11.0f, 10.0f, 11.895f, 10.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(10.0f, 18.105f, 10.895f, 19.0f, 12.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 19.0f, 19.0f, 18.105f, 19.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 11.895f, 18.105f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(12.0f, 16.224f, 12.224f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 16.0f, 17.0f, 16.224f, 17.0f, 16.5f)
                curveTo(17.0f, 16.776f, 16.776f, 17.0f, 16.5f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 17.0f, 12.0f, 16.776f, 12.0f, 16.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(12.0f, 13.224f, 12.224f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                curveTo(17.0f, 13.776f, 16.776f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 14.0f, 12.0f, 13.776f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _clipboardNote!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardNote: ImageVector? = null

@Preview
@Composable
private fun ClipboardNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardNote, contentDescription = null)
    }
}

