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

public val FluentUi.Filled.CallForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallForward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.925f, 2.05f)
            lineTo(10.962f, 2.248f)
            curveTo(11.934f, 2.433f, 12.587f, 3.341f, 12.487f, 4.37f)
            lineTo(12.289f, 6.417f)
            curveTo(12.203f, 7.31f, 11.569f, 8.07f, 10.723f, 8.297f)
            lineTo(8.366f, 8.928f)
            curveTo(7.983f, 9.863f, 7.807f, 10.894f, 7.84f, 12.02f)
            curveTo(7.873f, 13.146f, 8.109f, 14.193f, 8.548f, 15.162f)
            lineTo(10.754f, 15.554f)
            curveTo(11.59f, 15.702f, 12.214f, 16.392f, 12.302f, 17.266f)
            lineTo(12.507f, 19.301f)
            curveTo(12.609f, 20.317f, 11.962f, 21.291f, 10.995f, 21.58f)
            lineTo(9.957f, 21.889f)
            curveTo(8.925f, 22.197f, 7.838f, 21.922f, 7.105f, 21.168f)
            curveTo(5.374f, 19.386f, 4.505f, 16.415f, 4.5f, 12.255f)
            curveTo(4.495f, 8.09f, 5.358f, 5.026f, 7.089f, 3.066f)
            curveTo(7.818f, 2.241f, 8.897f, 1.854f, 9.925f, 2.05f)
            close()
            moveTo(16.696f, 7.147f)
            lineTo(16.78f, 7.219f)
            lineTo(20.777f, 11.217f)
            curveTo(21.043f, 11.483f, 21.067f, 11.899f, 20.85f, 12.193f)
            lineTo(20.777f, 12.277f)
            lineTo(16.781f, 16.281f)
            curveTo(16.488f, 16.574f, 16.013f, 16.574f, 15.72f, 16.281f)
            curveTo(15.454f, 16.015f, 15.429f, 15.599f, 15.647f, 15.305f)
            lineTo(15.719f, 15.221f)
            lineTo(18.431f, 12.504f)
            lineTo(12.001f, 12.505f)
            curveTo(11.621f, 12.505f, 11.307f, 12.222f, 11.257f, 11.856f)
            lineTo(11.251f, 11.755f)
            curveTo(11.251f, 11.375f, 11.533f, 11.061f, 11.899f, 11.012f)
            lineTo(12.001f, 11.005f)
            lineTo(18.442f, 11.004f)
            lineTo(15.72f, 8.28f)
            curveTo(15.453f, 8.014f, 15.429f, 7.597f, 15.647f, 7.303f)
            lineTo(15.72f, 7.219f)
            curveTo(15.957f, 6.983f, 16.312f, 6.937f, 16.594f, 7.083f)
            lineTo(16.696f, 7.147f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CallForward, contentDescription = null)
    }
}
