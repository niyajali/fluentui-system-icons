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
 * TextGrammarSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, grammar, settings
 * - Source: ic_fluent_text_grammar_settings_24_regular.svg
 * 
 * @return The [ImageVector] for the TextGrammarSettings icon.
 */
public val FluentIcons.Regular.TextGrammarSettings: ImageVector
    get() {
        if (_textGrammarSettings != null) {
            return _textGrammarSettings!!
        }
        _textGrammarSettings = Builder(name = "TextGrammarSettings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.019f, 17.0f)
                horizontalLineTo(2.75f)
                lineTo(2.648f, 17.007f)
                curveTo(2.282f, 17.056f, 2.0f, 17.37f, 2.0f, 17.75f)
                curveTo(2.0f, 18.164f, 2.336f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(11.076f)
                curveTo(11.026f, 18.174f, 11.0f, 17.84f, 11.0f, 17.5f)
                curveTo(11.0f, 17.332f, 11.006f, 17.165f, 11.019f, 17.0f)
                close()
                moveTo(2.75f, 13.0f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 13.444f, 12.019f, 13.949f, 11.732f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.5f, 2.0f, 14.164f, 2.0f, 13.75f)
                curveTo(2.0f, 13.37f, 2.282f, 13.057f, 2.648f, 13.007f)
                lineTo(2.75f, 13.0f)
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
                moveTo(14.278f, 13.975f)
                curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
                lineTo(12.253f, 16.616f)
                curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
                curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
                lineTo(12.799f, 18.553f)
                curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.064f)
                lineTo(14.062f, 21.695f)
                curveTo(14.501f, 22.08f, 15.002f, 22.394f, 15.546f, 22.617f)
                lineTo(16.04f, 22.098f)
                curveTo(16.828f, 21.268f, 18.151f, 21.269f, 18.939f, 22.098f)
                lineTo(19.438f, 22.623f)
                curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
                lineTo(20.722f, 21.024f)
                curveTo(20.408f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
                lineTo(22.747f, 18.383f)
                curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
                curveTo(22.816f, 17.185f, 22.79f, 16.876f, 22.741f, 16.576f)
                lineTo(22.202f, 16.446f)
                curveTo(21.089f, 16.178f, 20.428f, 15.033f, 20.752f, 13.936f)
                lineTo(20.938f, 13.305f)
                curveTo(20.499f, 12.919f, 19.999f, 12.606f, 19.454f, 12.383f)
                lineTo(18.961f, 12.902f)
                curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
                lineTo(15.563f, 12.377f)
                curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
                lineTo(14.278f, 13.975f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(16.699f, 19.0f, 16.05f, 18.328f, 16.05f, 17.5f)
                curveTo(16.05f, 16.671f, 16.699f, 16.0f, 17.5f, 16.0f)
                curveTo(18.301f, 16.0f, 18.95f, 16.671f, 18.95f, 17.5f)
                curveTo(18.95f, 18.328f, 18.301f, 19.0f, 17.5f, 19.0f)
                close()
            }
        }
        .build()
        return _textGrammarSettings!!
    }

@Suppress("ObjectPropertyName")
private var _textGrammarSettings: ImageVector? = null

@Preview
@Composable
private fun TextGrammarSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextGrammarSettings, contentDescription = null)
    }
}

