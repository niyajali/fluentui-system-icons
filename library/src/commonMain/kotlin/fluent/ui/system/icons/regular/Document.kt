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

public val FluentIcons.Regular.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Regular.Document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.586f, 2.586f)
                curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                close()
                moveTo(5.5f, 4f)
                curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 20.5f, 5.5f, 20.276f, 5.5f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(17.379f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                verticalLineTo(4.621f)
                lineTo(17.379f, 8.5f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null

@Preview
@Composable
private fun DocumentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Document, contentDescription = null)
    }
}
