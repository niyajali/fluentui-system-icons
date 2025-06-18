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

public val FluentIcons.Light.AutoFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.AutoFit",
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
            curveTo(26f, 4.776f, 25.776f, 5f, 25.5f, 5f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
            moveTo(6f, 27.5f)
            curveTo(6f, 27.224f, 6.224f, 27f, 6.5f, 27f)
            horizontalLineTo(25.5f)
            curveTo(25.776f, 27f, 26f, 27.224f, 26f, 27.5f)
            curveTo(26f, 27.776f, 25.776f, 28f, 25.5f, 28f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 28f, 6f, 27.776f, 6f, 27.5f)
            close()
            moveTo(16.854f, 7.146f)
            curveTo(16.658f, 6.951f, 16.342f, 6.951f, 16.146f, 7.146f)
            lineTo(12.146f, 11.146f)
            curveTo(11.951f, 11.342f, 11.951f, 11.658f, 12.146f, 11.854f)
            curveTo(12.342f, 12.049f, 12.658f, 12.049f, 12.854f, 11.854f)
            lineTo(16f, 8.707f)
            verticalLineTo(23.293f)
            lineTo(12.354f, 19.646f)
            curveTo(12.158f, 19.451f, 11.842f, 19.451f, 11.646f, 19.646f)
            curveTo(11.451f, 19.842f, 11.451f, 20.158f, 11.646f, 20.354f)
            lineTo(16.146f, 24.854f)
            curveTo(16.342f, 25.049f, 16.658f, 25.049f, 16.854f, 24.854f)
            lineTo(21.354f, 20.354f)
            curveTo(21.549f, 20.158f, 21.549f, 19.842f, 21.354f, 19.646f)
            curveTo(21.158f, 19.451f, 20.842f, 19.451f, 20.646f, 19.646f)
            lineTo(17f, 23.293f)
            verticalLineTo(8.707f)
            lineTo(20.146f, 11.854f)
            curveTo(20.342f, 12.049f, 20.658f, 12.049f, 20.854f, 11.854f)
            curveTo(21.049f, 11.658f, 21.049f, 11.342f, 20.854f, 11.146f)
            lineTo(16.854f, 7.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutoFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.AutoFit, contentDescription = null)
    }
}
