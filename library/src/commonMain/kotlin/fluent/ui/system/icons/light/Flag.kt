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

public val FluentUi.Light.Flag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Flag",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineTo(28.5f)
            curveTo(28.69f, 3f, 28.864f, 3.108f, 28.948f, 3.278f)
            curveTo(29.032f, 3.449f, 29.013f, 3.653f, 28.897f, 3.804f)
            lineTo(22.629f, 12f)
            lineTo(28.897f, 20.196f)
            curveTo(29.013f, 20.347f, 29.032f, 20.551f, 28.948f, 20.722f)
            curveTo(28.864f, 20.892f, 28.69f, 21f, 28.5f, 21f)
            horizontalLineTo(6f)
            verticalLineTo(28.5f)
            curveTo(6f, 28.776f, 5.776f, 29f, 5.5f, 29f)
            curveTo(5.224f, 29f, 5f, 28.776f, 5f, 28.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(6f, 20f)
            horizontalLineTo(27.488f)
            lineTo(21.603f, 12.304f)
            curveTo(21.466f, 12.124f, 21.466f, 11.876f, 21.603f, 11.696f)
            lineTo(27.488f, 4f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 4f, 6f, 4.224f, 6f, 4.5f)
            verticalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Flag, contentDescription = null)
    }
}
