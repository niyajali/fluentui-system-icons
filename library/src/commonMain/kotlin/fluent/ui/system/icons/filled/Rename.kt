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

public val FluentUi.Filled.Rename: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rename",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.75f, 2f)
            horizontalLineTo(13.748f)
            curveTo(14.163f, 2f, 14.498f, 2.336f, 14.498f, 2.75f)
            curveTo(14.498f, 3.13f, 14.216f, 3.443f, 13.85f, 3.493f)
            lineTo(13.748f, 3.5f)
            horizontalLineTo(12.499f)
            verticalLineTo(20.5f)
            horizontalLineTo(13.745f)
            curveTo(14.125f, 20.5f, 14.439f, 20.782f, 14.488f, 21.148f)
            lineTo(14.495f, 21.25f)
            curveTo(14.495f, 21.63f, 14.213f, 21.944f, 13.847f, 21.993f)
            lineTo(13.745f, 22f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 22f, 9f, 21.664f, 9f, 21.25f)
            curveTo(9f, 20.87f, 9.282f, 20.556f, 9.648f, 20.507f)
            lineTo(9.75f, 20.5f)
            horizontalLineTo(10.999f)
            verticalLineTo(3.5f)
            horizontalLineTo(9.75f)
            curveTo(9.37f, 3.5f, 9.057f, 3.218f, 9.007f, 2.852f)
            lineTo(9f, 2.75f)
            curveTo(9f, 2.37f, 9.282f, 2.057f, 9.648f, 2.007f)
            lineTo(9.75f, 2f)
            close()
            moveTo(18.246f, 4.997f)
            curveTo(20.04f, 4.998f, 21.495f, 6.452f, 21.497f, 8.246f)
            lineTo(21.5f, 15.751f)
            curveTo(21.501f, 17.484f, 20.145f, 18.901f, 18.436f, 18.997f)
            lineTo(18.25f, 19.002f)
            lineTo(13.505f, 19.001f)
            verticalLineTo(4.997f)
            horizontalLineTo(18.246f)
            close()
            moveTo(9.997f, 4.997f)
            lineTo(9.992f, 19.001f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19.001f, 2f, 17.546f, 2f, 15.751f)
            verticalLineTo(8.247f)
            curveTo(2f, 6.452f, 3.455f, 4.997f, 5.25f, 4.997f)
            horizontalLineTo(9.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RenamePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Rename, contentDescription = null)
    }
}
