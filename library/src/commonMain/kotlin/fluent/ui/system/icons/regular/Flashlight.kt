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

public val FluentIcons.Regular.Flashlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flashlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 2f)
            curveTo(17.5f, 1.586f, 17.164f, 1.25f, 16.75f, 1.25f)
            curveTo(16.336f, 1.25f, 16f, 1.586f, 16f, 2f)
            verticalLineTo(3f)
            curveTo(16f, 3.414f, 16.336f, 3.75f, 16.75f, 3.75f)
            curveTo(17.164f, 3.75f, 17.5f, 3.414f, 17.5f, 3f)
            verticalLineTo(2f)
            close()
            moveTo(21.53f, 2.47f)
            curveTo(21.237f, 2.177f, 20.762f, 2.177f, 20.469f, 2.47f)
            lineTo(18.469f, 4.47f)
            curveTo(18.177f, 4.763f, 18.177f, 5.237f, 18.469f, 5.53f)
            curveTo(18.762f, 5.823f, 19.237f, 5.823f, 19.53f, 5.53f)
            lineTo(21.53f, 3.53f)
            curveTo(21.823f, 3.237f, 21.823f, 2.763f, 21.53f, 2.47f)
            close()
            moveTo(8.03f, 17.03f)
            lineTo(9.53f, 15.53f)
            curveTo(9.823f, 15.237f, 9.823f, 14.763f, 9.53f, 14.47f)
            curveTo(9.237f, 14.177f, 8.762f, 14.177f, 8.469f, 14.47f)
            lineTo(6.969f, 15.97f)
            curveTo(6.677f, 16.263f, 6.677f, 16.737f, 6.969f, 17.03f)
            curveTo(7.262f, 17.323f, 7.737f, 17.323f, 8.03f, 17.03f)
            close()
            moveTo(8.25f, 6f)
            verticalLineTo(10.689f)
            lineTo(3.03f, 15.909f)
            curveTo(2.151f, 16.788f, 2.151f, 18.212f, 3.03f, 19.091f)
            lineTo(4.909f, 20.97f)
            curveTo(5.787f, 21.848f, 7.212f, 21.848f, 8.091f, 20.97f)
            lineTo(13.31f, 15.75f)
            horizontalLineTo(18f)
            curveTo(18.199f, 15.75f, 18.389f, 15.671f, 18.53f, 15.53f)
            lineTo(20.469f, 13.591f)
            curveTo(21.348f, 12.712f, 21.348f, 11.288f, 20.469f, 10.409f)
            lineTo(13.591f, 3.53f)
            curveTo(12.712f, 2.652f, 11.288f, 2.652f, 10.409f, 3.53f)
            lineTo(8.469f, 5.47f)
            curveTo(8.329f, 5.61f, 8.25f, 5.801f, 8.25f, 6f)
            close()
            moveTo(11.469f, 4.591f)
            curveTo(11.762f, 4.298f, 12.237f, 4.298f, 12.53f, 4.591f)
            lineTo(19.409f, 11.47f)
            curveTo(19.702f, 11.763f, 19.702f, 12.237f, 19.409f, 12.53f)
            lineTo(18f, 13.939f)
            lineTo(10.06f, 6f)
            lineTo(11.469f, 4.591f)
            close()
            moveTo(9.75f, 7.811f)
            lineTo(16.189f, 14.25f)
            horizontalLineTo(13.31f)
            lineTo(9.75f, 10.689f)
            verticalLineTo(7.811f)
            close()
            moveTo(9f, 12.061f)
            lineTo(11.939f, 15f)
            lineTo(7.03f, 19.909f)
            curveTo(6.737f, 20.202f, 6.262f, 20.202f, 5.969f, 19.909f)
            lineTo(4.091f, 18.03f)
            curveTo(3.798f, 17.737f, 3.798f, 17.263f, 4.091f, 16.97f)
            lineTo(9f, 12.061f)
            close()
            moveTo(21f, 8f)
            horizontalLineTo(22f)
            curveTo(22.414f, 8f, 22.75f, 7.664f, 22.75f, 7.25f)
            curveTo(22.75f, 6.836f, 22.414f, 6.5f, 22f, 6.5f)
            horizontalLineTo(21f)
            curveTo(20.586f, 6.5f, 20.25f, 6.836f, 20.25f, 7.25f)
            curveTo(20.25f, 7.664f, 20.586f, 8f, 21f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Flashlight, contentDescription = null)
    }
}
