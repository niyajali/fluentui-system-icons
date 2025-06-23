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

public val FluentIcons.Regular.PhoneStatusBar: ImageVector
    get() {
        if (_PhoneStatusBar != null) {
            return _PhoneStatusBar!!
        }
        _PhoneStatusBar = ImageVector.Builder(
            name = "Regular.PhoneStatusBar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.75f, 2f)
                curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
                horizontalLineTo(15.75f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.836f, 16.164f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(14.75f, 4.5f)
                curveTo(15.164f, 4.5f, 15.5f, 4.836f, 15.5f, 5.25f)
                curveTo(15.5f, 5.664f, 15.164f, 6f, 14.75f, 6f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 6f, 8.5f, 5.664f, 8.5f, 5.25f)
                curveTo(8.5f, 4.836f, 8.836f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(14.75f)
                close()
            }
        }.build()

        return _PhoneStatusBar!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneStatusBar: ImageVector? = null

@Preview
@Composable
private fun PhoneStatusBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneStatusBar, contentDescription = null)
    }
}
