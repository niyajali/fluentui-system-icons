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

public val FluentUi.Filled.PuzzlePiece: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzlePiece",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 2f)
            curveTo(14.364f, 2f, 15.47f, 3.106f, 15.47f, 4.47f)
            lineTo(15.469f, 5f)
            horizontalLineTo(19f)
            curveTo(19.552f, 5f, 20f, 5.448f, 20f, 6f)
            lineTo(19.999f, 9.499f)
            lineTo(18.47f, 9.5f)
            curveTo(17.16f, 9.5f, 16.089f, 10.519f, 16.005f, 11.807f)
            lineTo(16f, 11.97f)
            verticalLineTo(12.03f)
            curveTo(16f, 13.34f, 17.019f, 14.411f, 18.307f, 14.495f)
            lineTo(18.47f, 14.5f)
            lineTo(19.999f, 14.499f)
            lineTo(20f, 18.003f)
            curveTo(20f, 18.555f, 19.552f, 19.003f, 19f, 19.003f)
            lineTo(15.469f, 19.002f)
            lineTo(15.47f, 19.53f)
            curveTo(15.47f, 20.894f, 14.364f, 22f, 13f, 22f)
            curveTo(11.636f, 22f, 10.53f, 20.894f, 10.53f, 19.53f)
            lineTo(10.53f, 19.002f)
            lineTo(7f, 19.003f)
            curveTo(6.448f, 19.003f, 6f, 18.555f, 6f, 18.003f)
            lineTo(5.999f, 14.471f)
            lineTo(5.47f, 14.471f)
            curveTo(4.106f, 14.471f, 3f, 13.365f, 3f, 12.002f)
            curveTo(3f, 10.637f, 4.106f, 9.532f, 5.47f, 9.532f)
            lineTo(5.999f, 9.531f)
            lineTo(6f, 6f)
            curveTo(6f, 5.448f, 6.448f, 5f, 7f, 5f)
            horizontalLineTo(10.53f)
            lineTo(10.53f, 4.47f)
            curveTo(10.53f, 3.106f, 11.636f, 2f, 13f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PuzzlePiecePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PuzzlePiece, contentDescription = null)
    }
}
