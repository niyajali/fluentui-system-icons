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

public val FluentIcons.Regular.ClipboardMonth: ImageVector
    get() {
        if (_ClipboardMonth != null) {
            return _ClipboardMonth!!
        }
        _ClipboardMonth = ImageVector.Builder(
            name = "Regular.ClipboardMonth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.25f, 12.5f)
                curveTo(8.94f, 12.5f, 9.5f, 11.94f, 9.5f, 11.25f)
                curveTo(9.5f, 10.56f, 8.94f, 10f, 8.25f, 10f)
                curveTo(7.56f, 10f, 7f, 10.56f, 7f, 11.25f)
                curveTo(7f, 11.94f, 7.56f, 12.5f, 8.25f, 12.5f)
                close()
                moveTo(8.25f, 16.5f)
                curveTo(8.94f, 16.5f, 9.5f, 15.94f, 9.5f, 15.25f)
                curveTo(9.5f, 14.56f, 8.94f, 14f, 8.25f, 14f)
                curveTo(7.56f, 14f, 7f, 14.56f, 7f, 15.25f)
                curveTo(7f, 15.94f, 7.56f, 16.5f, 8.25f, 16.5f)
                close()
                moveTo(17.5f, 11.25f)
                curveTo(17.5f, 11.94f, 16.94f, 12.5f, 16.25f, 12.5f)
                curveTo(15.56f, 12.5f, 15f, 11.94f, 15f, 11.25f)
                curveTo(15f, 10.56f, 15.56f, 10f, 16.25f, 10f)
                curveTo(16.94f, 10f, 17.5f, 10.56f, 17.5f, 11.25f)
                close()
                moveTo(12.25f, 12.5f)
                curveTo(12.94f, 12.5f, 13.5f, 11.94f, 13.5f, 11.25f)
                curveTo(13.5f, 10.56f, 12.94f, 10f, 12.25f, 10f)
                curveTo(11.56f, 10f, 11f, 10.56f, 11f, 11.25f)
                curveTo(11f, 11.94f, 11.56f, 12.5f, 12.25f, 12.5f)
                close()
                moveTo(13.5f, 15.25f)
                curveTo(13.5f, 15.94f, 12.94f, 16.5f, 12.25f, 16.5f)
                curveTo(11.56f, 16.5f, 11f, 15.94f, 11f, 15.25f)
                curveTo(11f, 14.56f, 11.56f, 14f, 12.25f, 14f)
                curveTo(12.94f, 14f, 13.5f, 14.56f, 13.5f, 15.25f)
                close()
                moveTo(15.994f, 4.084f)
                curveTo(15.909f, 2.919f, 14.937f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                curveTo(15.989f, 4.028f, 15.992f, 4.056f, 15.994f, 4.084f)
                close()
                moveTo(15.995f, 4.096f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
                close()
                moveTo(10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.217f, 6.103f, 15.621f, 5.5f)
                lineTo(17.75f, 5.5f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5f)
                curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
            }
        }.build()

        return _ClipboardMonth!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardMonth: ImageVector? = null

@Preview
@Composable
private fun ClipboardMonthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardMonth, contentDescription = null)
    }
}
