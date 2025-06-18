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

public val FluentUi.Filled.AlertUrgent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertUrgent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.429f, 19.924f)
            lineTo(13.991f, 18.412f)
            curveTo(14.124f, 19.292f, 13.653f, 20.185f, 12.796f, 20.549f)
            curveTo(11.939f, 20.913f, 10.969f, 20.632f, 10.429f, 19.924f)
            close()
            moveTo(15.861f, 2.094f)
            curveTo(17.947f, 3.233f, 19.513f, 4.697f, 20.543f, 6.481f)
            curveTo(21.573f, 8.265f, 22.058f, 10.353f, 22.001f, 12.729f)
            curveTo(21.992f, 13.143f, 21.648f, 13.471f, 21.234f, 13.461f)
            curveTo(20.82f, 13.451f, 20.492f, 13.108f, 20.502f, 12.694f)
            curveTo(20.552f, 10.582f, 20.13f, 8.766f, 19.244f, 7.231f)
            curveTo(18.358f, 5.696f, 16.995f, 4.423f, 15.142f, 3.41f)
            curveTo(14.779f, 3.212f, 14.645f, 2.756f, 14.844f, 2.392f)
            curveTo(15.042f, 2.029f, 15.498f, 1.895f, 15.861f, 2.094f)
            close()
            moveTo(6.711f, 6.515f)
            curveTo(9.573f, 5.241f, 12.916f, 6.446f, 14.311f, 9.261f)
            lineTo(14.409f, 9.47f)
            lineTo(15.697f, 12.362f)
            lineTo(17.395f, 13.832f)
            curveTo(17.488f, 13.912f, 17.568f, 14.006f, 17.661f, 14.157f)
            lineTo(17.72f, 14.271f)
            curveTo(17.999f, 14.902f, 17.714f, 15.641f, 17.083f, 15.92f)
            lineTo(6.756f, 20.49f)
            curveTo(6.597f, 20.561f, 6.424f, 20.597f, 6.25f, 20.597f)
            curveTo(5.56f, 20.597f, 5f, 20.038f, 5f, 19.347f)
            lineTo(4.999f, 17.005f)
            lineTo(3.757f, 14.213f)
            curveTo(2.443f, 11.263f, 3.766f, 7.827f, 6.711f, 6.515f)
            close()
            moveTo(15.624f, 5.695f)
            curveTo(16.591f, 6.222f, 17.366f, 6.989f, 17.94f, 7.984f)
            curveTo(18.514f, 8.979f, 18.791f, 10.033f, 18.764f, 11.134f)
            curveTo(18.754f, 11.549f, 18.41f, 11.876f, 17.996f, 11.866f)
            curveTo(17.582f, 11.856f, 17.255f, 11.512f, 17.265f, 11.098f)
            curveTo(17.285f, 10.276f, 17.079f, 9.493f, 16.641f, 8.734f)
            curveTo(16.203f, 7.975f, 15.627f, 7.405f, 14.906f, 7.012f)
            curveTo(14.542f, 6.813f, 14.408f, 6.358f, 14.606f, 5.994f)
            curveTo(14.804f, 5.63f, 15.26f, 5.496f, 15.624f, 5.695f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertUrgentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlertUrgent, contentDescription = null)
    }
}
