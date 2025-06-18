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

public val FluentUi.Filled.HistoryDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HistoryDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5f)
            curveTo(15.583f, 5f, 18.537f, 7.691f, 18.95f, 11.162f)
            curveTo(19.689f, 11.331f, 20.381f, 11.625f, 21f, 12.022f)
            lineTo(21f, 12f)
            curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
            curveTo(10.15f, 3f, 8.43f, 3.559f, 7f, 4.516f)
            verticalLineTo(4f)
            curveTo(7f, 3.448f, 6.552f, 3f, 6f, 3f)
            curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
            verticalLineTo(7f)
            curveTo(5f, 7.552f, 5.448f, 8f, 6f, 8f)
            horizontalLineTo(9f)
            curveTo(9.552f, 8f, 10f, 7.552f, 10f, 7f)
            curveTo(10f, 6.448f, 9.552f, 6f, 9f, 6f)
            horizontalLineTo(8.392f)
            curveTo(9.446f, 5.365f, 10.68f, 5f, 12f, 5f)
            close()
            moveTo(12.81f, 13f)
            curveTo(13.494f, 12.286f, 14.34f, 11.729f, 15.289f, 11.386f)
            curveTo(15.106f, 11.151f, 14.821f, 11f, 14.5f, 11f)
            horizontalLineTo(13f)
            verticalLineTo(8f)
            curveTo(13f, 7.448f, 12.552f, 7f, 12f, 7f)
            curveTo(11.448f, 7f, 11f, 7.448f, 11f, 8f)
            verticalLineTo(12f)
            curveTo(11f, 12.552f, 11.448f, 13f, 12f, 13f)
            horizontalLineTo(12.81f)
            close()
            moveTo(12.022f, 21f)
            curveTo(11.625f, 20.381f, 11.331f, 19.689f, 11.162f, 18.95f)
            curveTo(7.691f, 18.537f, 5f, 15.583f, 5f, 12f)
            curveTo(5f, 11.703f, 5.018f, 11.41f, 5.054f, 11.124f)
            curveTo(5.123f, 10.576f, 4.734f, 10.076f, 4.186f, 10.008f)
            curveTo(3.638f, 9.939f, 3.138f, 10.328f, 3.07f, 10.876f)
            curveTo(3.024f, 11.245f, 3f, 11.62f, 3f, 12f)
            curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
            lineTo(12.022f, 21f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(15.854f, 15.146f)
            curveTo(15.658f, 14.951f, 15.342f, 14.951f, 15.146f, 15.146f)
            curveTo(14.951f, 15.342f, 14.951f, 15.658f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.146f)
            curveTo(14.951f, 19.342f, 14.951f, 19.658f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.207f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.658f, 20.049f, 19.342f, 19.854f, 19.146f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.658f, 20.049f, 15.342f, 19.854f, 15.146f)
            curveTo(19.658f, 14.951f, 19.342f, 14.951f, 19.146f, 15.146f)
            lineTo(17.5f, 16.793f)
            lineTo(15.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HistoryDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HistoryDismiss, contentDescription = null)
    }
}
