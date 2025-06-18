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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Certificate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Certificate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(2.714f, 5.813f),
                end = Offset(12.547f, 19.433f),
            ),
        ) {
            moveTo(4.75f, 3f)
            curveTo(3.231f, 3f, 2f, 4.231f, 2f, 5.75f)
            verticalLineTo(14f)
            horizontalLineTo(2.5f)
            curveTo(2.5f, 14.954f, 2.881f, 15.818f, 3.5f, 16.449f)
            verticalLineTo(18f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 18f, 22f, 16.769f, 22f, 15.25f)
            verticalLineTo(5.75f)
            curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
            horizontalLineTo(4.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF),
                ),
                start = Offset(23.4f, 21.95f),
                end = Offset(15.824f, 0.869f),
            ),
            fillAlpha = 0.9f,
        ) {
            moveTo(6.75f, 7f)
            curveTo(6.336f, 7f, 6f, 7.336f, 6f, 7.75f)
            curveTo(6f, 8.164f, 6.336f, 8.5f, 6.75f, 8.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 8.5f, 18f, 8.164f, 18f, 7.75f)
            curveTo(18f, 7.336f, 17.664f, 7f, 17.25f, 7f)
            horizontalLineTo(6.75f)
            close()
            moveTo(12.75f, 12f)
            curveTo(12.336f, 12f, 12f, 12.336f, 12f, 12.75f)
            curveTo(12f, 13.164f, 12.336f, 13.5f, 12.75f, 13.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 13.5f, 18f, 13.164f, 18f, 12.75f)
            curveTo(18f, 12.336f, 17.664f, 12f, 17.25f, 12f)
            horizontalLineTo(12.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF),
                ),
                center = Offset(6f, 15.064f),
                radius = 9.457f,
            ),
        ) {
            moveTo(9.001f, 16f)
            curveTo(8.165f, 16.628f, 7.126f, 17f, 6f, 17f)
            curveTo(4.875f, 17f, 3.836f, 16.628f, 3.001f, 16.001f)
            lineTo(3f, 21.249f)
            curveTo(3f, 21.819f, 3.605f, 22.168f, 4.09f, 21.918f)
            lineTo(4.18f, 21.864f)
            lineTo(6f, 20.591f)
            lineTo(7.82f, 21.864f)
            curveTo(8.288f, 22.19f, 8.92f, 21.895f, 8.992f, 21.353f)
            lineTo(8.999f, 21.249f)
            lineTo(9.001f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.772f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505),
                ),
                center = Offset(-15.29f, -18.004f),
                radius = 44.661f,
            ),
        ) {
            moveTo(6f, 10f)
            curveTo(3.79f, 10f, 1.999f, 11.791f, 1.999f, 14.001f)
            curveTo(1.999f, 16.21f, 3.79f, 18.001f, 6f, 18.001f)
            curveTo(8.209f, 18.001f, 10f, 16.21f, 10f, 14.001f)
            curveTo(10f, 11.791f, 8.209f, 10f, 6f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CertificatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Certificate, contentDescription = null)
    }
}
