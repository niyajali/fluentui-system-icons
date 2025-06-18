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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.DismissCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DismissCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF83F54),
                    1f to Color(0xFFCA2134)
                ),
                start = Offset(5.125f, 3.25f),
                end = Offset(18.25f, 22.625f)
            )
        ) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(8.685f, 12.332f),
                end = Offset(12.591f, 16.392f)
            )
        ) {
            moveTo(15.53f, 8.47f)
            lineTo(15.446f, 8.397f)
            curveTo(15.185f, 8.203f, 14.827f, 8.201f, 14.564f, 8.39f)
            lineTo(14.47f, 8.47f)
            lineTo(12f, 10.939f)
            lineTo(9.53f, 8.47f)
            lineTo(9.446f, 8.397f)
            curveTo(9.185f, 8.203f, 8.827f, 8.201f, 8.564f, 8.39f)
            lineTo(8.47f, 8.47f)
            lineTo(8.397f, 8.554f)
            curveTo(8.203f, 8.815f, 8.201f, 9.173f, 8.39f, 9.436f)
            lineTo(8.47f, 9.53f)
            lineTo(10.939f, 12f)
            lineTo(8.47f, 14.47f)
            lineTo(8.397f, 14.554f)
            curveTo(8.203f, 14.815f, 8.201f, 15.173f, 8.39f, 15.436f)
            lineTo(8.47f, 15.53f)
            lineTo(8.554f, 15.603f)
            curveTo(8.815f, 15.797f, 9.173f, 15.799f, 9.436f, 15.61f)
            lineTo(9.53f, 15.53f)
            lineTo(12f, 13.061f)
            lineTo(14.47f, 15.53f)
            lineTo(14.554f, 15.603f)
            curveTo(14.815f, 15.797f, 15.173f, 15.799f, 15.436f, 15.61f)
            lineTo(15.53f, 15.53f)
            lineTo(15.603f, 15.446f)
            curveTo(15.797f, 15.185f, 15.799f, 14.827f, 15.61f, 14.564f)
            lineTo(15.53f, 14.47f)
            lineTo(13.061f, 12f)
            lineTo(15.53f, 9.53f)
            lineTo(15.603f, 9.446f)
            curveTo(15.797f, 9.185f, 15.799f, 8.827f, 15.61f, 8.564f)
            lineTo(15.53f, 8.47f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.DismissCircle, contentDescription = null)
    }
}
