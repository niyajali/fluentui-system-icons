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
 * TextGrammarArrowLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, grammar, arrow, left
 * - Source: ic_fluent_text_grammar_arrow_left_24_regular.svg
 * 
 * @return The [ImageVector] for the TextGrammarArrowLeft icon.
 */
public val FluentIcons.Regular.TextGrammarArrowLeft: ImageVector
    get() {
        if (_textGrammarArrowLeft != null) {
            return _textGrammarArrowLeft!!
        }
        _textGrammarArrowLeft = Builder(name = "TextGrammarArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(16.719f, 14.589f)
                lineTo(16.65f, 14.646f)
                lineTo(14.134f, 17.163f)
                lineTo(14.094f, 17.213f)
                lineTo(14.05f, 17.29f)
                lineTo(14.027f, 17.349f)
                lineTo(14.008f, 17.434f)
                lineTo(14.005f, 17.544f)
                lineTo(14.021f, 17.63f)
                lineTo(14.05f, 17.71f)
                lineTo(14.083f, 17.771f)
                lineTo(14.134f, 17.837f)
                lineTo(16.65f, 20.354f)
                curveTo(16.845f, 20.549f, 17.162f, 20.549f, 17.357f, 20.354f)
                curveTo(17.531f, 20.18f, 17.55f, 19.911f, 17.415f, 19.716f)
                lineTo(17.357f, 19.646f)
                lineTo(15.711f, 18.0f)
                horizontalLineTo(20.5f)
                curveTo(20.746f, 18.0f, 20.95f, 17.823f, 20.992f, 17.59f)
                lineTo(21.0f, 17.5f)
                curveTo(21.0f, 17.254f, 20.823f, 17.05f, 20.59f, 17.008f)
                lineTo(20.5f, 17.0f)
                horizontalLineTo(15.711f)
                lineTo(17.357f, 15.354f)
                curveTo(17.531f, 15.18f, 17.55f, 14.911f, 17.415f, 14.716f)
                lineTo(17.357f, 14.646f)
                curveTo(17.184f, 14.473f, 16.914f, 14.454f, 16.719f, 14.589f)
                close()
                moveTo(11.019f, 17.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 17.007f)
                curveTo(2.282f, 17.056f, 2.0f, 17.37f, 2.0f, 17.75f)
                curveTo(2.0f, 18.164f, 2.336f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(11.076f)
                curveTo(11.026f, 18.174f, 11.0f, 17.84f, 11.0f, 17.5f)
                curveTo(11.0f, 17.332f, 11.006f, 17.165f, 11.019f, 17.0f)
                close()
                moveTo(11.732f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.5f, 2.0f, 14.164f, 2.0f, 13.75f)
                curveTo(2.0f, 13.37f, 2.282f, 13.057f, 2.648f, 13.007f)
                lineTo(2.75f, 13.0f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 13.444f, 12.019f, 13.949f, 11.732f, 14.5f)
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
                moveTo(21.25f, 5.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 5.007f)
                curveTo(2.282f, 5.057f, 2.0f, 5.37f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 6.493f)
                curveTo(21.718f, 6.443f, 22.0f, 6.13f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                close()
            }
        }
        .build()
        return _textGrammarArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarArrowLeft: ImageVector? = null

@Preview
@Composable
private fun TextGrammarArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarArrowLeft, contentDescription = null)
    }
}

