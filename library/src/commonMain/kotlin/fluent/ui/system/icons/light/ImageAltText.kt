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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.ImageAltText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageAltText",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 1f)
            curveTo(2.119f, 1f, 1f, 2.119f, 1f, 3.5f)
            verticalLineTo(12.5f)
            curveTo(1f, 13.881f, 2.119f, 15f, 3.5f, 15f)
            horizontalLineTo(13.5f)
            curveTo(14.881f, 15f, 16f, 13.881f, 16f, 12.5f)
            verticalLineTo(3.5f)
            curveTo(16f, 2.119f, 14.881f, 1f, 13.5f, 1f)
            horizontalLineTo(3.5f)
            close()
            moveTo(4.25f, 6.5f)
            curveTo(3.836f, 6.5f, 3.5f, 6.164f, 3.5f, 5.75f)
            curveTo(3.5f, 5.336f, 3.836f, 5f, 4.25f, 5f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 5f, 13.5f, 5.336f, 13.5f, 5.75f)
            curveTo(13.5f, 6.164f, 13.164f, 6.5f, 12.75f, 6.5f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 10.25f)
            curveTo(3.5f, 9.836f, 3.836f, 9.5f, 4.25f, 9.5f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 9.5f, 13.5f, 9.836f, 13.5f, 10.25f)
            curveTo(13.5f, 10.664f, 13.164f, 11f, 12.75f, 11f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 11f, 3.5f, 10.664f, 3.5f, 10.25f)
            close()
            moveTo(4f, 25.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(5f)
            verticalLineTo(25.5f)
            curveTo(5f, 26.091f, 5.146f, 26.647f, 5.405f, 27.136f)
            lineTo(15.225f, 17.231f)
            curveTo(16.203f, 16.244f, 17.797f, 16.244f, 18.775f, 17.231f)
            lineTo(28.595f, 27.136f)
            curveTo(28.854f, 26.647f, 29f, 26.091f, 29f, 25.5f)
            verticalLineTo(8.5f)
            curveTo(29f, 6.567f, 27.433f, 5f, 25.5f, 5f)
            horizontalLineTo(17.5f)
            verticalLineTo(4f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 4f, 30f, 6.015f, 30f, 8.5f)
            verticalLineTo(25.5f)
            curveTo(30f, 27.985f, 27.985f, 30f, 25.5f, 30f)
            horizontalLineTo(8.5f)
            curveTo(6.015f, 30f, 4f, 27.985f, 4f, 25.5f)
            close()
            moveTo(8.5f, 29f)
            horizontalLineTo(25.5f)
            curveTo(26.478f, 29f, 27.362f, 28.599f, 27.997f, 27.953f)
            lineTo(18.065f, 17.935f)
            curveTo(17.478f, 17.343f, 16.522f, 17.343f, 15.935f, 17.935f)
            lineTo(6.003f, 27.953f)
            curveTo(6.638f, 28.599f, 7.522f, 29f, 8.5f, 29f)
            close()
            moveTo(26f, 12f)
            curveTo(26f, 13.933f, 24.433f, 15.5f, 22.5f, 15.5f)
            curveTo(20.567f, 15.5f, 19f, 13.933f, 19f, 12f)
            curveTo(19f, 10.067f, 20.567f, 8.5f, 22.5f, 8.5f)
            curveTo(24.433f, 8.5f, 26f, 10.067f, 26f, 12f)
            close()
            moveTo(25f, 12f)
            curveTo(25f, 10.619f, 23.881f, 9.5f, 22.5f, 9.5f)
            curveTo(21.119f, 9.5f, 20f, 10.619f, 20f, 12f)
            curveTo(20f, 13.381f, 21.119f, 14.5f, 22.5f, 14.5f)
            curveTo(23.881f, 14.5f, 25f, 13.381f, 25f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageAltTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ImageAltText, contentDescription = null)
    }
}
