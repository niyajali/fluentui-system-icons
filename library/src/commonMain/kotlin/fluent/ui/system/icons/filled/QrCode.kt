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

public val FluentIcons.Filled.QrCode: ImageVector
    get() {
        if (_QrCode != null) {
            return _QrCode!!
        }
        _QrCode = ImageVector.Builder(
            name = "Filled.QrCode",
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
                moveTo(3f, 5.5f)
                curveTo(3f, 4.119f, 4.119f, 3f, 5.5f, 3f)
                horizontalLineTo(8.5f)
                curveTo(9.881f, 3f, 11f, 4.119f, 11f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(11f, 9.881f, 9.881f, 11f, 8.5f, 11f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 11f, 3f, 9.881f, 3f, 8.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(5.5f, 5f)
                curveTo(5.224f, 5f, 5f, 5.224f, 5f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(5f, 8.776f, 5.224f, 9f, 5.5f, 9f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 9f, 9f, 8.776f, 9f, 8.5f)
                verticalLineTo(5.5f)
                curveTo(9f, 5.224f, 8.776f, 5f, 8.5f, 5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(6f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                close()
                moveTo(3f, 15.5f)
                curveTo(3f, 14.119f, 4.119f, 13f, 5.5f, 13f)
                horizontalLineTo(8.5f)
                curveTo(9.881f, 13f, 11f, 14.119f, 11f, 15.5f)
                verticalLineTo(18.5f)
                curveTo(11f, 19.881f, 9.881f, 21f, 8.5f, 21f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 21f, 3f, 19.881f, 3f, 18.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(5.5f, 15f)
                curveTo(5.224f, 15f, 5f, 15.224f, 5f, 15.5f)
                verticalLineTo(18.5f)
                curveTo(5f, 18.776f, 5.224f, 19f, 5.5f, 19f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 19f, 9f, 18.776f, 9f, 18.5f)
                verticalLineTo(15.5f)
                curveTo(9f, 15.224f, 8.776f, 15f, 8.5f, 15f)
                horizontalLineTo(5.5f)
                close()
                moveTo(18f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
                moveTo(15.5f, 3f)
                curveTo(14.119f, 3f, 13f, 4.119f, 13f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(13f, 9.881f, 14.119f, 11f, 15.5f, 11f)
                horizontalLineTo(18.5f)
                curveTo(19.881f, 11f, 21f, 9.881f, 21f, 8.5f)
                verticalLineTo(5.5f)
                curveTo(21f, 4.119f, 19.881f, 3f, 18.5f, 3f)
                horizontalLineTo(15.5f)
                close()
                moveTo(15f, 5.5f)
                curveTo(15f, 5.224f, 15.224f, 5f, 15.5f, 5f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 5f, 19f, 5.224f, 19f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(19f, 8.776f, 18.776f, 9f, 18.5f, 9f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 9f, 15f, 8.776f, 15f, 8.5f)
                verticalLineTo(5.5f)
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
        Image(imageVector = FluentIcons.Filled.QrCode, contentDescription = null)
    }
}
