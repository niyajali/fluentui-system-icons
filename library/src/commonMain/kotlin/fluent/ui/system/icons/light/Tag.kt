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

public val FluentUi.Light.Tag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Tag",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.89f, 3f)
            curveTo(17.028f, 3f, 16.201f, 3.342f, 15.592f, 3.952f)
            lineTo(3.952f, 15.592f)
            curveTo(2.683f, 16.861f, 2.683f, 18.919f, 3.952f, 20.188f)
            lineTo(11.813f, 28.049f)
            curveTo(13.082f, 29.318f, 15.14f, 29.318f, 16.409f, 28.049f)
            lineTo(28.049f, 16.409f)
            curveTo(28.658f, 15.8f, 29.001f, 14.973f, 29.001f, 14.111f)
            verticalLineTo(6.25f)
            curveTo(29.001f, 4.455f, 27.546f, 3f, 25.751f, 3f)
            horizontalLineTo(17.89f)
            close()
            moveTo(16.299f, 4.659f)
            curveTo(16.721f, 4.237f, 17.293f, 4f, 17.89f, 4f)
            horizontalLineTo(25.751f)
            curveTo(26.993f, 4f, 28.001f, 5.007f, 28.001f, 6.25f)
            verticalLineTo(14.111f)
            curveTo(28.001f, 14.708f, 27.764f, 15.28f, 27.342f, 15.702f)
            lineTo(15.702f, 27.342f)
            curveTo(14.823f, 28.221f, 13.399f, 28.221f, 12.52f, 27.342f)
            lineTo(4.659f, 19.481f)
            curveTo(3.78f, 18.602f, 3.78f, 17.178f, 4.659f, 16.299f)
            lineTo(16.299f, 4.659f)
            close()
            moveTo(23f, 11f)
            curveTo(24.105f, 11f, 25f, 10.105f, 25f, 9f)
            curveTo(25f, 7.895f, 24.105f, 7f, 23f, 7f)
            curveTo(21.895f, 7f, 21f, 7.895f, 21f, 9f)
            curveTo(21f, 10.105f, 21.895f, 11f, 23f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Tag, contentDescription = null)
    }
}
