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
 * TextHeader2Lines icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, header2lines
 * - Source: ic_fluent_text_header_2_lines_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHeader2Lines icon.
 */
public val FluentIcons.Regular.TextHeader2Lines: ImageVector
    get() {
        if (_textHeader2Lines != null) {
            return _textHeader2Lines!!
        }
        _textHeader2Lines = Builder(name = "TextHeader2Lines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.198f, 3.582f)
                curveTo(13.549f, 3.329f, 12.736f, 3.694f, 12.431f, 4.351f)
                curveTo(12.256f, 4.727f, 11.811f, 4.891f, 11.435f, 4.716f)
                curveTo(11.059f, 4.542f, 10.896f, 4.096f, 11.07f, 3.721f)
                curveTo(11.665f, 2.436f, 13.264f, 1.609f, 14.743f, 2.185f)
                curveTo(16.348f, 2.811f, 17.095f, 4.802f, 16.134f, 6.301f)
                curveTo(15.821f, 6.788f, 15.395f, 7.204f, 14.977f, 7.565f)
                curveTo(14.734f, 7.774f, 14.453f, 7.998f, 14.189f, 8.208f)
                curveTo(14.022f, 8.341f, 13.862f, 8.469f, 13.722f, 8.584f)
                curveTo(13.326f, 8.91f, 13.011f, 9.203f, 12.796f, 9.494f)
                lineTo(12.791f, 9.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 9.5f, 17.0f, 9.836f, 17.0f, 10.25f)
                curveTo(17.0f, 10.664f, 16.664f, 11.0f, 16.25f, 11.0f)
                horizontalLineTo(11.75f)
                curveTo(11.336f, 11.0f, 11.0f, 10.664f, 11.0f, 10.25f)
                curveTo(11.0f, 9.6f, 11.255f, 9.053f, 11.591f, 8.6f)
                curveTo(11.92f, 8.157f, 12.353f, 7.769f, 12.768f, 7.427f)
                curveTo(12.957f, 7.27f, 13.133f, 7.13f, 13.304f, 6.995f)
                curveTo(13.539f, 6.808f, 13.764f, 6.63f, 13.998f, 6.429f)
                curveTo(14.378f, 6.101f, 14.675f, 5.797f, 14.872f, 5.491f)
                curveTo(15.287f, 4.843f, 14.98f, 3.887f, 14.198f, 3.582f)
                close()
                moveTo(3.5f, 2.75f)
                curveTo(3.5f, 2.336f, 3.164f, 2.0f, 2.75f, 2.0f)
                curveTo(2.336f, 2.0f, 2.0f, 2.336f, 2.0f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 10.664f, 2.336f, 11.0f, 2.75f, 11.0f)
                curveTo(3.164f, 11.0f, 3.5f, 10.664f, 3.5f, 10.25f)
                lineTo(3.5f, 7.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.244f)
                curveTo(7.5f, 10.659f, 7.836f, 10.994f, 8.25f, 10.994f)
                curveTo(8.664f, 10.994f, 9.0f, 10.659f, 9.0f, 10.244f)
                lineTo(9.0f, 2.752f)
                curveTo(9.0f, 2.337f, 8.664f, 2.002f, 8.25f, 2.002f)
                curveTo(7.836f, 2.002f, 7.5f, 2.337f, 7.5f, 2.752f)
                lineTo(7.5f, 5.5f)
                horizontalLineTo(3.5f)
                lineTo(3.5f, 2.75f)
                close()
                moveTo(2.0f, 19.75f)
                curveTo(2.0f, 19.336f, 2.336f, 19.0f, 2.75f, 19.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.0f, 22.0f, 19.336f, 22.0f, 19.75f)
                curveTo(22.0f, 20.164f, 21.664f, 20.5f, 21.25f, 20.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 20.5f, 2.0f, 20.164f, 2.0f, 19.75f)
                close()
                moveTo(2.75f, 14.0f)
                curveTo(2.336f, 14.0f, 2.0f, 14.336f, 2.0f, 14.75f)
                curveTo(2.0f, 15.164f, 2.336f, 15.5f, 2.75f, 15.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 15.5f, 22.0f, 15.164f, 22.0f, 14.75f)
                curveTo(22.0f, 14.336f, 21.664f, 14.0f, 21.25f, 14.0f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _textHeader2Lines!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader2Lines: ImageVector? = null

@Preview
@Composable
private fun TextHeader2LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader2Lines, contentDescription = null)
    }
}

