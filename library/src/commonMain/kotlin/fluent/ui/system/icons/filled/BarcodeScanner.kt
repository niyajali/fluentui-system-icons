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

public val FluentUi.Filled.BarcodeScanner: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BarcodeScanner",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6f)
            curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
            horizontalLineTo(6.5f)
            curveTo(7.052f, 3f, 7.5f, 3.448f, 7.5f, 4f)
            curveTo(7.5f, 4.552f, 7.052f, 5f, 6.5f, 5f)
            horizontalLineTo(5f)
            curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
            verticalLineTo(7.5f)
            curveTo(4f, 8.052f, 3.552f, 8.5f, 3f, 8.5f)
            curveTo(2.448f, 8.5f, 2f, 8.052f, 2f, 7.5f)
            verticalLineTo(6f)
            close()
            moveTo(16.5f, 4f)
            curveTo(16.5f, 3.448f, 16.948f, 3f, 17.5f, 3f)
            horizontalLineTo(19f)
            curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
            verticalLineTo(7.5f)
            curveTo(22f, 8.052f, 21.552f, 8.5f, 21f, 8.5f)
            curveTo(20.448f, 8.5f, 20f, 8.052f, 20f, 7.5f)
            verticalLineTo(6f)
            curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
            horizontalLineTo(17.5f)
            curveTo(16.948f, 5f, 16.5f, 4.552f, 16.5f, 4f)
            close()
            moveTo(3f, 15.5f)
            curveTo(3.552f, 15.5f, 4f, 15.948f, 4f, 16.5f)
            verticalLineTo(18f)
            curveTo(4f, 18.552f, 4.448f, 19f, 5f, 19f)
            horizontalLineTo(6.5f)
            curveTo(7.052f, 19f, 7.5f, 19.448f, 7.5f, 20f)
            curveTo(7.5f, 20.552f, 7.052f, 21f, 6.5f, 21f)
            horizontalLineTo(5f)
            curveTo(3.343f, 21f, 2f, 19.657f, 2f, 18f)
            verticalLineTo(16.5f)
            curveTo(2f, 15.948f, 2.448f, 15.5f, 3f, 15.5f)
            close()
            moveTo(21f, 15.5f)
            curveTo(21.552f, 15.5f, 22f, 15.948f, 22f, 16.5f)
            verticalLineTo(18f)
            curveTo(22f, 19.657f, 20.657f, 21f, 19f, 21f)
            horizontalLineTo(17.5f)
            curveTo(16.948f, 21f, 16.5f, 20.552f, 16.5f, 20f)
            curveTo(16.5f, 19.448f, 16.948f, 19f, 17.5f, 19f)
            horizontalLineTo(19f)
            curveTo(19.552f, 19f, 20f, 18.552f, 20f, 18f)
            verticalLineTo(16.5f)
            curveTo(20f, 15.948f, 20.448f, 15.5f, 21f, 15.5f)
            close()
            moveTo(6f, 6.75f)
            curveTo(6.552f, 6.75f, 7f, 7.198f, 7f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(7f, 16.802f, 6.552f, 17.25f, 6f, 17.25f)
            curveTo(5.448f, 17.25f, 5f, 16.802f, 5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(5f, 7.198f, 5.448f, 6.75f, 6f, 6.75f)
            close()
            moveTo(11f, 7.75f)
            curveTo(11f, 7.198f, 10.552f, 6.75f, 10f, 6.75f)
            curveTo(9.448f, 6.75f, 9f, 7.198f, 9f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(9f, 16.802f, 9.448f, 17.25f, 10f, 17.25f)
            curveTo(10.552f, 17.25f, 11f, 16.802f, 11f, 16.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(14f, 6.75f)
            curveTo(14.552f, 6.75f, 15f, 7.198f, 15f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(15f, 16.802f, 14.552f, 17.25f, 14f, 17.25f)
            curveTo(13.448f, 17.25f, 13f, 16.802f, 13f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(13f, 7.198f, 13.448f, 6.75f, 14f, 6.75f)
            close()
            moveTo(19f, 7.75f)
            curveTo(19f, 7.198f, 18.552f, 6.75f, 18f, 6.75f)
            curveTo(17.448f, 6.75f, 17f, 7.198f, 17f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(17f, 16.802f, 17.448f, 17.25f, 18f, 17.25f)
            curveTo(18.552f, 17.25f, 19f, 16.802f, 19f, 16.25f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BarcodeScannerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BarcodeScanner, contentDescription = null)
    }
}
