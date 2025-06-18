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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.BarcodeScanner: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BarcodeScanner",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.75f)
            curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(6.664f, 3f, 7f, 3.336f, 7f, 3.75f)
            curveTo(7f, 4.164f, 6.664f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 4.5f, 3.5f, 5.06f, 3.5f, 5.75f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 7.664f, 3.164f, 8f, 2.75f, 8f)
            curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(17f, 3.75f)
            curveTo(17f, 3.336f, 17.336f, 3f, 17.75f, 3f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 7.664f, 21.664f, 8f, 21.25f, 8f)
            curveTo(20.836f, 8f, 20.5f, 7.664f, 20.5f, 7.25f)
            verticalLineTo(5.75f)
            curveTo(20.5f, 5.06f, 19.94f, 4.5f, 19.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 4.5f, 17f, 4.164f, 17f, 3.75f)
            close()
            moveTo(2.75f, 16f)
            curveTo(3.164f, 16f, 3.5f, 16.336f, 3.5f, 16.75f)
            verticalLineTo(18.25f)
            curveTo(3.5f, 18.94f, 4.06f, 19.5f, 4.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(6.664f, 19.5f, 7f, 19.836f, 7f, 20.25f)
            curveTo(7f, 20.664f, 6.664f, 21f, 6.25f, 21f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 21f, 2f, 19.769f, 2f, 18.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 16.336f, 2.336f, 16f, 2.75f, 16f)
            close()
            moveTo(21.25f, 16f)
            curveTo(21.664f, 16f, 22f, 16.336f, 22f, 16.75f)
            verticalLineTo(18.25f)
            curveTo(22f, 19.769f, 20.769f, 21f, 19.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 21f, 17f, 20.664f, 17f, 20.25f)
            curveTo(17f, 19.836f, 17.336f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 19.5f, 20.5f, 18.94f, 20.5f, 18.25f)
            verticalLineTo(16.75f)
            curveTo(20.5f, 16.336f, 20.836f, 16f, 21.25f, 16f)
            close()
            moveTo(5.75f, 7f)
            curveTo(6.164f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(6.5f, 16.664f, 6.164f, 17f, 5.75f, 17f)
            curveTo(5.336f, 17f, 5f, 16.664f, 5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            close()
            moveTo(10.5f, 7.75f)
            curveTo(10.5f, 7.336f, 10.164f, 7f, 9.75f, 7f)
            curveTo(9.336f, 7f, 9f, 7.336f, 9f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(9f, 16.664f, 9.336f, 17f, 9.75f, 17f)
            curveTo(10.164f, 17f, 10.5f, 16.664f, 10.5f, 16.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(13.75f, 7f)
            curveTo(14.164f, 7f, 14.5f, 7.336f, 14.5f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(14.5f, 16.664f, 14.164f, 17f, 13.75f, 17f)
            curveTo(13.336f, 17f, 13f, 16.664f, 13f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(13f, 7.336f, 13.336f, 7f, 13.75f, 7f)
            close()
            moveTo(18.5f, 7.75f)
            curveTo(18.5f, 7.336f, 18.164f, 7f, 17.75f, 7f)
            curveTo(17.336f, 7f, 17f, 7.336f, 17f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(17f, 16.664f, 17.336f, 17f, 17.75f, 17f)
            curveTo(18.164f, 17f, 18.5f, 16.664f, 18.5f, 16.25f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BarcodeScannerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BarcodeScanner, contentDescription = null)
    }
}
