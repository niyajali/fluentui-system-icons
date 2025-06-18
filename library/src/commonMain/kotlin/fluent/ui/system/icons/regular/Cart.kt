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

public val FluentUi.Regular.Cart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 4.25f)
            curveTo(2.5f, 3.836f, 2.836f, 3.5f, 3.25f, 3.5f)
            horizontalLineTo(3.808f)
            curveTo(4.759f, 3.5f, 5.328f, 4.139f, 5.653f, 4.733f)
            curveTo(5.87f, 5.129f, 6.027f, 5.588f, 6.15f, 6.004f)
            curveTo(6.183f, 6.001f, 6.217f, 6f, 6.251f, 6f)
            horizontalLineTo(18.748f)
            curveTo(19.578f, 6f, 20.178f, 6.794f, 19.95f, 7.593f)
            lineTo(18.122f, 14.002f)
            curveTo(17.786f, 15.183f, 16.706f, 15.998f, 15.478f, 15.998f)
            horizontalLineTo(9.53f)
            curveTo(8.291f, 15.998f, 7.206f, 15.17f, 6.878f, 13.976f)
            lineTo(6.117f, 11.205f)
            lineTo(4.859f, 6.956f)
            lineTo(4.857f, 6.948f)
            curveTo(4.701f, 6.381f, 4.555f, 5.85f, 4.338f, 5.454f)
            curveTo(4.127f, 5.069f, 3.959f, 5f, 3.808f, 5f)
            horizontalLineTo(3.25f)
            curveTo(2.836f, 5f, 2.5f, 4.664f, 2.5f, 4.25f)
            close()
            moveTo(7.573f, 10.84f)
            lineTo(8.324f, 13.579f)
            curveTo(8.473f, 14.122f, 8.967f, 14.498f, 9.53f, 14.498f)
            horizontalLineTo(15.478f)
            curveTo(16.036f, 14.498f, 16.527f, 14.127f, 16.68f, 13.591f)
            lineTo(18.417f, 7.5f)
            horizontalLineTo(6.585f)
            lineTo(7.559f, 10.787f)
            curveTo(7.564f, 10.805f, 7.569f, 10.822f, 7.573f, 10.84f)
            close()
            moveTo(11f, 19f)
            curveTo(11f, 20.105f, 10.105f, 21f, 9f, 21f)
            curveTo(7.895f, 21f, 7f, 20.105f, 7f, 19f)
            curveTo(7f, 17.895f, 7.895f, 17f, 9f, 17f)
            curveTo(10.105f, 17f, 11f, 17.895f, 11f, 19f)
            close()
            moveTo(9.5f, 19f)
            curveTo(9.5f, 18.724f, 9.276f, 18.5f, 9f, 18.5f)
            curveTo(8.724f, 18.5f, 8.5f, 18.724f, 8.5f, 19f)
            curveTo(8.5f, 19.276f, 8.724f, 19.5f, 9f, 19.5f)
            curveTo(9.276f, 19.5f, 9.5f, 19.276f, 9.5f, 19f)
            close()
            moveTo(18f, 19f)
            curveTo(18f, 20.105f, 17.105f, 21f, 16f, 21f)
            curveTo(14.895f, 21f, 14f, 20.105f, 14f, 19f)
            curveTo(14f, 17.895f, 14.895f, 17f, 16f, 17f)
            curveTo(17.105f, 17f, 18f, 17.895f, 18f, 19f)
            close()
            moveTo(16.5f, 19f)
            curveTo(16.5f, 18.724f, 16.276f, 18.5f, 16f, 18.5f)
            curveTo(15.724f, 18.5f, 15.5f, 18.724f, 15.5f, 19f)
            curveTo(15.5f, 19.276f, 15.724f, 19.5f, 16f, 19.5f)
            curveTo(16.276f, 19.5f, 16.5f, 19.276f, 16.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Cart, contentDescription = null)
    }
}
