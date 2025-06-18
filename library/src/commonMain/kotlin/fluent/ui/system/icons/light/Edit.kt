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

public val FluentIcons.Light.Edit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Edit",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.117f, 5.178f)
            lineTo(4.265f, 21.031f)
            curveTo(3.788f, 21.507f, 3.46f, 22.111f, 3.318f, 22.77f)
            lineTo(2.023f, 28.787f)
            curveTo(1.87f, 29.497f, 2.501f, 30.128f, 3.211f, 29.975f)
            lineTo(9.243f, 28.676f)
            curveTo(9.901f, 28.534f, 10.505f, 28.205f, 10.981f, 27.729f)
            lineTo(28.614f, 10.096f)
            curveTo(30.466f, 8.244f, 30.466f, 5.241f, 28.614f, 3.389f)
            curveTo(26.762f, 1.537f, 23.759f, 1.537f, 21.907f, 3.389f)
            lineTo(20.178f, 5.117f)
            curveTo(20.167f, 5.126f, 20.157f, 5.136f, 20.147f, 5.146f)
            curveTo(20.136f, 5.157f, 20.127f, 5.167f, 20.117f, 5.178f)
            close()
            moveTo(22.614f, 4.096f)
            curveTo(24.075f, 2.635f, 26.445f, 2.635f, 27.907f, 4.096f)
            curveTo(29.368f, 5.558f, 29.368f, 7.927f, 27.907f, 9.389f)
            lineTo(26.501f, 10.794f)
            lineTo(21.209f, 5.501f)
            lineTo(22.614f, 4.096f)
            close()
            moveTo(20.501f, 6.208f)
            lineTo(25.794f, 11.501f)
            lineTo(10.274f, 27.022f)
            curveTo(9.934f, 27.362f, 9.503f, 27.597f, 9.032f, 27.698f)
            lineTo(3.001f, 28.997f)
            lineTo(4.295f, 22.98f)
            curveTo(4.397f, 22.51f, 4.632f, 22.078f, 4.972f, 21.738f)
            lineTo(20.501f, 6.208f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Edit, contentDescription = null)
    }
}
