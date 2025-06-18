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

public val FluentUi.Filled.TextHeader6: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader6",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 4.5f)
            curveTo(19.043f, 4.5f, 20.293f, 5.132f, 21.198f, 6.168f)
            lineTo(21.375f, 6.381f)
            lineTo(21.435f, 6.464f)
            curveTo(21.707f, 6.891f, 21.615f, 7.464f, 21.209f, 7.785f)
            curveTo(20.802f, 8.106f, 20.225f, 8.06f, 19.872f, 7.696f)
            lineTo(19.805f, 7.619f)
            lineTo(19.697f, 7.489f)
            curveTo(19.149f, 6.858f, 18.434f, 6.5f, 17.5f, 6.5f)
            curveTo(16.381f, 6.5f, 15.557f, 7.017f, 14.968f, 7.941f)
            curveTo(14.496f, 8.682f, 14.179f, 9.69f, 14.057f, 10.876f)
            curveTo(14.953f, 10.024f, 16.165f, 9.5f, 17.5f, 9.5f)
            curveTo(20.261f, 9.5f, 22.5f, 11.739f, 22.5f, 14.5f)
            curveTo(22.5f, 17.261f, 20.261f, 19.5f, 17.5f, 19.5f)
            curveTo(17.406f, 19.5f, 17.313f, 19.496f, 17.22f, 19.491f)
            curveTo(17.144f, 19.487f, 17.069f, 19.481f, 16.995f, 19.475f)
            curveTo(16.992f, 19.474f, 16.989f, 19.474f, 16.985f, 19.474f)
            curveTo(15.525f, 19.34f, 14.379f, 18.639f, 13.564f, 17.582f)
            curveTo(13.427f, 17.406f, 13.3f, 17.221f, 13.186f, 17.027f)
            curveTo(12.356f, 15.649f, 12f, 13.859f, 12f, 12f)
            curveTo(12f, 10.086f, 12.396f, 8.254f, 13.28f, 6.866f)
            curveTo(14.191f, 5.438f, 15.616f, 4.5f, 17.5f, 4.5f)
            close()
            moveTo(10f, 5f)
            curveTo(10.552f, 5f, 11f, 5.448f, 11f, 6f)
            verticalLineTo(18f)
            curveTo(11f, 18.552f, 10.552f, 19f, 10f, 19f)
            curveTo(9.448f, 19f, 9f, 18.552f, 9f, 18f)
            verticalLineTo(13f)
            horizontalLineTo(3f)
            verticalLineTo(18f)
            curveTo(3f, 18.552f, 2.552f, 19f, 2f, 19f)
            curveTo(1.448f, 19f, 1f, 18.552f, 1f, 18f)
            verticalLineTo(6f)
            curveTo(1f, 5.448f, 1.448f, 5f, 2f, 5f)
            curveTo(2.552f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineTo(11f)
            horizontalLineTo(9f)
            verticalLineTo(6f)
            curveTo(9f, 5.448f, 9.448f, 5f, 10f, 5f)
            close()
            moveTo(17.5f, 11.5f)
            curveTo(15.843f, 11.5f, 14.5f, 12.843f, 14.5f, 14.5f)
            curveTo(14.5f, 15.109f, 14.682f, 15.674f, 14.994f, 16.147f)
            curveTo(15.005f, 16.164f, 15.015f, 16.18f, 15.026f, 16.196f)
            curveTo(15.539f, 16.942f, 16.378f, 17.444f, 17.339f, 17.495f)
            curveTo(17.392f, 17.497f, 17.445f, 17.5f, 17.5f, 17.5f)
            curveTo(19.157f, 17.5f, 20.5f, 16.157f, 20.5f, 14.5f)
            curveTo(20.5f, 12.843f, 19.157f, 11.5f, 17.5f, 11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader6Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader6, contentDescription = null)
    }
}
