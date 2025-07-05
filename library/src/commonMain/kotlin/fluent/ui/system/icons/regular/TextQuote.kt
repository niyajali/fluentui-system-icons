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
 * TextQuote Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_quote_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextQuote icon.
 */
public val FluentIcons.Regular.TextQuote: ImageVector
    get() {
        if (_textQuote != null) {
            return _textQuote!!
        }
        _textQuote = Builder(name = "TextQuote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 6.0f)
                curveTo(8.825f, 6.0f, 9.91f, 7.032f, 9.995f, 8.336f)
                lineTo(10.0f, 8.542f)
                curveTo(9.99f, 12.097f, 8.759f, 15.156f, 6.295f, 17.765f)
                curveTo(6.011f, 18.066f, 5.536f, 18.08f, 5.235f, 17.795f)
                curveTo(4.934f, 17.511f, 4.92f, 17.036f, 5.205f, 16.735f)
                curveTo(6.845f, 14.998f, 7.865f, 13.061f, 8.282f, 10.876f)
                curveTo(8.035f, 10.956f, 7.773f, 11.0f, 7.5f, 11.0f)
                curveTo(6.119f, 11.0f, 5.0f, 9.881f, 5.0f, 8.5f)
                curveTo(5.0f, 7.119f, 6.119f, 6.0f, 7.5f, 6.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveTo(17.826f, 6.0f, 18.91f, 7.032f, 18.995f, 8.336f)
                lineTo(19.0f, 8.542f)
                curveTo(18.99f, 12.103f, 17.763f, 15.156f, 15.295f, 17.765f)
                curveTo(15.01f, 18.066f, 14.536f, 18.08f, 14.235f, 17.795f)
                curveTo(13.934f, 17.51f, 13.92f, 17.036f, 14.205f, 16.735f)
                curveTo(15.848f, 14.997f, 16.867f, 13.063f, 17.283f, 10.876f)
                curveTo(17.035f, 10.956f, 16.773f, 11.0f, 16.5f, 11.0f)
                curveTo(15.119f, 11.0f, 14.0f, 9.881f, 14.0f, 8.5f)
                curveTo(14.0f, 7.119f, 15.119f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(7.5f, 7.5f)
                curveTo(6.948f, 7.5f, 6.5f, 7.948f, 6.5f, 8.5f)
                curveTo(6.5f, 9.052f, 6.948f, 9.5f, 7.5f, 9.5f)
                curveTo(8.013f, 9.5f, 8.436f, 9.114f, 8.493f, 8.617f)
                lineTo(8.5f, 8.493f)
                curveTo(8.496f, 7.943f, 8.05f, 7.5f, 7.5f, 7.5f)
                close()
                moveTo(16.5f, 7.5f)
                curveTo(15.948f, 7.5f, 15.5f, 7.948f, 15.5f, 8.5f)
                curveTo(15.5f, 9.052f, 15.948f, 9.5f, 16.5f, 9.5f)
                curveTo(17.013f, 9.5f, 17.435f, 9.114f, 17.493f, 8.617f)
                lineTo(17.5f, 8.493f)
                curveTo(17.496f, 7.943f, 17.05f, 7.5f, 16.5f, 7.5f)
                close()
            }
        }
        .build()
        return _textQuote!!
    }

@Suppress("ObjectPropertyName")
private var _textQuote: ImageVector? = null

@Preview
@Composable
private fun TextQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextQuote, contentDescription = "TextQuote Icon")
    }
}

