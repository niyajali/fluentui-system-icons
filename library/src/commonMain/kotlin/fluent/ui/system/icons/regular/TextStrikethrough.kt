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
 * TextStrikethrough Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_strikethrough_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextStrikethrough icon.
 */
public val FluentIcons.Regular.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.75f, 12.0f)
                horizontalLineTo(19.251f)
                curveTo(19.665f, 12.0f, 20.001f, 12.336f, 20.001f, 12.75f)
                curveTo(20.001f, 13.13f, 19.719f, 13.444f, 19.352f, 13.493f)
                lineTo(19.251f, 13.5f)
                lineTo(16.276f, 13.5f)
                curveTo(17.155f, 14.313f, 17.612f, 15.293f, 17.612f, 16.435f)
                curveTo(17.612f, 19.26f, 14.38f, 21.074f, 10.858f, 20.665f)
                curveTo(8.623f, 20.405f, 7.049f, 19.51f, 6.223f, 17.963f)
                curveTo(6.028f, 17.598f, 6.166f, 17.143f, 6.531f, 16.948f)
                curveTo(6.896f, 16.753f, 7.351f, 16.891f, 7.546f, 17.256f)
                curveTo(8.116f, 18.324f, 9.248f, 18.968f, 11.031f, 19.175f)
                curveTo(13.774f, 19.494f, 16.112f, 18.181f, 16.112f, 16.435f)
                curveTo(16.112f, 15.263f, 15.307f, 14.308f, 13.547f, 13.549f)
                lineTo(13.431f, 13.5f)
                lineTo(4.75f, 13.5f)
                curveTo(4.37f, 13.5f, 4.057f, 13.218f, 4.007f, 12.852f)
                lineTo(4.0f, 12.75f)
                curveTo(4.0f, 12.37f, 4.282f, 12.057f, 4.648f, 12.007f)
                lineTo(4.75f, 12.0f)
                horizontalLineTo(19.251f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6.261f, 8.123f)
                curveTo(6.413f, 5.292f, 9.083f, 3.655f, 12.585f, 4.062f)
                curveTo(14.773f, 4.316f, 16.448f, 5.115f, 17.567f, 6.471f)
                curveTo(17.831f, 6.79f, 17.786f, 7.263f, 17.466f, 7.527f)
                curveTo(17.147f, 7.79f, 16.674f, 7.745f, 16.41f, 7.426f)
                curveTo(15.558f, 6.393f, 14.239f, 5.764f, 12.411f, 5.552f)
                curveTo(9.694f, 5.236f, 7.761f, 6.356f, 7.761f, 8.123f)
                curveTo(7.761f, 8.895f, 7.995f, 9.471f, 8.591f, 10.104f)
                lineTo(8.719f, 10.237f)
                curveTo(8.813f, 10.333f, 8.916f, 10.432f, 8.97f, 10.476f)
                lineTo(9.0f, 10.498f)
                horizontalLineTo(7.081f)
                lineTo(7.056f, 10.459f)
                curveTo(6.913f, 10.253f, 6.2f, 9.264f, 6.261f, 8.123f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _textStrikethrough: ImageVector? = null

@Preview
@Composable
private fun TextStrikethroughPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextStrikethrough, contentDescription = "TextStrikethrough Icon")
    }
}

