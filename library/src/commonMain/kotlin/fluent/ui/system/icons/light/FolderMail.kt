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

public val FluentIcons.Light.FolderMail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.FolderMail",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 12f)
            horizontalLineTo(10.592f)
            curveTo(11.313f, 12f, 11.999f, 11.689f, 12.474f, 11.146f)
            lineTo(15.227f, 8f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 8f, 29f, 9.567f, 29f, 11.5f)
            verticalLineTo(14.611f)
            curveTo(29.351f, 14.691f, 29.686f, 14.812f, 30f, 14.968f)
            verticalLineTo(11.5f)
            curveTo(30f, 9.015f, 27.985f, 7f, 25.5f, 7f)
            horizontalLineTo(14.707f)
            lineTo(12.439f, 4.732f)
            curveTo(11.97f, 4.263f, 11.335f, 4f, 10.672f, 4f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
            verticalLineTo(23.5f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            horizontalLineTo(13.611f)
            curveTo(13.538f, 27.678f, 13.5f, 27.344f, 13.5f, 27f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 27f, 3f, 25.433f, 3f, 23.5f)
            verticalLineTo(12f)
            close()
            moveTo(3f, 8.5f)
            curveTo(3f, 6.567f, 4.567f, 5f, 6.5f, 5f)
            horizontalLineTo(10.672f)
            curveTo(11.069f, 5f, 11.451f, 5.158f, 11.732f, 5.439f)
            lineTo(14.082f, 7.789f)
            lineTo(11.721f, 10.488f)
            curveTo(11.436f, 10.813f, 11.025f, 11f, 10.592f, 11f)
            horizontalLineTo(3f)
            verticalLineTo(8.5f)
            close()
            moveTo(15f, 19f)
            curveTo(15f, 17.343f, 16.343f, 16f, 18f, 16f)
            horizontalLineTo(28f)
            curveTo(29.657f, 16f, 31f, 17.343f, 31f, 19f)
            verticalLineTo(19.198f)
            lineTo(23f, 23.642f)
            lineTo(15f, 19.198f)
            verticalLineTo(19f)
            close()
            moveTo(23.364f, 25.156f)
            lineTo(31f, 20.913f)
            verticalLineTo(27f)
            curveTo(31f, 28.657f, 29.657f, 30f, 28f, 30f)
            horizontalLineTo(18f)
            curveTo(16.343f, 30f, 15f, 28.657f, 15f, 27f)
            verticalLineTo(20.913f)
            lineTo(22.636f, 25.156f)
            curveTo(22.862f, 25.281f, 23.138f, 25.281f, 23.364f, 25.156f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.FolderMail, contentDescription = null)
    }
}
