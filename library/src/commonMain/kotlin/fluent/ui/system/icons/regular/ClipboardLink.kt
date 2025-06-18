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

public val FluentUi.Regular.ClipboardLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClipboardLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(11f)
            curveTo(10.663f, 21.552f, 10.401f, 21.046f, 10.229f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
            lineTo(8.379f, 5.5f)
            curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
            horizontalLineTo(13.75f)
            curveTo(14.528f, 6.5f, 15.215f, 6.105f, 15.618f, 5.504f)
            horizontalLineTo(17.502f)
            verticalLineTo(5.5f)
            lineTo(17.75f, 5.5f)
            curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
            verticalLineTo(14f)
            horizontalLineTo(20f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            close()
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(19f, 15f)
            curveTo(21.209f, 15f, 23f, 16.791f, 23f, 19f)
            curveTo(23f, 21.142f, 21.316f, 22.891f, 19.2f, 22.995f)
            lineTo(19f, 23f)
            curveTo(18.586f, 23f, 18.25f, 22.664f, 18.25f, 22.25f)
            curveTo(18.25f, 21.87f, 18.532f, 21.556f, 18.898f, 21.507f)
            lineTo(19f, 21.5f)
            curveTo(20.381f, 21.5f, 21.5f, 20.381f, 21.5f, 19f)
            curveTo(21.5f, 17.674f, 20.469f, 16.59f, 19.164f, 16.505f)
            lineTo(19f, 16.5f)
            curveTo(18.586f, 16.5f, 18.25f, 16.164f, 18.25f, 15.75f)
            curveTo(18.25f, 15.37f, 18.532f, 15.057f, 18.898f, 15.007f)
            lineTo(19f, 15f)
            close()
            moveTo(15f, 15f)
            curveTo(15.414f, 15f, 15.75f, 15.336f, 15.75f, 15.75f)
            curveTo(15.75f, 16.13f, 15.468f, 16.444f, 15.102f, 16.493f)
            lineTo(15f, 16.5f)
            curveTo(13.619f, 16.5f, 12.5f, 17.619f, 12.5f, 19f)
            curveTo(12.5f, 20.326f, 13.531f, 21.41f, 14.836f, 21.495f)
            lineTo(15f, 21.5f)
            curveTo(15.414f, 21.5f, 15.75f, 21.836f, 15.75f, 22.25f)
            curveTo(15.75f, 22.63f, 15.468f, 22.944f, 15.102f, 22.993f)
            lineTo(15f, 23f)
            curveTo(12.791f, 23f, 11f, 21.209f, 11f, 19f)
            curveTo(11f, 16.858f, 12.684f, 15.109f, 14.8f, 15.005f)
            lineTo(15f, 15f)
            close()
            moveTo(15.25f, 18.25f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 18.25f, 19.5f, 18.586f, 19.5f, 19f)
            curveTo(19.5f, 19.38f, 19.218f, 19.694f, 18.852f, 19.743f)
            lineTo(18.75f, 19.75f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 19.75f, 14.5f, 19.414f, 14.5f, 19f)
            curveTo(14.5f, 18.62f, 14.782f, 18.306f, 15.148f, 18.257f)
            lineTo(15.25f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClipboardLink, contentDescription = null)
    }
}
