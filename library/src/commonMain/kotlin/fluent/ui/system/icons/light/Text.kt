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

public val FluentIcons.Light.Text: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Text",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineTo(25.5f)
            curveTo(25.776f, 4f, 26f, 4.224f, 26f, 4.5f)
            verticalLineTo(8.5f)
            curveTo(26f, 8.776f, 25.776f, 9f, 25.5f, 9f)
            curveTo(25.224f, 9f, 25f, 8.776f, 25f, 8.5f)
            verticalLineTo(5f)
            horizontalLineTo(16.5f)
            verticalLineTo(27f)
            horizontalLineTo(19.5f)
            curveTo(19.776f, 27f, 20f, 27.224f, 20f, 27.5f)
            curveTo(20f, 27.776f, 19.776f, 28f, 19.5f, 28f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 28f, 12f, 27.776f, 12f, 27.5f)
            curveTo(12f, 27.224f, 12.224f, 27f, 12.5f, 27f)
            horizontalLineTo(15.5f)
            verticalLineTo(5f)
            horizontalLineTo(7f)
            verticalLineTo(8.5f)
            curveTo(7f, 8.776f, 6.776f, 9f, 6.5f, 9f)
            curveTo(6.224f, 9f, 6f, 8.776f, 6f, 8.5f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Text, contentDescription = null)
    }
}
