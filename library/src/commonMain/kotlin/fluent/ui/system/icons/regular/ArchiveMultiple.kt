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

public val FluentIcons.Regular.ArchiveMultiple: ImageVector
    get() {
        if (_ArchiveMultiple != null) {
            return _ArchiveMultiple!!
        }
        _ArchiveMultiple = ImageVector.Builder(
            name = "Regular.ArchiveMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 10.5f)
                curveTo(9.336f, 10.5f, 9f, 10.836f, 9f, 11.25f)
                curveTo(9f, 11.664f, 9.336f, 12f, 9.75f, 12f)
                horizontalLineTo(13.227f)
                curveTo(13.641f, 12f, 13.977f, 11.664f, 13.977f, 11.25f)
                curveTo(13.977f, 10.836f, 13.641f, 10.5f, 13.227f, 10.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(4.75f, 2f)
                curveTo(3.783f, 2f, 3f, 2.783f, 3f, 3.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 6.948f, 3.409f, 7.551f, 4f, 7.832f)
                verticalLineTo(15.75f)
                curveTo(4f, 17.821f, 5.679f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(17.321f, 19.5f, 19f, 17.821f, 19f, 15.75f)
                verticalLineTo(7.832f)
                curveTo(19.591f, 7.551f, 20f, 6.948f, 20f, 6.25f)
                verticalLineTo(3.75f)
                curveTo(20f, 2.783f, 19.216f, 2f, 18.25f, 2f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.5f, 15.75f)
                verticalLineTo(8f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 16.993f, 16.493f, 18f, 15.25f, 18f)
                horizontalLineTo(7.75f)
                curveTo(6.507f, 18f, 5.5f, 16.993f, 5.5f, 15.75f)
                close()
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 3.612f, 4.612f, 3.5f, 4.75f, 3.5f)
                horizontalLineTo(18.25f)
                curveTo(18.388f, 3.5f, 18.5f, 3.612f, 18.5f, 3.75f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 6.388f, 18.388f, 6.5f, 18.25f, 6.5f)
                horizontalLineTo(4.75f)
                curveTo(4.612f, 6.5f, 4.5f, 6.388f, 4.5f, 6.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(21.5f, 11.75f)
                curveTo(21.5f, 10.523f, 20.911f, 9.434f, 20f, 8.75f)
                verticalLineTo(16.25f)
                curveTo(20f, 18.597f, 18.097f, 20.5f, 15.75f, 20.5f)
                horizontalLineTo(10.25f)
                lineTo(10.243f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.934f, 21.411f, 9.023f, 22f, 10.25f, 22f)
                horizontalLineTo(15.75f)
                curveTo(18.926f, 22f, 21.5f, 19.426f, 21.5f, 16.25f)
                verticalLineTo(11.75f)
                close()
            }
        }.build()

        return _ArchiveMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMultiple: ImageVector? = null

@Preview
@Composable
private fun ArchiveMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArchiveMultiple, contentDescription = null)
    }
}
