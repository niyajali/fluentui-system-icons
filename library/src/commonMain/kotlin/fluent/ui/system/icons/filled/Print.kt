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

public val FluentUi.Filled.Print: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Print",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 17.5f)
            verticalLineTo(18.75f)
            curveTo(18f, 19.993f, 16.993f, 21f, 15.75f, 21f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 21f, 6f, 19.993f, 6f, 18.75f)
            verticalLineTo(17.499f)
            lineTo(4.25f, 17.5f)
            curveTo(3.007f, 17.5f, 2f, 16.493f, 2f, 15.25f)
            verticalLineTo(9.254f)
            curveTo(2f, 7.459f, 3.455f, 6.004f, 5.25f, 6.004f)
            lineTo(5.999f, 6.003f)
            lineTo(6f, 5.25f)
            curveTo(6f, 4.007f, 7.007f, 3f, 8.25f, 3f)
            horizontalLineTo(15.752f)
            curveTo(16.995f, 3f, 18.003f, 4.007f, 18.003f, 5.25f)
            lineTo(18.002f, 6.003f)
            lineTo(18.753f, 6.004f)
            curveTo(20.547f, 6.005f, 22.001f, 7.459f, 22.004f, 9.252f)
            lineTo(22.007f, 15.25f)
            curveTo(22.009f, 16.492f, 21.002f, 17.5f, 19.759f, 17.501f)
            lineTo(18f, 17.5f)
            close()
            moveTo(15.75f, 13.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 13.5f, 7.5f, 13.836f, 7.5f, 14.25f)
            verticalLineTo(18.75f)
            curveTo(7.5f, 19.164f, 7.836f, 19.5f, 8.25f, 19.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 19.5f, 16.5f, 19.164f, 16.5f, 18.75f)
            verticalLineTo(14.25f)
            curveTo(16.5f, 13.836f, 16.164f, 13.5f, 15.75f, 13.5f)
            close()
            moveTo(15.752f, 4.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 4.5f, 7.5f, 4.836f, 7.5f, 5.25f)
            lineTo(7.499f, 6.003f)
            horizontalLineTo(16.502f)
            lineTo(16.503f, 5.25f)
            curveTo(16.503f, 4.836f, 16.167f, 4.5f, 15.752f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PrintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Print, contentDescription = null)
    }
}
