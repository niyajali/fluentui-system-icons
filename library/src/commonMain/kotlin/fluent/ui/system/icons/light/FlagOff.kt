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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.FlagOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.FlagOff",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.854f, 2.146f)
            curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
            curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
            lineTo(5f, 5.707f)
            verticalLineTo(28.5f)
            curveTo(5f, 28.776f, 5.224f, 29f, 5.5f, 29f)
            curveTo(5.776f, 29f, 6f, 28.776f, 6f, 28.5f)
            verticalLineTo(21f)
            horizontalLineTo(20.293f)
            lineTo(29.146f, 29.854f)
            curveTo(29.342f, 30.049f, 29.658f, 30.049f, 29.854f, 29.854f)
            curveTo(30.049f, 29.658f, 30.049f, 29.342f, 29.854f, 29.146f)
            lineTo(2.854f, 2.146f)
            close()
            moveTo(19.293f, 20f)
            horizontalLineTo(6f)
            verticalLineTo(6.707f)
            lineTo(19.293f, 20f)
            close()
            moveTo(28.5f, 21f)
            horizontalLineTo(22.768f)
            lineTo(21.768f, 20f)
            horizontalLineTo(27.488f)
            lineTo(21.603f, 12.304f)
            curveTo(21.466f, 12.124f, 21.466f, 11.876f, 21.603f, 11.696f)
            lineTo(27.488f, 4f)
            horizontalLineTo(6.5f)
            curveTo(6.302f, 4f, 6.131f, 4.115f, 6.05f, 4.282f)
            lineTo(5.33f, 3.562f)
            curveTo(5.604f, 3.219f, 6.027f, 3f, 6.5f, 3f)
            horizontalLineTo(28.5f)
            curveTo(28.69f, 3f, 28.864f, 3.108f, 28.948f, 3.278f)
            curveTo(29.032f, 3.449f, 29.013f, 3.653f, 28.897f, 3.804f)
            lineTo(22.629f, 12f)
            lineTo(28.897f, 20.196f)
            curveTo(29.013f, 20.347f, 29.032f, 20.551f, 28.948f, 20.722f)
            curveTo(28.864f, 20.892f, 28.69f, 21f, 28.5f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.FlagOff, contentDescription = null)
    }
}
