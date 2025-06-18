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

public val FluentUi.Filled.DualScreenPagination: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenPagination",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.245f, 4.004f)
            curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 20f, 12.825f, 19.993f, 12.742f, 19.981f)
            lineTo(12.742f, 4.023f)
            curveTo(12.825f, 4.011f, 12.911f, 4.004f, 12.998f, 4.004f)
            horizontalLineTo(20.245f)
            close()
            moveTo(10.998f, 4.002f)
            curveTo(11.081f, 4.002f, 11.163f, 4.008f, 11.243f, 4.019f)
            lineTo(11.243f, 19.98f)
            curveTo(11.163f, 19.991f, 11.081f, 19.997f, 10.998f, 19.997f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(10.998f)
            close()
            moveTo(17.625f, 16.501f)
            curveTo(17.211f, 16.501f, 16.875f, 16.837f, 16.875f, 17.251f)
            curveTo(16.875f, 17.665f, 17.211f, 18.001f, 17.625f, 18.001f)
            curveTo(18.039f, 18.001f, 18.375f, 17.665f, 18.375f, 17.251f)
            curveTo(18.375f, 16.837f, 18.039f, 16.501f, 17.625f, 16.501f)
            close()
            moveTo(20.125f, 16.501f)
            curveTo(19.711f, 16.501f, 19.375f, 16.837f, 19.375f, 17.251f)
            curveTo(19.375f, 17.665f, 19.711f, 18.001f, 20.125f, 18.001f)
            curveTo(20.539f, 18.001f, 20.875f, 17.665f, 20.875f, 17.251f)
            curveTo(20.875f, 16.837f, 20.539f, 16.501f, 20.125f, 16.501f)
            close()
            moveTo(15.125f, 16.501f)
            curveTo(14.711f, 16.501f, 14.375f, 16.837f, 14.375f, 17.251f)
            curveTo(14.375f, 17.665f, 14.711f, 18.001f, 15.125f, 18.001f)
            curveTo(15.539f, 18.001f, 15.875f, 17.665f, 15.875f, 17.251f)
            curveTo(15.875f, 16.837f, 15.539f, 16.501f, 15.125f, 16.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenPaginationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenPagination, contentDescription = null)
    }
}
