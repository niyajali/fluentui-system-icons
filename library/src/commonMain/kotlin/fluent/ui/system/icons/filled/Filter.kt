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

public val FluentUi.Filled.Filter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 16f)
            horizontalLineTo(14f)
            curveTo(14.552f, 16f, 15f, 16.448f, 15f, 17f)
            curveTo(15f, 17.513f, 14.614f, 17.935f, 14.117f, 17.993f)
            lineTo(14f, 18f)
            horizontalLineTo(10f)
            curveTo(9.448f, 18f, 9f, 17.552f, 9f, 17f)
            curveTo(9f, 16.487f, 9.386f, 16.065f, 9.883f, 16.007f)
            lineTo(10f, 16f)
            horizontalLineTo(14f)
            horizontalLineTo(10f)
            close()
            moveTo(8f, 11f)
            horizontalLineTo(16f)
            curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
            curveTo(17f, 12.513f, 16.614f, 12.936f, 16.117f, 12.993f)
            lineTo(16f, 13f)
            horizontalLineTo(8f)
            curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
            curveTo(7f, 11.487f, 7.386f, 11.064f, 7.883f, 11.007f)
            lineTo(8f, 11f)
            horizontalLineTo(16f)
            horizontalLineTo(8f)
            close()
            moveTo(5f, 6f)
            horizontalLineTo(19f)
            curveTo(19.552f, 6f, 20f, 6.448f, 20f, 7f)
            curveTo(20f, 7.513f, 19.614f, 7.936f, 19.117f, 7.993f)
            lineTo(19f, 8f)
            horizontalLineTo(5f)
            curveTo(4.448f, 8f, 4f, 7.552f, 4f, 7f)
            curveTo(4f, 6.487f, 4.386f, 6.064f, 4.883f, 6.007f)
            lineTo(5f, 6f)
            horizontalLineTo(19f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Filter, contentDescription = null)
    }
}
