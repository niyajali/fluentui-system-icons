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

public val FluentIcons.Colored.LocationRipple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.LocationRipple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF7B7BFF),
                    0.502f to Color(0xFFA3A3FF),
                    1f to Color(0xFFCEB0FF),
                ),
                center = Offset(11.357f, 17.667f),
                radius = 14.392f,
            ),
        ) {
            moveTo(21f, 19f)
            curveTo(21f, 21.5f, 16.971f, 23f, 12f, 23f)
            curveTo(7.029f, 23f, 3f, 21.5f, 3f, 19f)
            curveTo(3f, 16.594f, 7.029f, 15f, 12f, 15f)
            curveTo(16.971f, 15f, 21f, 16.5f, 21f, 19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D),
                ),
                start = Offset(1.219f, -2.857f),
                end = Offset(13.202f, 16.549f),
            ),
        ) {
            moveTo(12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.358f, 4.5f, 9.5f)
            curveTo(4.5f, 11.432f, 5.564f, 13.301f, 6.768f, 14.816f)
            curveTo(7.988f, 16.353f, 9.446f, 17.645f, 10.423f, 18.438f)
            curveTo(11.349f, 19.188f, 12.651f, 19.188f, 13.577f, 18.438f)
            curveTo(14.554f, 17.645f, 16.012f, 16.353f, 17.232f, 14.816f)
            curveTo(18.436f, 13.301f, 19.5f, 11.432f, 19.5f, 9.5f)
            curveTo(19.5f, 5.358f, 16.142f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6),
                ),
                start = Offset(9.79f, 9.721f),
                end = Offset(12.394f, 12.428f),
            ),
        ) {
            moveTo(14.5f, 9.5f)
            curveTo(14.5f, 10.881f, 13.381f, 12f, 12f, 12f)
            curveTo(10.619f, 12f, 9.5f, 10.881f, 9.5f, 9.5f)
            curveTo(9.5f, 8.119f, 10.619f, 7f, 12f, 7f)
            curveTo(13.381f, 7f, 14.5f, 8.119f, 14.5f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationRipplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.LocationRipple, contentDescription = null)
    }
}
