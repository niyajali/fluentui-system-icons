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

public val FluentUi.Regular.DocumentFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentFit",
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
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 3.5f, 18.5f, 3.836f, 18.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(9f, 6.5f)
            curveTo(8.724f, 6.5f, 8.5f, 6.724f, 8.5f, 7f)
            verticalLineTo(8.25f)
            curveTo(8.5f, 8.664f, 8.164f, 9f, 7.75f, 9f)
            curveTo(7.336f, 9f, 7f, 8.664f, 7f, 8.25f)
            verticalLineTo(7f)
            curveTo(7f, 5.895f, 7.895f, 5f, 9f, 5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 5f, 11f, 5.336f, 11f, 5.75f)
            curveTo(11f, 6.164f, 10.664f, 6.5f, 10.25f, 6.5f)
            horizontalLineTo(9f)
            close()
            moveTo(9f, 17.5f)
            curveTo(8.724f, 17.5f, 8.5f, 17.276f, 8.5f, 17f)
            verticalLineTo(15.75f)
            curveTo(8.5f, 15.336f, 8.164f, 15f, 7.75f, 15f)
            curveTo(7.336f, 15f, 7f, 15.336f, 7f, 15.75f)
            verticalLineTo(17f)
            curveTo(7f, 18.105f, 7.895f, 19f, 9f, 19f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 19f, 11f, 18.664f, 11f, 18.25f)
            curveTo(11f, 17.836f, 10.664f, 17.5f, 10.25f, 17.5f)
            horizontalLineTo(9f)
            close()
            moveTo(15.5f, 7f)
            curveTo(15.5f, 6.724f, 15.276f, 6.5f, 15f, 6.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 6.5f, 13f, 6.164f, 13f, 5.75f)
            curveTo(13f, 5.336f, 13.336f, 5f, 13.75f, 5f)
            horizontalLineTo(15f)
            curveTo(16.105f, 5f, 17f, 5.895f, 17f, 7f)
            verticalLineTo(8.25f)
            curveTo(17f, 8.664f, 16.664f, 9f, 16.25f, 9f)
            curveTo(15.836f, 9f, 15.5f, 8.664f, 15.5f, 8.25f)
            verticalLineTo(7f)
            close()
            moveTo(15f, 17.5f)
            curveTo(15.276f, 17.5f, 15.5f, 17.276f, 15.5f, 17f)
            verticalLineTo(15.75f)
            curveTo(15.5f, 15.336f, 15.836f, 15f, 16.25f, 15f)
            curveTo(16.664f, 15f, 17f, 15.336f, 17f, 15.75f)
            verticalLineTo(17f)
            curveTo(17f, 18.105f, 16.105f, 19f, 15f, 19f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 19f, 13f, 18.664f, 13f, 18.25f)
            curveTo(13f, 17.836f, 13.336f, 17.5f, 13.75f, 17.5f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentFit, contentDescription = null)
    }
}
