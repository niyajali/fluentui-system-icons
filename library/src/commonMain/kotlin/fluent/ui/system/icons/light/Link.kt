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

public val FluentUi.Light.Link: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Link",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 15.5f)
            curveTo(2f, 11.91f, 4.91f, 9f, 8.5f, 9f)
            horizontalLineTo(13.5f)
            curveTo(13.776f, 9f, 14f, 9.224f, 14f, 9.5f)
            curveTo(14f, 9.776f, 13.776f, 10f, 13.5f, 10f)
            horizontalLineTo(8.5f)
            curveTo(5.462f, 10f, 3f, 12.462f, 3f, 15.5f)
            curveTo(3f, 18.538f, 5.462f, 21f, 8.5f, 21f)
            horizontalLineTo(13.5f)
            curveTo(13.776f, 21f, 14f, 21.224f, 14f, 21.5f)
            curveTo(14f, 21.776f, 13.776f, 22f, 13.5f, 22f)
            horizontalLineTo(8.5f)
            curveTo(4.91f, 22f, 2f, 19.09f, 2f, 15.5f)
            close()
            moveTo(30f, 15.5f)
            curveTo(30f, 11.91f, 27.09f, 9f, 23.5f, 9f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 9f, 18f, 9.224f, 18f, 9.5f)
            curveTo(18f, 9.776f, 18.224f, 10f, 18.5f, 10f)
            horizontalLineTo(23.5f)
            curveTo(26.538f, 10f, 29f, 12.462f, 29f, 15.5f)
            curveTo(29f, 18.538f, 26.538f, 21f, 23.5f, 21f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 21f, 18f, 21.224f, 18f, 21.5f)
            curveTo(18f, 21.776f, 18.224f, 22f, 18.5f, 22f)
            horizontalLineTo(23.5f)
            curveTo(27.09f, 22f, 30f, 19.09f, 30f, 15.5f)
            close()
            moveTo(9.5f, 15f)
            curveTo(9.224f, 15f, 9f, 15.224f, 9f, 15.5f)
            curveTo(9f, 15.776f, 9.224f, 16f, 9.5f, 16f)
            horizontalLineTo(22.5f)
            curveTo(22.776f, 16f, 23f, 15.776f, 23f, 15.5f)
            curveTo(23f, 15.224f, 22.776f, 15f, 22.5f, 15f)
            horizontalLineTo(9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Link, contentDescription = null)
    }
}
