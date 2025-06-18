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

public val FluentUi.Filled.ViewDesktopMobile: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ViewDesktopMobile",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(13.25f, 18f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 18f, 10f, 18.336f, 10f, 18.75f)
            curveTo(10f, 19.13f, 10.282f, 19.444f, 10.648f, 19.493f)
            lineTo(10.75f, 19.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 19.5f, 14f, 19.164f, 14f, 18.75f)
            curveTo(14f, 18.336f, 13.664f, 18f, 13.25f, 18f)
            close()
            moveTo(14.5f, 8.999f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 8.999f, 9f, 9.222f, 9f, 9.499f)
            verticalLineTo(15.5f)
            curveTo(9f, 15.776f, 9.224f, 16f, 9.5f, 16f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 16f, 15f, 15.776f, 15f, 15.5f)
            verticalLineTo(9.499f)
            curveTo(15f, 9.222f, 14.776f, 8.999f, 14.5f, 8.999f)
            close()
            moveTo(14.5f, 5f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 5f, 9f, 5.224f, 9f, 5.5f)
            verticalLineTo(7.497f)
            curveTo(9f, 7.773f, 9.224f, 7.997f, 9.5f, 7.997f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 7.997f, 15f, 7.773f, 15f, 7.497f)
            verticalLineTo(5.5f)
            curveTo(15f, 5.224f, 14.776f, 5f, 14.5f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ViewDesktopMobilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ViewDesktopMobile, contentDescription = null)
    }
}
