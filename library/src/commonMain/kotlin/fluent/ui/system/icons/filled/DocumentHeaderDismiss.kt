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

public val FluentUi.Filled.DocumentHeaderDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeaderDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.746f, 2f)
            curveTo(18.937f, 2f, 19.911f, 2.925f, 19.991f, 4.096f)
            lineTo(19.996f, 4.25f)
            verticalLineTo(11.498f)
            curveTo(19.228f, 11.179f, 18.385f, 11.002f, 17.502f, 11.002f)
            curveTo(13.913f, 11.002f, 11.003f, 13.912f, 11.003f, 17.501f)
            curveTo(11.003f, 19.244f, 11.689f, 20.827f, 12.807f, 21.994f)
            horizontalLineTo(6.249f)
            curveTo(5.059f, 21.994f, 4.084f, 21.069f, 4.005f, 19.899f)
            lineTo(4f, 19.744f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.059f, 4.925f, 2.084f, 6.095f, 2.005f)
            lineTo(6.249f, 2f)
            horizontalLineTo(17.746f)
            close()
            moveTo(8.504f, 5.004f)
            curveTo(7.676f, 5.004f, 7.004f, 5.675f, 7.004f, 6.503f)
            curveTo(7.004f, 7.332f, 7.676f, 8.003f, 8.504f, 8.003f)
            horizontalLineTo(15.502f)
            curveTo(16.33f, 8.003f, 17.002f, 7.332f, 17.002f, 6.503f)
            curveTo(17.002f, 5.675f, 16.33f, 5.004f, 15.502f, 5.004f)
            horizontalLineTo(8.504f)
            close()
            moveTo(23f, 17.501f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.501f, 23f)
            curveTo(14.465f, 23f, 12.003f, 20.538f, 12.003f, 17.501f)
            curveTo(12.003f, 14.464f, 14.465f, 12.002f, 17.501f, 12.002f)
            curveTo(20.538f, 12.002f, 23f, 14.464f, 23f, 17.501f)
            close()
            moveTo(15.855f, 15.148f)
            curveTo(15.66f, 14.953f, 15.344f, 14.953f, 15.149f, 15.148f)
            curveTo(14.953f, 15.343f, 14.953f, 15.66f, 15.149f, 15.855f)
            lineTo(16.795f, 17.501f)
            lineTo(15.149f, 19.147f)
            curveTo(14.953f, 19.342f, 14.953f, 19.659f, 15.149f, 19.854f)
            curveTo(15.344f, 20.049f, 15.66f, 20.049f, 15.855f, 19.854f)
            lineTo(17.501f, 18.208f)
            lineTo(19.147f, 19.854f)
            curveTo(19.343f, 20.049f, 19.659f, 20.049f, 19.854f, 19.854f)
            curveTo(20.05f, 19.659f, 20.05f, 19.342f, 19.854f, 19.147f)
            lineTo(18.208f, 17.501f)
            lineTo(19.854f, 15.855f)
            curveTo(20.05f, 15.66f, 20.05f, 15.343f, 19.854f, 15.148f)
            curveTo(19.659f, 14.953f, 19.343f, 14.953f, 19.147f, 15.148f)
            lineTo(17.501f, 16.794f)
            lineTo(15.855f, 15.148f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeaderDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentHeaderDismiss, contentDescription = null)
    }
}
