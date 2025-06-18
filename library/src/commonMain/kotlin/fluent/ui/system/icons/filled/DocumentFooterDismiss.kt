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

public val FluentUi.Filled.DocumentFooterDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentFooterDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.502f)
            curveTo(23f, 9.54f, 20.538f, 12.003f, 17.501f, 12.003f)
            curveTo(14.465f, 12.003f, 12.003f, 9.54f, 12.003f, 6.502f)
            curveTo(12.003f, 3.463f, 14.465f, 1f, 17.501f, 1f)
            curveTo(20.538f, 1f, 23f, 3.463f, 23f, 6.502f)
            close()
            moveTo(15.855f, 4.147f)
            curveTo(15.66f, 3.952f, 15.344f, 3.952f, 15.149f, 4.147f)
            curveTo(14.953f, 4.343f, 14.953f, 4.659f, 15.149f, 4.855f)
            lineTo(16.795f, 6.502f)
            lineTo(15.149f, 8.149f)
            curveTo(14.953f, 8.344f, 14.953f, 8.661f, 15.149f, 8.856f)
            curveTo(15.344f, 9.051f, 15.66f, 9.051f, 15.855f, 8.856f)
            lineTo(17.501f, 7.209f)
            lineTo(19.147f, 8.856f)
            curveTo(19.343f, 9.051f, 19.659f, 9.051f, 19.854f, 8.856f)
            curveTo(20.05f, 8.661f, 20.05f, 8.344f, 19.854f, 8.149f)
            lineTo(18.208f, 6.502f)
            lineTo(19.854f, 4.855f)
            curveTo(20.05f, 4.659f, 20.05f, 4.343f, 19.854f, 4.147f)
            curveTo(19.659f, 3.952f, 19.343f, 3.952f, 19.147f, 4.147f)
            lineTo(17.501f, 5.794f)
            lineTo(15.855f, 4.147f)
            close()
            moveTo(17.502f, 13.003f)
            curveTo(18.385f, 13.003f, 19.228f, 12.827f, 19.996f, 12.507f)
            verticalLineTo(19.749f)
            curveTo(19.996f, 20.941f, 19.071f, 21.916f, 17.9f, 21.995f)
            lineTo(17.746f, 22f)
            horizontalLineTo(6.249f)
            curveTo(5.059f, 22f, 4.084f, 21.075f, 4.005f, 19.903f)
            lineTo(4f, 19.749f)
            verticalLineTo(4.247f)
            curveTo(4f, 3.056f, 4.925f, 2.08f, 6.095f, 2.001f)
            lineTo(6.249f, 1.996f)
            horizontalLineTo(12.816f)
            curveTo(11.694f, 3.165f, 11.003f, 4.753f, 11.003f, 6.502f)
            curveTo(11.003f, 10.092f, 13.913f, 13.003f, 17.502f, 13.003f)
            close()
            moveTo(8.504f, 16.004f)
            curveTo(7.676f, 16.004f, 7.004f, 16.676f, 7.004f, 17.505f)
            curveTo(7.004f, 18.333f, 7.676f, 19.005f, 8.504f, 19.005f)
            horizontalLineTo(15.502f)
            curveTo(16.33f, 19.005f, 17.002f, 18.333f, 17.002f, 17.505f)
            curveTo(17.002f, 16.676f, 16.33f, 16.004f, 15.502f, 16.004f)
            horizontalLineTo(8.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFooterDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentFooterDismiss, contentDescription = null)
    }
}
