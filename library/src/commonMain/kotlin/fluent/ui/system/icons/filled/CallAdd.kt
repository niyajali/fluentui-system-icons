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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.CallAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.367f, 3.312f)
            lineTo(10.227f, 5.339f)
            curveTo(10.602f, 6.222f, 10.394f, 7.261f, 9.713f, 7.907f)
            lineTo(7.819f, 9.705f)
            curveTo(7.936f, 10.781f, 8.297f, 11.84f, 8.903f, 12.882f)
            curveTo(9.509f, 13.925f, 10.267f, 14.79f, 11.174f, 15.477f)
            lineTo(13.45f, 14.718f)
            curveTo(14.312f, 14.431f, 15.251f, 14.761f, 15.78f, 15.538f)
            lineTo(17.013f, 17.349f)
            curveTo(17.628f, 18.252f, 17.517f, 19.499f, 16.754f, 20.265f)
            lineTo(15.936f, 21.086f)
            curveTo(15.122f, 21.903f, 13.96f, 22.199f, 12.884f, 21.864f)
            curveTo(10.345f, 21.072f, 8.011f, 18.72f, 5.881f, 14.81f)
            curveTo(3.748f, 10.894f, 2.996f, 7.571f, 3.623f, 4.842f)
            curveTo(3.887f, 3.694f, 4.705f, 2.779f, 5.772f, 2.438f)
            lineTo(6.849f, 2.094f)
            curveTo(7.858f, 1.772f, 8.935f, 2.293f, 9.367f, 3.312f)
            close()
            moveTo(17.149f, 2.003f)
            lineTo(17.251f, 1.996f)
            curveTo(17.63f, 1.996f, 17.944f, 2.278f, 17.994f, 2.644f)
            lineTo(18.001f, 2.746f)
            lineTo(18f, 6f)
            lineTo(21.252f, 6.001f)
            curveTo(21.632f, 6.001f, 21.946f, 6.283f, 21.996f, 6.649f)
            lineTo(22.002f, 6.751f)
            curveTo(22.002f, 7.13f, 21.72f, 7.444f, 21.354f, 7.494f)
            lineTo(21.252f, 7.501f)
            lineTo(18f, 7.5f)
            lineTo(18.001f, 10.749f)
            curveTo(18.001f, 11.129f, 17.718f, 11.443f, 17.352f, 11.492f)
            lineTo(17.251f, 11.499f)
            curveTo(16.871f, 11.499f, 16.557f, 11.217f, 16.507f, 10.851f)
            lineTo(16.501f, 10.749f)
            lineTo(16.5f, 7.5f)
            lineTo(13.249f, 7.501f)
            curveTo(12.869f, 7.501f, 12.555f, 7.219f, 12.506f, 6.853f)
            lineTo(12.499f, 6.751f)
            curveTo(12.499f, 6.371f, 12.781f, 6.057f, 13.147f, 6.008f)
            lineTo(13.249f, 6.001f)
            lineTo(16.5f, 6f)
            lineTo(16.501f, 2.746f)
            curveTo(16.501f, 2.366f, 16.783f, 2.053f, 17.149f, 2.003f)
            lineTo(17.251f, 1.996f)
            lineTo(17.149f, 2.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallAdd, contentDescription = null)
    }
}
