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

public val FluentUi.Filled.StarThreeQuarter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 6.727f)
            lineTo(13.211f, 3.102f)
            curveTo(12.963f, 2.6f, 12.481f, 2.349f, 11.999f, 2.35f)
            curveTo(11.518f, 2.349f, 11.036f, 2.6f, 10.788f, 3.102f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
            lineTo(6.224f, 14.668f)
            lineTo(5.324f, 19.919f)
            curveTo(5.174f, 20.792f, 5.868f, 21.501f, 6.655f, 21.5f)
            curveTo(6.863f, 21.5f, 7.077f, 21.451f, 7.284f, 21.342f)
            lineTo(11.999f, 18.863f)
            lineTo(15f, 20.441f)
            verticalLineTo(6.727f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarThreeQuarterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarThreeQuarter, contentDescription = null)
    }
}
