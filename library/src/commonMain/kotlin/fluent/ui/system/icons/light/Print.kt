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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.Print: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Print",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(6.5f)
            curveTo(8f, 4.567f, 9.567f, 3f, 11.5f, 3f)
            horizontalLineTo(20.5f)
            curveTo(22.433f, 3f, 24f, 4.567f, 24f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(25f)
            curveTo(27.761f, 8f, 30f, 10.239f, 30f, 13f)
            verticalLineTo(20.5f)
            curveTo(30f, 22.433f, 28.433f, 24f, 26.5f, 24f)
            horizontalLineTo(25f)
            verticalLineTo(25.5f)
            curveTo(25f, 27.433f, 23.433f, 29f, 21.5f, 29f)
            horizontalLineTo(10.5f)
            curveTo(8.567f, 29f, 7f, 27.433f, 7f, 25.5f)
            verticalLineTo(24f)
            horizontalLineTo(5.5f)
            curveTo(3.567f, 24f, 2f, 22.433f, 2f, 20.5f)
            verticalLineTo(13f)
            curveTo(2f, 10.239f, 4.239f, 8f, 7f, 8f)
            close()
            moveTo(11.5f, 4f)
            curveTo(10.119f, 4f, 9f, 5.119f, 9f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(23f)
            verticalLineTo(6.5f)
            curveTo(23f, 5.119f, 21.881f, 4f, 20.5f, 4f)
            horizontalLineTo(11.5f)
            close()
            moveTo(8f, 25.5f)
            curveTo(8f, 26.881f, 9.119f, 28f, 10.5f, 28f)
            horizontalLineTo(21.5f)
            curveTo(22.881f, 28f, 24f, 26.881f, 24f, 25.5f)
            verticalLineTo(19.5f)
            curveTo(24f, 18.119f, 22.881f, 17f, 21.5f, 17f)
            horizontalLineTo(10.5f)
            curveTo(9.119f, 17f, 8f, 18.119f, 8f, 19.5f)
            verticalLineTo(25.5f)
            close()
            moveTo(25f, 23f)
            horizontalLineTo(26.5f)
            curveTo(27.881f, 23f, 29f, 21.881f, 29f, 20.5f)
            verticalLineTo(13f)
            curveTo(29f, 10.791f, 27.209f, 9f, 25f, 9f)
            horizontalLineTo(7f)
            curveTo(4.791f, 9f, 3f, 10.791f, 3f, 13f)
            verticalLineTo(20.5f)
            curveTo(3f, 21.881f, 4.119f, 23f, 5.5f, 23f)
            horizontalLineTo(7f)
            verticalLineTo(19.5f)
            curveTo(7f, 17.567f, 8.567f, 16f, 10.5f, 16f)
            horizontalLineTo(21.5f)
            curveTo(23.433f, 16f, 25f, 17.567f, 25f, 19.5f)
            verticalLineTo(23f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PrintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Print, contentDescription = null)
    }
}
