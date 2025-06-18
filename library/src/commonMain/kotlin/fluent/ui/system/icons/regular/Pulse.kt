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

public val FluentUi.Regular.Pulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.462f, 6.809f)
            lineTo(11.746f, 20.426f)
            curveTo(11.924f, 21.163f, 12.957f, 21.201f, 13.189f, 20.48f)
            lineTo(16.446f, 10.358f)
            lineTo(17.032f, 12.453f)
            curveTo(17.122f, 12.777f, 17.418f, 13.001f, 17.754f, 13.001f)
            horizontalLineTo(21.248f)
            curveTo(21.662f, 13.001f, 21.998f, 12.665f, 21.998f, 12.251f)
            curveTo(21.998f, 11.837f, 21.662f, 11.501f, 21.248f, 11.501f)
            horizontalLineTo(18.323f)
            lineTo(17.218f, 7.551f)
            curveTo(17.018f, 6.834f, 16.01f, 6.815f, 15.782f, 7.523f)
            lineTo(12.578f, 17.48f)
            lineTo(9.225f, 3.574f)
            curveTo(9.043f, 2.817f, 7.97f, 2.805f, 7.771f, 3.558f)
            lineTo(5.669f, 11.501f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.501f, 2f, 11.837f, 2f, 12.251f)
            curveTo(2f, 12.665f, 2.336f, 13.001f, 2.75f, 13.001f)
            horizontalLineTo(6.246f)
            curveTo(6.586f, 13.001f, 6.884f, 12.772f, 6.971f, 12.443f)
            lineTo(8.462f, 6.809f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Pulse, contentDescription = null)
    }
}
