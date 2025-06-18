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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.WifiWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.WifiWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.114f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF),
                ),
                center = Offset(12f, 17.3f),
                radius = 12.492f,
            ),
        ) {
            moveTo(17.784f, 10.708f)
            curveTo(18.381f, 11.305f, 18.896f, 12.026f, 19.288f, 12.793f)
            curveTo(19.539f, 13.285f, 19.344f, 13.887f, 18.853f, 14.139f)
            curveTo(18.361f, 14.39f, 17.759f, 14.196f, 17.507f, 13.704f)
            curveTo(17.207f, 13.118f, 16.814f, 12.566f, 16.37f, 12.123f)
            curveTo(13.977f, 9.729f, 10.097f, 9.729f, 7.704f, 12.123f)
            curveTo(7.239f, 12.587f, 6.861f, 13.11f, 6.57f, 13.685f)
            curveTo(6.321f, 14.177f, 5.72f, 14.375f, 5.227f, 14.126f)
            curveTo(4.734f, 13.876f, 4.536f, 13.275f, 4.786f, 12.782f)
            curveTo(5.172f, 12.019f, 5.674f, 11.324f, 6.289f, 10.708f)
            curveTo(9.464f, 7.534f, 14.61f, 7.534f, 17.784f, 10.708f)
            close()
            moveTo(15.735f, 13.7f)
            curveTo(16.196f, 14.16f, 16.573f, 14.724f, 16.837f, 15.324f)
            curveTo(17.058f, 15.83f, 16.828f, 16.42f, 16.322f, 16.642f)
            curveTo(15.816f, 16.863f, 15.226f, 16.633f, 15.005f, 16.127f)
            curveTo(14.839f, 15.75f, 14.601f, 15.394f, 14.321f, 15.114f)
            curveTo(13.059f, 13.852f, 11.012f, 13.852f, 9.749f, 15.114f)
            curveTo(9.471f, 15.392f, 9.244f, 15.733f, 9.077f, 16.114f)
            curveTo(8.856f, 16.62f, 8.266f, 16.851f, 7.76f, 16.629f)
            curveTo(7.254f, 16.408f, 7.024f, 15.818f, 7.245f, 15.313f)
            curveTo(7.509f, 14.709f, 7.875f, 14.16f, 8.335f, 13.7f)
            curveTo(10.379f, 11.656f, 13.692f, 11.656f, 15.735f, 13.7f)
            close()
            moveTo(20.419f, 8.299f)
            curveTo(20.927f, 8.807f, 21.406f, 9.386f, 21.823f, 9.99f)
            curveTo(22.137f, 10.445f, 22.023f, 11.068f, 21.568f, 11.381f)
            curveTo(21.114f, 11.695f, 20.491f, 11.581f, 20.177f, 11.126f)
            curveTo(19.827f, 10.62f, 19.426f, 10.133f, 19.005f, 9.713f)
            curveTo(15.133f, 5.841f, 8.854f, 5.841f, 4.982f, 9.713f)
            curveTo(4.583f, 10.112f, 4.185f, 10.599f, 3.822f, 11.122f)
            curveTo(3.507f, 11.576f, 2.884f, 11.689f, 2.43f, 11.374f)
            curveTo(1.976f, 11.059f, 1.864f, 10.436f, 2.178f, 9.982f)
            curveTo(2.606f, 9.365f, 3.079f, 8.788f, 3.568f, 8.299f)
            curveTo(8.221f, 3.645f, 15.766f, 3.645f, 20.419f, 8.299f)
            close()
            moveTo(13.061f, 16.441f)
            curveTo(13.648f, 17.027f, 13.648f, 17.978f, 13.061f, 18.564f)
            curveTo(12.475f, 19.15f, 11.525f, 19.15f, 10.939f, 18.564f)
            curveTo(10.352f, 17.978f, 10.352f, 17.027f, 10.939f, 16.441f)
            curveTo(11.525f, 15.855f, 12.475f, 15.855f, 13.061f, 16.441f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401),
                ),
                start = Offset(13.723f, 10.281f),
                end = Offset(20.941f, 24.031f),
            ),
        ) {
            moveTo(16.161f, 12.83f)
            lineTo(12.164f, 20.828f)
            curveTo(11.665f, 21.826f, 12.391f, 23f, 13.507f, 23f)
            horizontalLineTo(21.501f)
            curveTo(22.617f, 23f, 23.342f, 21.826f, 22.844f, 20.828f)
            lineTo(18.847f, 12.83f)
            curveTo(18.294f, 11.723f, 16.714f, 11.723f, 16.161f, 12.83f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121),
                ),
                start = Offset(16.17f, 14.995f),
                end = Offset(19.376f, 20.696f),
            ),
        ) {
            moveTo(18.005f, 15.495f)
            verticalLineTo(18.497f)
            curveTo(18.005f, 18.773f, 17.781f, 18.997f, 17.504f, 18.997f)
            curveTo(17.228f, 18.997f, 17.004f, 18.773f, 17.004f, 18.497f)
            verticalLineTo(15.495f)
            curveTo(17.004f, 15.219f, 17.228f, 14.995f, 17.504f, 14.995f)
            curveTo(17.781f, 14.995f, 18.005f, 15.219f, 18.005f, 15.495f)
            close()
            moveTo(17.504f, 20.999f)
            curveTo(17.228f, 20.999f, 17.004f, 20.775f, 17.004f, 20.498f)
            curveTo(17.004f, 20.222f, 17.228f, 19.998f, 17.504f, 19.998f)
            curveTo(17.781f, 19.998f, 18.005f, 20.222f, 18.005f, 20.498f)
            curveTo(18.005f, 20.775f, 17.781f, 20.999f, 17.504f, 20.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WifiWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.WifiWarning, contentDescription = null)
    }
}
