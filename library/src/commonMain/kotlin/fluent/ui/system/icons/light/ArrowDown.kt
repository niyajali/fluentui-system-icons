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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.ArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowDown",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.5f, 3.5f)
            curveTo(16.5f, 3.224f, 16.276f, 3f, 16f, 3f)
            curveTo(15.724f, 3f, 15.5f, 3.224f, 15.5f, 3.5f)
            verticalLineTo(27.333f)
            lineTo(5.845f, 18.138f)
            curveTo(5.645f, 17.948f, 5.328f, 17.955f, 5.138f, 18.155f)
            curveTo(4.947f, 18.355f, 4.955f, 18.672f, 5.155f, 18.862f)
            lineTo(15.655f, 28.862f)
            curveTo(15.848f, 29.046f, 16.152f, 29.046f, 16.345f, 28.862f)
            lineTo(26.845f, 18.862f)
            curveTo(27.045f, 18.672f, 27.052f, 18.355f, 26.862f, 18.155f)
            curveTo(26.672f, 17.955f, 26.355f, 17.948f, 26.155f, 18.138f)
            lineTo(16.5f, 27.333f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowDown, contentDescription = null)
    }
}
