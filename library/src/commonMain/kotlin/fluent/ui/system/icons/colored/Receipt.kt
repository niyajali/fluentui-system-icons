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

public val FluentUi.Colored.Receipt: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Receipt",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFE8401),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(21f, 16.8f),
                end = Offset(15.346f, 18.199f),
            ),
        ) {
            moveTo(15f, 14f)
            horizontalLineTo(21f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(15f)
            verticalLineTo(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.645f to Color(0xFFFFB357),
                    1f to Color(0xFFFF921F),
                ),
                start = Offset(5.545f, 3.643f),
                end = Offset(11.378f, 20.965f),
            ),
        ) {
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(14.75f)
            curveTo(15.993f, 3f, 17f, 4.007f, 17f, 5.25f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.6f, 15f),
                end = Offset(6.383f, 17.818f),
            ),
        ) {
            moveTo(6.5f, 7.75f)
            curveTo(6.5f, 7.336f, 6.836f, 7f, 7.25f, 7f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 7f, 13.5f, 7.336f, 13.5f, 7.75f)
            curveTo(13.5f, 8.164f, 13.164f, 8.5f, 12.75f, 8.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 8.5f, 6.5f, 8.164f, 6.5f, 7.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.1f, 7f),
                end = Offset(14.641f, 15.436f),
            ),
        ) {
            moveTo(6.5f, 7.75f)
            curveTo(6.5f, 7.336f, 6.836f, 7f, 7.25f, 7f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 7f, 13.5f, 7.336f, 13.5f, 7.75f)
            curveTo(13.5f, 8.164f, 13.164f, 8.5f, 12.75f, 8.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 8.5f, 6.5f, 8.164f, 6.5f, 7.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.6f, 15f),
                end = Offset(6.383f, 17.818f),
            ),
        ) {
            moveTo(6.5f, 11.75f)
            curveTo(6.5f, 11.336f, 6.836f, 11f, 7.25f, 11f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 11f, 13.5f, 11.336f, 13.5f, 11.75f)
            curveTo(13.5f, 12.164f, 13.164f, 12.5f, 12.75f, 12.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 12.5f, 6.5f, 12.164f, 6.5f, 11.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.1f, 7f),
                end = Offset(14.641f, 15.436f),
            ),
        ) {
            moveTo(6.5f, 11.75f)
            curveTo(6.5f, 11.336f, 6.836f, 11f, 7.25f, 11f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 11f, 13.5f, 11.336f, 13.5f, 11.75f)
            curveTo(13.5f, 12.164f, 13.164f, 12.5f, 12.75f, 12.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 12.5f, 6.5f, 12.164f, 6.5f, 11.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.6f, 15f),
                end = Offset(6.383f, 17.818f),
            ),
        ) {
            moveTo(6.5f, 15.75f)
            curveTo(6.5f, 15.336f, 6.836f, 15f, 7.25f, 15f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 15f, 11f, 15.336f, 11f, 15.75f)
            curveTo(11f, 16.164f, 10.664f, 16.5f, 10.25f, 16.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 16.5f, 6.5f, 16.164f, 6.5f, 15.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407),
                ),
                start = Offset(5.1f, 7f),
                end = Offset(14.641f, 15.436f),
            ),
        ) {
            moveTo(6.5f, 15.75f)
            curveTo(6.5f, 15.336f, 6.836f, 15f, 7.25f, 15f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 15f, 11f, 15.336f, 11f, 15.75f)
            curveTo(11f, 16.164f, 10.664f, 16.5f, 10.25f, 16.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 16.5f, 6.5f, 16.164f, 6.5f, 15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReceiptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Receipt, contentDescription = null)
    }
}
