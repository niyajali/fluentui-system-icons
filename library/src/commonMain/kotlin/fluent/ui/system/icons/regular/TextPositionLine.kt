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
 * TextPositionLine icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, position, line
 * - Source: ic_fluent_text_position_line_24_regular.svg
 * 
 * @return The [ImageVector] for the TextPositionLine icon.
 */
public val FluentIcons.Regular.TextPositionLine: ImageVector
    get() {
        if (_textPositionLine != null) {
            return _textPositionLine!!
        }
        _textPositionLine = Builder(name = "TextPositionLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 4.0f)
                curveTo(3.336f, 4.0f, 3.0f, 4.336f, 3.0f, 4.75f)
                curveTo(3.0f, 5.164f, 3.336f, 5.5f, 3.75f, 5.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 5.5f, 21.0f, 5.164f, 21.0f, 4.75f)
                curveTo(21.0f, 4.336f, 20.664f, 4.0f, 20.25f, 4.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(7.0f, 8.5f)
                curveTo(5.619f, 8.5f, 4.5f, 9.619f, 4.5f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(4.5f, 16.164f, 4.164f, 16.5f, 3.75f, 16.5f)
                curveTo(3.336f, 16.5f, 3.0f, 16.164f, 3.0f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 8.791f, 4.791f, 7.0f, 7.0f, 7.0f)
                curveTo(9.209f, 7.0f, 11.0f, 8.791f, 11.0f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(11.0f, 16.164f, 10.664f, 16.5f, 10.25f, 16.5f)
                curveTo(9.836f, 16.5f, 9.5f, 16.164f, 9.5f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(9.5f, 9.619f, 8.381f, 8.5f, 7.0f, 8.5f)
                close()
                moveTo(13.75f, 14.5f)
                curveTo(13.336f, 14.5f, 13.0f, 14.836f, 13.0f, 15.25f)
                curveTo(13.0f, 15.664f, 13.336f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.0f, 21.0f, 15.664f, 21.0f, 15.25f)
                curveTo(21.0f, 14.836f, 20.664f, 14.5f, 20.25f, 14.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(3.75f, 18.0f)
                curveTo(3.336f, 18.0f, 3.0f, 18.336f, 3.0f, 18.75f)
                curveTo(3.0f, 19.164f, 3.336f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21.0f, 19.164f, 21.0f, 18.75f)
                curveTo(21.0f, 18.336f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _textPositionLine!!
    }

@Suppress("ObjectPropertyName")
private var _textPositionLine: ImageVector? = null

@Preview
@Composable
private fun TextPositionLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextPositionLine, contentDescription = null)
    }
}

