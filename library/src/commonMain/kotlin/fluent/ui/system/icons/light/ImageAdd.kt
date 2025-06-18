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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.ImageAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageAdd",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 16f)
            curveTo(4.358f, 16f, 1f, 12.642f, 1f, 8.5f)
            curveTo(1f, 4.358f, 4.358f, 1f, 8.5f, 1f)
            curveTo(12.642f, 1f, 16f, 4.358f, 16f, 8.5f)
            curveTo(16f, 12.642f, 12.642f, 16f, 8.5f, 16f)
            close()
            moveTo(9.5f, 3.75f)
            curveTo(9.5f, 3.336f, 9.164f, 3f, 8.75f, 3f)
            curveTo(8.336f, 3f, 8f, 3.336f, 8f, 3.75f)
            verticalLineTo(7.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 7.5f, 3.5f, 7.836f, 3.5f, 8.25f)
            curveTo(3.5f, 8.664f, 3.836f, 9f, 4.25f, 9f)
            horizontalLineTo(8f)
            verticalLineTo(12.75f)
            curveTo(8f, 13.164f, 8.336f, 13.5f, 8.75f, 13.5f)
            curveTo(9.164f, 13.5f, 9.5f, 13.164f, 9.5f, 12.75f)
            verticalLineTo(9f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 9f, 14f, 8.664f, 14f, 8.25f)
            curveTo(14f, 7.836f, 13.664f, 7.5f, 13.25f, 7.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(3.75f)
            close()
            moveTo(4f, 16.296f)
            curveTo(4.321f, 16.482f, 4.655f, 16.648f, 5f, 16.794f)
            verticalLineTo(25.5f)
            curveTo(5f, 26.091f, 5.146f, 26.647f, 5.405f, 27.136f)
            lineTo(15.225f, 17.231f)
            curveTo(16.203f, 16.244f, 17.797f, 16.244f, 18.775f, 17.231f)
            lineTo(28.595f, 27.136f)
            curveTo(28.854f, 26.647f, 29f, 26.091f, 29f, 25.5f)
            verticalLineTo(8.5f)
            curveTo(29f, 6.567f, 27.433f, 5f, 25.5f, 5f)
            horizontalLineTo(16.794f)
            curveTo(16.648f, 4.655f, 16.482f, 4.321f, 16.296f, 4f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 4f, 30f, 6.015f, 30f, 8.5f)
            verticalLineTo(25.5f)
            curveTo(30f, 27.985f, 27.985f, 30f, 25.5f, 30f)
            horizontalLineTo(8.5f)
            curveTo(6.015f, 30f, 4f, 27.985f, 4f, 25.5f)
            verticalLineTo(16.296f)
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
private fun ImageAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ImageAdd, contentDescription = null)
    }
}
