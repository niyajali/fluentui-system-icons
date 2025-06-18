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

public val FluentUi.Light.VideoClip: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.VideoClip",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 12.001f)
            verticalLineTo(19.999f)
            curveTo(12f, 20.754f, 12.804f, 21.236f, 13.471f, 20.881f)
            lineTo(20.968f, 16.882f)
            curveTo(21.673f, 16.506f, 21.673f, 15.494f, 20.968f, 15.118f)
            lineTo(13.471f, 11.119f)
            curveTo(12.804f, 10.764f, 12f, 11.246f, 12f, 12.001f)
            close()
            moveTo(6.5f, 28f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 28f, 30f, 25.985f, 30f, 23.5f)
            verticalLineTo(8.5f)
            curveTo(30f, 6.015f, 27.985f, 4f, 25.5f, 4f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
            verticalLineTo(23.5f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            close()
            moveTo(25.5f, 27f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 27f, 3f, 25.433f, 3f, 23.5f)
            verticalLineTo(8.5f)
            curveTo(3f, 6.567f, 4.567f, 5f, 6.5f, 5f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 5f, 29f, 6.567f, 29f, 8.5f)
            verticalLineTo(23.5f)
            curveTo(29f, 25.433f, 27.433f, 27f, 25.5f, 27f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoClipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.VideoClip, contentDescription = null)
    }
}
