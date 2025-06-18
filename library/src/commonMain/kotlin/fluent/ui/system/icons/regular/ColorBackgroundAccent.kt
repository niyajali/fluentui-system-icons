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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ColorBackgroundAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorBackgroundAccent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 17.5f)
            verticalLineTo(13.412f)
            lineTo(4.488f, 14.9f)
            curveTo(5.66f, 16.071f, 7.559f, 16.071f, 8.731f, 14.9f)
            lineTo(10.101f, 13.53f)
            curveTo(10.039f, 13.795f, 10f, 14.079f, 10f, 14.375f)
            curveTo(10f, 16.232f, 11.394f, 18f, 13.5f, 18f)
            curveTo(15.606f, 18f, 17f, 16.232f, 17f, 14.375f)
            curveTo(17f, 13.682f, 16.786f, 13.054f, 16.567f, 12.577f)
            curveTo(16.341f, 12.084f, 16.055f, 11.637f, 15.797f, 11.276f)
            curveTo(15.534f, 10.911f, 15.276f, 10.602f, 15.084f, 10.386f)
            lineTo(15.076f, 10.377f)
            lineTo(14.75f, 10.026f)
            lineTo(14.737f, 10.013f)
            curveTo(14.444f, 9.719f, 14.073f, 9.552f, 13.69f, 9.51f)
            curveTo(14.05f, 8.461f, 13.811f, 7.252f, 12.973f, 6.414f)
            lineTo(11.559f, 5f)
            horizontalLineTo(19.5f)
            curveTo(20.328f, 5f, 21f, 5.672f, 21f, 6.5f)
            verticalLineTo(17.5f)
            curveTo(21f, 18.328f, 20.328f, 19f, 19.5f, 19f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 19f, 3f, 18.328f, 3f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorBackgroundAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ColorBackgroundAccent, contentDescription = null)
    }
}
