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

public val FluentUi.Regular.StarHalf: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarHalf",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.999f, 2.35f)
            curveTo(11.517f, 2.349f, 11.036f, 2.6f, 10.788f, 3.102f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
            lineTo(6.224f, 14.668f)
            lineTo(5.324f, 19.919f)
            curveTo(5.174f, 20.792f, 5.868f, 21.501f, 6.655f, 21.5f)
            curveTo(6.863f, 21.5f, 7.077f, 21.451f, 7.284f, 21.342f)
            lineTo(11.999f, 18.863f)
            lineTo(16.714f, 21.342f)
            curveTo(17.705f, 21.863f, 18.862f, 21.022f, 18.673f, 19.919f)
            lineTo(17.772f, 14.668f)
            lineTo(21.588f, 10.949f)
            curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
            lineTo(15.567f, 7.88f)
            lineTo(13.209f, 3.102f)
            curveTo(12.962f, 2.601f, 12.48f, 2.35f, 11.999f, 2.35f)
            curveTo(11.999f, 2.35f, 12f, 2.35f, 11.999f, 2.35f)
            close()
            moveTo(12f, 17.343f)
            verticalLineTo(4.042f)
            lineTo(14.257f, 8.614f)
            curveTo(14.453f, 9.013f, 14.833f, 9.289f, 15.273f, 9.353f)
            lineTo(20.323f, 10.087f)
            lineTo(16.669f, 13.649f)
            curveTo(16.351f, 13.959f, 16.206f, 14.406f, 16.281f, 14.844f)
            lineTo(17.143f, 19.873f)
            lineTo(12.627f, 17.498f)
            curveTo(12.431f, 17.395f, 12.215f, 17.344f, 12f, 17.343f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarHalfPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StarHalf, contentDescription = null)
    }
}
