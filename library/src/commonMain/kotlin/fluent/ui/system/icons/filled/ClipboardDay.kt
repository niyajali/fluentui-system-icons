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

public val FluentIcons.Filled.ClipboardDay: ImageVector
    get() {
        if (_ClipboardDay != null) {
            return _ClipboardDay!!
        }
        _ClipboardDay = ImageVector.Builder(
            name = "Filled.ClipboardDay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 13.75f)
                curveTo(9.5f, 13.612f, 9.612f, 13.5f, 9.75f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(14.388f, 13.5f, 14.5f, 13.612f, 14.5f, 13.75f)
                verticalLineTo(16.25f)
                curveTo(14.5f, 16.388f, 14.388f, 16.5f, 14.25f, 16.5f)
                horizontalLineTo(9.75f)
                curveTo(9.612f, 16.5f, 9.5f, 16.388f, 9.5f, 16.25f)
                verticalLineTo(13.75f)
                close()
                moveTo(10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
                lineTo(17.75f, 4f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                lineTo(8.014f, 3.999f)
                curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(8f, 9.75f)
                curveTo(8f, 10.164f, 8.336f, 10.5f, 8.75f, 10.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 10.5f, 16f, 10.164f, 16f, 9.75f)
                curveTo(16f, 9.336f, 15.664f, 9f, 15.25f, 9f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 9f, 8f, 9.336f, 8f, 9.75f)
                close()
                moveTo(9.75f, 12f)
                curveTo(8.783f, 12f, 8f, 12.783f, 8f, 13.75f)
                verticalLineTo(16.25f)
                curveTo(8f, 17.216f, 8.783f, 18f, 9.75f, 18f)
                horizontalLineTo(14.25f)
                curveTo(15.217f, 18f, 16f, 17.216f, 16f, 16.25f)
                verticalLineTo(13.75f)
                curveTo(16f, 12.783f, 15.217f, 12f, 14.25f, 12f)
                horizontalLineTo(9.75f)
                close()
            }
        }.build()

        return _ClipboardDay!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardDay: ImageVector? = null

@Preview
@Composable
private fun ClipboardDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardDay, contentDescription = null)
    }
}
