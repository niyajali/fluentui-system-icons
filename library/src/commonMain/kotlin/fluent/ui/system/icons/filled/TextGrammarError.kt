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
 * TextGrammarError Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in text grammar check scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_grammar_error_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextGrammarError icon.
 */
public val FluentIcons.Filled.TextGrammarError: ImageVector
    get() {
        if (_textGrammarError != null) {
            return _textGrammarError!!
        }
        _textGrammarError = Builder(name = "TextGrammarError", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.5f, 18.0f, 6.164f, 18.0f, 5.75f)
                curveTo(18.0f, 5.336f, 17.664f, 5.0f, 17.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 8.0f)
                curveTo(2.336f, 8.0f, 2.0f, 8.336f, 2.0f, 8.75f)
                curveTo(2.0f, 9.164f, 2.336f, 9.5f, 2.75f, 9.5f)
                horizontalLineTo(12.205f)
                curveTo(12.904f, 9.179f, 13.681f, 9.0f, 14.5f, 9.0f)
                curveTo(15.319f, 9.0f, 16.096f, 9.179f, 16.795f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.5f, 18.0f, 9.164f, 18.0f, 8.75f)
                curveTo(18.0f, 8.336f, 17.664f, 8.0f, 17.25f, 8.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 11.0f)
                horizontalLineTo(10.257f)
                curveTo(9.889f, 11.446f, 9.589f, 11.952f, 9.375f, 12.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.5f, 2.0f, 12.164f, 2.0f, 11.75f)
                curveTo(2.0f, 11.336f, 2.336f, 11.0f, 2.75f, 11.0f)
                close()
                moveTo(2.75f, 14.0f)
                horizontalLineTo(9.022f)
                curveTo(9.008f, 14.165f, 9.0f, 14.332f, 9.0f, 14.5f)
                curveTo(9.0f, 14.842f, 9.031f, 15.176f, 9.091f, 15.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 15.5f, 2.0f, 15.164f, 2.0f, 14.75f)
                curveTo(2.0f, 14.336f, 2.336f, 14.0f, 2.75f, 14.0f)
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
        Image(imageVector = FluentIcons.Filled.TextGrammarError, contentDescription = "TextGrammarError Icon")
    }
}

