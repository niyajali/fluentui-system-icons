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

public val FluentUi.Filled.TextHeader4LinesCaret: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader4LinesCaret",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 19f)
            curveTo(21.552f, 19f, 22f, 19.448f, 22f, 20f)
            curveTo(22f, 20.552f, 21.552f, 21f, 21f, 21f)
            horizontalLineTo(3f)
            curveTo(2.448f, 21f, 2f, 20.552f, 2f, 20f)
            curveTo(2f, 19.448f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 14f)
            curveTo(21.552f, 14f, 22f, 14.448f, 22f, 15f)
            curveTo(22f, 15.552f, 21.552f, 16f, 21f, 16f)
            horizontalLineTo(3f)
            curveTo(2.448f, 16f, 2f, 15.552f, 2f, 15f)
            curveTo(2f, 14.448f, 2.448f, 14f, 3f, 14f)
            horizontalLineTo(21f)
            close()
            moveTo(3f, 2f)
            curveTo(3.552f, 2f, 4f, 2.448f, 4f, 3f)
            verticalLineTo(5.5f)
            horizontalLineTo(7f)
            verticalLineTo(3.002f)
            curveTo(7f, 2.45f, 7.448f, 2.002f, 8f, 2.002f)
            curveTo(8.552f, 2.002f, 9f, 2.45f, 9f, 3.002f)
            verticalLineTo(9.995f)
            curveTo(9f, 10.547f, 8.552f, 10.995f, 8f, 10.995f)
            curveTo(7.448f, 10.995f, 7f, 10.547f, 7f, 9.995f)
            verticalLineTo(7.5f)
            horizontalLineTo(4f)
            verticalLineTo(10f)
            curveTo(4f, 10.552f, 3.552f, 11f, 3f, 11f)
            curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
            verticalLineTo(3f)
            curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
            close()
            moveTo(14.219f, 2.375f)
            curveTo(14.484f, 2.043f, 14.93f, 1.916f, 15.331f, 2.057f)
            curveTo(15.732f, 2.197f, 16f, 2.575f, 16f, 3f)
            verticalLineTo(7f)
            curveTo(16.552f, 7f, 17f, 7.448f, 17f, 8f)
            curveTo(17f, 8.552f, 16.552f, 9f, 16f, 9f)
            verticalLineTo(10f)
            curveTo(16f, 10.552f, 15.552f, 11f, 15f, 11f)
            curveTo(14.448f, 11f, 14f, 10.552f, 14f, 10f)
            verticalLineTo(9f)
            horizontalLineTo(11f)
            curveTo(10.616f, 9f, 10.265f, 8.78f, 10.099f, 8.434f)
            curveTo(9.932f, 8.087f, 9.979f, 7.675f, 10.219f, 7.375f)
            lineTo(14.219f, 2.375f)
            close()
            moveTo(21.252f, 4.999f)
            curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
            curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.279f)
            lineTo(20.281f, 7.78f)
            curveTo(19.988f, 8.073f, 19.514f, 8.073f, 19.221f, 7.78f)
            lineTo(17.72f, 6.279f)
            curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.558f, 5.462f)
            curveTo(17.674f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
            horizontalLineTo(21.252f)
            close()
            moveTo(13.081f, 7f)
            horizontalLineTo(14f)
            verticalLineTo(5.852f)
            lineTo(13.081f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader4LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader4LinesCaret, contentDescription = null)
    }
}
