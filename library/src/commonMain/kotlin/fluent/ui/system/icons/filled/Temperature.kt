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

public val FluentUi.Filled.Temperature: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(14.142f, 2f, 15.891f, 3.684f, 15.995f, 5.8f)
            lineTo(16f, 6f)
            lineTo(16.001f, 12.728f)
            lineTo(16.056f, 12.786f)
            curveTo(16.852f, 13.654f, 17.353f, 14.757f, 17.472f, 15.946f)
            lineTo(17.493f, 16.222f)
            lineTo(17.5f, 16.5f)
            curveTo(17.5f, 19.538f, 15.038f, 22f, 12f, 22f)
            curveTo(8.962f, 22f, 6.5f, 19.538f, 6.5f, 16.5f)
            curveTo(6.5f, 15.195f, 6.958f, 13.962f, 7.766f, 12.989f)
            lineTo(7.945f, 12.785f)
            lineTo(7.999f, 12.727f)
            lineTo(8f, 6f)
            curveTo(8f, 3.927f, 9.577f, 2.222f, 11.597f, 2.02f)
            lineTo(11.8f, 2.005f)
            lineTo(12f, 2f)
            close()
            moveTo(12f, 4f)
            curveTo(10.946f, 4f, 10.082f, 4.816f, 10.005f, 5.851f)
            lineTo(10f, 6f)
            lineTo(10f, 13.593f)
            lineTo(9.667f, 13.891f)
            curveTo(8.929f, 14.552f, 8.5f, 15.49f, 8.5f, 16.5f)
            curveTo(8.5f, 18.433f, 10.067f, 20f, 12f, 20f)
            curveTo(13.933f, 20f, 15.5f, 18.433f, 15.5f, 16.5f)
            curveTo(15.5f, 15.563f, 15.131f, 14.687f, 14.487f, 14.038f)
            lineTo(14.334f, 13.892f)
            lineTo(14.001f, 13.594f)
            lineTo(14f, 6f)
            curveTo(14f, 4.895f, 13.105f, 4f, 12f, 4f)
            close()
            moveTo(12f, 8f)
            curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
            lineTo(13.001f, 14.208f)
            curveTo(13.883f, 14.594f, 14.5f, 15.475f, 14.5f, 16.5f)
            curveTo(14.5f, 17.881f, 13.381f, 19f, 12f, 19f)
            curveTo(10.619f, 19f, 9.5f, 17.881f, 9.5f, 16.5f)
            curveTo(9.5f, 15.475f, 10.117f, 14.594f, 11f, 14.208f)
            lineTo(11f, 9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TemperaturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Temperature, contentDescription = null)
    }
}
