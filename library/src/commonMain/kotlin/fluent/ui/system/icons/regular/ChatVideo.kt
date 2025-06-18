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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ChatVideo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatVideo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            curveTo(13.105f, 8f, 14f, 8.895f, 14f, 10f)
            verticalLineTo(14f)
            curveTo(14f, 15.105f, 13.105f, 16f, 12f, 16f)
            horizontalLineTo(9f)
            curveTo(7.895f, 16f, 7f, 15.105f, 7f, 14f)
            verticalLineTo(10f)
            curveTo(7f, 8.895f, 7.895f, 8f, 9f, 8f)
            horizontalLineTo(12f)
            close()
            moveTo(15f, 13.162f)
            verticalLineTo(10.838f)
            lineTo(16.734f, 9.196f)
            curveTo(17.212f, 8.744f, 18f, 9.083f, 18f, 9.741f)
            verticalLineTo(14.259f)
            curveTo(18f, 14.917f, 17.212f, 15.256f, 16.734f, 14.804f)
            lineTo(15f, 13.162f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
            lineTo(2.047f, 20.415f)
            curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
            curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
            lineTo(7.413f, 20.888f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
            lineTo(7.598f, 19.279f)
            lineTo(3.611f, 20.391f)
            lineTo(4.724f, 16.407f)
            lineTo(4.573f, 16.138f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatVideo, contentDescription = null)
    }
}
