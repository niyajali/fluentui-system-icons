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

public val FluentUi.Filled.EmojiMeme: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiMeme",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.002f, 22.002f)
            curveTo(6.478f, 22.002f, 2f, 17.524f, 2f, 12.001f)
            curveTo(2f, 11.663f, 2.017f, 11.329f, 2.049f, 11f)
            horizontalLineTo(4f)
            verticalLineTo(13f)
            horizontalLineTo(5f)
            verticalLineTo(14f)
            horizontalLineTo(12f)
            verticalLineTo(13f)
            horizontalLineTo(14f)
            verticalLineTo(14f)
            horizontalLineTo(21f)
            verticalLineTo(13f)
            horizontalLineTo(21.954f)
            curveTo(21.452f, 18.055f, 17.188f, 22.002f, 12.002f, 22.002f)
            close()
            moveTo(20.004f, 6f)
            horizontalLineTo(3.999f)
            curveTo(5.824f, 3.571f, 8.729f, 1.999f, 12.002f, 1.999f)
            curveTo(15.274f, 1.999f, 18.179f, 3.571f, 20.004f, 6f)
            close()
            moveTo(7.41f, 15.659f)
            curveTo(7.085f, 15.915f, 7.029f, 16.387f, 7.285f, 16.712f)
            curveTo(8.416f, 18.147f, 10.139f, 19.002f, 12.002f, 19.002f)
            curveTo(13.862f, 19.002f, 15.583f, 18.149f, 16.714f, 16.718f)
            curveTo(16.97f, 16.393f, 16.915f, 15.921f, 16.59f, 15.664f)
            curveTo(16.265f, 15.408f, 15.793f, 15.463f, 15.536f, 15.788f)
            curveTo(14.687f, 16.863f, 13.398f, 17.502f, 12.002f, 17.502f)
            curveTo(10.603f, 17.502f, 9.312f, 16.862f, 8.463f, 15.784f)
            curveTo(8.207f, 15.458f, 7.735f, 15.403f, 7.41f, 15.659f)
            close()
            moveTo(3f, 7f)
            horizontalLineTo(22f)
            verticalLineTo(10f)
            horizontalLineTo(21f)
            verticalLineTo(12f)
            horizontalLineTo(20f)
            verticalLineTo(13f)
            horizontalLineTo(15f)
            verticalLineTo(12f)
            horizontalLineTo(14f)
            verticalLineTo(10f)
            horizontalLineTo(12f)
            verticalLineTo(12f)
            horizontalLineTo(11f)
            verticalLineTo(13f)
            horizontalLineTo(6f)
            verticalLineTo(12f)
            horizontalLineTo(5f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            horizontalLineTo(2f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(7f)
            close()
            moveTo(1f, 10f)
            verticalLineTo(9f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineTo(1f)
            close()
            moveTo(1f, 10f)
            horizontalLineTo(0f)
            verticalLineTo(12f)
            horizontalLineTo(1f)
            verticalLineTo(10f)
            close()
            moveTo(7f, 9f)
            horizontalLineTo(6f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
            verticalLineTo(11f)
            horizontalLineTo(8f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
            verticalLineTo(9f)
            close()
            moveTo(16f, 9f)
            horizontalLineTo(15f)
            verticalLineTo(10f)
            horizontalLineTo(16f)
            verticalLineTo(11f)
            horizontalLineTo(17f)
            verticalLineTo(10f)
            horizontalLineTo(16f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiMemePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EmojiMeme, contentDescription = null)
    }
}
