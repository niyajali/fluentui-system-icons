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

public val FluentUi.Regular.EmojiSadSlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiSadSlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 10f)
            curveTo(10.25f, 9.31f, 9.691f, 8.75f, 9.001f, 8.75f)
            curveTo(8.311f, 8.75f, 7.751f, 9.31f, 7.751f, 10f)
            curveTo(7.751f, 10.689f, 8.311f, 11.249f, 9.001f, 11.249f)
            curveTo(9.691f, 11.249f, 10.25f, 10.689f, 10.25f, 10f)
            close()
            moveTo(16.25f, 10f)
            curveTo(16.25f, 9.31f, 15.691f, 8.75f, 15f, 8.75f)
            curveTo(14.311f, 8.75f, 13.751f, 9.31f, 13.751f, 10f)
            curveTo(13.751f, 10.689f, 14.311f, 11.249f, 15f, 11.249f)
            curveTo(15.691f, 11.249f, 16.25f, 10.689f, 16.25f, 10f)
            close()
            moveTo(15.75f, 13.999f)
            curveTo(14.9f, 13.999f, 13.993f, 14.213f, 13.208f, 14.519f)
            curveTo(12.432f, 14.821f, 11.695f, 15.243f, 11.22f, 15.719f)
            curveTo(10.927f, 16.012f, 10.927f, 16.486f, 11.22f, 16.779f)
            curveTo(11.513f, 17.072f, 11.988f, 17.072f, 12.28f, 16.779f)
            curveTo(12.555f, 16.505f, 13.083f, 16.177f, 13.753f, 15.917f)
            curveTo(14.413f, 15.66f, 15.132f, 15.499f, 15.75f, 15.499f)
            horizontalLineTo(16.35f)
            curveTo(16.764f, 15.499f, 17.1f, 15.163f, 17.1f, 14.749f)
            curveTo(17.1f, 14.335f, 16.764f, 13.999f, 16.35f, 13.999f)
            horizontalLineTo(15.75f)
            close()
            moveTo(22.002f, 12f)
            curveTo(22.002f, 6.476f, 17.524f, 1.998f, 12f, 1.998f)
            curveTo(6.476f, 1.998f, 1.999f, 6.476f, 1.999f, 12f)
            curveTo(1.999f, 17.523f, 6.476f, 22.001f, 12f, 22.001f)
            curveTo(17.524f, 22.001f, 22.002f, 17.523f, 22.002f, 12f)
            close()
            moveTo(3.499f, 12f)
            curveTo(3.499f, 7.304f, 7.305f, 3.498f, 12f, 3.498f)
            curveTo(16.695f, 3.498f, 20.502f, 7.304f, 20.502f, 12f)
            curveTo(20.502f, 16.695f, 16.695f, 20.501f, 12f, 20.501f)
            curveTo(7.305f, 20.501f, 3.499f, 16.695f, 3.499f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiSadSlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EmojiSadSlight, contentDescription = null)
    }
}
