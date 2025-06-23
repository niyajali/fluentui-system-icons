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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ImageCopy: ImageVector
    get() {
        if (_ImageCopy != null) {
            return _ImageCopy!!
        }
        _ImageCopy = ImageVector.Builder(
            name = "Filled.ImageCopy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.507f, 6.008f)
                curveTo(3.601f, 6.583f, 3f, 7.596f, 3f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(3f, 18.149f, 5.351f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(14.75f)
                curveTo(15.904f, 20.5f, 16.917f, 19.899f, 17.494f, 18.993f)
                lineTo(17.372f, 18.998f)
                lineTo(17.25f, 19f)
                horizontalLineTo(8.25f)
                curveTo(6.179f, 19f, 4.5f, 17.321f, 4.5f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.169f, 4.502f, 6.088f, 4.507f, 6.008f)
                close()
                moveTo(12.571f, 12.149f)
                lineTo(12.477f, 12.227f)
                lineTo(7.083f, 17.54f)
                curveTo(7.57f, 17.832f, 8.141f, 18f, 8.75f, 18f)
                horizontalLineTo(17.25f)
                curveTo(17.871f, 18f, 18.451f, 17.826f, 18.945f, 17.524f)
                lineTo(13.528f, 12.225f)
                lineTo(13.444f, 12.155f)
                curveTo(13.217f, 11.989f, 12.919f, 11.967f, 12.672f, 12.088f)
                lineTo(12.571f, 12.149f)
                close()
                moveTo(8.75f, 3f)
                curveTo(6.955f, 3f, 5.5f, 4.455f, 5.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(5.5f, 15.392f, 5.686f, 15.99f, 6.007f, 16.493f)
                lineTo(11.425f, 11.158f)
                lineTo(11.553f, 11.041f)
                curveTo(12.385f, 10.339f, 13.605f, 10.335f, 14.441f, 11.031f)
                lineTo(14.577f, 11.153f)
                lineTo(20.01f, 16.467f)
                curveTo(20.32f, 15.969f, 20.5f, 15.38f, 20.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 4.455f, 19.045f, 3f, 17.25f, 3f)
                horizontalLineTo(8.75f)
                close()
                moveTo(9.5f, 5.751f)
                curveTo(10.189f, 5.751f, 10.749f, 6.31f, 10.749f, 7f)
                curveTo(10.749f, 7.69f, 10.189f, 8.25f, 9.5f, 8.25f)
                curveTo(8.81f, 8.25f, 8.25f, 7.69f, 8.25f, 7f)
                curveTo(8.25f, 6.31f, 8.81f, 5.751f, 9.5f, 5.751f)
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
        Image(imageVector = FluentIcons.Filled.ImageCopy, contentDescription = null)
    }
}
