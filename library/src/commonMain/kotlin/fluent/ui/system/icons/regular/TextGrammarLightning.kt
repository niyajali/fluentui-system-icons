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
 * TextGrammarLightning Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in text grammar check scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_grammar_lightning_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextGrammarLightning icon.
 */
public val FluentIcons.Regular.TextGrammarLightning: ImageVector
    get() {
        if (_textGrammarLightning != null) {
            return _textGrammarLightning!!
        }
        _textGrammarLightning = Builder(name = "TextGrammarLightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.545f, 17.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 17.007f)
                curveTo(2.282f, 17.056f, 2.0f, 17.37f, 2.0f, 17.75f)
                curveTo(2.0f, 18.164f, 2.336f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(11.996f)
                curveTo(11.996f, 18.289f, 12.042f, 18.072f, 12.14f, 17.862f)
                lineTo(12.545f, 17.0f)
                close()
                moveTo(13.72f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.5f, 2.0f, 14.164f, 2.0f, 13.75f)
                curveTo(2.0f, 13.37f, 2.282f, 13.057f, 2.648f, 13.007f)
                lineTo(2.75f, 13.0f)
                horizontalLineTo(14.425f)
                lineTo(13.72f, 14.5f)
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
                moveTo(16.317f, 12.0f)
                horizontalLineTo(21.144f)
                curveTo(21.527f, 12.0f, 21.768f, 12.412f, 21.58f, 12.745f)
                lineTo(19.749f, 16.0f)
                horizontalLineTo(21.245f)
                curveTo(21.89f, 16.0f, 22.234f, 16.759f, 21.81f, 17.244f)
                lineTo(16.986f, 22.752f)
                curveTo(16.481f, 23.328f, 15.543f, 22.837f, 15.728f, 22.094f)
                lineTo(16.499f, 19.0f)
                horizontalLineTo(13.497f)
                curveTo(13.13f, 19.0f, 12.888f, 18.619f, 13.044f, 18.287f)
                lineTo(15.864f, 12.287f)
                curveTo(15.947f, 12.112f, 16.123f, 12.0f, 16.317f, 12.0f)
                close()
            }
        }
        .build()
        return _textGrammarLightning!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarLightning: ImageVector? = null

@Preview
@Composable
private fun TextGrammarLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarLightning, contentDescription = "TextGrammarLightning Icon")
    }
}

