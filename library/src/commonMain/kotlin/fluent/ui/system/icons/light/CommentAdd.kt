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

public val FluentIcons.Light.CommentAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CommentAdd",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 16.5f)
            curveTo(27.142f, 16.5f, 30.5f, 13.142f, 30.5f, 9f)
            curveTo(30.5f, 4.858f, 27.142f, 1.5f, 23f, 1.5f)
            curveTo(18.858f, 1.5f, 15.5f, 4.858f, 15.5f, 9f)
            curveTo(15.5f, 13.142f, 18.858f, 16.5f, 23f, 16.5f)
            close()
            moveTo(24f, 4.25f)
            verticalLineTo(8f)
            horizontalLineTo(27.75f)
            curveTo(28.164f, 8f, 28.5f, 8.336f, 28.5f, 8.75f)
            curveTo(28.5f, 9.164f, 28.164f, 9.5f, 27.75f, 9.5f)
            horizontalLineTo(24f)
            verticalLineTo(13.25f)
            curveTo(24f, 13.664f, 23.664f, 14f, 23.25f, 14f)
            curveTo(22.836f, 14f, 22.5f, 13.664f, 22.5f, 13.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(18.75f)
            curveTo(18.336f, 9.5f, 18f, 9.164f, 18f, 8.75f)
            curveTo(18f, 8.336f, 18.336f, 8f, 18.75f, 8f)
            horizontalLineTo(22.5f)
            verticalLineTo(4.25f)
            curveTo(22.5f, 3.836f, 22.836f, 3.5f, 23.25f, 3.5f)
            curveTo(23.664f, 3.5f, 24f, 3.836f, 24f, 4.25f)
            close()
            moveTo(30f, 19.5f)
            verticalLineTo(14.657f)
            curveTo(29.695f, 15.034f, 29.361f, 15.385f, 29f, 15.708f)
            verticalLineTo(19.5f)
            curveTo(29f, 21.433f, 27.433f, 23f, 25.5f, 23f)
            horizontalLineTo(17.7f)
            curveTo(17.582f, 23f, 17.467f, 23.042f, 17.377f, 23.119f)
            lineTo(10.614f, 28.852f)
            curveTo(9.977f, 29.392f, 9f, 28.94f, 9f, 28.105f)
            verticalLineTo(23.5f)
            curveTo(9f, 23.224f, 8.776f, 23f, 8.5f, 23f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 23f, 3f, 21.433f, 3f, 19.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.567f, 4.567f, 4f, 6.5f, 4f)
            horizontalLineTo(15.516f)
            curveTo(15.751f, 3.648f, 16.01f, 3.314f, 16.292f, 3f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
            verticalLineTo(19.5f)
            curveTo(2f, 21.985f, 4.015f, 24f, 6.5f, 24f)
            horizontalLineTo(8f)
            verticalLineTo(28.105f)
            curveTo(8f, 29.792f, 9.974f, 30.706f, 11.26f, 29.615f)
            lineTo(17.883f, 24f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 24f, 30f, 21.985f, 30f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CommentAdd, contentDescription = null)
    }
}
