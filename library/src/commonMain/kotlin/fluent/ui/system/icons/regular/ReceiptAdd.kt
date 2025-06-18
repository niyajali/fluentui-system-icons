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
package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.ReceiptAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReceiptAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 4.007f, 5.007f, 3f, 6.25f, 3f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 3f, 18f, 4.007f, 18f, 5.25f)
            verticalLineTo(14f)
            horizontalLineTo(22f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(11.978f)
            curveTo(12.275f, 20.537f, 12.514f, 20.034f, 12.686f, 19.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.25f)
            curveTo(16.5f, 4.836f, 16.164f, 4.5f, 15.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 4.5f, 5.5f, 4.836f, 5.5f, 5.25f)
            verticalLineTo(11.076f)
            curveTo(4.977f, 11.157f, 4.474f, 11.3f, 4f, 11.498f)
            verticalLineTo(5.25f)
            close()
            moveTo(13.75f, 12.5f)
            horizontalLineTo(10.654f)
            curveTo(9.85f, 11.832f, 8.883f, 11.354f, 7.821f, 11.134f)
            curveTo(7.943f, 11.05f, 8.091f, 11f, 8.25f, 11f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 11f, 14.5f, 11.336f, 14.5f, 11.75f)
            curveTo(14.5f, 12.164f, 14.164f, 12.5f, 13.75f, 12.5f)
            close()
            moveTo(18f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(18f)
            verticalLineTo(19.5f)
            close()
            moveTo(8.25f, 7f)
            curveTo(7.836f, 7f, 7.5f, 7.336f, 7.5f, 7.75f)
            curveTo(7.5f, 8.164f, 7.836f, 8.5f, 8.25f, 8.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 8.5f, 14.5f, 8.164f, 14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            horizontalLineTo(8.25f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            close()
            moveTo(7.001f, 18f)
            lineTo(7.001f, 20.503f)
            curveTo(7.001f, 20.78f, 6.777f, 21.003f, 6.501f, 21.003f)
            curveTo(6.225f, 21.003f, 6.001f, 20.78f, 6.001f, 20.503f)
            lineTo(6.001f, 18f)
            horizontalLineTo(3.496f)
            curveTo(3.22f, 18f, 2.996f, 17.776f, 2.996f, 17.5f)
            curveTo(2.996f, 17.224f, 3.22f, 17f, 3.496f, 17f)
            horizontalLineTo(6f)
            lineTo(6f, 14.499f)
            curveTo(6f, 14.223f, 6.224f, 13.999f, 6.5f, 13.999f)
            curveTo(6.776f, 13.999f, 7f, 14.223f, 7f, 14.499f)
            lineTo(7f, 17f)
            horizontalLineTo(9.497f)
            curveTo(9.772f, 17f, 9.996f, 17.224f, 9.996f, 17.5f)
            curveTo(9.996f, 17.776f, 9.772f, 18f, 9.497f, 18f)
            horizontalLineTo(7.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReceiptAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReceiptAdd, contentDescription = null)
    }
}
