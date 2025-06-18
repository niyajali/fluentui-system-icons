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

public val FluentUi.Filled.TabDesktopLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineTo(18f)
            curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
            horizontalLineTo(11.333f)
            curveTo(11.118f, 20.458f, 11f, 19.868f, 11f, 19.25f)
            curveTo(11f, 16.627f, 13.127f, 14.5f, 15.75f, 14.5f)
            horizontalLineTo(19.25f)
            curveTo(19.868f, 14.5f, 20.458f, 14.618f, 21f, 14.833f)
            verticalLineTo(8f)
            horizontalLineTo(13.25f)
            curveTo(12.007f, 8f, 11f, 6.993f, 11f, 5.75f)
            verticalLineTo(3f)
            close()
            moveTo(21f, 6.5f)
            verticalLineTo(6f)
            curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
            horizontalLineTo(12.5f)
            verticalLineTo(5.75f)
            curveTo(12.5f, 6.164f, 12.836f, 6.5f, 13.25f, 6.5f)
            horizontalLineTo(21f)
            close()
            moveTo(23f, 19.25f)
            curveTo(23f, 17.179f, 21.321f, 15.5f, 19.25f, 15.5f)
            lineTo(19.148f, 15.507f)
            curveTo(18.782f, 15.557f, 18.5f, 15.87f, 18.5f, 16.25f)
            curveTo(18.5f, 16.664f, 18.836f, 17f, 19.25f, 17f)
            lineTo(19.404f, 17.005f)
            curveTo(20.575f, 17.084f, 21.5f, 18.059f, 21.5f, 19.25f)
            curveTo(21.5f, 20.493f, 20.493f, 21.5f, 19.25f, 21.5f)
            lineTo(19.247f, 21.505f)
            lineTo(19.145f, 21.512f)
            curveTo(18.779f, 21.563f, 18.498f, 21.878f, 18.5f, 22.258f)
            curveTo(18.502f, 22.672f, 18.839f, 23.007f, 19.253f, 23.005f)
            verticalLineTo(23f)
            lineTo(19.452f, 22.995f)
            curveTo(21.428f, 22.891f, 23f, 21.254f, 23f, 19.25f)
            close()
            moveTo(16.5f, 16.25f)
            curveTo(16.5f, 15.836f, 16.164f, 15.5f, 15.75f, 15.5f)
            lineTo(15.551f, 15.505f)
            curveTo(13.572f, 15.609f, 12f, 17.246f, 12f, 19.25f)
            curveTo(12f, 21.321f, 13.679f, 23f, 15.75f, 23f)
            lineTo(15.852f, 22.993f)
            curveTo(16.218f, 22.944f, 16.5f, 22.63f, 16.5f, 22.25f)
            curveTo(16.5f, 21.836f, 16.164f, 21.5f, 15.75f, 21.5f)
            lineTo(15.596f, 21.495f)
            curveTo(14.425f, 21.416f, 13.5f, 20.441f, 13.5f, 19.25f)
            curveTo(13.5f, 18.007f, 14.507f, 17f, 15.75f, 17f)
            lineTo(15.852f, 16.993f)
            curveTo(16.218f, 16.944f, 16.5f, 16.63f, 16.5f, 16.25f)
            close()
            moveTo(20f, 19.25f)
            curveTo(20f, 18.836f, 19.664f, 18.5f, 19.25f, 18.5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 18.507f)
            curveTo(15.282f, 18.556f, 15f, 18.87f, 15f, 19.25f)
            curveTo(15f, 19.664f, 15.336f, 20f, 15.75f, 20f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 19.993f)
            curveTo(19.718f, 19.944f, 20f, 19.63f, 20f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabDesktopLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TabDesktopLink, contentDescription = null)
    }
}
