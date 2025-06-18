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

public val FluentUi.Filled.Tent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.262f, 2.202f)
            curveTo(11.966f, 1.926f, 11.505f, 1.934f, 11.22f, 2.22f)
            lineTo(9.52f, 3.919f)
            curveTo(8.368f, 5.072f, 7.078f, 6.078f, 5.681f, 6.917f)
            curveTo(5.287f, 7.153f, 5.02f, 7.555f, 4.955f, 8.009f)
            lineTo(3.6f, 17.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
            curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
            curveTo(22f, 17.836f, 21.664f, 17.5f, 21.25f, 17.5f)
            horizontalLineTo(20.4f)
            lineTo(19.05f, 8.045f)
            curveTo(18.98f, 7.558f, 18.685f, 7.133f, 18.253f, 6.897f)
            curveTo(16.719f, 6.06f, 15.296f, 5.034f, 14.018f, 3.841f)
            lineTo(12.262f, 2.202f)
            close()
            moveTo(14.096f, 15.118f)
            curveTo(14.586f, 15.988f, 15.219f, 16.844f, 15.745f, 17.5f)
            horizontalLineTo(8.285f)
            curveTo(8.82f, 16.842f, 9.457f, 15.978f, 9.916f, 15.096f)
            curveTo(10.537f, 13.898f, 11.239f, 12.108f, 11.777f, 10.646f)
            curveTo(11.848f, 10.453f, 11.916f, 10.265f, 11.982f, 10.084f)
            curveTo(12.041f, 10.255f, 12.103f, 10.431f, 12.168f, 10.612f)
            curveTo(12.69f, 12.068f, 13.395f, 13.87f, 14.096f, 15.118f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Tent, contentDescription = null)
    }
}
