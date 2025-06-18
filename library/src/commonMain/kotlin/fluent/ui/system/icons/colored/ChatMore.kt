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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.ChatMore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ChatMore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1),
                ),
                start = Offset(2.714f, 5.751f),
                end = Offset(20.178f, 35.521f),
            ),
        ) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(10.36f, 22f, 8.775f, 21.604f, 7.356f, 20.858f)
            lineTo(3.065f, 21.975f)
            curveTo(2.611f, 22.094f, 2.147f, 21.821f, 2.029f, 21.367f)
            curveTo(1.992f, 21.227f, 1.992f, 21.079f, 2.029f, 20.939f)
            lineTo(3.145f, 16.65f)
            curveTo(2.397f, 15.229f, 2f, 13.643f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF),
                ),
                start = Offset(8.7f, 9.588f),
                end = Offset(9.227f, 15.025f),
            ),
        ) {
            moveTo(13.252f, 13f)
            horizontalLineTo(8.75f)
            lineTo(8.648f, 13.007f)
            curveTo(8.282f, 13.057f, 8f, 13.37f, 8f, 13.75f)
            curveTo(8f, 14.13f, 8.282f, 14.443f, 8.648f, 14.493f)
            lineTo(8.75f, 14.5f)
            horizontalLineTo(13.252f)
            lineTo(13.354f, 14.493f)
            curveTo(13.72f, 14.443f, 14.002f, 14.13f, 14.002f, 13.75f)
            curveTo(14.002f, 13.37f, 13.72f, 13.057f, 13.354f, 13.007f)
            lineTo(13.252f, 13f)
            close()
            moveTo(15.25f, 9.5f)
            horizontalLineTo(8.75f)
            lineTo(8.648f, 9.507f)
            curveTo(8.282f, 9.557f, 8f, 9.87f, 8f, 10.25f)
            curveTo(8f, 10.63f, 8.282f, 10.943f, 8.648f, 10.993f)
            lineTo(8.75f, 11f)
            horizontalLineTo(15.25f)
            lineTo(15.352f, 10.993f)
            curveTo(15.718f, 10.943f, 16f, 10.63f, 16f, 10.25f)
            curveTo(16f, 9.87f, 15.718f, 9.557f, 15.352f, 9.507f)
            lineTo(15.25f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ChatMore, contentDescription = null)
    }
}
