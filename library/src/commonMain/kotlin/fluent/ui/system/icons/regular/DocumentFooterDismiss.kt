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

public val FluentUi.Regular.DocumentFooterDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentFooterDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23.001f, 6.5f)
            curveTo(23.001f, 9.538f, 20.538f, 12f, 17.501f, 12f)
            curveTo(14.463f, 12f, 12.001f, 9.538f, 12.001f, 6.5f)
            curveTo(12.001f, 3.462f, 14.463f, 1f, 17.501f, 1f)
            curveTo(20.538f, 1f, 23.001f, 3.462f, 23.001f, 6.5f)
            close()
            moveTo(15.854f, 4.146f)
            curveTo(15.659f, 3.951f, 15.343f, 3.951f, 15.147f, 4.146f)
            curveTo(14.952f, 4.342f, 14.952f, 4.658f, 15.147f, 4.854f)
            lineTo(16.794f, 6.5f)
            lineTo(15.147f, 8.146f)
            curveTo(14.952f, 8.342f, 14.952f, 8.658f, 15.147f, 8.854f)
            curveTo(15.343f, 9.049f, 15.659f, 9.049f, 15.854f, 8.854f)
            lineTo(17.501f, 7.207f)
            lineTo(19.147f, 8.854f)
            curveTo(19.343f, 9.049f, 19.659f, 9.049f, 19.854f, 8.854f)
            curveTo(20.05f, 8.658f, 20.05f, 8.342f, 19.854f, 8.146f)
            lineTo(18.208f, 6.5f)
            lineTo(19.854f, 4.854f)
            curveTo(20.05f, 4.658f, 20.05f, 4.342f, 19.854f, 4.146f)
            curveTo(19.659f, 3.951f, 19.343f, 3.951f, 19.147f, 4.146f)
            lineTo(17.501f, 5.793f)
            lineTo(15.854f, 4.146f)
            close()
            moveTo(18.496f, 19.744f)
            verticalLineTo(12.924f)
            curveTo(19.019f, 12.844f, 19.522f, 12.701f, 19.996f, 12.504f)
            verticalLineTo(19.744f)
            curveTo(19.996f, 20.935f, 19.071f, 21.91f, 17.9f, 21.989f)
            lineTo(17.746f, 21.994f)
            horizontalLineTo(6.246f)
            curveTo(5.055f, 21.994f, 4.08f, 21.069f, 4.001f, 19.898f)
            lineTo(3.996f, 19.744f)
            verticalLineTo(4.246f)
            curveTo(3.996f, 3.055f, 4.921f, 2.08f, 6.092f, 2.001f)
            lineTo(6.246f, 1.996f)
            horizontalLineTo(12.815f)
            curveTo(12.388f, 2.44f, 12.023f, 2.945f, 11.736f, 3.496f)
            horizontalLineTo(6.246f)
            curveTo(5.866f, 3.496f, 5.553f, 3.778f, 5.503f, 4.144f)
            lineTo(5.496f, 4.246f)
            verticalLineTo(19.744f)
            curveTo(5.496f, 20.124f, 5.778f, 20.437f, 6.144f, 20.487f)
            lineTo(6.246f, 20.494f)
            horizontalLineTo(17.746f)
            curveTo(18.126f, 20.494f, 18.44f, 20.212f, 18.489f, 19.846f)
            lineTo(18.496f, 19.744f)
            close()
            moveTo(8.501f, 16f)
            curveTo(7.673f, 16f, 7.001f, 16.672f, 7.001f, 17.5f)
            curveTo(7.001f, 18.328f, 7.673f, 19f, 8.501f, 19f)
            horizontalLineTo(15.501f)
            curveTo(16.33f, 19f, 17.001f, 18.328f, 17.001f, 17.5f)
            curveTo(17.001f, 16.672f, 16.33f, 16f, 15.501f, 16f)
            horizontalLineTo(8.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFooterDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentFooterDismiss, contentDescription = null)
    }
}
