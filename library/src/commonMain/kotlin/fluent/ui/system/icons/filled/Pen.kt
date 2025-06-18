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

public val FluentUi.Filled.Pen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.047f)
            curveTo(17.288f, 1.65f, 19.554f, 1.65f, 20.952f, 3.047f)
            curveTo(22.349f, 4.445f, 22.349f, 6.71f, 20.952f, 8.108f)
            lineTo(20.061f, 8.999f)
            curveTo(21.325f, 10.269f, 21.324f, 12.323f, 20.056f, 13.591f)
            lineTo(18.272f, 15.374f)
            curveTo(17.98f, 15.667f, 17.505f, 15.667f, 17.212f, 15.374f)
            curveTo(16.919f, 15.081f, 16.919f, 14.606f, 17.212f, 14.314f)
            lineTo(18.995f, 12.53f)
            curveTo(19.677f, 11.848f, 19.679f, 10.744f, 19f, 10.06f)
            lineTo(9.002f, 20.059f)
            curveTo(8.595f, 20.466f, 8.084f, 20.751f, 7.525f, 20.885f)
            lineTo(2.924f, 21.98f)
            curveTo(2.67f, 22.04f, 2.404f, 21.965f, 2.22f, 21.781f)
            curveTo(2.036f, 21.597f, 1.96f, 21.33f, 2.02f, 21.077f)
            lineTo(3.116f, 16.475f)
            curveTo(3.249f, 15.916f, 3.535f, 15.405f, 3.941f, 14.999f)
            lineTo(15.891f, 3.047f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Pen, contentDescription = null)
    }
}
