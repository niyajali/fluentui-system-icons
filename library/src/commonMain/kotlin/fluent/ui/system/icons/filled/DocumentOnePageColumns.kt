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

public val FluentIcons.Filled.DocumentOnePageColumns: ImageVector
    get() {
        if (_DocumentOnePageColumns != null) {
            return _DocumentOnePageColumns!!
        }
        _DocumentOnePageColumns = ImageVector.Builder(
            name = "Filled.DocumentOnePageColumns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(8.75f, 5f)
                curveTo(8.336f, 5f, 8f, 5.336f, 8f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(8f, 18.664f, 8.336f, 19f, 8.75f, 19f)
                curveTo(9.164f, 19f, 9.5f, 18.664f, 9.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(9.5f, 5.336f, 9.164f, 5f, 8.75f, 5f)
                close()
                moveTo(16f, 5.75f)
                curveTo(16f, 5.336f, 15.664f, 5f, 15.25f, 5f)
                curveTo(14.836f, 5f, 14.5f, 5.336f, 14.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(14.5f, 18.664f, 14.836f, 19f, 15.25f, 19f)
                curveTo(15.664f, 19f, 16f, 18.664f, 16f, 18.25f)
                verticalLineTo(5.75f)
                close()
            }
        }.build()

        return _DocumentOnePageColumns!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentOnePageColumns: ImageVector? = null

@Preview
@Composable
private fun DocumentOnePageColumnsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentOnePageColumns, contentDescription = null)
    }
}
