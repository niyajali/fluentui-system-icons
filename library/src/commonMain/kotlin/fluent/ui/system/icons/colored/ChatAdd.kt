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

public val FluentIcons.Colored.ChatAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ChatAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1),
                ),
                start = Offset(2.714f, 5.751f),
                end = Offset(20.178f, 35.521f),
            ),
        ) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(10.36f, 22f, 8.775f, 21.604f, 7.356f, 20.858f)
            lineTo(3.065f, 21.975f)
            curveTo(2.611f, 22.094f, 2.147f, 21.821f, 2.029f, 21.367f)
            curveTo(1.992f, 21.227f, 1.992f, 21.079f, 2.029f, 20.939f)
            lineTo(3.145f, 16.65f)
            curveTo(2.397f, 15.229f, 2f, 13.643f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12.75f, 7.75f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            curveTo(11.586f, 7f, 11.25f, 7.336f, 11.25f, 7.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
            horizontalLineTo(11.25f)
            verticalLineTo(16.25f)
            curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
            curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
            horizontalLineTo(12.75f)
            verticalLineTo(7.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF),
                ),
                start = Offset(7.875f, 7.176f),
                end = Offset(9.537f, 17.893f),
            ),
        ) {
            moveTo(12.75f, 7.75f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            curveTo(11.586f, 7f, 11.25f, 7.336f, 11.25f, 7.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
            horizontalLineTo(11.25f)
            verticalLineTo(16.25f)
            curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
            curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
            horizontalLineTo(12.75f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ChatAdd, contentDescription = null)
    }
}
