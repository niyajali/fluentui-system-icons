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

public val FluentUi.Filled.TabletLaptop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabletLaptop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.999f, 17.25f)
            curveTo(21.999f, 16.836f, 21.664f, 16.5f, 21.249f, 16.5f)
            lineTo(16.5f, 16.5f)
            verticalLineTo(18f)
            lineTo(21.249f, 18f)
            lineTo(21.351f, 17.993f)
            curveTo(21.717f, 17.943f, 21.999f, 17.629f, 21.999f, 17.25f)
            close()
            moveTo(4.25f, 11f)
            curveTo(3.007f, 11f, 2f, 12.007f, 2f, 13.25f)
            verticalLineTo(18.75f)
            curveTo(2f, 19.993f, 3.007f, 21f, 4.25f, 21f)
            horizontalLineTo(13.25f)
            curveTo(14.493f, 21f, 15.5f, 19.993f, 15.5f, 18.75f)
            verticalLineTo(13.25f)
            curveTo(15.5f, 12.007f, 14.493f, 11f, 13.25f, 11f)
            horizontalLineTo(4.25f)
            close()
            moveTo(7f, 17.75f)
            curveTo(7f, 17.336f, 7.336f, 17f, 7.75f, 17f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 17f, 11f, 17.336f, 11f, 17.75f)
            curveTo(11f, 18.164f, 10.664f, 18.5f, 10.25f, 18.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 18.5f, 7f, 18.164f, 7f, 17.75f)
            close()
            moveTo(16.5f, 16.001f)
            lineTo(18.25f, 16.001f)
            curveTo(19.216f, 16.001f, 20f, 15.217f, 20f, 14.251f)
            verticalLineTo(6.75f)
            curveTo(20f, 5.784f, 19.216f, 5f, 18.25f, 5f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 5f, 4f, 5.784f, 4f, 6.75f)
            verticalLineTo(10.035f)
            curveTo(4.163f, 10.012f, 4.33f, 10f, 4.5f, 10f)
            horizontalLineTo(13.5f)
            curveTo(15.157f, 10f, 16.5f, 11.343f, 16.5f, 13f)
            lineTo(16.5f, 16.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabletLaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TabletLaptop, contentDescription = null)
    }
}
