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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.EmojiMeh: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiMeh",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(10.25f, 10f)
            curveTo(10.25f, 10.69f, 9.69f, 11.25f, 9.001f, 11.25f)
            curveTo(8.311f, 11.25f, 7.751f, 10.69f, 7.751f, 10f)
            curveTo(7.751f, 9.31f, 8.311f, 8.751f, 9.001f, 8.751f)
            curveTo(9.69f, 8.751f, 10.25f, 9.31f, 10.25f, 10f)
            close()
            moveTo(16.25f, 10f)
            curveTo(16.25f, 10.69f, 15.691f, 11.25f, 15f, 11.25f)
            curveTo(14.311f, 11.25f, 13.751f, 10.69f, 13.751f, 10f)
            curveTo(13.751f, 9.31f, 14.311f, 8.751f, 15f, 8.751f)
            curveTo(15.691f, 8.751f, 16.25f, 9.31f, 16.25f, 10f)
            close()
            moveTo(7.5f, 15.75f)
            curveTo(7.5f, 15.336f, 7.836f, 15f, 8.25f, 15f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 15f, 16.5f, 15.336f, 16.5f, 15.75f)
            curveTo(16.5f, 16.164f, 16.164f, 16.5f, 15.75f, 16.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 16.5f, 7.5f, 16.164f, 7.5f, 15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiMehPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EmojiMeh, contentDescription = null)
    }
}
