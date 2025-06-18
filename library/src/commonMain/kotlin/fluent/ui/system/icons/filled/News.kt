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

public val FluentUi.Filled.News: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.News",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.75f, 4f)
            curveTo(17.941f, 4f, 18.916f, 4.925f, 18.995f, 6.096f)
            lineTo(19f, 6.25f)
            verticalLineTo(17.5f)
            curveTo(19f, 17.776f, 19.224f, 18f, 19.5f, 18f)
            curveTo(19.746f, 18f, 19.95f, 17.823f, 19.992f, 17.59f)
            lineTo(20f, 17.5f)
            lineTo(20.001f, 7.014f)
            curveTo(21.072f, 7.132f, 21.916f, 8.003f, 21.994f, 9.086f)
            lineTo(22f, 9.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.059f, 2.925f, 4.084f, 4.096f, 4.005f)
            lineTo(4.25f, 4f)
            horizontalLineTo(16.75f)
            close()
            moveTo(9.248f, 11f)
            horizontalLineTo(5.748f)
            curveTo(5.334f, 11f, 4.998f, 11.336f, 4.998f, 11.75f)
            verticalLineTo(15.25f)
            curveTo(4.998f, 15.664f, 5.334f, 16f, 5.748f, 16f)
            horizontalLineTo(9.248f)
            curveTo(9.662f, 16f, 9.998f, 15.664f, 9.998f, 15.25f)
            verticalLineTo(11.75f)
            curveTo(9.998f, 11.336f, 9.662f, 11f, 9.248f, 11f)
            close()
            moveTo(15.252f, 14.5f)
            horizontalLineTo(12.754f)
            lineTo(12.652f, 14.507f)
            curveTo(12.286f, 14.557f, 12.004f, 14.87f, 12.004f, 15.25f)
            curveTo(12.004f, 15.664f, 12.34f, 16f, 12.754f, 16f)
            horizontalLineTo(15.252f)
            lineTo(15.354f, 15.993f)
            curveTo(15.72f, 15.943f, 16.002f, 15.63f, 16.002f, 15.25f)
            curveTo(16.002f, 14.836f, 15.667f, 14.5f, 15.252f, 14.5f)
            close()
            moveTo(8.498f, 12.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(6.498f)
            verticalLineTo(12.5f)
            horizontalLineTo(8.498f)
            close()
            moveTo(15.251f, 11f)
            lineTo(12.753f, 11.005f)
            lineTo(12.651f, 11.012f)
            curveTo(12.285f, 11.062f, 12.003f, 11.376f, 12.004f, 11.756f)
            curveTo(12.005f, 12.17f, 12.341f, 12.505f, 12.755f, 12.505f)
            lineTo(15.254f, 12.5f)
            lineTo(15.355f, 12.493f)
            curveTo(15.721f, 12.443f, 16.003f, 12.128f, 16.002f, 11.749f)
            curveTo(16.001f, 11.334f, 15.665f, 10.999f, 15.251f, 11f)
            close()
            moveTo(15.252f, 7.504f)
            horizontalLineTo(5.748f)
            lineTo(5.646f, 7.511f)
            curveTo(5.28f, 7.561f, 4.998f, 7.875f, 4.998f, 8.254f)
            curveTo(4.998f, 8.669f, 5.334f, 9.004f, 5.748f, 9.004f)
            horizontalLineTo(15.252f)
            lineTo(15.354f, 8.998f)
            curveTo(15.72f, 8.948f, 16.002f, 8.634f, 16.002f, 8.254f)
            curveTo(16.002f, 7.84f, 15.667f, 7.504f, 15.252f, 7.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NewsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.News, contentDescription = null)
    }
}
