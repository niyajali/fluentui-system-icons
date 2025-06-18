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

public val FluentUi.Regular.DocumentDataLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentDataLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 11f)
            curveTo(9.164f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            verticalLineTo(14.666f)
            curveTo(9.102f, 14.558f, 8.683f, 14.5f, 8.25f, 14.5f)
            horizontalLineTo(8f)
            verticalLineTo(11.75f)
            curveTo(8f, 11.336f, 8.336f, 11f, 8.75f, 11f)
            close()
            moveTo(5.5f, 14.5f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(12.834f)
            curveTo(12.686f, 21.045f, 12.442f, 21.552f, 12.123f, 22f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(18.241f, 7.241f)
            curveTo(18.234f, 7.234f, 18.227f, 7.227f, 18.22f, 7.22f)
            lineTo(13.367f, 2.366f)
            curveTo(13.132f, 2.132f, 12.814f, 2f, 12.483f, 2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
            verticalLineTo(14.559f)
            curveTo(4.244f, 14.52f, 4.495f, 14.5f, 4.75f, 14.5f)
            horizontalLineTo(5.5f)
            close()
            moveTo(12.75f, 17.725f)
            verticalLineTo(14.75f)
            curveTo(12.75f, 14.336f, 12.414f, 14f, 12f, 14f)
            curveTo(11.586f, 14f, 11.25f, 14.336f, 11.25f, 14.75f)
            verticalLineTo(15.567f)
            curveTo(11.935f, 16.125f, 12.461f, 16.871f, 12.75f, 17.725f)
            close()
            moveTo(15.25f, 12f)
            curveTo(15.664f, 12f, 16f, 12.336f, 16f, 12.75f)
            verticalLineTo(18.25f)
            curveTo(16f, 18.664f, 15.664f, 19f, 15.25f, 19f)
            curveTo(14.836f, 19f, 14.5f, 18.664f, 14.5f, 18.25f)
            verticalLineTo(12.75f)
            curveTo(14.5f, 12.336f, 14.836f, 12f, 15.25f, 12f)
            close()
            moveTo(13.5f, 4.621f)
            lineTo(17.378f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
            verticalLineTo(4.621f)
            close()
            moveTo(8.25f, 15.5f)
            curveTo(10.321f, 15.5f, 12f, 17.179f, 12f, 19.25f)
            curveTo(12f, 21.254f, 10.428f, 22.891f, 8.452f, 22.995f)
            lineTo(8.253f, 23f)
            verticalLineTo(23.005f)
            curveTo(7.839f, 23.007f, 7.502f, 22.672f, 7.5f, 22.258f)
            curveTo(7.498f, 21.878f, 7.779f, 21.563f, 8.145f, 21.512f)
            lineTo(8.247f, 21.505f)
            lineTo(8.25f, 21.5f)
            curveTo(9.493f, 21.5f, 10.5f, 20.493f, 10.5f, 19.25f)
            curveTo(10.5f, 18.059f, 9.575f, 17.084f, 8.404f, 17.005f)
            lineTo(8.25f, 17f)
            curveTo(7.836f, 17f, 7.5f, 16.664f, 7.5f, 16.25f)
            curveTo(7.5f, 15.87f, 7.782f, 15.557f, 8.148f, 15.507f)
            lineTo(8.25f, 15.5f)
            close()
            moveTo(4.75f, 15.5f)
            curveTo(5.164f, 15.5f, 5.5f, 15.836f, 5.5f, 16.25f)
            curveTo(5.5f, 16.63f, 5.218f, 16.944f, 4.852f, 16.993f)
            lineTo(4.75f, 17f)
            curveTo(3.507f, 17f, 2.5f, 18.007f, 2.5f, 19.25f)
            curveTo(2.5f, 20.441f, 3.425f, 21.416f, 4.596f, 21.495f)
            lineTo(4.75f, 21.5f)
            curveTo(5.164f, 21.5f, 5.5f, 21.836f, 5.5f, 22.25f)
            curveTo(5.5f, 22.63f, 5.218f, 22.944f, 4.852f, 22.993f)
            lineTo(4.75f, 23f)
            curveTo(2.679f, 23f, 1f, 21.321f, 1f, 19.25f)
            curveTo(1f, 17.246f, 2.572f, 15.609f, 4.551f, 15.505f)
            lineTo(4.75f, 15.5f)
            close()
            moveTo(8.25f, 18.5f)
            curveTo(8.664f, 18.5f, 9f, 18.836f, 9f, 19.25f)
            curveTo(9f, 19.63f, 8.718f, 19.944f, 8.352f, 19.993f)
            lineTo(8.25f, 20f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 20f, 4f, 19.664f, 4f, 19.25f)
            curveTo(4f, 18.87f, 4.282f, 18.556f, 4.648f, 18.507f)
            lineTo(4.75f, 18.5f)
            horizontalLineTo(8.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentDataLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentDataLink, contentDescription = null)
    }
}
