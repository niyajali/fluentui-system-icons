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

public val FluentUi.Filled.ReOrder: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrder",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 13f)
            horizontalLineTo(21f)
            curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
            curveTo(22f, 14.513f, 21.614f, 14.936f, 21.117f, 14.993f)
            lineTo(21f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
            curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
            lineTo(3f, 13f)
            horizontalLineTo(21f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 9f)
            horizontalLineTo(21f)
            curveTo(21.552f, 9f, 22f, 9.448f, 22f, 10f)
            curveTo(22f, 10.513f, 21.614f, 10.936f, 21.117f, 10.993f)
            lineTo(21f, 11f)
            horizontalLineTo(3f)
            curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
            curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
            lineTo(3f, 9f)
            horizontalLineTo(21f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReOrder, contentDescription = null)
    }
}
