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

public val FluentUi.Filled.TextFont: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFont",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.001f, 2f)
            curveTo(7.421f, 2f, 7.797f, 2.263f, 7.941f, 2.658f)
            lineTo(10.822f, 10.584f)
            lineTo(9.712f, 13.382f)
            lineTo(9.209f, 12f)
            horizontalLineTo(4.792f)
            lineTo(3.94f, 14.342f)
            curveTo(3.751f, 14.861f, 3.178f, 15.128f, 2.658f, 14.94f)
            curveTo(2.139f, 14.751f, 1.872f, 14.177f, 2.06f, 13.658f)
            lineTo(6.061f, 2.658f)
            curveTo(6.205f, 2.263f, 6.58f, 2f, 7.001f, 2f)
            close()
            moveTo(5.519f, 10f)
            horizontalLineTo(8.482f)
            lineTo(7.001f, 5.926f)
            lineTo(5.519f, 10f)
            close()
            moveTo(15.368f, 6.528f)
            curveTo(15.217f, 6.147f, 14.848f, 5.896f, 14.438f, 5.896f)
            curveTo(14.028f, 5.896f, 13.66f, 6.146f, 13.509f, 6.527f)
            lineTo(8.151f, 20.023f)
            lineTo(8f, 20.023f)
            curveTo(7.448f, 20.023f, 7f, 20.471f, 7f, 21.023f)
            curveTo(7f, 21.576f, 7.448f, 22.023f, 8f, 22.023f)
            lineTo(8.81f, 22.023f)
            curveTo(8.823f, 22.024f, 8.836f, 22.024f, 8.85f, 22.023f)
            lineTo(11f, 22.023f)
            curveTo(11.552f, 22.023f, 12f, 21.576f, 12f, 21.023f)
            curveTo(12f, 20.471f, 11.552f, 20.023f, 11f, 20.023f)
            lineTo(10.303f, 20.023f)
            lineTo(11.106f, 18f)
            horizontalLineTo(17.759f)
            lineTo(18.56f, 20.023f)
            lineTo(18f, 20.023f)
            curveTo(17.448f, 20.023f, 17f, 20.471f, 17f, 21.023f)
            curveTo(17f, 21.576f, 17.448f, 22.023f, 18f, 22.023f)
            lineTo(20.014f, 22.023f)
            curveTo(20.026f, 22.024f, 20.037f, 22.024f, 20.049f, 22.023f)
            lineTo(21.009f, 22.023f)
            curveTo(21.561f, 22.023f, 22.009f, 21.576f, 22.009f, 21.023f)
            curveTo(22.009f, 20.471f, 21.561f, 20.023f, 21.009f, 20.023f)
            lineTo(20.711f, 20.023f)
            lineTo(15.368f, 6.528f)
            close()
            moveTo(16.967f, 16f)
            horizontalLineTo(11.9f)
            lineTo(14.437f, 9.609f)
            lineTo(16.967f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextFontPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextFont, contentDescription = null)
    }
}
