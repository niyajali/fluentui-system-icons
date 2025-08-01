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

public val FluentIcons.Light.ZoomIn: ImageVector
    get() {
        if (_ZoomIn != null) {
            return _ZoomIn!!
        }
        _ZoomIn = ImageVector.Builder(
            name = "Light.ZoomIn",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 13f)
                curveTo(8f, 12.724f, 8.224f, 12.5f, 8.5f, 12.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(8.5f)
                curveTo(12.5f, 8.224f, 12.724f, 8f, 13f, 8f)
                curveTo(13.276f, 8f, 13.5f, 8.224f, 13.5f, 8.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 12.5f, 18f, 12.724f, 18f, 13f)
                curveTo(18f, 13.276f, 17.776f, 13.5f, 17.5f, 13.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(17.5f)
                curveTo(13.5f, 17.776f, 13.276f, 18f, 13f, 18f)
                curveTo(12.724f, 18f, 12.5f, 17.776f, 12.5f, 17.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 13.5f, 8f, 13.276f, 8f, 13f)
                close()
                moveTo(19.709f, 20.416f)
                lineTo(28.146f, 28.854f)
                curveTo(28.342f, 29.049f, 28.658f, 29.049f, 28.854f, 28.854f)
                curveTo(29.049f, 28.658f, 29.049f, 28.342f, 28.854f, 28.146f)
                lineTo(20.416f, 19.709f)
                curveTo(22.022f, 17.935f, 23f, 15.582f, 23f, 13f)
                curveTo(23f, 7.477f, 18.523f, 3f, 13f, 3f)
                curveTo(7.477f, 3f, 3f, 7.477f, 3f, 13f)
                curveTo(3f, 18.523f, 7.477f, 23f, 13f, 23f)
                curveTo(15.582f, 23f, 17.935f, 22.022f, 19.709f, 20.416f)
                close()
                moveTo(22f, 13f)
                curveTo(22f, 17.971f, 17.971f, 22f, 13f, 22f)
                curveTo(8.029f, 22f, 4f, 17.971f, 4f, 13f)
                curveTo(4f, 8.029f, 8.029f, 4f, 13f, 4f)
                curveTo(17.971f, 4f, 22f, 8.029f, 22f, 13f)
                close()
            }
        }.build()

        return _ZoomIn!!
    }

@Suppress("ObjectPropertyName")
private var _ZoomIn: ImageVector? = null

@Preview
@Composable
private fun ZoomInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ZoomIn, contentDescription = null)
    }
}
