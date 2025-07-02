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
 * TextCaseLowercase icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, case, lowercase
 * - Source: ic_fluent_text_case_lowercase_24_regular.svg
 * 
 * @return The [ImageVector] for the TextCaseLowercase icon.
 */
public val FluentIcons.Regular.TextCaseLowercase: ImageVector
    get() {
        if (_textCaseLowercase != null) {
            return _textCaseLowercase!!
        }
        _textCaseLowercase = Builder(name = "TextCaseLowercase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 3.0f)
                curveTo(14.164f, 3.0f, 14.5f, 3.336f, 14.5f, 3.75f)
                verticalLineTo(11.987f)
                curveTo(15.185f, 11.369f, 16.054f, 11.0f, 17.0f, 11.0f)
                curveTo(19.209f, 11.0f, 21.0f, 13.015f, 21.0f, 15.5f)
                curveTo(21.0f, 17.985f, 19.209f, 20.0f, 17.0f, 20.0f)
                curveTo(16.054f, 20.0f, 15.185f, 19.631f, 14.5f, 19.013f)
                verticalLineTo(19.25f)
                curveTo(14.5f, 19.664f, 14.164f, 20.0f, 13.75f, 20.0f)
                curveTo(13.336f, 20.0f, 13.0f, 19.664f, 13.0f, 19.25f)
                verticalLineTo(3.75f)
                curveTo(13.0f, 3.336f, 13.336f, 3.0f, 13.75f, 3.0f)
                close()
                moveTo(14.5f, 15.5f)
                curveTo(14.5f, 17.328f, 15.781f, 18.5f, 17.0f, 18.5f)
                curveTo(18.219f, 18.5f, 19.5f, 17.328f, 19.5f, 15.5f)
                curveTo(19.5f, 13.672f, 18.219f, 12.5f, 17.0f, 12.5f)
                curveTo(15.781f, 12.5f, 14.5f, 13.672f, 14.5f, 15.5f)
                close()
                moveTo(7.5f, 10.501f)
                lineTo(7.787f, 10.511f)
                curveTo(9.748f, 10.609f, 10.915f, 11.737f, 10.995f, 13.556f)
                lineTo(11.0f, 13.76f)
                verticalLineTo(19.26f)
                curveTo(11.0f, 19.64f, 10.718f, 19.954f, 10.352f, 20.003f)
                lineTo(10.25f, 20.01f)
                curveTo(9.87f, 20.01f, 9.557f, 19.728f, 9.507f, 19.362f)
                lineTo(9.5f, 19.26f)
                lineTo(9.499f, 19.156f)
                curveTo(8.511f, 19.721f, 7.598f, 20.01f, 6.75f, 20.01f)
                curveTo(4.912f, 20.01f, 3.5f, 18.716f, 3.5f, 16.76f)
                curveTo(3.5f, 15.036f, 4.688f, 13.755f, 6.66f, 13.516f)
                curveTo(7.592f, 13.403f, 8.54f, 13.474f, 9.499f, 13.726f)
                curveTo(9.489f, 12.618f, 8.943f, 12.071f, 7.713f, 12.009f)
                curveTo(6.751f, 11.962f, 6.074f, 12.097f, 5.678f, 12.374f)
                curveTo(5.339f, 12.612f, 4.871f, 12.53f, 4.634f, 12.191f)
                curveTo(4.396f, 11.852f, 4.478f, 11.384f, 4.817f, 11.146f)
                curveTo(5.475f, 10.685f, 6.371f, 10.481f, 7.5f, 10.501f)
                close()
                moveTo(9.499f, 15.324f)
                lineTo(9.196f, 15.234f)
                curveTo(8.389f, 15.012f, 7.605f, 14.949f, 6.84f, 15.041f)
                curveTo(5.608f, 15.191f, 5.0f, 15.846f, 5.0f, 16.797f)
                curveTo(5.0f, 17.893f, 5.712f, 18.547f, 6.75f, 18.547f)
                curveTo(7.43f, 18.547f, 8.268f, 18.232f, 9.251f, 17.583f)
                lineTo(9.499f, 17.414f)
                verticalLineTo(15.324f)
                close()
            }
        }
        .build()
        return _textCaseLowercase!!
    }

@Suppress("ObjectPropertyName")
private var _textCaseLowercase: ImageVector? = null

@Preview
@Composable
private fun TextCaseLowercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextCaseLowercase, contentDescription = null)
    }
}

