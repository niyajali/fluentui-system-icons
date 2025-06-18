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

public val FluentUi.Regular.ReceiptBag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReceiptBag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
            verticalLineTo(9.535f)
            curveTo(4.163f, 9.512f, 4.33f, 9.5f, 4.5f, 9.5f)
            curveTo(4.847f, 9.5f, 5.183f, 9.551f, 5.5f, 9.645f)
            verticalLineTo(5.25f)
            curveTo(5.5f, 4.836f, 5.836f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 4.5f, 16.5f, 4.836f, 16.5f, 5.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(20.75f)
            curveTo(11.5f, 20.834f, 11.497f, 20.917f, 11.491f, 21f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 21f, 22f, 19.545f, 22f, 17.75f)
            verticalLineTo(14f)
            horizontalLineTo(18f)
            verticalLineTo(5.25f)
            curveTo(18f, 4.007f, 16.993f, 3f, 15.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(10.465f, 12.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
            curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
            horizontalLineTo(9.873f)
            curveTo(10.178f, 11.438f, 10.386f, 11.948f, 10.465f, 12.5f)
            close()
            moveTo(18.75f, 19.5f)
            horizontalLineTo(18f)
            verticalLineTo(15.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(17.75f)
            curveTo(20.5f, 18.716f, 19.716f, 19.5f, 18.75f, 19.5f)
            close()
            moveTo(7.5f, 7.75f)
            curveTo(7.5f, 7.336f, 7.836f, 7f, 8.25f, 7f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 7f, 14.5f, 7.336f, 14.5f, 7.75f)
            curveTo(14.5f, 8.164f, 14.164f, 8.5f, 13.75f, 8.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 8.5f, 7.5f, 8.164f, 7.5f, 7.75f)
            close()
            moveTo(1f, 14.75f)
            curveTo(1f, 14.336f, 1.336f, 14f, 1.75f, 14f)
            horizontalLineTo(2f)
            verticalLineTo(13f)
            curveTo(2f, 11.619f, 3.119f, 10.5f, 4.5f, 10.5f)
            curveTo(4.955f, 10.5f, 5.382f, 10.622f, 5.75f, 10.835f)
            curveTo(6.118f, 10.622f, 6.545f, 10.5f, 7f, 10.5f)
            curveTo(8.381f, 10.5f, 9.5f, 11.619f, 9.5f, 13f)
            verticalLineTo(14f)
            horizontalLineTo(9.75f)
            curveTo(10.164f, 14f, 10.5f, 14.336f, 10.5f, 14.75f)
            verticalLineTo(20.75f)
            curveTo(10.5f, 21.993f, 9.493f, 23f, 8.25f, 23f)
            horizontalLineTo(3.25f)
            curveTo(2.007f, 23f, 1f, 21.993f, 1f, 20.75f)
            verticalLineTo(14.75f)
            close()
            moveTo(7f, 13f)
            verticalLineTo(14f)
            horizontalLineTo(8f)
            verticalLineTo(13f)
            curveTo(8f, 12.448f, 7.552f, 12f, 7f, 12f)
            curveTo(6.932f, 12f, 6.865f, 12.007f, 6.801f, 12.02f)
            curveTo(6.929f, 12.321f, 7f, 12.652f, 7f, 13f)
            close()
            moveTo(5.5f, 14f)
            verticalLineTo(13f)
            curveTo(5.5f, 12.448f, 5.052f, 12f, 4.5f, 12f)
            curveTo(3.948f, 12f, 3.5f, 12.448f, 3.5f, 13f)
            verticalLineTo(14f)
            horizontalLineTo(5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReceiptBagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReceiptBag, contentDescription = null)
    }
}
