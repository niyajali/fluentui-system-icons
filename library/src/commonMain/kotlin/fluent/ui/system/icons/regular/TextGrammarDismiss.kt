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
 * TextGrammarDismiss Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in text grammar check scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_grammar_dismiss_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextGrammarDismiss icon.
 */
public val FluentIcons.Regular.TextGrammarDismiss: ImageVector
    get() {
        if (_textGrammarDismiss != null) {
            return _textGrammarDismiss!!
        }
        _textGrammarDismiss = Builder(name = "TextGrammarDismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(15.024f, 15.024f)
                curveTo(14.828f, 15.219f, 14.828f, 15.536f, 15.024f, 15.731f)
                lineTo(16.793f, 17.501f)
                lineTo(15.026f, 19.267f)
                curveTo(14.831f, 19.463f, 14.831f, 19.779f, 15.026f, 19.975f)
                curveTo(15.222f, 20.17f, 15.538f, 20.17f, 15.733f, 19.975f)
                lineTo(17.5f, 18.208f)
                lineTo(19.269f, 19.977f)
                curveTo(19.465f, 20.172f, 19.781f, 20.172f, 19.976f, 19.977f)
                curveTo(20.172f, 19.782f, 20.172f, 19.465f, 19.976f, 19.27f)
                lineTo(18.208f, 17.501f)
                lineTo(19.979f, 15.731f)
                curveTo(20.174f, 15.536f, 20.174f, 15.219f, 19.979f, 15.024f)
                curveTo(19.784f, 14.829f, 19.467f, 14.829f, 19.272f, 15.024f)
                lineTo(17.501f, 16.794f)
                lineTo(15.731f, 15.024f)
                curveTo(15.536f, 14.829f, 15.219f, 14.829f, 15.024f, 15.024f)
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
        return _textGrammarDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarDismiss: ImageVector? = null

@Preview
@Composable
private fun TextGrammarDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarDismiss, contentDescription = "TextGrammarDismiss Icon")
    }
}

