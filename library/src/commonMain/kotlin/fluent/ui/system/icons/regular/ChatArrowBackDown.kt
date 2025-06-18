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

public val FluentUi.Regular.ChatArrowBackDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatArrowBackDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 12.263f, 21.99f, 12.523f, 21.97f, 12.781f)
            curveTo(21.532f, 12.366f, 21.036f, 12.011f, 20.496f, 11.73f)
            curveTo(20.353f, 7.161f, 16.604f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 13.47f, 3.873f, 14.883f, 4.573f, 16.138f)
            lineTo(4.724f, 16.407f)
            lineTo(3.611f, 20.391f)
            lineTo(7.598f, 19.279f)
            lineTo(7.867f, 19.43f)
            curveTo(9.043f, 20.085f, 10.359f, 20.453f, 11.73f, 20.496f)
            curveTo(12.011f, 21.036f, 12.366f, 21.532f, 12.781f, 21.97f)
            curveTo(12.523f, 21.99f, 12.263f, 22f, 12f, 22f)
            curveTo(10.382f, 22f, 8.818f, 21.615f, 7.413f, 20.888f)
            lineTo(3.587f, 21.955f)
            curveTo(2.922f, 22.141f, 2.233f, 21.753f, 2.047f, 21.088f)
            curveTo(1.985f, 20.868f, 1.985f, 20.635f, 2.047f, 20.415f)
            lineTo(3.115f, 16.592f)
            curveTo(2.386f, 15.186f, 2f, 13.62f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(16.354f, 19.646f)
            curveTo(16.549f, 19.842f, 16.549f, 20.158f, 16.354f, 20.354f)
            curveTo(16.158f, 20.549f, 15.842f, 20.549f, 15.646f, 20.354f)
            lineTo(14.146f, 18.854f)
            curveTo(13.951f, 18.658f, 13.951f, 18.342f, 14.146f, 18.146f)
            lineTo(15.646f, 16.646f)
            curveTo(15.842f, 16.451f, 16.158f, 16.451f, 16.354f, 16.646f)
            curveTo(16.549f, 16.842f, 16.549f, 17.158f, 16.354f, 17.354f)
            lineTo(15.707f, 18f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 18f, 20f, 16.993f, 20f, 15.75f)
            verticalLineTo(15.5f)
            curveTo(20f, 15.224f, 20.224f, 15f, 20.5f, 15f)
            curveTo(20.776f, 15f, 21f, 15.224f, 21f, 15.5f)
            verticalLineTo(15.75f)
            curveTo(21f, 17.545f, 19.545f, 19f, 17.75f, 19f)
            horizontalLineTo(15.707f)
            lineTo(16.354f, 19.646f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatArrowBackDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChatArrowBackDown, contentDescription = null)
    }
}
