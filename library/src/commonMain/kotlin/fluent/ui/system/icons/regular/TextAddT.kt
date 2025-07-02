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
 * TextAddT icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, add, t
 * - Source: ic_fluent_text_add_t_24_regular.svg
 * 
 * @return The [ImageVector] for the TextAddT icon.
 */
public val FluentIcons.Regular.TextAddT: ImageVector
    get() {
        if (_textAddT != null) {
            return _textAddT!!
        }
        _textAddT = Builder(name = "TextAddT", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.75f)
                curveTo(4.0f, 4.336f, 4.336f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 4.0f, 18.0f, 4.336f, 18.0f, 4.75f)
                verticalLineTo(6.75f)
                curveTo(18.0f, 7.164f, 17.664f, 7.5f, 17.25f, 7.5f)
                curveTo(16.836f, 7.5f, 16.5f, 7.164f, 16.5f, 6.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(11.75f)
                lineTo(11.75f, 14.466f)
                curveTo(11.271f, 15.372f, 11.0f, 16.404f, 11.0f, 17.5f)
                curveTo(11.0f, 18.386f, 11.177f, 19.23f, 11.498f, 20.0f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 20.0f, 8.0f, 19.664f, 8.0f, 19.25f)
                curveTo(8.0f, 18.836f, 8.336f, 18.5f, 8.75f, 18.5f)
                horizontalLineTo(10.25f)
                lineTo(10.25f, 5.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(6.75f)
                curveTo(5.5f, 7.164f, 5.164f, 7.5f, 4.75f, 7.5f)
                curveTo(4.336f, 7.5f, 4.0f, 7.164f, 4.0f, 6.75f)
                verticalLineTo(4.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                close()
                moveTo(18.001f, 18.0f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18.0f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18.0f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17.0f, 14.496f, 17.0f)
                horizontalLineTo(17.0f)
                lineTo(17.0f, 14.499f)
                curveTo(17.0f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18.0f, 14.223f, 18.0f, 14.499f)
                lineTo(18.0f, 17.0f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17.0f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18.0f, 20.497f, 18.0f)
                horizontalLineTo(18.001f)
                close()
            }
        }
        .build()
        return _textAddT!!
    }

@Suppress("ObjectPropertyName")
private var _textAddT: ImageVector? = null

@Preview
@Composable
private fun TextAddTPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAddT, contentDescription = null)
    }
}

