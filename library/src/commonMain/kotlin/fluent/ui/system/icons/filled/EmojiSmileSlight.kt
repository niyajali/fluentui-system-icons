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

public val FluentUi.Filled.EmojiSmileSlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiSmileSlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.002f, 12.002f)
            curveTo(22.002f, 6.478f, 17.524f, 2f, 12f, 2f)
            curveTo(6.476f, 2f, 1.999f, 6.478f, 1.999f, 12.002f)
            curveTo(1.999f, 17.525f, 6.476f, 22.003f, 12f, 22.003f)
            curveTo(17.524f, 22.003f, 22.002f, 17.525f, 22.002f, 12.002f)
            close()
            moveTo(7.751f, 10.002f)
            curveTo(7.751f, 9.312f, 8.311f, 8.752f, 9.001f, 8.752f)
            curveTo(9.691f, 8.752f, 10.25f, 9.312f, 10.25f, 10.002f)
            curveTo(10.25f, 10.691f, 9.691f, 11.251f, 9.001f, 11.251f)
            curveTo(8.311f, 11.251f, 7.751f, 10.691f, 7.751f, 10.002f)
            close()
            moveTo(13.751f, 10.002f)
            curveTo(13.751f, 9.312f, 14.311f, 8.752f, 15f, 8.752f)
            curveTo(15.691f, 8.752f, 16.25f, 9.312f, 16.25f, 10.002f)
            curveTo(16.25f, 10.691f, 15.691f, 11.251f, 15f, 11.251f)
            curveTo(14.311f, 11.251f, 13.751f, 10.691f, 13.751f, 10.002f)
            close()
            moveTo(10.136f, 15.108f)
            curveTo(10.619f, 15.398f, 11.291f, 15.564f, 12f, 15.564f)
            curveTo(12.709f, 15.564f, 13.381f, 15.398f, 13.864f, 15.108f)
            curveTo(14.219f, 14.895f, 14.68f, 15.01f, 14.893f, 15.365f)
            curveTo(15.106f, 15.72f, 14.991f, 16.181f, 14.636f, 16.394f)
            curveTo(13.869f, 16.854f, 12.916f, 17.063f, 12f, 17.063f)
            curveTo(11.084f, 17.063f, 10.131f, 16.854f, 9.364f, 16.394f)
            curveTo(9.009f, 16.181f, 8.894f, 15.72f, 9.107f, 15.365f)
            curveTo(9.32f, 15.01f, 9.781f, 14.895f, 10.136f, 15.108f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiSmileSlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EmojiSmileSlight, contentDescription = null)
    }
}
