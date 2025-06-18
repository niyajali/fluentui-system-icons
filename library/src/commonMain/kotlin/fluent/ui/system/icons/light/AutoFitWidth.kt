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

public val FluentUi.Light.AutoFitWidth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.AutoFitWidth",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 6f)
            curveTo(4.776f, 6f, 5f, 6.224f, 5f, 6.5f)
            verticalLineTo(25.5f)
            curveTo(5f, 25.776f, 4.776f, 26f, 4.5f, 26f)
            curveTo(4.224f, 26f, 4f, 25.776f, 4f, 25.5f)
            verticalLineTo(6.5f)
            curveTo(4f, 6.224f, 4.224f, 6f, 4.5f, 6f)
            close()
            moveTo(27.5f, 6f)
            curveTo(27.776f, 6f, 28f, 6.224f, 28f, 6.5f)
            verticalLineTo(25.5f)
            curveTo(28f, 25.776f, 27.776f, 26f, 27.5f, 26f)
            curveTo(27.224f, 26f, 27f, 25.776f, 27f, 25.5f)
            verticalLineTo(6.5f)
            curveTo(27f, 6.224f, 27.224f, 6f, 27.5f, 6f)
            close()
            moveTo(19.646f, 10.646f)
            curveTo(19.842f, 10.451f, 20.158f, 10.451f, 20.354f, 10.646f)
            lineTo(24.854f, 15.146f)
            curveTo(25.049f, 15.342f, 25.049f, 15.658f, 24.854f, 15.854f)
            lineTo(20.354f, 20.354f)
            curveTo(20.158f, 20.549f, 19.842f, 20.549f, 19.646f, 20.354f)
            curveTo(19.451f, 20.158f, 19.451f, 19.842f, 19.646f, 19.646f)
            lineTo(23.293f, 16f)
            horizontalLineTo(8.707f)
            lineTo(11.854f, 19.146f)
            curveTo(12.049f, 19.342f, 12.049f, 19.658f, 11.854f, 19.854f)
            curveTo(11.658f, 20.049f, 11.342f, 20.049f, 11.146f, 19.854f)
            lineTo(7.146f, 15.854f)
            curveTo(6.951f, 15.658f, 6.951f, 15.342f, 7.146f, 15.146f)
            lineTo(11.146f, 11.146f)
            curveTo(11.342f, 10.951f, 11.658f, 10.951f, 11.854f, 11.146f)
            curveTo(12.049f, 11.342f, 12.049f, 11.658f, 11.854f, 11.854f)
            lineTo(8.707f, 15f)
            horizontalLineTo(23.293f)
            lineTo(19.646f, 11.354f)
            curveTo(19.451f, 11.158f, 19.451f, 10.842f, 19.646f, 10.646f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutoFitWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.AutoFitWidth, contentDescription = null)
    }
}
