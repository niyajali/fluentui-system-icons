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

public val FluentUi.Regular.Ribbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
            curveTo(19f, 10.907f, 18.237f, 12.636f, 17.001f, 13.898f)
            lineTo(16.999f, 21.25f)
            curveTo(16.999f, 21.822f, 16.393f, 22.171f, 15.907f, 21.918f)
            lineTo(15.818f, 21.864f)
            lineTo(11.999f, 19.176f)
            lineTo(8.183f, 21.863f)
            curveTo(7.715f, 22.193f, 7.081f, 21.897f, 7.008f, 21.355f)
            lineTo(7.001f, 21.25f)
            lineTo(6.999f, 13.898f)
            curveTo(5.763f, 12.636f, 5f, 10.907f, 5f, 9f)
            curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
            close()
            moveTo(15.499f, 19.805f)
            lineTo(15.499f, 15.064f)
            curveTo(14.47f, 15.659f, 13.275f, 16f, 12f, 16f)
            curveTo(10.725f, 16f, 9.53f, 15.659f, 8.501f, 15.064f)
            lineTo(8.501f, 19.805f)
            lineTo(11.567f, 17.645f)
            curveTo(11.794f, 17.486f, 12.087f, 17.466f, 12.33f, 17.585f)
            lineTo(12.431f, 17.645f)
            lineTo(15.499f, 19.805f)
            lineTo(15.499f, 15.064f)
            lineTo(15.499f, 19.805f)
            close()
            moveTo(12f, 3.5f)
            curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
            curveTo(6.5f, 12.038f, 8.962f, 14.5f, 12f, 14.5f)
            curveTo(15.038f, 14.5f, 17.5f, 12.038f, 17.5f, 9f)
            curveTo(17.5f, 5.962f, 15.038f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Ribbon, contentDescription = null)
    }
}
