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

public val FluentUi.Regular.ArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.209f, 10.733f)
            curveTo(3.923f, 11.033f, 3.935f, 11.507f, 4.235f, 11.793f)
            curveTo(4.535f, 12.079f, 5.009f, 12.067f, 5.295f, 11.767f)
            lineTo(11.25f, 5.516f)
            verticalLineTo(20.25f)
            curveTo(11.25f, 20.664f, 11.585f, 21f, 12f, 21f)
            curveTo(12.414f, 21f, 12.75f, 20.664f, 12.75f, 20.25f)
            verticalLineTo(5.516f)
            lineTo(18.704f, 11.767f)
            curveTo(18.99f, 12.067f, 19.465f, 12.079f, 19.765f, 11.793f)
            curveTo(20.065f, 11.507f, 20.076f, 11.033f, 19.791f, 10.733f)
            lineTo(12.724f, 3.314f)
            curveTo(12.563f, 3.145f, 12.357f, 3.045f, 12.144f, 3.014f)
            curveTo(12.097f, 3.005f, 12.049f, 3f, 12f, 3f)
            curveTo(11.95f, 3f, 11.901f, 3.005f, 11.854f, 3.014f)
            curveTo(11.641f, 3.045f, 11.436f, 3.145f, 11.276f, 3.314f)
            lineTo(4.209f, 10.733f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowUp, contentDescription = null)
    }
}
