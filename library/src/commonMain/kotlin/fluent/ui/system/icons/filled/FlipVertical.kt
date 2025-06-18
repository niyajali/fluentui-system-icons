/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.FlipVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.547f, 2.163f)
            curveTo(19.83f, 2.348f, 20f, 2.663f, 20f, 3f)
            verticalLineTo(10f)
            curveTo(20f, 10.552f, 19.552f, 11f, 19f, 11f)
            horizontalLineTo(3f)
            curveTo(2.527f, 11f, 2.118f, 10.668f, 2.021f, 10.205f)
            curveTo(1.924f, 9.741f, 2.166f, 9.274f, 2.599f, 9.084f)
            lineTo(18.599f, 2.084f)
            curveTo(18.909f, 1.949f, 19.265f, 1.978f, 19.547f, 2.163f)
            close()
            moveTo(7.781f, 9f)
            horizontalLineTo(18f)
            verticalLineTo(4.529f)
            lineTo(7.781f, 9f)
            close()
            moveTo(20f, 21.5f)
            curveTo(20f, 21.671f, 19.913f, 21.83f, 19.768f, 21.922f)
            curveTo(19.623f, 22.014f, 19.442f, 22.025f, 19.287f, 21.952f)
            lineTo(2.287f, 13.952f)
            curveTo(2.075f, 13.853f, 1.961f, 13.619f, 2.012f, 13.391f)
            curveTo(2.063f, 13.162f, 2.266f, 13f, 2.5f, 13f)
            horizontalLineTo(19.5f)
            curveTo(19.776f, 13f, 20f, 13.224f, 20f, 13.5f)
            verticalLineTo(21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlipVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FlipVertical, contentDescription = null)
    }
}
