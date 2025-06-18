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

public val FluentUi.Filled.TextIndentIncreaseRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentIncreaseRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 8f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 8f, 5.5f, 7.552f, 5.5f, 7f)
            curveTo(5.5f, 6.487f, 5.886f, 6.064f, 6.383f, 6.007f)
            lineTo(6.5f, 6f)
            horizontalLineTo(15f)
            curveTo(15.552f, 6f, 16f, 6.448f, 16f, 7f)
            curveTo(16f, 7.513f, 15.614f, 7.936f, 15.117f, 7.993f)
            lineTo(15f, 8f)
            horizontalLineTo(6.5f)
            horizontalLineTo(15f)
            close()
            moveTo(21.707f, 14.707f)
            curveTo(21.347f, 15.068f, 20.779f, 15.095f, 20.387f, 14.79f)
            lineTo(20.293f, 14.707f)
            lineTo(18.293f, 12.707f)
            curveTo(17.932f, 12.347f, 17.905f, 11.779f, 18.21f, 11.387f)
            lineTo(18.293f, 11.293f)
            lineTo(20.293f, 9.293f)
            curveTo(20.683f, 8.902f, 21.317f, 8.902f, 21.707f, 9.293f)
            curveTo(22.068f, 9.653f, 22.095f, 10.221f, 21.79f, 10.613f)
            lineTo(21.707f, 10.707f)
            lineTo(20.414f, 12f)
            lineTo(21.707f, 13.293f)
            curveTo(22.098f, 13.683f, 22.098f, 14.317f, 21.707f, 14.707f)
            close()
            moveTo(15f, 13f)
            lineTo(3.5f, 13.001f)
            curveTo(2.948f, 13.001f, 2.5f, 12.554f, 2.5f, 12.001f)
            curveTo(2.5f, 11.488f, 2.886f, 11.066f, 3.383f, 11.008f)
            lineTo(3.5f, 11.001f)
            lineTo(15f, 11f)
            curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
            curveTo(16f, 12.513f, 15.614f, 12.935f, 15.117f, 12.993f)
            lineTo(15f, 13f)
            lineTo(3.5f, 13.001f)
            lineTo(15f, 13f)
            close()
            moveTo(15f, 18f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 18f, 5.5f, 17.552f, 5.5f, 17f)
            curveTo(5.5f, 16.487f, 5.886f, 16.065f, 6.383f, 16.007f)
            lineTo(6.5f, 16f)
            horizontalLineTo(15f)
            curveTo(15.552f, 16f, 16f, 16.448f, 16f, 17f)
            curveTo(16f, 17.513f, 15.614f, 17.935f, 15.117f, 17.993f)
            lineTo(15f, 18f)
            horizontalLineTo(6.5f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextIndentIncreaseRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextIndentIncreaseRtl, contentDescription = null)
    }
}
