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

public val FluentUi.Filled.ClipboardLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(14f)
            horizontalLineTo(15f)
            curveTo(12.239f, 14f, 10f, 16.239f, 10f, 19f)
            curveTo(10f, 20.126f, 10.372f, 21.164f, 11f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(23f, 19f)
            curveTo(23f, 16.791f, 21.209f, 15f, 19f, 15f)
            lineTo(18.898f, 15.007f)
            curveTo(18.532f, 15.057f, 18.25f, 15.37f, 18.25f, 15.75f)
            curveTo(18.25f, 16.164f, 18.586f, 16.5f, 19f, 16.5f)
            lineTo(19.164f, 16.505f)
            curveTo(20.469f, 16.59f, 21.5f, 17.674f, 21.5f, 19f)
            curveTo(21.5f, 20.381f, 20.381f, 21.5f, 19f, 21.5f)
            lineTo(18.898f, 21.507f)
            curveTo(18.532f, 21.556f, 18.25f, 21.87f, 18.25f, 22.25f)
            curveTo(18.25f, 22.664f, 18.586f, 23f, 19f, 23f)
            lineTo(19.2f, 22.995f)
            curveTo(21.316f, 22.891f, 23f, 21.142f, 23f, 19f)
            close()
            moveTo(15.75f, 15.75f)
            curveTo(15.75f, 15.336f, 15.414f, 15f, 15f, 15f)
            lineTo(14.8f, 15.005f)
            curveTo(12.684f, 15.109f, 11f, 16.858f, 11f, 19f)
            curveTo(11f, 21.209f, 12.791f, 23f, 15f, 23f)
            lineTo(15.102f, 22.993f)
            curveTo(15.468f, 22.944f, 15.75f, 22.63f, 15.75f, 22.25f)
            curveTo(15.75f, 21.836f, 15.414f, 21.5f, 15f, 21.5f)
            lineTo(14.836f, 21.495f)
            curveTo(13.531f, 21.41f, 12.5f, 20.326f, 12.5f, 19f)
            curveTo(12.5f, 17.619f, 13.619f, 16.5f, 15f, 16.5f)
            lineTo(15.102f, 16.493f)
            curveTo(15.468f, 16.444f, 15.75f, 16.13f, 15.75f, 15.75f)
            close()
            moveTo(18.75f, 18.25f)
            horizontalLineTo(15.25f)
            lineTo(15.148f, 18.257f)
            curveTo(14.782f, 18.306f, 14.5f, 18.62f, 14.5f, 19f)
            curveTo(14.5f, 19.414f, 14.836f, 19.75f, 15.25f, 19.75f)
            horizontalLineTo(18.75f)
            lineTo(18.852f, 19.743f)
            curveTo(19.218f, 19.694f, 19.5f, 19.38f, 19.5f, 19f)
            curveTo(19.5f, 18.586f, 19.164f, 18.25f, 18.75f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardLink, contentDescription = null)
    }
}
