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
 * TextFirstLine icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, first, line
 * - Source: ic_fluent_text_first_line_24_regular.svg
 * 
 * @return The [ImageVector] for the TextFirstLine icon.
 */
public val FluentIcons.Regular.TextFirstLine: ImageVector
    get() {
        if (_textFirstLine != null) {
            return _textFirstLine!!
        }
        _textFirstLine = Builder(name = "TextFirstLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.78f, 3.22f)
                curveTo(3.487f, 2.927f, 3.013f, 2.927f, 2.72f, 3.22f)
                curveTo(2.427f, 3.513f, 2.427f, 3.987f, 2.72f, 4.28f)
                lineTo(4.189f, 5.75f)
                lineTo(2.72f, 7.22f)
                curveTo(2.427f, 7.513f, 2.427f, 7.987f, 2.72f, 8.28f)
                curveTo(3.013f, 8.573f, 3.487f, 8.573f, 3.78f, 8.28f)
                lineTo(5.78f, 6.28f)
                curveTo(6.073f, 5.987f, 6.073f, 5.513f, 5.78f, 5.22f)
                lineTo(3.78f, 3.22f)
                close()
                moveTo(9.75f, 5.0f)
                curveTo(9.336f, 5.0f, 9.0f, 5.336f, 9.0f, 5.75f)
                curveTo(9.0f, 6.164f, 9.336f, 6.5f, 9.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22.0f, 6.164f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(2.75f, 18.0f)
                curveTo(2.336f, 18.0f, 2.0f, 18.336f, 2.0f, 18.75f)
                curveTo(2.0f, 19.164f, 2.336f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.5f, 22.0f, 19.164f, 22.0f, 18.75f)
                curveTo(22.0f, 18.336f, 21.664f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.836f, 2.336f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.5f, 22.0f, 11.836f, 22.0f, 12.25f)
                curveTo(22.0f, 12.664f, 21.664f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                close()
            }
        }
        .build()
        return _textFirstLine!!
    }

@Suppress("ObjectPropertyName")
private var _textFirstLine: ImageVector? = null

@Preview
@Composable
private fun TextFirstLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextFirstLine, contentDescription = null)
    }
}

