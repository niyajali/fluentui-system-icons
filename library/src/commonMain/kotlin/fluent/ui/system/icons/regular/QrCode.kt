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

public val FluentIcons.Regular.QrCode: ImageVector
    get() {
        if (_QrCode != null) {
            return _QrCode!!
        }
        _QrCode = ImageVector.Builder(
            name = "Regular.QrCode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                close()
                moveTo(3f, 5.25f)
                curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
                horizontalLineTo(8.75f)
                curveTo(9.993f, 3f, 11f, 4.007f, 11f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(11f, 9.993f, 9.993f, 11f, 8.75f, 11f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 11f, 3f, 9.993f, 3f, 8.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.25f, 4.5f)
                curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(4.5f, 9.164f, 4.836f, 9.5f, 5.25f, 9.5f)
                horizontalLineTo(8.75f)
                curveTo(9.164f, 9.5f, 9.5f, 9.164f, 9.5f, 8.75f)
                verticalLineTo(5.25f)
                curveTo(9.5f, 4.836f, 9.164f, 4.5f, 8.75f, 4.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                close()
                moveTo(3f, 15.25f)
                curveTo(3f, 14.007f, 4.007f, 13f, 5.25f, 13f)
                horizontalLineTo(8.75f)
                curveTo(9.993f, 13f, 11f, 14.007f, 11f, 15.25f)
                verticalLineTo(18.75f)
                curveTo(11f, 19.993f, 9.993f, 21f, 8.75f, 21f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(5.25f, 14.5f)
                curveTo(4.836f, 14.5f, 4.5f, 14.836f, 4.5f, 15.25f)
                verticalLineTo(18.75f)
                curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(9.164f, 19.5f, 9.5f, 19.164f, 9.5f, 18.75f)
                verticalLineTo(15.25f)
                curveTo(9.5f, 14.836f, 9.164f, 14.5f, 8.75f, 14.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(18f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
                moveTo(15.25f, 3f)
                curveTo(14.007f, 3f, 13f, 4.007f, 13f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(13f, 9.993f, 14.007f, 11f, 15.25f, 11f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
                verticalLineTo(5.25f)
                curveTo(21f, 4.007f, 19.993f, 3f, 18.75f, 3f)
                horizontalLineTo(15.25f)
                close()
                moveTo(14.5f, 5.25f)
                curveTo(14.5f, 4.836f, 14.836f, 4.5f, 15.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 4.5f, 19.5f, 4.836f, 19.5f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(19.5f, 9.164f, 19.164f, 9.5f, 18.75f, 9.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 9.5f, 14.5f, 9.164f, 14.5f, 8.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(13f, 13f)
                horizontalLineTo(15.75f)
                verticalLineTo(15.75f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                close()
                moveTo(18.25f, 15.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(18.25f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15.75f)
                verticalLineTo(18.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(18.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(18.25f, 15.75f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(15.75f)
                horizontalLineTo(18.25f)
                close()
            }
        }.build()

        return _QrCode!!
    }

@Suppress("ObjectPropertyName")
private var _QrCode: ImageVector? = null

@Preview
@Composable
private fun QrCodePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.QrCode, contentDescription = null)
    }
}
