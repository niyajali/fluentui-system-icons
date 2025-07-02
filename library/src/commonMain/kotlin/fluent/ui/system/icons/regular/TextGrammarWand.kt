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
 * TextGrammarWand icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, grammar, wand
 * - Source: ic_fluent_text_grammar_wand_24_regular.svg
 * 
 * @return The [ImageVector] for the TextGrammarWand icon.
 */
public val FluentIcons.Regular.TextGrammarWand: ImageVector
    get() {
        if (_textGrammarWand != null) {
            return _textGrammarWand!!
        }
        _textGrammarWand = Builder(name = "TextGrammarWand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 17.0f)
                horizontalLineTo(10.525f)
                lineTo(9.025f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18.5f, 2.0f, 18.164f, 2.0f, 17.75f)
                curveTo(2.0f, 17.37f, 2.282f, 17.056f, 2.648f, 17.007f)
                lineTo(2.75f, 17.0f)
                close()
                moveTo(2.75f, 14.5f)
                horizontalLineTo(10.314f)
                curveTo(10.115f, 14.215f, 10.0f, 13.87f, 10.0f, 13.5f)
                curveTo(10.0f, 13.327f, 10.025f, 13.159f, 10.073f, 13.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 13.007f)
                curveTo(2.282f, 13.057f, 2.0f, 13.37f, 2.0f, 13.75f)
                curveTo(2.0f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                close()
                moveTo(12.72f, 16.22f)
                curveTo(13.013f, 15.927f, 13.487f, 15.927f, 13.78f, 16.22f)
                curveTo(14.073f, 16.513f, 14.073f, 16.987f, 13.78f, 17.28f)
                lineTo(9.28f, 21.78f)
                curveTo(8.987f, 22.073f, 8.513f, 22.073f, 8.22f, 21.78f)
                curveTo(7.927f, 21.487f, 7.927f, 21.013f, 8.22f, 20.72f)
                lineTo(12.72f, 16.22f)
                close()
                moveTo(2.75f, 9.0f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 9.0f, 14.0f, 9.336f, 14.0f, 9.75f)
                curveTo(14.0f, 10.13f, 13.718f, 10.443f, 13.352f, 10.493f)
                lineTo(13.25f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.5f, 2.0f, 10.164f, 2.0f, 9.75f)
                curveTo(2.0f, 9.37f, 2.282f, 9.057f, 2.648f, 9.007f)
                lineTo(2.75f, 9.0f)
                close()
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
                moveTo(16.5f, 8.0f)
                curveTo(16.879f, 8.0f, 17.198f, 8.282f, 17.244f, 8.658f)
                lineTo(17.383f, 9.788f)
                curveTo(17.566f, 11.268f, 18.732f, 12.434f, 20.212f, 12.617f)
                lineTo(21.342f, 12.756f)
                curveTo(21.718f, 12.802f, 22.0f, 13.121f, 22.0f, 13.5f)
                curveTo(22.0f, 13.879f, 21.718f, 14.198f, 21.342f, 14.244f)
                lineTo(20.212f, 14.383f)
                curveTo(18.732f, 14.566f, 17.566f, 15.732f, 17.383f, 17.212f)
                lineTo(17.244f, 18.342f)
                curveTo(17.198f, 18.718f, 16.879f, 19.0f, 16.5f, 19.0f)
                curveTo(16.121f, 19.0f, 15.802f, 18.718f, 15.756f, 18.342f)
                lineTo(15.617f, 17.212f)
                curveTo(15.434f, 15.732f, 14.268f, 14.566f, 12.788f, 14.383f)
                lineTo(11.658f, 14.244f)
                curveTo(11.282f, 14.198f, 11.0f, 13.879f, 11.0f, 13.5f)
                curveTo(11.0f, 13.121f, 11.282f, 12.802f, 11.658f, 12.756f)
                lineTo(12.788f, 12.617f)
                curveTo(14.268f, 12.434f, 15.434f, 11.268f, 15.617f, 9.788f)
                lineTo(15.756f, 8.658f)
                curveTo(15.802f, 8.282f, 16.121f, 8.0f, 16.5f, 8.0f)
                close()
                moveTo(16.5f, 11.774f)
                curveTo(16.085f, 12.489f, 15.489f, 13.085f, 14.774f, 13.5f)
                curveTo(15.489f, 13.915f, 16.085f, 14.511f, 16.5f, 15.226f)
                curveTo(16.915f, 14.511f, 17.511f, 13.915f, 18.226f, 13.5f)
                curveTo(17.511f, 13.085f, 16.915f, 12.489f, 16.5f, 11.774f)
                close()
            }
        }
        .build()
        return _textGrammarWand!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarWand: ImageVector? = null

@Preview
@Composable
private fun TextGrammarWandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarWand, contentDescription = null)
    }
}

