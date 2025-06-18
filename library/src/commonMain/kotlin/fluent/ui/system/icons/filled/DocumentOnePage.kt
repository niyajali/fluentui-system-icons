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

public val FluentUi.Filled.DocumentOnePage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentOnePage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 2f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            close()
            moveTo(7.75f, 6f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 6f, 17f, 6.336f, 17f, 6.75f)
            curveTo(17f, 7.164f, 16.664f, 7.5f, 16.25f, 7.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 7.5f, 7f, 7.164f, 7f, 6.75f)
            curveTo(7f, 6.336f, 7.336f, 6f, 7.75f, 6f)
            close()
            moveTo(7f, 16.75f)
            curveTo(7f, 16.336f, 7.336f, 16f, 7.75f, 16f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 16f, 17f, 16.336f, 17f, 16.75f)
            curveTo(17f, 17.164f, 16.664f, 17.5f, 16.25f, 17.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 17.5f, 7f, 17.164f, 7f, 16.75f)
            close()
            moveTo(7.75f, 11f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 11f, 17f, 11.336f, 17f, 11.75f)
            curveTo(17f, 12.164f, 16.664f, 12.5f, 16.25f, 12.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 12.5f, 7f, 12.164f, 7f, 11.75f)
            curveTo(7f, 11.336f, 7.336f, 11f, 7.75f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentOnePagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentOnePage, contentDescription = null)
    }
}
