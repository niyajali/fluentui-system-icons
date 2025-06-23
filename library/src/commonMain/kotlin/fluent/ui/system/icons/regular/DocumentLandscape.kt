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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DocumentLandscape: ImageVector
    get() {
        if (_DocumentLandscape != null) {
            return _DocumentLandscape!!
        }
        _DocumentLandscape = ImageVector.Builder(
            name = "Regular.DocumentLandscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 5.5f)
                curveTo(3.725f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
                lineTo(3.5f, 18f)
                curveTo(3.5f, 18.276f, 3.725f, 18.5f, 4f, 18.5f)
                horizontalLineTo(20f)
                curveTo(20.275f, 18.5f, 20.5f, 18.276f, 20.5f, 18f)
                verticalLineTo(12f)
                lineTo(16f, 12f)
                curveTo(14.896f, 12f, 14f, 11.104f, 14f, 10f)
                verticalLineTo(5.5f)
                lineTo(4f, 5.5f)
                close()
                moveTo(19.379f, 10.5f)
                lineTo(15.5f, 6.622f)
                verticalLineTo(10f)
                curveTo(15.5f, 10.276f, 15.725f, 10.5f, 16f, 10.5f)
                horizontalLineTo(19.379f)
                close()
                moveTo(15.586f, 4.586f)
                lineTo(21.414f, 10.415f)
                curveTo(21.44f, 10.441f, 21.46f, 10.473f, 21.484f, 10.5f)
                curveTo(21.548f, 10.571f, 21.611f, 10.641f, 21.664f, 10.719f)
                curveTo(21.691f, 10.759f, 21.709f, 10.805f, 21.732f, 10.847f)
                curveTo(21.772f, 10.918f, 21.816f, 10.988f, 21.848f, 11.063f)
                curveTo(21.93f, 11.26f, 21.971f, 11.472f, 21.986f, 11.687f)
                curveTo(21.989f, 11.734f, 22f, 11.78f, 22f, 11.828f)
                verticalLineTo(18f)
                curveTo(22f, 19.104f, 21.104f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.896f, 20f, 2f, 19.104f, 2f, 18f)
                lineTo(2f, 6f)
                curveTo(2f, 4.896f, 2.896f, 4f, 4f, 4f)
                lineTo(14.172f, 4f)
                curveTo(14.702f, 4f, 15.211f, 4.211f, 15.586f, 4.586f)
                close()
            }
        }.build()

        return _DocumentLandscape!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLandscape: ImageVector? = null

@Preview
@Composable
private fun DocumentLandscapePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentLandscape, contentDescription = null)
    }
}
