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

public val FluentUi.Filled.SurfaceEarbuds: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SurfaceEarbuds",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.109f, 17.24f)
            curveTo(10.48f, 19.311f, 11.761f, 21.066f, 13.524f, 22.077f)
            lineTo(11.051f, 22.898f)
            curveTo(10.177f, 23.188f, 9.219f, 22.844f, 8.729f, 22.066f)
            lineTo(8.298f, 21.382f)
            curveTo(7.816f, 20.617f, 7.907f, 19.622f, 8.522f, 18.958f)
            lineTo(10.109f, 17.24f)
            close()
            moveTo(17f, 10f)
            curveTo(20.314f, 10f, 23f, 12.686f, 23f, 16f)
            curveTo(23f, 19.313f, 20.314f, 22f, 17f, 22f)
            curveTo(13.686f, 22f, 11f, 19.313f, 11f, 16f)
            curveTo(11f, 12.686f, 13.686f, 10f, 17f, 10f)
            close()
            moveTo(7f, 1f)
            curveTo(7.214f, 1f, 7.425f, 1.011f, 7.634f, 1.033f)
            lineTo(7.283f, 1.148f)
            curveTo(6.896f, 1.255f, 6.483f, 1.44f, 6.099f, 1.685f)
            curveTo(3.995f, 3.03f, 3.367f, 5.821f, 4.7f, 7.921f)
            curveTo(6.034f, 10.023f, 8.825f, 10.632f, 10.932f, 9.286f)
            curveTo(11.276f, 9.066f, 11.587f, 8.802f, 11.865f, 8.503f)
            lineTo(12.993f, 7.293f)
            curveTo(12.84f, 10.47f, 10.215f, 13f, 7f, 13f)
            curveTo(3.686f, 13f, 1f, 10.313f, 1f, 7f)
            curveTo(1f, 3.686f, 3.686f, 1f, 7f, 1f)
            close()
            moveTo(12.797f, 1.648f)
            lineTo(12.904f, 1.779f)
            lineTo(12.995f, 1.911f)
            lineTo(13.643f, 2.932f)
            curveTo(14.101f, 3.652f, 14.048f, 4.577f, 13.529f, 5.238f)
            lineTo(13.418f, 5.367f)
            lineTo(11.13f, 7.824f)
            curveTo(10.917f, 8.054f, 10.672f, 8.265f, 10.393f, 8.443f)
            curveTo(8.752f, 9.492f, 6.581f, 9.019f, 5.544f, 7.385f)
            curveTo(4.507f, 5.752f, 4.997f, 3.577f, 6.638f, 2.527f)
            curveTo(6.943f, 2.333f, 7.265f, 2.19f, 7.596f, 2.098f)
            lineTo(10.681f, 1.083f)
            curveTo(11.445f, 0.831f, 12.274f, 1.064f, 12.797f, 1.648f)
            close()
            moveTo(10.351f, 3.059f)
            curveTo(10.038f, 3.269f, 9.933f, 3.673f, 10.09f, 4.003f)
            lineTo(10.145f, 4.1f)
            lineTo(10.406f, 4.49f)
            lineTo(10.475f, 4.577f)
            curveTo(10.72f, 4.848f, 11.134f, 4.905f, 11.447f, 4.696f)
            curveTo(11.76f, 4.486f, 11.864f, 4.082f, 11.708f, 3.752f)
            lineTo(11.653f, 3.655f)
            lineTo(11.392f, 3.265f)
            lineTo(11.323f, 3.178f)
            curveTo(11.077f, 2.907f, 10.664f, 2.85f, 10.351f, 3.059f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SurfaceEarbudsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SurfaceEarbuds, contentDescription = null)
    }
}
