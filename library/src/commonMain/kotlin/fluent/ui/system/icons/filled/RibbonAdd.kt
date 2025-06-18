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

public val FluentUi.Filled.RibbonAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.501f)
            curveTo(23f, 3.463f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.463f, 12f, 6.501f)
            curveTo(12f, 9.539f, 14.462f, 12.002f, 17.5f, 12.002f)
            curveTo(20.538f, 12.002f, 23f, 9.539f, 23f, 6.501f)
            close()
            moveTo(18.001f, 7.001f)
            lineTo(18.001f, 9.505f)
            curveTo(18.001f, 9.781f, 17.777f, 10.005f, 17.501f, 10.005f)
            curveTo(17.225f, 10.005f, 17.001f, 9.781f, 17.001f, 9.505f)
            lineTo(17.001f, 7.001f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 7.001f, 13.996f, 6.777f, 13.996f, 6.501f)
            curveTo(13.996f, 6.225f, 14.22f, 6.001f, 14.496f, 6.001f)
            horizontalLineTo(17f)
            lineTo(17f, 3.5f)
            curveTo(17f, 3.224f, 17.224f, 3f, 17.5f, 3f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            lineTo(18f, 6.001f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 6.001f, 20.996f, 6.225f, 20.996f, 6.501f)
            curveTo(20.996f, 6.777f, 20.772f, 7.001f, 20.497f, 7.001f)
            horizontalLineTo(18.001f)
            close()
            moveTo(11f, 6.501f)
            curveTo(11f, 4.848f, 11.617f, 3.339f, 12.633f, 2.192f)
            curveTo(12.109f, 2.066f, 11.562f, 2f, 11f, 2f)
            curveTo(7.134f, 2f, 4f, 5.135f, 4f, 9.001f)
            curveTo(4f, 12.868f, 7.134f, 16.003f, 11f, 16.003f)
            curveTo(13.396f, 16.003f, 15.511f, 14.798f, 16.773f, 12.962f)
            curveTo(13.525f, 12.6f, 11f, 9.846f, 11f, 6.501f)
            close()
            moveTo(16.002f, 15.247f)
            lineTo(16.001f, 21.249f)
            curveTo(16.001f, 21.856f, 15.316f, 22.212f, 14.819f, 21.862f)
            lineTo(11.001f, 19.174f)
            lineTo(7.184f, 21.862f)
            curveTo(6.687f, 22.212f, 6.003f, 21.856f, 6.003f, 21.249f)
            lineTo(6.001f, 15.248f)
            curveTo(7.37f, 16.346f, 9.108f, 17.003f, 11f, 17.003f)
            curveTo(12.893f, 17.003f, 14.632f, 16.345f, 16.002f, 15.247f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RibbonAdd, contentDescription = null)
    }
}
