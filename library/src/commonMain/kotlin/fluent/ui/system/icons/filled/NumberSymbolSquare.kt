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

public val FluentUi.Filled.NumberSymbolSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberSymbolSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.436f, 11f)
            lineTo(13.035f, 13f)
            horizontalLineTo(10.565f)
            lineTo(10.965f, 11f)
            horizontalLineTo(13.436f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(10.898f, 7.515f)
            curveTo(11.304f, 7.596f, 11.567f, 7.991f, 11.486f, 8.397f)
            lineTo(11.266f, 9.5f)
            horizontalLineTo(13.736f)
            lineTo(14.015f, 8.103f)
            curveTo(14.097f, 7.697f, 14.492f, 7.433f, 14.898f, 7.515f)
            curveTo(15.304f, 7.596f, 15.567f, 7.991f, 15.486f, 8.397f)
            lineTo(15.266f, 9.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 9.5f, 17f, 9.836f, 17f, 10.25f)
            curveTo(17f, 10.664f, 16.664f, 11f, 16.25f, 11f)
            horizontalLineTo(14.965f)
            lineTo(14.565f, 13f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 13f, 16.5f, 13.336f, 16.5f, 13.75f)
            curveTo(16.5f, 14.164f, 16.164f, 14.5f, 15.75f, 14.5f)
            horizontalLineTo(14.265f)
            lineTo(13.986f, 15.898f)
            curveTo(13.904f, 16.304f, 13.509f, 16.567f, 13.103f, 16.486f)
            curveTo(12.697f, 16.404f, 12.434f, 16.009f, 12.515f, 15.603f)
            lineTo(12.735f, 14.5f)
            horizontalLineTo(10.265f)
            lineTo(9.986f, 15.898f)
            curveTo(9.904f, 16.304f, 9.509f, 16.567f, 9.103f, 16.486f)
            curveTo(8.697f, 16.404f, 8.433f, 16.009f, 8.515f, 15.603f)
            lineTo(8.735f, 14.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 14.5f, 7f, 14.164f, 7f, 13.75f)
            curveTo(7f, 13.336f, 7.336f, 13f, 7.75f, 13f)
            horizontalLineTo(9.036f)
            lineTo(9.436f, 11f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 11f, 7.5f, 10.664f, 7.5f, 10.25f)
            curveTo(7.5f, 9.836f, 7.836f, 9.5f, 8.25f, 9.5f)
            horizontalLineTo(9.736f)
            lineTo(10.015f, 8.103f)
            curveTo(10.097f, 7.697f, 10.492f, 7.433f, 10.898f, 7.515f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberSymbolSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NumberSymbolSquare, contentDescription = null)
    }
}
