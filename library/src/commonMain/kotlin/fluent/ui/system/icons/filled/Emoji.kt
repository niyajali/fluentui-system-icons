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

public val FluentUi.Filled.Emoji: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Emoji",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 1.998f)
            curveTo(17.524f, 1.998f, 22.001f, 6.476f, 22.001f, 12f)
            curveTo(22.001f, 17.523f, 17.524f, 22.001f, 12f, 22.001f)
            curveTo(6.476f, 22.001f, 1.998f, 17.523f, 1.998f, 12f)
            curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveTo(8.462f, 14.783f)
            curveTo(8.205f, 14.458f, 7.734f, 14.402f, 7.408f, 14.658f)
            curveTo(7.083f, 14.914f, 7.027f, 15.386f, 7.283f, 15.711f)
            curveTo(8.414f, 17.146f, 10.137f, 18.001f, 12f, 18.001f)
            curveTo(13.86f, 18.001f, 15.581f, 17.149f, 16.712f, 15.717f)
            curveTo(16.969f, 15.392f, 16.913f, 14.92f, 16.588f, 14.663f)
            curveTo(16.263f, 14.407f, 15.792f, 14.462f, 15.535f, 14.787f)
            curveTo(14.686f, 15.862f, 13.396f, 16.501f, 12f, 16.501f)
            curveTo(10.602f, 16.501f, 9.311f, 15.861f, 8.462f, 14.783f)
            close()
            moveTo(9f, 8.75f)
            curveTo(8.31f, 8.75f, 7.751f, 9.31f, 7.751f, 10f)
            curveTo(7.751f, 10.689f, 8.31f, 11.249f, 9f, 11.249f)
            curveTo(9.69f, 11.249f, 10.25f, 10.689f, 10.25f, 10f)
            curveTo(10.25f, 9.31f, 9.69f, 8.75f, 9f, 8.75f)
            close()
            moveTo(15f, 8.75f)
            curveTo(14.31f, 8.75f, 13.751f, 9.31f, 13.751f, 10f)
            curveTo(13.751f, 10.689f, 14.31f, 11.249f, 15f, 11.249f)
            curveTo(15.69f, 11.249f, 16.25f, 10.689f, 16.25f, 10f)
            curveTo(16.25f, 9.31f, 15.69f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Emoji, contentDescription = null)
    }
}
