/**
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CommentNote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentNote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            verticalLineTo(4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
            horizontalLineTo(7.499f)
            lineTo(7.5f, 20.251f)
            lineTo(12.514f, 16.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
            verticalLineTo(12f)
            horizontalLineTo(21f)
            curveTo(21.351f, 12f, 21.687f, 11.94f, 22f, 11.829f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13.012f)
            lineTo(7.999f, 21.751f)
            curveTo(7.446f, 22.164f, 6.662f, 22.051f, 6.249f, 21.498f)
            curveTo(6.087f, 21.282f, 6f, 21.02f, 6f, 20.75f)
            lineTo(5.999f, 18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommentNote, contentDescription = null)
    }
}
