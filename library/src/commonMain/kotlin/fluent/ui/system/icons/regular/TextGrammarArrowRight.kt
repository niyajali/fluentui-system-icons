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
 * TextGrammarArrowRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, grammar, arrow, right
 * - Source: ic_fluent_text_grammar_arrow_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TextGrammarArrowRight icon.
 */
public val FluentIcons.Regular.TextGrammarArrowRight: ImageVector
    get() {
        if (_textGrammarArrowRight != null) {
            return _textGrammarArrowRight!!
        }
        _textGrammarArrowRight = Builder(name = "TextGrammarArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.0f, 22.0f, 5.336f, 22.0f, 5.75f)
                curveTo(22.0f, 6.13f, 21.718f, 6.443f, 21.352f, 6.493f)
                lineTo(21.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2.0f, 6.164f, 2.0f, 5.75f)
                curveTo(2.0f, 5.37f, 2.282f, 5.057f, 2.648f, 5.007f)
                lineTo(2.75f, 5.0f)
                close()
                moveTo(21.25f, 9.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 9.007f)
                curveTo(2.282f, 9.057f, 2.0f, 9.37f, 2.0f, 9.75f)
                curveTo(2.0f, 10.164f, 2.336f, 10.5f, 2.75f, 10.5f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 10.493f)
                curveTo(21.718f, 10.443f, 22.0f, 10.13f, 22.0f, 9.75f)
                curveTo(22.0f, 9.336f, 21.664f, 9.0f, 21.25f, 9.0f)
                close()
                moveTo(2.75f, 14.5f)
                horizontalLineTo(11.732f)
                curveTo(12.019f, 13.949f, 12.383f, 13.444f, 12.81f, 13.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 13.007f)
                curveTo(2.282f, 13.057f, 2.0f, 13.37f, 2.0f, 13.75f)
                curveTo(2.0f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                close()
                moveTo(2.75f, 17.0f)
                horizontalLineTo(11.019f)
                curveTo(11.006f, 17.165f, 11.0f, 17.332f, 11.0f, 17.5f)
                curveTo(11.0f, 17.84f, 11.026f, 18.174f, 11.076f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18.5f, 2.0f, 18.164f, 2.0f, 17.75f)
                curveTo(2.0f, 17.37f, 2.282f, 17.056f, 2.648f, 17.007f)
                lineTo(2.75f, 17.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                close()
                moveTo(18.35f, 20.354f)
                lineTo(18.281f, 20.411f)
                curveTo(18.086f, 20.546f, 17.816f, 20.527f, 17.643f, 20.354f)
                lineTo(17.585f, 20.284f)
                curveTo(17.45f, 20.089f, 17.469f, 19.82f, 17.643f, 19.646f)
                lineTo(19.289f, 18.0f)
                lineTo(14.5f, 18.0f)
                lineTo(14.41f, 17.992f)
                curveTo(14.177f, 17.95f, 14.0f, 17.746f, 14.0f, 17.5f)
                lineTo(14.008f, 17.41f)
                curveTo(14.05f, 17.177f, 14.255f, 17.0f, 14.5f, 17.0f)
                lineTo(19.289f, 17.0f)
                lineTo(17.643f, 15.354f)
                lineTo(17.585f, 15.284f)
                curveTo(17.45f, 15.089f, 17.469f, 14.82f, 17.643f, 14.646f)
                curveTo(17.838f, 14.451f, 18.155f, 14.451f, 18.35f, 14.646f)
                lineTo(20.866f, 17.163f)
                lineTo(20.917f, 17.229f)
                lineTo(20.951f, 17.29f)
                lineTo(20.979f, 17.37f)
                lineTo(20.994f, 17.456f)
                lineTo(20.992f, 17.566f)
                lineTo(20.973f, 17.651f)
                lineTo(20.95f, 17.71f)
                lineTo(20.906f, 17.787f)
                lineTo(20.866f, 17.837f)
                lineTo(18.35f, 20.354f)
                close()
            }
        }
        .build()
        return _textGrammarArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarArrowRight: ImageVector? = null

@Preview
@Composable
private fun TextGrammarArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarArrowRight, contentDescription = null)
    }
}

