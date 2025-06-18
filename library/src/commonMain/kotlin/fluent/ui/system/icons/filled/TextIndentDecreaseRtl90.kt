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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TextIndentDecreaseRtl90: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentDecreaseRtl90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 5.5f)
            curveTo(16.448f, 5.5f, 16f, 5.948f, 16f, 6.5f)
            verticalLineTo(15f)
            lineTo(16.007f, 15.117f)
            curveTo(16.065f, 15.614f, 16.487f, 16f, 17f, 16f)
            curveTo(17.552f, 16f, 18f, 15.552f, 18f, 15f)
            verticalLineTo(6.5f)
            lineTo(17.993f, 6.383f)
            curveTo(17.935f, 5.886f, 17.513f, 5.5f, 17f, 5.5f)
            close()
            moveTo(10.999f, 3.5f)
            lineTo(11f, 15f)
            lineTo(11.007f, 15.117f)
            curveTo(11.065f, 15.614f, 11.487f, 16f, 12f, 16f)
            curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
            lineTo(12.999f, 3.5f)
            lineTo(12.992f, 3.383f)
            curveTo(12.934f, 2.886f, 12.512f, 2.5f, 11.999f, 2.5f)
            curveTo(11.446f, 2.5f, 10.999f, 2.948f, 10.999f, 3.5f)
            close()
            moveTo(7f, 5.5f)
            curveTo(6.448f, 5.5f, 6f, 5.948f, 6f, 6.5f)
            verticalLineTo(15f)
            lineTo(6.007f, 15.117f)
            curveTo(6.064f, 15.614f, 6.487f, 16f, 7f, 16f)
            curveTo(7.552f, 16f, 8f, 15.552f, 8f, 15f)
            verticalLineTo(6.5f)
            lineTo(7.993f, 6.383f)
            curveTo(7.936f, 5.886f, 7.513f, 5.5f, 7f, 5.5f)
            close()
            moveTo(9.21f, 19.613f)
            curveTo(8.905f, 19.221f, 8.932f, 18.653f, 9.293f, 18.293f)
            curveTo(9.683f, 17.902f, 10.317f, 17.902f, 10.707f, 18.293f)
            lineTo(12f, 19.586f)
            lineTo(13.293f, 18.293f)
            lineTo(13.387f, 18.21f)
            curveTo(13.779f, 17.905f, 14.347f, 17.932f, 14.707f, 18.293f)
            curveTo(15.098f, 18.683f, 15.098f, 19.317f, 14.707f, 19.707f)
            lineTo(12.707f, 21.707f)
            lineTo(12.613f, 21.79f)
            curveTo(12.221f, 22.095f, 11.653f, 22.068f, 11.293f, 21.707f)
            lineTo(9.293f, 19.707f)
            lineTo(9.21f, 19.613f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextIndentDecreaseRtl90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextIndentDecreaseRtl90, contentDescription = null)
    }
}
