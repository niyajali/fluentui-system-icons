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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.SendClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.SendClock",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.079f, 3.975f)
            curveTo(1.662f, 2.708f, 2.981f, 1.568f, 4.174f, 2.164f)
            lineTo(29.168f, 14.66f)
            curveTo(30.07f, 15.111f, 30.236f, 16.244f, 29.667f, 16.946f)
            curveTo(29.424f, 16.717f, 29.168f, 16.501f, 28.9f, 16.3f)
            curveTo(29.074f, 16.065f, 29.014f, 15.702f, 28.721f, 15.555f)
            lineTo(3.727f, 3.059f)
            curveTo(3.329f, 2.86f, 2.89f, 3.24f, 3.029f, 3.662f)
            lineTo(6.927f, 15.502f)
            horizontalLineTo(18.5f)
            curveTo(18.682f, 15.502f, 18.841f, 15.6f, 18.929f, 15.745f)
            curveTo(18.547f, 15.971f, 18.183f, 16.224f, 17.84f, 16.502f)
            horizontalLineTo(6.927f)
            lineTo(3.029f, 28.342f)
            curveTo(2.89f, 28.764f, 3.329f, 29.145f, 3.727f, 28.946f)
            lineTo(14.5f, 23.56f)
            curveTo(14.502f, 23.926f, 14.526f, 24.287f, 14.571f, 24.642f)
            lineTo(4.174f, 29.84f)
            curveTo(2.981f, 30.437f, 1.662f, 29.296f, 2.079f, 28.029f)
            lineTo(6.039f, 16.002f)
            lineTo(2.079f, 3.975f)
            close()
            moveTo(23.5f, 31f)
            curveTo(27.642f, 31f, 31f, 27.642f, 31f, 23.5f)
            curveTo(31f, 19.358f, 27.642f, 16f, 23.5f, 16f)
            curveTo(19.357f, 16f, 16f, 19.358f, 16f, 23.5f)
            curveTo(16f, 27.642f, 19.357f, 31f, 23.5f, 31f)
            close()
            moveTo(23.25f, 18.5f)
            curveTo(23.664f, 18.5f, 24f, 18.836f, 24f, 19.25f)
            verticalLineTo(23f)
            horizontalLineTo(26.75f)
            curveTo(27.164f, 23f, 27.5f, 23.336f, 27.5f, 23.75f)
            curveTo(27.5f, 24.164f, 27.164f, 24.5f, 26.75f, 24.5f)
            horizontalLineTo(23.25f)
            curveTo(22.835f, 24.5f, 22.5f, 24.164f, 22.5f, 23.75f)
            verticalLineTo(19.25f)
            curveTo(22.5f, 18.836f, 22.835f, 18.5f, 23.25f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.SendClock, contentDescription = null)
    }
}
