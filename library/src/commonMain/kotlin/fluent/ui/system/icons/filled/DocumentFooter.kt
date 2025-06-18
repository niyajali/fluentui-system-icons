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

public val FluentIcons.Filled.DocumentFooter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentFooter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.746f, 1.996f)
            curveTo(18.937f, 1.996f, 19.912f, 2.921f, 19.991f, 4.092f)
            lineTo(19.996f, 4.246f)
            verticalLineTo(19.744f)
            curveTo(19.996f, 20.935f, 19.071f, 21.91f, 17.9f, 21.989f)
            lineTo(17.746f, 21.994f)
            horizontalLineTo(6.246f)
            curveTo(5.055f, 21.994f, 4.08f, 21.069f, 4.001f, 19.898f)
            lineTo(3.996f, 19.744f)
            verticalLineTo(4.246f)
            curveTo(3.996f, 3.055f, 4.921f, 2.08f, 6.092f, 2.001f)
            lineTo(6.246f, 1.996f)
            horizontalLineTo(17.746f)
            close()
            moveTo(8.501f, 16f)
            curveTo(7.673f, 16f, 7.001f, 16.672f, 7.001f, 17.5f)
            curveTo(7.001f, 18.329f, 7.673f, 19f, 8.501f, 19f)
            horizontalLineTo(15.501f)
            curveTo(16.33f, 19f, 17.001f, 18.329f, 17.001f, 17.5f)
            curveTo(17.001f, 16.672f, 16.33f, 16f, 15.501f, 16f)
            horizontalLineTo(8.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFooterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentFooter, contentDescription = null)
    }
}
