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
 * TextHanging icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, hanging
 * - Source: ic_fluent_text_hanging_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHanging icon.
 */
public val FluentIcons.Regular.TextHanging: ImageVector
    get() {
        if (_textHanging != null) {
            return _textHanging!!
        }
        _textHanging = Builder(name = "TextHanging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22.0f, 6.164f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(9.75f, 18.0f)
                curveTo(9.336f, 18.0f, 9.0f, 18.336f, 9.0f, 18.75f)
                curveTo(9.0f, 19.164f, 9.336f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.5f, 22.0f, 19.164f, 22.0f, 18.75f)
                curveTo(22.0f, 18.336f, 21.664f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(9.0f, 12.25f)
                curveTo(9.0f, 11.836f, 9.336f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.5f, 22.0f, 11.836f, 22.0f, 12.25f)
                curveTo(22.0f, 12.664f, 21.664f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 13.0f, 9.0f, 12.664f, 9.0f, 12.25f)
                close()
                moveTo(3.78f, 12.97f)
                curveTo(3.487f, 12.677f, 3.013f, 12.677f, 2.72f, 12.97f)
                curveTo(2.427f, 13.263f, 2.427f, 13.737f, 2.72f, 14.03f)
                lineTo(4.189f, 15.5f)
                lineTo(2.72f, 16.97f)
                curveTo(2.427f, 17.263f, 2.427f, 17.737f, 2.72f, 18.03f)
                curveTo(3.013f, 18.323f, 3.487f, 18.323f, 3.78f, 18.03f)
                lineTo(5.78f, 16.03f)
                curveTo(6.073f, 15.737f, 6.073f, 15.263f, 5.78f, 14.97f)
                lineTo(3.78f, 12.97f)
                close()
            }
        }
        .build()
        return _textHanging!!
    }

@Suppress("ObjectPropertyName")
private var _textHanging: ImageVector? = null

@Preview
@Composable
private fun TextHangingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHanging, contentDescription = null)
    }
}

