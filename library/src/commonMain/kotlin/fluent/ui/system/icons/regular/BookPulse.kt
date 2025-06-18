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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.BookPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.691f, 7.458f)
            curveTo(11.577f, 7.188f, 11.316f, 7.01f, 11.024f, 7f)
            curveTo(10.731f, 6.991f, 10.46f, 7.153f, 10.329f, 7.415f)
            lineTo(8.786f, 10.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 10.5f, 7f, 10.836f, 7f, 11.25f)
            curveTo(7f, 11.664f, 7.336f, 12f, 7.75f, 12f)
            horizontalLineTo(9.25f)
            curveTo(9.534f, 12f, 9.794f, 11.84f, 9.921f, 11.585f)
            lineTo(10.943f, 9.541f)
            lineTo(13.059f, 14.542f)
            curveTo(13.17f, 14.804f, 13.419f, 14.98f, 13.702f, 14.998f)
            curveTo(13.986f, 15.017f, 14.255f, 14.873f, 14.398f, 14.628f)
            lineTo(15.931f, 12f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 12f, 17.5f, 11.664f, 17.5f, 11.25f)
            curveTo(17.5f, 10.836f, 17.164f, 10.5f, 16.75f, 10.5f)
            horizontalLineTo(15.5f)
            curveTo(15.233f, 10.5f, 14.987f, 10.642f, 14.852f, 10.872f)
            lineTo(13.857f, 12.578f)
            lineTo(11.691f, 7.458f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
            curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.5f)
            curveTo(5.5f, 3.948f, 5.948f, 3.5f, 6.5f, 3.5f)
            horizontalLineTo(18f)
            curveTo(18.552f, 3.5f, 19f, 3.948f, 19f, 4.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookPulse, contentDescription = null)
    }
}
