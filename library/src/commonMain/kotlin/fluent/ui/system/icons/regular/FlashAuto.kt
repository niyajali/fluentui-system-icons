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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.FlashAuto: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlashAuto",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.424f, 2.831f)
            curveTo(7.601f, 2.333f, 8.073f, 2f, 8.602f, 2f)
            horizontalLineTo(15.055f)
            curveTo(15.908f, 2f, 16.511f, 2.836f, 16.241f, 3.645f)
            lineTo(14.79f, 8f)
            horizontalLineTo(18.748f)
            curveTo(19.852f, 8f, 20.414f, 9.327f, 19.646f, 10.12f)
            lineTo(18.975f, 10.812f)
            curveTo(18.671f, 10.327f, 18.177f, 10.058f, 17.665f, 10.009f)
            lineTo(18.158f, 9.5f)
            horizontalLineTo(13.749f)
            curveTo(13.508f, 9.5f, 13.281f, 9.384f, 13.141f, 9.189f)
            curveTo(13f, 8.993f, 12.961f, 8.742f, 13.037f, 8.513f)
            lineTo(14.708f, 3.5f)
            horizontalLineTo(8.778f)
            lineTo(5.516f, 12.656f)
            curveTo(5.458f, 12.819f, 5.578f, 12.99f, 5.751f, 12.99f)
            lineTo(8.252f, 13f)
            curveTo(8.479f, 13.001f, 8.694f, 13.105f, 8.835f, 13.282f)
            curveTo(8.977f, 13.46f, 9.03f, 13.692f, 8.981f, 13.914f)
            lineTo(7.508f, 20.492f)
            lineTo(15.366f, 12.382f)
            lineTo(13.929f, 16.02f)
            lineTo(8.585f, 21.536f)
            curveTo(7.531f, 22.624f, 5.713f, 21.642f, 6.044f, 20.164f)
            lineTo(7.313f, 14.496f)
            lineTo(5.745f, 14.49f)
            curveTo(4.538f, 14.486f, 3.698f, 13.29f, 4.103f, 12.153f)
            lineTo(7.424f, 2.831f)
            close()
            moveTo(18.194f, 11.474f)
            lineTo(21.944f, 20.97f)
            curveTo(22.096f, 21.356f, 21.907f, 21.791f, 21.522f, 21.943f)
            curveTo(21.169f, 22.083f, 20.773f, 21.936f, 20.593f, 21.613f)
            lineTo(20.549f, 21.521f)
            lineTo(19.551f, 18.996f)
            horizontalLineTo(15.441f)
            lineTo(14.445f, 21.521f)
            curveTo(14.305f, 21.875f, 13.928f, 22.063f, 13.569f, 21.974f)
            lineTo(13.472f, 21.943f)
            curveTo(13.119f, 21.804f, 12.93f, 21.426f, 13.019f, 21.068f)
            lineTo(13.05f, 20.97f)
            lineTo(16.799f, 11.474f)
            curveTo(16.888f, 11.251f, 17.056f, 11.107f, 17.248f, 11.041f)
            curveTo(17.425f, 10.981f, 17.623f, 10.987f, 17.795f, 11.06f)
            curveTo(17.935f, 11.119f, 18.059f, 11.222f, 18.144f, 11.37f)
            lineTo(18.194f, 11.474f)
            close()
            moveTo(16.033f, 17.496f)
            horizontalLineTo(18.959f)
            lineTo(17.496f, 13.791f)
            lineTo(16.033f, 17.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashAutoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FlashAuto, contentDescription = null)
    }
}
