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

public val FluentUi.Filled.AlignRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 2.75f)
            curveTo(21f, 2.336f, 20.664f, 2f, 20.25f, 2f)
            curveTo(19.836f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(19.5f, 21.664f, 19.836f, 22f, 20.25f, 22f)
            curveTo(20.664f, 22f, 21f, 21.664f, 21f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(15.75f, 4f)
            curveTo(16.993f, 4f, 18f, 5.007f, 18f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(18f, 9.993f, 16.993f, 11f, 15.75f, 11f)
            lineTo(5.25f, 11f)
            curveTo(4.007f, 11f, 3f, 9.993f, 3f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 5.007f, 4.007f, 4f, 5.25f, 4f)
            lineTo(15.75f, 4f)
            close()
            moveTo(15.75f, 13f)
            curveTo(16.993f, 13f, 18f, 14.007f, 18f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(18f, 18.993f, 16.993f, 20f, 15.75f, 20f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 20f, 6.5f, 18.993f, 6.5f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(6.5f, 14.007f, 7.507f, 13f, 8.75f, 13f)
            lineTo(15.75f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlignRight, contentDescription = null)
    }
}
