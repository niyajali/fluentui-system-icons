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

public val FluentUi.Regular.RibbonOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RibbonOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.454f, 6.515f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
            lineTo(17f, 18.061f)
            lineTo(16.999f, 21.25f)
            curveTo(16.999f, 21.822f, 16.393f, 22.171f, 15.907f, 21.918f)
            lineTo(15.818f, 21.864f)
            lineTo(11.999f, 19.176f)
            lineTo(8.183f, 21.863f)
            curveTo(7.715f, 22.193f, 7.081f, 21.897f, 7.008f, 21.355f)
            lineTo(7.001f, 21.25f)
            lineTo(6.999f, 13.898f)
            curveTo(5.763f, 12.636f, 5f, 10.907f, 5f, 9f)
            curveTo(5f, 8.125f, 5.161f, 7.287f, 5.454f, 6.515f)
            close()
            moveTo(15.499f, 16.56f)
            lineTo(14.485f, 15.546f)
            curveTo(13.713f, 15.839f, 12.875f, 16f, 12f, 16f)
            curveTo(10.725f, 16f, 9.53f, 15.659f, 8.501f, 15.064f)
            lineTo(8.501f, 19.805f)
            lineTo(11.567f, 17.645f)
            curveTo(11.794f, 17.486f, 12.087f, 17.466f, 12.33f, 17.585f)
            lineTo(12.431f, 17.645f)
            lineTo(15.499f, 19.805f)
            lineTo(15.499f, 16.56f)
            close()
            moveTo(13.288f, 14.349f)
            lineTo(6.652f, 7.712f)
            curveTo(6.552f, 8.125f, 6.5f, 8.557f, 6.5f, 9f)
            curveTo(6.5f, 12.038f, 8.962f, 14.5f, 12f, 14.5f)
            curveTo(12.443f, 14.5f, 12.875f, 14.448f, 13.288f, 14.349f)
            close()
            moveTo(17.5f, 9f)
            curveTo(17.5f, 10.473f, 16.921f, 11.81f, 15.979f, 12.797f)
            lineTo(17.04f, 13.858f)
            curveTo(18.253f, 12.599f, 19f, 10.887f, 19f, 9f)
            curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
            curveTo(10.113f, 2f, 8.401f, 2.746f, 7.142f, 3.96f)
            lineTo(8.203f, 5.021f)
            curveTo(9.19f, 4.079f, 10.528f, 3.5f, 12f, 3.5f)
            curveTo(15.038f, 3.5f, 17.5f, 5.962f, 17.5f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RibbonOff, contentDescription = null)
    }
}
