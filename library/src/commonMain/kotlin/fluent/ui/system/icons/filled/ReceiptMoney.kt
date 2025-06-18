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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.ReceiptMoney: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReceiptMoney",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 4.007f, 5.007f, 3f, 6.25f, 3f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 3f, 18f, 4.007f, 18f, 5.25f)
            verticalLineTo(14f)
            horizontalLineTo(22f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(12.95f)
            curveTo(12.983f, 20.838f, 13f, 20.671f, 13f, 20.5f)
            verticalLineTo(16.5f)
            curveTo(13f, 15.119f, 11.881f, 14f, 10.5f, 14f)
            horizontalLineTo(4f)
            verticalLineTo(5.25f)
            close()
            moveTo(18f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(18f)
            verticalLineTo(19.5f)
            close()
            moveTo(7.5f, 7.75f)
            curveTo(7.5f, 8.164f, 7.836f, 8.5f, 8.25f, 8.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 8.5f, 14.5f, 8.164f, 14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 7f, 7.5f, 7.336f, 7.5f, 7.75f)
            close()
            moveTo(8.25f, 11f)
            curveTo(7.836f, 11f, 7.5f, 11.336f, 7.5f, 11.75f)
            curveTo(7.5f, 12.164f, 7.836f, 12.5f, 8.25f, 12.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
            curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
            horizontalLineTo(8.25f)
            close()
            moveTo(2.5f, 15f)
            curveTo(1.672f, 15f, 1f, 15.672f, 1f, 16.5f)
            verticalLineTo(20.5f)
            curveTo(1f, 21.328f, 1.672f, 22f, 2.5f, 22f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 22f, 12f, 21.328f, 12f, 20.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 15.672f, 11.328f, 15f, 10.5f, 15f)
            horizontalLineTo(2.5f)
            close()
            moveTo(10f, 16f)
            curveTo(10f, 16.552f, 10.448f, 17f, 11f, 17f)
            verticalLineTo(18f)
            curveTo(9.895f, 18f, 9f, 17.105f, 9f, 16f)
            horizontalLineTo(10f)
            close()
            moveTo(9f, 21f)
            curveTo(9f, 19.895f, 9.895f, 19f, 11f, 19f)
            verticalLineTo(20f)
            curveTo(10.448f, 20f, 10f, 20.448f, 10f, 21f)
            horizontalLineTo(9f)
            close()
            moveTo(2f, 17f)
            curveTo(2.552f, 17f, 3f, 16.552f, 3f, 16f)
            horizontalLineTo(4f)
            curveTo(4f, 17.105f, 3.105f, 18f, 2f, 18f)
            verticalLineTo(17f)
            close()
            moveTo(2f, 19f)
            curveTo(3.105f, 19f, 4f, 19.895f, 4f, 21f)
            horizontalLineTo(3f)
            curveTo(3f, 20.448f, 2.552f, 20f, 2f, 20f)
            verticalLineTo(19f)
            close()
            moveTo(6.5f, 16.75f)
            curveTo(7.466f, 16.75f, 8.25f, 17.534f, 8.25f, 18.5f)
            curveTo(8.25f, 19.466f, 7.466f, 20.25f, 6.5f, 20.25f)
            curveTo(5.534f, 20.25f, 4.75f, 19.466f, 4.75f, 18.5f)
            curveTo(4.75f, 17.534f, 5.534f, 16.75f, 6.5f, 16.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReceiptMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReceiptMoney, contentDescription = null)
    }
}
