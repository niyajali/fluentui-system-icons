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

public val FluentIcons.Filled.DocumentAdd: ImageVector
    get() {
        if (_DocumentAdd != null) {
            return _DocumentAdd!!
        }
        _DocumentAdd = ImageVector.Builder(
            name = "Filled.DocumentAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(11.19f)
                curveTo(12.311f, 20.832f, 13f, 19.247f, 13f, 17.5f)
                curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
                curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
                curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
                curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
                curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
                close()
                moveTo(7.001f, 18f)
                lineTo(7.001f, 20.503f)
                curveTo(7.001f, 20.78f, 6.777f, 21.003f, 6.501f, 21.003f)
                curveTo(6.225f, 21.003f, 6.001f, 20.78f, 6.001f, 20.503f)
                lineTo(6.001f, 18f)
                horizontalLineTo(3.496f)
                curveTo(3.22f, 18f, 2.996f, 17.776f, 2.996f, 17.5f)
                curveTo(2.996f, 17.224f, 3.22f, 17f, 3.496f, 17f)
                horizontalLineTo(6f)
                lineTo(6f, 14.499f)
                curveTo(6f, 14.223f, 6.224f, 13.999f, 6.5f, 13.999f)
                curveTo(6.776f, 13.999f, 7f, 14.223f, 7f, 14.499f)
                lineTo(7f, 17f)
                horizontalLineTo(9.497f)
                curveTo(9.772f, 17f, 9.996f, 17.224f, 9.996f, 17.5f)
                curveTo(9.996f, 17.776f, 9.772f, 18f, 9.497f, 18f)
                horizontalLineTo(7.001f)
                close()
            }
        }.build()

        return _DocumentAdd!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentAdd: ImageVector? = null

@Preview
@Composable
private fun DocumentAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentAdd, contentDescription = null)
    }
}
