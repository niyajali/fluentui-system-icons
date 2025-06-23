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

public val FluentIcons.Light.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Light.Document",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 5f)
                curveTo(6f, 3.895f, 6.895f, 3f, 8f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                curveTo(16f, 11.657f, 17.343f, 13f, 19f, 13f)
                horizontalLineTo(26f)
                verticalLineTo(27f)
                curveTo(26f, 28.105f, 25.105f, 29f, 24f, 29f)
                horizontalLineTo(8f)
                curveTo(6.895f, 29f, 6f, 28.105f, 6f, 27f)
                verticalLineTo(5f)
                close()
                moveTo(25.927f, 12f)
                horizontalLineTo(19f)
                curveTo(17.895f, 12f, 17f, 11.105f, 17f, 10f)
                verticalLineTo(3.073f)
                curveTo(17.329f, 3.165f, 17.633f, 3.34f, 17.879f, 3.586f)
                lineTo(25.414f, 11.121f)
                curveTo(25.66f, 11.367f, 25.835f, 11.671f, 25.927f, 12f)
                close()
                moveTo(8f, 2f)
                curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
                verticalLineTo(27f)
                curveTo(5f, 28.657f, 6.343f, 30f, 8f, 30f)
                horizontalLineTo(24f)
                curveTo(25.657f, 30f, 27f, 28.657f, 27f, 27f)
                verticalLineTo(12.535f)
                curveTo(27f, 11.74f, 26.684f, 10.977f, 26.121f, 10.414f)
                lineTo(18.586f, 2.879f)
                curveTo(18.023f, 2.316f, 17.26f, 2f, 16.465f, 2f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null

@Preview
@Composable
private fun DocumentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Document, contentDescription = null)
    }
}
