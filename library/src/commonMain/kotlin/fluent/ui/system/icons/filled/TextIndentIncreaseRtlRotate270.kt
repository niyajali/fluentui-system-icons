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

public val FluentUi.Filled.TextIndentIncreaseRtlRotate270: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentIncreaseRtlRotate270",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 9f)
            verticalLineTo(17.5f)
            curveTo(8f, 18.052f, 7.552f, 18.5f, 7f, 18.5f)
            curveTo(6.487f, 18.5f, 6.064f, 18.114f, 6.007f, 17.617f)
            lineTo(6f, 17.5f)
            lineTo(6f, 9f)
            curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
            curveTo(7.513f, 8f, 7.936f, 8.386f, 7.993f, 8.883f)
            lineTo(8f, 9f)
            verticalLineTo(17.5f)
            verticalLineTo(9f)
            close()
            moveTo(14.707f, 2.293f)
            curveTo(15.068f, 2.653f, 15.095f, 3.221f, 14.79f, 3.613f)
            lineTo(14.707f, 3.707f)
            lineTo(12.707f, 5.707f)
            curveTo(12.347f, 6.068f, 11.779f, 6.095f, 11.387f, 5.79f)
            lineTo(11.293f, 5.707f)
            lineTo(9.293f, 3.707f)
            curveTo(8.902f, 3.317f, 8.902f, 2.683f, 9.293f, 2.293f)
            curveTo(9.653f, 1.932f, 10.221f, 1.905f, 10.613f, 2.21f)
            lineTo(10.707f, 2.293f)
            lineTo(12f, 3.586f)
            lineTo(13.293f, 2.293f)
            curveTo(13.683f, 1.902f, 14.317f, 1.902f, 14.707f, 2.293f)
            close()
            moveTo(13f, 9f)
            lineTo(13.001f, 20.5f)
            curveTo(13.001f, 21.052f, 12.554f, 21.5f, 12.001f, 21.5f)
            curveTo(11.488f, 21.5f, 11.066f, 21.114f, 11.008f, 20.617f)
            lineTo(11.001f, 20.5f)
            lineTo(11f, 9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            curveTo(12.513f, 8f, 12.935f, 8.386f, 12.993f, 8.883f)
            lineTo(13f, 9f)
            lineTo(13.001f, 20.5f)
            lineTo(13f, 9f)
            close()
            moveTo(18f, 9f)
            verticalLineTo(17.5f)
            curveTo(18f, 18.052f, 17.552f, 18.5f, 17f, 18.5f)
            curveTo(16.487f, 18.5f, 16.065f, 18.114f, 16.007f, 17.617f)
            lineTo(16f, 17.5f)
            verticalLineTo(9f)
            curveTo(16f, 8.448f, 16.448f, 8f, 17f, 8f)
            curveTo(17.513f, 8f, 17.935f, 8.386f, 17.993f, 8.883f)
            lineTo(18f, 9f)
            verticalLineTo(17.5f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextIndentIncreaseRtlRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextIndentIncreaseRtlRotate270, contentDescription = null)
    }
}
