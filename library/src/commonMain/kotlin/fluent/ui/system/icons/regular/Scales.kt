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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Scales: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Scales",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            curveTo(21f, 4.164f, 20.664f, 4.5f, 20.25f, 4.5f)
            horizontalLineTo(19.208f)
            lineTo(21.945f, 11.217f)
            curveTo(21.981f, 11.307f, 22f, 11.403f, 22f, 11.5f)
            curveTo(22f, 13.433f, 20.433f, 15f, 18.5f, 15f)
            curveTo(16.567f, 15f, 15f, 13.433f, 15f, 11.5f)
            curveTo(15f, 11.403f, 15.019f, 11.307f, 15.055f, 11.217f)
            lineTo(17.792f, 4.5f)
            horizontalLineTo(12.75f)
            lineTo(12.75f, 16.5f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 16.5f, 19f, 17.507f, 19f, 18.75f)
            curveTo(19f, 19.993f, 17.993f, 21f, 16.75f, 21f)
            horizontalLineTo(7.253f)
            curveTo(6.01f, 21f, 5.003f, 19.993f, 5.003f, 18.75f)
            curveTo(5.003f, 17.507f, 6.01f, 16.5f, 7.253f, 16.5f)
            horizontalLineTo(11.25f)
            lineTo(11.25f, 4.5f)
            horizontalLineTo(6.208f)
            lineTo(8.945f, 11.217f)
            curveTo(8.981f, 11.307f, 9f, 11.403f, 9f, 11.5f)
            curveTo(9f, 13.433f, 7.433f, 15f, 5.5f, 15f)
            curveTo(3.567f, 15f, 2f, 13.433f, 2f, 11.5f)
            curveTo(2f, 11.403f, 2.019f, 11.307f, 2.055f, 11.217f)
            lineTo(4.792f, 4.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
            close()
            moveTo(6.503f, 18.75f)
            curveTo(6.503f, 19.164f, 6.839f, 19.5f, 7.253f, 19.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 19.5f, 17.5f, 19.164f, 17.5f, 18.75f)
            curveTo(17.5f, 18.336f, 17.164f, 18f, 16.75f, 18f)
            horizontalLineTo(7.253f)
            curveTo(6.839f, 18f, 6.503f, 18.336f, 6.503f, 18.75f)
            close()
            moveTo(7.355f, 12.25f)
            horizontalLineTo(3.645f)
            curveTo(3.942f, 12.983f, 4.661f, 13.5f, 5.5f, 13.5f)
            curveTo(6.339f, 13.5f, 7.058f, 12.983f, 7.355f, 12.25f)
            close()
            moveTo(7.135f, 10.75f)
            lineTo(5.5f, 6.738f)
            lineTo(3.865f, 10.75f)
            horizontalLineTo(7.135f)
            close()
            moveTo(18.5f, 13.5f)
            curveTo(19.339f, 13.5f, 20.058f, 12.983f, 20.355f, 12.25f)
            horizontalLineTo(16.645f)
            curveTo(16.942f, 12.983f, 17.661f, 13.5f, 18.5f, 13.5f)
            close()
            moveTo(16.865f, 10.75f)
            horizontalLineTo(20.135f)
            lineTo(18.5f, 6.738f)
            lineTo(16.865f, 10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScalesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Scales, contentDescription = null)
    }
}
