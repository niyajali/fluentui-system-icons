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
 * TextAlignJustifyLowRotate270 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, align, justify, low, rotate270
 * - Source: ic_fluent_text_align_justify_low_rotate_270_24_regular.svg
 * 
 * @return The [ImageVector] for the TextAlignJustifyLowRotate270 icon.
 */
public val FluentIcons.Regular.TextAlignJustifyLowRotate270: ImageVector
    get() {
        if (_textAlignJustifyLowRotate270 != null) {
            return _textAlignJustifyLowRotate270!!
        }
        _textAlignJustifyLowRotate270 = Builder(name = "TextAlignJustifyLowRotate270", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 11.0f)
                curveTo(5.336f, 11.0f, 5.0f, 10.664f, 5.0f, 10.25f)
                verticalLineTo(2.75f)
                curveTo(5.0f, 2.336f, 5.336f, 2.0f, 5.75f, 2.0f)
                curveTo(6.164f, 2.0f, 6.5f, 2.336f, 6.5f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(6.5f, 10.664f, 6.164f, 11.0f, 5.75f, 11.0f)
                close()
                moveTo(18.75f, 22.0f)
                curveTo(18.336f, 22.0f, 18.0f, 21.664f, 18.0f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(18.0f, 2.336f, 18.336f, 2.0f, 18.75f, 2.0f)
                curveTo(19.164f, 2.0f, 19.5f, 2.336f, 19.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(19.5f, 21.664f, 19.164f, 22.0f, 18.75f, 22.0f)
                close()
                moveTo(11.5f, 10.25f)
                curveTo(11.5f, 10.664f, 11.836f, 11.0f, 12.25f, 11.0f)
                curveTo(12.664f, 11.0f, 13.0f, 10.664f, 13.0f, 10.25f)
                verticalLineTo(2.75f)
                curveTo(13.0f, 2.336f, 12.664f, 2.0f, 12.25f, 2.0f)
                curveTo(11.836f, 2.0f, 11.5f, 2.336f, 11.5f, 2.75f)
                verticalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _textAlignJustifyLowRotate270!!
    }

@Suppress("ObjectPropertyName")
private var _textAlignJustifyLowRotate270: ImageVector? = null

@Preview
@Composable
private fun TextAlignJustifyLowRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAlignJustifyLowRotate270, contentDescription = null)
    }
}

