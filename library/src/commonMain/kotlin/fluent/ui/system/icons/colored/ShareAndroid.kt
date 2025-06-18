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

public val FluentIcons.Colored.ShareAndroid: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ShareAndroid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(4.988f, 5.349f),
                end = Offset(10.03f, 18.759f),
            ),
        ) {
            moveTo(16.628f, 5.349f)
            lineTo(17.372f, 6.651f)
            lineTo(8.012f, 12f)
            lineTo(17.372f, 17.349f)
            lineTo(16.628f, 18.651f)
            lineTo(4.988f, 12f)
            lineTo(16.628f, 5.349f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(17f, 18f),
                radius = 4.717f,
            ),
        ) {
            moveTo(16.628f, 5.349f)
            lineTo(17.372f, 6.651f)
            lineTo(8.012f, 12f)
            lineTo(17.372f, 17.349f)
            lineTo(16.628f, 18.651f)
            lineTo(4.988f, 12f)
            lineTo(16.628f, 5.349f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(6.5f, 12f),
                radius = 4.5f,
            ),
        ) {
            moveTo(16.628f, 5.349f)
            lineTo(17.372f, 6.651f)
            lineTo(8.012f, 12f)
            lineTo(17.372f, 17.349f)
            lineTo(16.628f, 18.651f)
            lineTo(4.988f, 12f)
            lineTo(16.628f, 5.349f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(17f, 6f),
                radius = 4.598f,
            ),
        ) {
            moveTo(16.628f, 5.349f)
            lineTo(17.372f, 6.651f)
            lineTo(8.012f, 12f)
            lineTo(17.372f, 17.349f)
            lineTo(16.628f, 18.651f)
            lineTo(4.988f, 12f)
            lineTo(16.628f, 5.349f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4),
                ),
                center = Offset(9.271f, 6.698f),
                radius = 18.93f,
            ),
        ) {
            moveTo(20.5f, 18f)
            curveTo(20.5f, 19.933f, 18.933f, 21.5f, 17f, 21.5f)
            curveTo(15.067f, 21.5f, 13.5f, 19.933f, 13.5f, 18f)
            curveTo(13.5f, 16.067f, 15.067f, 14.5f, 17f, 14.5f)
            curveTo(18.933f, 14.5f, 20.5f, 16.067f, 20.5f, 18f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4),
                ),
                center = Offset(-1.229f, 0.698f),
                radius = 18.93f,
            ),
        ) {
            moveTo(10f, 12f)
            curveTo(10f, 13.933f, 8.433f, 15.5f, 6.5f, 15.5f)
            curveTo(4.567f, 15.5f, 3f, 13.933f, 3f, 12f)
            curveTo(3f, 10.067f, 4.567f, 8.5f, 6.5f, 8.5f)
            curveTo(8.433f, 8.5f, 10f, 10.067f, 10f, 12f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4),
                ),
                center = Offset(9.271f, -5.302f),
                radius = 18.93f,
            ),
        ) {
            moveTo(20.5f, 6f)
            curveTo(20.5f, 7.933f, 18.933f, 9.5f, 17f, 9.5f)
            curveTo(15.067f, 9.5f, 13.5f, 7.933f, 13.5f, 6f)
            curveTo(13.5f, 4.067f, 15.067f, 2.5f, 17f, 2.5f)
            curveTo(18.933f, 2.5f, 20.5f, 4.067f, 20.5f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareAndroidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ShareAndroid, contentDescription = null)
    }
}
