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

public val FluentUi.Regular.ArrowAutofitHeight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitHeight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.22f, 6.781f)
            curveTo(12.953f, 6.515f, 12.929f, 6.098f, 13.147f, 5.805f)
            lineTo(13.22f, 5.72f)
            lineTo(15.587f, 3.35f)
            curveTo(15.713f, 3.142f, 15.963f, 3f, 16.251f, 3f)
            curveTo(16.503f, 3f, 16.726f, 3.109f, 16.862f, 3.276f)
            lineTo(16.915f, 3.351f)
            lineTo(19.282f, 5.72f)
            lineTo(19.355f, 5.805f)
            curveTo(19.548f, 6.066f, 19.551f, 6.424f, 19.362f, 6.687f)
            lineTo(19.282f, 6.781f)
            lineTo(19.198f, 6.854f)
            curveTo(18.937f, 7.047f, 18.579f, 7.05f, 18.315f, 6.861f)
            lineTo(18.221f, 6.781f)
            lineTo(17f, 5.56f)
            verticalLineTo(9.344f)
            lineTo(16.993f, 9.433f)
            curveTo(16.943f, 9.753f, 16.63f, 10f, 16.25f, 10f)
            curveTo(15.87f, 10f, 15.557f, 9.753f, 15.507f, 9.433f)
            lineTo(15.5f, 9.344f)
            verticalLineTo(5.56f)
            lineTo(14.28f, 6.781f)
            lineTo(14.196f, 6.854f)
            curveTo(13.903f, 7.072f, 13.486f, 7.047f, 13.22f, 6.781f)
            close()
            moveTo(13.223f, 17.219f)
            curveTo(13.489f, 16.953f, 13.906f, 16.928f, 14.199f, 17.146f)
            lineTo(14.283f, 17.219f)
            lineTo(15.503f, 18.44f)
            verticalLineTo(14.656f)
            curveTo(15.503f, 14.294f, 15.839f, 14f, 16.253f, 14f)
            curveTo(16.632f, 14f, 16.946f, 14.247f, 16.996f, 14.567f)
            lineTo(17.003f, 14.656f)
            verticalLineTo(18.44f)
            lineTo(18.224f, 17.219f)
            curveTo(18.49f, 16.953f, 18.907f, 16.928f, 19.201f, 17.146f)
            lineTo(19.285f, 17.219f)
            curveTo(19.551f, 17.485f, 19.575f, 17.902f, 19.358f, 18.195f)
            lineTo(19.285f, 18.279f)
            lineTo(16.918f, 20.649f)
            curveTo(16.792f, 20.858f, 16.542f, 21f, 16.254f, 21f)
            curveTo(15.966f, 21f, 15.716f, 20.858f, 15.59f, 20.65f)
            lineTo(13.223f, 18.279f)
            curveTo(12.93f, 17.987f, 12.93f, 17.512f, 13.223f, 17.219f)
            close()
            moveTo(6.25f, 3.992f)
            curveTo(5.007f, 3.992f, 4f, 5f, 4f, 6.242f)
            verticalLineTo(17.742f)
            curveTo(4f, 18.985f, 5.007f, 19.992f, 6.25f, 19.992f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 19.992f, 11f, 19.656f, 11f, 19.242f)
            curveTo(11f, 18.828f, 10.664f, 18.492f, 10.25f, 18.492f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 18.492f, 5.5f, 18.156f, 5.5f, 17.742f)
            verticalLineTo(6.242f)
            curveTo(5.5f, 5.828f, 5.836f, 5.492f, 6.25f, 5.492f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 5.492f, 11f, 5.156f, 11f, 4.742f)
            curveTo(11f, 4.328f, 10.664f, 3.992f, 10.25f, 3.992f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitHeightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowAutofitHeight, contentDescription = null)
    }
}
