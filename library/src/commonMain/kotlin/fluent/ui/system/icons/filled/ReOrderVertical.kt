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

public val FluentUi.Filled.ReOrderVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 21f)
            verticalLineTo(3f)
            curveTo(13f, 2.448f, 13.448f, 2f, 14f, 2f)
            curveTo(14.513f, 2f, 14.936f, 2.386f, 14.993f, 2.883f)
            lineTo(15f, 3f)
            verticalLineTo(21f)
            curveTo(15f, 21.552f, 14.552f, 22f, 14f, 22f)
            curveTo(13.487f, 22f, 13.064f, 21.614f, 13.007f, 21.117f)
            lineTo(13f, 21f)
            close()
            moveTo(9f, 21f)
            verticalLineTo(3f)
            curveTo(9f, 2.448f, 9.448f, 2f, 10f, 2f)
            curveTo(10.513f, 2f, 10.936f, 2.386f, 10.993f, 2.883f)
            lineTo(11f, 3f)
            verticalLineTo(21f)
            curveTo(11f, 21.552f, 10.552f, 22f, 10f, 22f)
            curveTo(9.487f, 22f, 9.064f, 21.614f, 9.007f, 21.117f)
            lineTo(9f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReOrderVertical, contentDescription = null)
    }
}
