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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.EmojiSadSlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiSadSlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            moveTo(15.75f, 14.001f)
            horizontalLineTo(16.35f)
            curveTo(16.764f, 14.001f, 17.1f, 14.337f, 17.1f, 14.751f)
            curveTo(17.1f, 15.165f, 16.764f, 15.501f, 16.35f, 15.501f)
            horizontalLineTo(15.75f)
            curveTo(15.132f, 15.501f, 14.413f, 15.662f, 13.752f, 15.919f)
            curveTo(13.083f, 16.179f, 12.555f, 16.507f, 12.28f, 16.781f)
            curveTo(11.987f, 17.074f, 11.513f, 17.074f, 11.22f, 16.781f)
            curveTo(10.927f, 16.488f, 10.927f, 16.014f, 11.22f, 15.721f)
            curveTo(11.695f, 15.245f, 12.432f, 14.823f, 13.208f, 14.521f)
            curveTo(13.993f, 14.215f, 14.899f, 14.001f, 15.75f, 14.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiSadSlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EmojiSadSlight, contentDescription = null)
    }
}
