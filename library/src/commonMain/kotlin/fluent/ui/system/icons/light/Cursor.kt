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

public val FluentUi.Light.Cursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Cursor",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.999f, 3.503f)
            curveTo(5.999f, 2.25f, 7.444f, 1.549f, 8.428f, 2.325f)
            lineTo(27.424f, 17.319f)
            curveTo(28.541f, 18.201f, 27.918f, 19.997f, 26.495f, 19.997f)
            horizontalLineTo(16.302f)
            curveTo(16.149f, 19.997f, 16.004f, 20.068f, 15.909f, 20.188f)
            lineTo(8.677f, 29.421f)
            curveTo(7.798f, 30.544f, 5.996f, 29.922f, 5.996f, 28.496f)
            lineTo(5.999f, 3.503f)
            close()
            moveTo(7.808f, 3.11f)
            curveTo(7.48f, 2.852f, 6.999f, 3.085f, 6.999f, 3.503f)
            lineTo(6.996f, 28.496f)
            curveTo(6.996f, 28.971f, 7.597f, 29.179f, 7.89f, 28.805f)
            lineTo(15.122f, 19.572f)
            curveTo(15.406f, 19.209f, 15.841f, 18.997f, 16.302f, 18.997f)
            horizontalLineTo(26.495f)
            curveTo(26.969f, 18.997f, 27.177f, 18.398f, 26.805f, 18.104f)
            lineTo(7.808f, 3.11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Cursor, contentDescription = null)
    }
}
