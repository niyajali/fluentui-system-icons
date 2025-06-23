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

public val FluentIcons.Filled.BookSearch: ImageVector
    get() {
        if (_BookSearch != null) {
            return _BookSearch!!
        }
        _BookSearch = ImageVector.Builder(
            name = "Filled.BookSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.724f, 7.447f)
                curveTo(10.467f, 7.447f, 9.447f, 8.467f, 9.447f, 9.724f)
                curveTo(9.447f, 10.981f, 10.467f, 12f, 11.724f, 12f)
                curveTo(12.981f, 12f, 14f, 10.981f, 14f, 9.724f)
                curveTo(14f, 8.467f, 12.981f, 7.447f, 11.724f, 7.447f)
                close()
                moveTo(4f, 4.5f)
                curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
                horizontalLineTo(18f)
                curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
                curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(14.818f, 11.795f)
                curveTo(15.216f, 11.203f, 15.447f, 10.49f, 15.447f, 9.724f)
                curveTo(15.447f, 7.667f, 13.78f, 6f, 11.724f, 6f)
                curveTo(9.667f, 6f, 8f, 7.667f, 8f, 9.724f)
                curveTo(8f, 11.78f, 9.667f, 13.447f, 11.724f, 13.447f)
                curveTo(12.49f, 13.447f, 13.203f, 13.216f, 13.795f, 12.818f)
                lineTo(16.271f, 15.295f)
                lineTo(16.338f, 15.352f)
                lineTo(16.346f, 15.358f)
                curveTo(16.629f, 15.568f, 17.031f, 15.545f, 17.288f, 15.288f)
                curveTo(17.571f, 15.005f, 17.571f, 14.547f, 17.288f, 14.265f)
                lineTo(14.818f, 11.795f)
                close()
            }
        }.build()

        return _BookSearch!!
    }

@Suppress("ObjectPropertyName")
private var _BookSearch: ImageVector? = null

@Preview
@Composable
private fun BookSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookSearch, contentDescription = null)
    }
}
