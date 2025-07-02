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
 * TextHeader3 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, header3
 * - Source: ic_fluent_text_header_3_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHeader3 icon.
 */
public val FluentIcons.Regular.TextHeader3: ImageVector
    get() {
        if (_textHeader3 != null) {
            return _textHeader3!!
        }
        _textHeader3 = Builder(name = "TextHeader3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.751f, 4.5f)
                curveTo(20.072f, 4.5f, 22.001f, 6.321f, 22.001f, 8.625f)
                curveTo(22.001f, 10.032f, 21.28f, 11.258f, 20.19f, 12.0f)
                curveTo(21.28f, 12.742f, 22.001f, 13.968f, 22.001f, 15.375f)
                curveTo(22.001f, 17.678f, 20.072f, 19.5f, 17.751f, 19.5f)
                curveTo(16.901f, 19.5f, 16.036f, 19.257f, 15.304f, 18.846f)
                curveTo(14.574f, 18.436f, 13.924f, 17.831f, 13.569f, 17.065f)
                curveTo(13.395f, 16.689f, 13.559f, 16.242f, 13.935f, 16.068f)
                curveTo(14.31f, 15.894f, 14.757f, 16.058f, 14.931f, 16.434f)
                curveTo(15.122f, 16.846f, 15.509f, 17.242f, 16.037f, 17.538f)
                curveTo(16.562f, 17.833f, 17.176f, 18.0f, 17.751f, 18.0f)
                curveTo(19.295f, 18.0f, 20.501f, 16.799f, 20.501f, 15.375f)
                curveTo(20.501f, 13.951f, 19.295f, 12.75f, 17.751f, 12.75f)
                horizontalLineTo(16.75f)
                curveTo(16.336f, 12.75f, 16.0f, 12.414f, 16.0f, 12.0f)
                curveTo(16.0f, 11.586f, 16.336f, 11.25f, 16.75f, 11.25f)
                horizontalLineTo(17.751f)
                curveTo(19.295f, 11.25f, 20.501f, 10.049f, 20.501f, 8.625f)
                curveTo(20.501f, 7.201f, 19.295f, 6.0f, 17.751f, 6.0f)
                curveTo(17.176f, 6.0f, 16.562f, 6.167f, 16.037f, 6.462f)
                curveTo(15.509f, 6.758f, 15.122f, 7.154f, 14.931f, 7.566f)
                curveTo(14.757f, 7.942f, 14.31f, 8.106f, 13.935f, 7.932f)
                curveTo(13.559f, 7.758f, 13.395f, 7.311f, 13.569f, 6.936f)
                curveTo(13.924f, 6.169f, 14.574f, 5.564f, 15.304f, 5.154f)
                curveTo(16.036f, 4.743f, 16.901f, 4.5f, 17.751f, 4.5f)
                close()
                moveTo(10.75f, 5.0f)
                curveTo(11.164f, 5.0f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(11.5f, 18.664f, 11.164f, 19.0f, 10.75f, 19.0f)
                curveTo(10.336f, 19.0f, 10.0f, 18.664f, 10.0f, 18.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.25f)
                curveTo(3.5f, 18.664f, 3.164f, 19.0f, 2.75f, 19.0f)
                curveTo(2.336f, 19.0f, 2.0f, 18.664f, 2.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(2.0f, 5.336f, 2.336f, 5.0f, 2.75f, 5.0f)
                curveTo(3.164f, 5.0f, 3.5f, 5.336f, 3.5f, 5.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.75f)
                curveTo(10.0f, 5.336f, 10.336f, 5.0f, 10.75f, 5.0f)
                close()
            }
        }
        .build()
        return _textHeader3!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader3: ImageVector? = null

@Preview
@Composable
private fun TextHeader3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader3, contentDescription = null)
    }
}

