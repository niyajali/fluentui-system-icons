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

package fluent.ui.system.icons.filled

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
 * TextTTag icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: text, ttag
 * - Source: ic_fluent_text_t_tag_16_filled.svg
 * 
 * @return The [ImageVector] for the TextTTag icon.
 */
public val FluentIcons.Filled.TextTTag: ImageVector
    get() {
        if (_textTTag != null) {
            return _textTTag!!
        }
        _textTTag = Builder(name = "TextTTag", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.001f, 4.75f)
                verticalLineTo(3.75f)
                curveTo(12.001f, 3.336f, 11.665f, 3.0f, 11.251f, 3.0f)
                horizontalLineTo(4.751f)
                curveTo(4.337f, 3.0f, 4.001f, 3.336f, 4.001f, 3.75f)
                verticalLineTo(4.75f)
                curveTo(4.001f, 5.164f, 4.337f, 5.5f, 4.751f, 5.5f)
                curveTo(5.165f, 5.5f, 5.501f, 5.164f, 5.501f, 4.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.251f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.001f)
                curveTo(6.587f, 11.5f, 6.251f, 11.836f, 6.251f, 12.25f)
                curveTo(6.251f, 12.664f, 6.587f, 13.0f, 7.001f, 13.0f)
                horizontalLineTo(9.001f)
                curveTo(9.415f, 13.0f, 9.751f, 12.664f, 9.751f, 12.25f)
                curveTo(9.751f, 11.836f, 9.415f, 11.5f, 9.001f, 11.5f)
                horizontalLineTo(8.751f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.501f)
                verticalLineTo(4.75f)
                curveTo(10.501f, 5.164f, 10.837f, 5.5f, 11.251f, 5.5f)
                curveTo(11.665f, 5.5f, 12.001f, 5.164f, 12.001f, 4.75f)
                close()
                moveTo(4.249f, 6.689f)
                curveTo(3.941f, 6.415f, 3.467f, 6.44f, 3.19f, 6.751f)
                lineTo(1.19f, 9.001f)
                curveTo(0.937f, 9.285f, 0.937f, 9.713f, 1.19f, 9.997f)
                lineTo(3.19f, 12.247f)
                curveTo(3.338f, 12.414f, 3.544f, 12.499f, 3.751f, 12.499f)
                curveTo(3.929f, 12.499f, 4.106f, 12.437f, 4.249f, 12.31f)
                curveTo(4.559f, 12.035f, 4.587f, 11.561f, 4.311f, 11.251f)
                lineTo(2.754f, 9.499f)
                lineTo(4.311f, 7.747f)
                curveTo(4.586f, 7.437f, 4.558f, 6.965f, 4.249f, 6.689f)
                close()
                moveTo(12.812f, 6.752f)
                lineTo(14.812f, 9.002f)
                verticalLineTo(9.003f)
                curveTo(15.065f, 9.287f, 15.065f, 9.715f, 14.812f, 9.999f)
                lineTo(12.812f, 12.249f)
                curveTo(12.663f, 12.416f, 12.457f, 12.501f, 12.251f, 12.501f)
                curveTo(12.073f, 12.501f, 11.896f, 12.439f, 11.753f, 12.312f)
                curveTo(11.444f, 12.036f, 11.416f, 11.563f, 11.691f, 11.253f)
                lineTo(13.248f, 9.501f)
                lineTo(11.691f, 7.749f)
                curveTo(11.415f, 7.439f, 11.443f, 6.965f, 11.753f, 6.69f)
                curveTo(12.061f, 6.415f, 12.536f, 6.44f, 12.812f, 6.752f)
                close()
            }
        }
        .build()
        return _textTTag!!
    }

@Suppress("ObjectPropertyName")
private var _textTTag: ImageVector? = null

@Preview
@Composable
private fun TextTTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextTTag, contentDescription = null)
    }
}

