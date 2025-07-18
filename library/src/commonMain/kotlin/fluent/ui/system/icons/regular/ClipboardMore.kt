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

public val FluentIcons.Regular.ClipboardMore: ImageVector
    get() {
        if (_ClipboardMore != null) {
            return _ClipboardMore!!
        }
        _ClipboardMore = ImageVector.Builder(
            name = "Regular.ClipboardMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.986f, 3.999f)
                curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(8.5f)
                curveTo(8.186f, 21.582f, 8f, 21.063f, 8f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5f)
                curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.217f, 6.103f, 15.621f, 5.5f)
                lineTo(17.75f, 5.5f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(19f)
                curveTo(18.861f, 18.52f, 19.39f, 18.174f, 20f, 18.05f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                close()
                moveTo(15.995f, 4.096f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(12f, 20.5f)
                curveTo(12f, 21.328f, 11.328f, 22f, 10.5f, 22f)
                curveTo(9.672f, 22f, 9f, 21.328f, 9f, 20.5f)
                curveTo(9f, 19.672f, 9.672f, 19f, 10.5f, 19f)
                curveTo(11.328f, 19f, 12f, 19.672f, 12f, 20.5f)
                close()
                moveTo(15.5f, 22f)
                curveTo(16.328f, 22f, 17f, 21.328f, 17f, 20.5f)
                curveTo(17f, 19.672f, 16.328f, 19f, 15.5f, 19f)
                curveTo(14.672f, 19f, 14f, 19.672f, 14f, 20.5f)
                curveTo(14f, 21.328f, 14.672f, 22f, 15.5f, 22f)
                close()
                moveTo(20.5f, 22f)
                curveTo(21.328f, 22f, 22f, 21.328f, 22f, 20.5f)
                curveTo(22f, 19.672f, 21.328f, 19f, 20.5f, 19f)
                curveTo(19.672f, 19f, 19f, 19.672f, 19f, 20.5f)
                curveTo(19f, 21.328f, 19.672f, 22f, 20.5f, 22f)
                close()
            }
        }.build()

        return _ClipboardMore!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardMore: ImageVector? = null

@Preview
@Composable
private fun ClipboardMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardMore, contentDescription = null)
    }
}
