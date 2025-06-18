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

public val FluentUi.Filled.MultiselectLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MultiselectLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.707f, 3.293f)
            curveTo(6.317f, 2.902f, 5.683f, 2.902f, 5.293f, 3.293f)
            lineTo(4f, 4.586f)
            lineTo(3.707f, 4.293f)
            curveTo(3.317f, 3.902f, 2.683f, 3.902f, 2.293f, 4.293f)
            curveTo(1.902f, 4.683f, 1.902f, 5.317f, 2.293f, 5.707f)
            lineTo(3.293f, 6.707f)
            curveTo(3.683f, 7.098f, 4.317f, 7.098f, 4.707f, 6.707f)
            lineTo(6.707f, 4.707f)
            curveTo(7.098f, 4.317f, 7.098f, 3.683f, 6.707f, 3.293f)
            close()
            moveTo(10f, 16.993f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 16.993f, 22.003f, 17.441f, 22.003f, 17.993f)
            curveTo(22.003f, 18.506f, 21.617f, 18.929f, 21.12f, 18.987f)
            lineTo(21.003f, 18.993f)
            horizontalLineTo(10f)
            curveTo(9.447f, 18.993f, 9f, 18.546f, 9f, 17.993f)
            curveTo(9f, 17.48f, 9.386f, 17.058f, 9.883f, 17f)
            lineTo(10f, 16.993f)
            close()
            moveTo(10f, 11f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 11f, 22.003f, 11.448f, 22.003f, 12f)
            curveTo(22.003f, 12.513f, 21.617f, 12.936f, 21.12f, 12.993f)
            lineTo(21.003f, 13f)
            horizontalLineTo(10f)
            curveTo(9.447f, 13f, 9f, 12.552f, 9f, 12f)
            curveTo(9f, 11.487f, 9.386f, 11.064f, 9.883f, 11.007f)
            lineTo(10f, 11f)
            close()
            moveTo(10f, 5f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 5f, 22.003f, 5.448f, 22.003f, 6f)
            curveTo(22.003f, 6.513f, 21.617f, 6.936f, 21.12f, 6.993f)
            lineTo(21.003f, 7f)
            horizontalLineTo(10f)
            curveTo(9.447f, 7f, 9f, 6.552f, 9f, 6f)
            curveTo(9f, 5.487f, 9.386f, 5.065f, 9.883f, 5.007f)
            lineTo(10f, 5f)
            close()
            moveTo(5.293f, 16.293f)
            curveTo(5.683f, 15.902f, 6.317f, 15.902f, 6.707f, 16.293f)
            curveTo(7.098f, 16.683f, 7.098f, 17.317f, 6.707f, 17.707f)
            lineTo(4.707f, 19.707f)
            curveTo(4.317f, 20.098f, 3.683f, 20.098f, 3.293f, 19.707f)
            lineTo(2.293f, 18.707f)
            curveTo(1.902f, 18.317f, 1.902f, 17.683f, 2.293f, 17.293f)
            curveTo(2.683f, 16.902f, 3.317f, 16.902f, 3.707f, 17.293f)
            lineTo(4f, 17.586f)
            lineTo(5.293f, 16.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MultiselectLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MultiselectLtr, contentDescription = null)
    }
}
