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

public val FluentUi.Filled.TextFirstLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFirstLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.707f, 3.293f)
            curveTo(3.317f, 2.902f, 2.683f, 2.902f, 2.293f, 3.293f)
            curveTo(1.902f, 3.683f, 1.902f, 4.317f, 2.293f, 4.707f)
            lineTo(3.586f, 6f)
            lineTo(2.293f, 7.293f)
            curveTo(1.902f, 7.683f, 1.902f, 8.317f, 2.293f, 8.707f)
            curveTo(2.683f, 9.098f, 3.317f, 9.098f, 3.707f, 8.707f)
            lineTo(5.707f, 6.707f)
            curveTo(6.098f, 6.317f, 6.098f, 5.683f, 5.707f, 5.293f)
            lineTo(3.707f, 3.293f)
            close()
            moveTo(10f, 5f)
            curveTo(9.448f, 5f, 9f, 5.448f, 9f, 6f)
            curveTo(9f, 6.552f, 9.448f, 7f, 10f, 7f)
            horizontalLineTo(21f)
            curveTo(21.552f, 7f, 22f, 6.552f, 22f, 6f)
            curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
            horizontalLineTo(10f)
            close()
            moveTo(21f, 17f)
            horizontalLineTo(3f)
            curveTo(2.448f, 17f, 2f, 17.448f, 2f, 18f)
            curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(21f)
            curveTo(21.552f, 19f, 22f, 18.552f, 22f, 18f)
            curveTo(22f, 17.448f, 21.552f, 17f, 21f, 17f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextFirstLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextFirstLine, contentDescription = null)
    }
}
