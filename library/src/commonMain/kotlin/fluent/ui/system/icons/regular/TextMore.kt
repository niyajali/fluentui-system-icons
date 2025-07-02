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
 * TextMore icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, more
 * - Source: ic_fluent_text_more_24_regular.svg
 * 
 * @return The [ImageVector] for the TextMore icon.
 */
public val FluentIcons.Regular.TextMore: ImageVector
    get() {
        if (_textMore != null) {
            return _textMore!!
        }
        _textMore = Builder(name = "TextMore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 2.0f)
                curveTo(10.051f, 2.0f, 10.323f, 2.18f, 10.441f, 2.457f)
                lineTo(17.412f, 18.888f)
                curveTo(16.953f, 18.345f, 16.267f, 18.0f, 15.5f, 18.0f)
                curveTo(15.469f, 18.0f, 15.437f, 18.001f, 15.406f, 18.002f)
                lineTo(13.92f, 14.5f)
                horizontalLineTo(5.58f)
                lineTo(3.441f, 19.543f)
                curveTo(3.279f, 19.924f, 2.839f, 20.102f, 2.457f, 19.94f)
                curveTo(2.076f, 19.779f, 1.898f, 19.338f, 2.06f, 18.957f)
                lineTo(9.06f, 2.457f)
                curveTo(9.177f, 2.18f, 9.449f, 2.0f, 9.75f, 2.0f)
                close()
                moveTo(13.284f, 13.0f)
                lineTo(9.75f, 4.67f)
                lineTo(6.216f, 13.0f)
                horizontalLineTo(13.284f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(12.0f, 21.328f, 11.328f, 22.0f, 10.5f, 22.0f)
                curveTo(9.672f, 22.0f, 9.0f, 21.328f, 9.0f, 20.5f)
                curveTo(9.0f, 19.672f, 9.672f, 19.0f, 10.5f, 19.0f)
                curveTo(11.328f, 19.0f, 12.0f, 19.672f, 12.0f, 20.5f)
                close()
                moveTo(15.5f, 22.0f)
                curveTo(16.328f, 22.0f, 17.0f, 21.328f, 17.0f, 20.5f)
                curveTo(17.0f, 19.672f, 16.328f, 19.0f, 15.5f, 19.0f)
                curveTo(14.672f, 19.0f, 14.0f, 19.672f, 14.0f, 20.5f)
                curveTo(14.0f, 21.328f, 14.672f, 22.0f, 15.5f, 22.0f)
                close()
                moveTo(20.5f, 22.0f)
                curveTo(21.328f, 22.0f, 22.0f, 21.328f, 22.0f, 20.5f)
                curveTo(22.0f, 19.672f, 21.328f, 19.0f, 20.5f, 19.0f)
                curveTo(19.672f, 19.0f, 19.0f, 19.672f, 19.0f, 20.5f)
                curveTo(19.0f, 21.328f, 19.672f, 22.0f, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _textMore!!
    }

@Suppress("ObjectPropertyName")
private var _textMore: ImageVector? = null

@Preview
@Composable
private fun TextMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextMore, contentDescription = null)
    }
}

