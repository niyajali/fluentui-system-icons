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

public val FluentIcons.Filled.ArrowExit: ImageVector
    get() {
        if (_ArrowExit != null) {
            return _ArrowExit!!
        }
        _ArrowExit = ImageVector.Builder(
            name = "Filled.ArrowExit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.5f, 3f)
                curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
                horizontalLineTo(15f)
                curveTo(15.552f, 21f, 16f, 20.552f, 16f, 20f)
                curveTo(16f, 19.448f, 15.552f, 19f, 15f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(5f, 5.672f, 5.672f, 5f, 6.5f, 5f)
                horizontalLineTo(15f)
                curveTo(15.552f, 5f, 16f, 4.552f, 16f, 4f)
                curveTo(16f, 3.448f, 15.552f, 3f, 15f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.707f, 7.293f)
                curveTo(17.317f, 6.902f, 16.683f, 6.902f, 16.293f, 7.293f)
                curveTo(15.902f, 7.683f, 15.902f, 8.317f, 16.293f, 8.707f)
                lineTo(18.586f, 11f)
                horizontalLineTo(9f)
                curveTo(8.448f, 11f, 8f, 11.448f, 8f, 12f)
                curveTo(8f, 12.552f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(18.586f)
                lineTo(16.293f, 15.293f)
                curveTo(15.902f, 15.683f, 15.902f, 16.317f, 16.293f, 16.707f)
                curveTo(16.683f, 17.098f, 17.317f, 17.098f, 17.707f, 16.707f)
                lineTo(21.707f, 12.707f)
                curveTo(22.098f, 12.317f, 22.098f, 11.683f, 21.707f, 11.293f)
                lineTo(17.707f, 7.293f)
                close()
            }
        }.build()

        return _ArrowExit!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExit: ImageVector? = null

@Preview
@Composable
private fun ArrowExitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowExit, contentDescription = null)
    }
}
