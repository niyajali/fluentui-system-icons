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

public val FluentUi.Light.Comment: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Comment",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.5f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 3f, 30f, 5.015f, 30f, 7.5f)
            verticalLineTo(19.5f)
            curveTo(30f, 21.985f, 27.985f, 24f, 25.5f, 24f)
            horizontalLineTo(17.883f)
            lineTo(11.26f, 29.615f)
            curveTo(9.974f, 30.706f, 8f, 29.792f, 8f, 28.105f)
            verticalLineTo(24f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 24f, 2f, 21.985f, 2f, 19.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(6.5f, 4f)
            curveTo(4.567f, 4f, 3f, 5.567f, 3f, 7.5f)
            verticalLineTo(19.5f)
            curveTo(3f, 21.433f, 4.567f, 23f, 6.5f, 23f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 23f, 9f, 23.224f, 9f, 23.5f)
            verticalLineTo(28.105f)
            curveTo(9f, 28.94f, 9.977f, 29.392f, 10.614f, 28.852f)
            lineTo(17.377f, 23.119f)
            curveTo(17.467f, 23.042f, 17.582f, 23f, 17.7f, 23f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 23f, 29f, 21.433f, 29f, 19.5f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.567f, 27.433f, 4f, 25.5f, 4f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Comment, contentDescription = null)
    }
}
