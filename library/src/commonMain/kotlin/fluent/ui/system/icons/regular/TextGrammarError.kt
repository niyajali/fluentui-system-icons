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
 * TextGrammarError icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: text, grammar, error
 * - Source: ic_fluent_text_grammar_error_20_regular.svg
 * 
 * @return The [ImageVector] for the TextGrammarError icon.
 */
public val FluentIcons.Regular.TextGrammarError: ImageVector
    get() {
        if (_textGrammarError != null) {
            return _textGrammarError!!
        }
        _textGrammarError = Builder(name = "TextGrammarError", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 5.0f)
                curveTo(2.224f, 5.0f, 2.0f, 5.224f, 2.0f, 5.5f)
                curveTo(2.0f, 5.776f, 2.224f, 6.0f, 2.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 6.0f, 18.0f, 5.776f, 18.0f, 5.5f)
                curveTo(18.0f, 5.224f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(2.5f, 8.0f)
                curveTo(2.224f, 8.0f, 2.0f, 8.224f, 2.0f, 8.5f)
                curveTo(2.0f, 8.776f, 2.224f, 9.0f, 2.5f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 9.0f, 18.0f, 8.776f, 18.0f, 8.5f)
                curveTo(18.0f, 8.224f, 17.776f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(9.0f, 14.5f)
                curveTo(9.0f, 14.332f, 9.008f, 14.165f, 9.022f, 14.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 14.0f, 2.0f, 14.224f, 2.0f, 14.5f)
                curveTo(2.0f, 14.776f, 2.224f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(9.022f)
                curveTo(9.008f, 14.835f, 9.0f, 14.668f, 9.0f, 14.5f)
                close()
                moveTo(9.6f, 12.0f)
                curveTo(9.783f, 11.642f, 10.003f, 11.307f, 10.257f, 11.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 11.0f, 2.0f, 11.224f, 2.0f, 11.5f)
                curveTo(2.0f, 11.776f, 2.224f, 12.0f, 2.5f, 12.0f)
                horizontalLineTo(9.6f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(14.5f, 12.0f)
                curveTo(14.224f, 12.0f, 14.0f, 12.224f, 14.0f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(14.0f, 14.776f, 14.224f, 15.0f, 14.5f, 15.0f)
                curveTo(14.776f, 15.0f, 15.0f, 14.776f, 15.0f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.224f, 14.776f, 12.0f, 14.5f, 12.0f)
                close()
                moveTo(14.5f, 17.125f)
                curveTo(14.845f, 17.125f, 15.125f, 16.845f, 15.125f, 16.5f)
                curveTo(15.125f, 16.155f, 14.845f, 15.875f, 14.5f, 15.875f)
                curveTo(14.155f, 15.875f, 13.875f, 16.155f, 13.875f, 16.5f)
                curveTo(13.875f, 16.845f, 14.155f, 17.125f, 14.5f, 17.125f)
                close()
            }
        }
        .build()
        return _textGrammarError!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarError: ImageVector? = null

@Preview
@Composable
private fun TextGrammarErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarError, contentDescription = null)
    }
}

