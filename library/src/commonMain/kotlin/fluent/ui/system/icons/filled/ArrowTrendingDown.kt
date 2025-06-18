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

public val FluentUi.Filled.ArrowTrendingDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrendingDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.003f, 18.999f)
            horizontalLineTo(21f)
            curveTo(21.513f, 18.999f, 21.935f, 18.612f, 21.993f, 18.115f)
            lineTo(22f, 17.999f)
            verticalLineTo(10.998f)
            curveTo(22f, 10.446f, 21.552f, 9.998f, 21f, 9.998f)
            curveTo(20.487f, 9.998f, 20.064f, 10.384f, 20.007f, 10.882f)
            lineTo(20f, 10.998f)
            lineTo(19.999f, 15.585f)
            lineTo(12.707f, 8.291f)
            curveTo(12.347f, 7.931f, 11.78f, 7.903f, 11.387f, 8.208f)
            lineTo(11.293f, 8.291f)
            lineTo(8.997f, 10.583f)
            lineTo(3.709f, 5.293f)
            curveTo(3.319f, 4.902f, 2.686f, 4.902f, 2.295f, 5.293f)
            curveTo(1.934f, 5.653f, 1.907f, 6.22f, 2.212f, 6.613f)
            lineTo(2.295f, 6.707f)
            lineTo(8.289f, 12.703f)
            curveTo(8.65f, 13.064f, 9.216f, 13.092f, 9.609f, 12.787f)
            lineTo(9.703f, 12.704f)
            lineTo(11.999f, 10.412f)
            lineTo(18.584f, 16.999f)
            horizontalLineTo(14.003f)
            curveTo(13.49f, 16.999f, 13.068f, 17.385f, 13.01f, 17.882f)
            lineTo(13.003f, 17.999f)
            curveTo(13.003f, 18.511f, 13.389f, 18.934f, 13.886f, 18.992f)
            lineTo(14.003f, 18.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowTrendingDown, contentDescription = null)
    }
}
