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

public val FluentUi.Regular.SaveCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SaveCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.496f, 5.627f)
            curveTo(21.372f, 5.934f, 22f, 6.769f, 22f, 7.75f)
            verticalLineTo(17.75f)
            curveTo(22f, 20.097f, 20.097f, 22f, 17.75f, 22f)
            horizontalLineTo(7.75f)
            curveTo(6.769f, 22f, 5.934f, 21.372f, 5.627f, 20.496f)
            lineTo(7.724f, 20.5f)
            lineTo(17.75f, 20.5f)
            curveTo(19.269f, 20.5f, 20.5f, 19.269f, 20.5f, 17.75f)
            verticalLineTo(7.75f)
            lineTo(20.496f, 7.699f)
            lineTo(20.496f, 5.627f)
            close()
            moveTo(17.247f, 2f)
            curveTo(18.49f, 2f, 19.497f, 3.007f, 19.497f, 4.25f)
            verticalLineTo(17.247f)
            curveTo(19.497f, 18.49f, 18.49f, 19.497f, 17.247f, 19.497f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19.497f, 2f, 18.49f, 2f, 17.247f)
            verticalLineTo(4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineTo(17.247f)
            close()
            moveTo(17.247f, 3.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 3.5f, 3.5f, 3.836f, 3.5f, 4.25f)
            verticalLineTo(17.247f)
            curveTo(3.5f, 17.661f, 3.836f, 17.997f, 4.25f, 17.997f)
            horizontalLineTo(17.247f)
            curveTo(17.661f, 17.997f, 17.997f, 17.661f, 17.997f, 17.247f)
            verticalLineTo(4.25f)
            curveTo(17.997f, 3.836f, 17.661f, 3.5f, 17.247f, 3.5f)
            close()
            moveTo(10.75f, 6.75f)
            curveTo(11.164f, 6.75f, 11.5f, 7.086f, 11.5f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(14.414f, 10f, 14.75f, 10.336f, 14.75f, 10.75f)
            curveTo(14.75f, 11.164f, 14.414f, 11.5f, 14f, 11.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(14f)
            curveTo(11.5f, 14.414f, 11.164f, 14.75f, 10.75f, 14.75f)
            curveTo(10.336f, 14.75f, 10f, 14.414f, 10f, 14f)
            verticalLineTo(11.5f)
            horizontalLineTo(7.5f)
            curveTo(7.086f, 11.5f, 6.75f, 11.164f, 6.75f, 10.75f)
            curveTo(6.75f, 10.336f, 7.086f, 10f, 7.5f, 10f)
            horizontalLineTo(10f)
            verticalLineTo(7.5f)
            curveTo(10f, 7.086f, 10.336f, 6.75f, 10.75f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SaveCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SaveCopy, contentDescription = null)
    }
}
