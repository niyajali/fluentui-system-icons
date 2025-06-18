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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ChevronUpDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronUpDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.541f, 2.23f)
            curveTo(12.399f, 2.083f, 12.204f, 2f, 12f, 2f)
            curveTo(11.796f, 2f, 11.601f, 2.083f, 11.459f, 2.23f)
            lineTo(5.209f, 8.73f)
            curveTo(4.922f, 9.029f, 4.932f, 9.504f, 5.23f, 9.791f)
            curveTo(5.529f, 10.078f, 6.004f, 10.068f, 6.291f, 9.77f)
            lineTo(12f, 3.832f)
            lineTo(17.709f, 9.77f)
            curveTo(17.997f, 10.068f, 18.471f, 10.078f, 18.77f, 9.791f)
            curveTo(19.068f, 9.504f, 19.078f, 9.029f, 18.791f, 8.73f)
            lineTo(12.541f, 2.23f)
            close()
            moveTo(12.541f, 21.77f)
            curveTo(12.399f, 21.917f, 12.204f, 22f, 12f, 22f)
            curveTo(11.796f, 22f, 11.601f, 21.917f, 11.459f, 21.77f)
            lineTo(5.209f, 15.27f)
            curveTo(4.922f, 14.971f, 4.932f, 14.497f, 5.23f, 14.209f)
            curveTo(5.529f, 13.922f, 6.004f, 13.932f, 6.291f, 14.23f)
            lineTo(12f, 20.168f)
            lineTo(17.709f, 14.23f)
            curveTo(17.997f, 13.932f, 18.471f, 13.922f, 18.77f, 14.209f)
            curveTo(19.068f, 14.497f, 19.078f, 14.971f, 18.791f, 15.27f)
            lineTo(12.541f, 21.77f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChevronUpDown, contentDescription = null)
    }
}
