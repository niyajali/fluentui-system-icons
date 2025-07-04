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

public val FluentIcons.Regular.SelectObject: ImageVector
    get() {
        if (_SelectObject != null) {
            return _SelectObject!!
        }
        _SelectObject = ImageVector.Builder(
            name = "Regular.SelectObject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 5f)
                curveTo(7f, 6.105f, 6.105f, 7f, 5f, 7f)
                curveTo(3.895f, 7f, 3f, 6.105f, 3f, 5f)
                curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
                curveTo(6.105f, 3f, 7f, 3.895f, 7f, 5f)
                close()
                moveTo(8f, 4.75f)
                curveTo(8f, 5.164f, 8.336f, 5.5f, 8.75f, 5.5f)
                lineTo(15.25f, 5.5f)
                curveTo(15.664f, 5.5f, 16f, 5.164f, 16f, 4.75f)
                curveTo(16f, 4.336f, 15.664f, 4f, 15.25f, 4f)
                lineTo(8.75f, 4f)
                curveTo(8.336f, 4f, 8f, 4.336f, 8f, 4.75f)
                close()
                moveTo(4.75f, 8f)
                curveTo(4.336f, 8f, 4f, 8.336f, 4f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(4f, 15.664f, 4.336f, 16f, 4.75f, 16f)
                curveTo(5.164f, 16f, 5.5f, 15.664f, 5.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(5.5f, 8.336f, 5.164f, 8f, 4.75f, 8f)
                close()
                moveTo(19.25f, 8f)
                curveTo(18.836f, 8f, 18.5f, 8.336f, 18.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(18.5f, 15.664f, 18.836f, 16f, 19.25f, 16f)
                curveTo(19.664f, 16f, 20f, 15.664f, 20f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(20f, 8.336f, 19.664f, 8f, 19.25f, 8f)
                close()
                moveTo(8.75f, 20f)
                curveTo(8.336f, 20f, 8f, 19.664f, 8f, 19.25f)
                curveTo(8f, 18.836f, 8.336f, 18.5f, 8.75f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 18.5f, 16f, 18.836f, 16f, 19.25f)
                curveTo(16f, 19.664f, 15.664f, 20f, 15.25f, 20f)
                horizontalLineTo(8.75f)
                close()
                moveTo(5f, 21f)
                curveTo(6.105f, 21f, 7f, 20.105f, 7f, 19f)
                curveTo(7f, 17.895f, 6.105f, 17f, 5f, 17f)
                curveTo(3.895f, 17f, 3f, 17.895f, 3f, 19f)
                curveTo(3f, 20.105f, 3.895f, 21f, 5f, 21f)
                close()
                moveTo(21f, 5f)
                curveTo(21f, 6.105f, 20.105f, 7f, 19f, 7f)
                curveTo(17.895f, 7f, 17f, 6.105f, 17f, 5f)
                curveTo(17f, 3.895f, 17.895f, 3f, 19f, 3f)
                curveTo(20.105f, 3f, 21f, 3.895f, 21f, 5f)
                close()
                moveTo(19f, 21f)
                curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
                curveTo(21f, 17.895f, 20.105f, 17f, 19f, 17f)
                curveTo(17.895f, 17f, 17f, 17.895f, 17f, 19f)
                curveTo(17f, 20.105f, 17.895f, 21f, 19f, 21f)
                close()
            }
        }.build()

        return _SelectObject!!
    }

@Suppress("ObjectPropertyName")
private var _SelectObject: ImageVector? = null

@Preview
@Composable
private fun SelectObjectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SelectObject, contentDescription = null)
    }
}
