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

public val FluentIcons.Filled.CalendarNote: ImageVector
    get() {
        if (_CalendarNote != null) {
            return _CalendarNote!!
        }
        _CalendarNote = ImageVector.Builder(
            name = "Filled.CalendarNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 8.5f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                curveTo(12.343f, 12f, 11f, 13.343f, 11f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(14f, 13f)
                curveTo(12.895f, 13f, 12f, 13.895f, 12f, 15f)
                verticalLineTo(21f)
                curveTo(12f, 22.105f, 12.895f, 23f, 14f, 23f)
                horizontalLineTo(21f)
                curveTo(22.105f, 23f, 23f, 22.105f, 23f, 21f)
                verticalLineTo(15f)
                curveTo(23f, 13.895f, 22.105f, 13f, 21f, 13f)
                horizontalLineTo(14f)
                close()
                moveTo(14f, 16.5f)
                curveTo(14f, 16.224f, 14.224f, 16f, 14.5f, 16f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 16f, 21f, 16.224f, 21f, 16.5f)
                curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 17f, 14f, 16.776f, 14f, 16.5f)
                close()
                moveTo(14f, 19.5f)
                curveTo(14f, 19.224f, 14.224f, 19f, 14.5f, 19f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 19f, 21f, 19.224f, 21f, 19.5f)
                curveTo(21f, 19.776f, 20.776f, 20f, 20.5f, 20f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 20f, 14f, 19.776f, 14f, 19.5f)
                close()
            }
        }.build()

        return _CalendarNote!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarNote: ImageVector? = null

@Preview
@Composable
private fun CalendarNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarNote, contentDescription = null)
    }
}
