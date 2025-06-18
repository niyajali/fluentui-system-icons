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

public val FluentUi.Filled.DeviceEq: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceEq",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3f)
            curveTo(12.513f, 3f, 12.936f, 3.386f, 12.993f, 3.883f)
            lineTo(13f, 4f)
            verticalLineTo(20f)
            curveTo(13f, 20.552f, 12.552f, 21f, 12f, 21f)
            curveTo(11.487f, 21f, 11.064f, 20.614f, 11.007f, 20.117f)
            lineTo(11f, 20f)
            verticalLineTo(4f)
            curveTo(11f, 3.448f, 11.448f, 3f, 12f, 3f)
            close()
            moveTo(8f, 6f)
            curveTo(8.513f, 6f, 8.936f, 6.386f, 8.993f, 6.883f)
            lineTo(9f, 7f)
            verticalLineTo(17f)
            curveTo(9f, 17.552f, 8.552f, 18f, 8f, 18f)
            curveTo(7.487f, 18f, 7.064f, 17.614f, 7.007f, 17.117f)
            lineTo(7f, 17f)
            verticalLineTo(7f)
            curveTo(7f, 6.448f, 7.448f, 6f, 8f, 6f)
            close()
            moveTo(16f, 6f)
            curveTo(16.513f, 6f, 16.935f, 6.386f, 16.993f, 6.883f)
            lineTo(17f, 7f)
            verticalLineTo(17f)
            curveTo(17f, 17.552f, 16.552f, 18f, 16f, 18f)
            curveTo(15.487f, 18f, 15.064f, 17.614f, 15.007f, 17.117f)
            lineTo(15f, 17f)
            verticalLineTo(7f)
            curveTo(15f, 6.448f, 15.448f, 6f, 16f, 6f)
            close()
            moveTo(4f, 9f)
            curveTo(4.513f, 9f, 4.936f, 9.386f, 4.993f, 9.883f)
            lineTo(5f, 10f)
            verticalLineTo(14f)
            curveTo(5f, 14.552f, 4.552f, 15f, 4f, 15f)
            curveTo(3.487f, 15f, 3.064f, 14.614f, 3.007f, 14.117f)
            lineTo(3f, 14f)
            verticalLineTo(10f)
            curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
            close()
            moveTo(20f, 9f)
            curveTo(20.513f, 9f, 20.935f, 9.386f, 20.993f, 9.883f)
            lineTo(21f, 10f)
            verticalLineTo(14f)
            curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
            curveTo(19.487f, 15f, 19.065f, 14.614f, 19.007f, 14.117f)
            lineTo(19f, 14f)
            verticalLineTo(10f)
            curveTo(19f, 9.448f, 19.448f, 9f, 20f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeviceEqPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DeviceEq, contentDescription = null)
    }
}
