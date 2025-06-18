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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Gif: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gif",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.75f, 3.5f)
            curveTo(20.545f, 3.5f, 22f, 4.955f, 22f, 6.75f)
            verticalLineTo(17.253f)
            curveTo(22f, 19.048f, 20.545f, 20.503f, 18.75f, 20.503f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20.503f, 2f, 19.048f, 2f, 17.253f)
            verticalLineTo(6.75f)
            curveTo(2f, 4.955f, 3.455f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(18.75f, 5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5f, 3.5f, 5.784f, 3.5f, 6.75f)
            verticalLineTo(17.253f)
            curveTo(3.5f, 18.219f, 4.284f, 19.003f, 5.25f, 19.003f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 19.003f, 20.5f, 18.219f, 20.5f, 17.253f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 5.784f, 19.716f, 5f, 18.75f, 5f)
            close()
            moveTo(8.015f, 8.871f)
            curveTo(8.611f, 8.871f, 9.034f, 8.953f, 9.517f, 9.185f)
            curveTo(9.828f, 9.334f, 9.959f, 9.708f, 9.81f, 10.019f)
            curveTo(9.66f, 10.33f, 9.287f, 10.461f, 8.976f, 10.312f)
            curveTo(8.676f, 10.168f, 8.436f, 10.121f, 8.015f, 10.121f)
            curveTo(7.148f, 10.121f, 6.511f, 10.918f, 6.511f, 11.994f)
            curveTo(6.511f, 13.071f, 7.149f, 13.87f, 8.015f, 13.87f)
            curveTo(8.443f, 13.87f, 8.806f, 13.69f, 8.995f, 13.369f)
            lineTo(9.001f, 13.354f)
            verticalLineTo(12.62f)
            lineTo(8.625f, 12.621f)
            curveTo(8.311f, 12.621f, 8.052f, 12.389f, 8.007f, 12.088f)
            lineTo(8f, 11.996f)
            curveTo(8f, 11.682f, 8.231f, 11.422f, 8.533f, 11.377f)
            lineTo(8.625f, 11.371f)
            horizontalLineTo(9.627f)
            curveTo(9.941f, 11.371f, 10.2f, 11.602f, 10.245f, 11.903f)
            lineTo(10.252f, 11.996f)
            lineTo(10.25f, 13.543f)
            lineTo(10.244f, 13.599f)
            lineTo(10.223f, 13.689f)
            lineTo(10.203f, 13.744f)
            curveTo(9.826f, 14.634f, 8.962f, 15.12f, 8.015f, 15.12f)
            curveTo(6.389f, 15.12f, 5.261f, 13.707f, 5.261f, 11.994f)
            curveTo(5.261f, 10.281f, 6.388f, 8.871f, 8.015f, 8.871f)
            close()
            moveTo(12.629f, 8.993f)
            curveTo(12.943f, 8.993f, 13.203f, 9.225f, 13.247f, 9.526f)
            lineTo(13.254f, 9.618f)
            verticalLineTo(14.38f)
            curveTo(13.254f, 14.726f, 12.974f, 15.005f, 12.629f, 15.005f)
            curveTo(12.315f, 15.005f, 12.055f, 14.774f, 12.011f, 14.473f)
            lineTo(12.004f, 14.38f)
            verticalLineTo(9.618f)
            curveTo(12.004f, 9.273f, 12.284f, 8.993f, 12.629f, 8.993f)
            close()
            moveTo(15.625f, 8.993f)
            lineTo(17.622f, 9f)
            curveTo(17.967f, 9.001f, 18.246f, 9.282f, 18.245f, 9.627f)
            curveTo(18.244f, 9.941f, 18.012f, 10.2f, 17.71f, 10.244f)
            lineTo(17.618f, 10.25f)
            lineTo(16.247f, 10.245f)
            verticalLineTo(11.999f)
            lineTo(17.37f, 12f)
            curveTo(17.684f, 12f, 17.944f, 12.231f, 17.988f, 12.533f)
            lineTo(17.995f, 12.625f)
            curveTo(17.995f, 12.939f, 17.764f, 13.198f, 17.462f, 13.243f)
            lineTo(17.37f, 13.25f)
            lineTo(16.247f, 13.249f)
            lineTo(16.248f, 14.364f)
            curveTo(16.248f, 14.678f, 16.016f, 14.938f, 15.715f, 14.983f)
            lineTo(15.623f, 14.989f)
            curveTo(15.309f, 14.989f, 15.049f, 14.758f, 15.004f, 14.457f)
            lineTo(14.998f, 14.364f)
            verticalLineTo(9.616f)
            curveTo(14.999f, 9.302f, 15.231f, 9.043f, 15.532f, 9f)
            lineTo(15.625f, 8.993f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GifPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Gif, contentDescription = null)
    }
}
