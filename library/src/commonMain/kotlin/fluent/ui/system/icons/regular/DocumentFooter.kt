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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.DocumentFooter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentFooter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.501f, 16f)
            curveTo(7.673f, 16f, 7.001f, 16.672f, 7.001f, 17.5f)
            curveTo(7.001f, 18.329f, 7.673f, 19f, 8.501f, 19f)
            horizontalLineTo(15.501f)
            curveTo(16.33f, 19f, 17.001f, 18.329f, 17.001f, 17.5f)
            curveTo(17.001f, 16.672f, 16.33f, 16f, 15.501f, 16f)
            horizontalLineTo(8.501f)
            close()
            moveTo(19.991f, 4.092f)
            curveTo(19.912f, 2.921f, 18.937f, 1.996f, 17.746f, 1.996f)
            horizontalLineTo(6.246f)
            lineTo(6.092f, 2.001f)
            curveTo(4.921f, 2.08f, 3.996f, 3.055f, 3.996f, 4.246f)
            verticalLineTo(19.744f)
            lineTo(4.001f, 19.898f)
            curveTo(4.08f, 21.069f, 5.055f, 21.994f, 6.246f, 21.994f)
            horizontalLineTo(17.746f)
            lineTo(17.9f, 21.989f)
            curveTo(19.071f, 21.91f, 19.996f, 20.935f, 19.996f, 19.744f)
            verticalLineTo(4.246f)
            lineTo(19.991f, 4.092f)
            close()
            moveTo(6.246f, 3.496f)
            horizontalLineTo(17.746f)
            lineTo(17.848f, 3.503f)
            curveTo(18.214f, 3.553f, 18.496f, 3.866f, 18.496f, 4.246f)
            verticalLineTo(19.744f)
            lineTo(18.489f, 19.846f)
            curveTo(18.44f, 20.212f, 18.126f, 20.494f, 17.746f, 20.494f)
            horizontalLineTo(6.246f)
            lineTo(6.144f, 20.487f)
            curveTo(5.778f, 20.438f, 5.496f, 20.124f, 5.496f, 19.744f)
            verticalLineTo(4.246f)
            lineTo(5.503f, 4.144f)
            curveTo(5.553f, 3.778f, 5.866f, 3.496f, 6.246f, 3.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFooterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentFooter, contentDescription = null)
    }
}
