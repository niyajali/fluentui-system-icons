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

public val FluentUi.Filled.TextFontSize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFontSize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.97f, 16.168f)
            lineTo(14.56f, 3.657f)
            curveTo(14.866f, 2.822f, 16.007f, 2.784f, 16.389f, 3.543f)
            lineTo(16.438f, 3.657f)
            lineTo(21.939f, 18.653f)
            curveTo(22.129f, 19.172f, 21.863f, 19.746f, 21.345f, 19.937f)
            curveTo(20.863f, 20.113f, 20.334f, 19.896f, 20.108f, 19.449f)
            lineTo(20.062f, 19.342f)
            lineTo(18.651f, 15.499f)
            horizontalLineTo(12.346f)
            lineTo(10.904f, 19.419f)
            lineTo(10.863f, 19.498f)
            lineTo(10.791f, 19.606f)
            lineTo(10.714f, 19.696f)
            lineTo(10.629f, 19.773f)
            lineTo(10.546f, 19.834f)
            lineTo(10.496f, 19.865f)
            lineTo(10.412f, 19.908f)
            lineTo(10.308f, 19.948f)
            lineTo(10.203f, 19.976f)
            lineTo(10.07f, 19.995f)
            lineTo(9.963f, 19.997f)
            lineTo(9.892f, 19.992f)
            lineTo(9.789f, 19.976f)
            lineTo(9.639f, 19.931f)
            lineTo(9.57f, 19.902f)
            lineTo(9.47f, 19.847f)
            lineTo(9.359f, 19.767f)
            lineTo(9.267f, 19.681f)
            lineTo(9.203f, 19.605f)
            lineTo(9.142f, 19.515f)
            lineTo(9.088f, 19.413f)
            lineTo(8.342f, 17.5f)
            horizontalLineTo(4.655f)
            lineTo(3.932f, 19.36f)
            curveTo(3.746f, 19.838f, 3.233f, 20.092f, 2.749f, 19.966f)
            lineTo(2.638f, 19.93f)
            curveTo(2.16f, 19.744f, 1.906f, 19.231f, 2.032f, 18.746f)
            lineTo(2.068f, 18.635f)
            lineTo(5.567f, 9.639f)
            curveTo(5.882f, 8.829f, 6.988f, 8.791f, 7.378f, 9.523f)
            lineTo(7.431f, 9.639f)
            lineTo(9.97f, 16.168f)
            lineTo(14.56f, 3.657f)
            lineTo(9.97f, 16.168f)
            close()
            moveTo(6.499f, 12.76f)
            lineTo(5.433f, 15.5f)
            horizontalLineTo(7.564f)
            lineTo(6.499f, 12.76f)
            close()
            moveTo(15.499f, 6.905f)
            lineTo(13.079f, 13.499f)
            horizontalLineTo(17.917f)
            lineTo(15.499f, 6.905f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextFontSizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextFontSize, contentDescription = null)
    }
}
