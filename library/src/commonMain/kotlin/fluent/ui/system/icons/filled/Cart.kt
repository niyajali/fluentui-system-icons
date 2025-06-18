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

public val FluentIcons.Filled.Cart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            moveTo(9f, 21f)
            curveTo(10.105f, 21f, 11f, 20.105f, 11f, 19f)
            curveTo(11f, 17.895f, 10.105f, 17f, 9f, 17f)
            curveTo(7.895f, 17f, 7f, 17.895f, 7f, 19f)
            curveTo(7f, 20.105f, 7.895f, 21f, 9f, 21f)
            close()
            moveTo(16f, 21f)
            curveTo(17.105f, 21f, 18f, 20.105f, 18f, 19f)
            curveTo(18f, 17.895f, 17.105f, 17f, 16f, 17f)
            curveTo(14.895f, 17f, 14f, 17.895f, 14f, 19f)
            curveTo(14f, 20.105f, 14.895f, 21f, 16f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Cart, contentDescription = null)
    }
}
