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

public val FluentIcons.Light.ColorFillAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ColorFillAccent",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.797f, 19.5f)
            curveTo(18.649f, 19.915f, 18.5f, 20.448f, 18.5f, 21f)
            curveTo(18.5f, 23.485f, 20.515f, 25.5f, 23f, 25.5f)
            curveTo(25.485f, 25.5f, 27.5f, 23.485f, 27.5f, 21f)
            curveTo(27.5f, 20.605f, 27.424f, 20.22f, 27.326f, 19.88f)
            curveTo(28.031f, 20.322f, 28.5f, 21.106f, 28.5f, 22f)
            verticalLineTo(26f)
            curveTo(28.5f, 27.381f, 27.381f, 28.5f, 26f, 28.5f)
            horizontalLineTo(6f)
            curveTo(4.619f, 28.5f, 3.5f, 27.381f, 3.5f, 26f)
            verticalLineTo(22f)
            curveTo(3.5f, 20.619f, 4.619f, 19.5f, 6f, 19.5f)
            horizontalLineTo(6.438f)
            lineTo(9.044f, 22.105f)
            curveTo(10.899f, 23.96f, 13.906f, 23.96f, 15.761f, 22.105f)
            lineTo(18.367f, 19.5f)
            horizontalLineTo(18.797f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorFillAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ColorFillAccent, contentDescription = null)
    }
}
