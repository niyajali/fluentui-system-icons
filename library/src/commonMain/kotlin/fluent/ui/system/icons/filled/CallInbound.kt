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

public val FluentUi.Filled.CallInbound: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallInbound",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.367f, 3.313f)
            lineTo(10.227f, 5.34f)
            curveTo(10.602f, 6.224f, 10.394f, 7.263f, 9.713f, 7.909f)
            lineTo(7.819f, 9.707f)
            curveTo(7.936f, 10.782f, 8.297f, 11.841f, 8.903f, 12.884f)
            curveTo(9.509f, 13.926f, 10.267f, 14.791f, 11.174f, 15.478f)
            lineTo(13.45f, 14.719f)
            curveTo(14.312f, 14.432f, 15.251f, 14.762f, 15.78f, 15.54f)
            lineTo(17.013f, 17.35f)
            curveTo(17.628f, 18.254f, 17.517f, 19.5f, 16.754f, 20.266f)
            lineTo(15.936f, 21.087f)
            curveTo(15.122f, 21.904f, 13.96f, 22.2f, 12.884f, 21.865f)
            curveTo(10.345f, 21.073f, 8.011f, 18.722f, 5.881f, 14.811f)
            curveTo(3.748f, 10.895f, 2.996f, 7.573f, 3.623f, 4.844f)
            curveTo(3.887f, 3.695f, 4.705f, 2.781f, 5.772f, 2.44f)
            lineTo(6.849f, 2.096f)
            curveTo(7.858f, 1.773f, 8.935f, 2.294f, 9.367f, 3.313f)
            close()
            moveTo(14.498f, 8.439f)
            lineTo(20.719f, 2.216f)
            curveTo(21.012f, 1.923f, 21.486f, 1.923f, 21.779f, 2.216f)
            curveTo(22.046f, 2.482f, 22.07f, 2.898f, 21.852f, 3.192f)
            lineTo(21.78f, 3.276f)
            lineTo(15.559f, 9.499f)
            lineTo(20.25f, 9.499f)
            curveTo(20.63f, 9.499f, 20.944f, 9.781f, 20.993f, 10.147f)
            lineTo(21f, 10.249f)
            curveTo(21f, 10.629f, 20.718f, 10.943f, 20.352f, 10.992f)
            lineTo(20.25f, 10.999f)
            lineTo(13.696f, 10.998f)
            lineTo(13.597f, 10.985f)
            lineTo(13.502f, 10.959f)
            lineTo(13.434f, 10.93f)
            curveTo(13.356f, 10.895f, 13.283f, 10.845f, 13.219f, 10.781f)
            lineTo(13.178f, 10.737f)
            lineTo(13.153f, 10.705f)
            lineTo(13.105f, 10.636f)
            lineTo(13.059f, 10.545f)
            lineTo(13.027f, 10.453f)
            lineTo(13.01f, 10.383f)
            lineTo(13.001f, 10.302f)
            lineTo(12.999f, 10.249f)
            verticalLineTo(3.745f)
            curveTo(12.999f, 3.331f, 13.335f, 2.995f, 13.749f, 2.995f)
            curveTo(14.128f, 2.995f, 14.442f, 3.277f, 14.492f, 3.643f)
            lineTo(14.499f, 3.745f)
            lineTo(14.498f, 8.439f)
            lineTo(20.719f, 2.216f)
            lineTo(14.498f, 8.439f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallInboundPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CallInbound, contentDescription = null)
    }
}
