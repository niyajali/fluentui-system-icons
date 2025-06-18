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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowAutofitWidth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitWidth",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 6.242f)
            curveTo(20f, 5f, 18.993f, 3.992f, 17.75f, 3.992f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 3.992f, 4f, 5f, 4f, 6.242f)
            verticalLineTo(10.242f)
            curveTo(4f, 10.656f, 4.336f, 10.992f, 4.75f, 10.992f)
            curveTo(5.164f, 10.992f, 5.5f, 10.656f, 5.5f, 10.242f)
            verticalLineTo(6.242f)
            curveTo(5.5f, 5.828f, 5.836f, 5.492f, 6.25f, 5.492f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 5.492f, 18.5f, 5.828f, 18.5f, 6.242f)
            verticalLineTo(10.242f)
            curveTo(18.5f, 10.656f, 18.836f, 10.992f, 19.25f, 10.992f)
            curveTo(19.664f, 10.992f, 20f, 10.656f, 20f, 10.242f)
            verticalLineTo(6.242f)
            close()
            moveTo(17.219f, 13.22f)
            curveTo(17.485f, 12.953f, 17.902f, 12.929f, 18.195f, 13.147f)
            lineTo(18.279f, 13.22f)
            lineTo(20.65f, 15.587f)
            curveTo(20.858f, 15.713f, 21f, 15.963f, 21f, 16.251f)
            curveTo(21f, 16.503f, 20.891f, 16.726f, 20.724f, 16.862f)
            lineTo(20.649f, 16.915f)
            lineTo(18.279f, 19.282f)
            lineTo(18.195f, 19.355f)
            curveTo(17.934f, 19.548f, 17.576f, 19.551f, 17.313f, 19.362f)
            lineTo(17.219f, 19.282f)
            lineTo(17.146f, 19.198f)
            curveTo(16.953f, 18.937f, 16.95f, 18.579f, 17.139f, 18.315f)
            lineTo(17.219f, 18.221f)
            lineTo(18.44f, 17f)
            horizontalLineTo(14.656f)
            lineTo(14.567f, 16.993f)
            curveTo(14.247f, 16.943f, 14f, 16.63f, 14f, 16.25f)
            curveTo(14f, 15.87f, 14.247f, 15.557f, 14.567f, 15.507f)
            lineTo(14.656f, 15.5f)
            horizontalLineTo(18.44f)
            lineTo(17.219f, 14.28f)
            lineTo(17.146f, 14.196f)
            curveTo(16.928f, 13.903f, 16.953f, 13.486f, 17.219f, 13.22f)
            close()
            moveTo(6.781f, 13.223f)
            curveTo(7.047f, 13.489f, 7.072f, 13.906f, 6.854f, 14.199f)
            lineTo(6.781f, 14.283f)
            lineTo(5.56f, 15.503f)
            horizontalLineTo(9.344f)
            curveTo(9.706f, 15.503f, 10f, 15.839f, 10f, 16.253f)
            curveTo(10f, 16.632f, 9.753f, 16.946f, 9.433f, 16.996f)
            lineTo(9.344f, 17.003f)
            horizontalLineTo(5.56f)
            lineTo(6.781f, 18.224f)
            curveTo(7.047f, 18.49f, 7.072f, 18.907f, 6.854f, 19.201f)
            lineTo(6.781f, 19.285f)
            curveTo(6.515f, 19.551f, 6.098f, 19.575f, 5.805f, 19.358f)
            lineTo(5.72f, 19.285f)
            lineTo(3.351f, 16.918f)
            curveTo(3.142f, 16.792f, 3f, 16.542f, 3f, 16.254f)
            curveTo(3f, 15.966f, 3.142f, 15.716f, 3.35f, 15.59f)
            lineTo(5.72f, 13.223f)
            curveTo(6.013f, 12.93f, 6.488f, 12.93f, 6.781f, 13.223f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowAutofitWidth, contentDescription = null)
    }
}
