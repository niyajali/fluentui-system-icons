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

public val FluentUi.Light.ArrowForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowForward",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.146f, 6.854f)
            curveTo(20.951f, 6.658f, 20.951f, 6.342f, 21.146f, 6.146f)
            curveTo(21.342f, 5.951f, 21.658f, 5.951f, 21.854f, 6.146f)
            lineTo(28.854f, 13.146f)
            curveTo(29.049f, 13.342f, 29.049f, 13.658f, 28.854f, 13.854f)
            lineTo(21.854f, 20.854f)
            curveTo(21.658f, 21.049f, 21.342f, 21.049f, 21.146f, 20.854f)
            curveTo(20.951f, 20.658f, 20.951f, 20.342f, 21.146f, 20.146f)
            lineTo(27.293f, 14f)
            horizontalLineTo(15.5f)
            curveTo(9.149f, 14f, 4f, 19.149f, 4f, 25.5f)
            curveTo(4f, 25.776f, 3.776f, 26f, 3.5f, 26f)
            curveTo(3.224f, 26f, 3f, 25.776f, 3f, 25.5f)
            curveTo(3f, 18.596f, 8.596f, 13f, 15.5f, 13f)
            horizontalLineTo(27.293f)
            lineTo(21.146f, 6.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowForward, contentDescription = null)
    }
}
