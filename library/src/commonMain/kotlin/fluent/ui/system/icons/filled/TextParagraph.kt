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

public val FluentIcons.Filled.TextParagraph: ImageVector
    get() {
        if (_TextParagraph != null) {
            return _TextParagraph!!
        }
        _TextParagraph = ImageVector.Builder(
            name = "Filled.TextParagraph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.25f, 12.25f)
                curveTo(12.25f, 9.903f, 14.153f, 8f, 16.5f, 8f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 8f, 22f, 8.336f, 22f, 8.75f)
                curveTo(22f, 9.164f, 21.664f, 9.5f, 21.25f, 9.5f)
                horizontalLineTo(21f)
                verticalLineTo(21.25f)
                curveTo(21f, 21.664f, 20.664f, 22f, 20.25f, 22f)
                curveTo(19.836f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(21.25f)
                curveTo(18.5f, 21.664f, 18.164f, 22f, 17.75f, 22f)
                curveTo(17.336f, 22f, 17f, 21.664f, 17f, 21.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.5f)
                curveTo(14.153f, 16.5f, 12.25f, 14.597f, 12.25f, 12.25f)
                close()
                moveTo(2f, 5.75f)
                curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
                curveTo(22f, 6.164f, 21.664f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
                close()
                moveTo(2f, 10.75f)
                curveTo(2f, 10.336f, 2.336f, 10f, 2.75f, 10f)
                horizontalLineTo(11.755f)
                curveTo(11.534f, 10.466f, 11.379f, 10.97f, 11.303f, 11.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11.5f, 2f, 11.164f, 2f, 10.75f)
                close()
                moveTo(2.75f, 15f)
                horizontalLineTo(12.027f)
                curveTo(12.388f, 15.586f, 12.862f, 16.096f, 13.417f, 16.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.5f, 2f, 16.164f, 2f, 15.75f)
                curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
                close()
            }
        }.build()

        return _TextParagraph!!
    }

@Suppress("ObjectPropertyName")
private var _TextParagraph: ImageVector? = null

@Preview
@Composable
private fun TextParagraphPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextParagraph, contentDescription = null)
    }
}
