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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.RotateLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.RotateLeft",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.854f, 2.854f)
            curveTo(13.049f, 2.658f, 13.049f, 2.342f, 12.854f, 2.146f)
            curveTo(12.658f, 1.951f, 12.342f, 1.951f, 12.146f, 2.146f)
            lineTo(7.146f, 7.146f)
            curveTo(6.951f, 7.342f, 6.951f, 7.658f, 7.146f, 7.854f)
            lineTo(12.146f, 12.854f)
            curveTo(12.342f, 13.049f, 12.658f, 13.049f, 12.854f, 12.854f)
            curveTo(13.049f, 12.658f, 13.049f, 12.342f, 12.854f, 12.146f)
            lineTo(8.707f, 8f)
            horizontalLineTo(23f)
            curveTo(25.761f, 8f, 28f, 10.239f, 28f, 13f)
            curveTo(28f, 15.761f, 25.761f, 18f, 23f, 18f)
            horizontalLineTo(20.5f)
            curveTo(20.224f, 18f, 20f, 18.224f, 20f, 18.5f)
            curveTo(20f, 18.776f, 20.224f, 19f, 20.5f, 19f)
            horizontalLineTo(23f)
            curveTo(26.314f, 19f, 29f, 16.314f, 29f, 13f)
            curveTo(29f, 9.686f, 26.314f, 7f, 23f, 7f)
            horizontalLineTo(8.707f)
            lineTo(12.854f, 2.854f)
            close()
            moveTo(3.744f, 14.064f)
            curveTo(3.589f, 13.977f, 3.4f, 13.979f, 3.247f, 14.069f)
            curveTo(3.094f, 14.158f, 3f, 14.323f, 3f, 14.5f)
            verticalLineTo(28f)
            curveTo(3f, 28.552f, 3.448f, 29f, 4f, 29f)
            horizontalLineTo(28.5f)
            curveTo(28.728f, 29f, 28.926f, 28.846f, 28.984f, 28.626f)
            curveTo(29.041f, 28.406f, 28.943f, 28.175f, 28.744f, 28.064f)
            lineTo(3.744f, 14.064f)
            close()
            moveTo(4f, 28f)
            verticalLineTo(15.353f)
            lineTo(26.584f, 28f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RotateLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.RotateLeft, contentDescription = null)
    }
}
