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

public val FluentIcons.Filled.PhonePageHeader: ImageVector
    get() {
        if (_PhonePageHeader != null) {
            return _PhonePageHeader!!
        }
        _PhonePageHeader = ImageVector.Builder(
            name = "Filled.PhonePageHeader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 6.005f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
                verticalLineTo(6.005f)
                horizontalLineTo(18f)
                close()
                moveTo(15.75f, 2f)
                curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
                horizontalLineTo(15.75f)
                close()
            }
        }.build()

        return _PhonePageHeader!!
    }

@Suppress("ObjectPropertyName")
private var _PhonePageHeader: ImageVector? = null

@Preview
@Composable
private fun PhonePageHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhonePageHeader, contentDescription = null)
    }
}
