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
 * NotepadEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: notepad, edit
 * - Source: ic_fluent_notepad_edit_20_regular.svg
 * 
 * @return The [ImageVector] for the NotepadEdit icon.
 */
public val FluentIcons.Regular.NotepadEdit: ImageVector
    get() {
        if (_notepadEdit != null) {
            return _notepadEdit!!
        }
        _notepadEdit = Builder(name = "NotepadEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 7.5f)
                curveTo(7.0f, 7.224f, 7.224f, 7.0f, 7.5f, 7.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 7.0f, 13.0f, 7.224f, 13.0f, 7.5f)
                curveTo(13.0f, 7.776f, 12.776f, 8.0f, 12.5f, 8.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 8.0f, 7.0f, 7.776f, 7.0f, 7.5f)
                close()
                moveTo(7.5f, 10.0f)
                curveTo(7.224f, 10.0f, 7.0f, 10.224f, 7.0f, 10.5f)
                curveTo(7.0f, 10.776f, 7.224f, 11.0f, 7.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 11.0f, 13.0f, 10.776f, 13.0f, 10.5f)
                curveTo(13.0f, 10.224f, 12.776f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.0f, 13.5f)
                curveTo(7.0f, 13.224f, 7.224f, 13.0f, 7.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 13.0f, 10.0f, 13.224f, 10.0f, 13.5f)
                curveTo(10.0f, 13.776f, 9.776f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 14.0f, 7.0f, 13.776f, 7.0f, 13.5f)
                close()
                moveTo(6.0f, 2.5f)
                curveTo(6.0f, 2.224f, 6.224f, 2.0f, 6.5f, 2.0f)
                curveTo(6.776f, 2.0f, 7.0f, 2.224f, 7.0f, 2.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(2.5f)
                curveTo(9.5f, 2.224f, 9.724f, 2.0f, 10.0f, 2.0f)
                curveTo(10.276f, 2.0f, 10.5f, 2.224f, 10.5f, 2.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 2.224f, 13.224f, 2.0f, 13.5f, 2.0f)
                curveTo(13.776f, 2.0f, 14.0f, 2.224f, 14.0f, 2.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 3.0f, 16.0f, 3.672f, 16.0f, 4.5f)
                verticalLineTo(9.232f)
                curveTo(15.674f, 9.371f, 15.368f, 9.574f, 15.102f, 9.841f)
                lineTo(15.0f, 9.943f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 4.224f, 14.776f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 4.0f, 5.0f, 4.224f, 5.0f, 4.5f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 16.776f, 5.224f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(9.22f)
                lineTo(9.057f, 17.653f)
                curveTo(9.028f, 17.77f, 9.01f, 17.886f, 9.003f, 18.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 18.0f, 4.0f, 17.328f, 4.0f, 16.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.672f, 4.672f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.5f)
                close()
                moveTo(15.809f, 10.548f)
                lineTo(10.98f, 15.377f)
                curveTo(10.698f, 15.659f, 10.498f, 16.012f, 10.402f, 16.398f)
                lineTo(10.027f, 17.896f)
                curveTo(9.865f, 18.547f, 10.455f, 19.137f, 11.106f, 18.974f)
                lineTo(12.604f, 18.6f)
                curveTo(12.99f, 18.503f, 13.343f, 18.304f, 13.625f, 18.022f)
                lineTo(18.454f, 13.193f)
                curveTo(19.184f, 12.462f, 19.184f, 11.278f, 18.454f, 10.548f)
                curveTo(17.724f, 9.817f, 16.539f, 9.817f, 15.809f, 10.548f)
                close()
            }
        }
        .build()
        return _notepadEdit!!
    }

@Suppress("ObjectPropertyName")
private var _notepadEdit: ImageVector? = null

@Preview
@Composable
private fun NotepadEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NotepadEdit, contentDescription = null)
    }
}

