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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.ArrowAutofitDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowAutofitDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.952f, 18.102f)
            lineTo(13.036f, 18.2f)
            lineTo(15.391f, 20.557f)
            curveTo(15.57f, 20.83f, 15.895f, 21f, 16.251f, 21f)
            curveTo(16.574f, 21f, 16.87f, 20.861f, 17.056f, 20.632f)
            lineTo(17.061f, 20.625f)
            lineTo(17.107f, 20.561f)
            lineTo(19.465f, 18.2f)
            lineTo(19.55f, 18.102f)
            lineTo(19.555f, 18.094f)
            curveTo(19.814f, 17.746f, 19.817f, 17.269f, 19.565f, 16.917f)
            lineTo(19.559f, 16.909f)
            lineTo(19.46f, 16.792f)
            lineTo(19.354f, 16.701f)
            lineTo(19.347f, 16.695f)
            curveTo(18.998f, 16.437f, 18.521f, 16.434f, 18.17f, 16.686f)
            lineTo(18.161f, 16.692f)
            lineTo(18.052f, 16.785f)
            lineTo(17.25f, 17.587f)
            verticalLineTo(3.897f)
            lineTo(17.242f, 3.788f)
            lineTo(17.24f, 3.779f)
            curveTo(17.168f, 3.315f, 16.729f, 3f, 16.25f, 3f)
            curveTo(15.771f, 3f, 15.332f, 3.315f, 15.26f, 3.779f)
            lineTo(15.258f, 3.789f)
            lineTo(15.25f, 3.897f)
            verticalLineTo(17.586f)
            lineTo(14.451f, 16.786f)
            lineTo(14.353f, 16.701f)
            lineTo(14.345f, 16.695f)
            curveTo(13.953f, 16.405f, 13.398f, 16.437f, 13.043f, 16.792f)
            curveTo(12.688f, 17.147f, 12.656f, 17.703f, 12.946f, 18.094f)
            lineTo(12.952f, 18.102f)
            close()
            moveTo(4f, 17.508f)
            curveTo(4f, 18.889f, 5.119f, 20.008f, 6.5f, 20.008f)
            horizontalLineTo(10.5f)
            curveTo(11.052f, 20.008f, 11.5f, 19.56f, 11.5f, 19.008f)
            curveTo(11.5f, 18.455f, 11.052f, 18.008f, 10.5f, 18.008f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 18.008f, 6f, 17.784f, 6f, 17.508f)
            verticalLineTo(6.508f)
            curveTo(6f, 6.232f, 6.224f, 6.008f, 6.5f, 6.008f)
            horizontalLineTo(12.5f)
            curveTo(13.052f, 6.008f, 13.5f, 5.56f, 13.5f, 5.008f)
            curveTo(13.5f, 4.456f, 13.052f, 4.008f, 12.5f, 4.008f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 4.008f, 4f, 5.127f, 4f, 6.508f)
            verticalLineTo(17.508f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowAutofitDown, contentDescription = null)
    }
}
