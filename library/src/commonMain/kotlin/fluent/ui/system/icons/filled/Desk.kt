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

public val FluentIcons.Filled.Desk: ImageVector
    get() {
        if (_Desk != null) {
            return _Desk!!
        }
        _Desk = ImageVector.Builder(
            name = "Filled.Desk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.25f, 4f)
                curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(20.5f)
                verticalLineTo(19.25f)
                curveTo(20.5f, 19.664f, 20.836f, 20f, 21.25f, 20f)
                curveTo(21.664f, 20f, 22f, 19.664f, 22f, 19.25f)
                verticalLineTo(6.25f)
                curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
                horizontalLineTo(4.25f)
                close()
                moveTo(12f, 9.5f)
                horizontalLineTo(2f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(9.25f)
                curveTo(10.769f, 20f, 12f, 18.769f, 12f, 17.25f)
                verticalLineTo(9.5f)
                close()
                moveTo(5f, 12.75f)
                curveTo(5f, 12.336f, 5.336f, 12f, 5.75f, 12f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 12f, 9f, 12.336f, 9f, 12.75f)
                curveTo(9f, 13.164f, 8.664f, 13.5f, 8.25f, 13.5f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 13.5f, 5f, 13.164f, 5f, 12.75f)
                close()
            }
        }.build()

        return _Desk!!
    }

@Suppress("ObjectPropertyName")
private var _Desk: ImageVector? = null

@Preview
@Composable
private fun DeskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Desk, contentDescription = null)
    }
}
