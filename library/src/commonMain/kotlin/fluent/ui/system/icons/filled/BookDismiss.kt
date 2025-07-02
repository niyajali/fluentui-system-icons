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
 * BookDismiss icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: book, dismiss
 * - Source: ic_fluent_book_dismiss_20_filled.svg
 * 
 * @return The [ImageVector] for the BookDismiss icon.
 */
public val FluentIcons.Filled.BookDismiss: ImageVector
    get() {
        if (_bookDismiss != null) {
            return _bookDismiss!!
        }
        _bookDismiss = Builder(name = "BookDismiss", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 2.0f, 16.0f, 2.895f, 16.0f, 4.0f)
                verticalLineTo(9.207f)
                curveTo(15.523f, 9.072f, 15.02f, 9.0f, 14.5f, 9.0f)
                curveTo(11.462f, 9.0f, 9.0f, 11.462f, 9.0f, 14.5f)
                curveTo(9.0f, 15.02f, 9.072f, 15.523f, 9.207f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 16.552f, 5.448f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.783f, 17.358f, 10.003f, 17.693f, 10.257f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 18.0f, 4.0f, 17.105f, 4.0f, 16.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.75f, 4.0f)
                curveTo(6.336f, 4.0f, 6.0f, 4.336f, 6.0f, 4.75f)
                verticalLineTo(5.25f)
                curveTo(6.0f, 5.664f, 6.336f, 6.0f, 6.75f, 6.0f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 6.0f, 14.0f, 5.664f, 14.0f, 5.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 4.336f, 13.664f, 4.0f, 13.25f, 4.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.354f, 13.354f)
                curveTo(16.549f, 13.158f, 16.549f, 12.842f, 16.354f, 12.646f)
                curveTo(16.158f, 12.451f, 15.842f, 12.451f, 15.646f, 12.646f)
                lineTo(14.5f, 13.793f)
                lineTo(13.354f, 12.646f)
                curveTo(13.158f, 12.451f, 12.842f, 12.451f, 12.646f, 12.646f)
                curveTo(12.451f, 12.842f, 12.451f, 13.158f, 12.646f, 13.354f)
                lineTo(13.793f, 14.5f)
                lineTo(12.646f, 15.646f)
                curveTo(12.451f, 15.842f, 12.451f, 16.158f, 12.646f, 16.354f)
                curveTo(12.842f, 16.549f, 13.158f, 16.549f, 13.354f, 16.354f)
                lineTo(14.5f, 15.207f)
                lineTo(15.646f, 16.354f)
                curveTo(15.842f, 16.549f, 16.158f, 16.549f, 16.354f, 16.354f)
                curveTo(16.549f, 16.158f, 16.549f, 15.842f, 16.354f, 15.646f)
                lineTo(15.207f, 14.5f)
                lineTo(16.354f, 13.354f)
                close()
            }
        }
        .build()
        return _bookDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _bookDismiss: ImageVector? = null

@Preview
@Composable
private fun BookDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookDismiss, contentDescription = null)
    }
}

