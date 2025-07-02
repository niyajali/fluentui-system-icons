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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextParagraph icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, paragraph
 * - Source: ic_fluent_text_paragraph_24_regular.svg
 * 
 * @return The [ImageVector] for the TextParagraph icon.
 */
public val FluentIcons.Regular.TextParagraph: ImageVector
    get() {
        if (_textParagraph != null) {
            return _textParagraph!!
        }
        _textParagraph = Builder(name = "TextParagraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveTo(14.153f, 8.0f, 12.25f, 9.903f, 12.25f, 12.25f)
                curveTo(12.25f, 14.597f, 14.153f, 16.5f, 16.5f, 16.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.25f)
                curveTo(17.0f, 21.664f, 17.336f, 22.0f, 17.75f, 22.0f)
                curveTo(18.164f, 22.0f, 18.5f, 21.664f, 18.5f, 21.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.25f)
                curveTo(19.5f, 21.664f, 19.836f, 22.0f, 20.25f, 22.0f)
                curveTo(20.664f, 22.0f, 21.0f, 21.664f, 21.0f, 21.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 9.5f, 22.0f, 9.164f, 22.0f, 8.75f)
                curveTo(22.0f, 8.336f, 21.664f, 8.0f, 21.25f, 8.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(16.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(14.981f, 15.0f, 13.75f, 13.769f, 13.75f, 12.25f)
                curveTo(13.75f, 10.731f, 14.981f, 9.5f, 16.5f, 9.5f)
                close()
                moveTo(2.75f, 5.0f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22.0f, 6.164f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 10.0f)
                curveTo(2.336f, 10.0f, 2.0f, 10.336f, 2.0f, 10.75f)
                curveTo(2.0f, 11.164f, 2.336f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(11.303f)
                curveTo(11.379f, 10.97f, 11.534f, 10.466f, 11.755f, 10.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.027f, 15.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 15.0f, 2.0f, 15.336f, 2.0f, 15.75f)
                curveTo(2.0f, 16.164f, 2.336f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(13.417f)
                curveTo(12.862f, 16.096f, 12.388f, 15.586f, 12.027f, 15.0f)
                close()
            }
        }
        .build()
        return _textParagraph!!
    }

@Suppress("ObjectPropertyName")
private var _textParagraph: ImageVector? = null

@Preview
@Composable
private fun TextParagraphPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextParagraph, contentDescription = null)
    }
}

