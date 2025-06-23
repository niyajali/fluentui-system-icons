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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Phone: ImageVector
    get() {
        if (_Phone != null) {
            return _Phone!!
        }
        _Phone = ImageVector.Builder(
            name = "Light.Phone",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.5f, 24f)
                curveTo(13.224f, 24f, 13f, 24.224f, 13f, 24.5f)
                curveTo(13f, 24.776f, 13.224f, 25f, 13.5f, 25f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 25f, 19f, 24.776f, 19f, 24.5f)
                curveTo(19f, 24.224f, 18.776f, 24f, 18.5f, 24f)
                horizontalLineTo(13.5f)
                close()
                moveTo(10.25f, 2f)
                curveTo(8.455f, 2f, 7f, 3.455f, 7f, 5.25f)
                verticalLineTo(26.75f)
                curveTo(7f, 28.545f, 8.455f, 30f, 10.25f, 30f)
                horizontalLineTo(21.75f)
                curveTo(23.545f, 30f, 25f, 28.545f, 25f, 26.75f)
                verticalLineTo(5.25f)
                curveTo(25f, 3.455f, 23.545f, 2f, 21.75f, 2f)
                horizontalLineTo(10.25f)
                close()
                moveTo(8f, 5.25f)
                curveTo(8f, 4.007f, 9.007f, 3f, 10.25f, 3f)
                horizontalLineTo(21.75f)
                curveTo(22.993f, 3f, 24f, 4.007f, 24f, 5.25f)
                verticalLineTo(26.75f)
                curveTo(24f, 27.993f, 22.993f, 29f, 21.75f, 29f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 29f, 8f, 27.993f, 8f, 26.75f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _Phone!!
    }

@Suppress("ObjectPropertyName")
private var _Phone: ImageVector? = null

@Preview
@Composable
private fun PhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Phone, contentDescription = null)
    }
}
