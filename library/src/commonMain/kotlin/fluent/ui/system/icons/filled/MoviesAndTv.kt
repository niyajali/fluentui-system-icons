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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.MoviesAndTv: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoviesAndTv",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.729f, 3.875f)
            lineTo(19.78f, 4.035f)
            lineTo(20.331f, 5.957f)
            curveTo(20.436f, 6.322f, 20.251f, 6.702f, 19.913f, 6.85f)
            lineTo(19.817f, 6.885f)
            lineTo(9.09f, 9.96f)
            lineTo(20.249f, 9.961f)
            curveTo(20.629f, 9.961f, 20.943f, 10.243f, 20.992f, 10.609f)
            lineTo(20.999f, 10.711f)
            verticalLineTo(19.209f)
            curveTo(20.999f, 20.671f, 19.858f, 21.867f, 18.417f, 21.954f)
            lineTo(18.249f, 21.959f)
            horizontalLineTo(5.75f)
            curveTo(4.288f, 21.959f, 3.092f, 20.817f, 3.005f, 19.376f)
            lineTo(3f, 19.209f)
            lineTo(3f, 10.817f)
            lineTo(2.478f, 8.996f)
            curveTo(2.075f, 7.59f, 2.843f, 6.126f, 4.204f, 5.645f)
            lineTo(4.364f, 5.594f)
            lineTo(16.378f, 2.149f)
            curveTo(17.784f, 1.746f, 19.249f, 2.514f, 19.729f, 3.875f)
            close()
            moveTo(6.273f, 6.607f)
            lineTo(4.777f, 7.036f)
            curveTo(4.155f, 7.215f, 3.779f, 7.834f, 3.891f, 8.458f)
            lineTo(3.92f, 8.582f)
            lineTo(4.265f, 9.783f)
            lineTo(4.56f, 9.698f)
            lineTo(6.273f, 6.607f)
            close()
            moveTo(11.029f, 5.244f)
            lineTo(8.312f, 6.023f)
            lineTo(6.598f, 9.114f)
            lineTo(9.316f, 8.335f)
            lineTo(11.029f, 5.244f)
            close()
            moveTo(15.787f, 3.879f)
            lineTo(13.069f, 4.659f)
            lineTo(11.356f, 7.75f)
            lineTo(14.072f, 6.971f)
            lineTo(15.787f, 3.879f)
            close()
            moveTo(17.634f, 3.646f)
            lineTo(16.113f, 6.386f)
            lineTo(18.681f, 5.649f)
            lineTo(18.338f, 4.448f)
            curveTo(18.231f, 4.074f, 17.965f, 3.789f, 17.634f, 3.646f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoviesAndTvPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MoviesAndTv, contentDescription = null)
    }
}
