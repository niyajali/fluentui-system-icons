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

public val FluentUi.Filled.SubtractParentheses: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SubtractParentheses",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.667f, 6.037f)
            curveTo(7.078f, 5.668f, 7.113f, 5.036f, 6.745f, 4.625f)
            curveTo(6.377f, 4.213f, 5.745f, 4.178f, 5.333f, 4.546f)
            curveTo(3.289f, 6.376f, 2f, 9.038f, 2f, 12f)
            curveTo(2f, 15.142f, 3.45f, 17.945f, 5.714f, 19.777f)
            curveTo(6.143f, 20.125f, 6.773f, 20.058f, 7.12f, 19.629f)
            curveTo(7.467f, 19.199f, 7.401f, 18.57f, 6.972f, 18.222f)
            curveTo(5.157f, 16.754f, 4f, 14.512f, 4f, 12f)
            curveTo(4f, 9.631f, 5.029f, 7.503f, 6.667f, 6.037f)
            close()
            moveTo(18.667f, 4.546f)
            curveTo(18.255f, 4.178f, 17.623f, 4.213f, 17.255f, 4.625f)
            curveTo(16.886f, 5.036f, 16.922f, 5.668f, 17.333f, 6.037f)
            curveTo(18.971f, 7.503f, 20f, 9.631f, 20f, 12f)
            curveTo(20f, 14.369f, 18.971f, 16.497f, 17.333f, 17.963f)
            curveTo(16.922f, 18.331f, 16.886f, 18.963f, 17.255f, 19.375f)
            curveTo(17.623f, 19.787f, 18.255f, 19.822f, 18.667f, 19.453f)
            curveTo(20.711f, 17.624f, 22f, 14.962f, 22f, 12f)
            curveTo(22f, 9.038f, 20.711f, 6.376f, 18.667f, 4.546f)
            close()
            moveTo(7f, 12f)
            curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
            horizontalLineTo(16f)
            curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
            curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
            horizontalLineTo(8f)
            curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SubtractParenthesesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SubtractParentheses, contentDescription = null)
    }
}
