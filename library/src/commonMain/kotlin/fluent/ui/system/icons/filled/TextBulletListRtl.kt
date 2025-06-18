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

public val FluentUi.Filled.TextBulletListRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBulletListRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.504f, 16.501f)
            curveTo(19.676f, 16.501f, 19.005f, 17.172f, 19.005f, 18f)
            curveTo(19.005f, 18.828f, 19.676f, 19.499f, 20.504f, 19.499f)
            curveTo(21.332f, 19.499f, 22.003f, 18.828f, 22.003f, 18f)
            curveTo(22.003f, 17.172f, 21.332f, 16.501f, 20.504f, 16.501f)
            close()
            moveTo(16.503f, 17f)
            horizontalLineTo(3f)
            curveTo(2.448f, 17f, 2f, 17.448f, 2f, 18f)
            curveTo(2f, 18.513f, 2.386f, 18.935f, 2.883f, 18.993f)
            lineTo(3f, 19f)
            horizontalLineTo(16.503f)
            curveTo(17.055f, 19f, 17.503f, 18.552f, 17.503f, 18f)
            curveTo(17.503f, 17.487f, 17.117f, 17.065f, 16.62f, 17.007f)
            lineTo(16.503f, 17f)
            close()
            moveTo(20.504f, 10.501f)
            curveTo(19.676f, 10.501f, 19.005f, 11.172f, 19.005f, 12f)
            curveTo(19.005f, 12.828f, 19.676f, 13.499f, 20.504f, 13.499f)
            curveTo(21.332f, 13.499f, 22.003f, 12.828f, 22.003f, 12f)
            curveTo(22.003f, 11.172f, 21.332f, 10.501f, 20.504f, 10.501f)
            close()
            moveTo(16.503f, 11f)
            horizontalLineTo(3f)
            curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
            curveTo(2f, 12.513f, 2.386f, 12.936f, 2.883f, 12.993f)
            lineTo(3f, 13f)
            horizontalLineTo(16.503f)
            curveTo(17.055f, 13f, 17.503f, 12.552f, 17.503f, 12f)
            curveTo(17.503f, 11.487f, 17.117f, 11.064f, 16.62f, 11.007f)
            lineTo(16.503f, 11f)
            close()
            moveTo(20.504f, 4.508f)
            curveTo(19.676f, 4.508f, 19.005f, 5.179f, 19.005f, 6.007f)
            curveTo(19.005f, 6.835f, 19.676f, 7.507f, 20.504f, 7.507f)
            curveTo(21.332f, 7.507f, 22.003f, 6.835f, 22.003f, 6.007f)
            curveTo(22.003f, 5.179f, 21.332f, 4.508f, 20.504f, 4.508f)
            close()
            moveTo(16.503f, 5.001f)
            horizontalLineTo(3f)
            curveTo(2.448f, 5.001f, 2f, 5.449f, 2f, 6.001f)
            curveTo(2f, 6.514f, 2.386f, 6.936f, 2.883f, 6.994f)
            lineTo(3f, 7.001f)
            horizontalLineTo(16.503f)
            curveTo(17.055f, 7.001f, 17.503f, 6.553f, 17.503f, 6.001f)
            curveTo(17.503f, 5.488f, 17.117f, 5.065f, 16.62f, 5.008f)
            lineTo(16.503f, 5.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextBulletListRtl, contentDescription = null)
    }
}
