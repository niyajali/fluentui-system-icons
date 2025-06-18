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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.EmojiMeh: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiMeh",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.001f, 8.751f)
            curveTo(9.69f, 8.751f, 10.25f, 9.311f, 10.25f, 10f)
            curveTo(10.25f, 10.691f, 9.69f, 11.25f, 9.001f, 11.25f)
            curveTo(8.311f, 11.25f, 7.751f, 10.691f, 7.751f, 10f)
            curveTo(7.751f, 9.311f, 8.311f, 8.751f, 9.001f, 8.751f)
            close()
            moveTo(15f, 8.751f)
            curveTo(15.691f, 8.751f, 16.25f, 9.311f, 16.25f, 10f)
            curveTo(16.25f, 10.691f, 15.691f, 11.25f, 15f, 11.25f)
            curveTo(14.311f, 11.25f, 13.751f, 10.691f, 13.751f, 10f)
            curveTo(13.751f, 9.311f, 14.311f, 8.751f, 15f, 8.751f)
            close()
            moveTo(8.25f, 15f)
            curveTo(7.836f, 15f, 7.5f, 15.336f, 7.5f, 15.75f)
            curveTo(7.5f, 16.164f, 7.836f, 16.5f, 8.25f, 16.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 16.5f, 16.5f, 16.164f, 16.5f, 15.75f)
            curveTo(16.5f, 15.336f, 16.164f, 15f, 15.75f, 15f)
            horizontalLineTo(8.25f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiMehPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EmojiMeh, contentDescription = null)
    }
}
