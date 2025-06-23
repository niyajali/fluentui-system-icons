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

public val FluentIcons.Filled.DataArea: ImageVector
    get() {
        if (_DataArea != null) {
            return _DataArea!!
        }
        _DataArea = ImageVector.Builder(
            name = "Filled.DataArea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 3f)
                curveTo(4.552f, 3f, 5f, 3.448f, 5f, 4f)
                verticalLineTo(17.5f)
                curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
                horizontalLineTo(20f)
                curveTo(20.552f, 19f, 21f, 19.448f, 21f, 20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                close()
                moveTo(19.5f, 6.75f)
                lineTo(19.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 18f, 6f, 17.776f, 6f, 17.5f)
                verticalLineTo(9.161f)
                lineTo(8.165f, 8.079f)
                curveTo(8.392f, 7.966f, 8.661f, 7.975f, 8.88f, 8.104f)
                lineTo(12.7f, 10.35f)
                lineTo(18.3f, 6.15f)
                curveTo(18.527f, 5.98f, 18.831f, 5.952f, 19.085f, 6.079f)
                curveTo(19.34f, 6.206f, 19.5f, 6.466f, 19.5f, 6.75f)
                close()
            }
        }.build()

        return _DataArea!!
    }

@Suppress("ObjectPropertyName")
private var _DataArea: ImageVector? = null

@Preview
@Composable
private fun DataAreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataArea, contentDescription = null)
    }
}
