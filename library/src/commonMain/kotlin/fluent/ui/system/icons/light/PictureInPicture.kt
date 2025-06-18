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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.PictureInPicture: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PictureInPicture",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 3f)
            curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
            verticalLineTo(22.5f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineTo(14.729f)
            curveTo(14.628f, 26.679f, 14.559f, 26.345f, 14.525f, 26f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 26f, 3f, 24.433f, 3f, 22.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.567f, 4.567f, 4f, 6.5f, 4f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 4f, 29f, 5.567f, 29f, 7.5f)
            verticalLineTo(15.729f)
            curveTo(29.352f, 15.839f, 29.687f, 15.988f, 30f, 16.169f)
            verticalLineTo(7.5f)
            curveTo(30f, 5.015f, 27.985f, 3f, 25.5f, 3f)
            horizontalLineTo(6.5f)
            close()
            moveTo(16f, 20.5f)
            curveTo(16f, 18.567f, 17.567f, 17f, 19.5f, 17f)
            horizontalLineTo(27.5f)
            curveTo(29.433f, 17f, 31f, 18.567f, 31f, 20.5f)
            verticalLineTo(25.5f)
            curveTo(31f, 27.433f, 29.433f, 29f, 27.5f, 29f)
            horizontalLineTo(19.5f)
            curveTo(17.567f, 29f, 16f, 27.433f, 16f, 25.5f)
            verticalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PictureInPicturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PictureInPicture, contentDescription = null)
    }
}
