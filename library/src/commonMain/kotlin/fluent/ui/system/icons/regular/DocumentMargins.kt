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

public val FluentUi.Regular.DocumentMargins: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentMargins",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(17f, 20.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 20.5f, 18.5f, 20.164f, 18.5f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(17f)
            verticalLineTo(6.25f)
            curveTo(17f, 6.664f, 16.664f, 7f, 16.25f, 7f)
            curveTo(15.836f, 7f, 15.5f, 6.664f, 15.5f, 6.25f)
            verticalLineTo(3.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(6.25f)
            curveTo(8.5f, 6.664f, 8.164f, 7f, 7.75f, 7f)
            curveTo(7.336f, 7f, 7f, 6.664f, 7f, 6.25f)
            verticalLineTo(3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(7f)
            verticalLineTo(17.75f)
            curveTo(7f, 17.336f, 7.336f, 17f, 7.75f, 17f)
            curveTo(8.164f, 17f, 8.5f, 17.336f, 8.5f, 17.75f)
            verticalLineTo(20.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(17.75f)
            curveTo(15.5f, 17.336f, 15.836f, 17f, 16.25f, 17f)
            curveTo(16.664f, 17f, 17f, 17.336f, 17f, 17.75f)
            verticalLineTo(20.5f)
            close()
            moveTo(7.75f, 8.5f)
            curveTo(8.164f, 8.5f, 8.5f, 8.836f, 8.5f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(8.5f, 15.164f, 8.164f, 15.5f, 7.75f, 15.5f)
            curveTo(7.336f, 15.5f, 7f, 15.164f, 7f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(7f, 8.836f, 7.336f, 8.5f, 7.75f, 8.5f)
            close()
            moveTo(17f, 9.25f)
            curveTo(17f, 8.836f, 16.664f, 8.5f, 16.25f, 8.5f)
            curveTo(15.836f, 8.5f, 15.5f, 8.836f, 15.5f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(15.5f, 15.164f, 15.836f, 15.5f, 16.25f, 15.5f)
            curveTo(16.664f, 15.5f, 17f, 15.164f, 17f, 14.75f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentMarginsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentMargins, contentDescription = null)
    }
}
