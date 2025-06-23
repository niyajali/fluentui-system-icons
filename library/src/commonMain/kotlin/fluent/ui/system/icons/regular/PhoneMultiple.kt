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

public val FluentIcons.Regular.PhoneMultiple: ImageVector
    get() {
        if (_PhoneMultiple != null) {
            return _PhoneMultiple!!
        }
        _PhoneMultiple = ImageVector.Builder(
            name = "Regular.PhoneMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 15.5f)
                curveTo(9.336f, 15.5f, 9f, 15.836f, 9f, 16.25f)
                curveTo(9f, 16.664f, 9.336f, 17f, 9.75f, 17f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 17f, 13f, 16.664f, 13f, 16.25f)
                curveTo(13f, 15.836f, 12.664f, 15.5f, 12.25f, 15.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.25f, 2f)
                curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(6f, 18.493f, 7.007f, 19.5f, 8.25f, 19.5f)
                horizontalLineTo(13.75f)
                curveTo(14.993f, 19.5f, 16f, 18.493f, 16f, 17.25f)
                verticalLineTo(4.25f)
                curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
                horizontalLineTo(8.25f)
                close()
                moveTo(7.5f, 4.25f)
                curveTo(7.5f, 3.836f, 7.836f, 3.5f, 8.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(14.5f, 17.664f, 14.164f, 18f, 13.75f, 18f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 18f, 7.5f, 17.664f, 7.5f, 17.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(10.75f, 22f)
                curveTo(9.77f, 22f, 8.937f, 21.374f, 8.628f, 20.5f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 20.5f, 17f, 19.269f, 17f, 17.75f)
                verticalLineTo(4.628f)
                curveTo(17.874f, 4.937f, 18.5f, 5.77f, 18.5f, 6.75f)
                verticalLineTo(17.75f)
                curveTo(18.5f, 20.097f, 16.597f, 22f, 14.25f, 22f)
                horizontalLineTo(10.75f)
                close()
            }
        }.build()

        return _PhoneMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMultiple: ImageVector? = null

@Preview
@Composable
private fun PhoneMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneMultiple, contentDescription = null)
    }
}
