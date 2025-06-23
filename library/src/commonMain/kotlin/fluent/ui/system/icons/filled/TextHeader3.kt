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

public val FluentIcons.Filled.TextHeader3: ImageVector
    get() {
        if (_TextHeader3 != null) {
            return _TextHeader3!!
        }
        _TextHeader3 = ImageVector.Builder(
            name = "Filled.TextHeader3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.499f, 4.5f)
                curveTo(19.913f, 4.5f, 21.999f, 6.334f, 21.999f, 8.75f)
                curveTo(21.999f, 10.08f, 21.366f, 11.232f, 20.396f, 12f)
                curveTo(21.366f, 12.768f, 21.999f, 13.92f, 21.999f, 15.25f)
                curveTo(21.999f, 17.666f, 19.913f, 19.5f, 17.499f, 19.5f)
                curveTo(15.751f, 19.5f, 13.815f, 18.528f, 13.088f, 16.91f)
                curveTo(12.862f, 16.406f, 13.086f, 15.814f, 13.59f, 15.588f)
                curveTo(14.094f, 15.362f, 14.686f, 15.586f, 14.912f, 16.09f)
                curveTo(15.24f, 16.82f, 16.335f, 17.5f, 17.499f, 17.5f)
                curveTo(18.951f, 17.5f, 19.999f, 16.424f, 19.999f, 15.25f)
                curveTo(19.999f, 14.076f, 18.951f, 13f, 17.499f, 13f)
                horizontalLineTo(16.999f)
                curveTo(16.447f, 13f, 15.999f, 12.552f, 15.999f, 12f)
                curveTo(15.999f, 11.448f, 16.447f, 11f, 16.999f, 11f)
                horizontalLineTo(17.499f)
                curveTo(18.951f, 11f, 19.999f, 9.924f, 19.999f, 8.75f)
                curveTo(19.999f, 7.576f, 18.951f, 6.5f, 17.499f, 6.5f)
                curveTo(16.335f, 6.5f, 15.24f, 7.179f, 14.912f, 7.91f)
                curveTo(14.686f, 8.414f, 14.094f, 8.638f, 13.59f, 8.412f)
                curveTo(13.086f, 8.186f, 12.862f, 7.594f, 13.088f, 7.09f)
                curveTo(13.815f, 5.472f, 15.751f, 4.5f, 17.499f, 4.5f)
                close()
                moveTo(11f, 5f)
                curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
                verticalLineTo(18f)
                curveTo(12f, 18.552f, 11.552f, 19f, 11f, 19f)
                curveTo(10.448f, 19f, 10f, 18.552f, 10f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 18.552f, 3.552f, 19f, 3f, 19f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                curveTo(3.552f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                curveTo(10f, 5.448f, 10.448f, 5f, 11f, 5f)
                close()
            }
        }.build()

        return _TextHeader3!!
    }

@Suppress("ObjectPropertyName")
private var _TextHeader3: ImageVector? = null

@Preview
@Composable
private fun TextHeader3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader3, contentDescription = null)
    }
}
