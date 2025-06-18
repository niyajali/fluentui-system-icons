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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.DataTrending: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DataTrending",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445f to Color(0xFF9C6CFE),
                    0.957f to Color(0xFFE656EB)
                ),
                start = Offset(5.423f, 14.5f),
                end = Offset(24.458f, 7.097f)
            )
        ) {
            moveTo(15f, 6f)
            curveTo(14.448f, 6f, 14f, 6.448f, 14f, 7f)
            curveTo(14f, 7.552f, 14.448f, 8f, 15f, 8f)
            horizontalLineTo(17.086f)
            lineTo(13.25f, 11.836f)
            lineTo(11.457f, 10.043f)
            curveTo(11.067f, 9.652f, 10.433f, 9.652f, 10.043f, 10.043f)
            lineTo(6.793f, 13.293f)
            curveTo(6.402f, 13.683f, 6.402f, 14.317f, 6.793f, 14.707f)
            curveTo(7.183f, 15.098f, 7.817f, 15.098f, 8.207f, 14.707f)
            lineTo(10.75f, 12.164f)
            lineTo(12.543f, 13.957f)
            curveTo(12.933f, 14.348f, 13.567f, 14.348f, 13.957f, 13.957f)
            lineTo(18.501f, 9.414f)
            lineTo(18.5f, 11.5f)
            curveTo(18.5f, 12.052f, 18.947f, 12.5f, 19.5f, 12.5f)
            curveTo(20.052f, 12.5f, 20.5f, 12.053f, 20.5f, 11.5f)
            lineTo(20.501f, 7f)
            curveTo(20.502f, 6.735f, 20.396f, 6.481f, 20.209f, 6.293f)
            curveTo(20.021f, 6.105f, 19.767f, 6f, 19.501f, 6f)
            horizontalLineTo(15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(19.313f, 4.125f),
                end = Offset(3.56f, 27.58f)
            )
        ) {
            moveTo(5f, 4f)
            curveTo(5f, 3.448f, 4.552f, 3f, 4f, 3f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            verticalLineTo(17.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            horizontalLineTo(20f)
            curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
            curveTo(21f, 19.448f, 20.552f, 19f, 20f, 19f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataTrendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.DataTrending, contentDescription = null)
    }
}
