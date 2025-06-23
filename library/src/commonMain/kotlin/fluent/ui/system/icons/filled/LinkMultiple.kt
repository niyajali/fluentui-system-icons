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

public val FluentIcons.Filled.LinkMultiple: ImageVector
    get() {
        if (_LinkMultiple != null) {
            return _LinkMultiple!!
        }
        _LinkMultiple = ImageVector.Builder(
            name = "Filled.LinkMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.5f, 4f)
                curveTo(3.462f, 4f, 1f, 6.462f, 1f, 9.5f)
                curveTo(1f, 11.836f, 2.456f, 13.832f, 4.51f, 14.629f)
                curveTo(4.55f, 13.929f, 4.7f, 13.259f, 4.943f, 12.636f)
                curveTo(3.792f, 12.063f, 3f, 10.874f, 3f, 9.5f)
                curveTo(3f, 7.567f, 4.567f, 6f, 6.5f, 6f)
                horizontalLineTo(12.5f)
                curveTo(14.433f, 6f, 16f, 7.567f, 16f, 9.5f)
                curveTo(16f, 11.433f, 14.433f, 13f, 12.5f, 13f)
                horizontalLineTo(12f)
                curveTo(11.448f, 13f, 11f, 13.448f, 11f, 14f)
                curveTo(11f, 14.552f, 11.448f, 15f, 12f, 15f)
                horizontalLineTo(12.5f)
                curveTo(15.538f, 15f, 18f, 12.538f, 18f, 9.5f)
                curveTo(18f, 6.462f, 15.538f, 4f, 12.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.114f, 12.213f)
                curveTo(20.219f, 12.656f, 21f, 13.737f, 21f, 15f)
                curveTo(21f, 16.657f, 19.657f, 18f, 18f, 18f)
                horizontalLineTo(11f)
                curveTo(9.343f, 18f, 8f, 16.657f, 8f, 15f)
                curveTo(8f, 13.343f, 9.343f, 12f, 11f, 12f)
                horizontalLineTo(12f)
                curveTo(12.552f, 12f, 13f, 11.552f, 13f, 11f)
                curveTo(13f, 10.448f, 12.552f, 10f, 12f, 10f)
                horizontalLineTo(11f)
                curveTo(8.239f, 10f, 6f, 12.239f, 6f, 15f)
                curveTo(6f, 17.761f, 8.239f, 20f, 11f, 20f)
                horizontalLineTo(18f)
                curveTo(20.761f, 20f, 23f, 17.761f, 23f, 15f)
                curveTo(23f, 12.76f, 21.527f, 10.864f, 19.496f, 10.228f)
                curveTo(19.472f, 10.923f, 19.339f, 11.59f, 19.114f, 12.213f)
                close()
            }
        }.build()

        return _LinkMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LinkMultiple: ImageVector? = null

@Preview
@Composable
private fun LinkMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LinkMultiple, contentDescription = null)
    }
}
