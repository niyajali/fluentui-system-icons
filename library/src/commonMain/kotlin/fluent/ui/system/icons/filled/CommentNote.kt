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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.CommentNote: ImageVector
    get() {
        if (_CommentNote != null) {
            return _CommentNote!!
        }
        _CommentNote = ImageVector.Builder(
            name = "Filled.CommentNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3f)
                curveTo(12f, 1.895f, 12.895f, 1f, 14f, 1f)
                horizontalLineTo(21f)
                curveTo(22.105f, 1f, 23f, 1.895f, 23f, 3f)
                verticalLineTo(9f)
                curveTo(23f, 10.105f, 22.105f, 11f, 21f, 11f)
                horizontalLineTo(14f)
                curveTo(12.895f, 11f, 12f, 10.105f, 12f, 9f)
                verticalLineTo(3f)
                close()
                moveTo(14.5f, 4f)
                curveTo(14.224f, 4f, 14f, 4.224f, 14f, 4.5f)
                curveTo(14f, 4.776f, 14.224f, 5f, 14.5f, 5f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 5f, 21f, 4.776f, 21f, 4.5f)
                curveTo(21f, 4.224f, 20.776f, 4f, 20.5f, 4f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 7f)
                curveTo(14.224f, 7f, 14f, 7.224f, 14f, 7.5f)
                curveTo(14f, 7.776f, 14.224f, 8f, 14.5f, 8f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 8f, 21f, 7.776f, 21f, 7.5f)
                curveTo(21f, 7.224f, 20.776f, 7f, 20.5f, 7f)
                horizontalLineTo(14.5f)
                close()
                moveTo(5.25f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                curveTo(11f, 10.657f, 12.343f, 12f, 14f, 12f)
                horizontalLineTo(21f)
                curveTo(21.351f, 12f, 21.687f, 11.94f, 22f, 11.829f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
                horizontalLineTo(12.965f)
                lineTo(7.578f, 21.817f)
                curveTo(7.128f, 22.137f, 6.503f, 22.03f, 6.184f, 21.58f)
                curveTo(6.064f, 21.41f, 6f, 21.208f, 6f, 21.002f)
                lineTo(5.999f, 18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                close()
            }
        }.build()

        return _CommentNote!!
    }

@Suppress("ObjectPropertyName")
private var _CommentNote: ImageVector? = null

@Preview
@Composable
private fun CommentNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentNote, contentDescription = null)
    }
}
