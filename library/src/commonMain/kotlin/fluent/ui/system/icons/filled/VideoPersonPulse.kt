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

public val FluentUi.Filled.VideoPersonPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPersonPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.745f, 3f)
            curveTo(20.988f, 3f, 21.995f, 4.007f, 21.995f, 5.25f)
            verticalLineTo(12.805f)
            curveTo(21.551f, 12.38f, 21.046f, 12.016f, 20.495f, 11.73f)
            verticalLineTo(5.25f)
            curveTo(20.495f, 4.836f, 20.16f, 4.5f, 19.745f, 4.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 4.5f, 3.5f, 4.836f, 3.5f, 5.25f)
            verticalLineTo(16.755f)
            curveTo(3.5f, 17.169f, 3.836f, 17.505f, 4.25f, 17.505f)
            lineTo(6.999f, 17.504f)
            lineTo(7f, 14.75f)
            curveTo(7f, 13.832f, 7.707f, 13.079f, 8.606f, 13.006f)
            lineTo(8.75f, 13f)
            horizontalLineTo(12.81f)
            curveTo(11.689f, 14.168f, 11f, 15.753f, 11f, 17.5f)
            curveTo(11f, 18.018f, 11.061f, 18.522f, 11.175f, 19.005f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19.005f, 2f, 17.997f, 2f, 16.755f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.007f, 3.007f, 3f, 4.25f, 3f)
            horizontalLineTo(19.745f)
            close()
            moveTo(12f, 6f)
            curveTo(13.657f, 6f, 15f, 7.344f, 15f, 9f)
            curveTo(15f, 10.657f, 13.657f, 12f, 12f, 12f)
            curveTo(10.343f, 12f, 9f, 10.657f, 9f, 9f)
            curveTo(9f, 7.344f, 10.343f, 6f, 12f, 6f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(16.015f, 14.5f)
            curveTo(16.224f, 14.506f, 16.408f, 14.643f, 16.474f, 14.842f)
            lineTo(17.528f, 18.002f)
            lineTo(18.532f, 15.324f)
            curveTo(18.602f, 15.138f, 18.775f, 15.011f, 18.974f, 15.001f)
            curveTo(19.172f, 14.99f, 19.358f, 15.099f, 19.447f, 15.276f)
            lineTo(20.309f, 17f)
            horizontalLineTo(21f)
            curveTo(21.276f, 17f, 21.5f, 17.224f, 21.5f, 17.5f)
            curveTo(21.5f, 17.776f, 21.276f, 18f, 21f, 18f)
            horizontalLineTo(20f)
            curveTo(19.811f, 18f, 19.638f, 17.893f, 19.553f, 17.724f)
            lineTo(19.066f, 16.749f)
            lineTo(17.968f, 19.676f)
            curveTo(17.894f, 19.874f, 17.702f, 20.004f, 17.491f, 20f)
            curveTo(17.279f, 19.996f, 17.093f, 19.859f, 17.026f, 19.658f)
            lineTo(15.957f, 16.453f)
            lineTo(15.464f, 17.686f)
            curveTo(15.388f, 17.875f, 15.205f, 18f, 15f, 18f)
            horizontalLineTo(14f)
            curveTo(13.724f, 18f, 13.5f, 17.776f, 13.5f, 17.5f)
            curveTo(13.5f, 17.224f, 13.724f, 17f, 14f, 17f)
            horizontalLineTo(14.661f)
            lineTo(15.536f, 14.814f)
            curveTo(15.614f, 14.62f, 15.805f, 14.494f, 16.015f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoPersonPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoPersonPulse, contentDescription = null)
    }
}
