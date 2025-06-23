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

public val FluentIcons.Regular.ClipboardPaste: ImageVector
    get() {
        if (_ClipboardPaste != null) {
            return _ClipboardPaste!!
        }
        _ClipboardPaste = ImageVector.Builder(
            name = "Regular.ClipboardPaste",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.753f, 2f)
                curveTo(13.911f, 2f, 14.864f, 2.875f, 14.987f, 4f)
                lineTo(16.75f, 4f)
                curveTo(17.941f, 4f, 18.916f, 4.925f, 18.995f, 6.096f)
                lineTo(19f, 6.25f)
                curveTo(19f, 6.629f, 18.718f, 6.943f, 18.353f, 6.992f)
                lineTo(18.249f, 6.999f)
                curveTo(17.87f, 6.999f, 17.556f, 6.717f, 17.507f, 6.352f)
                lineTo(17.5f, 6.25f)
                curveTo(17.5f, 5.87f, 17.218f, 5.557f, 16.852f, 5.507f)
                lineTo(16.75f, 5.5f)
                lineTo(14.618f, 5.501f)
                curveTo(14.214f, 6.1f, 13.53f, 6.493f, 12.753f, 6.493f)
                horizontalLineTo(9.247f)
                curveTo(8.47f, 6.493f, 7.786f, 6.1f, 7.382f, 5.501f)
                lineTo(5.25f, 5.5f)
                curveTo(4.87f, 5.5f, 4.557f, 5.782f, 4.507f, 6.148f)
                lineTo(4.5f, 6.25f)
                verticalLineTo(19.755f)
                curveTo(4.5f, 20.134f, 4.782f, 20.448f, 5.148f, 20.498f)
                lineTo(5.25f, 20.505f)
                lineTo(8.25f, 20.504f)
                curveTo(8.63f, 20.504f, 8.943f, 20.786f, 8.993f, 21.152f)
                lineTo(9f, 21.254f)
                curveTo(9f, 21.668f, 8.664f, 22.004f, 8.25f, 22.004f)
                lineTo(5.25f, 22.005f)
                curveTo(4.059f, 22.005f, 3.084f, 21.079f, 3.005f, 19.909f)
                lineTo(3f, 19.755f)
                verticalLineTo(6.25f)
                curveTo(3f, 5.059f, 3.925f, 4.084f, 5.096f, 4.005f)
                lineTo(5.25f, 4f)
                lineTo(7.013f, 4f)
                curveTo(7.136f, 2.875f, 8.089f, 2f, 9.247f, 2f)
                horizontalLineTo(12.753f)
                close()
                moveTo(18.75f, 8f)
                curveTo(19.941f, 8f, 20.916f, 8.925f, 20.995f, 10.096f)
                lineTo(21f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(21f, 20.941f, 20.075f, 21.916f, 18.904f, 21.995f)
                lineTo(18.75f, 22f)
                horizontalLineTo(12.25f)
                curveTo(11.059f, 22f, 10.084f, 21.075f, 10.005f, 19.904f)
                lineTo(10f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(10f, 9.059f, 10.925f, 8.084f, 12.096f, 8.005f)
                lineTo(12.25f, 8f)
                horizontalLineTo(18.75f)
                close()
                moveTo(18.75f, 9.5f)
                horizontalLineTo(12.25f)
                curveTo(11.87f, 9.5f, 11.557f, 9.782f, 11.507f, 10.148f)
                lineTo(11.5f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(11.5f, 20.13f, 11.782f, 20.444f, 12.148f, 20.493f)
                lineTo(12.25f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.13f, 20.5f, 19.444f, 20.218f, 19.493f, 19.852f)
                lineTo(19.5f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(19.5f, 9.87f, 19.218f, 9.557f, 18.852f, 9.507f)
                lineTo(18.75f, 9.5f)
                close()
                moveTo(12.753f, 3.5f)
                horizontalLineTo(9.247f)
                curveTo(8.834f, 3.5f, 8.5f, 3.834f, 8.5f, 4.247f)
                curveTo(8.5f, 4.659f, 8.834f, 4.993f, 9.247f, 4.993f)
                horizontalLineTo(12.753f)
                curveTo(13.166f, 4.993f, 13.5f, 4.659f, 13.5f, 4.247f)
                curveTo(13.5f, 3.834f, 13.166f, 3.5f, 12.753f, 3.5f)
                close()
            }
        }.build()

        return _ClipboardPaste!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardPaste: ImageVector? = null

@Preview
@Composable
private fun ClipboardPastePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardPaste, contentDescription = null)
    }
}
