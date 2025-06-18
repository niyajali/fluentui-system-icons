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

public val FluentUi.Regular.DocumentHeaderDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentHeaderDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.746f, 2f)
            curveTo(18.937f, 2f, 19.911f, 2.925f, 19.99f, 4.096f)
            lineTo(19.996f, 4.25f)
            verticalLineTo(11.498f)
            curveTo(19.521f, 11.301f, 19.019f, 11.158f, 18.496f, 11.078f)
            verticalLineTo(4.25f)
            curveTo(18.496f, 3.87f, 18.214f, 3.556f, 17.848f, 3.507f)
            lineTo(17.746f, 3.5f)
            horizontalLineTo(6.249f)
            curveTo(5.87f, 3.5f, 5.556f, 3.782f, 5.506f, 4.148f)
            lineTo(5.5f, 4.25f)
            verticalLineTo(19.745f)
            curveTo(5.5f, 20.124f, 5.782f, 20.438f, 6.148f, 20.488f)
            lineTo(6.249f, 20.494f)
            horizontalLineTo(11.732f)
            curveTo(12.018f, 21.045f, 12.381f, 21.55f, 12.807f, 21.994f)
            horizontalLineTo(6.249f)
            curveTo(5.059f, 21.994f, 4.084f, 21.069f, 4.005f, 19.899f)
            lineTo(4f, 19.745f)
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
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(15.854f, 15.146f)
            curveTo(15.658f, 14.951f, 15.342f, 14.951f, 15.146f, 15.146f)
            curveTo(14.951f, 15.342f, 14.951f, 15.658f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.146f)
            curveTo(14.951f, 19.342f, 14.951f, 19.658f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.207f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.658f, 20.049f, 19.342f, 19.854f, 19.146f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.658f, 20.049f, 15.342f, 19.854f, 15.146f)
            curveTo(19.658f, 14.951f, 19.342f, 14.951f, 19.146f, 15.146f)
            lineTo(17.5f, 16.793f)
            lineTo(15.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeaderDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentHeaderDismiss, contentDescription = null)
    }
}
