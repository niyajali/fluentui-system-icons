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

public val FluentIcons.Filled.ShiftsOpen: ImageVector
    get() {
        if (_ShiftsOpen != null) {
            return _ShiftsOpen!!
        }
        _ShiftsOpen = ImageVector.Builder(
            name = "Filled.ShiftsOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15f, 3f)
                curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
                curveTo(14f, 4.552f, 14.448f, 5f, 15f, 5f)
                lineTo(17.5f, 5f)
                curveTo(18.328f, 5f, 19f, 5.672f, 19f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(19f, 18.329f, 18.328f, 19f, 17.5f, 19f)
                horizontalLineTo(15f)
                curveTo(14.448f, 19f, 14f, 19.448f, 14f, 20f)
                curveTo(14f, 20.552f, 14.448f, 21f, 15f, 21f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(21f, 4.567f, 19.433f, 3f, 17.5f, 3f)
                lineTo(15f, 3f)
                close()
                moveTo(5f, 6.5f)
                curveTo(5f, 5.672f, 5.672f, 5f, 6.5f, 5f)
                horizontalLineTo(9f)
                curveTo(9.552f, 5f, 10f, 4.552f, 10f, 4f)
                curveTo(10f, 3.448f, 9.552f, 3f, 9f, 3f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
                horizontalLineTo(9f)
                curveTo(9.552f, 21f, 10f, 20.552f, 10f, 20f)
                curveTo(10f, 19.448f, 9.552f, 19f, 9f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 19f, 5f, 18.329f, 5f, 17.5f)
                lineTo(5f, 6.5f)
                close()
                moveTo(12.5f, 7f)
                curveTo(12.5f, 6.448f, 12.052f, 6f, 11.5f, 6f)
                curveTo(10.948f, 6f, 10.5f, 6.448f, 10.5f, 7f)
                verticalLineTo(13f)
                curveTo(10.5f, 13.552f, 10.948f, 14f, 11.5f, 14f)
                horizontalLineTo(15.997f)
                curveTo(16.549f, 14f, 16.997f, 13.552f, 16.997f, 13f)
                curveTo(16.997f, 12.448f, 16.549f, 12f, 15.997f, 12f)
                horizontalLineTo(12.5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ShiftsOpen!!
    }

@Suppress("ObjectPropertyName")
private var _ShiftsOpen: ImageVector? = null

@Preview
@Composable
private fun ShiftsOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShiftsOpen, contentDescription = null)
    }
}
