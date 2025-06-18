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

public val FluentUi.Filled.NotebookError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NotebookError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            close()
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            lineTo(11.19f, 22.001f)
            curveTo(12.311f, 20.833f, 13f, 19.247f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
            moveTo(6.5f, 19.88f)
            curveTo(6.155f, 19.88f, 5.875f, 20.16f, 5.875f, 20.504f)
            curveTo(5.875f, 20.849f, 6.155f, 21.129f, 6.5f, 21.129f)
            curveTo(6.845f, 21.129f, 7.125f, 20.849f, 7.125f, 20.504f)
            curveTo(7.125f, 20.16f, 6.845f, 19.88f, 6.5f, 19.88f)
            close()
            moveTo(6.5f, 14.003f)
            curveTo(6.255f, 14.003f, 6.05f, 14.18f, 6.008f, 14.413f)
            lineTo(6f, 14.503f)
            verticalLineTo(18.501f)
            lineTo(6.008f, 18.59f)
            curveTo(6.05f, 18.824f, 6.255f, 19.001f, 6.5f, 19.001f)
            curveTo(6.746f, 19.001f, 6.95f, 18.824f, 6.992f, 18.59f)
            lineTo(7f, 18.501f)
            verticalLineTo(14.503f)
            lineTo(6.992f, 14.413f)
            curveTo(6.95f, 14.18f, 6.746f, 14.003f, 6.5f, 14.003f)
            close()
            moveTo(20.75f, 15.002f)
            curveTo(21.13f, 15.002f, 21.444f, 15.284f, 21.493f, 15.65f)
            lineTo(21.5f, 15.752f)
            verticalLineTo(17.25f)
            curveTo(21.5f, 17.63f, 21.218f, 17.944f, 20.852f, 17.993f)
            lineTo(20.75f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(15.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(20.75f, 11.002f)
            curveTo(21.13f, 11.002f, 21.444f, 11.284f, 21.493f, 11.65f)
            lineTo(21.5f, 11.752f)
            verticalLineTo(13.25f)
            curveTo(21.5f, 13.63f, 21.218f, 13.943f, 20.852f, 13.993f)
            lineTo(20.75f, 14f)
            horizontalLineTo(20f)
            verticalLineTo(11.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(20.75f, 7.002f)
            curveTo(21.13f, 7.002f, 21.444f, 7.284f, 21.493f, 7.65f)
            lineTo(21.5f, 7.752f)
            verticalLineTo(9.25f)
            curveTo(21.5f, 9.63f, 21.218f, 9.943f, 20.852f, 9.993f)
            lineTo(20.75f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(7.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(14.748f, 5.501f)
            horizontalLineTo(8.248f)
            curveTo(7.868f, 5.501f, 7.555f, 5.783f, 7.505f, 6.149f)
            lineTo(7.498f, 6.251f)
            verticalLineTo(7.751f)
            curveTo(7.498f, 8.131f, 7.78f, 8.444f, 8.146f, 8.494f)
            lineTo(8.248f, 8.501f)
            horizontalLineTo(14.748f)
            curveTo(15.128f, 8.501f, 15.441f, 8.219f, 15.491f, 7.853f)
            lineTo(15.498f, 7.751f)
            verticalLineTo(6.251f)
            curveTo(15.498f, 5.836f, 15.162f, 5.501f, 14.748f, 5.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotebookErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NotebookError, contentDescription = null)
    }
}
