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

public val FluentUi.Filled.TextIndentDecreaseRotate270: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextIndentDecreaseRotate270",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 15f)
                verticalLineTo(6.5f)
                curveTo(16f, 5.948f, 16.448f, 5.5f, 17f, 5.5f)
                curveTo(17.513f, 5.5f, 17.935f, 5.886f, 17.993f, 6.383f)
                lineTo(18f, 6.5f)
                verticalLineTo(15f)
                curveTo(18f, 15.552f, 17.552f, 16f, 17f, 16f)
                curveTo(16.487f, 16f, 16.065f, 15.614f, 16.007f, 15.117f)
                lineTo(16f, 15f)
                close()
                moveTo(11.293f, 21.707f)
                lineTo(9.293f, 19.707f)
                curveTo(8.902f, 19.317f, 8.902f, 18.683f, 9.293f, 18.293f)
                curveTo(9.653f, 17.932f, 10.221f, 17.905f, 10.613f, 18.21f)
                lineTo(10.707f, 18.293f)
                lineTo(12f, 19.586f)
                lineTo(13.293f, 18.293f)
                curveTo(13.683f, 17.902f, 14.317f, 17.902f, 14.707f, 18.293f)
                curveTo(15.068f, 18.653f, 15.095f, 19.221f, 14.79f, 19.613f)
                lineTo(14.707f, 19.707f)
                lineTo(12.707f, 21.707f)
                curveTo(12.347f, 22.068f, 11.779f, 22.095f, 11.387f, 21.79f)
                lineTo(11.293f, 21.707f)
                close()
                moveTo(11f, 15f)
                lineTo(10.999f, 3.5f)
                curveTo(10.999f, 2.948f, 11.446f, 2.5f, 11.999f, 2.5f)
                curveTo(12.512f, 2.5f, 12.934f, 2.886f, 12.992f, 3.383f)
                lineTo(12.999f, 3.5f)
                lineTo(13f, 15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.487f, 16f, 11.065f, 15.614f, 11.007f, 15.117f)
                lineTo(11f, 15f)
                close()
                moveTo(6f, 15f)
                verticalLineTo(6.5f)
                curveTo(6f, 5.948f, 6.448f, 5.5f, 7f, 5.5f)
                curveTo(7.513f, 5.5f, 7.936f, 5.886f, 7.993f, 6.383f)
                lineTo(8f, 6.5f)
                verticalLineTo(15f)
                curveTo(8f, 15.552f, 7.552f, 16f, 7f, 16f)
                curveTo(6.487f, 16f, 6.064f, 15.614f, 6.007f, 15.117f)
                lineTo(6f, 15f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextIndentDecreaseRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextIndentDecreaseRotate270, contentDescription = null)
    }
}
