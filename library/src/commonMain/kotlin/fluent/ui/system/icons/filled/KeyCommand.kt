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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.KeyCommand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyCommand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 5f)
            curveTo(7.328f, 5f, 8f, 5.672f, 8f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 8f, 5f, 7.328f, 5f, 6.5f)
            curveTo(5f, 5.672f, 5.672f, 5f, 6.5f, 5f)
            close()
            moveTo(10f, 8f)
            verticalLineTo(6.5f)
            curveTo(10f, 4.567f, 8.433f, 3f, 6.5f, 3f)
            curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
            curveTo(3f, 8.433f, 4.567f, 10f, 6.5f, 10f)
            horizontalLineTo(8f)
            verticalLineTo(14f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 14f, 3f, 15.567f, 3f, 17.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            curveTo(8.433f, 21f, 10f, 19.433f, 10f, 17.5f)
            verticalLineTo(16f)
            horizontalLineTo(14f)
            verticalLineTo(17.5f)
            curveTo(14f, 19.433f, 15.567f, 21f, 17.5f, 21f)
            curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
            curveTo(21f, 15.567f, 19.433f, 14f, 17.5f, 14f)
            horizontalLineTo(16f)
            verticalLineTo(10f)
            horizontalLineTo(17.5f)
            curveTo(19.433f, 10f, 21f, 8.433f, 21f, 6.5f)
            curveTo(21f, 4.567f, 19.433f, 3f, 17.5f, 3f)
            curveTo(15.567f, 3f, 14f, 4.567f, 14f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(10f)
            close()
            moveTo(10f, 10f)
            horizontalLineTo(14f)
            verticalLineTo(14f)
            horizontalLineTo(10f)
            verticalLineTo(10f)
            close()
            moveTo(16f, 8f)
            verticalLineTo(6.5f)
            curveTo(16f, 5.672f, 16.672f, 5f, 17.5f, 5f)
            curveTo(18.328f, 5f, 19f, 5.672f, 19f, 6.5f)
            curveTo(19f, 7.328f, 18.328f, 8f, 17.5f, 8f)
            horizontalLineTo(16f)
            close()
            moveTo(16f, 16f)
            horizontalLineTo(17.5f)
            curveTo(18.328f, 16f, 19f, 16.672f, 19f, 17.5f)
            curveTo(19f, 18.328f, 18.328f, 19f, 17.5f, 19f)
            curveTo(16.672f, 19f, 16f, 18.328f, 16f, 17.5f)
            verticalLineTo(16f)
            close()
            moveTo(8f, 16f)
            verticalLineTo(17.5f)
            curveTo(8f, 18.328f, 7.328f, 19f, 6.5f, 19f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            curveTo(5f, 16.672f, 5.672f, 16f, 6.5f, 16f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyCommandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.KeyCommand, contentDescription = null)
    }
}
