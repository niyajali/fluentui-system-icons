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

public val FluentUi.Filled.CallOutbound: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallOutbound",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.367f, 3.312f)
            lineTo(10.227f, 5.34f)
            curveTo(10.602f, 6.223f, 10.394f, 7.262f, 9.713f, 7.908f)
            lineTo(7.819f, 9.706f)
            curveTo(7.936f, 10.782f, 8.297f, 11.841f, 8.903f, 12.883f)
            curveTo(9.509f, 13.926f, 10.267f, 14.79f, 11.174f, 15.478f)
            lineTo(13.45f, 14.719f)
            curveTo(14.312f, 14.431f, 15.251f, 14.762f, 15.78f, 15.539f)
            lineTo(17.013f, 17.35f)
            curveTo(17.628f, 18.253f, 17.517f, 19.499f, 16.754f, 20.265f)
            lineTo(15.936f, 21.086f)
            curveTo(15.122f, 21.903f, 13.96f, 22.2f, 12.884f, 21.864f)
            curveTo(10.345f, 21.072f, 8.011f, 18.721f, 5.881f, 14.811f)
            curveTo(3.748f, 10.894f, 2.996f, 7.572f, 3.623f, 4.843f)
            curveTo(3.887f, 3.695f, 4.705f, 2.78f, 5.772f, 2.439f)
            lineTo(6.849f, 2.095f)
            curveTo(7.858f, 1.773f, 8.935f, 2.294f, 9.367f, 3.312f)
            close()
            moveTo(14.748f, 2.001f)
            lineTo(21.302f, 2.002f)
            lineTo(21.402f, 2.015f)
            lineTo(21.501f, 2.043f)
            lineTo(21.565f, 2.07f)
            curveTo(21.643f, 2.105f, 21.716f, 2.155f, 21.78f, 2.219f)
            lineTo(21.821f, 2.263f)
            lineTo(21.865f, 2.32f)
            lineTo(21.916f, 2.405f)
            lineTo(21.957f, 2.498f)
            lineTo(21.984f, 2.598f)
            lineTo(21.997f, 2.689f)
            lineTo(21.997f, 2.701f)
            lineTo(21.999f, 2.721f)
            lineTo(22f, 9.255f)
            curveTo(22f, 9.669f, 21.664f, 10.005f, 21.25f, 10.005f)
            curveTo(20.87f, 10.005f, 20.556f, 9.723f, 20.507f, 9.357f)
            lineTo(20.5f, 9.255f)
            lineTo(20.5f, 4.56f)
            lineTo(14.28f, 10.784f)
            curveTo(14.014f, 11.051f, 13.597f, 11.075f, 13.304f, 10.857f)
            lineTo(13.219f, 10.785f)
            curveTo(12.953f, 10.518f, 12.929f, 10.102f, 13.146f, 9.808f)
            lineTo(13.219f, 9.724f)
            lineTo(19.438f, 3.5f)
            lineTo(14.748f, 3.501f)
            curveTo(14.369f, 3.501f, 14.055f, 3.219f, 14.005f, 2.853f)
            lineTo(13.998f, 2.751f)
            curveTo(13.998f, 2.371f, 14.281f, 2.058f, 14.647f, 2.008f)
            lineTo(14.748f, 2.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallOutboundPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CallOutbound, contentDescription = null)
    }
}
