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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Light.ImageCopy: ImageVector
    get() {
        if (_ImageCopy != null) {
            return _ImageCopy!!
        }
        _ImageCopy = ImageVector.Builder(
            name = "Light.ImageCopy",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20f, 10.5f)
                curveTo(20f, 11.328f, 20.672f, 12f, 21.5f, 12f)
                curveTo(22.328f, 12f, 23f, 11.328f, 23f, 10.5f)
                curveTo(23f, 9.672f, 22.328f, 9f, 21.5f, 9f)
                curveTo(20.672f, 9f, 20f, 9.672f, 20f, 10.5f)
                close()
                moveTo(23.5f, 4f)
                curveTo(25.985f, 4f, 28f, 6.015f, 28f, 8.5f)
                verticalLineTo(21.5f)
                curveTo(28f, 23.985f, 25.985f, 26f, 23.5f, 26f)
                horizontalLineTo(10.5f)
                curveTo(8.015f, 26f, 6f, 23.985f, 6f, 21.5f)
                verticalLineTo(8.5f)
                curveTo(6f, 6.015f, 8.015f, 4f, 10.5f, 4f)
                horizontalLineTo(23.5f)
                close()
                moveTo(27f, 8.5f)
                curveTo(27f, 6.567f, 25.433f, 5f, 23.5f, 5f)
                horizontalLineTo(10.5f)
                curveTo(8.567f, 5f, 7f, 6.567f, 7f, 8.5f)
                verticalLineTo(21.5f)
                curveTo(7f, 22.286f, 7.259f, 23.012f, 7.697f, 23.596f)
                lineTo(15.798f, 15.495f)
                curveTo(16.462f, 14.831f, 17.538f, 14.831f, 18.202f, 15.495f)
                lineTo(26.303f, 23.596f)
                curveTo(26.741f, 23.012f, 27f, 22.286f, 27f, 21.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(25.596f, 24.303f)
                lineTo(17.495f, 16.202f)
                curveTo(17.222f, 15.929f, 16.778f, 15.929f, 16.505f, 16.202f)
                lineTo(8.404f, 24.303f)
                curveTo(8.988f, 24.741f, 9.714f, 25f, 10.5f, 25f)
                horizontalLineTo(23.5f)
                curveTo(24.286f, 25f, 25.012f, 24.741f, 25.596f, 24.303f)
                close()
                moveTo(23.329f, 28f)
                curveTo(22.556f, 28.625f, 21.572f, 29f, 20.5f, 29f)
                horizontalLineTo(10.5f)
                curveTo(6.358f, 29f, 3f, 25.642f, 3f, 21.5f)
                verticalLineTo(11.5f)
                curveTo(3f, 10.428f, 3.375f, 9.444f, 4f, 8.671f)
                verticalLineTo(21.5f)
                curveTo(4f, 25.09f, 6.91f, 28f, 10.5f, 28f)
                horizontalLineTo(23.329f)
                close()
            }
        }.build()

        return _ImageCopy!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCopy: ImageVector? = null

@Preview
@Composable
private fun ImageCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ImageCopy, contentDescription = null)
    }
}
